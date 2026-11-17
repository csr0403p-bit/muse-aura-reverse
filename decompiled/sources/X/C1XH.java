package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* renamed from: X.1XH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XH extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ C1XY $displayedMonth;
    public final /* synthetic */ LazyListState $monthsListState;
    public final /* synthetic */ MutableState<Boolean> $yearPickerVisible$delegate;
    public final /* synthetic */ ADq $yearRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/3UX;Landroidx/compose/runtime/MutableState<Ljava/lang/Boolean;>;Landroidx/compose/foundation/lazy/LazyListState;LX/ADq;LX/1XY;)V */
    public C1XH(LazyListState lazyListState, C1XY c1xy, MutableState mutableState, ADq aDq, C3UX c3ux) {
        super(1);
        this.$coroutineScope = c3ux;
        this.$yearPickerVisible$delegate = mutableState;
        this.$monthsListState = lazyListState;
        this.$yearRange = aDq;
        this.$displayedMonth = c1xy;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        int iA0F = AnonymousClass001.A0F(num);
        MutableState.A09(!MutableState.A0A((MutableState) r1), this.$yearPickerVisible$delegate);
        AnonymousClass001.A1J(new DatePickerKt$DatePickerContent$2$4$2$2$1$1$1(this.$monthsListState, this.$displayedMonth, null, this.$yearRange, iA0F), this.$coroutineScope);
        return Unit.INSTANCE;
    }
}
