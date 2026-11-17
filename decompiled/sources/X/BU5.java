package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BU5 extends AbstractC07127nr implements G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BU5(Object obj, LazyListState lazyListState, int i, int i2, HtJ<? super BU5> htJ) {
        super(2, lazyListState);
        this.$t = htJ;
        this.A02 = obj;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new BU5(this.A02, htJ, this.A00, this.A01, this.$t != 0 ? 1 : 0);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        Hwg.A00(obj);
        Object obj2 = this.A02;
        if (i != 0) {
            ((LazyGridState) obj2).A03(this.A00, this.A01, true);
        } else {
            ((LazyListState) obj2).A08(this.A00, this.A01, true);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BU5) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }
}
