package androidx.compose.foundation.gestures.snapping;

import X.AOc;
import X.ATK;
import X.AcG;
import X.AnonymousClass005;
import X.C1YA;
import X.C1YC;
import X.C3Q0;
import X.C7384Etj;
import X.C8j3;
import X.HtJ;
import X.InterfaceC05343Un;
import androidx.compose.foundation.gestures.ScrollableKt;

/* loaded from: classes4.dex */
public final class SnapFlingBehavior implements InterfaceC05343Un {
    public ATK A00 = ScrollableKt.A01;
    public final AOc<Float> A01;
    public final C1YC<Float> A02;
    public final C1YA A03;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C3Q0 r6, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r7, X.HtJ r8, X.G0U r9, float r10) {
        /*
            r3 = 11
            boolean r0 = r8 instanceof X.C2312BTm
            if (r0 == 0) goto L48
            r4 = r8
            X.BTm r4 = (X.C2312BTm) r4
            int r0 = r4.$t
            if (r0 != r3) goto L48
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r0 = r4.A02
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r4.A00
            r1 = 1
            if (r2 == 0) goto L32
            if (r2 != r1) goto L4e
            java.lang.Object r9 = r4.A01
            X.G0U r9 = (X.G0U) r9
            X.Hwg.A00(r0)
        L2a:
            java.lang.Float r1 = X.AnonymousClass001.A0l()
            r9.invoke(r1)
            return r0
        L32:
            X.Hwg.A00(r0)
            X.ATK r0 = r7.A00
            r8 = 0
            X.BUG r5 = new X.BUG
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A01 = r9
            r4.A00 = r1
            java.lang.Object r0 = X.GAo.A00(r4, r0, r5)
            if (r0 != r3) goto L2a
            return r3
        L48:
            X.BTm r4 = new X.BTm
            r4.<init>(r7, r8, r3)
            goto L18
        L4e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.A00(X.3Q0, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, X.HtJ, X.G0U, float):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.C3Q0 r8, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r9, X.HtJ r10, X.G0U r11, float r12, float r13) {
        /*
            r3 = 13
            boolean r0 = r10 instanceof X.C2310BTk
            if (r0 == 0) goto L6f
            r7 = r10
            X.BTk r7 = (X.C2310BTk) r7
            int r0 = r7.$t
            if (r0 != r3) goto L6f
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6f
            int r2 = r2 - r1
            r7.A00 = r2
        L18:
            java.lang.Object r3 = r7.A01
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r7.A00
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L75
            X.Hwg.A00(r3)
        L26:
            X.ATf r3 = (X.C1058ATf) r3
            X.AT7<T, V extends X.AOd> r2 = r3.A00
            return r2
        L2b:
            X.Hwg.A00(r3)
            float r4 = java.lang.Math.abs(r12)
            r3 = 0
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 == 0) goto L7a
            float r0 = java.lang.Math.abs(r13)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L7a
            r7.A00 = r1
            X.1YC<java.lang.Float> r1 = r9.A02
            float r0 = X.AbstractC1053ATa.A00(r1, r3, r13)
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L67
            X.AcD r3 = new X.AcD
            r3.<init>(r1)
        L54:
            X.Ac9 r3 = (X.Ac9) r3
            java.lang.Float r5 = X.C8j3.A0u(r12)
            java.lang.Float r6 = X.C8j3.A0u(r13)
            r4 = r8
            r8 = r11
            java.lang.Object r3 = r3.A4g(r4, r5, r6, r7, r8)
            if (r3 != r2) goto L26
            return r2
        L67:
            X.AOc<java.lang.Float> r0 = r9.A01
            X.AcE r3 = new X.AcE
            r3.<init>(r0)
            goto L54
        L6f:
            X.BTk r7 = new X.BTk
            r7.<init>(r9, r10, r3)
            goto L18
        L75:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L7a:
            X.AT7 r2 = X.ATB.A00(r12, r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.A01(X.3Q0, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, X.HtJ, X.G0U, float, float):java.lang.Object");
    }

    @Override // X.BLD
    public final /* synthetic */ Object AXo(C3Q0 c3q0, HtJ htJ, float f) {
        return AXp(c3q0, htJ, AcG.A00, f);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/3Q0;FLX/G0U<-Ljava/lang/Float;Lkotlin/Unit;>;LX/HtJ<-Ljava/lang/Float;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // X.InterfaceC05343Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AXp(X.C3Q0 r6, X.HtJ r7, X.G0U r8, float r9) {
        /*
            r5 = this;
            r3 = 12
            boolean r0 = r7 instanceof X.C2310BTk
            if (r0 == 0) goto L4a
            r4 = r7
            X.BTk r4 = (X.C2310BTk) r4
            int r0 = r4.$t
            if (r0 != r3) goto L4a
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r3 = r4.A01
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L3e
            if (r1 != r0) goto L50
            X.Hwg.A00(r3)
        L26:
            X.ATf r3 = (X.C1058ATf) r3
            T r0 = r3.A01
            float r0 = X.AnonymousClass001.A02(r0)
            X.AT7<T, V extends X.AOd> r2 = r3.A00
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L39
            float r1 = X.AT7.A00(r2)
        L39:
            java.lang.Float r2 = X.C8j3.A0u(r1)
            return r2
        L3e:
            X.Hwg.A00(r3)
            r4.A00 = r0
            java.lang.Object r3 = A00(r6, r5, r4, r8, r9)
            if (r3 != r2) goto L26
            return r2
        L4a:
            X.BTk r4 = new X.BTk
            r4.<init>(r5, r7, r3)
            goto L18
        L50:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.AXp(X.3Q0, X.HtJ, X.G0U, float):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
        if (snapFlingBehavior.A01.equals(this.A01) && C7384Etj.areEqual(snapFlingBehavior.A02, this.A02)) {
            return C8j3.A1W(snapFlingBehavior.A03, this.A03, false);
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A03, AnonymousClass005.A0F(this.A02, AnonymousClass005.A0E(this.A01)));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/1YA;LX/1YC<Ljava/lang/Float;>;LX/AOc<Ljava/lang/Float;>;)V */
    public SnapFlingBehavior(AOc aOc, C1YC c1yc, C1YA c1ya) {
        this.A03 = c1ya;
        this.A02 = c1yc;
        this.A01 = aOc;
    }
}
