package androidx.compose.ui.platform;

import X.AGO;
import X.AKH;

/* loaded from: classes4.dex */
public abstract class PlatformTextInputModifierNodeKt {
    public static final AKH A00 = AGO.A00(47);

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC10460Hji A00(X.InterfaceC1464AjX r6, X.HtJ r7, X.G0V r8) {
        /*
            r3 = 4
            boolean r0 = r7 instanceof X.C2309BTj
            if (r0 == 0) goto L2a
            r5 = r7
            X.BTj r5 = (X.C2309BTj) r5
            int r0 = r5.$t
            if (r0 != r3) goto L2a
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r4 = r5.A01
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r5.A00
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L38
            if (r2 == r0) goto L44
            if (r2 == r1) goto L30
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2a:
            X.BTj r5 = new X.BTj
            r5.<init>(r3, r7)
            goto L17
        L30:
            X.Hwg.A00(r4)
            kotlin.KotlinNothingValueException r0 = X.C3cG.A0p()
            throw r0
        L38:
            X.Hwg.A00(r4)
            r5.A00 = r0
            X.Hji r0 = r6.Ago(r5, r8)
            if (r0 != r3) goto L47
            return r3
        L44:
            X.Hwg.A00(r4)
        L47:
            kotlin.KotlinNothingValueException r0 = X.C3cG.A0p()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.A00(X.AjX, X.HtJ, X.G0V):X.Hji");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC10460Hji A01(X.InterfaceC1738Apb r6, X.HtJ r7, X.G0V r8) {
        /*
            r3 = 3
            boolean r0 = r7 instanceof X.C2309BTj
            if (r0 == 0) goto L27
            r5 = r7
            X.BTj r5 = (X.C2309BTj) r5
            int r0 = r5.$t
            if (r0 != r3) goto L27
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r1 = r5.A01
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 == r3) goto L53
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L27:
            X.BTj r5 = new X.BTj
            r5.<init>(r3, r7)
            goto L17
        L2d:
            X.Hwg.A00(r1)
            r0 = r6
            X.Aj8 r0 = (X.AbstractC1439Aj8) r0
            X.Aj8 r0 = r0.node
            boolean r0 = r0.isAttached
            if (r0 == 0) goto L5b
            X.AjX r2 = X.AbstractC1414Aij.A07(r6)
            X.AjM r0 = X.AbstractC1414Aij.A04(r6)
            X.Ajz r1 = r0.A04
            X.AKH r0 = androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.A00
            X.AJu r1 = (X.C0967AJu) r1
            X.AKO.A08(r0, r1)
            r5.A00 = r3
            X.Hji r0 = A00(r2, r5, r8)
            if (r0 != r4) goto L56
            return r4
        L53:
            X.Hwg.A00(r1)
        L56:
            kotlin.KotlinNothingValueException r0 = X.C3cG.A0p()
            throw r0
        L5b:
            java.lang.String r0 = "establishTextInputSession called from an unattached node"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.A01(X.Apb, X.HtJ, X.G0V):X.Hji");
    }
}
