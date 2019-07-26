data class Note(val timestamp: String, val note: String)

data class Notebook(val title: String, val notes: MutableList<Note>)

// In memory store of notebooks.
class NotebookStore {
    val notebooks = mutableListOf<Notebook>()

    fun createNotebook(title: String): Notebook {
        val notebook = Notebook(title, mutableListOf())
        notebooks.add(notebook)
        return notebook
    }

    fun deleteNotebook(notebook: Notebook): Boolean {
        return notebooks.remove(notebook)
    }

    fun getNotebook(index: Int): Notebook{
        return notebooks.get(index)
    }

}
