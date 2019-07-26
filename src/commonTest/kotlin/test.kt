package org.tallythings.common.test

import Note
import NotebookStore
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SampleTests {
    @Test
    fun testMe() {

        assertTrue(true)
    }

    @Test
    fun `A new store should not hae notebooks`() {
        val store = NotebookStore()
        assertEquals(0, store.notebooks.count(), "The count should be 0")
    }

    @Test
    fun `should be a good test`() {
        val store = NotebookStore()
        store.createNotebook("My Name is kevin")

        assertEquals(1, store.notebooks.count(), "The count should be 1")
    }

    @Test
    fun `should be able to add notes`() {
        val store = NotebookStore()
        val notebook = store.createNotebook("My Name is kevin")
        notebook.notes.add(Note("now", "This is some note"))

        val testNotebook = store.getNotebook(0)
        assertEquals(1, testNotebook.notes.count(), "The note count should be 1")
    }

}