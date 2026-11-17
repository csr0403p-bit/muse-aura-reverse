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
/* renamed from: X.Grp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10228Grp {
    public static final /* synthetic */ EnumC10228Grp[] A00;
    public static final EnumC10228Grp A01;
    public static final EnumC10228Grp A02;
    public static final EnumC10228Grp A03;
    public static final EnumC10228Grp A04;
    public static final EnumC10228Grp A05;
    public static final EnumC10228Grp A06;
    public static final EnumC10228Grp A07;
    public static final EnumC10228Grp A08;
    public static final EnumC10228Grp A09;
    public static final EnumC10228Grp A0A;
    public final Class<?> boxedType;
    public final Object defaultDefault;
    public final Class<?> type;

    static {
        EnumC10228Grp enumC10228Grp = new EnumC10228Grp(Void.class, Void.class, null, "VOID", 0);
        A0A = enumC10228Grp;
        Class cls = Integer.TYPE;
        EnumC10228Grp enumC10228Grp2 = new EnumC10228Grp(cls, Integer.class, 0, "INT", 1);
        A06 = enumC10228Grp2;
        EnumC10228Grp enumC10228Grp3 = new EnumC10228Grp(Long.TYPE, Long.class, BV7.A0o(), "LONG", 2);
        A07 = enumC10228Grp3;
        EnumC10228Grp enumC10228Grp4 = new EnumC10228Grp(Float.TYPE, Float.class, AnonymousClass005.A0a(), "FLOAT", 3);
        A05 = enumC10228Grp4;
        EnumC10228Grp enumC10228Grp5 = new EnumC10228Grp(Double.TYPE, Double.class, AbstractC7609F5w.A0k(), "DOUBLE", 4);
        A03 = enumC10228Grp5;
        EnumC10228Grp enumC10228Grp6 = new EnumC10228Grp(Boolean.TYPE, Boolean.class, false, "BOOLEAN", 5);
        A01 = enumC10228Grp6;
        EnumC10228Grp enumC10228Grp7 = new EnumC10228Grp(String.class, String.class, "", "STRING", 6);
        A09 = enumC10228Grp7;
        EnumC10228Grp enumC10228Grp8 = new EnumC10228Grp(AbstractC9309GDl.class, AbstractC9309GDl.class, AbstractC9309GDl.A01, "BYTE_STRING", 7);
        A02 = enumC10228Grp8;
        EnumC10228Grp enumC10228Grp9 = new EnumC10228Grp(cls, Integer.class, null, "ENUM", 8);
        A04 = enumC10228Grp9;
        EnumC10228Grp enumC10228Grp10 = new EnumC10228Grp(Object.class, Object.class, null, "MESSAGE", 9);
        A08 = enumC10228Grp10;
        A00 = new EnumC10228Grp[]{enumC10228Grp, enumC10228Grp2, enumC10228Grp3, enumC10228Grp4, enumC10228Grp5, enumC10228Grp6, enumC10228Grp7, enumC10228Grp8, enumC10228Grp9, enumC10228Grp10};
    }

    public static EnumC10228Grp valueOf(String str) {
        return (EnumC10228Grp) Enum.valueOf(EnumC10228Grp.class, str);
    }

    public static EnumC10228Grp[] values() {
        return (EnumC10228Grp[]) A00.clone();
    }

    public EnumC10228Grp(Class cls, Class cls2, Object obj, String str, int i) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }
}
