package X;

import android.os.Trace;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.E9a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC6496E9a implements Runnable {
    public static final String __redex_internal_original_name = "EmojiCompatInitializer$LoadEmojiCompatRunnable";

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (E9X.A08 != null) {
                E9X e9xA00 = E9X.A00();
                if (e9xA00.A01() != 1) {
                    ReadWriteLock readWriteLock = e9xA00.A05;
                    readWriteLock.writeLock().lock();
                    try {
                        if (e9xA00.A06 == 0) {
                            BV4.A1P(readWriteLock);
                        } else {
                            e9xA00.A06 = 0;
                            BV4.A1P(readWriteLock);
                            e9xA00.A00.A00();
                        }
                    } catch (Throwable th) {
                        BV4.A1P(readWriteLock);
                        throw th;
                    }
                }
            }
        } finally {
            Trace.endSection();
        }
    }
}
