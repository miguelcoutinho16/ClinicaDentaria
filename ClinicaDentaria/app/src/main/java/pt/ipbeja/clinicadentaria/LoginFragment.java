package pt.ipbeja.clinicadentaria;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class LoginFragment extends Fragment {

    public ImageView mainImg;
    public Button btnLogin, btnSignUp, btnLeave;


    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login3, container, false);
        mainImg = view.findViewById(R.id.imgTooth);
        Glide.with(LoginFragment.this).load("https://i.pinimg.com/564x/d4/b8/44/d4b844eb1f4433979ff0d09ae5b70575.jpg").into(this.mainImg);

        btnLogin = view.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_loginFragment3_to_menuFragment2);
            }
        });

        btnSignUp = view.findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_loginFragment3_to_menuFragment2);
            }
        });

        btnLeave = view.findViewById(R.id.btnLeave);
        btnLeave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });


        return view;
    }
}