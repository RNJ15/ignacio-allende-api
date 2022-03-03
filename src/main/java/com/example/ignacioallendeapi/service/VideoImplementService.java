package com.example.ignacioallendeapi.service;

import com.example.ignacioallendeapi.entity.VideoEntity;
import com.example.ignacioallendeapi.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideoImplementService implements VideoService{
    @Autowired
    private VideoRepository videoRepository;

    @Override
    public List<VideoEntity> findByPath_video(String path) {
        return videoRepository.findByPath(path);
    }

    @Override
    public List<VideoEntity> findById_titulo_lectura(Integer id_titulo) {
        return videoRepository.findByIdLectura(id_titulo);
    }

    @Override
    public VideoEntity add(VideoEntity videoEntity) {
        return videoRepository.save(videoEntity);
    }

    @Override
    public void delete(Integer id) {
         videoRepository.deleteById(id);
    }

    @Override
    public Optional findById(Integer id) {
        return videoRepository.findById(id);
    }

    @Override
    public List<VideoEntity> findAll() {
        return videoRepository.findAll();
    }
}
