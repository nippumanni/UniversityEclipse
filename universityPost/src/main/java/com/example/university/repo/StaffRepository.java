package com.example.university.repo;

import com.example.university.domain.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * DataSource Management for the Staff at the University.
 *
 * Created by maryellenbowman
 */
public interface StaffRepository extends CrudRepository<Staff,Integer> {
	@Override
	 <S extends Staff> S save(S arg0) ;
		// TODO Auto-generated method stub
	/*
    List<CabBoardingModel> findAll();

    List<CabBoardingModel> save(List<CabBoardingModel> cabBoardingModels);

    Optional<CabBoardingModel> findById(Long id);
*/
	
	@Override
	 Staff findOne(Integer arg0) ;
	
}
