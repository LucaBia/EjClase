package com.example.gianlucariverabiagioni.noteapp.data

@Entity(tableName = "note_table")
data class Note(
    var title: String,
    var description: String,
    var priority: Int
){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}