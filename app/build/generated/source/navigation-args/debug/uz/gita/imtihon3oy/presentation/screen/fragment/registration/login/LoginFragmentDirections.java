package uz.gita.imtihon3oy.presentation.screen.fragment.registration.login;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import uz.gita.imtihon3oy.R;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLoginFragmentToSignInFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_signInFragment);
  }

  @NonNull
  public static NavDirections actionLoginFragmentToMainFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_mainFragment);
  }

  @NonNull
  public static NavDirections actionLoginFragmentToRegistrFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_registrFragment);
  }
}
