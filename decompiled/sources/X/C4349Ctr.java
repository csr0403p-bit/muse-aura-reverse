package X;

import android.credentials.PrepareGetCredentialResponse;
import android.os.Build;

/* renamed from: X.Ctr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4349Ctr {
    public final PrepareGetCredentialResponse.PendingGetCredentialHandle A00;

    public C4349Ctr(PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle) {
        this.A00 = pendingGetCredentialHandle;
        if (Build.VERSION.SDK_INT >= 34) {
            C7384Etj.A0X(pendingGetCredentialHandle);
        }
    }
}
