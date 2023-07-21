package com.kopo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kopo.domain.Webtoon;
import com.kopo.repository.WebtoonRepository;

@Service
public class WebtoonServiceImpl implements WebtoonService {
	@Autowired
	private WebtoonRepository webtoonRepository;
	
	public List<Webtoon> getAllWebtoonList() {
		// TODO Auto-generated method stub
		return webtoonRepository.getAllWebtoonList();
	}
}
