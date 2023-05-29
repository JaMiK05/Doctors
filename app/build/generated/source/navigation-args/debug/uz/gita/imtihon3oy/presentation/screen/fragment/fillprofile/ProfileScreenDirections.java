package uz.gita.imtihon3oy.presentation.screen.fragment.fillprofile;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import uz.gita.imtihon3oy.R;

public class ProfileScreenDirections {
  private ProfileScreenDirections() {
  }

  @NonNull
  public static NavDirections actionProfileScreenToMainFragment() {
    return new ActionOnlyNavDirections(R.id.action_profileScreen_to_mainFragment);
  }
}
