package com.facebook.aura.vds.compose.picker;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C00r;
import X.G0U;
import java.time.LocalDate;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraWheelDatePickerKt$AuraWheelDatePicker$1$1$1$4$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ C00r $day$delegate;
    public final /* synthetic */ LocalDate $maxDate;
    public final /* synthetic */ LocalDate $minDate;
    public final /* synthetic */ C00r $month$delegate;
    public final /* synthetic */ G0U<LocalDate, Unit> $onDateSelected;
    public final /* synthetic */ C00r $year$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraWheelDatePickerKt$AuraWheelDatePicker$1$1$1$4$1(C00r c00r, C00r c00r2, G0U<? super LocalDate, Unit> g0u, C00r c00r3, LocalDate localDate, LocalDate localDate2) {
        super(1);
        this.$year$delegate = c00r;
        this.$month$delegate = c00r2;
        this.$onDateSelected = g0u;
        this.$day$delegate = c00r3;
        this.$minDate = localDate;
        this.$maxDate = localDate2;
    }

    public final void invoke(int i) {
        G0U<LocalDate, Unit> g0u = this.$onDateSelected;
        C00r c00r = this.$year$delegate;
        C00r c00r2 = this.$month$delegate;
        C00r c00r3 = this.$day$delegate;
        LocalDate localDate = this.$minDate;
        LocalDate localDate2 = this.$maxDate;
        float f = AuraWheelDatePickerKt.DAY_COLUMN_WEIGHT;
        AuraWheelDatePickerKt.AuraWheelDatePicker$select(g0u, c00r, c00r2, c00r3, localDate, localDate2, c00r.AGd(), this.$month$delegate.AGd(), i);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
