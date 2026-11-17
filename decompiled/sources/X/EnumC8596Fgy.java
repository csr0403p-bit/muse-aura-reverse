package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Fgy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC8596Fgy {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC8596Fgy[] A01;
    public static final EnumC8596Fgy A02;
    public static final EnumC8596Fgy A03;
    public static final EnumC8596Fgy A04;

    static {
        EnumC8596Fgy enumC8596Fgy = new EnumC8596Fgy("ENTER", 0);
        A02 = enumC8596Fgy;
        EnumC8596Fgy enumC8596Fgy2 = new EnumC8596Fgy("EXIT_FORWARD", 1);
        A04 = enumC8596Fgy2;
        EnumC8596Fgy enumC8596Fgy3 = new EnumC8596Fgy("EXIT_BACKWARD", 2);
        A03 = enumC8596Fgy3;
        EnumC8596Fgy[] enumC8596FgyArr = {enumC8596Fgy, enumC8596Fgy2, enumC8596Fgy3};
        A01 = enumC8596FgyArr;
        A00 = C3cG.A0w(enumC8596FgyArr);
    }

    public static EnumC8596Fgy valueOf(String str) {
        return (EnumC8596Fgy) Enum.valueOf(EnumC8596Fgy.class, str);
    }

    public static EnumC8596Fgy[] values() {
        return (EnumC8596Fgy[]) A01.clone();
    }

    public EnumC8596Fgy(String str, int i) {
    }
}
