package X;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.CNw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3451CNw implements Executor {
    public static final /* synthetic */ EnumC3451CNw[] A00;
    public static final EnumC3451CNw A01;

    static {
        EnumC3451CNw enumC3451CNw = new EnumC3451CNw();
        A01 = enumC3451CNw;
        A00 = new EnumC3451CNw[]{enumC3451CNw};
    }

    public static EnumC3451CNw valueOf(String name) {
        return (EnumC3451CNw) Enum.valueOf(EnumC3451CNw.class, name);
    }

    public static EnumC3451CNw[] values() {
        return (EnumC3451CNw[]) A00.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        command.run();
    }
}
