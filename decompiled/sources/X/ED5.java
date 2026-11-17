package X;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes5.dex */
public final class ED5 extends AbstractC6555EEr {
    public final ED6 A00;

    @Override // X.AbstractC6555EEr
    public final void onOpen(EI3 ei3) {
        C7384Etj.A0Y(ei3, 0);
        SQLiteDatabase sQLiteDatabase = ((EHO) ei3).A00;
        sQLiteDatabase.beginTransaction();
        try {
            String strA0J = FGI.A0J("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ", System.currentTimeMillis() - 86400000, " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            C7384Etj.A0Y(strA0J, 0);
            sQLiteDatabase.execSQL(strA0J);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public ED5(ED6 ed6) {
        this.A00 = ed6;
    }
}
