package com.example.ignacioallendeapi.repository;


import com.example.ignacioallendeapi.entity.TituloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TituloRepository extends JpaRepository<TituloEntity, Integer> {

}
