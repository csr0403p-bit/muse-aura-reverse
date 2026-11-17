package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hji, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10460Hji {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC10460Hji[] A01;
    public static final EnumC10460Hji A02;
    public static final EnumC10460Hji A03;
    public static final EnumC10460Hji A04;

    static {
        EnumC10460Hji enumC10460Hji = new EnumC10460Hji("COROUTINE_SUSPENDED", 0);
        A02 = enumC10460Hji;
        EnumC10460Hji enumC10460Hji2 = new EnumC10460Hji("UNDECIDED", 1);
        A04 = enumC10460Hji2;
        EnumC10460Hji enumC10460Hji3 = new EnumC10460Hji("RESUMED", 2);
        A03 = enumC10460Hji3;
        EnumC10460Hji[] enumC10460HjiArr = {enumC10460Hji, enumC10460Hji2, enumC10460Hji3};
        A01 = enumC10460HjiArr;
        A00 = C3cG.A0w(enumC10460HjiArr);
    }

    public static EnumC10460Hji valueOf(String str) {
        return (EnumC10460Hji) Enum.valueOf(EnumC10460Hji.class, str);
    }

    public static EnumC10460Hji[] values() {
        return (EnumC10460Hji[]) A01.clone();
    }

    public EnumC10460Hji(String str, int i) {
    }
}
