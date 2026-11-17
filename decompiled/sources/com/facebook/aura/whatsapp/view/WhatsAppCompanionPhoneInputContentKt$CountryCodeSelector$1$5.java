package com.facebook.aura.whatsapp.view;

import X.AHD;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFM;
import X.BRg;
import X.C78N;
import X.F60;
import X.FGI;
import X.G0V;
import com.facebook.aura.components.phone.CountryDialCode;
import com.facebook.aura.components.phone.CountryDialCodesKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class WhatsAppCompanionPhoneInputContentKt$CountryCodeSelector$1$5 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
    public final /* synthetic */ CountryDialCode $selectedCountry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhatsAppCompanionPhoneInputContentKt$CountryCodeSelector$1$5(CountryDialCode countryDialCode) {
        super(2);
        this.$selectedCountry = countryDialCode;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }

    public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
        bfm.AgE(648337253);
        List<CountryDialCode> list = CountryDialCodesKt.COUNTRY_DIAL_CODES;
        boolean zA1R = AnonymousClass001.A1R(bfm, this.$selectedCountry, bfm.A65(list));
        CountryDialCode countryDialCode = this.$selectedCountry;
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            int i2 = 0;
            for (CountryDialCode countryDialCode2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                CountryDialCode countryDialCode3 = countryDialCode2;
                arrayListA0i.add(new AuraContextMenuItem(i2, FGI.A0S(CountryDialCodesKt.countryFlagEmoji(countryDialCode3.iso), "  +", countryDialCode3.dialCode), null, null, null, null, countryDialCode3.equals(countryDialCode), false, false, true, false, BRg.A00, 1, 1));
                i2 = i3;
            }
            objAaT = AnonymousClass001.A0z(bfm, arrayListA0i);
        }
        AHD<AuraContextMenuItem> ahd = (AHD) objAaT;
        AnonymousClass002.A19(bfm);
        return ahd;
    }
}
