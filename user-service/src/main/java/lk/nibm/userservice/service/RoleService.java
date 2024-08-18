package lk.nibm.userservice.service;

import lk.nibm.userservice.model.Role;
import lk.nibm.userservice.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }

    // Other role-related business methods
}

