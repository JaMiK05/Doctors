package uz.gita.imtihon3oy.presentation.screen.fragment.viewpager;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import uz.gita.imtihon3oy.R;

public class FirstPageDirections {
  private FirstPageDirections() {
  }

  @NonNull
  public static NavDirections actionFirstPageToViewPagerScreen() {
    return new ActionOnlyNavDirections(R.id.action_firstPage_to_viewPagerScreen);
  }
}
