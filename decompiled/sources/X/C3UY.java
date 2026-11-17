package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3UY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3UY {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C3UY[] A01;
    public static final C3UY A02;
    public static final C3UY A03;

    static {
        C3UY c3uy = new C3UY("Default", 0);
        A02 = c3uy;
        C3UY c3uy2 = new C3UY("UserInput", 1);
        A03 = c3uy2;
        C3UY[] c3uyArr = {c3uy, c3uy2, new C3UY("PreventUserInput", 2)};
        A01 = c3uyArr;
        A00 = new F3w(c3uyArr);
    }

    public static C3UY valueOf(String str) {
        return (C3UY) Enum.valueOf(C3UY.class, str);
    }

    public static C3UY[] values() {
        return (C3UY[]) A01.clone();
    }

    public C3UY(String str, int i) {
    }
}
