package com.example.blog

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime


/**
 * @creaor:yyi
 * @createDate:2020/10/9
 * @Describle
 */
class ArticleDto {
    @JsonProperty("articleTitle")
    var title: String? = null

    var headline: String? = null

    var content: String? = null

    var author: User? = null

    var slug: String? = null

    var addedAt: LocalDateTime? = null

    var id: Long? = null

}
