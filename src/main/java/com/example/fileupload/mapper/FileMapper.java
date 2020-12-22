package com.example.fileupload.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.fileupload.entity.FileDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FileMapper extends BaseMapper<FileDTO> {
}
