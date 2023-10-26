package com.marcsedev.todolistcrud.addtasks.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.marcsedev.todolistcrud.addtasks.domain.AddTaskUseCase
import com.marcsedev.todolistcrud.addtasks.domain.DeleteTaskUseCase
import com.marcsedev.todolistcrud.addtasks.domain.GetTasksUseCase
import com.marcsedev.todolistcrud.addtasks.domain.UpdateTaskUseCase
import com.marcsedev.todolistcrud.addtasks.ui.TasksUiState.Error
import com.marcsedev.todolistcrud.addtasks.ui.TasksUiState.Loading
import com.marcsedev.todolistcrud.addtasks.ui.TasksUiState.Success
import com.marcsedev.todolistcrud.addtasks.ui.model.TaskModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TasksViewModel @Inject constructor(
    private val addTaskUseCase: AddTaskUseCase,
    private val updateTaskUseCase: UpdateTaskUseCase,
    private val deleteTaskUseCase: DeleteTaskUseCase,
    getTasksUseCase: GetTasksUseCase
) : ViewModel() {

    val uiState: StateFlow<TasksUiState> = getTasksUseCase().map(::Success)
        .catch { Error(it) }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), Loading)

    private val _showDialog = MutableLiveData<Boolean>()
    val showDialog: LiveData<Boolean> = _showDialog


    fun onDialogClose() {
        _showDialog.value = false
    }

    fun onTasksCreated(task: String) {
        _showDialog.value = false
        viewModelScope.launch {
            addTaskUseCase(TaskModel(task = task))
        }
    }

    fun onShowDialogClick() {
        _showDialog.value = true
    }

    fun onCheckBoxSelected(taskModel: TaskModel) {
        viewModelScope.launch {
            updateTaskUseCase(taskModel.copy(selected = !taskModel.selected))
        }
    }

    fun onItemRemove(taskModel: TaskModel) {
        //TODO: Borrar item
        viewModelScope.launch {
            deleteTaskUseCase(taskModel)
        }
        /*val task = _tasks.find { it.id == taskModel.id }
        _tasks.remove(task)*/
    }
}