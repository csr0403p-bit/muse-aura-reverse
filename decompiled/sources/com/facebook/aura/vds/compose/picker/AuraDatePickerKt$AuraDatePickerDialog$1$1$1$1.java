package com.facebook.aura.vds.compose.picker;

import X.AbstractC7559F3s;
import X.C0z3;
import X.G0U;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraDatePickerKt$AuraDatePickerDialog$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<LocalDate, Unit> $onDateSelected;
    public final /* synthetic */ C0z3 $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraDatePickerKt$AuraDatePickerDialog$1$1$1$1(C0z3 c0z3, G0U<? super LocalDate, Unit> g0u) {
        super(0);
        this.$state = c0z3;
        this.$onDateSelected = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Long lAKE = this.$state.AKE();
        if (lAKE != null) {
            this.$onDateSelected.invoke(AuraDatePickerKt.toLocalDateAtUtc(lAKE.longValue()));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
