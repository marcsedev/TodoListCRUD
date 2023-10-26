package com.marcsedev.todolistcrud.addtasks.domain

import com.marcsedev.todolistcrud.addtasks.data.TaskRepository
import com.marcsedev.todolistcrud.addtasks.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(
    private val taskRepository: TaskRepository
) {
    operator fun invoke():Flow<List<TaskModel>> = taskRepository.tasks

}