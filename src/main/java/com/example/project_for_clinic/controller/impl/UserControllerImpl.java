package com.example.project_for_clinic.controller.impl;

import com.example.project_for_clinic.controller.UserController;
import com.example.project_for_clinic.manual.ApiResult;
import com.example.project_for_clinic.payload.UserResDTO;
import com.example.project_for_clinic.service.abs.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {
    private final ProjectService projectService;
    @Override
    public ApiResult<UserResDTO> getByFirstNameAndLastName(String first_name, String last_name) {
return projectService.getUserByLastNameAndFirstName(first_name,last_name);
    }
}
