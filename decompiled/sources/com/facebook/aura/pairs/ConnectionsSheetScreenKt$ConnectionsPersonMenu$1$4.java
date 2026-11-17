package com.facebook.aura.pairs;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;

/* loaded from: classes.dex */
public final class ConnectionsSheetScreenKt$ConnectionsPersonMenu$1$4 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
    public final /* synthetic */ AVy $removeIcon;
    public final /* synthetic */ String $removeLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsSheetScreenKt$ConnectionsPersonMenu$1$4(String str, AVy aVy) {
        super(2);
        this.$removeLabel = str;
        this.$removeIcon = aVy;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }

    public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
        bfm.AgE(-946925689);
        AHH ahhA0E = AGI.A0E(new AuraContextMenuItem(1, this.$removeLabel, null, this.$removeIcon, null, null, false, false, false, true, true, BRg.A00, 1, 1));
        AnonymousClass001.A1D(bfm);
        return ahhA0E;
    }
}
