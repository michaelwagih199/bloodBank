package inhomefragments;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.bloodbank.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import activities.LoginActivity;
import base.BaseFragment;


public class PersonalFragment extends BaseFragment {
    View view;
    Button btnLogOut;
    private DatabaseReference databaseReference;
    private FirebaseAuth firebaseAuth;
    public PersonalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_personal, container, false);
        databaseReference = FirebaseDatabase.getInstance().getReference();
        firebaseAuth = FirebaseAuth.getInstance();
        btnLogOut = (Button) view.findViewById(R.id.btnLogOut);

        view.findViewById(R.id.btnLogOut)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        firebaseAuth.signOut();
                        Intent i = new Intent(getContext(), LoginActivity.class);
                        startActivity(i);
                    }
                });

        return view;
    }

}
