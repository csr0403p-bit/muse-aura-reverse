package com.facebook.aura.shopping.view;

import X.AGI;
import X.AHD;
import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.BRg;
import X.C78N;
import X.G0V;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;

/* loaded from: classes.dex */
public final class ShoppingLinkMenuButtonKt$ShoppingLinkMenuButton$1$4 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
    public final /* synthetic */ String $label;
    public final /* synthetic */ AVy $linkIcon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingLinkMenuButtonKt$ShoppingLinkMenuButton$1$4(String str, AVy aVy) {
        super(2);
        this.$label = str;
        this.$linkIcon = aVy;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }

    public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
        bfm.AgE(-998624789);
        boolean zA1R = AnonymousClass001.A1R(bfm, this.$linkIcon, bfm.A65(this.$label));
        String str = this.$label;
        AVy aVy = this.$linkIcon;
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            objAaT = AGI.A0E(new AuraContextMenuItem(0, str, null, aVy, null, null, false, false, false, true, false, BRg.A00, 1, 1));
            bfm.Ai0(objAaT);
        }
        AHD<AuraContextMenuItem> ahd = (AHD) objAaT;
        AnonymousClass002.A19(bfm);
        return ahd;
    }
}
