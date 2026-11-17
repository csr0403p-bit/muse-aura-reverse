package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9WS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9WS {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C9WS[] A01;
    public static final C9WS A02;
    public final String serverValue;

    static {
        C9WS c9ws = new C9WS("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A02 = c9ws;
        C9WS[] c9wsArr = {c9ws, new C9WS("FRIDAY", 1, "FRIDAY"), new C9WS("MONDAY", 2, "MONDAY"), new C9WS("NOT_A_DAY_OF_WEEK", 3, "NOT_A_DAY_OF_WEEK"), new C9WS("SATURDAY", 4, "SATURDAY"), new C9WS("SUNDAY", 5, "SUNDAY"), new C9WS("THURSDAY", 6, "THURSDAY"), new C9WS("TUESDAY", 7, "TUESDAY"), new C9WS("WEDNESDAY", 8, "WEDNESDAY")};
        A01 = c9wsArr;
        A00 = C3cG.A0w(c9wsArr);
    }

    public static C9WS valueOf(String str) {
        return (C9WS) Enum.valueOf(C9WS.class, str);
    }

    public static C9WS[] values() {
        return (C9WS[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.serverValue;
    }

    public C9WS(String str, int i, String str2) {
        this.serverValue = str2;
    }
}
