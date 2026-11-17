package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmSwitchIntroScreenKt$ConfidentialVmSwitchIntroContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onLearnMoreClick;
    public final /* synthetic */ Function0<Unit> $onSecondaryClick;
    public final /* synthetic */ Function0<Unit> $onSwitchClick;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ ConfidentialVmSwitchUiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSwitchIntroScreenKt$ConfidentialVmSwitchIntroContent$2(ConfidentialVmSwitchUiState confidentialVmSwitchUiState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, float f, float f2, BRg bRg, int i, int i2) {
        super(2);
        this.$uiState = confidentialVmSwitchUiState;
        this.$onSwitchClick = function0;
        this.$onSecondaryClick = function02;
        this.$onLearnMoreClick = function03;
        this.$topPadding = f;
        this.$bottomPadding = f2;
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
        ConfidentialVmSwitchIntroScreenKt.m475ConfidentialVmSwitchIntroContent3GLzNTs(this.$uiState, this.$onSwitchClick, this.$onSecondaryClick, this.$onLearnMoreClick, this.$topPadding, this.$bottomPadding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
