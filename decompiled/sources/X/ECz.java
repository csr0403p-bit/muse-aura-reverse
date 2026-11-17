package X;

import android.content.Context;
import android.database.SQLException;

/* loaded from: classes5.dex */
public final class ECz extends AbstractC6554EEq {
    public final Context A00;

    @Override // X.AbstractC6554EEq
    public final void migrate(EI3 ei3) throws SQLException {
        C7384Etj.A0Y(ei3, 0);
        if (this.endVersion < 10) {
            this.A00.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        } else {
            ((EHO) ei3).A00.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", BV5.A1a("reschedule_needed", 1));
        }
    }

    public ECz(Context context, int i, int i2) {
        super(i, i2);
        this.A00 = context;
    }
}
