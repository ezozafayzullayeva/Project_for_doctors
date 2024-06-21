package com.example.project_for_clinic.service.imp;

import com.example.project_for_clinic.entity.User;
import com.example.project_for_clinic.manual.ApiResult;
import com.example.project_for_clinic.payload.UserResDTO;
import com.example.project_for_clinic.repository.UserRepository;
import com.example.project_for_clinic.service.abs.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {
    private final UserRepository userRepository;

    @Override
    public ApiResult<UserResDTO> getUserByLastNameAndFirstName(String firstName, String lastName) {
        User user = userRepository.getUserByFistNameAndLastName(firstName, lastName);
        return ApiResult.success(toDTO(user));
    }

    public UserResDTO toDTO(User user) {
        if (user == null) {
            return null;
        }
        UserResDTO.UserResDTOBuilder userResDTO = UserResDTO.builder();
        userResDTO.id(user.getId());
        userResDTO.firstName(user.getFistName());
        userResDTO.lastName(user.getLastName());
        userResDTO.fatherName(user.getFatherName());
        userResDTO.skills(user.getSkills());
        userResDTO.experience(user.getExperience());
        userResDTO.location(user.getLocation());
        userResDTO.phoneNumber(user.getPhoneNumber());
        return userResDTO.build();
    }

}
