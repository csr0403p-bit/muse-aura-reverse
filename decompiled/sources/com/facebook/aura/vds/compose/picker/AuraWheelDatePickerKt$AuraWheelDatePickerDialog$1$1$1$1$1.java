package com.facebook.aura.vds.compose.picker;

import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import java.time.LocalDate;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraWheelDatePickerKt$AuraWheelDatePickerDialog$1$1$1$1$1 extends AbstractC7559F3s implements G0U<LocalDate, Unit> {
    public final /* synthetic */ LocalDate $maxDate;
    public final /* synthetic */ MutableState<LocalDate> $pendingDate$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraWheelDatePickerKt$AuraWheelDatePickerDialog$1$1$1$1$1(LocalDate localDate, MutableState<LocalDate> mutableState) {
        super(1);
        this.$maxDate = localDate;
        this.$pendingDate$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LocalDate localDate) {
        MutableState<LocalDate> mutableState = this.$pendingDate$delegate;
        if (localDate == null || localDate.equals(this.$maxDate)) {
            localDate = null;
        }
        float f = AuraWheelDatePickerKt.DAY_COLUMN_WEIGHT;
        mutableState.Af8(localDate);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(LocalDate localDate) {
        invoke2(localDate);
        return Unit.INSTANCE;
    }
}
