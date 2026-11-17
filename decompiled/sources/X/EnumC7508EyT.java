package X;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EyT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC7508EyT implements Executor {
    public static final /* synthetic */ EnumC7508EyT[] A00;
    public static final EnumC7508EyT A01;

    static {
        EnumC7508EyT enumC7508EyT = new EnumC7508EyT();
        A01 = enumC7508EyT;
        A00 = new EnumC7508EyT[]{enumC7508EyT};
    }

    public static EnumC7508EyT valueOf(String str) {
        return (EnumC7508EyT) Enum.valueOf(EnumC7508EyT.class, str);
    }

    public static EnumC7508EyT[] values() {
        return (EnumC7508EyT[]) A00.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
