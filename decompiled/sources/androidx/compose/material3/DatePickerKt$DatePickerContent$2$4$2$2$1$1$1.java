package androidx.compose.material3;

import X.ADq;
import X.AFs;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1XY;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1", f = "DatePicker.kt", l = {1597}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DatePickerKt$DatePickerContent$2$4$2$2$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1XY $displayedMonth;
    public final /* synthetic */ LazyListState $monthsListState;
    public final /* synthetic */ int $year;
    public final /* synthetic */ ADq $yearRange;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/lazy/LazyListState;ILX/ADq;LX/1XY;LX/HtJ<-Landroidx/compose/material3/DatePickerKt$DatePickerContent$2$4$2$2$1$1$1;>;)V */
    public DatePickerKt$DatePickerContent$2$4$2$2$1$1$1(LazyListState lazyListState, C1XY c1xy, HtJ htJ, ADq aDq, int i) {
        super(2, htJ);
        this.$monthsListState = lazyListState;
        this.$year = i;
        this.$yearRange = aDq;
        this.$displayedMonth = c1xy;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        LazyListState lazyListState = this.$monthsListState;
        int i = this.$year;
        return new DatePickerKt$DatePickerContent$2$4$2$2$1$1$1(lazyListState, this.$displayedMonth, htJ, this.$yearRange, i);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((DatePickerKt$DatePickerContent$2$4$2$2$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            LazyListState lazyListState = this.$monthsListState;
            int i2 = (((this.$year - this.$yearRange.A00) * 12) + this.$displayedMonth.A01) - 1;
            this.label = 1;
            AFs<LazyListState, ?> aFs = LazyListState.A0Q;
            if (lazyListState.A06(i2, 0, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }
}
