package KoKoKotlin.eval

import java.util.*
import java.io.*

class KoKoListValue : ArrayList<KoKoValue>, KoKoValue {
    constructor(list: ArrayList<KoKoValue>) : super(list) {}
    constructor() : super() {}
}