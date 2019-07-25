data class Note(val timestamp: String, val note: String)

data class Notebook(val title: String, val notes: MutableList<Note>)

// In memory store of notebooks.
class NotebookStore {
    val notebooks = mutableListOf<Notebook>()

    fun createNotebook(title: String): Boolean {
        val notebook = Notebook(title, mutableListOf())
        return notebooks.add(notebook)
    }

    fun deteNotebook(notebook: Notebook): Boolean {
        return notebooks.remove(notebook)
    }
}
