package inhomefragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.viewpager.widget.ViewPager;
import com.example.bloodbank.R;
import banks.ViewPagerAdapter;
import base.BaseFragment;

public class BanksFragment extends BaseFragment {

    public BanksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_banks, container, false);
        ViewPager viewPager= view.findViewById(R.id.vp_viewpager);
        viewPager.setAdapter(new ViewPagerAdapter(getChildFragmentManager()));
//        TableLayout tabLayout= view.findViewById(R.id.tl_sliding);
        return view;
    }

}