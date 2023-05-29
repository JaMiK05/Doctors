package uz.gita.imtihon3oy.presentation.screen.fragment.viewpager;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import uz.gita.imtihon3oy.R;

public class ViewPagerScreenDirections {
  private ViewPagerScreenDirections() {
  }

  @NonNull
  public static NavDirections actionViewPagerScreenToRegistrFragment() {
    return new ActionOnlyNavDirections(R.id.action_viewPagerScreen_to_registrFragment);
  }
}
