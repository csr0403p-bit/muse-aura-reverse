package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.model.HatchMessageChannel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$SidePanelChannelIcon$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ HatchMessageChannel $channel;
    public final /* synthetic */ int $iconRes;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$SidePanelChannelIcon$2(HatchMessageChannel hatchMessageChannel, int i, BRg bRg, float f, int i2, int i3) {
        super(2);
        this.$channel = hatchMessageChannel;
        this.$iconRes = i;
        this.$modifier = bRg;
        this.$size = f;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchConversationHistorySidePanelKt.m551SidePanelChannelIconjt2gSs(this.$channel, this.$iconRes, this.$modifier, this.$size, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
