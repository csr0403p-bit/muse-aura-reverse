package X;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CNx implements Executor {
    public static final /* synthetic */ CNx[] A00;
    public static final CNx A01;

    static {
        CNx cNx = new CNx();
        A01 = cNx;
        A00 = new CNx[]{cNx};
    }

    public static CNx[] values() {
        return (CNx[]) A00.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
