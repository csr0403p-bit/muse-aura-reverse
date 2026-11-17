package com.facebook.aura.main;

import X.ASj;
import X.AnonymousClass001;
import X.BFM;
import X.C1BO;
import X.C1DG;
import X.C2HU;
import X.C31t;
import X.C78N;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.HatchSidePanelController;
import com.facebook.aura.navigation.HatchSidePanelDock;
import com.facebook.aura.navigation.SidePanelLocalsKt;
import com.facebook.aura.utils.HatchUtils;

/* loaded from: classes.dex */
public abstract class HatchSidePanelDockStateKt {
    public static final ASj<Float> DockContentFadeOut = new ASj<>(C2HU.A00, 90, 0);
    public static final ASj<Float> DockContentFadeIn = new ASj<>(C2HU.A03, 210, 0);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.main.HatchSidePanelDockState rememberHatchSidePanelDockState(com.facebook.aura.ui.adaptive.AuraSidePanelPresentation r11, com.facebook.aura.navigation.HatchSidePanelController r12, androidx.navigation3.runtime.NavBackStack<com.facebook.aura.navigation.AuraNavKey> r13, X.BFM r14, int r15) {
        /*
            r5 = 0
            X.AnonymousClass005.A10(r11, r12, r13)
            boolean r0 = r11.getDocksBesidePages()
            if (r0 == 0) goto L7b
            r0 = 2043936537(0x79d3ff19, float:1.3759358E35)
            r14.AgE(r0)
            int r1 = com.facebook.aura.navigation.HatchSidePanelController.$stable
            int r0 = r15 >> 3
            r0 = r0 & 14
            r1 = r1 | r0
            com.facebook.aura.navigation.HatchSidePanelDock r4 = rememberDockedSidePanelDock(r12, r14, r1)
            X.AnonymousClass001.A1D(r14)
        L1e:
            r0 = r15 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r3 = 256(0x100, float:3.59E-43)
            r2 = 1
            if (r0 <= r3) goto L2d
            boolean r0 = r14.A65(r13)
            if (r0 != 0) goto L32
        L2d:
            r1 = r15 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r3) goto L33
        L32:
            r0 = 1
        L33:
            java.lang.Object r3 = r14.AaT()
            if (r0 != 0) goto L3d
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L46
        L3d:
            com.facebook.aura.main.HatchSidePanelDockStateKt$rememberHatchSidePanelDockState$hasWindowOverlay$2$1 r0 = new com.facebook.aura.main.HatchSidePanelDockStateKt$rememberHatchSidePanelDockState$hasWindowOverlay$2$1
            r0.<init>(r13)
            X.BBP r3 = X.AnonymousClass003.A0R(r14, r0)
        L46:
            X.1BO r3 = (X.C1BO) r3
            float r1 = r4.railWidth
            r0 = 0
            int r0 = X.C1DG.A01(r1, r0)
            if (r0 <= 0) goto L60
            androidx.compose.runtime.MutableState r0 = r12.isRailRequested$delegate
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
            if (r0 == 0) goto L60
            boolean r0 = X.C1BO.A0F(r3)
            r1 = 1
            if (r0 == 0) goto L61
        L60:
            r1 = 0
        L61:
            boolean r0 = r4.isDocked
            if (r0 == 0) goto L79
            androidx.compose.runtime.MutableState r0 = r12.isDockRequested$delegate
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
            if (r0 == 0) goto L79
            boolean r0 = X.C1BO.A0F(r3)
            if (r0 != 0) goto L79
        L73:
            com.facebook.aura.main.HatchSidePanelDockState r0 = new com.facebook.aura.main.HatchSidePanelDockState
            r0.<init>(r4, r1, r2)
            return r0
        L79:
            r2 = 0
            goto L73
        L7b:
            r0 = 2043938150(0x79d40566, float:1.3760955E35)
            X.AnonymousClass003.A0l(r14, r0)
            r11 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            com.facebook.aura.navigation.HatchSidePanelDock r4 = new com.facebook.aura.navigation.HatchSidePanelDock
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.HatchSidePanelDockStateKt.rememberHatchSidePanelDockState(com.facebook.aura.ui.adaptive.AuraSidePanelPresentation, com.facebook.aura.navigation.HatchSidePanelController, androidx.navigation3.runtime.NavBackStack, X.BFM, int):com.facebook.aura.main.HatchSidePanelDockState");
    }

    public static final HatchSidePanelDock rememberDockedSidePanelDock(HatchSidePanelController hatchSidePanelController, BFM bfm, int i) {
        float f = HatchUtils.INSTANCE.isSidePanelSpacesEnabled() ? SidePanelLocalsKt.HATCH_SIDE_PANEL_RAIL_WIDTH : 0.0f;
        float f2 = f;
        if (!MutableState.A0A(hatchSidePanelController.isDockCollapsed$delegate)) {
            f = SidePanelLocalsKt.HATCH_SIDE_PANEL_DOCK_WIDTH;
        }
        C1BO c1boA02 = C31t.A02(null, bfm, null, f, 384, 10);
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = new DockContentFade(f);
            bfm.Ai0(objAaT);
        }
        DockContentFade dockContentFade = (DockContentFade) objAaT;
        C1DG c1dg = new C1DG(f);
        boolean zA62 = bfm.A62(f);
        Object objAaT2 = bfm.AaT();
        if (zA62 || objAaT2 == obj) {
            objAaT2 = new HatchSidePanelDockStateKt$rememberDockedSidePanelDock$1$1(dockContentFade, f, null);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A18(bfm, objAaT2, c1dg);
        return new HatchSidePanelDock(true, C1BO.A00(c1boA02), f, f2, dockContentFade.m1334getFromWidthD9Ej5fM(), dockContentFade.m1335getWidthD9Ej5fM(), MutableState.A00(dockContentFade.alphaAnimatable));
    }
}
