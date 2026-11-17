package com.facebook.aura.maps;

import X.AFR;
import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C0z7;
import X.C1515AkP;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.maps.scene.HatchMapCameraTarget;
import com.facebook.aura.maps.scene.HatchMapTheme;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchMapNavigationHostKt {

    /* renamed from: com.facebook.aura.maps.HatchMapNavigationHostKt$HatchMapNavigationHost$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchMapNavigationController $controller;
        public final /* synthetic */ HatchMapDisplayMode $displayMode;
        public final /* synthetic */ HatchMapCameraTarget.Point $initialCamera;
        public final /* synthetic */ boolean $isDarkMode;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onMapAttached;
        public final /* synthetic */ Function0<Unit> $onMapDetached;
        public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $overlayContent;
        public final /* synthetic */ AFR $retainedMap;
        public final /* synthetic */ HatchMapTheme $theme;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AFR afr, HatchMapNavigationController hatchMapNavigationController, HatchMapDisplayMode hatchMapDisplayMode, HatchMapTheme hatchMapTheme, boolean z, HatchMapCameraTarget.Point point, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$retainedMap = afr;
            this.$controller = hatchMapNavigationController;
            this.$displayMode = hatchMapDisplayMode;
            this.$theme = hatchMapTheme;
            this.$isDarkMode = z;
            this.$initialCamera = point;
            this.$onMapAttached = function0;
            this.$onMapDetached = function02;
            this.$modifier = bRg;
            this.$overlayContent = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMapNavigationHostKt.HatchMapNavigationHost(this.$retainedMap, this.$controller, this.$displayMode, this.$theme, this.$isDarkMode, this.$initialCamera, this.$onMapAttached, this.$onMapDetached, this.$modifier, this.$overlayContent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchMapNavigationHost(AFR afr, HatchMapNavigationController hatchMapNavigationController, HatchMapDisplayMode hatchMapDisplayMode, HatchMapTheme hatchMapTheme, boolean z, HatchMapCameraTarget.Point point, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w2 = g0w;
        C7384Etj.A0Y(afr, 0);
        AnonymousClass005.A11(hatchMapNavigationController, hatchMapDisplayMode, hatchMapTheme, 1);
        AnonymousClass003.A10(function0, function02);
        bfm.AgG(343792879);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, afr) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, hatchMapNavigationController);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass005.A0A(bfm, hatchMapDisplayMode);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, hatchMapTheme);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0r(bfm, z);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A0i(bfm, point);
        }
        if ((1572864 & i) == 0) {
            iA0T |= AnonymousClass004.A0Z(bfm, function0);
        }
        if ((12582912 & i) == 0) {
            iA0T |= AnonymousClass004.A0a(bfm, function02);
        }
        int i3 = i2 & 256;
        int iA0l = 100663296;
        if (i3 != 0) {
            iA0T |= iA0l;
        } else if ((100663296 & i) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRg2);
            iA0T |= iA0l;
        }
        int i4 = i2 & 512;
        int iA0c = 805306368;
        if (i4 != 0) {
            iA0T |= iA0c;
        } else if ((805306368 & i) == 0) {
            iA0c = AnonymousClass004.A0c(bfm, g0w2);
            iA0T |= iA0c;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 306783379, 306783378), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0w2 = ComposableSingletons$HatchMapNavigationHostKt.f81lambda$1035758193;
            }
            int i5 = iA0T >> 24;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA02);
            C0z7 c0z7 = C0z7.A00;
            BRg bRgAQJ = c0z7.AQJ(BRg.A00);
            int i6 = iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1T = AnonymousClass001.A1T(bfm, afr, AnonymousClass002.A1Q(i6, 32)) | AnonymousClass005.A1C(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchMapNavigationHostKt$HatchMapNavigationHost$1$1$1(hatchMapNavigationController, afr, function0);
                BBI.A0O(bbi, objAaT);
            }
            G0U g0u = (G0U) objAaT;
            boolean zA1Q = AnonymousClass002.A1Q(i6, 32) | ((iA0T & 29360128) == 8388608);
            Object objAaT2 = bfm.AaT();
            if (zA1Q || objAaT2 == C78N.A00) {
                objAaT2 = new HatchMapNavigationHostKt$HatchMapNavigationHost$1$2$1(hatchMapNavigationController, function02);
                BBI.A0O(bbi, objAaT2);
            }
            int i7 = iA0T & 14;
            int i8 = iA0T >> 3;
            HatchMapSurfaceKt.HatchMapSurface(afr, hatchMapDisplayMode, hatchMapTheme, z, point, g0u, (G0U) objAaT2, bRgAQJ, bfm, AnonymousClass001.A0B(i8, AnonymousClass003.A06(i8, i7)), 0);
            AnonymousClass004.A1B(bbi, c0z7, bfm, g0w2, (i5 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(afr, hatchMapNavigationController, hatchMapDisplayMode, hatchMapTheme, z, point, function0, function02, bRg2, g0w2, i, i2);
        }
    }
}
