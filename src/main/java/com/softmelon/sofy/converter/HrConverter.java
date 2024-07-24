package com.softmelon.sofy.converter;

import org.springframework.stereotype.Component;

import com.softmelon.sofy.dto.HrDTO;
import com.softmelon.sofy.entity.Hr;

@Component
public class HrConverter implements IConverter<Hr, HrDTO> {

	public Hr toEntity(HrDTO dto) {
		if (dto != null) {
			Hr hr = new Hr();
			hr.setId(dto.getId());
			hr.setName(dto.getName());
			hr.setSurname(dto.getSurname());
			return hr;
		}
		return null;
	}

	public HrDTO toDTO(Hr entity) {
		if (entity != null) {
			HrDTO hrDTO = new HrDTO();
			hrDTO.setId(entity.getId());
			hrDTO.setName(entity.getName());
			hrDTO.setSurname(entity.getSurname());
			return hrDTO;
		}
		return null;
	}

}
