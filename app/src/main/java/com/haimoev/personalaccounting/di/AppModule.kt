package com.haimoev.personalaccounting.di

import android.app.Application
import androidx.room.Room
import com.haimoev.personalaccounting.persistence.EntryDao
import com.haimoev.personalaccounting.persistence.EntryDatabase
import com.haimoev.personalaccounting.repository.EntryRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun providesEntryDao(db: EntryDatabase): EntryDao {
        return db.entryDao()
    }

    @Singleton
    @Provides
    fun provideAppDatabase(app: Application): EntryDatabase {
        return Room.databaseBuilder(app, EntryDatabase::class.java, "entry_db")
            .build()
    }

    @Singleton
    @Provides
    fun providesRepository(): EntryRepository {
        return EntryRepository()
    }
}