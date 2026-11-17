package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmDataChoiceOptionsKt$ConfidentialVmDataChoiceOption$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ Function0<Unit> $onSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmDataChoiceOptionsKt$ConfidentialVmDataChoiceOption$1$1(Function0<Unit> function0) {
        super(1);
        this.$onSelect = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        this.$onSelect.invoke();
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        this.$onSelect.invoke();
    }
}
