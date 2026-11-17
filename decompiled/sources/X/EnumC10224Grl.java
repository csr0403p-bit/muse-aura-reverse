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
/* renamed from: X.Grl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10224Grl {
    public static final /* synthetic */ EnumC10224Grl[] A00;
    public static final EnumC10224Grl A01;
    public static final EnumC10224Grl A02;
    public static final EnumC10224Grl A03;
    public static final EnumC10224Grl A04;
    public static final EnumC10224Grl A05;
    public static final EnumC10224Grl A06;
    public static final EnumC10224Grl A07;
    public static final EnumC10224Grl A08;
    public static final EnumC10224Grl A09;
    public static final EnumC10224Grl A0A;
    public final Class<?> boxedType;
    public final Object defaultDefault;
    public final Class<?> type;

    static {
        EnumC10224Grl enumC10224Grl = new EnumC10224Grl(Void.class, Void.class, null, "VOID", 0);
        A0A = enumC10224Grl;
        Class cls = Integer.TYPE;
        EnumC10224Grl enumC10224Grl2 = new EnumC10224Grl(cls, Integer.class, 0, "INT", 1);
        A06 = enumC10224Grl2;
        EnumC10224Grl enumC10224Grl3 = new EnumC10224Grl(Long.TYPE, Long.class, BV7.A0o(), "LONG", 2);
        A07 = enumC10224Grl3;
        EnumC10224Grl enumC10224Grl4 = new EnumC10224Grl(Float.TYPE, Float.class, AnonymousClass005.A0a(), "FLOAT", 3);
        A05 = enumC10224Grl4;
        EnumC10224Grl enumC10224Grl5 = new EnumC10224Grl(Double.TYPE, Double.class, AbstractC7609F5w.A0k(), "DOUBLE", 4);
        A03 = enumC10224Grl5;
        EnumC10224Grl enumC10224Grl6 = new EnumC10224Grl(Boolean.TYPE, Boolean.class, false, "BOOLEAN", 5);
        A01 = enumC10224Grl6;
        EnumC10224Grl enumC10224Grl7 = new EnumC10224Grl(String.class, String.class, "", "STRING", 6);
        A09 = enumC10224Grl7;
        EnumC10224Grl enumC10224Grl8 = new EnumC10224Grl(AbstractC9320GEb.class, AbstractC9320GEb.class, AbstractC9320GEb.A00, "BYTE_STRING", 7);
        A02 = enumC10224Grl8;
        EnumC10224Grl enumC10224Grl9 = new EnumC10224Grl(cls, Integer.class, null, "ENUM", 8);
        A04 = enumC10224Grl9;
        EnumC10224Grl enumC10224Grl10 = new EnumC10224Grl(Object.class, Object.class, null, "MESSAGE", 9);
        A08 = enumC10224Grl10;
        A00 = new EnumC10224Grl[]{enumC10224Grl, enumC10224Grl2, enumC10224Grl3, enumC10224Grl4, enumC10224Grl5, enumC10224Grl6, enumC10224Grl7, enumC10224Grl8, enumC10224Grl9, enumC10224Grl10};
    }

    public static EnumC10224Grl valueOf(String name) {
        return (EnumC10224Grl) Enum.valueOf(EnumC10224Grl.class, name);
    }

    public static EnumC10224Grl[] values() {
        return (EnumC10224Grl[]) A00.clone();
    }

    public EnumC10224Grl(Class $enum$name, Class $enum$ordinal, Object type, String boxedType, int defaultDefault) {
        this.type = $enum$name;
        this.boxedType = $enum$ordinal;
        this.defaultDefault = type;
    }
}
