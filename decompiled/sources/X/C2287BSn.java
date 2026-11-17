package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import kotlin.jvm.functions.Function0;

/* renamed from: X.BSn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2287BSn implements Ht9, Function0 {
    public final int $t;
    public final int A00;

    public C2287BSn(int i, int i2) {
        this.$t = i2;
        this.A00 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.$t == 0) {
            return new C1110AYw(this.A00);
        }
        int i = this.A00;
        Ad2 ad2 = Ad7.A00;
        AFs<LazyGridState, ?> aFs = LazyGridState.A0O;
        return new LazyGridState(new AdE(2), i, 0);
    }
}
