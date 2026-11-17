package X;

import android.database.SQLException;

/* loaded from: classes5.dex */
public final class EMH extends AbstractC6554EEq {
    public static final EMH A00 = new EMH();

    @Override // X.AbstractC6554EEq
    public final void migrate(EI3 ei3) throws SQLException {
        C7384Etj.A0Y(ei3, 0);
        ((EHO) ei3).A00.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }

    public EMH() {
        super(11, 12);
    }
}
