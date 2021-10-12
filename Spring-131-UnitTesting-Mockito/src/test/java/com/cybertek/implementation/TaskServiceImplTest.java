package com.cybertek.implementation;

import com.cybertek.dto.TaskDTO;
import com.cybertek.entity.Task;
import com.cybertek.mapper.TaskMapper;
import com.cybertek.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TaskServiceImplTest {

    @Mock
    TaskRepository taskRepository;

    @Mock
    TaskMapper taskMapper;
    @InjectMocks
    TaskServiceImpl taskService;






    @ParameterizedTest
    @ValueSource(longs = {1L,2L,3L})
    void findById(Long arg) {
        Task task = new Task();

        when(taskRepository.findById(arg)).thenReturn(Optional.of(task));
        when(taskMapper.convertToDto(task)).thenReturn(new TaskDTO());

        taskService.findById( arg);

        verify(taskRepository).findById(2L);

    }
}