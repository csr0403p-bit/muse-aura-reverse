package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSpokenSummaryRowKt$HatchSpokenSummaryRow$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $chatBackground;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSpokenSummaryRowKt$HatchSpokenSummaryRow$2(HatchMessageUiModel hatchMessageUiModel, long j, BRg bRg, G0U<? super HatchMessageUiModel, Unit> g0u, int i, int i2) {
        super(2);
        this.$message = hatchMessageUiModel;
        this.$chatBackground = j;
        this.$modifier = bRg;
        this.$onSelectionReply = g0u;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchSpokenSummaryRowKt.m663HatchSpokenSummaryRowsW7UJKQ(this.$message, this.$chatBackground, this.$modifier, this.$onSelectionReply, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
