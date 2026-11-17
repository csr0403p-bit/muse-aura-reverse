package com.facebook.aura.maps;

import X.AFz;
import X.AKO;
import X.AKQ;
import X.AOP;
import X.AVy;
import X.AXN;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0v5;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1743Apg;
import X.C1Cd;
import X.C1DG;
import X.C1OM;
import X.C1eL;
import X.C1er;
import X.C1qN;
import X.C2VU;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C8j3;
import X.EnumC04711Bv;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.header.view.HatchHeaderTitleAlignment;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache;
import com.facebook.aura.maps.model.HatchMapScene;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.LocalResultEventBus;
import com.facebook.aura.navigation.ResultEventBus;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.ui.sharedelement.HatchSharedElementKt;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import com.meta.maps.display.SDKInsets;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchFullscreenMapScreenKt {
    public static final float FULLSCREEN_CAMERA_HORIZONTAL_INSET = 5.0f;
    public static final float FULLSCREEN_MAP_CONTENT_TOP_SPACING;
    public static final float FULLSCREEN_MAP_HEADER_HEIGHT;

    /* renamed from: com.facebook.aura.maps.HatchFullscreenMapScreenKt$FullscreenMapCloseButton$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFullscreenMapScreenKt.FullscreenMapCloseButton(this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchFullscreenMapScreenKt$FullscreenMapContent$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchMapAgenticSceneFlowCache $cache;
        public final /* synthetic */ SDKInsets $cameraInsets;
        public final /* synthetic */ G0U<String, Unit> $onPlaceDetailsRequested;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ HatchMapScene $scene;
        public final /* synthetic */ MutableState<String> $selectionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HatchMapScene hatchMapScene, String str, HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache, SDKInsets sDKInsets, MutableState<String> mutableState, G0U<? super String, Unit> g0u) {
            super(2);
            this.$scene = hatchMapScene;
            this.$presentationId = str;
            this.$cache = hatchMapAgenticSceneFlowCache;
            this.$cameraInsets = sDKInsets;
            this.$selectionState = mutableState;
            this.$onPlaceDetailsRequested = g0u;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            HatchMapScene hatchMapScene = this.$scene;
            String str = this.$presentationId;
            HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache = this.$cache;
            HatchMapDisplayMode hatchMapDisplayMode = HatchMapDisplayMode.FULLSCREEN;
            C1062ATq c1062ATq = C10G.A01;
            SDKInsets sDKInsets = this.$cameraInsets;
            String strA05 = MutableState.A05(this.$selectionState);
            boolean zA65 = bfm.A65(this.$selectionState);
            MutableState<String> mutableState = this.$selectionState;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchFullscreenMapScreenKt$FullscreenMapContent$1$1$1(mutableState);
                BBI.A0T(bfm, objAaT);
            }
            G0U g0u = (G0U) objAaT;
            G0U<String, Unit> g0u2 = this.$onPlaceDetailsRequested;
            boolean zA652 = bfm.A65(this.$scene);
            HatchMapScene hatchMapScene2 = this.$scene;
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchFullscreenMapScreenKt$FullscreenMapContent$1$2$1(hatchMapScene2);
                BBI.A0T(bfm, objAaT2);
            }
            HatchMapHostKt.HatchMapHost(hatchMapScene, str, hatchMapAgenticSceneFlowCache, hatchMapDisplayMode, c1062ATq, sDKInsets, strA05, g0u, null, g0u2, (G0U) objAaT2, false, false, bfm, 27648, 0, 6400);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchFullscreenMapScreenKt$FullscreenMapContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchMapAgenticSceneFlowCache $cache;
        public final /* synthetic */ SDKInsets $cameraInsets;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onPlaceDetailsRequested;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ HatchMapScene $scene;
        public final /* synthetic */ MutableState<String> $selectionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(HatchMapScene hatchMapScene, String str, HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache, SDKInsets sDKInsets, MutableState<String> mutableState, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$scene = hatchMapScene;
            this.$presentationId = str;
            this.$cache = hatchMapAgenticSceneFlowCache;
            this.$cameraInsets = sDKInsets;
            this.$selectionState = mutableState;
            this.$onPlaceDetailsRequested = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFullscreenMapScreenKt.FullscreenMapContent(this.$scene, this.$presentationId, this.$cache, this.$cameraInsets, this.$selectionState, this.$onPlaceDetailsRequested, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchFullscreenMapScreenKt$HatchFullscreenMapChrome$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C126651 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126651(Function0<Unit> function0) {
            super(2);
            this.$onDismiss = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                BS0 bs0 = BRg.A00;
                BRg bRgA0C = C10G.A0C(bs0, 48.0f, HatchFullscreenMapScreenKt.FULLSCREEN_MAP_HEADER_HEIGHT);
                Function0<Unit> function0 = this.$onDismiss;
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0C);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                HatchFullscreenMapScreenKt.FullscreenMapCloseButton(function0, C0z7.A00.A4C(C2VU.A07, bs0), bfm, 0, 0);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchFullscreenMapScreenKt$HatchFullscreenMapChrome$2, reason: invalid class name and case insensitive filesystem */
    public final class C126662 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ G2j<SDKInsets, C1DG, BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C126662(G2j<? super SDKInsets, ? super C1DG, ? super BFM, ? super Integer, Unit> g2j) {
            super(4);
            this.$content = g2j;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1349invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1349invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = i;
            if ((i & 6) == 0) {
                iA04 = i | AnonymousClass004.A04(bfm, f);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 131, 130), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BBI bbi = (BBI) bfm;
            AXN axnA04 = AKO.A04(Am0.A04, bbi);
            boolean zA1S = AnonymousClass002.A1S(bfm, C1743Apg.A01(bfm).A04.ACy(axnA04), bfm.A65(axnA04), AnonymousClass001.A1M(iA04));
            Object objAaT = bfm.AaT();
            if (zA1S || objAaT == C78N.A00) {
                double d = HatchFullscreenMapScreenKt.FULLSCREEN_CAMERA_HORIZONTAL_INSET;
                objAaT = new SDKInsets(d, f, d, HatchMapAgenticSceneOverlayKt.FULLSCREEN_CAROUSEL_BOTTOM_PADDING + axnA04.Agy(r2));
                BBI.A0O(bbi, objAaT);
            }
            AnonymousClass001.A1F(objAaT, C8j3.A0k(f), bfm, this.$content, (iA04 << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchFullscreenMapScreenKt$HatchFullscreenMapChrome$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G2j<SDKInsets, C1DG, BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function0<Unit> function0, BRg bRg, G2j<? super SDKInsets, ? super C1DG, ? super BFM, ? super Integer, Unit> g2j, int i, int i2) {
            super(2);
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$content = g2j;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFullscreenMapScreenKt.HatchFullscreenMapChrome(this.$onDismiss, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchFullscreenMapScreenKt$HatchFullscreenMapPresentationEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C126672 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $presentationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126672(String str, int i) {
            super(2);
            this.$presentationId = str;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFullscreenMapScreenKt.HatchFullscreenMapPresentationEffect(this.$presentationId, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchFullscreenMapScreenKt$HatchFullscreenMapScreen$1, reason: invalid class name and case insensitive filesystem */
    public final class C126681 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $initialSelectedArtifactId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ boolean $openPlaceDetailsOnArrival;
        public final /* synthetic */ String $presentationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126681(String str, Function0<Unit> function0, BRg bRg, String str2, boolean z, int i, int i2) {
            super(2);
            this.$presentationId = str;
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$initialSelectedArtifactId = str2;
            this.$openPlaceDetailsOnArrival = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFullscreenMapScreenKt.HatchFullscreenMapScreen(this.$presentationId, this.$onDismiss, this.$modifier, this.$initialSelectedArtifactId, this.$openPlaceDetailsOnArrival, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchFullscreenMapScreenKt$HatchFullscreenMapScreen$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G2j<SDKInsets, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ HatchMapAgenticSceneFlowCache $cache;
        public final /* synthetic */ G0U<String, Unit> $openPlaceDetails;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ HatchMapScene $scene;
        public final /* synthetic */ MutableState<String> $selectionState;

        /* renamed from: invoke-ziNgDLE, reason: not valid java name */
        public final void m1350invokeziNgDLE(SDKInsets sDKInsets, float f, BFM bfm, int i) {
            C7384Etj.A0Y(sDKInsets, 0);
            HatchFullscreenMapScreenKt.FullscreenMapContent(this.$scene, this.$presentationId, this.$cache, sDKInsets, this.$selectionState, this.$openPlaceDetails, C10G.A01, bfm, ((i << 9) & 7168) | 1572864, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(HatchMapScene hatchMapScene, String str, HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache, MutableState<String> mutableState, G0U<? super String, Unit> g0u) {
            super(4);
            this.$scene = hatchMapScene;
            this.$presentationId = str;
            this.$cache = hatchMapAgenticSceneFlowCache;
            this.$selectionState = mutableState;
            this.$openPlaceDetails = g0u;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(SDKInsets sDKInsets, C1DG c1dg, BFM bfm, Integer num) {
            m1350invokeziNgDLE(sDKInsets, c1dg.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchFullscreenMapScreenKt$HatchFullscreenMapScreen$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $initialSelectedArtifactId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ boolean $openPlaceDetailsOnArrival;
        public final /* synthetic */ String $presentationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(String str, Function0<Unit> function0, BRg bRg, String str2, boolean z, int i, int i2) {
            super(2);
            this.$presentationId = str;
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$initialSelectedArtifactId = str2;
            this.$openPlaceDetailsOnArrival = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFullscreenMapScreenKt.HatchFullscreenMapScreen(this.$presentationId, this.$onDismiss, this.$modifier, this.$initialSelectedArtifactId, this.$openPlaceDetailsOnArrival, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchFullscreenMapScreenKt$PlaceDetailsOnArrivalEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C126692 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $artifactId;
        public final /* synthetic */ G0U<String, Unit> $openPlaceDetails;
        public final /* synthetic */ String $presentationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C126692(String str, String str2, G0U<? super String, Unit> g0u, int i) {
            super(2);
            this.$presentationId = str;
            this.$artifactId = str2;
            this.$openPlaceDetails = g0u;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFullscreenMapScreenKt.PlaceDetailsOnArrivalEffect(this.$presentationId, this.$artifactId, this.$openPlaceDetails, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchFullscreenMapPresentationEffect(String str, BFM bfm, int i) {
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-767106689);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            BBI bbi = (BBI) bfm;
            HatchMapPresentationState companion = HatchMapPresentationState.Companion.getInstance(AKO.A06(LocalUserSessionKt.LocalUserSession, bbi));
            boolean zA1Z = AnonymousClass002.A1Z(((C1Cd) AKO.A07(C1eL.A00, bbi)).AM0().A07.getValue(), EnumC04711Bv.A02);
            Boolean boolValueOf = Boolean.valueOf(zA1Z);
            boolean zA1Q = AnonymousClass003.A1Q(bfm, companion, zA1Z) | AnonymousClass001.A1M(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new HatchFullscreenMapScreenKt$HatchFullscreenMapPresentationEffect$1$1(zA1Z, companion, str);
                BBI.A0O(bbi, objAaT);
            }
            C78e.A01(bfm, companion, str, boolValueOf, (G0U) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126672(str, i);
        }
    }

    public static final String hatchMapSharedElementKey(String str) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0M("hatch_map:", str);
    }

    static {
        float f = HatchMapSurfaceKt.FULLSCREEN_MAP_CLOSE_TOP_PADDING + 48.0f;
        FULLSCREEN_MAP_HEADER_HEIGHT = f;
        FULLSCREEN_MAP_CONTENT_TOP_SPACING = f - 60.0f;
    }

    public static final void FullscreenMapCloseButton(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1663656450);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206ed);
            BRg bRgA07 = C10G.A07(bRg2, 48.0f);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new C1qN();
                BBI.A0T(bfm, objAaT);
            }
            BRg bRgA01 = C0v5.A01(null, (InterfaceC1072AWd) objAaT, bRgA07, C3cG.A0A(0), null, function0, true);
            boolean zA65 = bfm.A65(strA01) | AnonymousClass003.A1B(iA0T);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new HatchFullscreenMapScreenKt$FullscreenMapCloseButton$2$1(strA01, function0);
                BBI.A0T(bfm, objAaT2);
            }
            BRg bRgA0X = AnonymousClass001.A0X(bRgA01, objAaT2);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0X);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0J);
            AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(BOf.A00(bfm, R.drawable.meta_ai_icons_cross_regular_cropped, 0), strA01, function0, C0z7.A00.A4C(C2VU.A0D, BRg.A00), false, 36.0f, AuraIconSize.SMALL, null, null, false, false, bfm, 1769472 | AVy.$stable | ((iA0T << 6) & 896), 0, 1936);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(function0, bRg2, i, i2);
        }
    }

    public static final void FullscreenMapContent(HatchMapScene hatchMapScene, String str, HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache, SDKInsets sDKInsets, MutableState<String> mutableState, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1716026451);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchMapScene) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, hatchMapAgenticSceneFlowCache);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, sDKInsets);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, mutableState);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0u);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchSharedElementKt.HatchSharedElement(hatchMapSharedElementKey(str), C1OM.A00, bRg2, null, null, null, B1V.A00(bfm, new AnonymousClass1(hatchMapScene, str, hatchMapAgenticSceneFlowCache, sDKInsets, mutableState, g0u), 1437194083), bfm, ((iA0d >> 12) & 896) | 1572912, 56);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchMapScene, str, hatchMapAgenticSceneFlowCache, sDKInsets, mutableState, g0u, bRg2, i, i2);
        }
    }

    public static final void HatchFullscreenMapChrome(Function0<Unit> function0, BRg bRg, G2j<? super SDKInsets, ? super C1DG, ? super BFM, ? super Integer, Unit> g2j, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(function0, 0, g2j);
        bfm.AgG(-788619949);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g2j);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.PrimaryScreen.INSTANCE, bRg2, AuraContentRole.Immersive, 0L, null, null, function0, HatchHeaderTitleAlignment.HIDDEN, false, false, 0, null, null, null, null, null, B1V.A00(bfm, new C126651(function0), -846381984), 0L, 0L, null, FULLSCREEN_MAP_CONTENT_TOP_SPACING, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new C126662(g2j), -963370280), bfm, AnonymousClass001.A05(iA0T << 18, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 817889670), 1572864, 805306422, 533658936);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(function0, bRg2, g2j, i, i2);
        }
    }

    public static final void HatchFullscreenMapScreen(String str, Function0<Unit> function0, BRg bRg, String str2, boolean z, BFM bfm, int i, int i2) {
        G0V<? super BFM, ? super Integer, Unit> anonymousClass7;
        BBb bBbAAc;
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(str, function0);
        bfm.AgG(-1372623330);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            HatchMapScene hatchMapSceneScene = HatchMapSceneRegistry.Companion.getInstance(AKO.A06(LocalUserSessionKt.LocalUserSession, bbi)).scene(str);
            if (hatchMapSceneScene == null || !HatchNativeMapRenderer.INSTANCE.isEnabled()) {
                bfm.AgE(562358153);
                HatchMapSceneRegistryKt.LeaveEffect(str, function0, bfm, iA0d & 126);
                bBbAAc = AnonymousClass001.A0L(bfm, bbi);
                if (bBbAAc != null) {
                    anonymousClass7 = new C126681(str, function0, bRg2, str2, z, i, i2);
                    bBbAAc.A06 = anonymousClass7;
                }
                return;
            }
            bfm.AgE(562414852);
            BBI.A0R(bbi, zA1b);
            int i4 = iA0d & 14;
            HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCacheRememberHatchMapCache = HatchMapPresentationKt.rememberHatchMapCache(str, hatchMapSceneScene, bfm, i4);
            ResultEventBus current = LocalResultEventBus.INSTANCE.getCurrent(bfm, 6);
            String strA0M = FGI.A0M("hatch_fullscreen_map_selection:", str);
            Object[] objArr = {str};
            boolean zA1M = AnonymousClass004.A1M(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new HatchFullscreenMapScreenKt$HatchFullscreenMapScreen$selectionState$1$1(str2);
                BBI.A0O(bbi, objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            HatchFullscreenMapPresentationEffect(str, bfm, i4);
            boolean zA1O = AnonymousClass003.A1O(bfm, current, strA0M, bfm.A65(mutableStateA0N));
            Object objAaT2 = bfm.AaT();
            if (zA1O || objAaT2 == C78N.A00) {
                objAaT2 = new HatchFullscreenMapScreenKt$HatchFullscreenMapScreen$2$1(mutableStateA0N, current, strA0M);
                BBI.A0O(bbi, objAaT2);
            }
            C78e.A01(bfm, str, current, strA0M, (G0U) objAaT2);
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            boolean zA67 = bfm.A67(auraNavigatorA05) | AnonymousClass003.A17(i4);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchFullscreenMapScreenKt$HatchFullscreenMapScreen$openPlaceDetails$1$1(auraNavigatorA05, str);
                BBI.A0O(bbi, objAaT3);
            }
            G0U g0u = (G0U) objAaT3;
            PlaceDetailsOnArrivalEffect(str, z ? str2 : null, g0u, bfm, i4);
            Object[] objArr2 = {str};
            Object objAaT4 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT4 == obj) {
                objAaT4 = HatchFullscreenMapScreenKt$HatchFullscreenMapScreen$impressionKey$1$1.INSTANCE;
                bfm.Ai0(objAaT4);
            }
            long jA05 = C3cG.A05(AFz.A03(bfm, (Function0) objAaT4, objArr2));
            boolean zA1I = AnonymousClass004.A1I(iA0d);
            Object objAaT5 = bfm.AaT();
            if (zA1I || objAaT5 == obj) {
                objAaT5 = new HatchFullscreenMapScreenKt$HatchFullscreenMapScreen$4$1(function0);
                BBI.A0O(bbi, objAaT5);
            }
            Function0 function02 = (Function0) objAaT5;
            boolean zA64 = bfm.A64(jA05) | AnonymousClass003.A17(i4);
            Object objAaT6 = bfm.AaT();
            if (zA64 || objAaT6 == obj) {
                objAaT6 = HatchMapAnalytics.INSTANCE.fullscreenMapImpression(str, jA05);
                bfm.Ai0(objAaT6);
            }
            HatchFullscreenMapChrome(function02, bRg2.then((BRg) objAaT6), B1V.A00(bfm, new AnonymousClass6(hatchMapSceneScene, str, hatchMapAgenticSceneFlowCacheRememberHatchMapCache, mutableStateA0N, g0u), 2131247452), bfm, 384, zA1b ? 1 : 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass7 = new AnonymousClass7(str, function0, bRg2, str2, z, i, i2);
            bBbAAc.A06 = anonymousClass7;
        }
    }

    public static final void PlaceDetailsOnArrivalEffect(String str, String str2, G0U<? super String, Unit> g0u, BFM bfm, int i) {
        bfm.AgG(-89627797);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            Object[] objArr = {str};
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchFullscreenMapScreenKt$PlaceDetailsOnArrivalEffect$hasOpened$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            BBI bbi = (BBI) bfm;
            AOP<EnumC04711Bv> aopAM0 = ((C1Cd) AKO.A07(C1eL.A00, bbi)).AM0();
            MutableState mutableStateA00 = C1er.A00(bfm, g0u);
            boolean zA1P = AnonymousClass003.A1P(bfm, aopAM0, mutableStateA00, C8j3.A1V(bfm, mutableStateA0N, AnonymousClass001.A1O(iA0d)));
            Object objAaT2 = bfm.AaT();
            if (zA1P || objAaT2 == obj) {
                objAaT2 = new HatchFullscreenMapScreenKt$PlaceDetailsOnArrivalEffect$1$1(str2, mutableStateA0N, aopAM0, mutableStateA00, null);
                BBI.A0O(bbi, objAaT2);
            }
            AnonymousClass001.A1A(bfm, objAaT2, aopAM0, str2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126692(str, str2, g0u, i);
        }
    }
}
