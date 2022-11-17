package es.myfirstapplication.practicatokio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

import es.myfirstapplication.practicatokio3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setlisteners();
        setvalues();





    }

    private void setvalues() {

        binding.titleLogin.setText(getString(R.string.title_main));
        binding.buttonLogin.setText(getString(R.string.main_button_login));

    }

    private void setlisteners() {

        binding.buttonPassword.setOnClickListener(view ->
                Snackbar.make(view, "Se implementarán más funcionalidades próximamente",
                        Snackbar.LENGTH_LONG).show());


        binding.buttonAccount.setOnClickListener(view ->
                Snackbar.make(view, "Se implementarán más funcionalidades próximamente",
                        Snackbar.LENGTH_LONG).show());




    }

}