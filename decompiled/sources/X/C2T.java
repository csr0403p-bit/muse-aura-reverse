package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class C2T implements ThreadFactory {
    public final int A00;
    public final String A01;
    public final AtomicInteger A02 = BV5.A18();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbA0x = C60O.A0x("Lacrima_");
        sbA0x.append(this.A01);
        sbA0x.append("_");
        sbA0x.append(this.A02.getAndIncrement());
        C5W c5w = C5V.A04;
        if (c5w != null) {
            sbA0x.append(":");
            String str = c5w.A03;
            if (str == null) {
                str = "unknown";
            }
            sbA0x.append(str);
        }
        return new C2S(this, runnable, sbA0x.toString());
    }

    public C2T(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
