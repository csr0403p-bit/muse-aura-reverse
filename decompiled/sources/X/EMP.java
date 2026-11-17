package X;

import android.database.SQLException;

/* loaded from: classes5.dex */
public final class EMP extends AbstractC6554EEq {
    public static final EMP A00 = new EMP();

    @Override // X.AbstractC6554EEq
    public final void migrate(EI3 ei3) throws SQLException {
        C7384Etj.A0Y(ei3, 0);
        ((EHO) ei3).A00.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }

    public EMP() {
        super(8, 9);
    }
}
