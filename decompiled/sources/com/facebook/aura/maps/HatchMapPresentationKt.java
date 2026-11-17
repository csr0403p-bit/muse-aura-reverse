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
import X.C1BN;
import X.C1BO;
import X.C1DM;
import X.C1er;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C9Tm;
import X.C9VN;
import X.FGI;
import X.G0U;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache;
import com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCacheKt;
import com.facebook.aura.maps.cache.HatchPlaceDetailsState;
import com.facebook.aura.maps.data.HatchMapPlaces;
import com.facebook.aura.maps.model.HatchMapScene;
import com.facebook.aura.navigation.ResultEventBusKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class HatchMapPresentationKt {

    /* renamed from: com.facebook.aura.maps.HatchMapPresentationKt$HatchLocalMapCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onArtifactSelected;
        public final /* synthetic */ G0U<String, Unit> $onExpand;
        public final /* synthetic */ G0U<String, Unit> $onPlaceDetailsRequested;
        public final /* synthetic */ String $persistedArtifactId;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ HatchMapScene $scene;
        public final /* synthetic */ C1DM $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(HatchMapScene hatchMapScene, String str, G0U<? super String, Unit> g0u, BRg bRg, C1DM c1dm, String str2, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, int i, int i2) {
            super(2);
            this.$scene = hatchMapScene;
            this.$presentationId = str;
            this.$onExpand = g0u;
            this.$modifier = bRg;
            this.$shape = c1dm;
            this.$persistedArtifactId = str2;
            this.$onArtifactSelected = g0u2;
            this.$onPlaceDetailsRequested = g0u3;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMapPresentationKt.HatchLocalMapCard(this.$scene, this.$presentationId, this.$onExpand, this.$modifier, this.$shape, this.$persistedArtifactId, this.$onArtifactSelected, this.$onPlaceDetailsRequested, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final HatchResolvedMapPlace rememberHatchMapPlace(HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache, HatchMapPlaces hatchMapPlaces, String str, BFM bfm, int i) {
        C9VN c9vn;
        C9Tm next;
        HatchPlaceDetailsState.Resolved resolved;
        AnonymousClass005.A10(hatchMapAgenticSceneFlowCache, hatchMapPlaces, str);
        bfm.AgE(-1699671298);
        Iterator<C9Tm> it = hatchMapPlaces.cardData.A00.iterator();
        while (true) {
            c9vn = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (str.equals(next.A09)) {
                break;
            }
        }
        C9Tm c9Tm = next;
        if (c9Tm == null) {
            AnonymousClass001.A1D(bfm);
            return null;
        }
        String strA0p = C60O.A0p(str, hatchMapPlaces.placeIdsByCardId);
        if (strA0p == null) {
            bfm.AgE(-1537856146);
        } else {
            bfm.AgE(-1537823100);
            boolean zA1K = AnonymousClass003.A1K(bfm, hatchMapAgenticSceneFlowCache, strA0p);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = hatchMapAgenticSceneFlowCache.observeDetails(strA0p);
                bfm.Ai0(objAaT);
            }
            HatchPlaceDetailsState hatchPlaceDetailsState = (HatchPlaceDetailsState) C1BO.A07(bfm, (C1BN) objAaT);
            if ((hatchPlaceDetailsState instanceof HatchPlaceDetailsState.Resolved) && (resolved = (HatchPlaceDetailsState.Resolved) hatchPlaceDetailsState) != null) {
                c9vn = resolved.details;
            }
        }
        BBI bbiA07 = C3cG.A07(bfm);
        HatchResolvedMapPlace hatchResolvedMapPlace = new HatchResolvedMapPlace(withDetails(c9Tm, c9vn), c9vn);
        BBI.A0R(bbiA07, false);
        return hatchResolvedMapPlace;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.maps.HatchRetainedMapPresentation rememberHatchRetainedMapPresentation(java.lang.String r12, com.facebook.aura.maps.model.HatchMapScene r13, com.facebook.aura.maps.scene.HatchMapTheme r14, boolean r15, com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache r16, com.facebook.aura.maps.HatchMapDisplayMode r17, com.meta.maps.display.SDKInsets r18, boolean r19, X.BFM r20, int r21) {
        /*
            r4 = r12
            r11 = r13
            r12 = r14
            X.AnonymousClass005.A0x(r4, r13, r14)
            r2 = 4
            r10 = r16
            X.C7384Etj.A0Y(r10, r2)
            r13 = r17
            r14 = r18
            X.AnonymousClass003.A0z(r13, r14)
            X.AKH<android.content.Context> r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A01
            r3 = r20
            r5 = r3
            X.BBI r5 = (X.BBI) r5
            android.content.Context r18 = X.AKO.A00(r0, r5)
            X.AKH<android.app.Activity> r0 = X.AKL.A00
            java.lang.Object r1 = X.AKO.A07(r0, r5)
            boolean r0 = r1 instanceof X.C1HY
            if (r0 == 0) goto Lbb
            X.1HY r1 = (X.C1HY) r1
            if (r1 == 0) goto Lbb
            r0 = -911590239(0xffffffffc9aa3ca1, float:-1394580.1)
            r3.AgE(r0)
        L32:
            r0 = 0
            X.BBI.A0R(r5, r0)
            X.AKH<X.CGz> r0 = com.facebook.aura.session.LocalUserSessionKt.LocalUserSession
            X.CGz r5 = X.AKO.A06(r0, r5)
            r7 = r21
            r0 = r21 & 14
            r0 = r0 ^ 6
            r9 = 0
            if (r0 <= r2) goto L4b
            boolean r0 = r3.A65(r4)
            if (r0 != 0) goto L50
        L4b:
            r0 = r21 & 6
            r8 = 0
            if (r0 != r2) goto L51
        L50:
            r8 = 1
        L51:
            r0 = r21 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r6 = 32
            if (r0 <= r6) goto L5f
            boolean r0 = r3.A65(r11)
            if (r0 != 0) goto L64
        L5f:
            r2 = r21 & 48
            r0 = 0
            if (r2 != r6) goto L65
        L64:
            r0 = 1
        L65:
            boolean r6 = X.AnonymousClass002.A1W(r3, r1, r8, r0)
            r0 = r7 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L77
            boolean r0 = r3.A65(r12)
            if (r0 != 0) goto L7b
        L77:
            r0 = r7 & 384(0x180, float:5.38E-43)
            if (r0 != r2) goto L7c
        L7b:
            r9 = 1
        L7c:
            r6 = r6 | r9
            boolean r2 = X.AnonymousClass003.A1P(r3, r10, r5, r6)
            java.lang.Object r0 = r3.AaT()
            if (r2 != 0) goto L8b
            java.lang.Object r2 = X.C78N.A00
            if (r0 != r2) goto Lb6
        L8b:
            com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCacheRegistry$Companion r0 = com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCacheRegistry.Companion
            com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCacheRegistry r9 = r0.getInstance(r5)
            com.facebook.aura.maps.HatchRetainedMapRegistry$Companion r0 = com.facebook.aura.maps.HatchRetainedMapRegistry.Companion
            com.facebook.aura.maps.HatchRetainedMapRegistry r2 = r0.getInstance(r5)
            com.facebook.aura.maps.HatchMapPresentationKt$rememberHatchRetainedMapPresentation$lease$1$1 r8 = new com.facebook.aura.maps.HatchMapPresentationKt$rememberHatchRetainedMapPresentation$lease$1$1
            r16 = r19
            r17 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r13 = r4
            r14 = r11
            r15 = r1
            r16 = r12
            r17 = r10
            r18 = r8
            r12 = r2
            com.facebook.aura.maps.HatchRetainedMapPresentation r1 = r12.acquire(r13, r14, r15, r16, r17, r18)
            com.facebook.aura.maps.HatchRetainedMapLease r0 = new com.facebook.aura.maps.HatchRetainedMapLease
            r0.<init>(r2, r1)
            r3.Ai0(r0)
        Lb6:
            com.facebook.aura.maps.HatchRetainedMapLease r0 = (com.facebook.aura.maps.HatchRetainedMapLease) r0
            com.facebook.aura.maps.HatchRetainedMapPresentation r0 = r0.presentation
            return r0
        Lbb:
            r0 = -911588255(0xffffffffc9aa4461, float:-1394828.1)
            r3.AgE(r0)
            X.AKH<X.1HY> r0 = X.AIC.A00
            java.lang.Object r1 = X.AKO.A07(r0, r5)
            X.1HY r1 = (X.C1HY) r1
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.maps.HatchMapPresentationKt.rememberHatchRetainedMapPresentation(java.lang.String, com.facebook.aura.maps.model.HatchMapScene, com.facebook.aura.maps.scene.HatchMapTheme, boolean, com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache, com.facebook.aura.maps.HatchMapDisplayMode, com.meta.maps.display.SDKInsets, boolean, X.BFM, int):com.facebook.aura.maps.HatchRetainedMapPresentation");
    }

    public static final void HatchLocalMapCard(HatchMapScene hatchMapScene, String str, G0U<? super String, Unit> g0u, BRg bRg, C1DM c1dm, String str2, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, BFM bfm, int i, int i2) {
        C1DM c1dm2 = c1dm;
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(hatchMapScene, str);
        C7384Etj.A0Y(g0u, 2);
        AnonymousClass003.A10(g0u2, g0u3);
        bfm.AgG(-1741537593);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchMapScene) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, c1dm2);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0i(bfm, str2);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, g0u2);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, g0u3);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(4793491 & iA0d, 4793490), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                c1dm2 = null;
            }
            int i5 = iA0d << 3;
            HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCacheRememberHatchMapCache = rememberHatchMapCache(str, hatchMapScene, bfm, ((iA0d >> 3) & 14) | (i5 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
            MutableState mutableStateA00 = C1er.A00(bfm, g0u2);
            String strA0M = FGI.A0M("hatch_fullscreen_map_selection:", str);
            boolean zA65 = bfm.A65(mutableStateA00);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchMapPresentationKt$HatchLocalMapCard$1$1(mutableStateA00, null);
                BBI.A0T(bfm, objAaT);
            }
            ResultEventBusKt.ResultEffect(strA0M, null, (G0V) objAaT, bfm, zA1b ? 1 : 0, 2);
            boolean z = (iA0d & 3670016) == 1048576;
            Object objAaT2 = bfm.AaT();
            if (z || objAaT2 == C78N.A00) {
                objAaT2 = new HatchMapPresentationKt$HatchLocalMapCard$2$1(g0u2);
                BBI.A0T(bfm, objAaT2);
            }
            BRg bRg3 = bRg2;
            HatchLocalMapWidgetKt.HatchLocalMapWidget(hatchMapScene, str, hatchMapAgenticSceneFlowCacheRememberHatchMapCache, g0u, bRg3, c1dm2, str2, (G0U) objAaT2, g0u3, bfm, (3670016 & i5) | AnonymousClass004.A02(i5, (iA0d & 126) | (i5 & 7168)) | (234881024 & i5), zA1b ? 1 : 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(hatchMapScene, str, g0u, bRg2, c1dm2, str2, g0u2, g0u3, i, i2);
        }
    }

    public static final C9Tm withDetails(C9Tm c9Tm, C9VN c9vn) {
        if (c9vn == null) {
            return c9Tm;
        }
        String str = c9Tm.A0B;
        if (C7BY.A0j(str) && (str = c9vn.A0D) == null) {
            str = "";
        }
        String str2 = c9Tm.A08;
        if (C7BY.A0j(str2) && (str2 = c9vn.A0C) == null) {
            str2 = "";
        }
        String str3 = c9Tm.A07;
        if (C7BY.A0j(str3)) {
            String str4 = c9vn.A05;
            str3 = str4 != null ? str4 : "";
        }
        Float fValueOf = c9Tm.A02;
        if (fValueOf == null) {
            Double d = c9vn.A01;
            fValueOf = d != null ? Float.valueOf((float) d.doubleValue()) : null;
        }
        Integer num = c9Tm.A05;
        if (num == null) {
            num = c9vn.A04;
        }
        Integer num2 = c9Tm.A04;
        if (num2 == null) {
            num2 = c9vn.A03;
        }
        Integer num3 = c9Tm.A03;
        if (num3 == null) {
            num3 = c9vn.A02;
        }
        String strSupportingImageUrl = c9Tm.A0A;
        if (strSupportingImageUrl == null || C7BY.A0j(strSupportingImageUrl)) {
            strSupportingImageUrl = HatchMapAgenticSceneFlowCacheKt.supportingImageUrl(c9vn);
        }
        String str5 = c9Tm.A0C;
        if (str5 == null) {
            str5 = c9vn.A0A;
        }
        String str6 = c9Tm.A0E;
        if (str6 == null) {
            str6 = c9vn.A0E;
        }
        String str7 = c9Tm.A09;
        double d2 = c9Tm.A00;
        double d3 = c9Tm.A01;
        String str8 = c9Tm.A0D;
        String str9 = c9Tm.A06;
        AnonymousClass005.A0x(str7, str, str2);
        C7384Etj.A0Y(str3, 5);
        C7384Etj.A0Y(str9, 12);
        return new C9Tm(fValueOf, num, num2, num3, str7, str, str2, str3, str8, strSupportingImageUrl, str9, str5, str6, d2, d3);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache rememberHatchMapCache(java.lang.String r6, com.facebook.aura.maps.model.HatchMapScene r7, X.BFM r8, int r9) {
        /*
            X.AnonymousClass003.A0u(r6, r7)
            X.AKH<android.content.Context> r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A01
            r1 = r8
            X.BBI r1 = (X.BBI) r1
            android.content.Context r0 = X.AKO.A00(r0, r1)
            android.content.Context r3 = r0.getApplicationContext()
            X.AKH<X.CGz> r0 = com.facebook.aura.session.LocalUserSessionKt.LocalUserSession
            X.CGz r4 = X.AKO.A06(r0, r1)
            r0 = r9 & 14
            r0 = r0 ^ 6
            r5 = 0
            r1 = 4
            if (r0 <= r1) goto L24
            boolean r0 = r8.A65(r6)
            if (r0 != 0) goto L29
        L24:
            r0 = r9 & 6
            r2 = 0
            if (r0 != r1) goto L2a
        L29:
            r2 = 1
        L2a:
            r0 = r9 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L38
            boolean r0 = r8.A65(r7)
            if (r0 != 0) goto L3c
        L38:
            r0 = r9 & 48
            if (r0 != r1) goto L3d
        L3c:
            r5 = 1
        L3d:
            r2 = r2 | r5
            boolean r0 = X.AnonymousClass003.A1P(r8, r3, r4, r2)
            java.lang.Object r2 = r8.AaT()
            if (r0 != 0) goto L4c
            java.lang.Object r0 = X.C78N.A00
            if (r2 != r0) goto L61
        L4c:
            com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCacheRegistry$Companion r0 = com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCacheRegistry.Companion
            com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCacheRegistry r1 = r0.getInstance(r4)
            X.C7384Etj.A0X(r3)
            com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache r0 = r1.acquire(r6, r7, r3)
            com.facebook.aura.maps.HatchMapCacheLease r2 = new com.facebook.aura.maps.HatchMapCacheLease
            r2.<init>(r1, r0)
            r8.Ai0(r2)
        L61:
            com.facebook.aura.maps.HatchMapCacheLease r2 = (com.facebook.aura.maps.HatchMapCacheLease) r2
            com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache r0 = r2.cache
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.maps.HatchMapPresentationKt.rememberHatchMapCache(java.lang.String, com.facebook.aura.maps.model.HatchMapScene, X.BFM, int):com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AnonymousClass965 rememberHatchMapCardIconProvider(com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache r5, com.facebook.aura.maps.data.HatchMapPlaces r6, java.util.List<X.C9Tm> r7, X.BFM r8, int r9) {
        /*
            X.AnonymousClass005.A0x(r5, r6, r7)
            r0 = r9 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L11
            boolean r0 = r8.A65(r7)
            if (r0 != 0) goto L16
        L11:
            r1 = r9 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L17
        L16:
            r0 = 1
        L17:
            boolean r0 = X.AnonymousClass001.A1R(r8, r6, r0)
            java.lang.Object r3 = r8.AaT()
            if (r0 != 0) goto L25
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L55
        L25:
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r4 = r7.iterator()
        L2d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r1 = r4.next()
            X.9Tm r1 = (X.C9Tm) r1
            java.lang.String r2 = r1.A0A
            if (r2 == 0) goto L2d
            boolean r0 = X.C7BY.A0j(r2)
            if (r0 != 0) goto L2d
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.placeIdsByCardId
            java.lang.String r1 = r1.A09
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L4e
            r0 = r1
        L4e:
            X.AnonymousClass002.A1J(r2, r0, r3)
            goto L2d
        L52:
            r8.Ai0(r3)
        L55:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r0 = X.AnonymousClass003.A1K(r8, r5, r3)
            java.lang.Object r2 = r8.AaT()
            if (r0 != 0) goto L65
            java.lang.Object r0 = X.C78N.A00
            if (r2 != r0) goto L73
        L65:
            com.facebook.aura.maps.cache.HatchSharedPlaceImageProvider r1 = r5.placeImageProvider
            java.util.Map r0 = X.AGH.A06(r3)
            com.facebook.aura.maps.HatchSharedMapCardIconProvider r2 = new com.facebook.aura.maps.HatchSharedMapCardIconProvider
            r2.<init>(r1, r0)
            X.BBI.A0T(r8, r2)
        L73:
            com.facebook.aura.maps.HatchSharedMapCardIconProvider r2 = (com.facebook.aura.maps.HatchSharedMapCardIconProvider) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.maps.HatchMapPresentationKt.rememberHatchMapCardIconProvider(com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache, com.facebook.aura.maps.data.HatchMapPlaces, java.util.List, X.BFM, int):X.965");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<X.C9Tm> rememberHatchMapPlaces(com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache r6, com.facebook.aura.maps.data.HatchMapPlaces r7, X.BFM r8, int r9) {
        /*
            X.AnonymousClass004.A1b(r6, r7)
            r0 = 777070463(0x2e51277f, float:4.7556178E-11)
            r8.AgE(r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r7.placeIdsByCardId
            java.util.Collection r0 = r0.values()
            java.util.List r0 = X.AbstractC0878AGe.A0T(r0)
            java.util.ArrayList r4 = X.AnonymousClass002.A0m(r0)
            java.util.Iterator r3 = r0.iterator()
        L1b:
            boolean r0 = r3.hasNext()
            r5 = 0
            if (r0 == 0) goto L60
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            r0 = 735886736(0x2bdcbd90, float:1.5684554E-12)
            r8.Ag8(r0, r2)
            boolean r0 = X.AnonymousClass003.A1K(r8, r6, r2)
            java.lang.Object r1 = r8.AaT()
            if (r0 != 0) goto L3c
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L43
        L3c:
            X.1BN r1 = r6.observeDetails(r2)
            r8.Ai0(r1)
        L43:
            X.1BN r1 = (X.C1BN) r1
            java.lang.Object r1 = X.C1BO.A07(r8, r1)
            com.facebook.aura.maps.cache.HatchPlaceDetailsState r1 = (com.facebook.aura.maps.cache.HatchPlaceDetailsState) r1
            boolean r0 = r1 instanceof com.facebook.aura.maps.cache.HatchPlaceDetailsState.Resolved
            if (r0 == 0) goto L55
            com.facebook.aura.maps.cache.HatchPlaceDetailsState$Resolved r1 = (com.facebook.aura.maps.cache.HatchPlaceDetailsState.Resolved) r1
            if (r1 == 0) goto L55
            X.9VN r5 = r1.details
        L55:
            X.HxE r0 = X.C3cG.A0r(r2, r5)
            X.AnonymousClass001.A1D(r8)
            r4.add(r0)
            goto L1b
        L60:
            X.AnonymousClass001.A1D(r8)
            java.util.Map r6 = X.AGH.A06(r4)
            boolean r0 = X.AnonymousClass003.A1K(r8, r7, r6)
            java.lang.Object r4 = r8.AaT()
            if (r0 != 0) goto L75
            java.lang.Object r0 = X.C78N.A00
            if (r4 != r0) goto Laa
        L75:
            X.9Fg r0 = r7.cardData
            java.util.List<X.9Tm> r0 = r0.A00
            java.util.ArrayList r4 = X.AnonymousClass002.A0m(r0)
            java.util.Iterator r3 = r0.iterator()
        L81:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r2 = r3.next()
            X.9Tm r2 = (X.C9Tm) r2
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.placeIdsByCardId
            java.lang.String r0 = r2.A09
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto La5
            java.lang.Object r0 = r6.get(r0)
            X.9VN r0 = (X.C9VN) r0
        L9d:
            X.9Tm r0 = withDetails(r2, r0)
            r4.add(r0)
            goto L81
        La5:
            r0 = r5
            goto L9d
        La7:
            r8.Ai0(r4)
        Laa:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.maps.HatchMapPresentationKt.rememberHatchMapPlaces(com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache, com.facebook.aura.maps.data.HatchMapPlaces, X.BFM, int):java.util.List");
    }
}
