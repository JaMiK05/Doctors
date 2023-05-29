package uz.gita.imtihon3oy.presentation.screen.fragment.splash;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import uz.gita.imtihon3oy.R;

public class SplashScreenDirections {
  private SplashScreenDirections() {
  }

  @NonNull
  public static NavDirections actionSplashScreenToFirstPage() {
    return new ActionOnlyNavDirections(R.id.action_splashScreen_to_firstPage);
  }

  @NonNull
  public static ActionSplashScreenToProfileScreen actionSplashScreenToProfileScreen(
      @NonNull String phone, @NonNull String password) {
    return new ActionSplashScreenToProfileScreen(phone, password);
  }

  @NonNull
  public static NavDirections actionSplashScreenToRegistrFragment() {
    return new ActionOnlyNavDirections(R.id.action_splashScreen_to_registrFragment);
  }

  @NonNull
  public static NavDirections actionSplashScreenToMainFragment() {
    return new ActionOnlyNavDirections(R.id.action_splashScreen_to_mainFragment);
  }

  @NonNull
  public static NavDirections actionSplashScreenToViewPagerScreen() {
    return new ActionOnlyNavDirections(R.id.action_splashScreen_to_viewPagerScreen);
  }

  public static class ActionSplashScreenToProfileScreen implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionSplashScreenToProfileScreen(@NonNull String phone, @NonNull String password) {
      if (phone == null) {
        throw new IllegalArgumentException("Argument \"phone\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("phone", phone);
      if (password == null) {
        throw new IllegalArgumentException("Argument \"password\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("password", password);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSplashScreenToProfileScreen setPhone(@NonNull String phone) {
      if (phone == null) {
        throw new IllegalArgumentException("Argument \"phone\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("phone", phone);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSplashScreenToProfileScreen setPassword(@NonNull String password) {
      if (password == null) {
        throw new IllegalArgumentException("Argument \"password\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("password", password);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("phone")) {
        String phone = (String) arguments.get("phone");
        __result.putString("phone", phone);
      }
      if (arguments.containsKey("password")) {
        String password = (String) arguments.get("password");
        __result.putString("password", password);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_splashScreen_to_profileScreen;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getPhone() {
      return (String) arguments.get("phone");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getPassword() {
      return (String) arguments.get("password");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSplashScreenToProfileScreen that = (ActionSplashScreenToProfileScreen) object;
      if (arguments.containsKey("phone") != that.arguments.containsKey("phone")) {
        return false;
      }
      if (getPhone() != null ? !getPhone().equals(that.getPhone()) : that.getPhone() != null) {
        return false;
      }
      if (arguments.containsKey("password") != that.arguments.containsKey("password")) {
        return false;
      }
      if (getPassword() != null ? !getPassword().equals(that.getPassword()) : that.getPassword() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
      result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSplashScreenToProfileScreen(actionId=" + getActionId() + "){"
          + "phone=" + getPhone()
          + ", password=" + getPassword()
          + "}";
    }
  }
}
