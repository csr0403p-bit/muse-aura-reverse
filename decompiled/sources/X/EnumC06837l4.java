package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7l4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC06837l4 implements C7l7 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC06837l4[] A01;
    public static final EnumC06837l4 A02;
    public static final EnumC06837l4 A03;
    public static final EnumC06837l4 A04;
    public final int mask;
    public final int value;

    static {
        EnumC06837l4 enumC06837l4 = new EnumC06837l4("IGNORE_CASE", 0, 2, 2);
        A03 = enumC06837l4;
        EnumC06837l4 enumC06837l42 = new EnumC06837l4("MULTILINE", 1, 8, 8);
        A04 = enumC06837l42;
        EnumC06837l4 enumC06837l43 = new EnumC06837l4("LITERAL", 2, 16, 16);
        EnumC06837l4 enumC06837l44 = new EnumC06837l4("UNIX_LINES", 3, 1, 1);
        EnumC06837l4 enumC06837l45 = new EnumC06837l4("COMMENTS", 4, 4, 4);
        EnumC06837l4 enumC06837l46 = new EnumC06837l4("DOT_MATCHES_ALL", 5, 32, 32);
        A02 = enumC06837l46;
        EnumC06837l4[] enumC06837l4Arr = {enumC06837l4, enumC06837l42, enumC06837l43, enumC06837l44, enumC06837l45, enumC06837l46, new EnumC06837l4("CANON_EQ", 6, 128, 128)};
        A01 = enumC06837l4Arr;
        A00 = C3cG.A0w(enumC06837l4Arr);
    }

    public static EnumC06837l4 valueOf(String str) {
        return (EnumC06837l4) Enum.valueOf(EnumC06837l4.class, str);
    }

    public static EnumC06837l4[] values() {
        return (EnumC06837l4[]) A01.clone();
    }

    public EnumC06837l4(String str, int i, int i2, int i3) {
        this.value = i2;
        this.mask = i3;
    }
}
