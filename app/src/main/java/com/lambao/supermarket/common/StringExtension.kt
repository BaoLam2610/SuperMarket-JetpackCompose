package com.lambao.supermarket.common

import java.text.DecimalFormat


fun String.addEmptyLines(lines: Int) = this + "\n".repeat(lines)

fun Long.castToMoney(): String {
    return DecimalFormat("#,###").format(this) + "đ"
}

fun Float.castToDiscount() : String {
    return "-" + this.toString().replace(".",",") + "%"
}