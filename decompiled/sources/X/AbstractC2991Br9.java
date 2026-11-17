package X;

import java.util.concurrent.Future;

/* renamed from: X.Br9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2991Br9 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    public static <V> V A00(Future<V> future) {
        boolean z = false;
        V v = future;
        while (true) {
            try {
                v = (V) ((Future) v).get();
                break;
            } catch (InterruptedException unused) {
                z = true;
                v = v;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }
}
