package org.lzw.service;

import org.lzw.dao.CusSmsDao;
import org.lzw.pojo.CusSms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CusServiceImpl implements CusService {

    @Autowired
    private CusSmsDao cusSmsDao;

    @Override
    public void register(CusSms cusSms) {
        cusSmsDao.save(cusSms);
    }

    @Override
    public CusSms findById(Long cid) {

        return cusSmsDao.findOne(cid);
    }

    @Override
    public List<CusSms> findByPage(int page, int size) {
        Pageable pageable = new PageRequest(page-1, size);
        Page<CusSms> all = cusSmsDao.findAll(pageable);
        int totalPages = all.getTotalPages();
        System.out.println(totalPages);
        List<CusSms> content = all.getContent();
        return content;
    }
}
