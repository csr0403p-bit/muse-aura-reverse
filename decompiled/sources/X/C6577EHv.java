package X;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.util.Iterator;

/* renamed from: X.EHv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6577EHv implements EN5 {
    @Override // X.EN5
    public final void AUq(EI3 ei3) throws SQLException {
        C7384Etj.A0Y(ei3, 0);
        SQLiteDatabase sQLiteDatabase = ((EHO) ei3).A00;
        sQLiteDatabase.execSQL("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", C60O.A0k());
        Object[] objArr = new Object[0];
        if (contentValues.size() == 0) {
            throw C60O.A0i("Empty values");
        }
        int size = contentValues.size();
        Object[] objArr2 = new Object[size];
        StringBuilder sbA0x = C60O.A0x("UPDATE ");
        sbA0x.append(EHO.A03[3]);
        sbA0x.append("WorkSpec");
        sbA0x.append(" SET ");
        Iterator<String> it = contentValues.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            sbA0x.append(i > 0 ? "," : "");
            sbA0x.append(strA0j);
            objArr2[i] = contentValues.get(strA0j);
            sbA0x.append("=?");
            i++;
        }
        for (int i2 = size; i2 < size; i2++) {
            objArr2[i2] = objArr[i2 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sbA0x.append(" WHERE ");
            sbA0x.append("last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement(sbA0x.toString());
        C7384Etj.A0U(sQLiteStatementCompileStatement);
        EI0 ei0 = new EI0(sQLiteStatementCompileStatement);
        EI4.A00(ei0, objArr2);
        ei0.A00.executeUpdateDelete();
    }
}
