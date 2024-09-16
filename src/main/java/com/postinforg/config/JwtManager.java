package com.postinforg.config;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.postinforg.domain.UserImpl;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtManager {
	private final String securityKey = "postinforg1!@#";
	private final long expiredTime = 1000 * 60 * 60;
	
	public String generateJwtToken(UserImpl user) {
		Date now = new Date();
		return Jwts.builder().setSubject(user.getUsername())
				.setId(user.getUsername())
				.setHeader(createHeader())
				.setClaims(createClaims(user))
				.setExpiration(new Date(now.getTime() + expiredTime))
				.signWith(SignatureAlgorithm.HS256, securityKey)
				.compact();
	}

	private Map<String, Object> createClaims(UserImpl user) {
		Map<String, Object> claim = new HashMap<String, Object>();
		claim.put("name", user.getUsername());
		claim.put("roles", user.getRolls());
		return claim;
	}

	private Map<String, Object> createHeader() {
		Map<String, Object> header = new HashMap<String, Object>();
		header.put("type", "JWT");
		header.put("alg", "HS256");
		header.put("regDate", System.currentTimeMillis());
		return header;
	}
	
	public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
		final Claims claims = Jwts.parser().setSigningKey(securityKey)
				.parseClaimsJws(token)
				.getBody();
		return claimsResolver.apply(claims);
	}
	
	public String getUsernameFromToken(String token) {
		return getClaimFromToken(token, Claims::getId);
	}
}
