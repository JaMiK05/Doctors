// Generated by view binder compiler. Do not edit!
package uz.gita.imtihon3oy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.gita.imtihon3oy.R;

public final class FragmentSignupBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final View divider;

  @NonNull
  public final View divider1;

  @NonNull
  public final ImageView image;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final TextView letsyouin;

  @NonNull
  public final EditText password;

  @NonNull
  public final EditText phone;

  @NonNull
  public final LinearLayout phoneAndPassword;

  @NonNull
  public final TextView signin;

  @NonNull
  public final AppCompatButton signup;

  private FragmentSignupBinding(@NonNull ConstraintLayout rootView, @NonNull View divider,
      @NonNull View divider1, @NonNull ImageView image, @NonNull ImageView imageView2,
      @NonNull TextView letsyouin, @NonNull EditText password, @NonNull EditText phone,
      @NonNull LinearLayout phoneAndPassword, @NonNull TextView signin,
      @NonNull AppCompatButton signup) {
    this.rootView = rootView;
    this.divider = divider;
    this.divider1 = divider1;
    this.image = image;
    this.imageView2 = imageView2;
    this.letsyouin = letsyouin;
    this.password = password;
    this.phone = phone;
    this.phoneAndPassword = phoneAndPassword;
    this.signin = signin;
    this.signup = signup;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_signup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSignupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.divider;
      View divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.divider1;
      View divider1 = ViewBindings.findChildViewById(rootView, id);
      if (divider1 == null) {
        break missingId;
      }

      id = R.id.image;
      ImageView image = ViewBindings.findChildViewById(rootView, id);
      if (image == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.letsyouin;
      TextView letsyouin = ViewBindings.findChildViewById(rootView, id);
      if (letsyouin == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.phone;
      EditText phone = ViewBindings.findChildViewById(rootView, id);
      if (phone == null) {
        break missingId;
      }

      id = R.id.phoneAndPassword;
      LinearLayout phoneAndPassword = ViewBindings.findChildViewById(rootView, id);
      if (phoneAndPassword == null) {
        break missingId;
      }

      id = R.id.signin;
      TextView signin = ViewBindings.findChildViewById(rootView, id);
      if (signin == null) {
        break missingId;
      }

      id = R.id.signup;
      AppCompatButton signup = ViewBindings.findChildViewById(rootView, id);
      if (signup == null) {
        break missingId;
      }

      return new FragmentSignupBinding((ConstraintLayout) rootView, divider, divider1, image,
          imageView2, letsyouin, password, phone, phoneAndPassword, signin, signup);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
