package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A04' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Grb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class EnumC10215Grb {
    public static final /* synthetic */ EnumC10215Grb[] A00;
    public static final EnumC10215Grb A01;
    public static final EnumC10215Grb A02;
    public static final EnumC10215Grb A03;
    public static final EnumC10215Grb A04;
    public static final EnumC10215Grb A05;
    public static final EnumC10215Grb A06;
    public final EnumC10216Grc javaType;
    public final int wireType;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10215Grb EF21;

    static {
        final int i = 0;
        EnumC10215Grb enumC10215Grb = new EnumC10215Grb(EnumC10216Grc.DOUBLE, "DOUBLE", 0, 1);
        A02 = enumC10215Grb;
        EnumC10215Grb enumC10215Grb2 = new EnumC10215Grb(EnumC10216Grc.FLOAT, "FLOAT", 1, 5);
        EnumC10216Grc enumC10216Grc = EnumC10216Grc.LONG;
        final int i2 = 2;
        EnumC10215Grb enumC10215Grb3 = new EnumC10215Grb(enumC10216Grc, "INT64", 2, 0);
        A04 = enumC10215Grb3;
        final int i3 = 3;
        EnumC10215Grb enumC10215Grb4 = new EnumC10215Grb(enumC10216Grc, "UINT64", 3, 0);
        EnumC10216Grc enumC10216Grc2 = EnumC10216Grc.INT;
        EnumC10215Grb enumC10215Grb5 = new EnumC10215Grb(enumC10216Grc2, "INT32", 4, 0);
        EnumC10215Grb enumC10215Grb6 = new EnumC10215Grb(enumC10216Grc, "FIXED64", 5, 1);
        EnumC10215Grb enumC10215Grb7 = new EnumC10215Grb(enumC10216Grc2, "FIXED32", 6, 5);
        EnumC10215Grb enumC10215Grb8 = new EnumC10215Grb(EnumC10216Grc.BOOLEAN, "BOOL", 7, 0);
        final EnumC10216Grc enumC10216Grc3 = EnumC10216Grc.STRING;
        EnumC10215Grb enumC10215Grb9 = new EnumC10215Grb(enumC10216Grc3, i) { // from class: X.I0H
            public final int $t;

            {
                String str;
                int i4;
                int i5;
                this.$t = i;
                switch (i) {
                    case 0:
                        str = "STRING";
                        i4 = 8;
                        i5 = 2;
                        break;
                    case 1:
                        str = "GROUP";
                        i4 = 9;
                        i5 = 3;
                        break;
                    case 2:
                        str = "MESSAGE";
                        i4 = 10;
                        i5 = 2;
                        break;
                    default:
                        str = "BYTES";
                        i4 = 11;
                        i5 = 2;
                        break;
                }
            }
        };
        A06 = enumC10215Grb9;
        final EnumC10216Grc enumC10216Grc4 = EnumC10216Grc.MESSAGE;
        final int i4 = 1;
        EnumC10215Grb enumC10215Grb10 = new EnumC10215Grb(enumC10216Grc4, i4) { // from class: X.I0H
            public final int $t;

            {
                String str;
                int i42;
                int i5;
                this.$t = i4;
                switch (i4) {
                    case 0:
                        str = "STRING";
                        i42 = 8;
                        i5 = 2;
                        break;
                    case 1:
                        str = "GROUP";
                        i42 = 9;
                        i5 = 3;
                        break;
                    case 2:
                        str = "MESSAGE";
                        i42 = 10;
                        i5 = 2;
                        break;
                    default:
                        str = "BYTES";
                        i42 = 11;
                        i5 = 2;
                        break;
                }
            }
        };
        A03 = enumC10215Grb10;
        EnumC10215Grb enumC10215Grb11 = new EnumC10215Grb(enumC10216Grc4, i2) { // from class: X.I0H
            public final int $t;

            {
                String str;
                int i42;
                int i5;
                this.$t = i2;
                switch (i2) {
                    case 0:
                        str = "STRING";
                        i42 = 8;
                        i5 = 2;
                        break;
                    case 1:
                        str = "GROUP";
                        i42 = 9;
                        i5 = 3;
                        break;
                    case 2:
                        str = "MESSAGE";
                        i42 = 10;
                        i5 = 2;
                        break;
                    default:
                        str = "BYTES";
                        i42 = 11;
                        i5 = 2;
                        break;
                }
            }
        };
        A05 = enumC10215Grb11;
        final EnumC10216Grc enumC10216Grc5 = EnumC10216Grc.BYTE_STRING;
        EnumC10215Grb enumC10215Grb12 = new EnumC10215Grb(enumC10216Grc5, i3) { // from class: X.I0H
            public final int $t;

            {
                String str;
                int i42;
                int i5;
                this.$t = i3;
                switch (i3) {
                    case 0:
                        str = "STRING";
                        i42 = 8;
                        i5 = 2;
                        break;
                    case 1:
                        str = "GROUP";
                        i42 = 9;
                        i5 = 3;
                        break;
                    case 2:
                        str = "MESSAGE";
                        i42 = 10;
                        i5 = 2;
                        break;
                    default:
                        str = "BYTES";
                        i42 = 11;
                        i5 = 2;
                        break;
                }
            }
        };
        A01 = enumC10215Grb12;
        A00 = new EnumC10215Grb[]{enumC10215Grb, enumC10215Grb2, enumC10215Grb3, enumC10215Grb4, enumC10215Grb5, enumC10215Grb6, enumC10215Grb7, enumC10215Grb8, enumC10215Grb9, enumC10215Grb10, enumC10215Grb11, enumC10215Grb12, new EnumC10215Grb(enumC10216Grc2, "UINT32", 12, 0), new EnumC10215Grb(EnumC10216Grc.ENUM, "ENUM", 13, 0), new EnumC10215Grb(enumC10216Grc2, "SFIXED32", 14, 5), new EnumC10215Grb(enumC10216Grc, "SFIXED64", 15, 1), new EnumC10215Grb(enumC10216Grc2, "SINT32", 16, 0), new EnumC10215Grb(enumC10216Grc, "SINT64", 17, 0)};
    }

    public static EnumC10215Grb valueOf(String name) {
        return (EnumC10215Grb) Enum.valueOf(EnumC10215Grb.class, name);
    }

    public static EnumC10215Grb[] values() {
        return (EnumC10215Grb[]) A00.clone();
    }

    public EnumC10215Grb(EnumC10216Grc $enum$name, String $enum$ordinal, final int javaType, final int wireType) {
        this.javaType = $enum$name;
        this.wireType = wireType;
    }
}
