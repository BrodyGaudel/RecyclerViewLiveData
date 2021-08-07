package com.mounangabouka.guide.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.mounangabouka.guide.entity.Word;

import java.util.List;

@Dao
public interface WordDao {
    // allowing the insert of the same word multiple times by passing a
    // conflict resolution strategy
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Word word);

    @Query("DELETE FROM word_table")
    void deleteAll();

    /*@Query("SELECT * FROM word_table ORDER BY word ASC")
    List<Word> getAlphabetizedWords();*/

    //le retour List<Word> est encapsulé avec LiveData
    @Query("SELECT * FROM word_table ORDER BY word ASC")
    LiveData<List<Word>> getAlphabetizedWords();
}
