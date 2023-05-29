package uz.gita.imtihon3oy.data.source.local;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Luz/gita/imtihon3oy/data/source/local/DoctorDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getDoctorDao", "Luz/gita/imtihon3oy/data/source/local/dao/DoctorDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity.class}, version = 1, exportSchema = false)
public abstract class DoctorDatabase extends androidx.room.RoomDatabase {
    private static uz.gita.imtihon3oy.data.source.local.DoctorDatabase database;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String NAME_DATABASE = "doc_list.db";
    @org.jetbrains.annotations.NotNull
    public static final uz.gita.imtihon3oy.data.source.local.DoctorDatabase.Companion Companion = null;
    
    public DoctorDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.imtihon3oy.data.source.local.dao.DoctorDao getDoctorDao();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Luz/gita/imtihon3oy/data/source/local/DoctorDatabase$Companion;", "", "()V", "NAME_DATABASE", "", "database", "Luz/gita/imtihon3oy/data/source/local/DoctorDatabase;", "getInstance", "init", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void init(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final uz.gita.imtihon3oy.data.source.local.DoctorDatabase getInstance() {
            return null;
        }
    }
}