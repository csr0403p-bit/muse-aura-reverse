package X;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.CcK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3664CcK implements Executor {
    public static final /* synthetic */ EnumC3664CcK[] A00;
    public static final EnumC3664CcK A01;

    static {
        EnumC3664CcK enumC3664CcK = new EnumC3664CcK();
        A01 = enumC3664CcK;
        A00 = new EnumC3664CcK[]{enumC3664CcK};
    }

    public static EnumC3664CcK[] values() {
        return (EnumC3664CcK[]) A00.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C3663CcJ.A00().A00.post(runnable);
    }
}
