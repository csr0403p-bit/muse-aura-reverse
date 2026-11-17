package com.facebook.aura.status.view;

import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.C1DG;
import X.C7384Etj;
import X.C78N;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;

/* loaded from: classes.dex */
public abstract class HatchStatusPillAvatarPanelKt {
    public static final float MinVisibleAvatarSize = 24.0f;

    /* renamed from: chromeMotion-3ABfNKs, reason: not valid java name */
    public static final StatusPillChromeMotion m2230chromeMotion3ABfNKs(StatusPillAvatarPanel statusPillAvatarPanel, float f) {
        C7384Etj.A0Y(statusPillAvatarPanel, 0);
        return statusPillAvatarPanel.progress == 0.0f ? new StatusPillChromeMotion(C1DG.A04(new C1DG(statusPillAvatarPanel.avatarSize - f), 0.0f).A00, 0.0f) : new StatusPillChromeMotion(C1DG.A04(new C1DG(statusPillAvatarPanel.restingAvatarSize - f), 0.0f).A00, 1.0f);
    }

    /* renamed from: rememberStatusPillMediaSize-if577FI, reason: not valid java name */
    public static final float m2232rememberStatusPillMediaSizeif577FI(float f, float f2, boolean z, boolean z2, BFM bfm, int i) {
        boolean zA1R = AnonymousClass001.A1R(bfm, bfm.A6v(Am0.A04), bfm.A64(AuraLayoutSizeKt.auraWindowContainerSize(bfm, 0)));
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            objAaT = AnonymousClass004.A11(bfm, C1DG.A03());
        }
        MutableState mutableState = (MutableState) objAaT;
        C1DG c1dg = new C1DG(f);
        C1DG c1dg2 = new C1DG(f2);
        C1DG c1dg3 = new C1DG(MinVisibleAvatarSize);
        if (c1dg2.compareTo(c1dg3) >= 0) {
            c1dg3 = c1dg2;
        }
        if (c1dg.compareTo(c1dg3) < 0) {
            c1dg = c1dg3;
        }
        float f3 = c1dg.A00;
        if (z) {
            C1DG c1dg4 = new C1DG(f3);
            C1DG c1dg5 = new C1DG(rememberStatusPillMediaSize_if577FI$lambda$1(mutableState));
            if (c1dg4.compareTo(c1dg5) >= 0) {
                c1dg5 = c1dg4;
            }
            f3 = c1dg5.A00;
        }
        boolean zA1I = AnonymousClass003.A1I(bfm, mutableState, f3);
        Object objAaT2 = bfm.AaT();
        if (zA1I || objAaT2 == C78N.A00) {
            objAaT2 = new HatchStatusPillAvatarPanelKt$rememberStatusPillMediaSize$1$1(f3, mutableState);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A15(bfm, objAaT2);
        return !z2 ? f3 : f;
    }

    public static final float getMinVisibleAvatarSize() {
        return MinVisibleAvatarSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e7  */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, java.lang.Float, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v9, types: [V extends X.AOd, X.AOd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r37v0, types: [X.BFM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v7, types: [V extends X.AOd, X.AOd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Float, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.StringBuilder] */
    /* renamed from: rememberStatusPillAvatarPanel-NjYfxMY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.status.view.StatusPillAvatarPanel m2231rememberStatusPillAvatarPanelNjYfxMY(boolean r30, boolean r31, float r32, float r33, float r34, float r35, X.C1DG r36, X.BFM r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.HatchStatusPillAvatarPanelKt.m2231rememberStatusPillAvatarPanelNjYfxMY(boolean, boolean, float, float, float, float, X.1DG, X.BFM, int, int):com.facebook.aura.status.view.StatusPillAvatarPanel");
    }

    public static final float rememberStatusPillMediaSize_if577FI$lambda$1(MutableState<C1DG> mutableState) {
        return mutableState.getValue().A00;
    }
}
