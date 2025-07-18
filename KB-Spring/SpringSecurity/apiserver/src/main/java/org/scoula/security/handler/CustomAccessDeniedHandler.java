package org.scoula.security.handler;

import java.io.IOException;
import java.nio.file.AccessDeniedException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.scoula.security.util.JsonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class CustomAccessDeniedHandler implements AccessDeniedHandler {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
		org.springframework.security.access.AccessDeniedException accessDeniedException) throws
		IOException,
		ServletException {

		log.error("========= 인가 에러 ==========");
		JsonResponse.sendError(response, HttpStatus.FORBIDDEN, "권한이 부족합니다.");
	}
}
