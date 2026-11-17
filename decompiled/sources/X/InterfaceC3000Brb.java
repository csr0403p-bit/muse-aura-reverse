package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.io.Closeable;

/* renamed from: X.Brb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC3000Brb extends Closeable, InterfaceC3593CWc, C2Kw {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @OnLifecycleEvent(EnumC3085Bxl.ON_DESTROY)
    void close();
}
