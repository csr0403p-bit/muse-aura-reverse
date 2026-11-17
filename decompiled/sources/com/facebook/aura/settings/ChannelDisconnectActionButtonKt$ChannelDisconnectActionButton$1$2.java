package com.facebook.aura.settings;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.BOf;
import X.BRg;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;

/* loaded from: classes.dex */
public final class ChannelDisconnectActionButtonKt$ChannelDisconnectActionButton$1$2 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
    public final /* synthetic */ String $disconnectLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelDisconnectActionButtonKt$ChannelDisconnectActionButton$1$2(String str) {
        super(2);
        this.$disconnectLabel = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }

    public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
        bfm.AgE(-128495517);
        AHH ahhA0E = AGI.A0E(new AuraContextMenuItem(0, this.$disconnectLabel, null, BOf.A00(bfm, R.drawable.ic_wearables_minus_circle, 0), null, null, false, false, false, true, true, BRg.A00, 1, 1));
        AnonymousClass001.A1D(bfm);
        return ahhA0E;
    }
}
