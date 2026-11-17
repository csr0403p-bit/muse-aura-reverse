package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ew4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC7441Ew4 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC7441Ew4[] A01;
    public static final EnumC7441Ew4 A02;

    static {
        EnumC7441Ew4 enumC7441Ew4 = new EnumC7441Ew4("USE_DOWNLOAD", 0);
        EnumC7441Ew4 enumC7441Ew42 = new EnumC7441Ew4("USE_BUILT_IN", 1);
        EnumC7441Ew4 enumC7441Ew43 = new EnumC7441Ew4("SYSTEM_DECIDE", 2);
        A02 = enumC7441Ew43;
        EnumC7441Ew4[] enumC7441Ew4Arr = {enumC7441Ew4, enumC7441Ew42, enumC7441Ew43};
        A01 = enumC7441Ew4Arr;
        A00 = C3cG.A0w(enumC7441Ew4Arr);
    }

    public static EnumC7441Ew4 valueOf(String str) {
        return (EnumC7441Ew4) Enum.valueOf(EnumC7441Ew4.class, str);
    }

    public static EnumC7441Ew4[] values() {
        return (EnumC7441Ew4[]) A01.clone();
    }

    public EnumC7441Ew4(String str, int i) {
    }
}
