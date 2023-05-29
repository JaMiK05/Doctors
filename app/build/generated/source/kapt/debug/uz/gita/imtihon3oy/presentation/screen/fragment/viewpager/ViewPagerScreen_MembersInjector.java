package uz.gita.imtihon3oy.presentation.screen.fragment.viewpager;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.imtihon3oy.data.share.MySharedPref;

@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ViewPagerScreen_MembersInjector implements MembersInjector<ViewPagerScreen> {
  private final Provider<MySharedPref> sharedProvider;

  public ViewPagerScreen_MembersInjector(Provider<MySharedPref> sharedProvider) {
    this.sharedProvider = sharedProvider;
  }

  public static MembersInjector<ViewPagerScreen> create(Provider<MySharedPref> sharedProvider) {
    return new ViewPagerScreen_MembersInjector(sharedProvider);
  }

  @Override
  public void injectMembers(ViewPagerScreen instance) {
    injectShared(instance, sharedProvider.get());
  }

  @InjectedFieldSignature("uz.gita.imtihon3oy.presentation.screen.fragment.viewpager.ViewPagerScreen.shared")
  public static void injectShared(ViewPagerScreen instance, MySharedPref shared) {
    instance.shared = shared;
  }
}
