package com.facebook.aura.skills.connect;

import X.AGI;
import X.AHD;
import X.AVy;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BFM;
import X.BOf;
import X.BRg;
import X.F60;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.skills.connect.LinkedAccountsTitle;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class LinkedAccountsTitleAccessoryKt$LinkedAccountsChip$1$5 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
    public final /* synthetic */ LinkedAccountsTitle.Chip $chip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedAccountsTitleAccessoryKt$LinkedAccountsChip$1$5(LinkedAccountsTitle.Chip chip) {
        super(2);
        this.$chip = chip;
    }

    public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
        bfm.AgE(849400438);
        AVy aVyA00 = BOf.A00(bfm, R.drawable.aura_check, 0);
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120faa);
        AHD<LinkedAccountMenuItem> ahd = this.$chip.menuItems;
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        int i2 = 0;
        for (Object obj : ahd) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            LinkedAccountMenuItem linkedAccountMenuItem = (LinkedAccountMenuItem) obj;
            String str = linkedAccountMenuItem.name;
            if (str == null) {
                str = strA01;
            }
            boolean z = linkedAccountMenuItem.selected;
            AVy aVy = aVyA00;
            if (!z) {
                aVy = null;
            }
            arrayListA0i.add(new AuraContextMenuItem(i2, str, null, null, null, aVy, z, false, false, true, false, BRg.A00, 1, 1));
            i2 = i3;
        }
        AHD<AuraContextMenuItem> ahdA07 = AGI.A07(arrayListA0i);
        AnonymousClass001.A1D(bfm);
        return ahdA07;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }
}
