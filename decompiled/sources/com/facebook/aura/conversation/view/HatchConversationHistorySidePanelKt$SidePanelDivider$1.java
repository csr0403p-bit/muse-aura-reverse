package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$SidePanelDivider$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $figmaHorizontalPadding;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ boolean $useFigmaStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$SidePanelDivider$1(BRg bRg, boolean z, float f, int i, int i2) {
        super(2);
        this.$modifier = bRg;
        this.$useFigmaStyle = z;
        this.$figmaHorizontalPadding = f;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchConversationHistorySidePanelKt.m552SidePanelDivider6a0pyJM(this.$modifier, this.$useFigmaStyle, this.$figmaHorizontalPadding, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
