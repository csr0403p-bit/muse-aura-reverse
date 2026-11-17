package X;

import java.io.Closeable;

/* renamed from: X.EfB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC7064EfB extends InterfaceC7060Ef7, Closeable, C2eL {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // X.C2eL
    int getHeight();

    C2eL getImageInfo();

    InterfaceC7034Eeg getQualityInfo();

    int getSizeInBytes();

    @Override // X.C2eL
    int getWidth();

    boolean isClosed();

    boolean isStateful();
}
