package com.eCommerceProject.api.controller;

import com.eCommerceProject.business.abstracts.UserService;
import com.eCommerceProject.entities.concretes.User;
import com.eCommerceProject.shared.GenericResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/users/")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("add")
    public ResponseEntity<?> add(@RequestBody @Valid User user) {
        this.userService.add(user);
        return ResponseEntity.ok(new GenericResponse("User Created."));
    }

    @GetMapping("getAll")
    public ResponseEntity<List<User>> getAll() {
       List<User> users = this.userService.getAll();
       return ResponseEntity.ok(users);
    }

    @GetMapping("getById/{id}")
    public User getByid(@PathVariable int id) {
        return this.userService.getByid(id);
    }

    @GetMapping("slice")
    public ResponseEntity<List<User>> slice(Pageable pageable) {
        List<User> users = this.userService.slice(pageable);
        return ResponseEntity.ok(users);
    }

    @DeleteMapping("delete")
    public ResponseEntity<?> deleteById(int id) {
        this.userService.deleteById(id);
        return ResponseEntity.ok(new GenericResponse("User deleted..."));
    }

}