package com.facebook.aura.whatsapp.view;

import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B0A;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C0A8;
import X.C0fG;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1731ApS;
import X.C1736ApY;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C1AC;
import X.C1YL;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.InterfaceC04981Yd;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.aura.whatsapp.viewmodel.WhatsAppCompanionErrorType;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class WhatsAppCompanionCodeDisplayContentKt {
    public static final String WHATSAPP_LINKED_DEVICES_URL = "https://wa.me/settings/linked_devices";
    public static final String WHATSAPP_PACKAGE = "com.whatsapp";
    public static final String WHATSAPP_PLAY_STORE_URL = "https://play.google.com/store/apps/details?id=com.whatsapp";

    /* renamed from: com.facebook.aura.whatsapp.view.WhatsAppCompanionCodeDisplayContentKt$WhatsAppCompanionCodeDisplayContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ WhatsAppCompanionErrorType $errorType;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ boolean $isConnected;
        public final /* synthetic */ boolean $isPolling;
        public final /* synthetic */ String $linkCode;
        public final /* synthetic */ Function0<Unit> $onCopyCode;
        public final /* synthetic */ Function0<Unit> $onOpenWhatsApp;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, boolean z, boolean z2, WhatsAppCompanionErrorType whatsAppCompanionErrorType, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i) {
            super(2);
            this.$iconUrl = str;
            this.$linkCode = str2;
            this.$isPolling = z;
            this.$isConnected = z2;
            this.$errorType = whatsAppCompanionErrorType;
            this.$onRetry = function0;
            this.$onCopyCode = function02;
            this.$onOpenWhatsApp = function03;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            WhatsAppCompanionCodeDisplayContentKt.WhatsAppCompanionCodeDisplayContent(this.$iconUrl, this.$linkCode, this.$isPolling, this.$isConnected, this.$errorType, this.$onRetry, this.$onCopyCode, this.$onOpenWhatsApp, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static final void WhatsAppCompanionCodeDisplayContent(String str, String str2, boolean z, boolean z2, WhatsAppCompanionErrorType whatsAppCompanionErrorType, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BFM bfm, int i) {
        int i2;
        long j;
        BRg bRg;
        B0A b0a;
        C1YL c1yl;
        String strA0s;
        long j2;
        C7384Etj.A0Y(str2, 1);
        AnonymousClass003.A0z(function0, function02);
        C7384Etj.A0Y(function03, 7);
        bfm.AgG(-1732507523);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0G(bfm, AnonymousClass003.A0K(whatsAppCompanionErrorType));
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function0);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, function02);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, function03);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1D(iA0d), bfm, iA0d)) {
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0C = C3U4.A0C(C3U4.A0B(c1062ATq, 24.0f, 0.0f), 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingSmall);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            long j3 = bbi.A06;
            int i3 = (int) (j3 ^ (j3 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i3);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            BPg.A03(bfm, g0u);
            G0V<InterfaceC1516AkQ, BRg, Unit> g0v3 = C1515AkP.A05;
            C01N.A0B(bfm, bs0, bRgA01, g0v3, 24.0f);
            if (str == null) {
                bfm.AgE(1885342611);
                i2 = 0;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1885342612);
                AuraImageKt.m2573AuraImageXRP3Ue8(str, C11U.A01(C10G.A07(bs0, 40.0f), 12.0f), null, null, null, false, null, 0L, false, false, false, null, null, null, null, bfm, 0, 0, 32764);
                C01N.A08(bfm, bs0, 12.0f);
                i2 = 0;
                BBI.A0R(bbi, false);
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12115b);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title3Emphasized;
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            boolean z3 = i2;
            boolean z4 = i2;
            int i4 = i2;
            int i5 = i2;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, C06G.A0L(bfm, akh), c1822Arm, null, null, null, z3, z4 ? 1 : 0, i4, i2, null, null, null, bfm, i5, i2, 16370);
            C01N.A08(bfm, bs0, 12.0f);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121159);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121158);
            bfm.AgE(-1601726982);
            C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
            int iA0B = C7BY.A0B(strA012, strA013, i2, i2);
            if (iA0B >= 0) {
                long j4 = AnonymousClass006.A0i(bfm, akh, -2027252634).secondaryText;
                j = 0;
                long j5 = C1809ArT.A01;
                long j6 = B6A.A07;
                bRg = null;
                b0a = null;
                c1yl = null;
                int iA02 = c1731ApSA0W.A02(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j4, j5, j5, j6));
                try {
                    AnonymousClass005.A0s(c1731ApSA0W, strA012, i2, iA0B);
                    c1731ApSA0W.A06(iA02);
                    int iA022 = c1731ApSA0W.A02(new C1824Aro(null, null, null, null, null, C1736ApY.A01, null, null, null, null, null, C06G.A0I(bfm, akh), j5, j5, j6));
                    c1731ApSA0W.A0E(strA013);
                    c1731ApSA0W.A06(iA022);
                    iA02 = c1731ApSA0W.A02(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, C06G.A0I(bfm, akh), j5, j5, j6));
                    c1731ApSA0W.A0E(strA012.substring(iA0B + strA013.length()));
                    c1731ApSA0W.A06(iA02);
                    BBI.A0R(bbi, i2);
                } catch (Throwable th) {
                    c1731ApSA0W.A06(iA02);
                    throw th;
                }
            } else {
                long j7 = AnonymousClass006.A0i(bfm, akh, -2026763113).secondaryText;
                j = 0;
                long j8 = C1809ArT.A01;
                bRg = null;
                b0a = null;
                c1yl = null;
                int iA023 = c1731ApSA0W.A02(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j7, j8, j8, B6A.A07));
                try {
                    c1731ApSA0W.A0E(strA012);
                    c1731ApSA0W.A06(iA023);
                    BBI.A0R(bbi, i2);
                } catch (Throwable th2) {
                    c1731ApSA0W.A06(iA023);
                    throw th2;
                }
            }
            ApQ apQA04 = c1731ApSA0W.A04();
            BBI.A0R(bbi, i2);
            AuraTextKt.m2640AuraTextVmYn7U0(apQA04, c1062ATq, j, C06G.A0Z(bfm), null, null, new C1YL(3), j, i2, z3 ? 1 : 0, z4 ? 1 : 0, i4, null, null, null, bfm, 48, i5, 32692);
            C01N.A08(bfm, bs0, 16.0f);
            String linkCode = formatLinkCode(str2);
            C0fG c0fG = (C0fG) bfm.A6v(Am0.A02);
            C1AC c1ac = C2VU.A04;
            BRg bRgA09 = C3U4.A09(C1b8.A01(C11U.A03(c1062ATq, AnonymousClass002.A0e(bfm).large), AnonymousClass001.A0f(bfm, akh).highlight), AuraDimensKt.SpacingMedium);
            InterfaceC04981Yd interfaceC04981Yd = AcQ.A01;
            InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(interfaceC04981Yd, bfm, c1ac, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA09);
            AnonymousClass005.A0n(bfm, bbi, function04);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0v3);
            C90m c90m = C90m.A00;
            int length = str2.length();
            if (length == 0) {
                bfm.AgE(987606153);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, c1062ATq);
                AnonymousClass005.A0n(bfm, bbi, function04);
                BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
                BPg.A02(bfm, akqA043, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA013, g0v3);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, j, bfm, i2, 7);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, i2);
            } else {
                bfm.AgE(987759789);
                AKH<AuraTypography> akh2 = AuraTypographyKt.LocalAuraTypography;
                AuraTextKt.m2639AuraTextUY9GdpU(linkCode, bRg, C06G.A0L(bfm, akh), AnonymousClass001.A0g(bfm, akh2).title2Emphasized, b0a, null, c1yl, i2, i2, i2, i2, null, null, null, bfm, i2, i2, 16370);
                C01N.A07(bfm, AnonymousClass001.A0O(c90m, bs0, true));
                if (length > 0) {
                    bfm.AgE(988015818);
                    String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121157);
                    C1822Arm c1822Arm2 = AnonymousClass001.A0g(bfm, akh2).bodyMedium;
                    long j9 = AnonymousClass001.A0f(bfm, akh).link;
                    boolean zA1T = AnonymousClass001.A1T(bfm, c0fG, AnonymousClass005.A1C(iA0d)) | AnonymousClass003.A1C(iA0d);
                    Object objAaT = bfm.AaT();
                    if (zA1T || objAaT == C78N.A00) {
                        objAaT = new WhatsAppCompanionCodeDisplayContentKt$WhatsAppCompanionCodeDisplayContent$1$2$2$1(function02, c0fG, str2);
                        bfm.Ai0(objAaT);
                    }
                    AuraTextKt.m2639AuraTextUY9GdpU(strA014, C3U4.A0C(C0v5.A04(bs0, null, null, (Function0) objAaT, true), 16.0f, 0.0f, 0.0f, 0.0f), j9, c1822Arm2, null, null, null, z4, i4, i2, i2, null, null, null, bfm, i2, i2, 16368);
                    BBI.A0R(bbi, i2);
                } else {
                    bfm.AgE(988457227);
                    BBI.A0R(bbi, i2);
                }
                BBI.A0R(bbi, i2);
            }
            BBI.A0R(bbi, true);
            C01N.A08(bfm, bs0, 16.0f);
            if (whatsAppCompanionErrorType != null) {
                int iA0B2 = AnonymousClass005.A0B(bfm, whatsAppCompanionErrorType, 1888406342);
                if (iA0B2 == 2) {
                    bfm.AgE(-1601648400);
                    strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f12115e);
                } else {
                    if (iA0B2 != i2 && iA0B2 != 1) {
                        throw AnonymousClass003.A0k(bfm, bbi, -1601651051);
                    }
                    bfm.AgE(-1601642352);
                    strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f12115d);
                }
                if (whatsAppCompanionErrorType == WhatsAppCompanionErrorType.POLL_EXHAUSTED) {
                    j2 = AnonymousClass006.A0i(bfm, akh, 1888859872).link;
                    BBI.A0R(bbi, i2);
                } else {
                    bfm.AgE(1888912076);
                    BBI.A0R(bbi, i2);
                    j2 = B6A.A05;
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA0s, C0v5.A04(C3U4.A0C(bs0, 0.0f, 0.0f, 0.0f, 12.0f), null, null, function0, true), j2, C06G.A0Z(bfm), null, null, new C1YL(3), i2, i2, i2, i2, null, null, null, bfm, i2, i2, 16304);
                BBI.A0R(bbi, i2);
            } else if (z2) {
                bfm.AgE(1889263120);
                BRg bRgA0C2 = C3U4.A0C(bs0, 0.0f, 0.0f, 0.0f, 12.0f);
                InterfaceC1380AiA interfaceC1380AiAA003 = C0A8.A00(interfaceC04981Yd, bfm, c1ac, 48);
                int iA0D3 = AnonymousClass001.A0D(bbi);
                AKQ akqA044 = BBI.A04(bbi);
                BRg bRgA014 = AxM.A01(bfm, bRgA0C2);
                AnonymousClass005.A0n(bfm, bbi, function04);
                BPg.A02(bfm, interfaceC1380AiAA003, g0v);
                BPg.A02(bfm, akqA044, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
                BPg.A02(bfm, bRgA014, g0v3);
                AKH<AuraTypography> akh3 = AuraTypographyKt.LocalAuraTypography;
                long j10 = 4281648985L << 32;
                boolean z5 = i2;
                int i6 = i2;
                int i7 = i2;
                int i8 = i2;
                int i9 = i2;
                AuraTextKt.m2639AuraTextUY9GdpU("\u2713 ", null, j10, AnonymousClass001.A0g(bfm, akh3).subheadlineRegular, null, null, null, z5, i6, i7, i8, null, null, null, bfm, 390, i9, 16370);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12115c), null, j10, AnonymousClass001.A0g(bfm, akh3).subheadlineRegular, null, null, null, z5, i6, i7, i8, null, null, null, bfm, 384, i9, 16370);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, i2);
            } else if (z) {
                bfm.AgE(1889844959);
                BRg bRgA0C3 = C3U4.A0C(bs0, 0.0f, 0.0f, 0.0f, 12.0f);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(i2);
                int iA0D4 = AnonymousClass001.A0D(bbi);
                AKQ akqA045 = BBI.A04(bbi);
                BRg bRgA015 = AxM.A01(bfm, bRgA0C3);
                AnonymousClass005.A0n(bfm, bbi, function04);
                BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
                BPg.A02(bfm, akqA045, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D4);
                BPg.A02(bfm, bRgA015, g0v3);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, j, bfm, i2, 7);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, i2);
            } else {
                bfm.AgE(1889921839);
                BBI.A0R(bbi, i2);
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            String strA015 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12115a);
            AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            boolean zA1S = AnonymousClass001.A1S(bfm, contextA0H, AnonymousClass005.A1K(iA0d));
            Object objAaT2 = bfm.AaT();
            if (zA1S || objAaT2 == C78N.A00) {
                objAaT2 = new WhatsAppCompanionCodeDisplayContentKt$WhatsAppCompanionCodeDisplayContent$1$5$1(function03, contextA0H);
                bfm.Ai0(objAaT2);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA015, null, c1062ATq, auraLabelButtonStylePrimary, auraButtonSize, null, i2, i2, i2, i2, i2, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, i2, i2, i2, i2, bfm, 199680, i2, i2, 134201285);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, z, z2, whatsAppCompanionErrorType, function0, function02, function03, i);
        }
    }

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WhatsAppCompanionErrorType.values().length];
            try {
                AnonymousClass002.A13(WhatsAppCompanionErrorType.POLL_EXHAUSTED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(WhatsAppCompanionErrorType.LINK_CODE_FAILED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(WhatsAppCompanionErrorType.POLL_FAILED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void deeplinkToWhatsAppLinkedDevices(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(WHATSAPP_LINKED_DEVICES_URL));
        intent.setPackage("com.whatsapp");
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(WHATSAPP_PLAY_STORE_URL));
        }
        context.startActivity(intent);
    }

    public static final String formatLinkCode(String str) {
        int length = str.length();
        if (length < 4) {
            return str;
        }
        int i = length / 2;
        return FGI.A0U(str.substring(0, i), " - ", str.substring(i));
    }
}
