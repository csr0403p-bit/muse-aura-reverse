package com.facebook.aura.ccv.nativeflow.ui;

import X.AGI;
import X.AHD;
import X.AVy;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.ccv.nativeflow.HatchCcvCountryConfig;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryScreenKt$CcvCountryField$2$6 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
    public final /* synthetic */ AHD<HatchCcvCountryConfig> $countries;
    public final /* synthetic */ String $selectedCountry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvCardEntryScreenKt$CcvCountryField$2$6(AHD<HatchCcvCountryConfig> ahd, String str) {
        super(2);
        this.$countries = ahd;
        this.$selectedCountry = str;
    }

    public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
        bfm.AgE(-884159980);
        AVy aVyA00 = BOf.A00(bfm, R.drawable.checkmark_outline_24, 0);
        boolean zA1P = AnonymousClass003.A1P(bfm, this.$selectedCountry, aVyA00, bfm.A65(this.$countries));
        AHD<HatchCcvCountryConfig> ahd = this.$countries;
        String str = this.$selectedCountry;
        Object objAaT = bfm.AaT();
        if (zA1P || objAaT == C78N.A00) {
            ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
            int i2 = 0;
            for (Object obj : ahd) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                HatchCcvCountryConfig hatchCcvCountryConfig = (HatchCcvCountryConfig) obj;
                boolean zAreEqual = C7384Etj.areEqual(hatchCcvCountryConfig.country, str);
                String strCountryDisplayName = hatchCcvCountryConfig.label;
                if (strCountryDisplayName == null) {
                    strCountryDisplayName = HatchCcvCardEntryScreenKt.countryDisplayName(hatchCcvCountryConfig.country);
                }
                AVy aVy = aVyA00;
                if (!zAreEqual) {
                    aVy = null;
                }
                arrayListA0i.add(new AuraContextMenuItem(i2, strCountryDisplayName, null, null, null, aVy, zAreEqual, false, false, true, false, BRg.A00, 1, 1));
                i2 = i3;
            }
            objAaT = AGI.A07(arrayListA0i);
            bfm.Ai0(objAaT);
        }
        AHD<AuraContextMenuItem> ahd2 = (AHD) objAaT;
        AnonymousClass001.A1D(bfm);
        return ahd2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }
}
