package com.facebook.aura.skills.view;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AII;
import X.AIM;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BBI;
import X.BFM;
import X.BOf;
import X.BRg;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountUiModel;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;

/* loaded from: classes.dex */
public final class LinkedSkillAccountRowKt$LinkedSkillAccountMenu$1$4 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
    public final /* synthetic */ SkillLinkedAccountUiModel $account;
    public final /* synthetic */ boolean $enabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedSkillAccountRowKt$LinkedSkillAccountMenu$1$4(SkillLinkedAccountUiModel skillLinkedAccountUiModel, boolean z) {
        super(2);
        this.$account = skillLinkedAccountUiModel;
        this.$enabled = z;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }

    public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
        bfm.AgE(-217447075);
        SkillLinkedAccountUiModel skillLinkedAccountUiModel = this.$account;
        boolean z = this.$enabled;
        AII aiiA17 = AIM.A17();
        if (skillLinkedAccountUiModel.needsReauth) {
            bfm.AgE(1488538509);
            aiiA17.add(new AuraContextMenuItem(0, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f8d), null, BOf.A00(bfm, R.drawable.arrow_diagonal_right_up_20, 0), null, null, false, false, false, z, false, BRg.A00, 1, 1));
        } else {
            bfm.AgE(1488888313);
        }
        BBI bbi = (BBI) bfm;
        BBI.A0R(bbi, false);
        aiiA17.add(new AuraContextMenuItem(1, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120acc), null, BOf.A00(bfm, R.drawable.circle_x_wght400_outline_24, 0), null, null, false, false, false, z, true, BRg.A00, 1, 1));
        AHH ahhA0C = AGI.A0C(AIM.A18(aiiA17));
        BBI.A0R(bbi, false);
        return ahhA0C;
    }
}
