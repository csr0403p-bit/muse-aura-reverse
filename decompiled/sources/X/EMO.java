package X;

import android.database.SQLException;

/* loaded from: classes5.dex */
public final class EMO extends AbstractC6554EEq {
    public static final EMO A00 = new EMO();

    public EMO() {
        super(7, 8);
    }

    @Override // X.AbstractC6554EEq
    public final void migrate(EI3 ei3) throws SQLException {
        C7384Etj.A0Y(ei3, 0);
        ((EHO) ei3).A00.execSQL("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
