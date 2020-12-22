package com.example.fileupload.service;

import com.example.fileupload.entity.FileDTO;

import java.util.List;

public interface FileService {
    void save(FileDTO file1);

    List<FileDTO> check(String key);

}
