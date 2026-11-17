package androidx.compose.foundation;

import X.ASE;
import X.AbstractC1439Aj8;
import X.AnonymousClass003;
import X.BU2;
import X.C04901Xt;
import X.C1247Afe;
import X.C2Uv;
import X.C3UX;
import X.C8j3;
import X.EnumC1080AXj;
import X.InterfaceC1072AWd;
import X.InterfaceC1348AhZ;

/* loaded from: classes4.dex */
public final class HoverableNode extends AbstractC1439Aj8 implements InterfaceC1348AhZ {
    public InterfaceC1072AWd A00;
    public C04901Xt A01;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(androidx.compose.foundation.HoverableNode r6, X.HtJ r7) {
        /*
            r3 = 2
            boolean r0 = r7 instanceof X.C2312BTm
            if (r0 == 0) goto L47
            r5 = r7
            X.BTm r5 = (X.C2312BTm) r5
            int r0 = r5.$t
            if (r0 != r3) goto L47
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r4 = r5.A02
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L4d
            java.lang.Object r1 = r5.A01
            X.1Xt r1 = (X.C04901Xt) r1
            X.Hwg.A00(r4)
        L29:
            r6.A01 = r1
        L2b:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L2e:
            X.Hwg.A00(r4)
            X.1Xt r0 = r6.A01
            if (r0 != 0) goto L2b
            X.1Xt r1 = new X.1Xt
            r1.<init>()
            X.AWd r0 = r6.A00
            r5.A01 = r1
            r5.A00 = r2
            java.lang.Object r0 = r0.A9u(r1, r5)
            if (r0 != r3) goto L29
            return r3
        L47:
            X.BTm r5 = new X.BTm
            r5.<init>(r6, r7, r3)
            goto L17
        L4d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.A00(androidx.compose.foundation.HoverableNode, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(androidx.compose.foundation.HoverableNode r5, X.HtJ r6) {
        /*
            r4 = 1
            boolean r0 = r6 instanceof X.C2310BTk
            if (r0 == 0) goto L41
            r3 = r6
            X.BTk r3 = (X.C2310BTk) r3
            int r0 = r3.$t
            if (r0 != r4) goto L41
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r3.A00 = r2
        L17:
            java.lang.Object r1 = r3.A01
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.A00
            if (r0 == 0) goto L2a
            if (r0 != r4) goto L47
            X.Hwg.A00(r1)
        L24:
            r0 = 0
            r5.A01 = r0
        L27:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L2a:
            X.Hwg.A00(r1)
            X.1Xt r0 = r5.A01
            if (r0 == 0) goto L27
            X.ASE r1 = new X.ASE
            r1.<init>(r0)
            X.AWd r0 = r5.A00
            r3.A00 = r4
            java.lang.Object r0 = r0.A9u(r1, r3)
            if (r0 != r2) goto L24
            return r2
        L41:
            X.BTk r3 = new X.BTk
            r3.<init>(r5, r6, r4)
            goto L17
        L47:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.A01(androidx.compose.foundation.HoverableNode, X.HtJ):java.lang.Object");
    }

    public static final void A02(HoverableNode hoverableNode) {
        C04901Xt c04901Xt = hoverableNode.A01;
        if (c04901Xt != null) {
            C8j3.A1J(hoverableNode.A00, new ASE(c04901Xt));
            hoverableNode.A01 = null;
        }
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public final /* synthetic */ long mo12getTouchBoundsExpansionRZrCHBk() {
        return C2Uv.A00;
    }

    @Override // X.InterfaceC1348AhZ
    public final /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo13onPointerEventH0pRuoY(C1247Afe c1247Afe, EnumC1080AXj enumC1080AXj, long j) {
        C3UX coroutineScope;
        int i;
        if (enumC1080AXj == EnumC1080AXj.A04) {
            int i2 = c1247Afe.A00;
            if (AnonymousClass003.A17(i2)) {
                coroutineScope = getCoroutineScope();
                i = 9;
            } else {
                if (i2 != 5) {
                    return;
                }
                coroutineScope = getCoroutineScope();
                i = 10;
            }
            BU2.A0P(this, coroutineScope, i);
        }
    }

    @Override // X.InterfaceC1348AhZ
    public final /* synthetic */ boolean sharePointerInputWithSiblings() {
        return false;
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: onCancelPointerInput */
    public final void onViewConfigurationChange() {
        A02(this);
    }

    @Override // X.AbstractC1439Aj8
    /* renamed from: onDensityChange */
    public final /* synthetic */ void onViewConfigurationChange() {
        A02(this);
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        A02(this);
    }

    @Override // X.InterfaceC1348AhZ
    public final /* synthetic */ void onViewConfigurationChange() {
        A02(this);
    }
}
