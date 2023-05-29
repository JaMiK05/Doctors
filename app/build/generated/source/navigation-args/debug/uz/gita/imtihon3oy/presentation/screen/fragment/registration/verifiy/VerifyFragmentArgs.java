package uz.gita.imtihon3oy.presentation.screen.fragment.registration.verifiy;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class VerifyFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private VerifyFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private VerifyFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static VerifyFragmentArgs fromBundle(@NonNull Bundle bundle) {
    VerifyFragmentArgs __result = new VerifyFragmentArgs();
    bundle.setClassLoader(VerifyFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("code")) {
      String code;
      code = bundle.getString("code");
      if (code == null) {
        throw new IllegalArgumentException("Argument \"code\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("code", code);
    } else {
      throw new IllegalArgumentException("Required argument \"code\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("phone")) {
      String phone;
      phone = bundle.getString("phone");
      if (phone == null) {
        throw new IllegalArgumentException("Argument \"phone\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("phone", phone);
    } else {
      throw new IllegalArgumentException("Required argument \"phone\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static VerifyFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    VerifyFragmentArgs __result = new VerifyFragmentArgs();
    if (savedStateHandle.contains("code")) {
      String code;
      code = savedStateHandle.get("code");
      if (code == null) {
        throw new IllegalArgumentException("Argument \"code\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("code", code);
    } else {
      throw new IllegalArgumentException("Required argument \"code\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("phone")) {
      String phone;
      phone = savedStateHandle.get("phone");
      if (phone == null) {
        throw new IllegalArgumentException("Argument \"phone\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("phone", phone);
    } else {
      throw new IllegalArgumentException("Required argument \"phone\" is missing and does not have an android:defaultValue");
    }
    return __result;
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

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("code")) {
      String code = (String) arguments.get("code");
      __result.set("code", code);
    }
    if (arguments.containsKey("phone")) {
      String phone = (String) arguments.get("phone");
      __result.set("phone", phone);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    VerifyFragmentArgs that = (VerifyFragmentArgs) object;
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
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getCode() != null ? getCode().hashCode() : 0);
    result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "VerifyFragmentArgs{"
        + "code=" + getCode()
        + ", phone=" + getPhone()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull VerifyFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String code, @NonNull String phone) {
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
    public VerifyFragmentArgs build() {
      VerifyFragmentArgs result = new VerifyFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setCode(@NonNull String code) {
      if (code == null) {
        throw new IllegalArgumentException("Argument \"code\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("code", code);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setPhone(@NonNull String phone) {
      if (phone == null) {
        throw new IllegalArgumentException("Argument \"phone\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("phone", phone);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getCode() {
      return (String) arguments.get("code");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getPhone() {
      return (String) arguments.get("phone");
    }
  }
}
