package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.FMj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC7953FMj {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC7953FMj[] A01;
    public static final EnumC7953FMj A02;
    public static final EnumC7953FMj A03;
    public static final EnumC7953FMj A04;
    public static final EnumC7953FMj A05;
    public final float headerTopMargin;
    public final float layoutTopMargin;

    static {
        EnumC7953FMj enumC7953FMj = new EnumC7953FMj("EMPTY", 0.0f, 0.0f, 0);
        A04 = enumC7953FMj;
        EnumC7953FMj enumC7953FMj2 = new EnumC7953FMj("FULL_SCREEN", 0.0f, 0.0f, 1);
        A05 = enumC7953FMj2;
        EnumC7953FMj enumC7953FMj3 = new EnumC7953FMj("BOTTOM_SHEET", 16.0f, 0.0f, 2);
        A02 = enumC7953FMj3;
        EnumC7953FMj enumC7953FMj4 = new EnumC7953FMj("BOTTOM_SHEET_EDGE2EDGE", 0.0f, 16.0f, 3);
        A03 = enumC7953FMj4;
        EnumC7953FMj[] enumC7953FMjArr = {enumC7953FMj, enumC7953FMj2, enumC7953FMj3, enumC7953FMj4};
        A01 = enumC7953FMjArr;
        A00 = C3cG.A0w(enumC7953FMjArr);
    }

    public static EnumC7953FMj valueOf(String str) {
        return (EnumC7953FMj) Enum.valueOf(EnumC7953FMj.class, str);
    }

    public static EnumC7953FMj[] values() {
        return (EnumC7953FMj[]) A01.clone();
    }

    public EnumC7953FMj(String str, float f, float f2, int i) {
        this.layoutTopMargin = f;
        this.headerTopMargin = f2;
    }
}
