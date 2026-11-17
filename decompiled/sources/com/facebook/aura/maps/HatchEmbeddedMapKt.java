package com.facebook.aura.maps;

import X.AKO;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1062ATq;
import X.C10G;
import X.C1DG;
import X.C1OM;
import X.C7384Etj;
import X.C78N;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache;
import com.facebook.aura.maps.model.HatchMapScene;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.sharedelement.HatchSharedElementKt;
import com.facebook.common.dextricks.RuntimeInternals;
import com.meta.maps.display.SDKInsets;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchEmbeddedMapKt {

    /* renamed from: com.facebook.aura.maps.HatchEmbeddedMapKt$HatchEmbeddedMap$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onExpand;
        public final /* synthetic */ G0U<String, Unit> $onMarkerTapped;
        public final /* synthetic */ G0U<String, Unit> $onSelectedArtifactIdChanged;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ HatchMapPresentationState $presentationState;
        public final /* synthetic */ HatchMapScene $scene;
        public final /* synthetic */ String $selectedArtifactId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HatchMapPresentationState hatchMapPresentationState, String str, HatchMapScene hatchMapScene, String str2, G0U<? super String, Unit> g0u, Function0<Unit> function0, G0U<? super String, Unit> g0u2) {
            super(2);
            this.$presentationState = hatchMapPresentationState;
            this.$presentationId = str;
            this.$scene = hatchMapScene;
            this.$selectedArtifactId = str2;
            this.$onSelectedArtifactIdChanged = g0u;
            this.$onExpand = function0;
            this.$onMarkerTapped = g0u2;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (this.$presentationState.isFullscreenPresented(this.$presentationId)) {
                bfm.AgE(-621002584);
            } else {
                bfm.AgE(-621567652);
                HatchMapScene hatchMapScene = this.$scene;
                String str = this.$presentationId;
                HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCacheRememberHatchMapCache = HatchMapPresentationKt.rememberHatchMapCache(str, hatchMapScene, bfm, 0);
                HatchMapDisplayMode hatchMapDisplayMode = HatchMapDisplayMode.INLINE;
                G0U g0u = null;
                C1062ATq c1062ATq = C10G.A01;
                String str2 = this.$selectedArtifactId;
                G0U<String, Unit> g0u2 = this.$onSelectedArtifactIdChanged;
                Function0<Unit> function0 = this.$onExpand;
                if (function0 == null) {
                    bfm.AgE(-621185733);
                } else {
                    boolean zA1Y = AnonymousClass001.A1Y(function0, bfm, -621185732);
                    Object objAaT = bfm.AaT();
                    if (zA1Y || objAaT == C78N.A00) {
                        objAaT = new HatchEmbeddedMapKt$HatchEmbeddedMap$1$1$1$1(function0);
                        BBI.A0T(bfm, objAaT);
                    }
                    g0u = (G0U) objAaT;
                }
                AnonymousClass001.A1D(bfm);
                HatchMapHostKt.HatchMapHost(hatchMapScene, str, hatchMapAgenticSceneFlowCacheRememberHatchMapCache, hatchMapDisplayMode, c1062ATq, null, str2, g0u2, g0u, null, this.$onMarkerTapped, false, false, bfm, 27648, 432, 544);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchEmbeddedMapKt$HatchEmbeddedMap$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onExpand;
        public final /* synthetic */ G0U<String, Unit> $onMarkerTapped;
        public final /* synthetic */ G0U<String, Unit> $onSelectedArtifactIdChanged;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ HatchMapScene $scene;
        public final /* synthetic */ String $selectedArtifactId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(HatchMapScene hatchMapScene, String str, String str2, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$scene = hatchMapScene;
            this.$presentationId = str;
            this.$selectedArtifactId = str2;
            this.$onSelectedArtifactIdChanged = g0u;
            this.$onMarkerTapped = g0u2;
            this.$onExpand = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchEmbeddedMapKt.HatchEmbeddedMap(this.$scene, this.$presentationId, this.$selectedArtifactId, this.$onSelectedArtifactIdChanged, this.$onMarkerTapped, this.$onExpand, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchEmbeddedMapKt$HatchFullscreenEmbeddedMap$1, reason: invalid class name and case insensitive filesystem */
    public final class C126631 extends AbstractC7559F3s implements G2j<SDKInsets, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ G0U<String, Unit> $onMarkerTapped;
        public final /* synthetic */ G0U<String, Unit> $onSelectedArtifactIdChanged;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ HatchMapScene $scene;
        public final /* synthetic */ String $selectedArtifactId;

        /* renamed from: com.facebook.aura.maps.HatchEmbeddedMapKt$HatchFullscreenEmbeddedMap$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02361 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ SDKInsets $cameraInsets;
            public final /* synthetic */ G0U<String, Unit> $onMarkerTapped;
            public final /* synthetic */ G0U<String, Unit> $onSelectedArtifactIdChanged;
            public final /* synthetic */ String $presentationId;
            public final /* synthetic */ HatchMapScene $scene;
            public final /* synthetic */ String $selectedArtifactId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C02361(HatchMapScene hatchMapScene, String str, SDKInsets sDKInsets, String str2, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2) {
                super(2);
                this.$scene = hatchMapScene;
                this.$presentationId = str;
                this.$cameraInsets = sDKInsets;
                this.$selectedArtifactId = str2;
                this.$onSelectedArtifactIdChanged = g0u;
                this.$onMarkerTapped = g0u2;
            }

            public final void invoke(BFM bfm, int i) {
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    bfm.Afo();
                    return;
                }
                HatchMapScene hatchMapScene = this.$scene;
                String str = this.$presentationId;
                HatchMapHostKt.HatchMapHost(hatchMapScene, str, HatchMapPresentationKt.rememberHatchMapCache(str, hatchMapScene, bfm, 0), HatchMapDisplayMode.FULLSCREEN, C10G.A01, this.$cameraInsets, this.$selectedArtifactId, this.$onSelectedArtifactIdChanged, null, null, this.$onMarkerTapped, false, false, bfm, 27648, 432, 768);
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        /* renamed from: invoke-ziNgDLE, reason: not valid java name */
        public final void m1348invokeziNgDLE(SDKInsets sDKInsets, float f, BFM bfm, int i) {
            C7384Etj.A0Y(sDKInsets, 0);
            HatchSharedElementKt.HatchSharedElement(HatchFullscreenMapScreenKt.hatchMapSharedElementKey(this.$presentationId), C1OM.A00, C10G.A01, null, null, null, B1V.A00(bfm, new C02361(this.$scene, this.$presentationId, sDKInsets, this.$selectedArtifactId, this.$onSelectedArtifactIdChanged, this.$onMarkerTapped), 1743746461), bfm, 1573296, 56);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C126631(String str, HatchMapScene hatchMapScene, String str2, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2) {
            super(4);
            this.$presentationId = str;
            this.$scene = hatchMapScene;
            this.$selectedArtifactId = str2;
            this.$onSelectedArtifactIdChanged = g0u;
            this.$onMarkerTapped = g0u2;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(SDKInsets sDKInsets, C1DG c1dg, BFM bfm, Integer num) {
            m1348invokeziNgDLE(sDKInsets, c1dg.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchEmbeddedMapKt$HatchFullscreenEmbeddedMap$2, reason: invalid class name and case insensitive filesystem */
    public final class C126642 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<String, Unit> $onMarkerTapped;
        public final /* synthetic */ G0U<String, Unit> $onSelectedArtifactIdChanged;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ HatchMapScene $scene;
        public final /* synthetic */ String $selectedArtifactId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C126642(HatchMapScene hatchMapScene, String str, String str2, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$scene = hatchMapScene;
            this.$presentationId = str;
            this.$selectedArtifactId = str2;
            this.$onSelectedArtifactIdChanged = g0u;
            this.$onMarkerTapped = g0u2;
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchEmbeddedMapKt.HatchFullscreenEmbeddedMap(this.$scene, this.$presentationId, this.$selectedArtifactId, this.$onSelectedArtifactIdChanged, this.$onMarkerTapped, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchEmbeddedMap(HatchMapScene hatchMapScene, String str, String str2, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A0y(hatchMapScene, str, g0u);
        C7384Etj.A0Y(g0u2, 4);
        bfm.AgG(-82709788);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchMapScene) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u2);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function0);
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
            HatchSharedElementKt.HatchSharedElement(FGI.A0M("hatch_map:", str), C1OM.A00, bRg2, null, null, null, B1V.A00(bfm, new AnonymousClass1(HatchMapPresentationState.Companion.getInstance(AKO.A06(LocalUserSessionKt.LocalUserSession, (BBI) bfm)), str, hatchMapScene, str2, g0u, function0, g0u2), -40820966), bfm, ((iA0d >> 12) & 896) | 1572912, 56);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchMapScene, str, str2, g0u, g0u2, function0, bRg2, i, i2);
        }
    }

    public static final void HatchFullscreenEmbeddedMap(HatchMapScene hatchMapScene, String str, String str2, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(hatchMapScene, 0);
        AnonymousClass005.A16(str, g0u, g0u2, function0, 1);
        bfm.AgG(1926454569);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchMapScene) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u2);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function0);
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
            HatchFullscreenMapScreenKt.HatchFullscreenMapPresentationEffect(str, bfm, (iA0d >> 3) & 14);
            int i4 = iA0d >> 15;
            HatchFullscreenMapScreenKt.HatchFullscreenMapChrome(function0, bRg2, B1V.A00(bfm, new C126631(str, hatchMapScene, str2, g0u, g0u2), -2028984985), bfm, (i4 & 14) | 384 | (i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126642(hatchMapScene, str, str2, g0u, g0u2, function0, bRg2, i, i2);
        }
    }
}
