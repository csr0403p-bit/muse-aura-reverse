package X;

import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* loaded from: classes5.dex */
public final class E7A implements E7C {
    @Override // X.E7C
    public final E6I A7o(Handler.Callback callback, Looper looper) {
        List<C6447E6a> list = E6I.A01;
        return new E6I(new Handler(looper, callback));
    }
}
