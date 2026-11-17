package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* renamed from: X.3bR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bR implements Ht9, Function0 {
    public final int $t;
    public final Object A00;

    public C3bR(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, X.AWx] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, X.AOB] */
    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        switch (this.$t) {
            case 0:
                return ((AOP) this.A00).A07.getValue();
            case 1:
                return ((AOP) this.A00).A03();
            case 2:
                return Integer.valueOf(((C1161Act) ((LazyListState) this.A00).A04()).A05);
            case 3:
                ?? value = ((MutableState) this.A00).getValue();
                if (value == 0) {
                    throw new IllegalStateException("Required value was null.");
                }
                return value;
            default:
                C1BO c1bo = (C1BO) this.A00;
                C1003AOr<AWx> c1003AOr = AVf.A02;
                return new AWx(((AWx) c1bo.getValue()).A00);
        }
    }
}
