package com.facebook.aura.checkout.ui;

import X.AHD;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFM;
import X.BRg;
import X.C78N;
import X.C7BY;
import X.F60;
import X.G0V;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class HatchFormSheetKt$AutocompleteFieldRow$1$5 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
    public final /* synthetic */ AHD<HatchAddressSuggestion> $suggestions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFormSheetKt$AutocompleteFieldRow$1$5(AHD<HatchAddressSuggestion> ahd) {
        super(2);
        this.$suggestions = ahd;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }

    public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
        bfm.AgE(-2052990162);
        boolean zA65 = bfm.A65(this.$suggestions);
        AHD<HatchAddressSuggestion> ahd = this.$suggestions;
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
            int i2 = 0;
            for (Object obj : ahd) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                HatchAddressSuggestion hatchAddressSuggestion = (HatchAddressSuggestion) obj;
                String str = hatchAddressSuggestion.title;
                String str2 = hatchAddressSuggestion.subtitle;
                if (str2 == null || C7BY.A0j(str2)) {
                    str2 = null;
                }
                arrayListA0i.add(new AuraContextMenuItem(i2, str, str2, null, null, null, false, false, false, true, false, BRg.A00, 2, 1));
                i2 = i3;
            }
            objAaT = AnonymousClass001.A0z(bfm, arrayListA0i);
        }
        AHD<AuraContextMenuItem> ahd2 = (AHD) objAaT;
        AnonymousClass002.A19(bfm);
        return ahd2;
    }
}
