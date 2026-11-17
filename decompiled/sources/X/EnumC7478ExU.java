package X;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.ExU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC7478ExU implements Executor {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC7478ExU[] A01;
    public static final EnumC7478ExU A02;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C7384Etj.A0Y(runnable, 0);
        runnable.run();
    }

    static {
        EnumC7478ExU enumC7478ExU = new EnumC7478ExU();
        A02 = enumC7478ExU;
        EnumC7478ExU[] enumC7478ExUArr = {enumC7478ExU};
        A01 = enumC7478ExUArr;
        A00 = C3cG.A0w(enumC7478ExUArr);
    }

    public static EnumC7478ExU valueOf(String str) {
        return (EnumC7478ExU) Enum.valueOf(EnumC7478ExU.class, str);
    }

    public static EnumC7478ExU[] values() {
        return (EnumC7478ExU[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
