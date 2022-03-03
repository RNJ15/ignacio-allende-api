package com.example.ignacioallendeapi.service;


import com.example.ignacioallendeapi.entity.TituloEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface TituloService {

    public Optional<TituloEntity> findById(Integer id);

    public List<TituloEntity>findAll();

    public TituloEntity save(TituloEntity tituloEntity);

    public Page<TituloEntity> findAll(Pageable pageable);

    public void delete(Integer id);

}
