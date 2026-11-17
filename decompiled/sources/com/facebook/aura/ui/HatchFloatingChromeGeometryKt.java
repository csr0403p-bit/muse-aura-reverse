package com.facebook.aura.ui;

import X.AGO;
import X.AKH;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BFM;
import X.BLU;
import X.BRg;
import X.C0981AMm;
import X.C2LD;
import X.C2Un;
import X.C2ae;
import X.C7384Etj;
import X.C78N;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchFloatingChromeGeometryKt {
    public static final int HatchHeaderFadeDurationMillis = 150;
    public static final AKH<HatchFloatingChromeGeometry> LocalHatchFloatingChromeGeometry = new AGO(HatchFloatingChromeGeometryKt$LocalHatchFloatingChromeGeometry$1.INSTANCE);
    public static final AKH<Function0<Boolean>> LocalHatchLeavingTab = new AGO(HatchFloatingChromeGeometryKt$LocalHatchLeavingTab$1.INSTANCE);
    public static final AKH<Function0<C2ae>> LocalHatchFloatingChromeObstacleOffset = new AGO(HatchFloatingChromeGeometryKt$LocalHatchFloatingChromeObstacleOffset$1.INSTANCE);

    public static final BRg trackFloatingChromeObstacle(BRg bRg, boolean z, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(bRg, 0);
        bfm.AgE(1074460940);
        boolean zA1P = AnonymousClass001.A1P(i2, z);
        HatchFloatingChromeGeometry hatchFloatingChromeGeometry = (HatchFloatingChromeGeometry) bfm.A6v(LocalHatchFloatingChromeGeometry);
        if (hatchFloatingChromeGeometry != null) {
            C0981AMm<Object, BLU> c0981AMm = zA1P ? hatchFloatingChromeGeometry.bottomBars : hatchFloatingChromeGeometry.headers;
            Function0 function0 = (Function0) bfm.A6v(LocalHatchFloatingChromeObstacleOffset);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new Object();
                bfm.Ai0(objAaT);
            }
            boolean zA1J = AnonymousClass003.A1J(bfm, c0981AMm, objAaT);
            Object objAaT2 = bfm.AaT();
            if (zA1J || objAaT2 == obj) {
                objAaT2 = new HatchFloatingChromeGeometryKt$trackFloatingChromeObstacle$1$1(c0981AMm, objAaT);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A19(bfm, objAaT2, c0981AMm, objAaT);
            boolean zA1O = AnonymousClass003.A1O(bfm, objAaT, function0, bfm.A65(c0981AMm));
            Object objAaT3 = bfm.AaT();
            if (zA1O || objAaT3 == obj) {
                objAaT3 = new HatchFloatingChromeGeometryKt$trackFloatingChromeObstacle$tracked$1$1(c0981AMm, objAaT, function0);
                bfm.Ai0(objAaT3);
            }
            bRg = AnonymousClass003.A0V(bRg, objAaT3);
            if (zA1P) {
                bfm.AgE(1764831507);
            } else {
                bfm.AgE(1764832214);
                bRg = fadeUnderFloatingOccluder(bRg, hatchFloatingChromeGeometry, objAaT, bfm, 0);
            }
            AnonymousClass001.A1D(bfm);
        }
        AnonymousClass001.A1D(bfm);
        return bRg;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg trackFloatingOccluder(X.BRg r6, boolean r7, boolean r8, X.BFM r9, int r10) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)
            r0 = -1347833224(0xffffffffafa9b278, float:-3.086773E-10)
            r9.AgE(r0)
            X.AKH<com.facebook.aura.ui.HatchFloatingChromeGeometry> r0 = com.facebook.aura.ui.HatchFloatingChromeGeometryKt.LocalHatchFloatingChromeGeometry
            java.lang.Object r3 = r9.A6v(r0)
            com.facebook.aura.ui.HatchFloatingChromeGeometry r3 = (com.facebook.aura.ui.HatchFloatingChromeGeometry) r3
            if (r3 == 0) goto L7f
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            boolean r1 = r9.A65(r3)
            java.lang.Object r0 = r9.AaT()
            if (r1 != 0) goto L26
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L2e
        L26:
            com.facebook.aura.ui.HatchFloatingChromeGeometryKt$trackFloatingOccluder$1$1 r0 = new com.facebook.aura.ui.HatchFloatingChromeGeometryKt$trackFloatingOccluder$1$1
            r0.<init>(r3)
            r9.Ai0(r0)
        L2e:
            X.AnonymousClass001.A19(r9, r0, r3, r2)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            boolean r4 = r9.A65(r3)
            r0 = r10 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L47
            boolean r0 = r9.A66(r8)
            if (r0 != 0) goto L4c
        L47:
            r1 = r10 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L4d
        L4c:
            r0 = 1
        L4d:
            r4 = r4 | r0
            java.lang.Object r0 = r9.AaT()
            if (r4 != 0) goto L58
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L60
        L58:
            com.facebook.aura.ui.HatchFloatingChromeGeometryKt$trackFloatingOccluder$2$1 r0 = new com.facebook.aura.ui.HatchFloatingChromeGeometryKt$trackFloatingOccluder$2$1
            r0.<init>(r3, r8)
            r9.Ai0(r0)
        L60:
            X.AnonymousClass001.A19(r9, r0, r3, r5)
            if (r7 == 0) goto L7f
            boolean r1 = r9.A65(r3)
            java.lang.Object r0 = r9.AaT()
            if (r1 != 0) goto L73
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L7b
        L73:
            com.facebook.aura.ui.HatchFloatingChromeGeometryKt$trackFloatingOccluder$3$1 r0 = new com.facebook.aura.ui.HatchFloatingChromeGeometryKt$trackFloatingOccluder$3$1
            r0.<init>(r3)
            r9.Ai0(r0)
        L7b:
            X.BRg r6 = X.AnonymousClass003.A0V(r6, r0)
        L7f:
            X.AnonymousClass001.A1D(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.HatchFloatingChromeGeometryKt.trackFloatingOccluder(X.BRg, boolean, boolean, X.BFM, int):X.BRg");
    }

    public static final AKH<HatchFloatingChromeGeometry> getLocalHatchFloatingChromeGeometry() {
        return LocalHatchFloatingChromeGeometry;
    }

    public static final AKH<Function0<C2ae>> getLocalHatchFloatingChromeObstacleOffset() {
        return LocalHatchFloatingChromeObstacleOffset;
    }

    public static final AKH<Function0<Boolean>> getLocalHatchLeavingTab() {
        return LocalHatchLeavingTab;
    }

    public static final boolean isAbove(BLU blu, BLU blu2) {
        return blu.A00 <= blu2.A03 && blu.A01 < blu2.A02 && blu.A02 > blu2.A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg fadeUnderFloatingOccluder(X.BRg r15, com.facebook.aura.ui.HatchFloatingChromeGeometry r16, java.lang.Object r17, X.BFM r18, int r19) {
        /*
            r0 = 1329096151(0x4f3865d7, float:3.09368192E9)
            r3 = r18
            r3.AgE(r0)
            r9 = r16
            X.1BO r0 = r9.hasFloatingOccluder$delegate
            boolean r0 = X.C1BO.A0F(r0)
            if (r0 != 0) goto L16
            X.AnonymousClass002.A19(r3)
            return r15
        L16:
            X.AKH<kotlin.jvm.functions.Function0<java.lang.Boolean>> r0 = com.facebook.aura.ui.HatchFloatingChromeGeometryKt.LocalHatchLeavingTab
            java.lang.Object r6 = r3.A6v(r0)
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r0 = r19 & 112(0x70, float:1.57E-43)
            r5 = r0 ^ 48
            r4 = 0
            r1 = 32
            if (r5 <= r1) goto L2d
            boolean r0 = r3.A65(r9)
            if (r0 != 0) goto L32
        L2d:
            r2 = r19 & 48
            r0 = 0
            if (r2 != r1) goto L33
        L32:
            r0 = 1
        L33:
            r10 = r17
            boolean r0 = X.AnonymousClass003.A1P(r3, r10, r6, r0)
            java.lang.Object r11 = r3.AaT()
            if (r0 != 0) goto L43
            java.lang.Object r0 = X.C78N.A00
            if (r11 != r0) goto L50
        L43:
            X.F1F r0 = new X.F1F
            r0.<init>()
            com.facebook.aura.ui.HatchFloatingChromeGeometryKt$fadeUnderFloatingOccluder$handedOff$1$1 r11 = new com.facebook.aura.ui.HatchFloatingChromeGeometryKt$fadeUnderFloatingOccluder$handedOff$1$1
            r11.<init>(r6, r0, r9, r10)
            r3.Ai0(r11)
        L50:
            kotlin.jvm.functions.Function0 r11 = (kotlin.jvm.functions.Function0) r11
            java.lang.Object r12 = r3.AaT()
            java.lang.Object r2 = X.C78N.A00
            if (r12 != r2) goto L60
            r0 = 1065353216(0x3f800000, float:1.0)
            X.AT5 r12 = X.AnonymousClass002.A0I(r3, r0)
        L60:
            X.AT5 r12 = (X.AT5) r12
            java.lang.Object r13 = X.AnonymousClass005.A0h(r3, r2, r4)
            androidx.compose.runtime.MutableState r13 = (androidx.compose.runtime.MutableState) r13
            if (r5 <= r1) goto L70
            boolean r0 = r3.A65(r9)
            if (r0 != 0) goto L75
        L70:
            r0 = r19 & 48
            r7 = 0
            if (r0 != r1) goto L76
        L75:
            r7 = 1
        L76:
            boolean r0 = r3.A67(r10)
            boolean r0 = X.AnonymousClass005.A1X(r3, r11, r12, r7, r0)
            java.lang.Object r8 = r3.AaT()
            if (r0 != 0) goto L86
            if (r8 != r2) goto L8f
        L86:
            r14 = 0
            com.facebook.aura.ui.HatchFloatingChromeGeometryKt$fadeUnderFloatingOccluder$1$1 r8 = new com.facebook.aura.ui.HatchFloatingChromeGeometryKt$fadeUnderFloatingOccluder$1$1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r3.Ai0(r8)
        L8f:
            X.G0V r8 = (X.G0V) r8
            X.C78e.A02(r3, r9, r10, r11, r8)
            if (r6 != 0) goto Ld0
            r0 = 1656155611(0x62b6eddb, float:1.6872234E21)
            r3.AgE(r0)
        L9c:
            r7 = r3
            X.BBI r7 = (X.BBI) r7
            r6 = 0
            X.BBI.A0R(r7, r4)
            boolean r8 = r3.A67(r12)
            if (r5 <= r1) goto Laf
            boolean r0 = r3.A65(r9)
            if (r0 != 0) goto Lb3
        Laf:
            r0 = r19 & 48
            if (r0 != r1) goto Lb4
        Lb3:
            r4 = 1
        Lb4:
            boolean r1 = X.AnonymousClass002.A1V(r3, r10, r8, r4)
            java.lang.Object r0 = r3.AaT()
            if (r1 != 0) goto Lc0
            if (r0 != r2) goto Lc8
        Lc0:
            com.facebook.aura.ui.HatchFloatingChromeGeometryKt$fadeUnderFloatingOccluder$2$1 r0 = new com.facebook.aura.ui.HatchFloatingChromeGeometryKt$fadeUnderFloatingOccluder$2$1
            r0.<init>(r12, r9, r10, r13)
            r3.Ai0(r0)
        Lc8:
            X.BRg r0 = X.AnonymousClass001.A0W(r15, r0)
            X.BBI.A0R(r7, r6)
            return r0
        Ld0:
            r0 = 1656155959(0x62b6ef37, float:1.6872723E21)
            r3.AgE(r0)
            r0 = r19 & 14
            X.BRg r15 = com.facebook.aura.ui.sharedelement.HatchSharedElementKt.renderAboveHatchPages(r15, r11, r3, r0)
            goto L9c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.HatchFloatingChromeGeometryKt.fadeUnderFloatingOccluder(X.BRg, com.facebook.aura.ui.HatchFloatingChromeGeometry, java.lang.Object, X.BFM, int):X.BRg");
    }

    public static final BLU getWindowRect(C2LD c2ld) {
        return C2Un.A01(c2ld.A01(), c2ld.A02().A01());
    }
}
