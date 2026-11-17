package X;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class DEY {
    public final /* synthetic */ boolean A00;

    public DEY(boolean z) {
        this.A00 = z;
    }

    public static void A00(DEY dey, Object obj, int i) {
        dey.A01(new CallableC7564F4d(obj, i));
    }

    public final void A01(Callable callable) {
        if (this.A00) {
            try {
                callable.call();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw BV4.A0e(e2);
            }
        }
    }
}
