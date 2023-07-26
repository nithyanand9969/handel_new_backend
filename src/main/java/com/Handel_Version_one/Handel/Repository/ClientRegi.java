package com.Handel_Version_one.Handel.Repository;

import com.Handel_Version_one.Handel.Model.Registeration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRegi extends JpaRepository<Registeration,Integer> {
}
