package com.facebook.aura.status.view;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BBI;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.partners.voice.intf.Voice;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;

/* loaded from: classes.dex */
public final class HatchStatusScreenKt$EditMenuButton$1$5 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
    public final /* synthetic */ String $changeAvatarLabel;
    public final /* synthetic */ String $changeVoiceLabel;
    public final /* synthetic */ String $editNameLabel;
    public final /* synthetic */ String $shareAvatarLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusScreenKt$EditMenuButton$1$5(String str, String str2, String str3, String str4) {
        super(2);
        this.$changeAvatarLabel = str;
        this.$editNameLabel = str2;
        this.$changeVoiceLabel = str3;
        this.$shareAvatarLabel = str4;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }

    public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
        BBI bbiA0M;
        bfm.AgE(1960127752);
        bfm.AgE(-1807855481);
        String str = this.$changeAvatarLabel;
        AVy aVyA00 = BOf.A00(bfm, R.drawable.circle_user_wght400_outline_24, 0);
        BS0 bs0 = BRg.A00;
        AHH ahhA0E = AGI.A0E(new AuraContextMenuItem(1, str, null, aVyA00, null, null, false, false, false, true, false, bs0, 1, 1), new AuraContextMenuItem(2, this.$editNameLabel, null, BOf.A00(bfm, R.drawable.textformat_outline_24_wght400, 0), null, null, false, false, false, true, false, bs0, 1, 1));
        String str2 = this.$changeVoiceLabel;
        if (Voice.INSTANCE.isVoiceDesignSupported()) {
            bfm.AgE(1743954559);
            ahhA0E = ahhA0E.A34(new AuraContextMenuItem(4, str2, null, BOf.A00(bfm, R.drawable.microphone_wght400_outline_24, 0), null, null, false, false, false, true, false, bs0, 1, 1));
            bbiA0M = (BBI) bfm;
            BBI.A0R(bbiA0M, false);
        } else {
            bbiA0M = AnonymousClass002.A0M(bfm, 1744327985);
        }
        BBI.A0R(bbiA0M, false);
        String str3 = this.$shareAvatarLabel;
        if (HatchStatusMC.INSTANCE.isShareAvatarEnabled()) {
            bfm.AgE(-586373648);
            ahhA0E = ahhA0E.A34(new AuraContextMenuItem(3, str3, null, BOf.A00(bfm, R.drawable.arrow_share_wght400_outline_24, 0), null, null, false, false, false, true, false, bs0, 1, 1));
        } else {
            bfm.AgE(-585999261);
        }
        BBI.A0R(bbiA0M, false);
        BBI.A0R(bbiA0M, false);
        return ahhA0E;
    }
}
