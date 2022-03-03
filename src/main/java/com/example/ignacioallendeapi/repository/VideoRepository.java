package com.example.ignacioallendeapi.repository;

import com.example.ignacioallendeapi.entity.VideoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends JpaRepository<VideoEntity, Integer> {
    public List<VideoEntity>findByPath(String path);
    public List<VideoEntity> findByIdLectura(Integer id_titulo);
}
