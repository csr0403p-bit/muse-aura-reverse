package androidx.wear.remote.interactions;

import X.C3010Brs;
import X.C7384Etj;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes5.dex */
public final class RemoteActivityHelper$RemoteIntentResultReceiver extends ResultReceiver {
    public int A00;
    public int A01;
    public final C3010Brs<Void> A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteActivityHelper$RemoteIntentResultReceiver(C3010Brs<Void> c3010Brs, int i) {
        super(null);
        C7384Etj.A0Y(c3010Brs, 0);
        this.A02 = c3010Brs;
        this.A01 = i;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        int i2 = this.A01 - 1;
        this.A01 = i2;
        if (i != 0) {
            this.A00++;
        }
        if (i2 <= 0) {
            int i3 = this.A00;
            C3010Brs<Void> c3010Brs = this.A02;
            if (i3 == 0) {
                c3010Brs.A03(null);
            } else {
                c3010Brs.A04(new RemoteActivityHelper$RemoteIntentException("There was an error while starting remote activity."));
            }
        }
    }
}
