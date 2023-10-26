package com.marcsedev.todolistcrud.addtasks.domain

import com.marcsedev.todolistcrud.addtasks.data.TaskRepository
import com.marcsedev.todolistcrud.addtasks.ui.model.TaskModel
import javax.inject.Inject

class AddTaskUseCase @Inject constructor(
    private val taskRepository: TaskRepository
) {
    suspend operator fun invoke(taskModel: TaskModel) {
        taskRepository.add(taskModel)
    }
}