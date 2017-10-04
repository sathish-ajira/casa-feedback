
package tech.ajira.casa_feedback.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import tech.ajira.casa_feedback.R;
import tech.ajira.casa_feedback.activities.CustomerFeedback;
import tech.ajira.casa_feedback.activities.CustomerLogin;
import tech.ajira.casa_feedback.activities.Dashboard;
import tech.ajira.casa_feedback.activities.QuestionEditActivity;

/**
 * Created by mxn on 2016/12/13.
 * MenuListFragment
 */

public class MenuListFragment extends Fragment {

//    private ImageView ivMenuUserProfilePhoto;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_menu, container,
                false);
//        ivMenuUserProfilePhoto = (ImageView) view.findViewById(R.id.ivMenuUserProfilePhoto);
        NavigationView vNavigation = (NavigationView) view.findViewById(R.id.vNavigation);
        vNavigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                if (menuItem.getTitle().equals("Customer feedback")){
                    startActivity(new Intent(view.getContext(), CustomerFeedback.class));
                } else if (menuItem.getTitle().equals("Add Questions")){
                    startActivity(new Intent(view.getContext(), QuestionEditActivity.class));
                }
                return false;
            }
        }) ;
        return  view ;
    }


}
