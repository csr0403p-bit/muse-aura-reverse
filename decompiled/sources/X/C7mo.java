package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7mo, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7mo {
    public static volatile C7mo A03;
    public final Context A00;
    public final AtomicInteger A01;
    public final AtomicReference<C7mq> A02;

    public C7mo(Context context) {
        this.A01 = new AtomicInteger(1);
        this.A02 = new AtomicReference<>();
        this.A00 = context.getApplicationContext();
    }

    public C7mo() {
    }
}
