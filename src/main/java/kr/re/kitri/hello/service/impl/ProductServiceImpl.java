package kr.re.kitri.hello.service.impl;

import kr.re.kitri.hello.dao.ProductDao;
import kr.re.kitri.hello.model.Product;
import kr.re.kitri.hello.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;


    public String retrieveProducts(){
        // 전체 상품 조회 작업 수행                       << 서비스 역할
        // DB(oracle) 접속                            << DAO
        // 쿼리 실행 ( select * from products )        << DAO
        // 최종적으로 결과를 전달한다.
        return productDao.SelectProducts();
    }
    
    public Product viewProductDetail(int i) {// 2일차 오후 변경(객체 반환)
        return productDao.selectProductById(i);

    }
}
