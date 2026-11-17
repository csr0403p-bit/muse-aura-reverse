package com.facebook.aura.shopping.view;

import X.AGH;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C0v5;
import X.C11U;
import X.C1515AkP;
import X.C1YD;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3cF;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C7Je;
import X.C9m9;
import X.CFK;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.shopping.model.PdpLocation;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchProductDetailsLocationSectionKt {
    public static final float LocationImpressionVisibleFraction = 0.5f;
    public static final float MapAspectRatio = 1.7777778f;
    public static final String MapClientCaller = "HatchProductDetailsLocationSection";
    public static final float MapCornerRadius = 12.0f;
    public static final int MapWidthBucketPoints = 64;
    public static final String TAG = "HatchProductDetailsLocation";

    /* renamed from: com.facebook.aura.shopping.view.HatchProductDetailsLocationSectionKt$HatchProductDetailsLocationSection$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ PdpLocation $location;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PdpLocation pdpLocation, String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$location = pdpLocation;
            this.$productId = str;
            this.$hostMessageId = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchProductDetailsLocationSectionKt.HatchProductDetailsLocationSection(this.$location, this.$productId, this.$hostMessageId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchProductDetailsLocationSectionKt$LocationMap$2, reason: invalid class name and case insensitive filesystem */
    public final class C137262 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ Double $latitude;
        public final /* synthetic */ String $locationText;
        public final /* synthetic */ Double $longitude;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $productId;
        public final /* synthetic */ String $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137262(String str, Double d, Double d2, String str2, String str3, String str4, BRg bRg, int i, int i2) {
            super(2);
            this.$uri = str;
            this.$latitude = d;
            this.$longitude = d2;
            this.$locationText = str2;
            this.$productId = str3;
            this.$hostMessageId = str4;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchProductDetailsLocationSectionKt.LocationMap(this.$uri, this.$latitude, this.$longitude, this.$locationText, this.$productId, this.$hostMessageId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchProductDetailsLocationSection(PdpLocation pdpLocation, String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(pdpLocation, 0);
        bfm.AgG(741841711);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(pdpLocation, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            String str3 = pdpLocation.locationText;
            String str4 = str3;
            if (str3 == null || C7BY.A0j(str4)) {
                str4 = null;
            }
            String strRememberLocationMapUri = rememberLocationMapUri(pdpLocation, bfm, PdpLocation.$stable | (iA05 & 14));
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = Long.valueOf(SystemClock.elapsedRealtimeNanos());
                bfm.Ai0(objAaT);
            }
            long jA05 = C3cG.A05(objAaT);
            boolean zA1C = AnonymousClass003.A1C(iA05) | AnonymousClass003.A1D(iA05);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == obj) {
                objAaT2 = HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.SHOPPING, HatchSurface.SHOPPING, null, HatchScreen.PRODUCT_DETAIL, HatchComponent.LOCATION_SECTION, str, HatchShoppingEventMetadataKt.shoppingEventMetadata(str2, AGH.A0E()), null, 500L, 0.5f, FGI.A0a("pdp_location:", str, ":", jA05), null, null);
                bfm.Ai0(objAaT2);
            }
            BRg bRgThen = AnonymousClass001.A0R(bRg2).then((BRg) objAaT2);
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingSmall);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA0D);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dcd);
            BS0 bs0 = BRg.A00;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = HatchProductDetailsLocationSectionKt$HatchProductDetailsLocationSection$1$1$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bs0, objAaT3, false), colors.primaryText, C60Q.A0D(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            if (strRememberLocationMapUri != null) {
                bfm.AgE(279352000);
                LocationMap(strRememberLocationMapUri, pdpLocation.latitude, pdpLocation.longitude, str4, str, str2, null, bfm, (iA05 << 9) & 516096, 64);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(279595133);
                BBI.A0R(bbi, false);
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, AuraDimensKt.SpacingNano, 0);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            if (str4 != null) {
                AuraTextKt.m2639AuraTextUY9GdpU(str4, null, colors.primaryText, C3cH.A0X(bfm, auraTheme, -375414291).bodyRegular, null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-375196857);
                BBI.A0R(bbi, false);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dca), null, colors.secondaryText, C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(pdpLocation, str, str2, bRg2, i, i2);
        }
    }

    public static final void LocationMap(String str, Double d, Double d2, String str2, String str3, String str4, BRg bRg, BFM bfm, int i, int i2) {
        String strA01;
        BRg bRgA04;
        BRg bRg2 = bRg;
        bfm.AgG(1531609158);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, d);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, d2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str3);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0i(bfm, str4);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 599187, 599186), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            if (str2 != null) {
                bfm.AgE(-1563831387);
                strA01 = AnonymousClass001.A0t(bfm, str2, R.string._name_removed__res_0x7f120dcc);
            } else {
                bfm.AgE(-1563739720);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dcb);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            BRg bRgA01 = C1b8.A01(C11U.A01(BJe.A00(AnonymousClass001.A0R(bRg2), 1.7777778f, false), MapCornerRadius), C3cH.A0W(bfm).background);
            if (d == null || d2 == null) {
                bfm.AgE(-1563044886);
                BBI.A0R(bbiA07, false);
                bRgA04 = BRg.A00;
            } else {
                BS0 bs0A09 = C3cG.A09(bfm, -1563288794);
                C1YD c1ydA0A = C3cG.A0A(0);
                boolean zA1V = AnonymousClass002.A1V(bfm, contextA0H, AnonymousClass005.A1L(iA0d), AnonymousClass007.A1H(iA0d)) | AnonymousClass004.A1I(iA0d) | AnonymousClass004.A1K(iA0d) | AnonymousClass004.A1M(iA0d);
                Object objAaT = bfm.AaT();
                if (zA1V || objAaT == C78N.A00) {
                    objAaT = new HatchProductDetailsLocationSectionKt$LocationMap$1$1(str3, str4, contextA0H, d, d2, str2);
                    bfm.Ai0(objAaT);
                }
                bRgA04 = C0v5.A04(bs0A09, c1ydA0A, null, (Function0) objAaT, true);
                BBI.A0R(bbiA07, false);
            }
            AuraImageKt.m2573AuraImageXRP3Ue8(str, bRgA01.then(bRgA04), B18.A00, strA01, null, false, null, 0L, false, false, false, null, null, null, null, bfm, (iA0d & 14) | 384, 0, 32752);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137262(str, d, d2, str2, str3, str4, bRg2, i, i2);
        }
    }

    public static final int bucketedMapWidth(int i) {
        return ((i + 63) / 64) * 64;
    }

    public static final void logLocationMapClick(String str, String str2) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SHOPPING, null, HatchScreen.PRODUCT_DETAIL, HatchComponent.LOCATION_SECTION, str, HatchShoppingEventMetadataKt.shoppingEventMetadata(str2, AGH.A0E()), null);
    }

    public static final String rememberLocationMapUri(PdpLocation pdpLocation, BFM bfm, int i) {
        String str = pdpLocation.staticMapImageUrl;
        Object objM2048buildApproximateLocationMapUri3EhgFcU = null;
        if (str == null || C7BY.A0j(str)) {
            str = null;
        }
        Double d = pdpLocation.latitude;
        Double d2 = pdpLocation.longitude;
        Double d3 = pdpLocation.radiusKm;
        int iAuraLayoutWidth = ((((int) AuraLayoutSizeKt.auraLayoutWidth(bfm, 0)) + 63) / 64) * 64;
        float fAEm = AnonymousClass002.A0Y(bfm).AEm();
        AuraTheme auraTheme = AuraTheme.INSTANCE;
        long j = auraTheme.getColors(bfm, 6).accent;
        boolean z = !auraTheme.getColors(bfm, 6).isLight;
        boolean zA1U = AnonymousClass001.A1U(bfm, z, AnonymousClass001.A1a(AnonymousClass005.A1T(bfm, d, d2, d3, bfm.A65(str)), bfm, iAuraLayoutWidth) | bfm.A62(fAEm) | bfm.A64(j));
        Object objAaT = bfm.AaT();
        if (zA1U || objAaT == C78N.A00) {
            if (str != null) {
                objM2048buildApproximateLocationMapUri3EhgFcU = str;
            } else if (d != null && d2 != null && d3 != null) {
                objM2048buildApproximateLocationMapUri3EhgFcU = HatchStaticMapUriKt.m2048buildApproximateLocationMapUri3EhgFcU(d.doubleValue(), d2.doubleValue(), d3.doubleValue(), iAuraLayoutWidth, 1.7777778f, fAEm, j, z, MapClientCaller);
            }
            bfm.Ai0(objM2048buildApproximateLocationMapUri3EhgFcU);
            objAaT = objM2048buildApproximateLocationMapUri3EhgFcU;
        }
        return (String) objAaT;
    }

    public static final void openMap(Context context, double d, double d2, String str) {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(d);
        sbA0w.append(",");
        sbA0w.append(d2);
        String string = sbA0w.toString();
        Intent intentAddFlags = C60P.A03("android.intent.action.VIEW").setData(C7Je.A01(FGI.A0d("geo:", string, "?q=", Uri.encode(str != null ? FGI.A0d(string, "(", str, ")") : string)))).addFlags(268435456);
        C7384Etj.A0U(intentAddFlags);
        try {
            C3cI.A18(context, intentAddFlags);
        } catch (ActivityNotFoundException e) {
            CFK.A0A(TAG, C3cF.A00(15), e);
        }
    }
}
