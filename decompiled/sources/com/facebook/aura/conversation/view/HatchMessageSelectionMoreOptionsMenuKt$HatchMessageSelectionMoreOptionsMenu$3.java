package com.facebook.aura.conversation.view;

import X.AHD;
import X.AHH;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;

/* loaded from: classes.dex */
public final class HatchMessageSelectionMoreOptionsMenuKt$HatchMessageSelectionMoreOptionsMenu$3 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
    public final /* synthetic */ AHH<AuraContextMenuItem> $menuItems;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageSelectionMoreOptionsMenuKt$HatchMessageSelectionMoreOptionsMenu$3(AHH<AuraContextMenuItem> ahh) {
        super(2);
        this.$menuItems = ahh;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }

    public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
        bfm.AgE(1773864374);
        AHH<AuraContextMenuItem> ahh = this.$menuItems;
        AnonymousClass002.A19(bfm);
        return ahh;
    }
}
