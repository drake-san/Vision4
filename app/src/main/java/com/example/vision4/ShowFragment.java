package com.example.vision4;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ShowFragment extends Fragment {

    public static ArrayList<Show>  shows = new ArrayList<>();
    public static ArrayList<Show> downloads = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_show, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CardView cardView1 = getView().findViewById(R.id.cardView1);
        CardView cardView2 = getView().findViewById(R.id.cardView2);
        CardView cardView3 = getView().findViewById(R.id.cardView3);
        CardView cardView4 = getView().findViewById(R.id.cardView4);

        ImageView view1 = getView().findViewById(R.id.View1);
        ImageView view2 = getView().findViewById(R.id.View2);
        ImageView view3 = getView().findViewById(R.id.View3);
        ImageView view4 = getView().findViewById(R.id.View4);

        ImageView download1 = getView().findViewById(R.id.download1);
        ImageView download2 = getView().findViewById(R.id.download2);
        ImageView download3 = getView().findViewById(R.id.download3);
        ImageView download4 = getView().findViewById(R.id.download4);

        launchVideo1(cardView1);
        launchVideo2(cardView2);
        launchVideo3(cardView3);
        launchVideo4(cardView4);

        subscribe(view1, "A LA UNE", "Les etudiants manquent de plus en plus l'ecole");
        subscribe(view2, "A VOUS LA PAROLE", "Du cote de Yaounde");
        subscribe(view3, "AU MICRO", "Le representant des personnes humbles");
        subscribe(view4, "10 MIN AVEC NOUS", "Rencontre du PRC");

        download(download1, "A LA UNE", "Les etudiants manquent de plus en plus l'ecole");
        download(download2, "A VOUS LA PAROLE", "Du cote de Yaounde");
        download(download3, "AU MICRO", "Le representant des personnes humbles");
        download(download4, "10 MIN AVEC NOUS", "Rencontre du PRC");
    }


    private void launchVideo1(CardView c) {
        c.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), VideoActivity.class);
            startActivity(intent);
        });
    }
    private void launchVideo2(CardView c) {
        c.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), VideoActivity2.class);
            startActivity(intent);
        });
    }
    private void launchVideo3(CardView c) {
        c.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), VideoActivity3.class);
            startActivity(intent);
        });
    }
    private void launchVideo4(CardView c) {
        c.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), VideoActivity4.class);
            startActivity(intent);
        });
    }

    private void subscribe(ImageView i, String title, String theme) {
        i.setOnClickListener(view -> {
            shows.add(new Show(title, theme));
            Toast.makeText(getContext(), "Abonne", Toast.LENGTH_SHORT).show();
        });
    }

    private void download(ImageView i, String title, String theme) {
        i.setOnClickListener(view -> {
            downloads.add(new Show(title, theme));
            Toast.makeText(getContext(), "Telecharge", Toast.LENGTH_SHORT).show();
        });
    }
}