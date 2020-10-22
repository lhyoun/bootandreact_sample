package com.cos.jwt.config.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class CorsFilter implements Filter{

	public static final String TAG = "MyFilter1 : ";
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("CORS 필터. 이 필터에 들어와야 javascript 요청이 가능합니다. 현재는 8000 포트로 들어오는 모든 request에 대해 해당 필터가 동작합니다.");
		
		HttpServletResponse resp = (HttpServletResponse) response;
		
		resp.setHeader("Access-Control-Allow-Origin", "*");	// local 3000
		resp.setHeader("Access-Control-Allow-Headers", "*");	// local 3000
		resp.setHeader("Access-Control-Expose-Headers", "*");	// 헤더의 모든 내용을 보여준다/ 이게 없으면 7가지의 header 값만 응답할 수 있다
		
		chain.doFilter(request, response);
	}

}
