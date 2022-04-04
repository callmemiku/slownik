package miku.polska.slownik.entity

import org.springframework.stereotype.Component

@Component
class WordModel {
    String polishWord
    String englishWord
    String russianWord
    Long userId
    Boolean common
    String userComment

}
