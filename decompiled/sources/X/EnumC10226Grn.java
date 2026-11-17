package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A06' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Grn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10226Grn {
    public static final /* synthetic */ EnumC10226Grn[] A00;
    public static final EnumC10226Grn A01;
    public static final EnumC10226Grn A02;
    public static final EnumC10226Grn A03;
    public static final EnumC10226Grn A04;
    public static final EnumC10226Grn A05;
    public static final EnumC10226Grn A06;
    public static final EnumC10226Grn A07;
    public static final EnumC10226Grn A08;
    public static final EnumC10226Grn A09;
    public static final EnumC10226Grn A0A;
    public final Class<?> boxedType;
    public final Object defaultDefault;
    public final Class<?> type;

    static {
        EnumC10226Grn enumC10226Grn = new EnumC10226Grn(Void.class, Void.class, null, "VOID", 0);
        A0A = enumC10226Grn;
        Class cls = Integer.TYPE;
        EnumC10226Grn enumC10226Grn2 = new EnumC10226Grn(cls, Integer.class, 0, "INT", 1);
        A06 = enumC10226Grn2;
        EnumC10226Grn enumC10226Grn3 = new EnumC10226Grn(Long.TYPE, Long.class, BV7.A0o(), "LONG", 2);
        A07 = enumC10226Grn3;
        EnumC10226Grn enumC10226Grn4 = new EnumC10226Grn(Float.TYPE, Float.class, AnonymousClass005.A0a(), "FLOAT", 3);
        A05 = enumC10226Grn4;
        EnumC10226Grn enumC10226Grn5 = new EnumC10226Grn(Double.TYPE, Double.class, AbstractC7609F5w.A0k(), "DOUBLE", 4);
        A03 = enumC10226Grn5;
        EnumC10226Grn enumC10226Grn6 = new EnumC10226Grn(Boolean.TYPE, Boolean.class, false, "BOOLEAN", 5);
        A01 = enumC10226Grn6;
        EnumC10226Grn enumC10226Grn7 = new EnumC10226Grn(String.class, String.class, "", "STRING", 6);
        A09 = enumC10226Grn7;
        EnumC10226Grn enumC10226Grn8 = new EnumC10226Grn(GEY.class, GEY.class, GEY.A01, "BYTE_STRING", 7);
        A02 = enumC10226Grn8;
        EnumC10226Grn enumC10226Grn9 = new EnumC10226Grn(cls, Integer.class, null, "ENUM", 8);
        A04 = enumC10226Grn9;
        EnumC10226Grn enumC10226Grn10 = new EnumC10226Grn(Object.class, Object.class, null, "MESSAGE", 9);
        A08 = enumC10226Grn10;
        A00 = new EnumC10226Grn[]{enumC10226Grn, enumC10226Grn2, enumC10226Grn3, enumC10226Grn4, enumC10226Grn5, enumC10226Grn6, enumC10226Grn7, enumC10226Grn8, enumC10226Grn9, enumC10226Grn10};
    }

    public static EnumC10226Grn valueOf(String name) {
        return (EnumC10226Grn) Enum.valueOf(EnumC10226Grn.class, name);
    }

    public static EnumC10226Grn[] values() {
        return (EnumC10226Grn[]) A00.clone();
    }

    public EnumC10226Grn(Class $enum$name, Class $enum$ordinal, Object type, String boxedType, int defaultDefault) {
        this.type = $enum$name;
        this.boxedType = $enum$ordinal;
        this.defaultDefault = type;
    }
}
