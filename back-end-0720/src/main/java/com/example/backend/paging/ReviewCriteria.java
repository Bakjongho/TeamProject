package com.example.backend.paging;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReviewCriteria {

	private Integer page;
	private Integer size;
	private Integer totalItems;
	private Integer totalPages;
	private Long id;
	private String searchTitle;

//	기본 테이지 정보 세팅
	public ReviewCriteria() {
		this.page = 0;
		this.size = 3;
	}
}
