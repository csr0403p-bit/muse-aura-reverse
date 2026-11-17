package X;

import android.os.Message;
import java.util.List;

/* renamed from: X.E6a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6447E6a {
    public Message A00;
    public E6I A01;

    public static void A01(C6447E6a c6447E6a) {
        c6447E6a.A00 = null;
        c6447E6a.A01 = null;
        List<C6447E6a> list = E6I.A01;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(c6447E6a);
            }
        }
    }

    public static void A00(InterfaceC6459E6s interfaceC6459E6s, Object obj, int i) {
        E6I e6i = (E6I) interfaceC6459E6s;
        C6447E6a c6447E6aA00 = E6I.A00();
        c6447E6aA00.A00 = e6i.A00.obtainMessage(i, obj);
        c6447E6aA00.A01 = e6i;
        c6447E6aA00.A03();
    }

    public static void A02(Object obj, int i, Object obj2, int i2, int i3) {
        E6I e6i = (E6I) obj;
        C6447E6a c6447E6aA00 = E6I.A00();
        c6447E6aA00.A00 = e6i.A00.obtainMessage(i, i2, i3, obj2);
        c6447E6aA00.A01 = e6i;
        c6447E6aA00.A03();
    }

    public final void A03() {
        Message message = this.A00;
        message.getClass();
        message.sendToTarget();
        A01(this);
    }
}
