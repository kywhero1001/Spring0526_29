package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
    public String SelectProducts(){
        // DB에 직접적으로 접속하고 쿼리 실행시키는 부분
        // MyBatis가 사용되는 부분
        return "상품 목록 조회 쿼리";
    }

    public Product selectProductById(int i) {
        Product p = new Product(
                i + "", "IPhone 11", 1250000, "Apple");
        return p;
    }
}
