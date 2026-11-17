package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAgentIndicatorsKt$HatchStreamingCursor$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $activityText;
    public final /* synthetic */ long $bubbleBackground;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAgentIndicatorsKt$HatchStreamingCursor$3(long j, String str, BRg bRg, int i, int i2) {
        super(2);
        this.$bubbleBackground = j;
        this.$activityText = str;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchAgentIndicatorsKt.m526HatchStreamingCursorKTwxG1Y(this.$bubbleBackground, this.$activityText, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
