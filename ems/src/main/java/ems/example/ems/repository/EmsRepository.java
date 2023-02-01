package ems.example.ems.repository;

import ems.example.ems.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmsRepository extends JpaRepository<User,Long> {
}
