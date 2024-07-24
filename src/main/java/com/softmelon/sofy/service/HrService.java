package com.softmelon.sofy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softmelon.sofy.converter.HrConverter;
import com.softmelon.sofy.repository.HrRepository;

@Service
public class HrService {

	@Autowired
	private HrRepository hrRepository;

	@Autowired
	private HrConverter hrConverter;

}
