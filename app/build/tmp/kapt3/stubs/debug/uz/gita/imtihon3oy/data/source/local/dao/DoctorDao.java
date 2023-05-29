package uz.gita.imtihon3oy.data.source.local.dao;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H\'\u00a8\u0006\u0011"}, d2 = {"Luz/gita/imtihon3oy/data/source/local/dao/DoctorDao;", "", "addDoctor", "", "doctor", "Luz/gita/imtihon3oy/data/source/local/entity/DoctorEntity;", "getAllDoctors", "", "getDoctor", "id", "", "getFavouriteDoctors", "getLikeBooks", "like", "", "updateDoctor", "doctorEntity", "app_debug"})
@androidx.room.Dao
public abstract interface DoctorDao {
    
    @androidx.room.Insert
    public abstract void addDoctor(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity doctor);
    
    @androidx.room.Update
    public abstract void updateDoctor(@org.jetbrains.annotations.NotNull
    uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity doctorEntity);
    
    @androidx.room.Query(value = "SELECT * FROM doctors WHERE isFavourite = 1")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity> getFavouriteDoctors();
    
    @androidx.room.Query(value = "SELECT * FROM doctors WHERE id =:id")
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity getDoctor(long id);
    
    @androidx.room.Query(value = "SELECT * FROM doctors ORDER by id")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity> getAllDoctors();
    
    @androidx.room.Query(value = "SELECT * FROM doctors WHERE  name LIKE \'%\' || :like || \'%\'  OR degree LIKE :like OR rate LIKE :like")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity> getLikeBooks(@org.jetbrains.annotations.NotNull
    java.lang.String like);
}