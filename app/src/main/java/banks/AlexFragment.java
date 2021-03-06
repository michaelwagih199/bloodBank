package banks;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.example.bloodbank.R;


public class AlexFragment extends Fragment {


    public AlexFragment() {
        // Required empty public constructor
    }

    public int[] imageSource = {
            R.drawable.alex1,
            R.drawable.alex2,
            R.drawable.alex3,
            R.drawable.alex4,
            R.drawable.alex5,
            R.drawable.alex6,
            R.drawable.alex7,
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_alex, container, false);


        LinearLayout linearLayout1 = view.findViewById(R.id.ll_alex);
        for (int i = 0; i < 7; i++) {
            ImageView image = new ImageView(getActivity());
            image.setBackgroundResource(imageSource[i]);
            linearLayout1.addView(image);
        }

        return view;
    }

}
