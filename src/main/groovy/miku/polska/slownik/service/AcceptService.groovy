package miku.polska.slownik.service

import miku.polska.slownik.entity.WordModel
import org.springframework.stereotype.Service

@Service
interface AcceptService {
    void accept(WordModel wordModel)
}