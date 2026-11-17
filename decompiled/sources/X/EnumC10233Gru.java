package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Gru, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10233Gru {
    public static final /* synthetic */ EnumC10233Gru[] A00;
    public static final EnumC10233Gru A01;
    public static final EnumC10233Gru A02;
    public final EnumC10238Grz collection;
    public final Class<?> elementType;
    public final int id;
    public final EnumC10226Grn javaType;
    public final boolean primitiveScalar;

    static {
        EnumC10238Grz enumC10238Grz = EnumC10238Grz.SCALAR;
        EnumC10226Grn enumC10226Grn = EnumC10226Grn.A03;
        EnumC10233Gru enumC10233GruA00 = A00(enumC10238Grz, enumC10226Grn, "DOUBLE", 0);
        EnumC10226Grn enumC10226Grn2 = EnumC10226Grn.A05;
        EnumC10233Gru enumC10233GruA002 = A00(enumC10238Grz, enumC10226Grn2, "FLOAT", 1);
        EnumC10226Grn enumC10226Grn3 = EnumC10226Grn.A07;
        EnumC10233Gru enumC10233GruA003 = A00(enumC10238Grz, enumC10226Grn3, "INT64", 2);
        EnumC10233Gru enumC10233GruA004 = A00(enumC10238Grz, enumC10226Grn3, "UINT64", 3);
        EnumC10226Grn enumC10226Grn4 = EnumC10226Grn.A06;
        EnumC10233Gru enumC10233GruA005 = A00(enumC10238Grz, enumC10226Grn4, "INT32", 4);
        EnumC10233Gru enumC10233GruA006 = A00(enumC10238Grz, enumC10226Grn3, "FIXED64", 5);
        EnumC10233Gru enumC10233GruA007 = A00(enumC10238Grz, enumC10226Grn4, "FIXED32", 6);
        EnumC10226Grn enumC10226Grn5 = EnumC10226Grn.A01;
        EnumC10233Gru enumC10233GruA008 = A00(enumC10238Grz, enumC10226Grn5, "BOOL", 7);
        EnumC10226Grn enumC10226Grn6 = EnumC10226Grn.A09;
        EnumC10233Gru enumC10233GruA009 = A00(enumC10238Grz, enumC10226Grn6, "STRING", 8);
        EnumC10226Grn enumC10226Grn7 = EnumC10226Grn.A08;
        EnumC10233Gru enumC10233GruA0010 = A00(enumC10238Grz, enumC10226Grn7, "MESSAGE", 9);
        EnumC10226Grn enumC10226Grn8 = EnumC10226Grn.A02;
        EnumC10233Gru enumC10233GruA0011 = A00(enumC10238Grz, enumC10226Grn8, "BYTES", 10);
        EnumC10233Gru enumC10233GruA0012 = A00(enumC10238Grz, enumC10226Grn4, "UINT32", 11);
        EnumC10226Grn enumC10226Grn9 = EnumC10226Grn.A04;
        EnumC10233Gru enumC10233GruA0013 = A00(enumC10238Grz, enumC10226Grn9, "ENUM", 12);
        EnumC10233Gru enumC10233GruA0014 = A00(enumC10238Grz, enumC10226Grn4, "SFIXED32", 13);
        EnumC10233Gru enumC10233GruA0015 = A00(enumC10238Grz, enumC10226Grn3, "SFIXED64", 14);
        EnumC10233Gru enumC10233GruA0016 = A00(enumC10238Grz, enumC10226Grn4, "SINT32", 15);
        EnumC10233Gru enumC10233GruA0017 = A00(enumC10238Grz, enumC10226Grn3, "SINT64", 16);
        EnumC10233Gru enumC10233GruA0018 = A00(enumC10238Grz, enumC10226Grn7, "GROUP", 17);
        EnumC10238Grz enumC10238Grz2 = EnumC10238Grz.VECTOR;
        EnumC10233Gru enumC10233GruA0019 = A00(enumC10238Grz2, enumC10226Grn, "DOUBLE_LIST", 18);
        EnumC10233Gru enumC10233GruA0020 = A00(enumC10238Grz2, enumC10226Grn2, "FLOAT_LIST", 19);
        EnumC10233Gru enumC10233GruA0021 = A00(enumC10238Grz2, enumC10226Grn3, "INT64_LIST", 20);
        EnumC10233Gru enumC10233GruA0022 = A00(enumC10238Grz2, enumC10226Grn3, "UINT64_LIST", 21);
        EnumC10233Gru enumC10233GruA0023 = A00(enumC10238Grz2, enumC10226Grn4, "INT32_LIST", 22);
        EnumC10233Gru enumC10233GruA0024 = A00(enumC10238Grz2, enumC10226Grn3, "FIXED64_LIST", 23);
        EnumC10233Gru enumC10233GruA0025 = A00(enumC10238Grz2, enumC10226Grn4, "FIXED32_LIST", 24);
        EnumC10233Gru enumC10233GruA0026 = A00(enumC10238Grz2, enumC10226Grn5, "BOOL_LIST", 25);
        EnumC10233Gru enumC10233GruA0027 = A00(enumC10238Grz2, enumC10226Grn6, "STRING_LIST", 26);
        EnumC10233Gru enumC10233GruA0028 = A00(enumC10238Grz2, enumC10226Grn7, "MESSAGE_LIST", 27);
        EnumC10233Gru enumC10233GruA0029 = A00(enumC10238Grz2, enumC10226Grn8, "BYTES_LIST", 28);
        EnumC10233Gru enumC10233GruA0030 = A00(enumC10238Grz2, enumC10226Grn4, "UINT32_LIST", 29);
        EnumC10233Gru enumC10233GruA0031 = A00(enumC10238Grz2, enumC10226Grn9, "ENUM_LIST", 30);
        EnumC10233Gru enumC10233GruA0032 = A00(enumC10238Grz2, enumC10226Grn4, "SFIXED32_LIST", 31);
        EnumC10233Gru enumC10233GruA0033 = A00(enumC10238Grz2, enumC10226Grn3, "SFIXED64_LIST", 32);
        EnumC10233Gru enumC10233GruA0034 = A00(enumC10238Grz2, enumC10226Grn4, "SINT32_LIST", 33);
        EnumC10233Gru enumC10233GruA0035 = A00(enumC10238Grz2, enumC10226Grn3, "SINT64_LIST", 34);
        EnumC10238Grz enumC10238Grz3 = EnumC10238Grz.PACKED_VECTOR;
        EnumC10233Gru enumC10233GruA0036 = A00(enumC10238Grz3, enumC10226Grn, "DOUBLE_LIST_PACKED", 35);
        A01 = enumC10233GruA0036;
        EnumC10233Gru enumC10233GruA0037 = A00(enumC10238Grz3, enumC10226Grn2, "FLOAT_LIST_PACKED", 36);
        EnumC10233Gru enumC10233GruA0038 = A00(enumC10238Grz3, enumC10226Grn3, "INT64_LIST_PACKED", 37);
        EnumC10233Gru enumC10233GruA0039 = A00(enumC10238Grz3, enumC10226Grn3, "UINT64_LIST_PACKED", 38);
        EnumC10233Gru enumC10233GruA0040 = A00(enumC10238Grz3, enumC10226Grn4, "INT32_LIST_PACKED", 39);
        EnumC10233Gru enumC10233GruA0041 = A00(enumC10238Grz3, enumC10226Grn3, "FIXED64_LIST_PACKED", 40);
        EnumC10233Gru enumC10233GruA0042 = A00(enumC10238Grz3, enumC10226Grn4, "FIXED32_LIST_PACKED", 41);
        EnumC10233Gru enumC10233GruA0043 = A00(enumC10238Grz3, enumC10226Grn5, "BOOL_LIST_PACKED", 42);
        EnumC10233Gru enumC10233GruA0044 = A00(enumC10238Grz3, enumC10226Grn4, "UINT32_LIST_PACKED", 43);
        EnumC10233Gru enumC10233GruA0045 = A00(enumC10238Grz3, enumC10226Grn9, "ENUM_LIST_PACKED", 44);
        EnumC10233Gru enumC10233GruA0046 = A00(enumC10238Grz3, enumC10226Grn4, "SFIXED32_LIST_PACKED", 45);
        EnumC10233Gru enumC10233GruA0047 = A00(enumC10238Grz3, enumC10226Grn3, "SFIXED64_LIST_PACKED", 46);
        EnumC10233Gru enumC10233GruA0048 = A00(enumC10238Grz3, enumC10226Grn4, "SINT32_LIST_PACKED", 47);
        EnumC10233Gru enumC10233GruA0049 = A00(enumC10238Grz3, enumC10226Grn3, "SINT64_LIST_PACKED", 48);
        A02 = enumC10233GruA0049;
        EnumC10233Gru enumC10233GruA0050 = A00(enumC10238Grz2, enumC10226Grn7, "GROUP_LIST", 49);
        EnumC10233Gru enumC10233GruA0051 = A00(EnumC10238Grz.MAP, EnumC10226Grn.A0A, "MAP", 50);
        EnumC10233Gru[] enumC10233GruArr = new EnumC10233Gru[51];
        System.arraycopy(new EnumC10233Gru[]{enumC10233GruA00, enumC10233GruA002, enumC10233GruA003, enumC10233GruA004, enumC10233GruA005, enumC10233GruA006, enumC10233GruA007, enumC10233GruA008, enumC10233GruA009, enumC10233GruA0010, enumC10233GruA0011, enumC10233GruA0012, enumC10233GruA0013, enumC10233GruA0014, enumC10233GruA0015, enumC10233GruA0016, enumC10233GruA0017, enumC10233GruA0018, enumC10233GruA0019, enumC10233GruA0020, enumC10233GruA0021, enumC10233GruA0022, enumC10233GruA0023, enumC10233GruA0024, enumC10233GruA0025, enumC10233GruA0026, enumC10233GruA0027}, 0, enumC10233GruArr, 0, 27);
        AbstractC7609F5w.A1F(new EnumC10233Gru[]{enumC10233GruA0028, enumC10233GruA0029, enumC10233GruA0030, enumC10233GruA0031, enumC10233GruA0032, enumC10233GruA0033, enumC10233GruA0034, enumC10233GruA0035, enumC10233GruA0036, enumC10233GruA0037, enumC10233GruA0038, enumC10233GruA0039, enumC10233GruA0040, enumC10233GruA0041, enumC10233GruA0042, enumC10233GruA0043, enumC10233GruA0044, enumC10233GruA0045, enumC10233GruA0046, enumC10233GruA0047, enumC10233GruA0048, enumC10233GruA0049, enumC10233GruA0050, enumC10233GruA0051}, enumC10233GruArr);
        A00 = enumC10233GruArr;
        for (int i = 0; i < values().length; i++) {
        }
    }

    public static EnumC10233Gru A00(EnumC10238Grz enumC10238Grz, EnumC10226Grn enumC10226Grn, String str, int i) {
        return new EnumC10233Gru(enumC10238Grz, enumC10226Grn, str, i, i);
    }

    public static EnumC10233Gru[] values() {
        return (EnumC10233Gru[]) A00.clone();
    }

    public EnumC10233Gru(EnumC10238Grz $enum$name, EnumC10226Grn $enum$ordinal, String id, int collection, int javaType) {
        int iOrdinal;
        this.id = javaType;
        this.collection = $enum$name;
        this.javaType = $enum$ordinal;
        AbstractC10230Grr abstractC10230Grr = AbstractC10230Grr.$redex_init_class;
        int iOrdinal2 = $enum$name.ordinal();
        this.elementType = (iOrdinal2 == 3 || iOrdinal2 == 1) ? $enum$ordinal.boxedType : null;
        this.primitiveScalar = ($enum$name != EnumC10238Grz.SCALAR || (iOrdinal = $enum$ordinal.ordinal()) == 7 || iOrdinal == 9 || iOrdinal == 6) ? false : true;
    }
}
