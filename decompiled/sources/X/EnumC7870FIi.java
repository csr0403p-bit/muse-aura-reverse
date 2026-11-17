package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.FIi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC7870FIi {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC7870FIi[] A01;
    public static final EnumC7870FIi A02;
    public static final EnumC7870FIi A03;
    public static final EnumC7870FIi A04;
    public static final EnumC7870FIi A05;
    public static final EnumC7870FIi A06;
    public final String value;

    static {
        EnumC7870FIi enumC7870FIi = new EnumC7870FIi("EDGE_LEFT", 0, "edge_left");
        A03 = enumC7870FIi;
        EnumC7870FIi enumC7870FIi2 = new EnumC7870FIi("EDGE_RIGHT", 1, "edge_right");
        A04 = enumC7870FIi2;
        EnumC7870FIi enumC7870FIi3 = new EnumC7870FIi("INSET_LEFT", 2, "inset_left");
        EnumC7870FIi enumC7870FIi4 = new EnumC7870FIi("INSET_RIGHT", 3, "inset_right");
        A06 = enumC7870FIi4;
        EnumC7870FIi enumC7870FIi5 = new EnumC7870FIi("EDGE_TOP", 4, "edge_top");
        A05 = enumC7870FIi5;
        EnumC7870FIi enumC7870FIi6 = new EnumC7870FIi("EDGE_BOTTOM", 5, "edge_bottom");
        A02 = enumC7870FIi6;
        EnumC7870FIi[] enumC7870FIiArr = {enumC7870FIi, enumC7870FIi2, enumC7870FIi3, enumC7870FIi4, enumC7870FIi5, enumC7870FIi6};
        A01 = enumC7870FIiArr;
        A00 = C3cG.A0w(enumC7870FIiArr);
    }

    public static EnumC7870FIi valueOf(String str) {
        return (EnumC7870FIi) Enum.valueOf(EnumC7870FIi.class, str);
    }

    public static EnumC7870FIi[] values() {
        return (EnumC7870FIi[]) A01.clone();
    }

    public EnumC7870FIi(String str, int i, String str2) {
        this.value = str2;
    }
}
