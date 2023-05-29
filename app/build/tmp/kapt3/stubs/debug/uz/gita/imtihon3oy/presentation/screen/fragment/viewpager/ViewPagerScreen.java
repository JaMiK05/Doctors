package uz.gita.imtihon3oy.presentation.screen.fragment.viewpager;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020%H\u0016J\u001a\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001d\u0010\fR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\u000e\u001a\u0004\b!\u0010\"\u00a8\u0006+"}, d2 = {"Luz/gita/imtihon3oy/presentation/screen/fragment/viewpager/ViewPagerScreen;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Luz/gita/imtihon3oy/databinding/ScreenPagerBinding;", "getBinding", "()Luz/gita/imtihon3oy/databinding/ScreenPagerBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "buttonNext", "Landroid/widget/TextView;", "getButtonNext", "()Landroid/widget/TextView;", "buttonNext$delegate", "Lkotlin/Lazy;", "dots", "Lcom/tbuonomo/viewpagerdotsindicator/DotsIndicator;", "getDots", "()Lcom/tbuonomo/viewpagerdotsindicator/DotsIndicator;", "dots$delegate", "ob", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "shared", "Luz/gita/imtihon3oy/data/share/MySharedPref;", "getShared", "()Luz/gita/imtihon3oy/data/share/MySharedPref;", "setShared", "(Luz/gita/imtihon3oy/data/share/MySharedPref;)V", "title", "getTitle", "title$delegate", "vp", "Landroidx/viewpager2/widget/ViewPager2;", "getVp", "()Landroidx/viewpager2/widget/ViewPager2;", "vp$delegate", "onDestroy", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class ViewPagerScreen extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy vp$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy buttonNext$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy title$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy dots$delegate = null;
    @javax.inject.Inject
    public uz.gita.imtihon3oy.data.share.MySharedPref shared;
    @org.jetbrains.annotations.NotNull
    private final androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback ob = null;
    
    public ViewPagerScreen() {
        super();
    }
    
    private final uz.gita.imtihon3oy.databinding.ScreenPagerBinding getBinding() {
        return null;
    }
    
    private final androidx.viewpager2.widget.ViewPager2 getVp() {
        return null;
    }
    
    private final android.widget.TextView getButtonNext() {
        return null;
    }
    
    private final android.widget.TextView getTitle() {
        return null;
    }
    
    private final com.tbuonomo.viewpagerdotsindicator.DotsIndicator getDots() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final uz.gita.imtihon3oy.data.share.MySharedPref getShared() {
        return null;
    }
    
    public final void setShared(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.data.share.MySharedPref p0) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
}