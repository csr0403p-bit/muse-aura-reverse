package X;

import android.os.Handler;
import java.util.List;

/* loaded from: classes5.dex */
public final class E6I implements InterfaceC6459E6s {
    public static final List<C6447E6a> A01 = C60O.A11(50);
    public final Handler A00;

    public static C6447E6a A00() {
        C6447E6a c6447E6a;
        List<C6447E6a> list = A01;
        synchronized (list) {
            c6447E6a = list.isEmpty() ? new C6447E6a() : list.remove(C60O.A00(list));
        }
        return c6447E6a;
    }

    public E6I(Handler handler) {
        this.A00 = handler;
    }

    @Override // X.InterfaceC6459E6s
    public final C6447E6a ARb(int i) {
        C6447E6a c6447E6aA00 = A00();
        c6447E6aA00.A00 = this.A00.obtainMessage(i);
        c6447E6aA00.A01 = this;
        return c6447E6aA00;
    }

    @Override // X.InterfaceC6459E6s
    public final C6447E6a ARc(int i, int i2, int i3) {
        C6447E6a c6447E6aA00 = A00();
        c6447E6aA00.A00 = this.A00.obtainMessage(i, i2, i3);
        c6447E6aA00.A01 = this;
        return c6447E6aA00;
    }
}
