package com.example.myeonsic.donari;

import org.junit.Test;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void Test() throws Exception {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHubService service = retrofit.create(GitHubService.class);
        Call<List<Repo>> repos = service.listRepos("actumn");


        List<Repo> data = repos.execute().body();
        for (Repo repo : data) {
            System.out.println(repo.id);
            System.out.println(repo.node_id);
        }


        /*
        repos.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                List<Repo> data = response.body();

                for (Repo repo : data) {
                    System.out.println(repo.id);
                }
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                System.out.println("fail");
            }
        });
*/
    }
}