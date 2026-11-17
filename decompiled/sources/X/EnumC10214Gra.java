package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF19' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Gra, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class EnumC10214Gra {
    public static final /* synthetic */ EnumC10214Gra[] A00;
    public static final EnumC10214Gra A01;
    public static final EnumC10214Gra A02;
    public static final EnumC10214Gra A03;
    public static final EnumC10214Gra A04;
    public final EnumC10213GrZ javaType;
    public final int wireType;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10214Gra EF21;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10214Gra EF20;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10214Gra EF19;

    static {
        final int i = 0;
        final int i2 = 1;
        EnumC10214Gra enumC10214Gra = new EnumC10214Gra(EnumC10213GrZ.DOUBLE, "DOUBLE", 0, 1);
        EnumC10214Gra enumC10214Gra2 = new EnumC10214Gra(EnumC10213GrZ.FLOAT, "FLOAT", 1, 5);
        EnumC10213GrZ enumC10213GrZ = EnumC10213GrZ.LONG;
        final int i3 = 2;
        EnumC10214Gra enumC10214Gra3 = new EnumC10214Gra(enumC10213GrZ, "INT64", 2, 0);
        final int i4 = 3;
        EnumC10214Gra enumC10214Gra4 = new EnumC10214Gra(enumC10213GrZ, "UINT64", 3, 0);
        EnumC10213GrZ enumC10213GrZ2 = EnumC10213GrZ.INT;
        EnumC10214Gra enumC10214Gra5 = new EnumC10214Gra(enumC10213GrZ2, "INT32", 4, 0);
        EnumC10214Gra enumC10214Gra6 = new EnumC10214Gra(enumC10213GrZ, "FIXED64", 5, 1);
        EnumC10214Gra enumC10214Gra7 = new EnumC10214Gra(enumC10213GrZ2, "FIXED32", 6, 5);
        EnumC10214Gra enumC10214Gra8 = new EnumC10214Gra(EnumC10213GrZ.BOOLEAN, "BOOL", 7, 0);
        final EnumC10213GrZ enumC10213GrZ3 = EnumC10213GrZ.STRING;
        EnumC10214Gra enumC10214Gra9 = new EnumC10214Gra(enumC10213GrZ3, i) { // from class: X.I0G
            public final int $t;

            {
                String str;
                int i5;
                int i6;
                this.$t = i;
                switch (i) {
                    case 0:
                        str = "STRING";
                        i5 = 8;
                        i6 = 2;
                        break;
                    case 1:
                        str = "GROUP";
                        i5 = 9;
                        i6 = 3;
                        break;
                    case 2:
                        str = "MESSAGE";
                        i5 = 10;
                        i6 = 2;
                        break;
                    default:
                        str = "BYTES";
                        i5 = 11;
                        i6 = 2;
                        break;
                }
            }
        };
        A04 = enumC10214Gra9;
        final EnumC10213GrZ enumC10213GrZ4 = EnumC10213GrZ.MESSAGE;
        EnumC10214Gra enumC10214Gra10 = new EnumC10214Gra(enumC10213GrZ4, i2) { // from class: X.I0G
            public final int $t;

            {
                String str;
                int i5;
                int i6;
                this.$t = i2;
                switch (i2) {
                    case 0:
                        str = "STRING";
                        i5 = 8;
                        i6 = 2;
                        break;
                    case 1:
                        str = "GROUP";
                        i5 = 9;
                        i6 = 3;
                        break;
                    case 2:
                        str = "MESSAGE";
                        i5 = 10;
                        i6 = 2;
                        break;
                    default:
                        str = "BYTES";
                        i5 = 11;
                        i6 = 2;
                        break;
                }
            }
        };
        A02 = enumC10214Gra10;
        EnumC10214Gra enumC10214Gra11 = new EnumC10214Gra(enumC10213GrZ4, i3) { // from class: X.I0G
            public final int $t;

            {
                String str;
                int i5;
                int i6;
                this.$t = i3;
                switch (i3) {
                    case 0:
                        str = "STRING";
                        i5 = 8;
                        i6 = 2;
                        break;
                    case 1:
                        str = "GROUP";
                        i5 = 9;
                        i6 = 3;
                        break;
                    case 2:
                        str = "MESSAGE";
                        i5 = 10;
                        i6 = 2;
                        break;
                    default:
                        str = "BYTES";
                        i5 = 11;
                        i6 = 2;
                        break;
                }
            }
        };
        A03 = enumC10214Gra11;
        final EnumC10213GrZ enumC10213GrZ5 = EnumC10213GrZ.BYTE_STRING;
        EnumC10214Gra enumC10214Gra12 = new EnumC10214Gra(enumC10213GrZ5, i4) { // from class: X.I0G
            public final int $t;

            {
                String str;
                int i5;
                int i6;
                this.$t = i4;
                switch (i4) {
                    case 0:
                        str = "STRING";
                        i5 = 8;
                        i6 = 2;
                        break;
                    case 1:
                        str = "GROUP";
                        i5 = 9;
                        i6 = 3;
                        break;
                    case 2:
                        str = "MESSAGE";
                        i5 = 10;
                        i6 = 2;
                        break;
                    default:
                        str = "BYTES";
                        i5 = 11;
                        i6 = 2;
                        break;
                }
            }
        };
        A01 = enumC10214Gra12;
        A00 = new EnumC10214Gra[]{enumC10214Gra, enumC10214Gra2, enumC10214Gra3, enumC10214Gra4, enumC10214Gra5, enumC10214Gra6, enumC10214Gra7, enumC10214Gra8, enumC10214Gra9, enumC10214Gra10, enumC10214Gra11, enumC10214Gra12, new EnumC10214Gra(enumC10213GrZ2, "UINT32", 12, 0), new EnumC10214Gra(EnumC10213GrZ.ENUM, "ENUM", 13, 0), new EnumC10214Gra(enumC10213GrZ2, "SFIXED32", 14, 5), new EnumC10214Gra(enumC10213GrZ, "SFIXED64", 15, 1), new EnumC10214Gra(enumC10213GrZ2, "SINT32", 16, 0), new EnumC10214Gra(enumC10213GrZ, "SINT64", 17, 0)};
    }

    public static EnumC10214Gra valueOf(String str) {
        return (EnumC10214Gra) Enum.valueOf(EnumC10214Gra.class, str);
    }

    public static EnumC10214Gra[] values() {
        return (EnumC10214Gra[]) A00.clone();
    }

    public EnumC10214Gra(EnumC10213GrZ enumC10213GrZ, String str, int i, int i2) {
        this.javaType = enumC10213GrZ;
        this.wireType = i2;
    }
}
