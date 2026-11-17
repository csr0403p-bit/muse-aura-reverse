package com.facebook.aura.vds.compose.picker;

import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraWheelDatePickerKt$AuraWheelDatePickerDialog$1$1$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<LocalDate, Unit> $onDateSelected;
    public final /* synthetic */ MutableState<LocalDate> $pendingDate$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraWheelDatePickerKt$AuraWheelDatePickerDialog$1$1$1$2$1$1(G0U<? super LocalDate, Unit> g0u, MutableState<LocalDate> mutableState) {
        super(0);
        this.$onDateSelected = g0u;
        this.$pendingDate$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<LocalDate> mutableState = this.$pendingDate$delegate;
        float f = AuraWheelDatePickerKt.DAY_COLUMN_WEIGHT;
        LocalDate value = mutableState.getValue();
        if (value != null) {
            this.$onDateSelected.invoke(value);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
