package com.facebook.aura.whatsapp.view;

import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AbstractC8407FdO;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AuJ;
import X.AxM;
import X.B1U;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BHJ;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C0A8;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1518AkS;
import X.C1822Arm;
import X.C1C3;
import X.C1DM;
import X.C1YD;
import X.C1YL;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.components.phone.CountryDialCode;
import com.facebook.aura.components.phone.CountryDialCodesKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColorsTextInput;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class WhatsAppCompanionPhoneInputContentKt {
    public static final int MAX_PHONE_NUMBER_DIGITS = 15;

    /* renamed from: com.facebook.aura.whatsapp.view.WhatsAppCompanionPhoneInputContentKt$CountryCodeSelector$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<CountryDialCode, Unit> $onCountrySelected;
        public final /* synthetic */ Function0<Unit> $onOptionTapped;
        public final /* synthetic */ Function0<Unit> $onPickerOpened;
        public final /* synthetic */ CountryDialCode $selectedCountry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(CountryDialCode countryDialCode, G0U<? super CountryDialCode, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$selectedCountry = countryDialCode;
            this.$onCountrySelected = g0u;
            this.$onPickerOpened = function0;
            this.$onOptionTapped = function02;
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
            WhatsAppCompanionPhoneInputContentKt.CountryCodeSelector(this.$selectedCountry, this.$onCountrySelected, this.$onPickerOpened, this.$onOptionTapped, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.whatsapp.view.WhatsAppCompanionPhoneInputContentKt$WhatsAppCompanionPhoneInputContent$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ Function0<Unit> $onCountryOptionTapped;
        public final /* synthetic */ Function0<Unit> $onCountryPickerOpened;
        public final /* synthetic */ G0U<String, Unit> $onPhoneSubmit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$iconUrl = str;
            this.$onPhoneSubmit = g0u;
            this.$onCountryPickerOpened = function0;
            this.$onCountryOptionTapped = function02;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            WhatsAppCompanionPhoneInputContentKt.WhatsAppCompanionPhoneInputContent(this.$iconUrl, this.$onPhoneSubmit, this.$onCountryPickerOpened, this.$onCountryOptionTapped, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void CountryCodeSelector(CountryDialCode countryDialCode, G0U<? super CountryDialCode, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(521409379);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, countryDialCode) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            BRg bRgA0O = AnonymousClass006.A0O(BRg.A00);
            C1YD c1yd = new C1YD(0);
            boolean zA1K = AnonymousClass004.A1K(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1K || objAaT2 == obj) {
                objAaT2 = new WhatsAppCompanionPhoneInputContentKt$CountryCodeSelector$1$1$1(function0, mutableState);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0C = C3U4.A0C(C0v5.A04(bRgA0O, c1yd, null, (Function0) objAaT2, true), AuraDimensKt.SpacingMedium, 0.0f, AuraDimensKt.SpacingMicro, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(AuraDimensKt.SpacingXsmall), bfm, C2VU.A04, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String strCountryFlagEmoji = CountryDialCodesKt.countryFlagEmoji(countryDialCode.iso);
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            AuraTextKt.m2639AuraTextUY9GdpU(strCountryFlagEmoji, null, 0L, AnonymousClass001.A0g(bfm, akh).bodyRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
            String strA0H = FGI.A0H("+", countryDialCode.dialCode);
            C1822Arm c1822Arm = AnonymousClass001.A0g(bfm, akh).bodyRegular;
            AKH<AuraColors> akh2 = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0H, null, C06G.A0L(bfm, akh2), c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            AuraIconKt.m2567AuraIconFHprtrg(null, AbstractC8407FdO.A00(bfm, R.drawable.chevron_up_down_wght400_outline_24), AuraIconSize.TINY, null, C06G.A0I(bfm, akh2), null, bfm, AnonymousClass001.A03(), 41);
            BBI.A0R(bbi, true);
            boolean zA0A = MutableState.A0A(mutableState);
            boolean zA1M = AnonymousClass004.A1M(iA0d) | AnonymousClass001.A1O(iA0d);
            Object objAaT3 = bfm.AaT();
            if (zA1M || objAaT3 == obj) {
                objAaT3 = new WhatsAppCompanionPhoneInputContentKt$CountryCodeSelector$1$3$1(function02, g0u, mutableState);
                bfm.Ai0(objAaT3);
            }
            G0U g0u3 = (G0U) objAaT3;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new WhatsAppCompanionPhoneInputContentKt$CountryCodeSelector$1$4$1(mutableState);
                bfm.Ai0(objAaT4);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, g0u3, (Function0) objAaT4, zA0A, null, 0L, null, false, new WhatsAppCompanionPhoneInputContentKt$CountryCodeSelector$1$5(countryDialCode), false, null, null, null, false, bfm, 384, 0, 16113);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(countryDialCode, g0u, function0, function02, bRg2, i, i2);
        }
    }

    public static final void WhatsAppCompanionPhoneInputContent(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        boolean z;
        AnonymousClass002.A1A(g0u, 1, function0);
        C7384Etj.A0Y(function02, 3);
        bfm.AgG(-1406886479);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, CountryDialCodesKt.DEFAULT_COUNTRY_DIAL_CODE);
            }
            MutableState mutableState = (MutableState) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass004.A11(bfm, "");
            }
            MutableState mutableState2 = (MutableState) objAaT2;
            C1518AkS c1518AkS = (C1518AkS) AnonymousClass003.A0d(bfm, bfm.AaT(), obj);
            C1C3 c1c3 = (C1C3) bfm.A6v(Am0.A0E);
            Unit unit = Unit.INSTANCE;
            boolean zA65 = bfm.A65(c1c3);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == obj) {
                objAaT3 = new WhatsAppCompanionPhoneInputContentKt$WhatsAppCompanionPhoneInputContent$1$1(c1518AkS, c1c3, null);
                bfm.Ai0(objAaT3);
            }
            C78e.A06(bfm, unit, (G0V) objAaT3);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0C = C3U4.A0C(C3U4.A0B(c1062ATq, 24.0f, 0.0f), 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingSmall);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, i2);
            C01N.A08(bfm, bs0, 24.0f);
            if (str == null) {
                bfm.AgE(975383263);
                z = false;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(975383264);
                AuraImageKt.m2573AuraImageXRP3Ue8(str, C11U.A01(C10G.A07(bs0, 40.0f), 12.0f), null, null, null, false, null, 0L, false, false, false, null, null, null, null, bfm, 0, 0, 32764);
                C01N.A08(bfm, bs0, 12.0f);
                z = false;
                BBI.A0R(bbi, false);
            }
            boolean z2 = z;
            boolean z3 = z;
            boolean z4 = z;
            boolean z5 = z;
            boolean z6 = z;
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121162), null, C06G.A0C(bfm), AnonymousClass002.A0f(bfm).title3Emphasized, null, null, null, z2, z3 ? 1 : 0, z4 ? 1 : 0, z5 ? 1 : 0, null, null, null, bfm, z ? 1 : 0, z6 ? 1 : 0, 16370);
            C01N.A08(bfm, bs0, 12.0f);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12115f);
            C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, c1062ATq, C06G.A0I(bfm, akh), c1822ArmA0Z, null, null, new C1YL(3), z2, z3 ? 1 : 0, z4 ? 1 : 0, z5 ? 1 : 0, null, null, null, bfm, 48, z6 ? 1 : 0, 16304);
            C01N.A08(bfm, bs0, 16.0f);
            AuraColorsTextInput auraColorsTextInput = AnonymousClass001.A0f(bfm, akh).textInput;
            AuraColorsTextInput auraColorsTextInput2 = new AuraColorsTextInput(auraColorsTextInput.textColor, auraColorsTextInput.cursorColor, auraColorsTextInput.placeholderColor, B6A.A06, auraColorsTextInput.unfocusedBorderColor, auraColorsTextInput.errorBorderColor, auraColorsTextInput.backgroundColor);
            String strA05 = MutableState.A05(mutableState2);
            C1DM c1dm = AnonymousClass002.A0e(bfm).modal;
            BRg bRgA00 = BHJ.A00(c1062ATq, c1518AkS);
            AuJ auJ = new AuJ(null, -1, 3, -1);
            G0V<BFM, Integer, Unit> g0v = ComposableSingletons$WhatsAppCompanionPhoneInputContentKt.lambda$1672418835;
            B1U b1uA00 = B1V.A00(bfm, new WhatsAppCompanionPhoneInputContentKt$WhatsAppCompanionPhoneInputContent$2$2(function0, function02, mutableState), -908752866);
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new WhatsAppCompanionPhoneInputContentKt$WhatsAppCompanionPhoneInputContent$2$3$1(mutableState2);
                bfm.Ai0(objAaT4);
            }
            boolean z7 = z;
            boolean z8 = z;
            AuraTextInputKt.AuraTextInput(strA05, null, bRgA00, g0v, auJ, null, null, null, true, z ? 1 : 0, z ? 1 : 0, b1uA00, null, auraColorsTextInput2, null, z7, z8, z, z, c1dm, (G0U) objAaT4, bfm, 100690944, 48, 6, 513762);
            C01N.A08(bfm, bs0, 16.0f);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121160);
            AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            boolean z9 = MutableState.A01(mutableState2) > 0;
            boolean zA1C = AnonymousClass003.A1C(iA0d);
            Object objAaT5 = bfm.AaT();
            if (zA1C || objAaT5 == obj) {
                objAaT5 = new WhatsAppCompanionPhoneInputContentKt$WhatsAppCompanionPhoneInputContent$2$4$1(g0u, mutableState, mutableState2);
                bfm.Ai0(objAaT5);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, c1062ATq, auraLabelButtonStylePrimary, auraButtonSize, null, z, z, z9, z, z, null, null, (Function0) objAaT5, null, null, null, null, null, null, null, null, z, z ? 1 : 0, z7, z8 ? 1 : 0, bfm, 199680, z ? 1 : 0, z ? 1 : 0, 134200773);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, g0u, function0, function02, i);
        }
    }

    public static final /* synthetic */ CountryDialCode access$WhatsAppCompanionPhoneInputContent$lambda$1(MutableState mutableState) {
        return (CountryDialCode) mutableState.getValue();
    }
}
