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
/* renamed from: X.Gro, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10227Gro {
    public static final /* synthetic */ EnumC10227Gro[] A00;
    public static final EnumC10227Gro A01;
    public static final EnumC10227Gro A02;
    public static final EnumC10227Gro A03;
    public static final EnumC10227Gro A04;
    public static final EnumC10227Gro A05;
    public static final EnumC10227Gro A06;
    public static final EnumC10227Gro A07;
    public static final EnumC10227Gro A08;
    public static final EnumC10227Gro A09;
    public static final EnumC10227Gro A0A;
    public final Class<?> boxedType;
    public final Object defaultDefault;
    public final Class<?> type;

    static {
        EnumC10227Gro enumC10227Gro = new EnumC10227Gro(Void.class, Void.class, null, "VOID", 0);
        A0A = enumC10227Gro;
        Class cls = Integer.TYPE;
        EnumC10227Gro enumC10227Gro2 = new EnumC10227Gro(cls, Integer.class, 0, "INT", 1);
        A06 = enumC10227Gro2;
        EnumC10227Gro enumC10227Gro3 = new EnumC10227Gro(Long.TYPE, Long.class, BV7.A0o(), "LONG", 2);
        A07 = enumC10227Gro3;
        EnumC10227Gro enumC10227Gro4 = new EnumC10227Gro(Float.TYPE, Float.class, AnonymousClass005.A0a(), "FLOAT", 3);
        A05 = enumC10227Gro4;
        EnumC10227Gro enumC10227Gro5 = new EnumC10227Gro(Double.TYPE, Double.class, AbstractC7609F5w.A0k(), "DOUBLE", 4);
        A03 = enumC10227Gro5;
        EnumC10227Gro enumC10227Gro6 = new EnumC10227Gro(Boolean.TYPE, Boolean.class, false, "BOOLEAN", 5);
        A01 = enumC10227Gro6;
        EnumC10227Gro enumC10227Gro7 = new EnumC10227Gro(String.class, String.class, "", "STRING", 6);
        A09 = enumC10227Gro7;
        EnumC10227Gro enumC10227Gro8 = new EnumC10227Gro(AbstractC9321GEc.class, AbstractC9321GEc.class, AbstractC9321GEc.A00, "BYTE_STRING", 7);
        A02 = enumC10227Gro8;
        EnumC10227Gro enumC10227Gro9 = new EnumC10227Gro(cls, Integer.class, null, "ENUM", 8);
        A04 = enumC10227Gro9;
        EnumC10227Gro enumC10227Gro10 = new EnumC10227Gro(Object.class, Object.class, null, "MESSAGE", 9);
        A08 = enumC10227Gro10;
        A00 = new EnumC10227Gro[]{enumC10227Gro, enumC10227Gro2, enumC10227Gro3, enumC10227Gro4, enumC10227Gro5, enumC10227Gro6, enumC10227Gro7, enumC10227Gro8, enumC10227Gro9, enumC10227Gro10};
    }

    public static EnumC10227Gro valueOf(String name) {
        return (EnumC10227Gro) Enum.valueOf(EnumC10227Gro.class, name);
    }

    public static EnumC10227Gro[] values() {
        return (EnumC10227Gro[]) A00.clone();
    }

    public EnumC10227Gro(Class $enum$name, Class $enum$ordinal, Object type, String boxedType, int defaultDefault) {
        this.type = $enum$name;
        this.boxedType = $enum$ordinal;
        this.defaultDefault = type;
    }
}
