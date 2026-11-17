package X;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes5.dex */
public final class EMI extends AbstractC6554EEq {
    public static final EMI A00 = new EMI();

    @Override // X.AbstractC6554EEq
    public final void migrate(EI3 ei3) throws SQLException {
        C7384Etj.A0Y(ei3, 0);
        SQLiteDatabase sQLiteDatabase = ((EHO) ei3).A00;
        sQLiteDatabase.execSQL("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        sQLiteDatabase.execSQL("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }

    public EMI() {
        super(12, 13);
    }
}
