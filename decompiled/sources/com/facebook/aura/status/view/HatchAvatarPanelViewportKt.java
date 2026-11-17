package com.facebook.aura.status.view;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFM;
import X.BNH;
import X.BRg;
import X.C1DG;
import X.C1OP;
import X.C1OQ;
import X.C1er;
import X.C7384Etj;
import X.C78N;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.header.api.AvatarFullScreen;
import com.facebook.aura.header.api.AvatarTakeover;
import com.facebook.aura.header.api.AvatarTakeoverKt;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchAvatarPanelViewportKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    /* renamed from: avatarPanelViewport-WMci_g0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg m2223avatarPanelViewportWMci_g0(X.BRg r18, float r19, float r20, kotlin.jvm.functions.Function0<X.C1DG> r21, X.BFM r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.HatchAvatarPanelViewportKt.m2223avatarPanelViewportWMci_g0(X.BRg, float, float, kotlin.jvm.functions.Function0, X.BFM, int):X.BRg");
    }

    public static final BRg avatarWindowInsets(BRg bRg, boolean z, boolean z2, BFM bfm, int i) {
        int i2;
        C7384Etj.A0Y(bRg, 0);
        bfm.AgE(1381234407);
        C1OP c1opA00 = C1OP.A00(bfm);
        if (!z) {
            if (z2) {
                i2 = 16;
            }
            AnonymousClass001.A1D(bfm);
            return bRg;
        }
        i2 = 15;
        if (z2) {
            i2 = 31;
        }
        bRg = BNH.A00(new C1OQ(c1opA00, i2), bRg);
        AnonymousClass001.A1D(bfm);
        return bRg;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* renamed from: avatarFullScreenTransform-uFdPcIQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg m2222avatarFullScreenTransformuFdPcIQ(X.BRg r7, float r8, float r9, kotlin.jvm.functions.Function0<X.C1DG> r10, X.BFM r11, int r12) {
        /*
            X.AnonymousClass003.A0w(r7, r10)
            X.AKH<com.facebook.aura.header.api.AvatarTakeover> r0 = com.facebook.aura.header.api.AvatarTakeoverKt.LocalAvatarTakeover
            java.lang.Object r0 = r11.A6v(r0)
            com.facebook.aura.header.api.AvatarTakeover r0 = (com.facebook.aura.header.api.AvatarTakeover) r0
            if (r0 == 0) goto L60
            com.facebook.aura.header.api.AvatarFullScreen r2 = r0.getFullScreen()
        L11:
            X.AXN r0 = X.AnonymousClass002.A0Y(r11)
            float r3 = r0.Ah4(r8)
            boolean r6 = X.AnonymousClass003.A1I(r11, r2, r3)
            r0 = r12 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r5 = 0
            r4 = 256(0x100, float:3.59E-43)
            if (r0 <= r4) goto L2c
            boolean r0 = r11.A62(r9)
            if (r0 != 0) goto L31
        L2c:
            r1 = r12 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r4) goto L32
        L31:
            r0 = 1
        L32:
            r6 = r6 | r0
            r0 = r12 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 ^ 3072(0xc00, float:4.305E-42)
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 <= r1) goto L41
            boolean r0 = r11.A65(r10)
            if (r0 != 0) goto L45
        L41:
            r0 = r12 & 3072(0xc00, float:4.305E-42)
            if (r0 != r1) goto L46
        L45:
            r5 = 1
        L46:
            r6 = r6 | r5
            java.lang.Object r0 = r11.AaT()
            if (r6 != 0) goto L51
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L59
        L51:
            com.facebook.aura.status.view.HatchAvatarPanelViewportKt$avatarFullScreenTransform$1$1 r0 = new com.facebook.aura.status.view.HatchAvatarPanelViewportKt$avatarFullScreenTransform$1$1
            r0.<init>(r2, r3, r9, r10)
            r11.Ai0(r0)
        L59:
            X.G0W r0 = (X.G0W) r0
            X.BRg r0 = X.C3UC.A00(r7, r0)
            return r0
        L60:
            r2 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.HatchAvatarPanelViewportKt.m2222avatarFullScreenTransformuFdPcIQ(X.BRg, float, float, kotlin.jvm.functions.Function0, X.BFM, int):X.BRg");
    }

    public static final boolean isFromBubble(AvatarFullScreen avatarFullScreen, HatchStatusPillMetrics hatchStatusPillMetrics) {
        if (!avatarFullScreen.getActive()) {
            return false;
        }
        if (MutableState.A0A(hatchStatusPillMetrics.avatarExpanded$delegate)) {
            return !avatarFullScreen.getEnteredFromHalfScreen() && hatchStatusPillMetrics.avatarPanelProgress$delegate.AFn() < 1.0f;
        }
        return true;
    }

    public static final Function0<C1DG> panelMediaOffset(float f, BFM bfm, int i) {
        HatchStatusPillMetrics hatchStatusPillMetricsA0a = AnonymousClass002.A0a(bfm);
        AvatarTakeover avatarTakeover = (AvatarTakeover) bfm.A6v(AvatarTakeoverKt.LocalAvatarTakeover);
        AvatarFullScreen fullScreen = avatarTakeover != null ? avatarTakeover.getFullScreen() : null;
        MutableState mutableStateA00 = C1er.A00(bfm, Float.valueOf(f));
        boolean zA1R = AnonymousClass005.A1R(bfm, hatchStatusPillMetricsA0a, fullScreen, mutableStateA00);
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            objAaT = new HatchAvatarPanelViewportKt$panelMediaOffset$1$1(fullScreen, hatchStatusPillMetricsA0a, mutableStateA00);
            bfm.Ai0(objAaT);
        }
        return (Function0) objAaT;
    }
}
