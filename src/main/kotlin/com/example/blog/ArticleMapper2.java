package com.example.blog;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @creaor:yyi
 * @createDate:2020/10/9
 * @Describle
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ArticleMapper2 {
    ArticleDto article2ArticleDto(Article article);
}
