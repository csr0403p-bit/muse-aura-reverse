package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.FMf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC7949FMf {
    public static final EnumC7949FMf[] A00;
    public static final /* synthetic */ Ey9 A01;
    public static final /* synthetic */ EnumC7949FMf[] A02;
    public static final EnumC7949FMf A03;
    public static final EnumC7949FMf A04;
    public static final EnumC7949FMf A05;
    public final String value;

    static {
        EnumC7949FMf enumC7949FMf = new EnumC7949FMf("AUTO", 0, "auto");
        A03 = enumC7949FMf;
        EnumC7949FMf enumC7949FMf2 = new EnumC7949FMf("ENABLED", 1, "enabled");
        A05 = enumC7949FMf2;
        EnumC7949FMf enumC7949FMf3 = new EnumC7949FMf("DISABLED", 2, "disabled");
        A04 = enumC7949FMf3;
        EnumC7949FMf[] enumC7949FMfArr = {enumC7949FMf, enumC7949FMf2, enumC7949FMf3};
        A02 = enumC7949FMfArr;
        F3w f3wA0w = C3cG.A0w(enumC7949FMfArr);
        A01 = f3wA0w;
        A00 = (EnumC7949FMf[]) f3wA0w.toArray(new EnumC7949FMf[0]);
    }

    public static final EnumC7949FMf A00(String str) {
        for (EnumC7949FMf enumC7949FMf : A00) {
            if (str.equals(enumC7949FMf.toString())) {
                return enumC7949FMf;
            }
        }
        EnumC7951FMh enumC7951FMh = FMd.A0Q;
        Hx0.A00();
        return A03;
    }

    public static EnumC7949FMf valueOf(String str) {
        return (EnumC7949FMf) Enum.valueOf(EnumC7949FMf.class, str);
    }

    public static EnumC7949FMf[] values() {
        return (EnumC7949FMf[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }

    public EnumC7949FMf(String str, int i, String str2) {
        this.value = str2;
    }
}
