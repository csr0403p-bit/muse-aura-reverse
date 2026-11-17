package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.C1DG;
import X.C1er;
import X.C2VU;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C8j3;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HrB;
import X.InterfaceC05151eP;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache;
import com.facebook.aura.maps.model.HatchMapScene;
import com.facebook.common.dextricks.RuntimeInternals;
import com.meta.maps.display.SDKInsets;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchMapHostKt {

    /* renamed from: com.facebook.aura.maps.HatchMapHostKt$HatchMapHost$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchMapAgenticSceneFlowCache $cache;
        public final /* synthetic */ SDKInsets $cameraInsets;
        public final /* synthetic */ HatchMapDisplayMode $displayMode;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onExpand;
        public final /* synthetic */ G0U<String, Unit> $onMarkerTapped;
        public final /* synthetic */ G0U<String, Unit> $onPlaceDetailsRequested;
        public final /* synthetic */ G0U<String, Unit> $onSelectedArtifactIdChanged;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ HatchMapScene $scene;
        public final /* synthetic */ String $selectedArtifactId;
        public final /* synthetic */ boolean $selectsFirstElementOnEnter;
        public final /* synthetic */ boolean $showsPlaceCarousel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HatchMapScene hatchMapScene, String str, HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache, HatchMapDisplayMode hatchMapDisplayMode, BRg bRg, SDKInsets sDKInsets, String str2, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super String, Unit> g0u4, boolean z, boolean z2, int i, int i2, int i3) {
            super(2);
            this.$scene = hatchMapScene;
            this.$presentationId = str;
            this.$cache = hatchMapAgenticSceneFlowCache;
            this.$displayMode = hatchMapDisplayMode;
            this.$modifier = bRg;
            this.$cameraInsets = sDKInsets;
            this.$selectedArtifactId = str2;
            this.$onSelectedArtifactIdChanged = g0u;
            this.$onExpand = g0u2;
            this.$onPlaceDetailsRequested = g0u3;
            this.$onMarkerTapped = g0u4;
            this.$showsPlaceCarousel = z;
            this.$selectsFirstElementOnEnter = z2;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMapHostKt.HatchMapHost(this.$scene, this.$presentationId, this.$cache, this.$displayMode, this.$modifier, this.$cameraInsets, this.$selectedArtifactId, this.$onSelectedArtifactIdChanged, this.$onExpand, this.$onPlaceDetailsRequested, this.$onMarkerTapped, this.$showsPlaceCarousel, this.$selectsFirstElementOnEnter, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchMapHostKt$HatchMapHost$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ HatchMapDisplayMode $displayMode;
        public final /* synthetic */ HatchMapFlowController $flowController;
        public final /* synthetic */ G0U<C1DG, Unit> $onCarouselSectionHeightChanged;
        public final /* synthetic */ G0U<String, Unit> $onExpand;
        public final /* synthetic */ boolean $showsPlaceCarousel;

        public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
            C7384Etj.A0Y(interfaceC05151eP, 0);
            if ((i & 6) == 0) {
                i |= AnonymousClass004.A0d(bfm, interfaceC05151eP);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (this.$showsPlaceCarousel) {
                bfm.AgE(-1173716954);
                HatchMapNavigationFlow hatchMapNavigationFlow = (HatchMapNavigationFlow) C1BO.A07(bfm, this.$flowController.topFlow);
                if (hatchMapNavigationFlow == null) {
                    bfm.AgE(-1173612578);
                } else {
                    bfm.AgE(-1173612577);
                    G0U<C1DG, Unit> g0u = this.$onCarouselSectionHeightChanged;
                    bfm.Ag8(-1719158289, hatchMapNavigationFlow);
                    HatchMapAgenticSceneOverlayKt.HatchMapFlowOverlay(interfaceC05151eP, (HatchMapFlowPresentation) C1BO.A07(bfm, hatchMapNavigationFlow.getPresentation()), g0u, null, bfm, i & 14, 4);
                    AnonymousClass001.A1D(bfm);
                }
                AnonymousClass001.A1D(bfm);
            } else if (this.$displayMode != HatchMapDisplayMode.INLINE || this.$onExpand == null) {
                bfm.AgE(-1173134774);
            } else {
                bfm.AgE(-1173297183);
                boolean zA65 = bfm.A65(this.$onExpand);
                G0U<String, Unit> g0u2 = this.$onExpand;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchMapHostKt$HatchMapHost$4$2$1(g0u2);
                    BBI.A0T(bfm, objAaT);
                }
                HatchMapAgenticSceneOverlayKt.HatchMapExpandButton((Function0) objAaT, interfaceC05151eP.A4C(C2VU.A0D, BRg.A00), bfm, 0, 0);
            }
            AnonymousClass001.A1D(bfm);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(boolean z, HatchMapFlowController hatchMapFlowController, HatchMapDisplayMode hatchMapDisplayMode, G0U<? super String, Unit> g0u, G0U<? super C1DG, Unit> g0u2) {
            super(3);
            this.$showsPlaceCarousel = z;
            this.$flowController = hatchMapFlowController;
            this.$displayMode = hatchMapDisplayMode;
            this.$onExpand = g0u;
            this.$onCarouselSectionHeightChanged = g0u2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchMapHostKt$HatchMapHost$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchMapAgenticSceneFlowCache $cache;
        public final /* synthetic */ SDKInsets $cameraInsets;
        public final /* synthetic */ HatchMapDisplayMode $displayMode;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onExpand;
        public final /* synthetic */ G0U<String, Unit> $onMarkerTapped;
        public final /* synthetic */ G0U<String, Unit> $onPlaceDetailsRequested;
        public final /* synthetic */ G0U<String, Unit> $onSelectedArtifactIdChanged;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ HatchMapScene $scene;
        public final /* synthetic */ String $selectedArtifactId;
        public final /* synthetic */ boolean $selectsFirstElementOnEnter;
        public final /* synthetic */ boolean $showsPlaceCarousel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(HatchMapScene hatchMapScene, String str, HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache, HatchMapDisplayMode hatchMapDisplayMode, BRg bRg, SDKInsets sDKInsets, String str2, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super String, Unit> g0u4, boolean z, boolean z2, int i, int i2, int i3) {
            super(2);
            this.$scene = hatchMapScene;
            this.$presentationId = str;
            this.$cache = hatchMapAgenticSceneFlowCache;
            this.$displayMode = hatchMapDisplayMode;
            this.$modifier = bRg;
            this.$cameraInsets = sDKInsets;
            this.$selectedArtifactId = str2;
            this.$onSelectedArtifactIdChanged = g0u;
            this.$onExpand = g0u2;
            this.$onPlaceDetailsRequested = g0u3;
            this.$onMarkerTapped = g0u4;
            this.$showsPlaceCarousel = z;
            this.$selectsFirstElementOnEnter = z2;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMapHostKt.HatchMapHost(this.$scene, this.$presentationId, this.$cache, this.$displayMode, this.$modifier, this.$cameraInsets, this.$selectedArtifactId, this.$onSelectedArtifactIdChanged, this.$onExpand, this.$onPlaceDetailsRequested, this.$onMarkerTapped, this.$showsPlaceCarousel, this.$selectsFirstElementOnEnter, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchMapHostKt$MapHostCallbacksEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchMapAgenticSceneFlow $flow;
        public final /* synthetic */ G0U<String, Unit> $onExpand;
        public final /* synthetic */ G0U<String, Unit> $onMarkerTapped;
        public final /* synthetic */ G0U<String, Unit> $onPlaceDetailsRequested;
        public final /* synthetic */ G0U<String, Unit> $onSelectedArtifactIdChanged;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super String, Unit> g0u4, int i) {
            super(2);
            this.$flow = hatchMapAgenticSceneFlow;
            this.$onSelectedArtifactIdChanged = g0u;
            this.$onExpand = g0u2;
            this.$onPlaceDetailsRequested = g0u3;
            this.$onMarkerTapped = g0u4;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMapHostKt.MapHostCallbacksEffect(this.$flow, this.$onSelectedArtifactIdChanged, this.$onExpand, this.$onPlaceDetailsRequested, this.$onMarkerTapped, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchMapHostKt$MapSelectionEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C126742 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $clearsOnNull;
        public final /* synthetic */ HatchMapAgenticSceneFlow $flow;
        public final /* synthetic */ String $selectedArtifactId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126742(HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow, String str, boolean z, int i) {
            super(2);
            this.$flow = hatchMapAgenticSceneFlow;
            this.$selectedArtifactId = str;
            this.$clearsOnNull = z;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMapHostKt.MapSelectionEffect(this.$flow, this.$selectedArtifactId, this.$clearsOnNull, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchMapHostKt$MapThemeEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C126752 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchMapAgenticSceneFlow $flow;
        public final /* synthetic */ boolean $isDarkMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126752(HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow, boolean z, int i) {
            super(2);
            this.$flow = hatchMapAgenticSceneFlow;
            this.$isDarkMode = z;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMapHostKt.MapThemeEffect(this.$flow, this.$isDarkMode, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: withCarouselInset-3ABfNKs, reason: not valid java name */
    public static final SDKInsets m1354withCarouselInset3ABfNKs(SDKInsets sDKInsets, float f) {
        if (sDKInsets == null) {
            sDKInsets = new SDKInsets();
        }
        return new SDKInsets(sDKInsets.left, sDKInsets.top, sDKInsets.right, sDKInsets.bottom + f);
    }

    /* renamed from: MapDisplayModeEffect--jt2gSs, reason: not valid java name */
    public static final void m1352MapDisplayModeEffectjt2gSs(HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow, HatchMapDisplayMode hatchMapDisplayMode, SDKInsets sDKInsets, float f, C1BO<C1DG> c1bo, BFM bfm, int i) {
        bfm.AgG(979084962);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchMapAgenticSceneFlow, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass005.A09(bfm, hatchMapDisplayMode);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, sDKInsets);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A07(bfm, f);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, c1bo);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            float f2 = ((C1DG) HrB.A01(C8j3.A0k(f), c1bo.getValue())).A00;
            boolean zA1I = AnonymousClass003.A1I(bfm, sDKInsets, f2);
            Object objAaT = bfm.AaT();
            if (zA1I || objAaT == C78N.A00) {
                objAaT = m1354withCarouselInset3ABfNKs(sDKInsets, f2);
                bfm.Ai0(objAaT);
            }
            SDKInsets sDKInsets2 = (SDKInsets) objAaT;
            boolean zA1V = AnonymousClass002.A1V(bfm, sDKInsets2, (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchMapAgenticSceneFlow)), AnonymousClass001.A1O(iA05));
            Object objAaT2 = bfm.AaT();
            if (zA1V || objAaT2 == C78N.A00) {
                objAaT2 = new HatchMapHostKt$MapDisplayModeEffect$1$1(hatchMapAgenticSceneFlow, hatchMapDisplayMode, sDKInsets2);
                BBI.A0T(bfm, objAaT2);
            }
            C78e.A01(bfm, hatchMapAgenticSceneFlow, hatchMapDisplayMode, sDKInsets2, (G0U) objAaT2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchMapHostKt$MapDisplayModeEffect$2(hatchMapAgenticSceneFlow, hatchMapDisplayMode, sDKInsets, f, c1bo, i);
        }
    }

    public static final void MapHostCallbacksEffect(HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super String, Unit> g0u4, BFM bfm, int i) {
        bfm.AgG(445046333);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchMapAgenticSceneFlow, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0u3);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, g0u4);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            MutableState mutableStateA00 = C1er.A00(bfm, g0u);
            MutableState mutableStateA002 = C1er.A00(bfm, g0u2);
            MutableState mutableStateA003 = C1er.A00(bfm, g0u3);
            MutableState mutableStateA004 = C1er.A00(bfm, g0u4);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = C3cG.A0T();
                bfm.Ai0(objAaT);
            }
            Object[] objArr = {hatchMapAgenticSceneFlow, objAaT, Boolean.valueOf(AnonymousClass002.A1X(g0u2)), Boolean.valueOf(AnonymousClass002.A1X(g0u3)), Boolean.valueOf(AnonymousClass002.A1X(g0u4))};
            boolean zA1W = AnonymousClass002.A1W(bfm, mutableStateA004, AnonymousClass002.A1W(bfm, mutableStateA003, AnonymousClass002.A1W(bfm, mutableStateA002, AnonymousClass004.A1K(iA05), AnonymousClass003.A1O(bfm, objAaT, mutableStateA00, (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchMapAgenticSceneFlow)))), AnonymousClass004.A1M(iA05)), (iA05 & 57344) == 16384);
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == obj) {
                objAaT2 = new HatchMapHostKt$MapHostCallbacksEffect$1$1(hatchMapAgenticSceneFlow, objAaT, g0u2, g0u3, g0u4, mutableStateA00, mutableStateA002, mutableStateA003, mutableStateA004);
                BBI.A0T(bfm, objAaT2);
            }
            C78e.A07(bfm, (G0U) objAaT2, objArr);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchMapAgenticSceneFlow, g0u, g0u2, g0u3, g0u4, i);
        }
    }

    public static final void MapSelectionEffect(HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow, String str, boolean z, BFM bfm, int i) {
        bfm.AgG(-1647078914);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchMapAgenticSceneFlow, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA1C = AnonymousClass003.A1C(iA05) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchMapAgenticSceneFlow))) | ((iA05 & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new HatchMapHostKt$MapSelectionEffect$1$1(str, hatchMapAgenticSceneFlow, z);
                BBI.A0T(bfm, objAaT);
            }
            C78e.A01(bfm, hatchMapAgenticSceneFlow, str, boolValueOf, (G0U) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126742(hatchMapAgenticSceneFlow, str, z, i);
        }
    }

    public static final void MapThemeEffect(HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow, boolean z, BFM bfm, int i) {
        bfm.AgG(267365080);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchMapAgenticSceneFlow, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA1O = ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchMapAgenticSceneFlow))) | AnonymousClass001.A1O(iA05);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new HatchMapHostKt$MapThemeEffect$1$1(hatchMapAgenticSceneFlow, z);
                BBI.A0T(bfm, objAaT);
            }
            AnonymousClass001.A19(bfm, objAaT, hatchMapAgenticSceneFlow, boolValueOf);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126752(hatchMapAgenticSceneFlow, z, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchMapHost(com.facebook.aura.maps.model.HatchMapScene r32, java.lang.String r33, com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache r34, com.facebook.aura.maps.HatchMapDisplayMode r35, X.BRg r36, com.meta.maps.display.SDKInsets r37, java.lang.String r38, X.G0U<? super java.lang.String, kotlin.Unit> r39, X.G0U<? super java.lang.String, kotlin.Unit> r40, X.G0U<? super java.lang.String, kotlin.Unit> r41, X.G0U<? super java.lang.String, kotlin.Unit> r42, boolean r43, boolean r44, X.BFM r45, int r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.maps.HatchMapHostKt.HatchMapHost(com.facebook.aura.maps.model.HatchMapScene, java.lang.String, com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache, com.facebook.aura.maps.HatchMapDisplayMode, X.BRg, com.meta.maps.display.SDKInsets, java.lang.String, X.G0U, X.G0U, X.G0U, X.G0U, boolean, boolean, X.BFM, int, int, int):void");
    }
}
