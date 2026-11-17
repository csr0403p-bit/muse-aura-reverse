package X;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes5.dex */
public final class EMM extends AbstractC6554EEq {
    public static final EMM A00 = new EMM();

    public EMM() {
        super(4, 5);
    }

    @Override // X.AbstractC6554EEq
    public final void migrate(EI3 ei3) throws SQLException {
        C7384Etj.A0Y(ei3, 0);
        SQLiteDatabase sQLiteDatabase = ((EHO) ei3).A00;
        sQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        sQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
