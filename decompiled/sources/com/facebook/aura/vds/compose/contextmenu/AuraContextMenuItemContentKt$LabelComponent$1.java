package com.facebook.aura.vds.compose.contextmenu;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraContextMenuItemContentKt$LabelComponent$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $label;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ long $menuItemColor;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraContextMenuItemContentKt$LabelComponent$1(String str, long j, BRg bRg, int i, int i2, int i3) {
        super(2);
        this.$label = str;
        this.$menuItemColor = j;
        this.$modifier = bRg;
        this.$maxLines = i;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraContextMenuItemContentKt.m2517LabelComponentsW7UJKQ(this.$label, this.$menuItemColor, this.$modifier, this.$maxLines, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
