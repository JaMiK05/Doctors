package uz.gita.imtihon3oy.presentation.screen.fragment.home.home;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import uz.gita.imtihon3oy.R;

public class HomeScreenDirections {
  private HomeScreenDirections() {
  }

  @NonNull
  public static NavDirections actionHomeScreenToFavouriteScreen() {
    return new ActionOnlyNavDirections(R.id.action_homeScreen_to_favouriteScreen);
  }

  @NonNull
  public static NavDirections actionHomeScreenToNotificationScreen() {
    return new ActionOnlyNavDirections(R.id.action_homeScreen_to_notificationScreen);
  }
}
