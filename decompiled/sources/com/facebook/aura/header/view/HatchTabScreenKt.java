package com.facebook.aura.header.view;

import X.BFM;
import X.C1er;
import X.C78N;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.HatchSidePanelController;
import com.facebook.aura.navigation.SidePanelLocalsKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchTabScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010c  */
    /* renamed from: HatchPageHeaderTabScreen-vn_pVgY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1021HatchPageHeaderTabScreenvn_pVgY(com.facebook.aura.navigation.AuraTabRootNavKey r53, java.lang.String r54, com.facebook.aura.header.view.HeaderLeadingButton r55, X.BRg r56, com.facebook.aura.ui.adaptive.AuraContentRole r57, long r58, com.facebook.aura.header.view.ScrimConfig r60, X.BRg r61, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r62, X.G0U<? super com.facebook.aura.header.view.HeaderLeadingButton, kotlin.Unit> r63, kotlin.jvm.functions.Function0<kotlin.Unit> r64, com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode r65, boolean r66, float r67, X.G0W<? super X.C1DG, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r68, X.BFM r69, int r70, int r71, int r72) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.header.view.HatchTabScreenKt.m1021HatchPageHeaderTabScreenvn_pVgY(com.facebook.aura.navigation.AuraTabRootNavKey, java.lang.String, com.facebook.aura.header.view.HeaderLeadingButton, X.BRg, com.facebook.aura.ui.adaptive.AuraContentRole, long, com.facebook.aura.header.view.ScrimConfig, X.BRg, X.G0V, X.G0U, kotlin.jvm.functions.Function0, com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode, boolean, float, X.G0W, X.BFM, int, int, int):void");
    }

    public static final G0U<HeaderLeadingButton, Unit> rememberSidePanelLeadingButtonClick(G0U<? super HeaderLeadingButton, Unit> g0u, BFM bfm, int i) {
        HatchSidePanelController hatchSidePanelController = (HatchSidePanelController) bfm.A6v(SidePanelLocalsKt.LocalSidePanelController);
        MutableState mutableStateA00 = C1er.A00(bfm, g0u);
        boolean zA65 = bfm.A65(hatchSidePanelController);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new HatchTabScreenKt$rememberSidePanelLeadingButtonClick$1$1(hatchSidePanelController, mutableStateA00);
            bfm.Ai0(objAaT);
        }
        return (G0U) objAaT;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* renamed from: HatchTabScreen-Tsp2nRQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1022HatchTabScreenTsp2nRQ(com.facebook.aura.navigation.AuraTabRootNavKey r91, X.BRg r92, com.facebook.aura.ui.adaptive.AuraContentRole r93, java.lang.String r94, long r95, com.facebook.aura.header.view.ScrimConfig r97, X.BRg r98, float r99, boolean r100, com.facebook.aura.header.view.HatchHeaderTitleAlignment r101, java.lang.String r102, X.AHD<? extends com.facebook.aura.header.view.HeaderButton> r103, X.G0U<? super com.facebook.aura.header.view.HeaderButton, kotlin.Unit> r104, X.AHD<com.facebook.aura.header.api.HeaderAction> r105, com.facebook.aura.header.view.HeaderButton r106, com.facebook.aura.header.view.HeaderLeadingButton r107, boolean r108, boolean r109, X.G0U<? super com.facebook.aura.header.view.HeaderLeadingButton, kotlin.Unit> r110, kotlin.jvm.functions.Function0<kotlin.Unit> r111, X.B6A r112, com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode r113, boolean r114, boolean r115, boolean r116, boolean r117, float r118, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r119, X.G0W<? super X.C1DG, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r120, X.BFM r121, int r122, int r123, int r124, int r125) {
        /*
            Method dump skipped, instructions count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.header.view.HatchTabScreenKt.m1022HatchTabScreenTsp2nRQ(com.facebook.aura.navigation.AuraTabRootNavKey, X.BRg, com.facebook.aura.ui.adaptive.AuraContentRole, java.lang.String, long, com.facebook.aura.header.view.ScrimConfig, X.BRg, float, boolean, com.facebook.aura.header.view.HatchHeaderTitleAlignment, java.lang.String, X.AHD, X.G0U, X.AHD, com.facebook.aura.header.view.HeaderButton, com.facebook.aura.header.view.HeaderLeadingButton, boolean, boolean, X.G0U, kotlin.jvm.functions.Function0, X.B6A, com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode, boolean, boolean, boolean, boolean, float, X.G0V, X.G0W, X.BFM, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c6 A[PHI: r2 r13
  0x02c6: PHI (r2v27 com.facebook.aura.header.view.ScrimScrollState) = (r2v24 com.facebook.aura.header.view.ScrimScrollState), (r2v30 com.facebook.aura.header.view.ScrimScrollState) binds: [B:164:0x03af, B:142:0x02c2] A[DONT_GENERATE, DONT_INLINE]
  0x02c6: PHI (r13v3 X.BRg) = (r13v1 X.BRg), (r13v4 X.BRg) binds: [B:164:0x03af, B:142:0x02c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b1  */
    /* renamed from: HatchTabScreenLayout-2GuVP1I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1023HatchTabScreenLayout2GuVP1I(com.facebook.aura.navigation.AuraTabRootNavKey r87, X.BRg r88, com.facebook.aura.ui.adaptive.AuraContentRole r89, java.lang.String r90, long r91, com.facebook.aura.header.view.ScrimConfig r93, X.BRg r94, float r95, boolean r96, com.facebook.aura.header.view.HatchHeaderTitleAlignment r97, java.lang.String r98, X.AHD<? extends com.facebook.aura.header.view.HeaderButton> r99, X.G0U<? super com.facebook.aura.header.view.HeaderButton, kotlin.Unit> r100, X.AHD<com.facebook.aura.header.api.HeaderAction> r101, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r102, com.facebook.aura.header.view.HeaderButton r103, com.facebook.aura.header.view.HeaderLeadingButton r104, boolean r105, boolean r106, X.G0U<? super com.facebook.aura.header.view.HeaderLeadingButton, kotlin.Unit> r107, kotlin.jvm.functions.Function0<kotlin.Unit> r108, X.B6A r109, com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode r110, boolean r111, boolean r112, boolean r113, boolean r114, boolean r115, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r116, float r117, X.G0W<? super X.C1DG, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r118, X.BFM r119, int r120, int r121, int r122, int r123) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.header.view.HatchTabScreenKt.m1023HatchTabScreenLayout2GuVP1I(com.facebook.aura.navigation.AuraTabRootNavKey, X.BRg, com.facebook.aura.ui.adaptive.AuraContentRole, java.lang.String, long, com.facebook.aura.header.view.ScrimConfig, X.BRg, float, boolean, com.facebook.aura.header.view.HatchHeaderTitleAlignment, java.lang.String, X.AHD, X.G0U, X.AHD, X.G0V, com.facebook.aura.header.view.HeaderButton, com.facebook.aura.header.view.HeaderLeadingButton, boolean, boolean, X.G0U, kotlin.jvm.functions.Function0, X.B6A, com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode, boolean, boolean, boolean, boolean, boolean, X.G0V, float, X.G0W, X.BFM, int, int, int, int):void");
    }
}
