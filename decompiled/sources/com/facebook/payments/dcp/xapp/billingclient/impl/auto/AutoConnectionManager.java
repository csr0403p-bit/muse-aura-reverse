package com.facebook.payments.dcp.xapp.billingclient.impl.auto;

import X.C07298ii;
import X.C07358io;
import X.C78U;
import X.C79Y;
import com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AutoConnectionManager {
    public final C79Y A00;
    public final C78U A01;
    public final Function0<DcpRetriableBillingClient> A02;

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C79Y r10, com.facebook.payments.dcp.xapp.billingclient.impl.auto.AutoConnectionManager r11, X.HtJ r12, boolean r13) throws java.lang.Throwable {
        /*
            r6 = r10
            r4 = 0
            boolean r0 = r12 instanceof X.C8iT
            if (r0 == 0) goto L2b
            r3 = r12
            X.8iT r3 = (X.C8iT) r3
            int r0 = r3.$t
            if (r0 != r4) goto L2b
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r3.A00 = r2
        L18:
            java.lang.Object r1 = r3.A03
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r3.A00
            r2 = 1
            r8 = 0
            if (r0 == 0) goto L3a
            if (r0 != r2) goto L35
            java.lang.Object r9 = r3.A02
            java.lang.Object r6 = r3.A01
            X.79Y r6 = (X.C79Y) r6
            goto L31
        L2b:
            X.8iT r3 = new X.8iT
            r3.<init>(r11, r12, r4)
            goto L18
        L31:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L8b
            goto L7f
        L35:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        L3a:
            X.Hwg.A00(r1)
            monitor-enter(r6)
            boolean r0 = r10.A00     // Catch: java.lang.Throwable -> L9a
            if (r0 != 0) goto L92
            com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient r0 = r10.A03     // Catch: java.lang.Throwable -> L9a
            X.HuC r0 = r0.A02     // Catch: java.lang.Throwable -> L9a
            boolean r0 = r0.isReady()     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L50
            X.HoG r0 = X.C9732Gel.A03     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r6)
            return r0
        L50:
            java.util.concurrent.atomic.AtomicReference<X.Hsz<X.HoG>> r0 = r10.A01     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r9 = r0.get()     // Catch: java.lang.Throwable -> L9a
            X.Hsz r9 = (X.InterfaceC10560Hsz) r9     // Catch: java.lang.Throwable -> L9a
            r10 = r13
            if (r9 != 0) goto L6f
            X.GAt r9 = new X.GAt     // Catch: java.lang.Throwable -> L9a
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L9a
            r0.set(r9)     // Catch: java.lang.Throwable -> L9a
            com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient r7 = r6.A03     // Catch: java.lang.Throwable -> L9a
            X.78U r0 = r11.A01     // Catch: java.lang.Throwable -> L9a
            X.8ij r5 = new X.8ij     // Catch: java.lang.Throwable -> L9a
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L9a
            r0.A02(r5)     // Catch: java.lang.Throwable -> L9a
        L6f:
            monitor-exit(r6)
            r3.A01 = r6     // Catch: java.lang.Throwable -> L89
            r3.A02 = r9     // Catch: java.lang.Throwable -> L89
            r3.A04 = r13     // Catch: java.lang.Throwable -> L89
            r3.A00 = r2     // Catch: java.lang.Throwable -> L89
            java.lang.Object r1 = X.C3cG.A0W(r9, r3)     // Catch: java.lang.Throwable -> L89
            if (r1 != r4) goto L7f
            return r4
        L7f:
            X.HoG r1 = (X.InterfaceC10512HoG) r1     // Catch: java.lang.Throwable -> L87
            java.util.concurrent.atomic.AtomicReference<X.Hsz<X.HoG>> r0 = r6.A01
            X.Bs8.A00(r9, r8, r0)
            return r1
        L87:
            r1 = move-exception
            goto L8c
        L89:
            r1 = move-exception
            goto L8c
        L8b:
            r1 = move-exception
        L8c:
            java.util.concurrent.atomic.AtomicReference<X.Hsz<X.HoG>> r0 = r6.A01
            X.Bs8.A00(r9, r8, r0)
            throw r1
        L92:
            java.lang.String r1 = "Billing client generation closed"
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L9a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9a
            throw r0     // Catch: java.lang.Throwable -> L9a
        L9a:
            r1 = move-exception
            monitor-exit(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.billingclient.impl.auto.AutoConnectionManager.A00(X.79Y, com.facebook.payments.dcp.xapp.billingclient.impl.auto.AutoConnectionManager, X.HtJ, boolean):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Lcom/facebook/payments/dcp/xapp/billingclient/impl/retriablev2/DcpRetriableBillingClient;>;LX/78U;)V */
    public AutoConnectionManager(C78U c78u, Function0 function0) {
        this.A02 = function0;
        this.A01 = c78u;
        C79Y c79y = new C79Y(this);
        this.A00 = c79y;
        this.A01.A02(new C07298ii(this, c79y, null, 12));
        c78u.A03(new C07358io(this, 4));
    }
}
