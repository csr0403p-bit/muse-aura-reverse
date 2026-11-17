package com.facebook.aura.vds.compose.contextmenu;

import X.AXN;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes.dex */
public final class AuraContextMenuPositionProvider$calculatePosition$y$bandHeight$1 extends AbstractC7559F3s implements G0U<AuraContextMenuVerticalBand, Integer> {
    public final /* synthetic */ AuraContextMenuPositionProvider this$0;

    @Override // X.G0U
    public final Integer invoke(AuraContextMenuVerticalBand auraContextMenuVerticalBand) {
        C7384Etj.A0Y(auraContextMenuVerticalBand, 0);
        AXN axn = this.this$0.density;
        return Integer.valueOf(axn.Abr(auraContextMenuVerticalBand.bottomWindowY) - axn.Abr(auraContextMenuVerticalBand.topWindowY));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraContextMenuPositionProvider$calculatePosition$y$bandHeight$1(AuraContextMenuPositionProvider auraContextMenuPositionProvider) {
        super(1);
        this.this$0 = auraContextMenuPositionProvider;
    }
}
