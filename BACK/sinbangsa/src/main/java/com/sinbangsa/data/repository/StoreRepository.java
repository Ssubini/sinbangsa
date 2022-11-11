package com.sinbangsa.data.repository;

import com.sinbangsa.data.dto.MainpageDto;
import com.sinbangsa.data.entity.Store;
import com.sinbangsa.data.entity.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {

    List<Store> findAllByStoreNameContaining(String searchWord);

    List<Store> findAllByRegion(String region);

    List<Store> findAllByRegionContaining(String region);

    Store findByStoreId(long storeId);

    @Query("select max(storeId)+1 from Store ")
    Long getNewStoreId();

}