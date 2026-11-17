package androidx.compose.material3;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$1", f = "DatePicker.kt", l = {1506}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DatePickerKt$DatePickerContent$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ int $monthIndex;
    public final /* synthetic */ LazyListState $monthsListState;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerContent$1$1(LazyListState lazyListState, int i, HtJ<? super DatePickerKt$DatePickerContent$1$1> htJ) {
        super(2, htJ);
        this.$monthsListState = lazyListState;
        this.$monthIndex = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new DatePickerKt$DatePickerContent$1$1(this.$monthsListState, this.$monthIndex, htJ);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((DatePickerKt$DatePickerContent$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!this.$monthsListState.AOz()) {
                int iA02 = this.$monthsListState.A02();
                int i2 = this.$monthIndex;
                if (iA02 != i2) {
                    LazyListState lazyListState = this.$monthsListState;
                    this.label = 1;
                    if (lazyListState.A06(i2, 0, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
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
