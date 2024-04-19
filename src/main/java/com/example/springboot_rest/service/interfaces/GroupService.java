package com.example.springboot_rest.service.interfaces;

import com.example.springboot_rest.entity.Group;

import java.util.List;

public interface GroupService {
    public List<Group> getAllGroups();
    public void saveGroup(Group group);
    public Group getGroup(int id);
    public void deleteGroup(int id);

}
