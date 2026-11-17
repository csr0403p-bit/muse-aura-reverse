package X;

import java.io.Closeable;
import java.io.Flushable;

/* renamed from: X.Eal, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC6833Eal extends Closeable, Flushable {
    C6848Eb1 Ags();

    void Aib(C6818EaW c6818EaW, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // java.io.Flushable
    void flush();
}
