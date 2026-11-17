package X;

import com.facebook.payments.dcp.xapp.billingclient.impl.auto.AutoConnectionManager;
import com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.79Y, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C79Y {
    public boolean A00;
    public volatile DcpRetriableBillingClient A03;
    public final /* synthetic */ AutoConnectionManager A04;
    public final HzR<C79W> A02 = new GCV(Integer.MAX_VALUE, new C07338im(5));
    public final AtomicReference<InterfaceC10560Hsz<InterfaceC10512HoG>> A01 = new AtomicReference<>(null);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(X.C79W r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A00     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L12
            X.HzR<X.79W> r0 = r2.A02     // Catch: java.lang.Throwable -> L15
            java.lang.Object r0 = r0.AhZ(r3)     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0 instanceof X.C2zT     // Catch: java.lang.Throwable -> L15
            r1 = r0 ^ 1
            r0 = 1
            if (r1 != 0) goto L13
        L12:
            r0 = 0
        L13:
            monitor-exit(r2)
            return r0
        L15:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79Y.A00(X.79W):boolean");
    }

    public C79Y(AutoConnectionManager autoConnectionManager) {
        this.A04 = autoConnectionManager;
        this.A03 = autoConnectionManager.A02.invoke();
    }
}
