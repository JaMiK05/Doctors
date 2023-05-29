package uz.gita.imtihon3oy.data.source.local.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import uz.gita.imtihon3oy.data.source.local.entity.DoctorEntity;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class DoctorDao_Impl implements DoctorDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DoctorEntity> __insertionAdapterOfDoctorEntity;

  private final EntityDeletionOrUpdateAdapter<DoctorEntity> __updateAdapterOfDoctorEntity;

  public DoctorDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDoctorEntity = new EntityInsertionAdapter<DoctorEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `doctors` (`id`,`name`,`degree`,`rate`,`picture`,`isFavourite`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DoctorEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDegree() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDegree());
        }
        if (value.getRate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getRate());
        }
        if (value.getPicture() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPicture());
        }
        stmt.bindLong(6, value.isFavourite());
      }
    };
    this.__updateAdapterOfDoctorEntity = new EntityDeletionOrUpdateAdapter<DoctorEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `doctors` SET `id` = ?,`name` = ?,`degree` = ?,`rate` = ?,`picture` = ?,`isFavourite` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DoctorEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDegree() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDegree());
        }
        if (value.getRate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getRate());
        }
        if (value.getPicture() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPicture());
        }
        stmt.bindLong(6, value.isFavourite());
        stmt.bindLong(7, value.getId());
      }
    };
  }

  @Override
  public void addDoctor(final DoctorEntity doctor) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDoctorEntity.insert(doctor);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateDoctor(final DoctorEntity doctorEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfDoctorEntity.handle(doctorEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<DoctorEntity> getFavouriteDoctors() {
    final String _sql = "SELECT * FROM doctors WHERE isFavourite = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDegree = CursorUtil.getColumnIndexOrThrow(_cursor, "degree");
      final int _cursorIndexOfRate = CursorUtil.getColumnIndexOrThrow(_cursor, "rate");
      final int _cursorIndexOfPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "picture");
      final int _cursorIndexOfIsFavourite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavourite");
      final List<DoctorEntity> _result = new ArrayList<DoctorEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DoctorEntity _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpDegree;
        if (_cursor.isNull(_cursorIndexOfDegree)) {
          _tmpDegree = null;
        } else {
          _tmpDegree = _cursor.getString(_cursorIndexOfDegree);
        }
        final String _tmpRate;
        if (_cursor.isNull(_cursorIndexOfRate)) {
          _tmpRate = null;
        } else {
          _tmpRate = _cursor.getString(_cursorIndexOfRate);
        }
        final String _tmpPicture;
        if (_cursor.isNull(_cursorIndexOfPicture)) {
          _tmpPicture = null;
        } else {
          _tmpPicture = _cursor.getString(_cursorIndexOfPicture);
        }
        final int _tmpIsFavourite;
        _tmpIsFavourite = _cursor.getInt(_cursorIndexOfIsFavourite);
        _item = new DoctorEntity(_tmpId,_tmpName,_tmpDegree,_tmpRate,_tmpPicture,_tmpIsFavourite);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public DoctorEntity getDoctor(final long id) {
    final String _sql = "SELECT * FROM doctors WHERE id =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDegree = CursorUtil.getColumnIndexOrThrow(_cursor, "degree");
      final int _cursorIndexOfRate = CursorUtil.getColumnIndexOrThrow(_cursor, "rate");
      final int _cursorIndexOfPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "picture");
      final int _cursorIndexOfIsFavourite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavourite");
      final DoctorEntity _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpDegree;
        if (_cursor.isNull(_cursorIndexOfDegree)) {
          _tmpDegree = null;
        } else {
          _tmpDegree = _cursor.getString(_cursorIndexOfDegree);
        }
        final String _tmpRate;
        if (_cursor.isNull(_cursorIndexOfRate)) {
          _tmpRate = null;
        } else {
          _tmpRate = _cursor.getString(_cursorIndexOfRate);
        }
        final String _tmpPicture;
        if (_cursor.isNull(_cursorIndexOfPicture)) {
          _tmpPicture = null;
        } else {
          _tmpPicture = _cursor.getString(_cursorIndexOfPicture);
        }
        final int _tmpIsFavourite;
        _tmpIsFavourite = _cursor.getInt(_cursorIndexOfIsFavourite);
        _result = new DoctorEntity(_tmpId,_tmpName,_tmpDegree,_tmpRate,_tmpPicture,_tmpIsFavourite);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<DoctorEntity> getAllDoctors() {
    final String _sql = "SELECT * FROM doctors ORDER by id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDegree = CursorUtil.getColumnIndexOrThrow(_cursor, "degree");
      final int _cursorIndexOfRate = CursorUtil.getColumnIndexOrThrow(_cursor, "rate");
      final int _cursorIndexOfPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "picture");
      final int _cursorIndexOfIsFavourite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavourite");
      final List<DoctorEntity> _result = new ArrayList<DoctorEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DoctorEntity _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpDegree;
        if (_cursor.isNull(_cursorIndexOfDegree)) {
          _tmpDegree = null;
        } else {
          _tmpDegree = _cursor.getString(_cursorIndexOfDegree);
        }
        final String _tmpRate;
        if (_cursor.isNull(_cursorIndexOfRate)) {
          _tmpRate = null;
        } else {
          _tmpRate = _cursor.getString(_cursorIndexOfRate);
        }
        final String _tmpPicture;
        if (_cursor.isNull(_cursorIndexOfPicture)) {
          _tmpPicture = null;
        } else {
          _tmpPicture = _cursor.getString(_cursorIndexOfPicture);
        }
        final int _tmpIsFavourite;
        _tmpIsFavourite = _cursor.getInt(_cursorIndexOfIsFavourite);
        _item = new DoctorEntity(_tmpId,_tmpName,_tmpDegree,_tmpRate,_tmpPicture,_tmpIsFavourite);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<DoctorEntity> getLikeBooks(final String like) {
    final String _sql = "SELECT * FROM doctors WHERE  name LIKE '%' || ? || '%'  OR degree LIKE ? OR rate LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (like == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, like);
    }
    _argIndex = 2;
    if (like == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, like);
    }
    _argIndex = 3;
    if (like == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, like);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDegree = CursorUtil.getColumnIndexOrThrow(_cursor, "degree");
      final int _cursorIndexOfRate = CursorUtil.getColumnIndexOrThrow(_cursor, "rate");
      final int _cursorIndexOfPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "picture");
      final int _cursorIndexOfIsFavourite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavourite");
      final List<DoctorEntity> _result = new ArrayList<DoctorEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DoctorEntity _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpDegree;
        if (_cursor.isNull(_cursorIndexOfDegree)) {
          _tmpDegree = null;
        } else {
          _tmpDegree = _cursor.getString(_cursorIndexOfDegree);
        }
        final String _tmpRate;
        if (_cursor.isNull(_cursorIndexOfRate)) {
          _tmpRate = null;
        } else {
          _tmpRate = _cursor.getString(_cursorIndexOfRate);
        }
        final String _tmpPicture;
        if (_cursor.isNull(_cursorIndexOfPicture)) {
          _tmpPicture = null;
        } else {
          _tmpPicture = _cursor.getString(_cursorIndexOfPicture);
        }
        final int _tmpIsFavourite;
        _tmpIsFavourite = _cursor.getInt(_cursorIndexOfIsFavourite);
        _item = new DoctorEntity(_tmpId,_tmpName,_tmpDegree,_tmpRate,_tmpPicture,_tmpIsFavourite);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
