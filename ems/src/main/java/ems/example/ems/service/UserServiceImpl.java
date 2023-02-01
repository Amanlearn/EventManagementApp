package ems.example.ems.service;

import ems.example.ems.entity.User;
import ems.example.ems.repository.EmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    EmsRepository emsRepository;
    @Override
    public List<User> get() {
        return emsRepository.findAll();
    }
}
