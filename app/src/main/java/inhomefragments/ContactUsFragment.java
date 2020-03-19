package inhomefragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bloodbank.R;

import activities.HomeActivity;
import base.BaseFragment;


public class ContactUsFragment extends BaseFragment {


    public ContactUsFragment() {
        // Required empty public constructor
    }

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_contact_us, container, false);


        // Create request to get image from filesystem when button clicked
        view.findViewById(R.id.btn_close)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i =  new Intent(getContext(), HomeActivity.class);
                        startActivity(i);
                    }
                });




        return view;
    }

}
