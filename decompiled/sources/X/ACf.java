package X;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes4.dex */
public final class ACf extends SQLiteOpenHelper {
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (sQLiteDatabase == null) {
            throw C3cG.A0Q("db provided to onCreate was null");
        }
        sQLiteDatabase.execSQL("CREATE TABLE secrets (\n  id TEXT NOT NULL,\n  key_name TEXT NOT NULL,\n  algorithm TEXT NOT NULL,\n  secret_value TEXT NOT NULL,\n  updated_at INTEGER NOT NULL\n);");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX idx_secrets_id\n  ON secrets(id);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
