package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BQG;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06827l3;
import X.C06G;
import X.C0v5;
import X.C11S;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D3;
import X.C1D8;
import X.C1YD;
import X.C1b8;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.components.phone.CountryDialCode;
import com.facebook.aura.components.phone.CountryDialCodesKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginCountryFieldKt {
    public static final List<String> COUNTRY_MENU_LABELS;
    public static final C1D3 FIELD_SHAPE = C1D8.A00(26.0f);
    public static final C06827l3 NATIONAL_PHONE_CHARS;

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCountryFieldKt$NativeLoginCountryField$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
        public final /* synthetic */ CountryDialCode $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(CountryDialCode countryDialCode) {
            super(2);
            this.$selected = countryDialCode;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
            bfm.AgE(2097665543);
            boolean zA65 = bfm.A65(this.$selected);
            CountryDialCode countryDialCode = this.$selected;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                List<String> list = NativeLoginCountryFieldKt.COUNTRY_MENU_LABELS;
                ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                int i2 = 0;
                for (String str : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    arrayListA0i.add(new AuraContextMenuItem(i2, str, null, null, null, null, C7384Etj.areEqual(CountryDialCodesKt.COUNTRY_DIAL_CODES.get(i2), countryDialCode), false, false, true, false, BRg.A00, 1, 1));
                    i2 = i3;
                }
                objAaT = AnonymousClass001.A0z(bfm, arrayListA0i);
            }
            AHD<AuraContextMenuItem> ahd = (AHD) objAaT;
            AnonymousClass002.A19(bfm);
            return ahd;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCountryFieldKt$NativeLoginCountryField$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<CountryDialCode, Unit> $onCountrySelected;
        public final /* synthetic */ CountryDialCode $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(CountryDialCode countryDialCode, G0U<? super CountryDialCode, Unit> g0u, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$selected = countryDialCode;
            this.$onCountrySelected = g0u;
            this.$modifier = bRg;
            this.$enabled = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginCountryFieldKt.NativeLoginCountryField(this.$selected, this.$onCountrySelected, this.$modifier, this.$enabled, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final boolean shouldShowCountryField(String str) {
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(str);
        Character chA0f = BQG.A0f(strA0l);
        return chA0f != null && Character.isDigit(chA0f.charValue()) && NATIONAL_PHONE_CHARS.A08(strA0l);
    }

    static {
        List<CountryDialCode> list = CountryDialCodesKt.COUNTRY_DIAL_CODES;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (CountryDialCode countryDialCode : list) {
            String strCountryFlagEmoji = CountryDialCodesKt.countryFlagEmoji(countryDialCode.iso);
            String str = countryDialCode.iso;
            int i = countryDialCode.dialCode;
            StringBuilder sb = new StringBuilder();
            sb.append(strCountryFlagEmoji);
            sb.append("  ");
            sb.append(str);
            sb.append("  +");
            sb.append(i);
            arrayListA0i.add(sb.toString());
        }
        COUNTRY_MENU_LABELS = arrayListA0i;
        NATIONAL_PHONE_CHARS = new C06827l3("[0-9 ()\\-.]+");
    }

    public static final void NativeLoginCountryField(CountryDialCode countryDialCode, G0U<? super CountryDialCode, Unit> g0u, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean z2 = z;
        boolean zA1a = AnonymousClass002.A1a(countryDialCode, g0u);
        bfm.AgG(-1874444865);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, countryDialCode) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            String strA0t = AnonymousClass001.A0t(bfm, countryDialCode.iso, R.string._name_removed__res_0x7f1204a7);
            float f = z2 ? 1.0f : 0.3f;
            BRg bRgA01 = C1b8.A01(C11U.A03(AnonymousClass001.A0V(bRg2, NativeLoginCommonKt.MIN_TOUCH_TARGET), FIELD_SHAPE), C06G.A0J(bfm, AuraColorsKt.LocalAuraColors));
            C1YD c1yd = new C1YD(0);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new NativeLoginCountryFieldKt$NativeLoginCountryField$1$1(mutableState);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA07 = C3U4.A07(C0v5.A04(bRgA01, c1yd, null, (Function0) objAaT2, z2), 16.0f);
            boolean zA65 = bfm.A65(strA0t);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == obj) {
                objAaT3 = new NativeLoginCountryFieldKt$NativeLoginCountryField$2$1(strA0t);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA07, objAaT3, false);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA012, i5);
            String strCountryFlagEmoji = CountryDialCodesKt.countryFlagEmoji(countryDialCode.iso);
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            C1822Arm c1822Arm = AnonymousClass001.A0g(bfm, akh).subheadlineRegular;
            BS0 bs0 = BRg.A00;
            AuraTextKt.m2639AuraTextUY9GdpU(strCountryFlagEmoji, C11S.A00(bs0, f), 0L, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16372);
            C01N.A09(bfm, bs0, 6.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(FGI.A0H("+", countryDialCode.dialCode), C11S.A00(bs0, f), C06G.A0C(bfm), AnonymousClass001.A0g(bfm, akh).subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            BBI.A0R(bbi, zA1a);
            boolean zA0A = MutableState.A0A(mutableState);
            boolean zA1O = AnonymousClass001.A1O(iA0d);
            Object objAaT4 = bfm.AaT();
            if (zA1O || objAaT4 == obj) {
                objAaT4 = new NativeLoginCountryFieldKt$NativeLoginCountryField$4$1(g0u, mutableState);
                bfm.Ai0(objAaT4);
            }
            G0U g0u2 = (G0U) objAaT4;
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = new NativeLoginCountryFieldKt$NativeLoginCountryField$5$1(mutableState);
                bfm.Ai0(objAaT5);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, g0u2, (Function0) objAaT5, zA0A, null, 0L, null, false, new AnonymousClass6(countryDialCode), false, null, null, null, false, bfm, 384, 0, 16113);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass7(countryDialCode, g0u, bRg2, z2, i, i2);
        }
    }
}
