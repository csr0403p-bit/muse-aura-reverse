package X;

import android.database.SQLException;

/* loaded from: classes5.dex */
public final class EML extends AbstractC6554EEq {
    public static final EML A00 = new EML();

    public EML() {
        super(3, 4);
    }

    @Override // X.AbstractC6554EEq
    public final void migrate(EI3 ei3) throws SQLException {
        C7384Etj.A0Y(ei3, 0);
        ((EHO) ei3).A00.execSQL("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
