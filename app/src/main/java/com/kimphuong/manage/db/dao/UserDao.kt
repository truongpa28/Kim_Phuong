package com.kimphuong.manage.db.dao

import androidx.room.*

@Dao
interface UserDao {

//    @Query("SELECT * FROM meme")
//    fun getAllMeme(): MutableList<MemeEntity>
//
//    @Query("SELECT Count(*) FROM meme")
//    fun getCountMeme(): LiveData<Int>
//
//    @Query(
//        "SELECT * FROM meme " +
//                "WHERE tab in (:list) " +
//                "ORDER BY \n" +
//                "CASE WHEN :isAsc = 1 THEN name END ASC,\n" +
//                "CASE WHEN :isAsc = 2 THEN name END DESC"
//    )
//    fun getTabMeme(list: List<String>, isAsc: Int): MutableList<MemeEntity>
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    fun addAllMeme(listData: ArrayList<MemeEntity>): List<Long>
//
//    @Query("delete from meme where id in (:listData)")
//    fun deleteAllMeme(listData: List<String>)
//
//    @Query("SELECT id FROM meme")
//    fun getAllIdOfMeme(): MutableList<String>
//
////    @Query("delete from meme")
////    fun deleteAllMeme() : List<Long>
//
//    @Query(
//        "SELECT * FROM user " +
//                "ORDER BY \n" +
//                "CASE WHEN :isAsc = 1 THEN name END ASC ,\n" +
//                "CASE WHEN :isAsc = 2 THEN name END DESC"
//    )
//    fun getListUser(isAsc: Int): MutableList<UserEntity>
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    fun addUser(userEntity: UserEntity): Long
//
//    @Delete
//    fun deleteUser(userEntity: UserEntity): Int
//
//    @Query(
//        "SELECT * FROM favorite " +
//                "ORDER BY \n" +
//                "CASE WHEN :isAsc = 1 THEN name END ASC ,\n" +
//                "CASE WHEN :isAsc = 2 THEN name END DESC"
//    )
//    fun getListFavorite(isAsc: Int): MutableList<FavoriteEntity>
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    fun addFavorite(favoriteEntity: FavoriteEntity): Long
//
//    @Delete
//    fun deleteFavorite(favoriteEntity: FavoriteEntity): Int
}