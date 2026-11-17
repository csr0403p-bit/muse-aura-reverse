package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.ArL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1802ArL {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC1802ArL[] A01;
    public static final EnumC1802ArL A02;
    public static final EnumC1802ArL A03;
    public static final EnumC1802ArL A04;
    public static final EnumC1802ArL A05;
    public static final EnumC1802ArL A06;
    public static final EnumC1802ArL A07;
    public static final EnumC1802ArL A08;

    static {
        EnumC1802ArL enumC1802ArL = new EnumC1802ArL("Paragraph", 0);
        A04 = enumC1802ArL;
        EnumC1802ArL enumC1802ArL2 = new EnumC1802ArL("Span", 1);
        A05 = enumC1802ArL2;
        EnumC1802ArL enumC1802ArL3 = new EnumC1802ArL("VerbatimTts", 2);
        A08 = enumC1802ArL3;
        EnumC1802ArL enumC1802ArL4 = new EnumC1802ArL("Url", 3);
        A07 = enumC1802ArL4;
        EnumC1802ArL enumC1802ArL5 = new EnumC1802ArL("Link", 4);
        A03 = enumC1802ArL5;
        EnumC1802ArL enumC1802ArL6 = new EnumC1802ArL("Clickable", 5);
        A02 = enumC1802ArL6;
        EnumC1802ArL enumC1802ArL7 = new EnumC1802ArL("String", 6);
        A06 = enumC1802ArL7;
        EnumC1802ArL[] enumC1802ArLArr = {enumC1802ArL, enumC1802ArL2, enumC1802ArL3, enumC1802ArL4, enumC1802ArL5, enumC1802ArL6, enumC1802ArL7};
        A01 = enumC1802ArLArr;
        A00 = C3cG.A0w(enumC1802ArLArr);
    }

    public static EnumC1802ArL valueOf(String str) {
        return (EnumC1802ArL) Enum.valueOf(EnumC1802ArL.class, str);
    }

    public static EnumC1802ArL[] values() {
        return (EnumC1802ArL[]) A01.clone();
    }

    public EnumC1802ArL(String str, int i) {
    }
}
