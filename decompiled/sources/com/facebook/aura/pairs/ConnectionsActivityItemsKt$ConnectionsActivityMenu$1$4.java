package com.facebook.aura.pairs;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;

/* loaded from: classes.dex */
public final class ConnectionsActivityItemsKt$ConnectionsActivityMenu$1$4 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
    public final /* synthetic */ String $removeLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsActivityItemsKt$ConnectionsActivityMenu$1$4(String str) {
        super(2);
        this.$removeLabel = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }

    public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
        bfm.AgE(-1779924217);
        AHH ahhA0E = AGI.A0E(new AuraContextMenuItem(0, this.$removeLabel, null, null, null, null, false, false, false, true, false, BRg.A00, 1, 1));
        AnonymousClass001.A1D(bfm);
        return ahhA0E;
    }
}
