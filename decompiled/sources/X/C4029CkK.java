package X;

import com.facebook.aura.network.AuraUserAgent;
import com.facebook.aura.network.crudonet.AuraCrudoNet$requestFactory$2;

/* renamed from: X.CkK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4029CkK implements InterfaceC4037Ckd {
    public final AuraCrudoNet$requestFactory$2.AnonymousClass1 A00;

    @Override // X.InterfaceC4037Ckd
    public final void AR3(CYD cyd) {
        String value = AuraUserAgent.fullUserAgent.getValue();
        if (value != null) {
            cyd.A00("User-Agent", value);
        }
    }

    public C4029CkK(AuraCrudoNet$requestFactory$2.AnonymousClass1 anonymousClass1) {
        this.A00 = anonymousClass1;
    }
}
