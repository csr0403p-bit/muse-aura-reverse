package X;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes5.dex */
public final class DDW extends SQLiteOpenHelper implements DDP {
    public static final Object A00 = C3cG.A0T();
    public static volatile DDW A01;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        C7384Etj.A0Y(sQLiteDatabase, 0);
        sQLiteDatabase.execSQL("CREATE TABLE video_cache_entries (videoId TEXT NOT NULL, cacheKey TEXT NOT NULL, filePath TEXT NOT NULL, PRIMARY KEY (videoId, cacheKey, filePath))");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        C7384Etj.A0Y(sQLiteDatabase, 0);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS video_cache_entries");
        sQLiteDatabase.execSQL("CREATE TABLE video_cache_entries (videoId TEXT NOT NULL, cacheKey TEXT NOT NULL, filePath TEXT NOT NULL, PRIMARY KEY (videoId, cacheKey, filePath))");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        C7384Etj.A0Y(sQLiteDatabase, 0);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS video_cache_entries");
        sQLiteDatabase.execSQL("CREATE TABLE video_cache_entries (videoId TEXT NOT NULL, cacheKey TEXT NOT NULL, filePath TEXT NOT NULL, PRIMARY KEY (videoId, cacheKey, filePath))");
    }
}
