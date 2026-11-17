package X;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: X.Csl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4297Csl {
    public final Deque A00 = new ArrayDeque(16);

    public static final long A00(C4297Csl c4297Csl) {
        Deque deque = c4297Csl.A00;
        if (deque.isEmpty()) {
            return 0L;
        }
        return C3cG.A05(deque.peek());
    }

    public final void A01() throws IOException {
        Deque deque = this.A00;
        if (!deque.isEmpty()) {
            throw BV7.A0j("data item not completed, stackSize: %s scope: %s", BV4.A1Y(Integer.valueOf(deque.size()), A00(this)));
        }
    }
}
