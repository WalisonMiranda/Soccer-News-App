package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        List<News> news = new ArrayList<>();

        // TODO Remover mock de notícias
        news.add(new News("Ferroviária tem desfalque importante.",
                "Alguma descrição."));

        news.add(new News("Ferroviária joga no sábado.",
                "Alguma descrição qualquer."));

        news.add(new News("Copa do mundo feminina está terminando",
                "Outra descrição qualquer."));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return news;
    }
}