package com.example.project_for_clinic.service.abs;

import com.example.project_for_clinic.manual.ApiResult;
import com.example.project_for_clinic.payload.UserResDTO;

public interface ProjectService {
    ApiResult<UserResDTO> getUserByLastNameAndFirstName(String firts_name,String last_name);
}
