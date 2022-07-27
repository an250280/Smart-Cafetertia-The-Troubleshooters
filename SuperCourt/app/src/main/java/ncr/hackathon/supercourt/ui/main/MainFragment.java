package ncr.hackathon.supercourt.ui.main;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ncr.hackathon.supercourt.MainActivity2;
import ncr.hackathon.supercourt.R;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main,
                container, false);
        Button button = (Button) rootView.findViewById(R.id.button);
        button.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                goToAttract(view);
            }
        });
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
    }

    public void goToAttract(View v)
    {
        Intent intent = new Intent(getActivity(), MainActivity2.class);
        startActivity(intent);

    }

}