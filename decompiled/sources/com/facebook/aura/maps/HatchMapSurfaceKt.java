package com.facebook.aura.maps;

import X.AFR;
import X.AKO;
import X.ALE;
import X.ALJ;
import X.ALL;
import X.AXN;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C0881AGi;
import X.C1OP;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C9V4;
import X.C9V6;
import X.C9V8;
import X.C9n4;
import X.G0U;
import X.G0V;
import X.HxS;
import com.facebook.aura.maps.model.HatchMapCoordinate;
import com.facebook.aura.maps.scene.HatchMapCameraTarget;
import com.facebook.aura.maps.scene.HatchMapTheme;
import com.facebook.aura.maps.scene.HatchMapThemeKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import com.meta.maps.core.GeoCoordinates;
import com.meta.maps.display.camera.CameraPose;
import com.meta.maps.display.logging.SurfaceType;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class HatchMapSurfaceKt {
    public static final float ATTRIBUTION_MARGIN = 16.0f;
    public static final float FULLSCREEN_ATTRIBUTION_TOP_PADDING = 24.0f;
    public static final float FULLSCREEN_MAP_CLOSE_TOP_PADDING = 16.0f;
    public static final String MAP_SURFACE = "hatch_android_local_map";

    /* renamed from: com.facebook.aura.maps.HatchMapSurfaceKt$HatchMapSurface$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchMapDisplayMode $displayMode;
        public final /* synthetic */ HatchMapCameraTarget.Point $initialCamera;
        public final /* synthetic */ boolean $isDarkMode;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<C9n4, Unit> $onMapReady;
        public final /* synthetic */ G0U<C9n4, Unit> $onMapRelease;
        public final /* synthetic */ AFR $retainedMap;
        public final /* synthetic */ HatchMapTheme $theme;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AFR afr, HatchMapDisplayMode hatchMapDisplayMode, HatchMapTheme hatchMapTheme, boolean z, HatchMapCameraTarget.Point point, G0U<? super C9n4, Unit> g0u, G0U<? super C9n4, Unit> g0u2, BRg bRg, int i, int i2) {
            super(2);
            this.$retainedMap = afr;
            this.$displayMode = hatchMapDisplayMode;
            this.$theme = hatchMapTheme;
            this.$isDarkMode = z;
            this.$initialCamera = point;
            this.$onMapReady = g0u;
            this.$onMapRelease = g0u2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMapSurfaceKt.HatchMapSurface(this.$retainedMap, this.$displayMode, this.$theme, this.$isDarkMode, this.$initialCamera, this.$onMapReady, this.$onMapRelease, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final ALE baseMapConfig(HatchMapTheme hatchMapTheme, HatchMapDisplayMode hatchMapDisplayMode, boolean z, HatchMapCameraTarget.Point point, ALJ alj) {
        CameraPose cameraPose;
        ALL all;
        C9V6 c9v6 = new C9V6(HatchMapThemeKt.styleUrl(hatchMapTheme, false, null, MAP_SURFACE, null), HatchMapThemeKt.styleUrl(hatchMapTheme, true, null, MAP_SURFACE, null));
        if (point != null) {
            cameraPose = new CameraPose();
            HatchMapCoordinate hatchMapCoordinate = point.coordinate;
            cameraPose.center = new GeoCoordinates(hatchMapCoordinate.latitude, hatchMapCoordinate.longitude);
            cameraPose.zoomLevel = Double.valueOf(point.zoom);
        } else {
            cameraPose = null;
        }
        int iOrdinal = hatchMapDisplayMode.ordinal();
        if (iOrdinal == 0) {
            all = new ALL(false, false, false, false, false, false);
        } else {
            if (iOrdinal != 1) {
                throw C3cG.A0q();
            }
            all = new ALL(true, true, true, true, true, true);
        }
        return new ALE(all, c9v6, new C9V4(null, 0.0d, 0.0d, 3), alj, cameraPose, SurfaceType.NATIVE, null, null, HatchMapThemeKt.backgroundColor(hatchMapTheme, z), z);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchMapDisplayMode.values().length];
            try {
                AnonymousClass002.A13(HatchMapDisplayMode.INLINE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchMapDisplayMode.FULLSCREEN, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void HatchMapSurface(AFR afr, HatchMapDisplayMode hatchMapDisplayMode, HatchMapTheme hatchMapTheme, boolean z, HatchMapCameraTarget.Point point, G0U<? super C9n4, Unit> g0u, G0U<? super C9n4, Unit> g0u2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A10(afr, hatchMapDisplayMode, hatchMapTheme);
        C7384Etj.A0Y(g0u, 5);
        C7384Etj.A0Y(g0u2, 6);
        bfm.AgG(-205342197);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, afr) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass005.A09(bfm, hatchMapDisplayMode);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, hatchMapTheme);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, point);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A0Y(bfm, g0u);
        }
        if ((1572864 & i) == 0) {
            iA0T |= AnonymousClass004.A0Z(bfm, g0u2);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA0T |= iA0k;
        } else if ((i & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0T |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 4793491, 4793490), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            AXN axnA04 = AKO.A04(Am0.A04, bbi);
            int iALn = C1OP.A00(bfm).ALn(axnA04);
            int iA01 = HxS.A01(C3cH.A07(bfm, AuraTheme.INSTANCE));
            int i4 = iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1a = AnonymousClass001.A1a(AnonymousClass002.A1S(bfm, iALn, AnonymousClass003.A18(i4), bfm.A65(axnA04)), bfm, iA01);
            Object objAaT = bfm.AaT();
            if (zA1a || objAaT == C78N.A00) {
                float f = ATTRIBUTION_MARGIN;
                objAaT = new ALJ(Integer.valueOf(iA01), C0881AGi.A00, 8388659, axnA04.Abr(f), hatchMapDisplayMode == HatchMapDisplayMode.FULLSCREEN ? iALn + axnA04.Abr(FULLSCREEN_ATTRIBUTION_TOP_PADDING) : axnA04.Abr(f));
                bfm.Ai0(objAaT);
            }
            ALJ alj = (ALJ) objAaT;
            boolean zA1W = AnonymousClass002.A1W(bfm, alj, AnonymousClass003.A18(i4) | AnonymousClass004.A1K(iA0T) | AnonymousClass004.A1M(iA0T), AnonymousClass005.A1L(iA0T));
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == C78N.A00) {
                objAaT2 = baseMapConfig(hatchMapTheme, hatchMapDisplayMode, z, point, alj);
                bfm.Ai0(objAaT2);
            }
            ALE ale = (ALE) objAaT2;
            boolean zA1Y = AnonymousClass006.A1Y(3670016, iA0T);
            Object objAaT3 = bfm.AaT();
            if (zA1Y || objAaT3 == C78N.A00) {
                objAaT3 = new HatchMapSurfaceKt$HatchMapSurface$1$1(g0u2);
                BBI.A0O(bbi, objAaT3);
            }
            C9V8.A00(bfm, bRg2, ale, afr, g0u, (G0U) objAaT3, (iA0T & 14) | ((iA0T >> 15) & 896) | ((iA0T >> 6) & 7168), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(afr, hatchMapDisplayMode, hatchMapTheme, z, point, g0u, g0u2, bRg2, i, i2);
        }
    }

    public static final float getFULLSCREEN_MAP_CLOSE_TOP_PADDING() {
        return FULLSCREEN_MAP_CLOSE_TOP_PADDING;
    }
}
