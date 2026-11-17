package com.facebook.payments.dcp.xapp.billingclient.impl.auto;

import X.C07228ib;
import X.C07248id;
import X.C07268if;
import X.C07338im;
import X.C07358io;
import X.C3cG;
import X.C7384Etj;
import X.C7614F6q;
import X.C78U;
import X.C79W;
import X.C79Y;
import X.C79Z;
import X.C79e;
import X.C9732Gel;
import X.FGI;
import X.FZS;
import X.G0V;
import X.GOz;
import X.Hkg;
import X.HoC;
import X.HpG;
import X.HtJ;
import X.HuC;
import X.Hy6;
import X.HyF;
import X.Hz2;
import X.InterfaceC10512HoG;
import X.InterfaceC9726Gee;
import android.app.Activity;
import androidx.datastore.preferences.core.Preferences;
import com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class DcpAutoBillingClient implements HuC {
    public final AutoConnectionManager A00;
    public final C78U A01;
    public final Set<HoC> A02 = C3cG.A0k();
    public final Function0<DcpRetriableBillingClient> A03;

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.facebook.payments.dcp.xapp.billingclient.impl.auto.DcpAutoBillingClient r6, X.HtJ r7, X.G0U r8, X.G0V r9, boolean r10) {
        /*
            r4 = 1
            boolean r0 = r7 instanceof X.C8iT
            if (r0 == 0) goto Ld
            r0 = r7
            X.8iT r0 = (X.C8iT) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r4) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L2d
            r3 = r7
            X.8iT r3 = (X.C8iT) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r3.A00 = r2
        L1e:
            java.lang.Object r2 = r3.A03
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.A00
            if (r0 == 0) goto L37
            if (r0 != r4) goto L62
            java.lang.Object r8 = r3.A01
            X.G0U r8 = (X.G0U) r8
            goto L33
        L2d:
            X.8iT r3 = new X.8iT
            r3.<init>(r6, r7, r4)
            goto L1e
        L33:
            X.Hwg.A00(r2)     // Catch: java.util.concurrent.CancellationException -> L4f
            return r2
        L37:
            X.Hwg.A00(r2)
            r7 = 0
            X.8il r5 = new X.8il     // Catch: java.util.concurrent.CancellationException -> L4f
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L4f
            r3.A01 = r8     // Catch: java.util.concurrent.CancellationException -> L4f
            r3.A02 = r7     // Catch: java.util.concurrent.CancellationException -> L4f
            r3.A04 = r10     // Catch: java.util.concurrent.CancellationException -> L4f
            r3.A00 = r4     // Catch: java.util.concurrent.CancellationException -> L4f
            java.lang.Object r0 = X.Hxb.A00(r5, r3)     // Catch: java.util.concurrent.CancellationException -> L4f
            if (r0 != r1) goto L61
            return r1
        L4f:
            r1 = move-exception
            X.C3cG.A1H(r3)
            X.78U r0 = r6.A01
            boolean r0 = r0.A06()
            if (r0 == 0) goto L66
            X.HoG r0 = X.C9732Gel.A00
            java.lang.Object r0 = r8.invoke(r0)
        L61:
            return r0
        L62:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
        L66:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.billingclient.impl.auto.DcpAutoBillingClient.A00(com.facebook.payments.dcp.xapp.billingclient.impl.auto.DcpAutoBillingClient, X.HtJ, X.G0U, X.G0V, boolean):java.lang.Object");
    }

    @Override // X.HuC
    public final void ACo(HyF hyF, String str) {
        C7384Etj.A0Y(str, 0);
        AutoConnectionManager autoConnectionManager = this.A00;
        C79W c79w = new C79W(new FZS(hyF, 28), new C7614F6q(str, hyF, 0), false);
        if (autoConnectionManager.A00.A00(c79w)) {
            return;
        }
        c79w.A01.invoke(C9732Gel.A00);
    }

    @Override // X.HuC
    public final Object A2s(Hz2 hz2, HtJ<? super InterfaceC10512HoG> htJ) {
        return A00(this, htJ, new C07338im(7), new C07228ib((HtJ) null, (G0V<? super Preferences, ? super HtJ<? super Preferences>, ? extends Object>) hz2, (HtJ<? super C07228ib>) 21), HpG.A00(hz2.A00));
    }

    @Override // X.HuC
    public final Object A6z(Hz2 hz2, HtJ<? super InterfaceC10512HoG> htJ) {
        return A00(this, htJ, new C07338im(8), new C07228ib((HtJ) null, (G0V<? super Preferences, ? super HtJ<? super Preferences>, ? extends Object>) hz2, (HtJ<? super C07228ib>) 22), HpG.A00(hz2.A00));
    }

    @Override // X.HuC
    public final InterfaceC9726Gee A7h() {
        return this.A00.A00.A03.A02.A7h();
    }

    @Override // X.HuC
    public final void AAa() {
        C79Y c79y = this.A00.A00;
        C79W c79w = new C79W(new C07338im(6), new C79Z(c79y), false);
        if (c79y.A00(c79w)) {
            return;
        }
        c79w.A01.invoke(C9732Gel.A00);
    }

    @Override // X.HuC
    public final String ACn() {
        return FGI.A0M(this.A00.A00.A03.ACn(), "-auto");
    }

    @Override // X.HuC
    public final Integer AIk() {
        return this.A00.A00.A03.A02.AIk();
    }

    @Override // X.HuC
    public final Hy6 AIm() {
        return this.A00.A00.A03.A02.AIm();
    }

    @Override // X.HuC
    public final Object APU(Activity activity, C79e c79e, HtJ<? super InterfaceC10512HoG> htJ) {
        return A00(this, htJ, new C07338im(9), new C07268if((Object) activity, (Activity) c79e, (C79e) null, (HtJ<? super C07268if>) 6), false);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Hkg;ZLX/HtJ<-LX/Hkf;>;)Ljava/lang/Object; */
    @Override // X.HuC
    public final Object AYx(Hkg hkg, HtJ htJ, boolean z) {
        return A00(this, htJ, new C07338im(10), new C07248id(hkg, null, 0, z), z);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GOz;ZLX/HtJ<-LX/HzU;>;)Ljava/lang/Object; */
    @Override // X.HuC
    public final Object AYy(GOz gOz, HtJ htJ, boolean z) {
        return A00(this, htJ, new C07338im(11), new C07248id(gOz, null, 1, z), z);
    }

    @Override // X.HuC
    public final boolean isReady() {
        return true;
    }

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Lcom/facebook/payments/dcp/xapp/billingclient/impl/retriablev2/DcpRetriableBillingClient;>;LX/78U;)V */
    public DcpAutoBillingClient(C78U c78u, Function0 function0) {
        this.A03 = function0;
        this.A01 = c78u;
        this.A00 = new AutoConnectionManager(c78u, function0);
        c78u.A03(new C07358io(this, 5));
    }
}
