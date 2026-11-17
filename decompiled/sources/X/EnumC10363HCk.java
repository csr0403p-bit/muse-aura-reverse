package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HCk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10363HCk {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC10363HCk[] A01;
    public static final EnumC10363HCk A02;
    public static final EnumC10363HCk A03;
    public static final EnumC10363HCk A04;
    public static final EnumC10363HCk A05;
    public static final EnumC10363HCk A06;
    public final int value;

    static {
        EnumC10363HCk enumC10363HCk = new EnumC10363HCk("UNKNOWN", 0, 0);
        A06 = enumC10363HCk;
        EnumC10363HCk enumC10363HCk2 = new EnumC10363HCk("INTERNAL", 1, 1);
        EnumC10363HCk enumC10363HCk3 = new EnumC10363HCk("ACCESS_DENIED", 2, 2);
        A02 = enumC10363HCk3;
        EnumC10363HCk enumC10363HCk4 = new EnumC10363HCk("ACCOUNT_NOT_FOUND", 3, 3);
        A03 = enumC10363HCk4;
        EnumC10363HCk enumC10363HCk5 = new EnumC10363HCk("MALFORMED_INPUT", 4, 4);
        EnumC10363HCk enumC10363HCk6 = new EnumC10363HCk("REGISTRATION_NOT_IN_PROGRESS", 5, 5);
        EnumC10363HCk enumC10363HCk7 = new EnumC10363HCk("LOGIN_NOT_IN_PROGRESS", 6, 6);
        EnumC10363HCk enumC10363HCk8 = new EnumC10363HCk("ACCOUNT_DELETED", 7, 7);
        EnumC10363HCk enumC10363HCk9 = new EnumC10363HCk("INCOMPLETE_REGISTRATION", 8, 8);
        EnumC10363HCk enumC10363HCk10 = new EnumC10363HCk("ACCOUNT_ALREADY_REGISTERED", 9, 9);
        EnumC10363HCk enumC10363HCk11 = new EnumC10363HCk("LOGIN_ATTEMPTS_EXHAUSTED", 10, 10);
        A04 = enumC10363HCk11;
        EnumC10363HCk enumC10363HCk12 = new EnumC10363HCk("LOGIN_RATE_LIMITED", 11, 11);
        A05 = enumC10363HCk12;
        EnumC10363HCk[] enumC10363HCkArr = {enumC10363HCk, enumC10363HCk2, enumC10363HCk3, enumC10363HCk4, enumC10363HCk5, enumC10363HCk6, enumC10363HCk7, enumC10363HCk8, enumC10363HCk9, enumC10363HCk10, enumC10363HCk11, enumC10363HCk12, new EnumC10363HCk("INTERNAL_NON_RETRYABLE", 12, 12), new EnumC10363HCk("ACCOUNT_MIGRATED", 13, 13), new EnumC10363HCk("REQUEST_IN_PROGRESS", 14, 14), new EnumC10363HCk("GET_USERS_PENDING_FLEET_MIGRATION_RATE_LIMITED", 15, 15), new EnumC10363HCk("INCOMPATIBLE_API_VERSION", 16, 16), new EnumC10363HCk("SERVICE_OVERLOADED", 17, 17), new EnumC10363HCk("KEY_ID_NOT_MATCHED", 18, 18), new EnumC10363HCk("UNSUPPORTED_PQ_WRAP_SCHEME", 19, 19)};
        A01 = enumC10363HCkArr;
        A00 = C3cG.A0w(enumC10363HCkArr);
    }

    public static EnumC10363HCk valueOf(String str) {
        return (EnumC10363HCk) Enum.valueOf(EnumC10363HCk.class, str);
    }

    public static EnumC10363HCk[] values() {
        return (EnumC10363HCk[]) A01.clone();
    }

    public EnumC10363HCk(String str, int i, int i2) {
        this.value = i2;
    }
}
