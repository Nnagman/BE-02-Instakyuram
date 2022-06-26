package com.kdt.instakyuram.member.dto;

import lombok.Builder;

@Builder
public record MemberResponse(
	Long id,
	String username,
	String name,
	String email,
	String phoneNumber,
	String introduction,
	String profileImageName
) {

	public record SignupResponse(
		Long id,
		String username) {
	}

	public record SigninResponse(Long id, String username, String accessToken, String refreshToken, String[] roles) {
	}

	public record MemberListViewResponse(Long id, String username, String name) {
	}

	public record ProfileInfoResponse(
		Long id,
		String username,
		String name,
		String introduction,
		Long postCount,
		Long followerCount,
		Long followCount,
		String profileImageName
	) {
	}
}
