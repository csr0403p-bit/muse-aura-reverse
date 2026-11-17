package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C10 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C10[] A01;
    public static final C10 A02;
    public static final C10 A03;
    public static final C10 A04;

    static {
        C10 c10 = new C10("DEFAULT", 0);
        A02 = c10;
        C10 c102 = new C10("PREFETCH", 1);
        A03 = c102;
        C10 c103 = new C10("TIME_TO_LIVE", 2);
        A04 = c103;
        C10[] c10Arr = {c10, c102, c103};
        A01 = c10Arr;
        A00 = C3cG.A0w(c10Arr);
    }

    public static C10 valueOf(String str) {
        return (C10) Enum.valueOf(C10.class, str);
    }

    public static C10[] values() {
        return (C10[]) A01.clone();
    }

    public C10(String str, int i) {
    }
}
