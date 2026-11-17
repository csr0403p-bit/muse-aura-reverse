package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.FMi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC7952FMi {
    public static final EnumC7952FMi[] A00;
    public static final /* synthetic */ Ey9 A01;
    public static final /* synthetic */ EnumC7952FMi[] A02;
    public static final EnumC7952FMi A03;
    public static final EnumC7952FMi A04;
    public final String value;

    static {
        EnumC7952FMi enumC7952FMi = new EnumC7952FMi("SAME_SIZE", 0, "same_size");
        A03 = enumC7952FMi;
        EnumC7952FMi enumC7952FMi2 = new EnumC7952FMi("TOP_ROUNDED", 1, "top_rounded");
        A04 = enumC7952FMi2;
        EnumC7952FMi[] enumC7952FMiArr = {enumC7952FMi, enumC7952FMi2};
        A02 = enumC7952FMiArr;
        F3w f3wA0w = C3cG.A0w(enumC7952FMiArr);
        A01 = f3wA0w;
        A00 = (EnumC7952FMi[]) f3wA0w.toArray(new EnumC7952FMi[0]);
    }

    public static EnumC7952FMi valueOf(String str) {
        return (EnumC7952FMi) Enum.valueOf(EnumC7952FMi.class, str);
    }

    public static EnumC7952FMi[] values() {
        return (EnumC7952FMi[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }

    public EnumC7952FMi(String str, int i, String str2) {
        this.value = str2;
    }
}
