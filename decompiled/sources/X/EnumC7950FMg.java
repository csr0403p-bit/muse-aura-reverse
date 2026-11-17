package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.FMg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC7950FMg {
    public static final EnumC7950FMg[] A00;
    public static final /* synthetic */ Ey9 A01;
    public static final /* synthetic */ EnumC7950FMg[] A02;
    public static final EnumC7950FMg A03;
    public static final EnumC7950FMg A04;
    public final String value;

    static {
        EnumC7950FMg enumC7950FMg = new EnumC7950FMg("AUTO", 0, "auto");
        A03 = enumC7950FMg;
        EnumC7950FMg enumC7950FMg2 = new EnumC7950FMg("ENABLED", 1, "enabled");
        EnumC7950FMg enumC7950FMg3 = new EnumC7950FMg("DISABLED", 2, "disabled");
        A04 = enumC7950FMg3;
        EnumC7950FMg[] enumC7950FMgArr = {enumC7950FMg, enumC7950FMg2, enumC7950FMg3};
        A02 = enumC7950FMgArr;
        F3w f3wA0w = C3cG.A0w(enumC7950FMgArr);
        A01 = f3wA0w;
        A00 = (EnumC7950FMg[]) f3wA0w.toArray(new EnumC7950FMg[0]);
    }

    public static final EnumC7950FMg A00(String str) {
        for (EnumC7950FMg enumC7950FMg : A00) {
            if (str.equals(enumC7950FMg.toString())) {
                return enumC7950FMg;
            }
        }
        EnumC7951FMh enumC7951FMh = FMd.A0Q;
        Hx0.A00();
        return A03;
    }

    public static EnumC7950FMg valueOf(String str) {
        return (EnumC7950FMg) Enum.valueOf(EnumC7950FMg.class, str);
    }

    public static EnumC7950FMg[] values() {
        return (EnumC7950FMg[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }

    public EnumC7950FMg(String str, int i, String str2) {
        this.value = str2;
    }
}
