package com.test.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.FeedBack;
public interface FeedBackRepository extends JpaRepository<FeedBack, Long>{
	

}
