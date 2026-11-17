package com.facebook.aura.status.view;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.partners.voice.intf.Voice;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;

/* loaded from: classes.dex */
public final class HatchAvatarEditMenuButtonKt$HatchAvatarEditMenu$1$4 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
    public final /* synthetic */ String $changeAvatarLabel;
    public final /* synthetic */ String $changeVoiceLabel;
    public final /* synthetic */ String $editNameLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarEditMenuButtonKt$HatchAvatarEditMenu$1$4(String str, String str2, String str3) {
        super(2);
        this.$changeAvatarLabel = str;
        this.$editNameLabel = str2;
        this.$changeVoiceLabel = str3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }

    public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
        bfm.AgE(-600220946);
        String str = this.$changeAvatarLabel;
        AVy aVyA00 = BOf.A00(bfm, R.drawable.circle_user_wght400_outline_24, 0);
        BS0 bs0 = BRg.A00;
        AHH ahhA0E = AGI.A0E(new AuraContextMenuItem(1, str, null, aVyA00, null, null, false, false, false, true, false, bs0, 1, 1), new AuraContextMenuItem(2, this.$editNameLabel, null, BOf.A00(bfm, R.drawable.textformat_outline_24_wght400, 0), null, null, false, false, false, true, false, bs0, 1, 1));
        String str2 = this.$changeVoiceLabel;
        if (Voice.INSTANCE.isVoiceDesignSupported()) {
            bfm.AgE(1138795817);
            ahhA0E = ahhA0E.A34(new AuraContextMenuItem(3, str2, null, BOf.A00(bfm, R.drawable.audio_outline_24_wght400, 0), null, null, false, false, false, true, false, bs0, 1, 1));
        } else {
            bfm.AgE(1139171165);
        }
        AnonymousClass006.A1N(bfm);
        return ahhA0E;
    }
}
