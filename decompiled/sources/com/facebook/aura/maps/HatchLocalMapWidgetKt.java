package com.facebook.aura.maps;

import X.AKH;
import X.AKO;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C10G;
import X.C1D8;
import X.C1DM;
import X.C78N;
import X.C78e;
import X.FGI;
import X.G0U;
import X.G0V;
import com.facebook.aura.maps.HatchMapSceneRegistry;
import com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache;
import com.facebook.aura.maps.model.HatchMapScene;
import com.facebook.aura.partners.voice.session.impl.PreConnectLiveCaption;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.ui.sharedelement.HatchSharedElementKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class HatchLocalMapWidgetKt {
    public static final float LOCAL_MAP_HEIGHT = 345.0f;

    /* renamed from: com.facebook.aura.maps.HatchLocalMapWidgetKt$HatchLocalMapWidget$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchMapAgenticSceneFlowCache $cache;
        public final /* synthetic */ G0U<String, Unit> $onExpand;
        public final /* synthetic */ G0U<String, Unit> $onPlaceDetailsRequested;
        public final /* synthetic */ G0U<String, Unit> $onSelectedArtifactIdChanged;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ HatchMapPresentationState $presentationState;
        public final /* synthetic */ HatchMapScene $scene;
        public final /* synthetic */ String $selectedArtifactId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(HatchMapPresentationState hatchMapPresentationState, String str, HatchMapScene hatchMapScene, HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache, String str2, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3) {
            super(2);
            this.$presentationState = hatchMapPresentationState;
            this.$presentationId = str;
            this.$scene = hatchMapScene;
            this.$cache = hatchMapAgenticSceneFlowCache;
            this.$selectedArtifactId = str2;
            this.$onSelectedArtifactIdChanged = g0u;
            this.$onExpand = g0u2;
            this.$onPlaceDetailsRequested = g0u3;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (this.$presentationState.isFullscreenPresented(this.$presentationId)) {
                bfm.AgE(-2057325883);
            } else {
                bfm.AgE(-2057884224);
                HatchMapScene hatchMapScene = this.$scene;
                String str = this.$presentationId;
                HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache = this.$cache;
                HatchMapDisplayMode hatchMapDisplayMode = HatchMapDisplayMode.INLINE;
                BRg bRgThen = C10G.A01.then(HatchLocalMapWidgetKt.rememberInlineMapImpression(str, bfm, 0));
                String str2 = this.$selectedArtifactId;
                G0U<String, Unit> g0u = this.$onSelectedArtifactIdChanged;
                boolean zA65 = bfm.A65(this.$onExpand);
                G0U<String, Unit> g0u2 = this.$onExpand;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchLocalMapWidgetKt$HatchLocalMapWidget$3$1$1(g0u2);
                    BBI.A0T(bfm, objAaT);
                }
                HatchMapHostKt.HatchMapHost(hatchMapScene, str, hatchMapAgenticSceneFlowCache, hatchMapDisplayMode, bRgThen, null, str2, g0u, (G0U) objAaT, this.$onPlaceDetailsRequested, null, false, false, bfm, 3072, 0, PreConnectLiveCaption.LEAD_SAMPLES);
            }
            AnonymousClass002.A19(bfm);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchLocalMapWidgetKt$HatchLocalMapWidget$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchMapAgenticSceneFlowCache $cache;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onExpand;
        public final /* synthetic */ G0U<String, Unit> $onPlaceDetailsRequested;
        public final /* synthetic */ G0U<String, Unit> $onSelectedArtifactIdChanged;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ HatchMapScene $scene;
        public final /* synthetic */ String $selectedArtifactId;
        public final /* synthetic */ C1DM $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(HatchMapScene hatchMapScene, String str, HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache, G0U<? super String, Unit> g0u, BRg bRg, C1DM c1dm, String str2, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, int i, int i2) {
            super(2);
            this.$scene = hatchMapScene;
            this.$presentationId = str;
            this.$cache = hatchMapAgenticSceneFlowCache;
            this.$onExpand = g0u;
            this.$modifier = bRg;
            this.$shape = c1dm;
            this.$selectedArtifactId = str2;
            this.$onSelectedArtifactIdChanged = g0u2;
            this.$onPlaceDetailsRequested = g0u3;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLocalMapWidgetKt.HatchLocalMapWidget(this.$scene, this.$presentationId, this.$cache, this.$onExpand, this.$modifier, this.$shape, this.$selectedArtifactId, this.$onSelectedArtifactIdChanged, this.$onPlaceDetailsRequested, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchLocalMapWidget(HatchMapScene hatchMapScene, String str, HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache, G0U<? super String, Unit> g0u, BRg bRg, C1DM c1dm, String str2, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, BFM bfm, int i, int i2) {
        C1DM c1dmA00;
        BRg bRg2 = bRg;
        C1DM c1dm2 = c1dm;
        String str3 = str2;
        G0U<? super String, Unit> g0u4 = g0u3;
        G0U<? super String, Unit> g0u5 = g0u2;
        AnonymousClass005.A14(hatchMapScene, str, hatchMapAgenticSceneFlowCache, g0u);
        bfm.AgG(-593208761);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchMapScene) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, hatchMapAgenticSceneFlowCache);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        int i4 = i2 & 32;
        int iA0i = 196608;
        if (i4 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, c1dm2);
            iA0d |= iA0i;
        }
        int i5 = i2 & 64;
        int iA0j = 1572864;
        if (i5 != 0) {
            iA0d |= iA0j;
        } else if ((i & 1572864) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, str3);
            iA0d |= iA0j;
        }
        int i6 = i2 & 128;
        int iA0a = 12582912;
        if (i6 != 0) {
            iA0d |= iA0a;
        } else if ((i & 12582912) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, g0u5);
            iA0d |= iA0a;
        }
        int i7 = i2 & 256;
        int iA0b = 100663296;
        if (i7 != 0) {
            iA0d |= iA0b;
        } else if ((i & 100663296) == 0) {
            i7 = 0;
            iA0b = AnonymousClass004.A0b(bfm, g0u4);
            iA0d |= iA0b;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 38347923, 38347922), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                c1dm2 = null;
            }
            if (i5 != 0) {
                str3 = null;
            }
            if (i6 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchLocalMapWidgetKt$HatchLocalMapWidget$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                g0u5 = (G0U) objAaT;
            }
            if (i7 != 0) {
                g0u4 = null;
            }
            HatchMapSceneRegistry.Companion companion = HatchMapSceneRegistry.Companion;
            AKH<AbstractC3358CGz> akh = LocalUserSessionKt.LocalUserSession;
            BBI bbi = (BBI) bfm;
            HatchMapSceneRegistry companion2 = companion.getInstance(AKO.A06(akh, bbi));
            HatchMapPresentationState companion3 = HatchMapPresentationState.Companion.getInstance(AKO.A06(akh, bbi));
            boolean zA67 = bfm.A67(companion2) | AnonymousClass004.A1I(iA0d) | ((iA0d & 14) == 4);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchLocalMapWidgetKt$HatchLocalMapWidget$2$1(companion2, str, hatchMapScene);
                BBI.A0O(bbi, objAaT2);
            }
            C78e.A01(bfm, str, hatchMapScene, companion2, (G0U) objAaT2);
            String strA0M = FGI.A0M("hatch_map:", str);
            if (c1dm2 == null) {
                bfm.AgE(1157056162);
                c1dmA00 = C1D8.A00(AuraTheme.INSTANCE.getDimensions(bfm, 6).bubbleCornerRadius);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1157055883);
                BBI.A0R(bbi, false);
                c1dmA00 = c1dm2;
            }
            HatchSharedElementKt.HatchSharedElement(strA0M, c1dmA00, C10G.A04(AnonymousClass001.A0R(bRg2), LOCAL_MAP_HEIGHT), null, null, null, B1V.A00(bfm, new AnonymousClass3(companion3, str, hatchMapScene, hatchMapAgenticSceneFlowCache, str3, g0u5, g0u, g0u4), -348527875), bfm, 1572864, 56);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(hatchMapScene, str, hatchMapAgenticSceneFlowCache, g0u, bRg2, c1dm2, str3, g0u5, g0u4, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg rememberInlineMapImpression(java.lang.String r5, X.BFM r6, int r7) {
        /*
            X.1BN<com.facebook.aura.maps.HatchMapsNativeModuleState> r0 = com.facebook.aura.maps.HatchMapsNativeModule.state
            X.1BO r4 = X.C2CK.A02(r6, r0)
            java.lang.Object r3 = r4.getValue()
            com.facebook.aura.maps.HatchMapsNativeModuleState r3 = (com.facebook.aura.maps.HatchMapsNativeModuleState) r3
            r0 = r7 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L19
            boolean r0 = r6.A65(r5)
            if (r0 != 0) goto L1e
        L19:
            r1 = r7 & 6
            r0 = 0
            if (r1 != r2) goto L1f
        L1e:
            r0 = 1
        L1f:
            boolean r1 = X.AnonymousClass003.A1H(r6, r3, r0)
            java.lang.Object r0 = r6.AaT()
            if (r1 != 0) goto L2d
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L3e
        L2d:
            java.lang.Object r1 = r4.getValue()
            com.facebook.aura.maps.HatchMapsNativeModuleState r0 = com.facebook.aura.maps.HatchMapsNativeModuleState.READY
            if (r1 != r0) goto L41
            com.facebook.aura.maps.HatchMapAnalytics r0 = com.facebook.aura.maps.HatchMapAnalytics.INSTANCE
            X.BRg r0 = r0.inlineMapImpression(r5)
        L3b:
            r6.Ai0(r0)
        L3e:
            X.BRg r0 = (X.BRg) r0
            return r0
        L41:
            X.BS0 r0 = X.BRg.A00
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.maps.HatchLocalMapWidgetKt.rememberInlineMapImpression(java.lang.String, X.BFM, int):X.BRg");
    }
}
