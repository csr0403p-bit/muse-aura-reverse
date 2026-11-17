package X;

import android.content.Context;
import com.facebook.pushlite.common.GetTokenException;
import com.facebook.pushlite.common.RetryableGetTokenException;
import com.google.firebase.iid.FirebaseInstanceId;

/* loaded from: classes5.dex */
public final class CTJ implements InterfaceC7409Eus {
    public final Context A00;

    public CTJ(Context context) {
        C7384Etj.A0Y(context, 0);
        this.A00 = context;
    }

    @Override // X.InterfaceC7409Eus
    public final void ABo() {
    }

    @Override // X.InterfaceC7409Eus
    public final String getName() {
        return "FCM";
    }

    @Override // X.InterfaceC7409Eus
    public final boolean isAvailable() {
        return AnonymousClass002.A1M(C4001CjU.A00.A01(this.A00, 12451000));
    }

    @Override // X.InterfaceC7409Eus
    public final int AJT() {
        return Integer.MAX_VALUE;
    }

    @Override // X.InterfaceC7409Eus
    public final String ALj() throws GetTokenException {
        try {
            FirebaseInstanceId firebaseInstanceId = FirebaseInstanceId.getInstance(C3554CTr.A00());
            CT2 ct2A00 = FirebaseInstanceId.A00(CSi.A01(firebaseInstanceId.A02));
            if (firebaseInstanceId.A07(ct2A00)) {
                FirebaseInstanceId.A03(firebaseInstanceId);
            }
            String str = ct2A00 == null ? null : ct2A00.A01;
            if (str != null) {
                return str;
            }
            throw new RetryableGetTokenException("Token from FCM is null");
        } catch (IllegalStateException e) {
            throw new GetTokenException("Unable to get token from FCM", e);
        }
    }

    @Override // X.InterfaceC7409Eus
    public final void ALk(CTK ctk) {
        try {
            ctk.A00(ALj());
        } catch (GetTokenException e) {
            ctk.A00.A03.A01(ctk.A01, e.toString(), e instanceof RetryableGetTokenException);
        }
    }
}
