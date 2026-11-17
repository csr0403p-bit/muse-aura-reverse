package X;

import java.io.Closeable;
import java.util.concurrent.Executor;

/* renamed from: X.GBm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9259GBm extends GBK implements Closeable, AutoCloseable {
    public static final C9253GBg Key = new C9253GBg();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract Executor getExecutor();
}
