package androidx.compose.foundation.gestures;

import X.AXN;
import X.C1247Afe;
import X.C1251Afj;
import X.C1272AgI;
import X.C1299Agk;
import X.G0V;
import X.HtJ;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class NonTouchScrollingLogic {
    public AXN A00;
    public boolean A01;
    public final C1272AgI A02 = new C1272AgI();
    public final ScrollingLogic A03;
    public final G0V<C1251Afj, HtJ<? super Unit>, Object> A04;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(X.G0V<? super X.InterfaceC1258Afu, ? super X.HtJ<? super kotlin.Unit>, ? extends java.lang.Object> r6, X.HtJ<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            r3 = 4
            boolean r0 = r7 instanceof X.C2310BTk
            if (r0 == 0) goto L40
            r4 = r7
            X.BTk r4 = (X.C2310BTk) r4
            int r0 = r4.$t
            if (r0 != r3) goto L40
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r1 = r4.A01
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 != r2) goto L46
            X.Hwg.A00(r1)
        L25:
            r0 = 0
            r5.A01 = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2b:
            X.Hwg.A00(r1)
            r5.A01 = r2
            r1 = 0
            r0 = 15
            X.BU6 r0 = X.BU6.A0M(r5, r6, r1, r0)
            r4.A00 = r2
            java.lang.Object r0 = X.AbstractC10627Hzt.A00(r0, r4)
            if (r0 != r3) goto L25
            return r3
        L40:
            X.BTk r4 = new X.BTk
            r4.<init>(r5, r7, r3)
            goto L17
        L46:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.NonTouchScrollingLogic.A06(X.G0V, X.HtJ):java.lang.Object");
    }

    public static final void A05(C1247Afe c1247Afe) {
        List<C1299Agk> list = c1247Afe.A05;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1299Agk.A00(list, i);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/gestures/ScrollingLogic;LX/G0V<-LX/Afj;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/AXN;)V */
    public NonTouchScrollingLogic(ScrollingLogic scrollingLogic, AXN axn, G0V g0v) {
        this.A03 = scrollingLogic;
        this.A04 = g0v;
        this.A00 = axn;
    }
}
