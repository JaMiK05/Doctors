package uz.gita.imtihon3oy.presentation.screen.fragment.registration.signup;

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

public class SignUpFragmentDirections {
  private SignUpFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSignInFragmentToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_signInFragment_to_loginFragment);
  }

  @NonNull
  public static ActionSignInFragmentToVerifyFragment2 actionSignInFragmentToVerifyFragment2(
      @NonNull String code, @NonNull String phone) {
    return new ActionSignInFragmentToVerifyFragment2(code, phone);
  }

  @NonNull
  public static NavDirections actionSignInFragmentToRegistrFragment() {
    return new ActionOnlyNavDirections(R.id.action_signInFragment_to_registrFragment);
  }

  public static class ActionSignInFragmentToVerifyFragment2 implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionSignInFragmentToVerifyFragment2(@NonNull String code, @NonNull String phone) {
      if (code == null) {
        throw new IllegalArgumentException("Argument \"code\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("code", code);
      if (phone == null) {
        throw new IllegalArgumentException("Argument \"phone\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("phone", phone);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSignInFragmentToVerifyFragment2 setCode(@NonNull String code) {
      if (code == null) {
        throw new IllegalArgumentException("Argument \"code\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("code", code);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSignInFragmentToVerifyFragment2 setPhone(@NonNull String phone) {
      if (phone == null) {
        throw new IllegalArgumentException("Argument \"phone\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("phone", phone);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("code")) {
        String code = (String) arguments.get("code");
        __result.putString("code", code);
      }
      if (arguments.containsKey("phone")) {
        String phone = (String) arguments.get("phone");
        __result.putString("phone", phone);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_signInFragment_to_verifyFragment2;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getCode() {
      return (String) arguments.get("code");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getPhone() {
      return (String) arguments.get("phone");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSignInFragmentToVerifyFragment2 that = (ActionSignInFragmentToVerifyFragment2) object;
      if (arguments.containsKey("code") != that.arguments.containsKey("code")) {
        return false;
      }
      if (getCode() != null ? !getCode().equals(that.getCode()) : that.getCode() != null) {
        return false;
      }
      if (arguments.containsKey("phone") != that.arguments.containsKey("phone")) {
        return false;
      }
      if (getPhone() != null ? !getPhone().equals(that.getPhone()) : that.getPhone() != null) {
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
      result = 31 * result + (getCode() != null ? getCode().hashCode() : 0);
      result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSignInFragmentToVerifyFragment2(actionId=" + getActionId() + "){"
          + "code=" + getCode()
          + ", phone=" + getPhone()
          + "}";
    }
  }
}
