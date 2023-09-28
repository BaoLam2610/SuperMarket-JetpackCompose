package com.lambao.supermarket.common

sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T? = null, message: String? = null) : Resource<T>(data, message)
    class Error<T>(message: String?) : Resource<T>(message = message)
    class Loading<T>(val isLoading: Boolean) : Resource<T>()
}
