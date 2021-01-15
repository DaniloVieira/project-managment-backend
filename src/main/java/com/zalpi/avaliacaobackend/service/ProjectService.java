package com.zalpi.avaliacaobackend.service;

import java.util.List;

import com.zalpi.avaliacaobackend.dto.response.ProjectFilterDTO;
import com.zalpi.avaliacaobackend.dto.response.ResponseObject;
import com.zalpi.avaliacaobackend.model.Project;

public interface ProjectService {

	ResponseObject<List<Project>> listByFilters(ProjectFilterDTO filter);
}
