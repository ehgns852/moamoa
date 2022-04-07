package com.backend.moamoa.domain.post.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@ApiModel(description = "게시글 수정 요청 데이터 모델")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostUpdateRequest {

    @ApiModelProperty(value = "게시글 PK", example = "1", required = true)
    @NotNull
    private Long postId;

    @ApiModelProperty(value = "게시글 제목", example = "모아모아 화이팅!")
    private String title;

    @ApiModelProperty(value = "게시글 내용", example = "무야호")
    private String content;

}