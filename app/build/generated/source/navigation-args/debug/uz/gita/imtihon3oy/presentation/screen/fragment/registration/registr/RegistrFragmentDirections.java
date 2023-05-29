package uz.gita.imtihon3oy.presentation.screen.fragment.registration.registr;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import uz.gita.imtihon3oy.R;

public class RegistrFragmentDirections {
  private RegistrFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionRegistrFragmentToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_registrFragment_to_loginFragment);
  }

  @NonNull
  public static NavDirections actionRegistrFragmentToSignInFragment() {
    return new ActionOnlyNavDirections(R.id.action_registrFragment_to_signInFragment);
  }
}
