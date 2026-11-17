package com.meta.health.healthconnect;

import X.AbstractC9266GBt;
import X.AnonymousClass001;
import X.BV4;
import X.Bs8;
import X.C05563uZ;
import X.C10533Hqc;
import X.C20Q;
import X.C3UX;
import X.C60O;
import X.C6ys;
import X.C7384Etj;
import X.C78W;
import X.C79;
import X.C8964Fuh;
import X.C8969FvH;
import X.C8eO;
import X.C9uG;
import X.G0U;
import X.GBK;
import X.GCV;
import X.HlU;
import X.Hlo;
import X.HoC;
import X.HzC;
import X.HzR;
import X.InterfaceC8971FvL;
import X.InterfaceC9011Fwo;
import X.InterfaceC9037FxJ;
import com.meta.health.core.ObserverAnchorManager;
import com.meta.health.core.ObserverBuffer;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class HealthConnectObserverImpl implements InterfaceC8971FvL {
    public final InterfaceC9037FxJ A00;
    public final Hlo A01;
    public final ObserverAnchorManager A02;
    public final ObserverBuffer A03;
    public final Set<C9uG<? extends InterfaceC9011Fwo>> A04;
    public final G0U<InterfaceC9011Fwo, List<C8964Fuh>> A05;
    public final C20Q<C8969FvH> A06;
    public final AtomicReference<HoC> A07;
    public final C3UX A08;
    public final HzR<C8969FvH> A09;

    public HealthConnectObserverImpl(InterfaceC9037FxJ interfaceC9037FxJ, Hlo hlo, ObserverAnchorManager observerAnchorManager, Set set, G0U g0u) {
        C7384Etj.A0Y(interfaceC9037FxJ, 0);
        this.A00 = interfaceC9037FxJ;
        this.A04 = set;
        this.A02 = observerAnchorManager;
        this.A01 = hlo;
        this.A05 = g0u;
        GBK gbk = AbstractC9266GBt.A00;
        HzC hzCA05 = C78W.A05(HlU.A01, new C8eO(null));
        this.A08 = hzCA05;
        Integer num = C79.A00;
        GCV gcv = new GCV(Integer.MAX_VALUE, null);
        this.A09 = gcv;
        this.A07 = BV4.A16(null);
        this.A06 = new C05563uZ(num, C6ys.A00, gcv, -3, true);
        this.A03 = new ObserverBuffer(observerAnchorManager, hzCA05, gcv);
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public final void A00() {
        if (this.A04.isEmpty()) {
            throw C60O.A0i("Cannot start polling with an empty recordTypes set \u2014 no Health Connect record types resolved from the requested metric types");
        }
        C10533Hqc c10533HqcA11 = AnonymousClass001.A11(new HealthConnectObserverImpl$startPolling$job$1(this, null), this.A08);
        if (Bs8.A00(null, c10533HqcA11, this.A07)) {
            return;
        }
        c10533HqcA11.A5w(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    @Override // X.InterfaceC8971FvL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AgQ(X.HtJ<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            r3 = 11
            boolean r0 = r7 instanceof X.C8914FtW
            if (r0 == 0) goto L4a
            r5 = r7
            X.FtW r5 = (X.C8914FtW) r5
            int r0 = r5.$t
            if (r0 != r3) goto L4a
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r5.A00 = r2
        L18:
            java.lang.Object r4 = r5.A01
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L34
            if (r0 != r2) goto L50
            X.Hwg.A00(r4)
        L27:
            X.3UX r0 = r6.A08
            X.Hxb.A03(r1, r0)
            X.HzR<X.FvH> r0 = r6.A09
            r0.A6R(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L34:
            X.Hwg.A00(r4)
            java.util.concurrent.atomic.AtomicReference<X.HoC> r0 = r6.A07
            java.lang.Object r0 = r0.getAndSet(r1)
            X.HoC r0 = (X.HoC) r0
            if (r0 == 0) goto L27
            r5.A00 = r2
            java.lang.Object r0 = X.HzS.A00(r5, r0)
            if (r0 != r3) goto L27
            return r3
        L4a:
            X.FtW r5 = new X.FtW
            r5.<init>(r6, r7, r3)
            goto L18
        L50:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.healthconnect.HealthConnectObserverImpl.AgQ(X.HtJ):java.lang.Object");
    }
}
