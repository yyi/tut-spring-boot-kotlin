package com.example.blog

import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

/**
 * @creaor:yyi
 * @createDate:2020/10/9
 * @Describle
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface ArticleMapper {
    fun article2ArticleDto(article: Article?): ArticleDto
}
