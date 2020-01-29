package kr.co.fastcampus.eatgo;

import org.springframework.restdocs.operation.preprocess.OperationRequestPreprocessor;
import org.springframework.restdocs.operation.preprocess.OperationResponsePreprocessor;

import static org.springframework.restdocs.operation.preprocess.Preprocessors.*;

public interface ApiDocumentUtils {

    static OperationRequestPreprocessor getDocumentRequest() {
        return preprocessRequest(
                modifyUris()        // 문서상 uri를 기본 값인 http://localhost:8080 에서 https://docs.api.com 으로 변경하기 위해 사용합니다.
                    .scheme("https")
                    .host("docs.api.com")
                    .removePort(),
                prettyPrint());     // 문서의 request 을 예쁘게 출력하기 위해 사용합니다.
    }

    static OperationResponsePreprocessor getDocumentResponse() {
        return preprocessResponse(prettyPrint());   // 문서의 response 을 예쁘게 출력하기 위해 사용합니다.
    }
}
