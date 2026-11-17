package X;

import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class CUI {
    public final ConcurrentHashMap<EvR, List<Throwable>> A01 = new ConcurrentHashMap<>(16, 0.75f, 10);
    public final ReferenceQueue<Throwable> A00 = new ReferenceQueue<>();
}
