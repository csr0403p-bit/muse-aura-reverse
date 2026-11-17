package X;

import android.content.Context;
import android.content.Intent;
import android.os.ConditionVariable;
import com.facebook.pushlite.common.GetTokenException;
import com.facebook.pushlite.common.RetryableGetTokenException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class F1M implements InterfaceC7409Eus {
    public final long A00;
    public final C7551F2w A01;

    public F1M(Context context, F18<String> f18) {
        C7551F2w c7551F2w = new C7551F2w(context, (F3X) AbstractC7556F3o.A00, f18.AMN());
        this.A01 = c7551F2w;
        String str = c7551F2w.A02;
        if (str != null) {
            F3I.A00(C60P.A03("Orca.START"), c7551F2w.A00, str);
        }
        this.A00 = TimeUnit.SECONDS.toMillis(5L);
    }

    @Override // X.InterfaceC7409Eus
    public final void ABo() {
        C7551F2w c7551F2w = this.A01;
        String str = c7551F2w.A02;
        if (str != null) {
            Intent intentA03 = C60P.A03("com.facebook.rti.fbns.intent.UNREGISTER");
            Context context = c7551F2w.A00;
            intentA03.putExtra("pkg_name", context.getPackageName());
            F3I.A00(intentA03, context, str);
        }
    }

    @Override // X.InterfaceC7409Eus
    public final int AJT() {
        return 3;
    }

    @Override // X.InterfaceC7409Eus
    public final String ALj() throws GetTokenException {
        C7551F2w c7551F2w = this.A01;
        if (!(c7551F2w.A02 != null)) {
            throw new GetTokenException("FBNS is not available");
        }
        try {
            C7479ExV c7479ExVA00 = C7479ExV.A00();
            long j = this.A00;
            AtomicBoolean atomicBoolean = c7479ExVA00.A04;
            String str = null;
            if (BV4.A1V(atomicBoolean)) {
                try {
                    c7479ExVA00.A00 = null;
                    ConditionVariable conditionVariable = c7479ExVA00.A03;
                    conditionVariable.close();
                    c7479ExVA00.A02 = null;
                    c7479ExVA00.A01 = null;
                    c7551F2w.A00();
                    if (!conditionVariable.block(j)) {
                        CFK.A04("FbnsRegistrationTracker", "FBNS register timeout");
                        throw new TimeoutException("FBNS register timeout");
                    }
                    String str2 = c7479ExVA00.A01;
                    if (str2 != null) {
                        CFK.A0F("FbnsRegistrationTracker", "Failed to get FBNS token due to error: %s", str2);
                    }
                    str = c7479ExVA00.A02;
                    atomicBoolean.set(false);
                } catch (Throwable th) {
                    atomicBoolean.set(false);
                    throw th;
                }
            }
            if (str != null) {
                return str;
            }
            throw new RetryableGetTokenException("Token from FBNS is null");
        } catch (TimeoutException e) {
            throw new RetryableGetTokenException("Timeout on FBNS register", e);
        }
    }

    @Override // X.InterfaceC7409Eus
    public final String getName() {
        return "FBNS";
    }

    @Override // X.InterfaceC7409Eus
    public final boolean isAvailable() {
        return this.A01.A02 != null;
    }

    @Override // X.InterfaceC7409Eus
    public final void ALk(CTK ctk) {
        C7479ExV c7479ExVA00 = C7479ExV.A00();
        C7551F2w c7551F2w = this.A01;
        c7479ExVA00.A00 = ctk;
        c7551F2w.A00();
    }
}
