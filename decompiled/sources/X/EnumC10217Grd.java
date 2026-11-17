package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF18' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Grd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class EnumC10217Grd {
    public static final /* synthetic */ EnumC10217Grd[] A00;
    public static final C10220Grg A01;
    public static final C10221Grh A02;
    public static final C10222Gri A03;
    public final EnumC10218Gre a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10217Grd EF20;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10217Grd EF19;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10217Grd EF18;

    static {
        EnumC10217Grd enumC10217Grd = new EnumC10217Grd(EnumC10218Gre.DOUBLE, "DOUBLE", 0, 1);
        EnumC10217Grd enumC10217Grd2 = new EnumC10217Grd(EnumC10218Gre.FLOAT, "FLOAT", 1, 5);
        EnumC10218Gre enumC10218Gre = EnumC10218Gre.LONG;
        EnumC10217Grd enumC10217Grd3 = new EnumC10217Grd(enumC10218Gre, "INT64", 2, 0);
        EnumC10217Grd enumC10217Grd4 = new EnumC10217Grd(enumC10218Gre, "UINT64", 3, 0);
        EnumC10218Gre enumC10218Gre2 = EnumC10218Gre.INT;
        EnumC10217Grd enumC10217Grd5 = new EnumC10217Grd(enumC10218Gre2, "INT32", 4, 0);
        EnumC10217Grd enumC10217Grd6 = new EnumC10217Grd(enumC10218Gre, "FIXED64", 5, 1);
        EnumC10217Grd enumC10217Grd7 = new EnumC10217Grd(enumC10218Gre2, "FIXED32", 6, 5);
        EnumC10217Grd enumC10217Grd8 = new EnumC10217Grd(EnumC10218Gre.BOOLEAN, "BOOL", 7, 0);
        C10220Grg c10220Grg = new C10220Grg();
        A01 = c10220Grg;
        EnumC10218Gre enumC10218Gre3 = EnumC10218Gre.MESSAGE;
        C10221Grh c10221Grh = new C10221Grh(enumC10218Gre3);
        A02 = c10221Grh;
        C10222Gri c10222Gri = new C10222Gri(enumC10218Gre3);
        A03 = c10222Gri;
        final EnumC10218Gre enumC10218Gre4 = EnumC10218Gre.BYTE_STRING;
        A00 = new EnumC10217Grd[]{enumC10217Grd, enumC10217Grd2, enumC10217Grd3, enumC10217Grd4, enumC10217Grd5, enumC10217Grd6, enumC10217Grd7, enumC10217Grd8, c10220Grg, c10221Grh, c10222Gri, new EnumC10217Grd(enumC10218Gre4) { // from class: X.Grj
        }, new EnumC10217Grd(enumC10218Gre2, "UINT32", 12, 0), new EnumC10217Grd(EnumC10218Gre.ENUM, "ENUM", 13, 0), new EnumC10217Grd(enumC10218Gre2, "SFIXED32", 14, 5), new EnumC10217Grd(enumC10218Gre, "SFIXED64", 15, 1), new EnumC10217Grd(enumC10218Gre2, "SINT32", 16, 0), new EnumC10217Grd(enumC10218Gre, "SINT64", 17, 0)};
    }

    public static EnumC10217Grd[] values() {
        return (EnumC10217Grd[]) A00.clone();
    }

    public EnumC10217Grd(EnumC10218Gre enumC10218Gre, String str, int i, int i2) {
        this.a = enumC10218Gre;
        this.b = i2;
    }
}
