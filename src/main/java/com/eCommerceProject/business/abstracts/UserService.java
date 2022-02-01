package com.eCommerceProject.business.abstracts;

import com.eCommerceProject.dto.createDto.UserCreateDto;
import com.eCommerceProject.dto.viewDto.UserViewDto;
import com.eCommerceProject.model.User;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    void add(UserCreateDto createDto);
    List<User> getAll();
    User getByid(int id);
    List<User> slice(Pageable pageable);
    void deleteById(int id);
    List<UserViewDto> getUserViewDto();
}
