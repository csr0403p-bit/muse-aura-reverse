package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.io.Closeable;

/* loaded from: classes5.dex */
public interface Bra extends Closeable, InterfaceC3593CWc, C2Kw {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @OnLifecycleEvent(EnumC3085Bxl.ON_DESTROY)
    void close();
}
