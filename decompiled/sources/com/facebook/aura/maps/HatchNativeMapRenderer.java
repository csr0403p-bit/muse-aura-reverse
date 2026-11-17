package com.facebook.aura.maps;

import X.AKO;
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
import X.C1DM;
import X.C31u;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC7359EnW;
import com.facebook.aura.maps.MC;
import com.facebook.aura.maps.intf.NativeMapRenderer;
import com.facebook.aura.maps.model.HatchMapScene;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchNativeMapRenderer implements NativeMapRenderer {
    public static final int $stable = 0;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(HatchNativeMapRenderer.class, "isEnabled", "isEnabled()Z");
    public static final HatchNativeMapRenderer INSTANCE = new HatchNativeMapRenderer();
    public static final C31u isEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_maps.enable_native_maps);

    /* renamed from: com.facebook.aura.maps.HatchNativeMapRenderer$EmbeddedMap$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onExpand;
        public final /* synthetic */ G0U<String, Unit> $onMarkerTapped;
        public final /* synthetic */ G0U<String, Unit> $onSelectedArtifactIdChanged;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ HatchMapScene $scene;
        public final /* synthetic */ String $selectedArtifactId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HatchMapScene hatchMapScene, String str, String str2, String str3, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, BRg bRg, int i) {
            super(2);
            this.$scene = hatchMapScene;
            this.$hostMessageId = str;
            this.$presentationId = str2;
            this.$selectedArtifactId = str3;
            this.$onSelectedArtifactIdChanged = g0u;
            this.$onMarkerTapped = g0u2;
            this.$onExpand = function0;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNativeMapRenderer.this.EmbeddedMap(this.$scene, this.$hostMessageId, this.$presentationId, this.$selectedArtifactId, this.$onSelectedArtifactIdChanged, this.$onMarkerTapped, this.$onExpand, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchNativeMapRenderer$FullscreenMap$1, reason: invalid class name and case insensitive filesystem */
    public final class C126761 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<String, Unit> $onMarkerTapped;
        public final /* synthetic */ G0U<String, Unit> $onSelectedArtifactIdChanged;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ HatchMapScene $scene;
        public final /* synthetic */ String $selectedArtifactId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C126761(HatchMapScene hatchMapScene, String str, String str2, String str3, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, BRg bRg, int i) {
            super(2);
            this.$scene = hatchMapScene;
            this.$hostMessageId = str;
            this.$presentationId = str2;
            this.$selectedArtifactId = str3;
            this.$onSelectedArtifactIdChanged = g0u;
            this.$onMarkerTapped = g0u2;
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNativeMapRenderer.this.FullscreenMap(this.$scene, this.$hostMessageId, this.$presentationId, this.$selectedArtifactId, this.$onSelectedArtifactIdChanged, this.$onMarkerTapped, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchNativeMapRenderer$LocalMapCard$1, reason: invalid class name and case insensitive filesystem */
    public final class C126771 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $fallback;
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onArtifactSelected;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ HatchMapScene $scene;
        public final /* synthetic */ String $selectedArtifactId;
        public final /* synthetic */ C1DM $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C126771(HatchMapScene hatchMapScene, String str, String str2, String str3, G0U<? super String, Unit> g0u, C1DM c1dm, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, int i) {
            super(2);
            this.$scene = hatchMapScene;
            this.$hostMessageId = str;
            this.$presentationId = str2;
            this.$selectedArtifactId = str3;
            this.$onArtifactSelected = g0u;
            this.$shape = c1dm;
            this.$modifier = bRg;
            this.$fallback = g0w;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNativeMapRenderer.this.LocalMapCard(this.$scene, this.$hostMessageId, this.$presentationId, this.$selectedArtifactId, this.$onArtifactSelected, this.$shape, this.$modifier, this.$fallback, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchNativeMapRenderer$LocalMapCard$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $fallback;
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onArtifactSelected;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ HatchMapScene $scene;
        public final /* synthetic */ String $selectedArtifactId;
        public final /* synthetic */ C1DM $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(HatchMapScene hatchMapScene, String str, String str2, String str3, G0U<? super String, Unit> g0u, C1DM c1dm, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, int i) {
            super(2);
            this.$scene = hatchMapScene;
            this.$hostMessageId = str;
            this.$presentationId = str2;
            this.$selectedArtifactId = str3;
            this.$onArtifactSelected = g0u;
            this.$shape = c1dm;
            this.$modifier = bRg;
            this.$fallback = g0w;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNativeMapRenderer.this.LocalMapCard(this.$scene, this.$hostMessageId, this.$presentationId, this.$selectedArtifactId, this.$onArtifactSelected, this.$shape, this.$modifier, this.$fallback, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @Override // com.facebook.aura.maps.intf.NativeMapRenderer
    public void LocalMapCard(HatchMapScene hatchMapScene, String str, String str2, String str3, G0U<? super String, Unit> g0u, C1DM c1dm, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass4;
        AnonymousClass005.A10(hatchMapScene, str, str2);
        AnonymousClass002.A1E(g0u, 4, bRg);
        bfm.AgG(1433898352);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchMapScene) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str3);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0i(bfm, c1dm);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0j(bfm, bRg);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, g0w);
        }
        boolean zRememberUsesNativeMapsFallback = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(4793491 & iA0d, 4793490), bfm, iA0d)) {
            if (g0w != null) {
                bfm.AgE(-708175600);
                zRememberUsesNativeMapsFallback = HatchMapsNativeFallbackKt.rememberUsesNativeMapsFallback(bfm, 0);
            } else {
                bfm.AgE(-478605883);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            if (zRememberUsesNativeMapsFallback) {
                bfm.AgE(-478572987);
                AnonymousClass001.A1G(bRg, bfm, g0w, (iA0d >> 18) & 126);
                bBbAAc = AnonymousClass001.A0L(bfm, bbiA07);
                if (bBbAAc != null) {
                    anonymousClass4 = new C126771(hatchMapScene, str, str2, str3, g0u, c1dm, bRg, g0w, i);
                    bBbAAc.A06 = anonymousClass4;
                }
                return;
            }
            bfm.AgE(-478529742);
            BBI.A0R(bbiA07, false);
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbiA07);
            String strMapInstanceId = HatchNativeMapRendererKt.mapInstanceId(str, str2, hatchMapScene);
            boolean zA1N = AnonymousClass003.A1N(bfm, auraNavigatorA05, strMapInstanceId);
            Object objAaT = bfm.AaT();
            if (zA1N || objAaT == C78N.A00) {
                objAaT = new HatchNativeMapRenderer$LocalMapCard$2$1(auraNavigatorA05, strMapInstanceId);
                BBI.A0O(bbiA07, objAaT);
            }
            G0U g0u2 = (G0U) objAaT;
            boolean zA1N2 = AnonymousClass003.A1N(bfm, auraNavigatorA05, strMapInstanceId);
            Object objAaT2 = bfm.AaT();
            if (zA1N2 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchNativeMapRenderer$LocalMapCard$3$1(auraNavigatorA05, strMapInstanceId);
                BBI.A0O(bbiA07, objAaT2);
            }
            int iA0B = AnonymousClass001.A0B(iA0d >> 3, (iA0d & 14) | ((iA0d >> 9) & 7168));
            int i2 = iA0d << 6;
            HatchMapPresentationKt.HatchLocalMapCard(hatchMapScene, strMapInstanceId, g0u2, bRg, c1dm, str3, g0u, (G0U) objAaT2, bfm, AnonymousClass001.A05(i2, iA0B | (458752 & i2)), 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(hatchMapScene, str, str2, str3, g0u, c1dm, bRg, g0w, i);
            bBbAAc.A06 = anonymousClass4;
        }
    }

    @Override // com.facebook.aura.maps.intf.NativeMapRenderer
    public void EmbeddedMap(HatchMapScene hatchMapScene, String str, String str2, String str3, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, BRg bRg, BFM bfm, int i) {
        AnonymousClass005.A10(hatchMapScene, str, str2);
        AnonymousClass003.A0y(g0u, g0u2);
        C7384Etj.A0Y(bRg, 7);
        bfm.AgG(862617249);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchMapScene) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str3);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0u2);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, function0);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0k(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1D(iA0d), bfm, iA0d)) {
            int i2 = iA0d >> 3;
            HatchEmbeddedMapKt.HatchEmbeddedMap(hatchMapScene, HatchNativeMapRendererKt.mapInstanceId(str, str2, hatchMapScene), str3, g0u, g0u2, function0, bRg, bfm, (i2 & 3670016) | AnonymousClass004.A02(i2, AnonymousClass002.A08(i2, iA0d & 14)), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(hatchMapScene, str, str2, str3, g0u, g0u2, function0, bRg, i);
        }
    }

    @Override // com.facebook.aura.maps.intf.NativeMapRenderer
    public void FullscreenMap(HatchMapScene hatchMapScene, String str, String str2, String str3, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, BRg bRg, BFM bfm, int i) {
        AnonymousClass005.A10(hatchMapScene, str, str2);
        C7384Etj.A0Y(g0u, 4);
        AnonymousClass005.A0z(g0u2, function0, bRg);
        bfm.AgG(-193463280);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchMapScene) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str3);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0u2);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, function0);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0k(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1D(iA0d), bfm, iA0d)) {
            int i2 = iA0d & 14;
            int i3 = iA0d >> 3;
            HatchEmbeddedMapKt.HatchFullscreenEmbeddedMap(hatchMapScene, HatchNativeMapRendererKt.mapInstanceId(str, str2, hatchMapScene), str3, g0u, g0u2, function0, bRg, bfm, AnonymousClass001.A05(i3, AnonymousClass004.A02(i3, AnonymousClass002.A08(i3, i2))), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126761(hatchMapScene, str, str2, str3, g0u, g0u2, function0, bRg, i);
        }
    }

    @Override // com.facebook.aura.maps.intf.NativeMapRenderer
    public boolean isEnabled() {
        return C31u.A01(this, isEnabled$delegate, $$delegatedProperties, 0);
    }
}
