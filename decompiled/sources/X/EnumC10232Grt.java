package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Grt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10232Grt {
    public static final /* synthetic */ EnumC10232Grt[] A00;
    public static final EnumC10232Grt A01;
    public static final EnumC10232Grt A02;
    public final EnumC10237Gry collection;
    public final Class<?> elementType;
    public final int id;
    public final EnumC10224Grl javaType;
    public final boolean primitiveScalar;

    static {
        EnumC10237Gry enumC10237Gry = EnumC10237Gry.SCALAR;
        EnumC10224Grl enumC10224Grl = EnumC10224Grl.A03;
        EnumC10232Grt enumC10232GrtA00 = A00(enumC10237Gry, enumC10224Grl, "DOUBLE", 0);
        EnumC10224Grl enumC10224Grl2 = EnumC10224Grl.A05;
        EnumC10232Grt enumC10232GrtA002 = A00(enumC10237Gry, enumC10224Grl2, "FLOAT", 1);
        EnumC10224Grl enumC10224Grl3 = EnumC10224Grl.A07;
        EnumC10232Grt enumC10232GrtA003 = A00(enumC10237Gry, enumC10224Grl3, "INT64", 2);
        EnumC10232Grt enumC10232GrtA004 = A00(enumC10237Gry, enumC10224Grl3, "UINT64", 3);
        EnumC10224Grl enumC10224Grl4 = EnumC10224Grl.A06;
        EnumC10232Grt enumC10232GrtA005 = A00(enumC10237Gry, enumC10224Grl4, "INT32", 4);
        EnumC10232Grt enumC10232GrtA006 = A00(enumC10237Gry, enumC10224Grl3, "FIXED64", 5);
        EnumC10232Grt enumC10232GrtA007 = A00(enumC10237Gry, enumC10224Grl4, "FIXED32", 6);
        EnumC10224Grl enumC10224Grl5 = EnumC10224Grl.A01;
        EnumC10232Grt enumC10232GrtA008 = A00(enumC10237Gry, enumC10224Grl5, "BOOL", 7);
        EnumC10224Grl enumC10224Grl6 = EnumC10224Grl.A09;
        EnumC10232Grt enumC10232GrtA009 = A00(enumC10237Gry, enumC10224Grl6, "STRING", 8);
        EnumC10224Grl enumC10224Grl7 = EnumC10224Grl.A08;
        EnumC10232Grt enumC10232GrtA0010 = A00(enumC10237Gry, enumC10224Grl7, "MESSAGE", 9);
        EnumC10224Grl enumC10224Grl8 = EnumC10224Grl.A02;
        EnumC10232Grt enumC10232GrtA0011 = A00(enumC10237Gry, enumC10224Grl8, "BYTES", 10);
        EnumC10232Grt enumC10232GrtA0012 = A00(enumC10237Gry, enumC10224Grl4, "UINT32", 11);
        EnumC10224Grl enumC10224Grl9 = EnumC10224Grl.A04;
        EnumC10232Grt enumC10232GrtA0013 = A00(enumC10237Gry, enumC10224Grl9, "ENUM", 12);
        EnumC10232Grt enumC10232GrtA0014 = A00(enumC10237Gry, enumC10224Grl4, "SFIXED32", 13);
        EnumC10232Grt enumC10232GrtA0015 = A00(enumC10237Gry, enumC10224Grl3, "SFIXED64", 14);
        EnumC10232Grt enumC10232GrtA0016 = A00(enumC10237Gry, enumC10224Grl4, "SINT32", 15);
        EnumC10232Grt enumC10232GrtA0017 = A00(enumC10237Gry, enumC10224Grl3, "SINT64", 16);
        EnumC10232Grt enumC10232GrtA0018 = A00(enumC10237Gry, enumC10224Grl7, "GROUP", 17);
        EnumC10237Gry enumC10237Gry2 = EnumC10237Gry.VECTOR;
        EnumC10232Grt enumC10232GrtA0019 = A00(enumC10237Gry2, enumC10224Grl, "DOUBLE_LIST", 18);
        EnumC10232Grt enumC10232GrtA0020 = A00(enumC10237Gry2, enumC10224Grl2, "FLOAT_LIST", 19);
        EnumC10232Grt enumC10232GrtA0021 = A00(enumC10237Gry2, enumC10224Grl3, "INT64_LIST", 20);
        EnumC10232Grt enumC10232GrtA0022 = A00(enumC10237Gry2, enumC10224Grl3, "UINT64_LIST", 21);
        EnumC10232Grt enumC10232GrtA0023 = A00(enumC10237Gry2, enumC10224Grl4, "INT32_LIST", 22);
        EnumC10232Grt enumC10232GrtA0024 = A00(enumC10237Gry2, enumC10224Grl3, "FIXED64_LIST", 23);
        EnumC10232Grt enumC10232GrtA0025 = A00(enumC10237Gry2, enumC10224Grl4, "FIXED32_LIST", 24);
        EnumC10232Grt enumC10232GrtA0026 = A00(enumC10237Gry2, enumC10224Grl5, "BOOL_LIST", 25);
        EnumC10232Grt enumC10232GrtA0027 = A00(enumC10237Gry2, enumC10224Grl6, "STRING_LIST", 26);
        EnumC10232Grt enumC10232GrtA0028 = A00(enumC10237Gry2, enumC10224Grl7, "MESSAGE_LIST", 27);
        EnumC10232Grt enumC10232GrtA0029 = A00(enumC10237Gry2, enumC10224Grl8, "BYTES_LIST", 28);
        EnumC10232Grt enumC10232GrtA0030 = A00(enumC10237Gry2, enumC10224Grl4, "UINT32_LIST", 29);
        EnumC10232Grt enumC10232GrtA0031 = A00(enumC10237Gry2, enumC10224Grl9, "ENUM_LIST", 30);
        EnumC10232Grt enumC10232GrtA0032 = A00(enumC10237Gry2, enumC10224Grl4, "SFIXED32_LIST", 31);
        EnumC10232Grt enumC10232GrtA0033 = A00(enumC10237Gry2, enumC10224Grl3, "SFIXED64_LIST", 32);
        EnumC10232Grt enumC10232GrtA0034 = A00(enumC10237Gry2, enumC10224Grl4, "SINT32_LIST", 33);
        EnumC10232Grt enumC10232GrtA0035 = A00(enumC10237Gry2, enumC10224Grl3, "SINT64_LIST", 34);
        EnumC10237Gry enumC10237Gry3 = EnumC10237Gry.PACKED_VECTOR;
        EnumC10232Grt enumC10232GrtA0036 = A00(enumC10237Gry3, enumC10224Grl, "DOUBLE_LIST_PACKED", 35);
        A01 = enumC10232GrtA0036;
        EnumC10232Grt enumC10232GrtA0037 = A00(enumC10237Gry3, enumC10224Grl2, "FLOAT_LIST_PACKED", 36);
        EnumC10232Grt enumC10232GrtA0038 = A00(enumC10237Gry3, enumC10224Grl3, "INT64_LIST_PACKED", 37);
        EnumC10232Grt enumC10232GrtA0039 = A00(enumC10237Gry3, enumC10224Grl3, "UINT64_LIST_PACKED", 38);
        EnumC10232Grt enumC10232GrtA0040 = A00(enumC10237Gry3, enumC10224Grl4, "INT32_LIST_PACKED", 39);
        EnumC10232Grt enumC10232GrtA0041 = A00(enumC10237Gry3, enumC10224Grl3, "FIXED64_LIST_PACKED", 40);
        EnumC10232Grt enumC10232GrtA0042 = A00(enumC10237Gry3, enumC10224Grl4, "FIXED32_LIST_PACKED", 41);
        EnumC10232Grt enumC10232GrtA0043 = A00(enumC10237Gry3, enumC10224Grl5, "BOOL_LIST_PACKED", 42);
        EnumC10232Grt enumC10232GrtA0044 = A00(enumC10237Gry3, enumC10224Grl4, "UINT32_LIST_PACKED", 43);
        EnumC10232Grt enumC10232GrtA0045 = A00(enumC10237Gry3, enumC10224Grl9, "ENUM_LIST_PACKED", 44);
        EnumC10232Grt enumC10232GrtA0046 = A00(enumC10237Gry3, enumC10224Grl4, "SFIXED32_LIST_PACKED", 45);
        EnumC10232Grt enumC10232GrtA0047 = A00(enumC10237Gry3, enumC10224Grl3, "SFIXED64_LIST_PACKED", 46);
        EnumC10232Grt enumC10232GrtA0048 = A00(enumC10237Gry3, enumC10224Grl4, "SINT32_LIST_PACKED", 47);
        EnumC10232Grt enumC10232GrtA0049 = A00(enumC10237Gry3, enumC10224Grl3, "SINT64_LIST_PACKED", 48);
        A02 = enumC10232GrtA0049;
        EnumC10232Grt enumC10232GrtA0050 = A00(enumC10237Gry2, enumC10224Grl7, "GROUP_LIST", 49);
        EnumC10232Grt enumC10232GrtA0051 = A00(EnumC10237Gry.MAP, EnumC10224Grl.A0A, "MAP", 50);
        EnumC10232Grt[] enumC10232GrtArr = new EnumC10232Grt[51];
        System.arraycopy(new EnumC10232Grt[]{enumC10232GrtA00, enumC10232GrtA002, enumC10232GrtA003, enumC10232GrtA004, enumC10232GrtA005, enumC10232GrtA006, enumC10232GrtA007, enumC10232GrtA008, enumC10232GrtA009, enumC10232GrtA0010, enumC10232GrtA0011, enumC10232GrtA0012, enumC10232GrtA0013, enumC10232GrtA0014, enumC10232GrtA0015, enumC10232GrtA0016, enumC10232GrtA0017, enumC10232GrtA0018, enumC10232GrtA0019, enumC10232GrtA0020, enumC10232GrtA0021, enumC10232GrtA0022, enumC10232GrtA0023, enumC10232GrtA0024, enumC10232GrtA0025, enumC10232GrtA0026, enumC10232GrtA0027}, 0, enumC10232GrtArr, 0, 27);
        AbstractC7609F5w.A1F(new EnumC10232Grt[]{enumC10232GrtA0028, enumC10232GrtA0029, enumC10232GrtA0030, enumC10232GrtA0031, enumC10232GrtA0032, enumC10232GrtA0033, enumC10232GrtA0034, enumC10232GrtA0035, enumC10232GrtA0036, enumC10232GrtA0037, enumC10232GrtA0038, enumC10232GrtA0039, enumC10232GrtA0040, enumC10232GrtA0041, enumC10232GrtA0042, enumC10232GrtA0043, enumC10232GrtA0044, enumC10232GrtA0045, enumC10232GrtA0046, enumC10232GrtA0047, enumC10232GrtA0048, enumC10232GrtA0049, enumC10232GrtA0050, enumC10232GrtA0051}, enumC10232GrtArr);
        A00 = enumC10232GrtArr;
        for (int i = 0; i < values().length; i++) {
        }
    }

    public static EnumC10232Grt A00(EnumC10237Gry enumC10237Gry, EnumC10224Grl enumC10224Grl, String str, int i) {
        return new EnumC10232Grt(enumC10237Gry, enumC10224Grl, str, i, i);
    }

    public static EnumC10232Grt[] values() {
        return (EnumC10232Grt[]) A00.clone();
    }

    public EnumC10232Grt(EnumC10237Gry $enum$name, EnumC10224Grl $enum$ordinal, String id, int collection, int javaType) {
        int iOrdinal;
        this.id = javaType;
        this.collection = $enum$name;
        this.javaType = $enum$ordinal;
        AbstractC10225Grm abstractC10225Grm = AbstractC10225Grm.$redex_init_class;
        int iOrdinal2 = $enum$name.ordinal();
        this.elementType = (iOrdinal2 == 3 || iOrdinal2 == 1) ? $enum$ordinal.boxedType : null;
        this.primitiveScalar = ($enum$name != EnumC10237Gry.SCALAR || (iOrdinal = $enum$ordinal.ordinal()) == 7 || iOrdinal == 9 || iOrdinal == 6) ? false : true;
    }
}
