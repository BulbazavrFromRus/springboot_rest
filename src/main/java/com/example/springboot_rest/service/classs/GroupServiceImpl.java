package com.example.springboot_rest.service.classs;

import com.example.springboot_rest.dao.GroupRepository;
import com.example.springboot_rest.entity.Group;
import com.example.springboot_rest.service.interfaces.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    GroupRepository groupRepository;

    @Override
    public List<Group> getAllGroups() {
        List<Group> groups = groupRepository.findAll();
        return groups;
    }

    @Override
    public void saveGroup(Group group) {
        List<Group> groupList = groupRepository.findByGroupName(group.getGroupByName());
        if(groupList.isEmpty()){
            groupRepository.save(group);
        }

    }

    @Override
    public Group getGroup(int id) {
        Optional<Group> group = groupRepository.findById(id);

        return group.orElse(null);
    }

    @Override
    public void deleteGroup(int id) {
       groupRepository.deleteById(id);
    }
}
