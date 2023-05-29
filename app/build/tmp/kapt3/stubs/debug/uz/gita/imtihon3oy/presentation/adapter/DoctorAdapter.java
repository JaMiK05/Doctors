package uz.gita.imtihon3oy.presentation.adapter;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J)\u0010\u0014\u001a\u00020\u000b2!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006R+\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Luz/gita/imtihon3oy/presentation/adapter/DoctorAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Luz/gita/imtihon3oy/data/source/local/entity/DoctorEntity;", "Luz/gita/imtihon3oy/presentation/adapter/DoctorAdapter$ViewHolder;", "()V", "clickListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "id", "", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setFavouriteListener", "block", "MyDiffUtil", "ViewHolder", "app_debug"})
public final class DoctorAdapter extends androidx.recyclerview.widget.ListAdapter<uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity, uz.gita.imtihon3oy.presentation.adapter.DoctorAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> clickListener;
    
    public DoctorAdapter() {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public uz.gita.imtihon3oy.presentation.adapter.DoctorAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.presentation.adapter.DoctorAdapter.ViewHolder holder, int position) {
    }
    
    public final void setFavouriteListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> block) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Luz/gita/imtihon3oy/presentation/adapter/DoctorAdapter$MyDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Luz/gita/imtihon3oy/data/source/local/entity/DoctorEntity;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class MyDiffUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity> {
        @org.jetbrains.annotations.NotNull
        public static final uz.gita.imtihon3oy.presentation.adapter.DoctorAdapter.MyDiffUtil INSTANCE = null;
        
        private MyDiffUtil() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity oldItem, @org.jetbrains.annotations.NotNull
        uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity oldItem, @org.jetbrains.annotations.NotNull
        uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Luz/gita/imtihon3oy/presentation/adapter/DoctorAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Luz/gita/imtihon3oy/databinding/ItemDoctorBinding;", "(Luz/gita/imtihon3oy/presentation/adapter/DoctorAdapter;Luz/gita/imtihon3oy/databinding/ItemDoctorBinding;)V", "bind", "", "doctor", "Luz/gita/imtihon3oy/data/source/local/entity/DoctorEntity;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final uz.gita.imtihon3oy.databinding.ItemDoctorBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        uz.gita.imtihon3oy.databinding.ItemDoctorBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity doctor) {
        }
    }
}