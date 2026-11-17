package com.facebook.aura.settings.support;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C07C;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.settings.support.HatchContactSupportViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchContactSupportScreenKt$ContactSupportForm$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $attachments;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ boolean $canSubmit;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $diagnostics;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onDescriptionChange;
    public final /* synthetic */ G0U<String, Unit> $onEmailChange;
    public final /* synthetic */ G0U<String, Unit> $onNameChange;
    public final /* synthetic */ Function0<Unit> $onSubmit;
    public final /* synthetic */ G0U<String, Unit> $onTopicSelected;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ HatchContactSupportViewModel.UiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchContactSupportScreenKt$ContactSupportForm$2(HatchContactSupportViewModel.UiState uiState, boolean z, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super String, Unit> g0u4, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, Function0<Unit> function0, G0V<? super BFM, ? super Integer, Unit> g0v, float f, float f2, BRg bRg, int i, int i2, int i3) {
        super(2);
        this.$uiState = uiState;
        this.$canSubmit = z;
        this.$onNameChange = g0u;
        this.$onEmailChange = g0u2;
        this.$onTopicSelected = g0u3;
        this.$onDescriptionChange = g0u4;
        this.$attachments = g0w;
        this.$onSubmit = function0;
        this.$diagnostics = g0v;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchContactSupportScreenKt.m1986ContactSupportFormw41Enmo(this.$uiState, this.$canSubmit, this.$onNameChange, this.$onEmailChange, this.$onTopicSelected, this.$onDescriptionChange, this.$attachments, this.$onSubmit, this.$diagnostics, this.$topPadding, this.$bottomPadding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
