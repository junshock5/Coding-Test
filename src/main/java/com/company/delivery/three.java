//package main.java.com.company.delivery;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.server.ResponseStatusException;
//
//import java.time.ZonedDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/healthcheck")
//class three {
//    // 1. 정확성과 코드 품질 체점
//    // 2. 매개변수 지정된 가능한 값과 일치하지 않는 HTTP 상태코드는 400 ("잘못된 요청" ) 반환.
//    // 3. 응답에는 적절한 application / json 이 있는 Context-Type 헤더가 있어야한다.
//    // 4. 여러 클래스를 만들어야 하는 경우 중첩 클래스 사용하거나 하나의 리소스 파일에 여러 클래스 정의
//    // 5. 다음라이브러리만 사용 Spring Web MVC, Jackson
//
//    // GET / healthcheck? format = short 에 대한 요청 {"status" : "OK"} 반환
//    // GET / healthcheck? format = full 에대한 요청은 애플리케이션 상태 및 현재시간 (ISO 8601 문자열 형식) 반환.
//
//    /**
//     * 상태 확인 메서드
//     */
//    @GetMapping(value = "/{format}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody Map<String, String> healthcheck(String format) {
//        HashMap<String, String> map = new HashMap<>();
//        String nowAsISO = DateTimeFormatter.ISO_DATE_TIME.format(ZonedDateTime.now());
//
//        if ("short".equals(format)) {
//            map.put("status", "OK");
//        } else if ("full".equals(format)) {
//            map.put("currentTime", nowAsISO);
//            map.put("application", "OK");
//        } else {
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
//        }
//        return map;
//    }
//
//
//    @PutMapping(value = "/")
//    public void healthcheckPut() {
//        return;
//    }
//
//    @PostMapping(value = "/")
//    public void healthcheckPost() {
//        return;
//    }
//
//
//    @DeleteMapping(value = "/")
//    public void healthcheckDelete() {
//        return;
//    }
//
//}