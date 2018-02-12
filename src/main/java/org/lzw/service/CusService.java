package org.lzw.service;

import org.lzw.pojo.CusSms;

import java.util.List;

public interface CusService {


    public void register(CusSms cusSms);
    public CusSms findById(Long cid);
    public List<CusSms> findByPage(int page,int size);
}
