package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9oU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9oU {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C9oU[] A01;
    public static final C9oU A02;
    public static final C9oU A03;
    public static final C9oU A04;
    public static final C9oU A05;
    public final int code;

    static {
        C9oU c9oU = new C9oU("OPERATION_ERROR", 0, 0);
        A03 = c9oU;
        C9oU c9oU2 = new C9oU("UNKNOWN_ERROR", 1, 1);
        A04 = c9oU2;
        C9oU c9oU3 = new C9oU("MALFORMED_OPERATION_ERROR", 2, 2);
        C9oU c9oU4 = new C9oU("SERVICE_UNAVAILABLE", 3, 3);
        C9oU c9oU5 = new C9oU("UNKNOWN_OPERATION", 4, 4);
        A05 = c9oU5;
        C9oU c9oU6 = new C9oU("UNAUTHORIZED_OPERATION", 5, 5);
        C9oU c9oU7 = new C9oU("RATE_LIMIT_EXCEEDED", 6, 6);
        C9oU c9oU8 = new C9oU("INVALID_CALLER_IDENTITY", 7, 7);
        A02 = c9oU8;
        C9oU[] c9oUArr = {c9oU, c9oU2, c9oU3, c9oU4, c9oU5, c9oU6, c9oU7, c9oU8, new C9oU("NONCE_VALIDATION_ERROR", 8, 8)};
        A01 = c9oUArr;
        A00 = C3cG.A0w(c9oUArr);
    }

    public static C9oU valueOf(String str) {
        return (C9oU) Enum.valueOf(C9oU.class, str);
    }

    public static C9oU[] values() {
        return (C9oU[]) A01.clone();
    }

    public C9oU(String str, int i, int i2) {
        this.code = i2;
    }
}
