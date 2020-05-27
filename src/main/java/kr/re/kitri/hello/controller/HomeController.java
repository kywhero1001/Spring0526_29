package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Product;
import kr.re.kitri.hello.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @Autowired
    private ProductService productService;

    // 2일차 오전 추가
    /*public Product getProductDetailsByProductId(){
        return productService.viewProductDetail(2005);
    }*/
    // 2일차 오후 변경
    /*@GetMapping("/products/2005")*/
    /*public Map<String, Object> getProductDetailsByProductId(){
        Product p = productService.viewProductDetail(2005);
        Map<String, Object> result = new HashMap();
        result.put("status", "OK");
        result.put("data", p);
        return result;
    }*/
    @GetMapping("/products/{productId}")
    // 2일차 오후 나중에
    public Map<String, Object> getProductDetailsByProductId(@PathVariable int productId){
        System.out.println(productId);
        Product p = productService.viewProductDetail(productId);
        Map<String, Object> result = new HashMap<>();
        result.put("status", "OK");
        result.put("data", p);
        return result;
    }
/*    @GetMapping("league/{leagueId}/teams/{teamId}/players/{playerId}")
    // 2일차 오후 축구팀의 예를 들며 URL을 설정하는 예를 보임
    public Map<String, Object> getProductDetailsByProductId(@PathVariable int productId){
        System.out.println(productId);
        Product p = productService.viewProductDetail(productId);
        Map<String, Object> result = new HashMap<>();
        result.put("status", "OK");
        result.put("data", p);
        return result;
    }*/

    @GetMapping("/products")
    public String getProducts(){    // 요청 해석, 요청 파라미터 확보, 헤더값을 확보함.
                                    // 실행 결과값을 JSON 포맷으로 만들어 결과 반환
                                    // 해당되는 기능을 가진 서비스 함수를 호출함
        return productService.retrieveProducts();
    }

    @GetMapping("/products/hello")
    public String hello(){
        return "Hello World!";
    }
}
