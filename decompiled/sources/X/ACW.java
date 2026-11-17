package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.secure.hatchcvm.HatchCVMException;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ACW {
    public final SQLiteDatabase A00;
    public final Function0<Long> A01;

    public final A7L A00(String str) {
        C7384Etj.A0Y(str, 0);
        try {
            Cursor cursorRawQuery = this.A00.rawQuery("SELECT key_name, algorithm, secret_value, updated_at FROM secrets WHERE id=? LIMIT 1", new String[]{str});
            try {
                A7L a7l = null;
                if (cursorRawQuery.moveToFirst()) {
                    String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("key_name"));
                    String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("algorithm"));
                    String string3 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("secret_value"));
                    long j = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("updated_at"));
                    C7384Etj.A0X(string);
                    C7384Etj.A0X(string2);
                    C7384Etj.A0X(string3);
                    a7l = new A7L(new A7M(string, string2, string3), j);
                }
                cursorRawQuery.close();
                return a7l;
            } finally {
            }
        } catch (SQLException e) {
            throw new HatchCVMException("Unable to read secret", e);
        }
    }

    public /* synthetic */ ACW(SQLiteDatabase sQLiteDatabase) {
        BUV buv = new BUV(9);
        this.A00 = sQLiteDatabase;
        this.A01 = buv;
    }

    public final void A01() {
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.A00;
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.delete("secrets", null, null);
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } catch (SQLException e) {
                throw new HatchCVMException("Unable to clear secrets", e);
            }
        } catch (Throwable th) {
            this.A00.endTransaction();
            throw th;
        }
    }

    public final void A02(A7M a7m, String str) {
        C7384Etj.A0Y(str, 0);
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.A00;
                sQLiteDatabase.beginTransaction();
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", str);
                contentValues.put("key_name", "hatchcvm_local_secret_key_after_first_unlock");
                contentValues.put("algorithm", "AES-GCM-256-AAD-V1");
                contentValues.put("secret_value", a7m.A02);
                contentValues.put("updated_at", this.A01.invoke());
                sQLiteDatabase.insertWithOnConflict("secrets", null, contentValues, 5);
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } catch (SQLException e) {
                throw new HatchCVMException("Unable to store secret", e);
            }
        } catch (Throwable th) {
            this.A00.endTransaction();
            throw th;
        }
    }
}
