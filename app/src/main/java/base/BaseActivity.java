package base;



import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.bloodbank.R;


public class BaseActivity extends AppCompatActivity {


    public void addFragment(BaseFragment fragment, boolean isAddToBackStack) {
        addFragment(fragment, isAddToBackStack, false);
    }

    public void addFragment(BaseFragment fragment, boolean isAddToBackStack, boolean isAllowRepeatFragment) {
        if (fragment == null) return;

        FragmentManager fm = getSupportFragmentManager();
        Fragment currentFragment = fm.findFragmentById(R.id.main_fragment);
        if (!isAllowRepeatFragment && currentFragment != null &&
                currentFragment.getClass().getName() == fragment.getClass().getName()
        ) {
            return;
        }

        FragmentTransaction ft = fm.beginTransaction()
                .replace(R.id.main_fragment, fragment);
        if (isAddToBackStack)
            ft.addToBackStack(fragment.getClass().getName());
        ft.commit();
    }

}
