package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7yC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7yC {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C7yC[] A01;
    public static final C7yC A02;
    public static final C7yC A03;
    public static final C7yC A04;
    public static final C7yC A05;

    static {
        C7yC c7yC = new C7yC("REPLACE", 0);
        A05 = c7yC;
        C7yC c7yC2 = new C7yC("KEEP", 1);
        A04 = c7yC2;
        C7yC c7yC3 = new C7yC("APPEND", 2);
        A02 = c7yC3;
        C7yC c7yC4 = new C7yC("APPEND_OR_REPLACE", 3);
        A03 = c7yC4;
        C7yC[] c7yCArr = {c7yC, c7yC2, c7yC3, c7yC4};
        A01 = c7yCArr;
        A00 = C3cG.A0w(c7yCArr);
    }

    public static C7yC valueOf(String str) {
        return (C7yC) Enum.valueOf(C7yC.class, str);
    }

    public static C7yC[] values() {
        return (C7yC[]) A01.clone();
    }

    public C7yC(String str, int i) {
    }
}
