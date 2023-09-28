package com.lambao.supermarket.di

import dagger.Module
import dagger.hilt.InstallIn
import javax.inject.Singleton

@Module
@InstallIn(Singleton::class)
abstract class RepositoryModule {

    /*@Binds
    @Singleton
    abstract fun bindRepository(
        repositoryImpl: EmptyRepositoryImpl
    ): EmptyRepository*/
}