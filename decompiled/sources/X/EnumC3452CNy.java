package X;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.CNy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3452CNy implements Executor {
    public static final /* synthetic */ EnumC3452CNy[] A00;
    public static final EnumC3452CNy A01;

    static {
        EnumC3452CNy enumC3452CNy = new EnumC3452CNy();
        A01 = enumC3452CNy;
        A00 = new EnumC3452CNy[]{enumC3452CNy};
    }

    public static EnumC3452CNy[] values() {
        return (EnumC3452CNy[]) A00.clone();
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
