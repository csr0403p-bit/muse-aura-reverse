package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5b2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C5b2 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C5b2[] A01;
    public static final C5b2 A02;
    public static final C5b2 A03;
    public static final C5b2 A04;
    public static final C5b2 A05;
    public static final C5b2 A06;
    public final String serverValue;

    static {
        C5b2 c5b2 = new C5b2("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A05 = c5b2;
        C5b2 c5b22 = new C5b2("ACTIVATED", 1, "ACTIVATED");
        A02 = c5b22;
        C5b2 c5b23 = new C5b2("ADMITTED", 2, "ADMITTED");
        A03 = c5b23;
        C5b2 c5b24 = new C5b2("LEFT", 3, "LEFT");
        C5b2 c5b25 = new C5b2("LIMITED", 4, "LIMITED");
        A04 = c5b25;
        C5b2 c5b26 = new C5b2("WAITLISTED", 5, "WAITLISTED");
        A06 = c5b26;
        C5b2[] c5b2Arr = {c5b2, c5b22, c5b23, c5b24, c5b25, c5b26};
        A01 = c5b2Arr;
        A00 = C3cG.A0w(c5b2Arr);
    }

    public static C5b2 valueOf(String str) {
        return (C5b2) Enum.valueOf(C5b2.class, str);
    }

    public static C5b2[] values() {
        return (C5b2[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.serverValue;
    }

    public C5b2(String str, int i, String str2) {
        this.serverValue = str2;
    }
}
