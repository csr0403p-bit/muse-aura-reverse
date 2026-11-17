package com.facebook.aura.iap.iac;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class IacSandboxSheetContentKt$SheetRadioRow$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<Boolean, Unit> $selectWithHaptic;
    public final /* synthetic */ boolean $selected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IacSandboxSheetContentKt$SheetRadioRow$1$1(G0U<? super Boolean, Unit> g0u, boolean z) {
        super(0);
        this.$selectWithHaptic = g0u;
        this.$selected = z;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass001.A1K(!this.$selected, this.$selectWithHaptic);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
