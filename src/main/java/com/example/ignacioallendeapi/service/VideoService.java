package com.example.ignacioallendeapi.service;


import com.example.ignacioallendeapi.entity.VideoEntity;

import java.util.List;
import java.util.Optional;


public interface VideoService {

   public List<VideoEntity>findByPath_video(String path);

   public List<VideoEntity> findById_titulo_lectura(Integer id_titulo);

   public VideoEntity add(VideoEntity videoEntity);

   public void delete(Integer id);

   public Optional findById(Integer id);

   public List<VideoEntity>findAll();

}
