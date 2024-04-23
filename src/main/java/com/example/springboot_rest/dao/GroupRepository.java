package com.example.springboot_rest.dao;


import com.example.springboot_rest.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Integer> {
    public List<Group> findByGroupName(String groupName);
    public void deleteByGroupName(String groupName);
}
