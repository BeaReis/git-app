package bootcamp.inter.apprepository.domain

import bootcamp.inter.apprepository.core.UseCase
import bootcamp.inter.apprepository.data.model.Repo
import bootcamp.inter.apprepository.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase (
    private val repository: RepoRepository
    ): UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}