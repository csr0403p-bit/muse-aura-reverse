package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0U;
import X.G0V;
import com.facebook.aura.activation.data.HatchRedeemInviteCodeCopy;
import com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchRedeemInviteCodeScreenKt$RedeemInviteCodeContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ HatchRedeemInviteCodeCopy $copy;
    public final /* synthetic */ G0U<String, Unit> $onCodeChange;
    public final /* synthetic */ Function0<Unit> $onConfirmClick;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ HatchRedeemInviteCodeViewModel.UiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRedeemInviteCodeScreenKt$RedeemInviteCodeContent$2(HatchRedeemInviteCodeCopy hatchRedeemInviteCodeCopy, HatchRedeemInviteCodeViewModel.UiState uiState, G0U<? super String, Unit> g0u, Function0<Unit> function0, float f, float f2, int i) {
        super(2);
        this.$copy = hatchRedeemInviteCodeCopy;
        this.$uiState = uiState;
        this.$onCodeChange = g0u;
        this.$onConfirmClick = function0;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$$changed = i;
    }

    public final void invoke(BFM bfm, int i) {
        HatchRedeemInviteCodeScreenKt.m138RedeemInviteCodeContentNuRrP5Q(this.$copy, this.$uiState, this.$onCodeChange, this.$onConfirmClick, this.$topPadding, this.$bottomPadding, bfm, AnonymousClass011.A00(this.$$changed));
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
