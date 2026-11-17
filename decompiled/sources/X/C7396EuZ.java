package X;

import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.EuZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7396EuZ extends EKD<C7396EuZ, C7yx> {
    @Override // X.EKD
    public final /* bridge */ /* synthetic */ AbstractC6631ELb A00() {
        EKE eke = this.A00;
        if (eke.A0L) {
            throw C60O.A0i("PeriodicWorkRequests cannot be expedited");
        }
        return new C7yx(eke, this.A02, this.A01);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<+LX/EKa;>;JLjava/util/concurrent/TimeUnit;)V */
    public C7396EuZ(Class cls, TimeUnit timeUnit, long j) {
        super(cls);
        EKE eke = this.A00;
        long millis = timeUnit.toMillis(j);
        if (millis < 900000) {
            EK9.A00();
            Log.w(EKE.A0Q, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        millis = millis < 900000 ? 900000L : millis;
        eke.A06 = millis;
        if (millis < 300000) {
            EK9.A00();
            Log.w(EKE.A0Q, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (millis > eke.A06) {
            EK9.A00();
            Log.w(EKE.A0Q, FGI.A0B(millis, "Flex duration greater than interval duration; Changed to "));
        }
        eke.A04 = ATD.A07(millis, 300000L, eke.A06);
    }
}
