package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.19X, reason: invalid class name */
/* loaded from: classes.dex */
public final class C19X {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C19X[] A01;
    public static final C19X A02;
    public static final C19X A03;
    public static final C19X A04;

    static {
        C19X c19x = new C19X("Focused", 0);
        A02 = c19x;
        C19X c19x2 = new C19X("UnfocusedEmpty", 1);
        A03 = c19x2;
        C19X c19x3 = new C19X("UnfocusedNotEmpty", 2);
        A04 = c19x3;
        C19X[] c19xArr = {c19x, c19x2, c19x3};
        A01 = c19xArr;
        A00 = new F3w(c19xArr);
    }

    public static C19X valueOf(String str) {
        return (C19X) Enum.valueOf(C19X.class, str);
    }

    public static C19X[] values() {
        return (C19X[]) A01.clone();
    }

    public C19X(String str, int i) {
    }
}
