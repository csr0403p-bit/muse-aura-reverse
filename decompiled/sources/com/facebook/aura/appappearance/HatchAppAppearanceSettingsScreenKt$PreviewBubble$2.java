package com.facebook.aura.appappearance;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAppAppearanceSettingsScreenKt$PreviewBubble$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ boolean $alignEnd;
    public final /* synthetic */ long $color;
    public final /* synthetic */ float $height;
    public final /* synthetic */ float $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAppAppearanceSettingsScreenKt$PreviewBubble$2(long j, float f, float f2, boolean z, int i) {
        super(2);
        this.$color = j;
        this.$width = f;
        this.$height = f2;
        this.$alignEnd = z;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchAppAppearanceSettingsScreenKt.m238PreviewBubble9dGMCfo(this.$color, this.$width, this.$height, this.$alignEnd, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
