package com.facebook.aura.iap.iac;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class IacSandboxSheetContentKt$SheetRadioRow$2$2$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ Function0<Unit> $onSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IacSandboxSheetContentKt$SheetRadioRow$2$2$1(Function0<Unit> function0) {
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
