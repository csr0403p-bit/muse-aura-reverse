package X;

import android.database.SQLException;

/* loaded from: classes5.dex */
public final class EI2 implements EN5 {
    @Override // X.EN5
    public final void AUq(EI3 ei3) throws SQLException {
        C7384Etj.A0Y(ei3, 0);
        ((EHO) ei3).A00.execSQL("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }
}
