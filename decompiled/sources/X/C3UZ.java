package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3UZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3UZ {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C3UZ[] A01;
    public static final C3UZ A02;

    static {
        C3UZ c3uz = new C3UZ("Default", 0);
        A02 = c3uz;
        C3UZ[] c3uzArr = {c3uz, new C3UZ("UserInput", 1), new C3UZ("PreventUserInput", 2)};
        A01 = c3uzArr;
        A00 = new F3w(c3uzArr);
    }

    public static C3UZ valueOf(String str) {
        return (C3UZ) Enum.valueOf(C3UZ.class, str);
    }

    public static C3UZ[] values() {
        return (C3UZ[]) A01.clone();
    }

    public C3UZ(String str, int i) {
    }
}
