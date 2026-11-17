package X;

import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.Cpj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4200Cpj<L> {
    public final Executor A00;
    public volatile C4248CrK A01;
    public volatile Object A02;

    public C4200Cpj(Looper looper, Object obj) {
        this.A00 = new ExecutorC3651Cbh(looper);
        CRy.A04(obj, "Listener must not be null");
        this.A02 = obj;
        CRy.A05("LocationCallback");
        this.A01 = new C4248CrK(obj, "LocationCallback");
    }

    public C4200Cpj(Object obj, Executor executor) {
        this.A00 = executor;
        this.A02 = obj;
        CRy.A05("GetCurrentLocation");
        this.A01 = new C4248CrK(obj, "GetCurrentLocation");
    }
}
