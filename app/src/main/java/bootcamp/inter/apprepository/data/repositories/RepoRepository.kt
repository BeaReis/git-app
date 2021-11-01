package bootcamp.inter.apprepository.data.repositories

import  bootcamp.inter.apprepository.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}