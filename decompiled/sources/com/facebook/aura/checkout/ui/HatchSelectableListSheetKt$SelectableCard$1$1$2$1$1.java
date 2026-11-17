package com.facebook.aura.checkout.ui;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchSelectableListSheetKt$SelectableCard$1$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<HatchSelectableOption, Unit> $more;
    public final /* synthetic */ HatchSelectableOption $option;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSelectableListSheetKt$SelectableCard$1$1$2$1$1(G0U<? super HatchSelectableOption, Unit> g0u, HatchSelectableOption hatchSelectableOption) {
        super(0);
        this.$more = g0u;
        this.$option = hatchSelectableOption;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$more.invoke(this.$option);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
