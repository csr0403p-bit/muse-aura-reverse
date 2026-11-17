package com.facebook.aura.conversation.view.richcontent;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;

/* loaded from: classes.dex */
public final class HatchInlineFileChipKt$ChipMenuButton$1$4 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
    public final /* synthetic */ AHD<AuraContextMenuItem> $menuItems;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInlineFileChipKt$ChipMenuButton$1$4(AHD<AuraContextMenuItem> ahd) {
        super(2);
        this.$menuItems = ahd;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }

    public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
        bfm.AgE(-382429266);
        AHD<AuraContextMenuItem> ahd = this.$menuItems;
        AnonymousClass002.A19(bfm);
        return ahd;
    }
}
