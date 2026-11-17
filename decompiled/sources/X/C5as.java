package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5as, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C5as {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C5as[] A01;
    public static final C5as A02;
    public static final C5as A03;
    public static final C5as A04;
    public final String serverValue;

    static {
        C5as c5as = new C5as("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A04 = c5as;
        C5as c5as2 = new C5as("BLOCKED", 1, "BLOCKED");
        A02 = c5as2;
        C5as c5as3 = new C5as("CCV_REQUIRED", 2, "CCV_REQUIRED");
        C5as c5as4 = new C5as("NOT_REQUIRED", 3, "NOT_REQUIRED");
        A03 = c5as4;
        C5as[] c5asArr = {c5as, c5as2, c5as3, c5as4};
        A01 = c5asArr;
        A00 = C3cG.A0w(c5asArr);
    }

    public static C5as valueOf(String str) {
        return (C5as) Enum.valueOf(C5as.class, str);
    }

    public static C5as[] values() {
        return (C5as[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.serverValue;
    }

    public C5as(String str, int i, String str2) {
        this.serverValue = str2;
    }
}
