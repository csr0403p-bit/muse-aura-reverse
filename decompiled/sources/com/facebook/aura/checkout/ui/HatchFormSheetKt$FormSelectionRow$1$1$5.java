package com.facebook.aura.checkout.ui;

import X.AHD;
import X.AVy;
import X.AbstractC0885AGm;
import X.AbstractC2159Azp;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C1805ArO;
import X.C78N;
import X.F60;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class HatchFormSheetKt$FormSelectionRow$1$1$5 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
    public final /* synthetic */ HatchFormField $field;
    public final /* synthetic */ C1805ArO $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFormSheetKt$FormSelectionRow$1$1$5(HatchFormField hatchFormField, C1805ArO c1805ArO) {
        super(2);
        this.$field = hatchFormField;
        this.$value = c1805ArO;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }

    public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
        bfm.AgE(963761054);
        AVy aVyA00 = BOf.A00(bfm, R.drawable.checkmark_outline_24, 0);
        boolean zA1R = AnonymousClass005.A1R(bfm, this.$field.options, this.$value.A01.A00, aVyA00);
        HatchFormField hatchFormField = this.$field;
        C1805ArO c1805ArO = this.$value;
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            AHD<HatchFormOption> ahd = hatchFormField.options;
            ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
            int i2 = 0;
            for (Object obj : ahd) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                HatchFormOption hatchFormOption = (HatchFormOption) obj;
                boolean zA12 = AbstractC2159Azp.A12(hatchFormOption.value, c1805ArO.A01.A00, true);
                String str = hatchFormOption.label;
                AVy aVy = aVyA00;
                if (!zA12) {
                    aVy = null;
                }
                arrayListA0i.add(new AuraContextMenuItem(i2, str, null, null, null, aVy, zA12, false, false, true, false, BRg.A00, 1, 1));
                i2 = i3;
            }
            objAaT = AnonymousClass001.A0z(bfm, arrayListA0i);
        }
        AHD<AuraContextMenuItem> ahd2 = (AHD) objAaT;
        AnonymousClass001.A1D(bfm);
        return ahd2;
    }
}
