package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1mB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1mB {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C1mB[] A01;

    static {
        C1mB[] c1mBArr = {new C1mB("FORWARD", 0), new C1mB("BACKWARD", 1)};
        A01 = c1mBArr;
        A00 = new F3w(c1mBArr);
    }

    public static C1mB valueOf(String str) {
        return (C1mB) Enum.valueOf(C1mB.class, str);
    }

    public static C1mB[] values() {
        return (C1mB[]) A01.clone();
    }

    public C1mB(String str, int i) {
    }
}
