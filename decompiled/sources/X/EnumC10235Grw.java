package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Grw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10235Grw {
    public static final /* synthetic */ EnumC10235Grw[] A00;
    public static final EnumC10235Grw A01;
    public static final EnumC10235Grw A02;
    public final EnumC10240Gs1 collection;
    public final Class<?> elementType;
    public final int id;
    public final EnumC10228Grp javaType;
    public final boolean primitiveScalar;

    static {
        EnumC10240Gs1 enumC10240Gs1 = EnumC10240Gs1.SCALAR;
        EnumC10228Grp enumC10228Grp = EnumC10228Grp.A03;
        EnumC10235Grw enumC10235GrwA00 = A00(enumC10240Gs1, enumC10228Grp, "DOUBLE", 0);
        EnumC10228Grp enumC10228Grp2 = EnumC10228Grp.A05;
        EnumC10235Grw enumC10235GrwA002 = A00(enumC10240Gs1, enumC10228Grp2, "FLOAT", 1);
        EnumC10228Grp enumC10228Grp3 = EnumC10228Grp.A07;
        EnumC10235Grw enumC10235GrwA003 = A00(enumC10240Gs1, enumC10228Grp3, "INT64", 2);
        EnumC10235Grw enumC10235GrwA004 = A00(enumC10240Gs1, enumC10228Grp3, "UINT64", 3);
        EnumC10228Grp enumC10228Grp4 = EnumC10228Grp.A06;
        EnumC10235Grw enumC10235GrwA005 = A00(enumC10240Gs1, enumC10228Grp4, "INT32", 4);
        EnumC10235Grw enumC10235GrwA006 = A00(enumC10240Gs1, enumC10228Grp3, "FIXED64", 5);
        EnumC10235Grw enumC10235GrwA007 = A00(enumC10240Gs1, enumC10228Grp4, "FIXED32", 6);
        EnumC10228Grp enumC10228Grp5 = EnumC10228Grp.A01;
        EnumC10235Grw enumC10235GrwA008 = A00(enumC10240Gs1, enumC10228Grp5, "BOOL", 7);
        EnumC10228Grp enumC10228Grp6 = EnumC10228Grp.A09;
        EnumC10235Grw enumC10235GrwA009 = A00(enumC10240Gs1, enumC10228Grp6, "STRING", 8);
        EnumC10228Grp enumC10228Grp7 = EnumC10228Grp.A08;
        EnumC10235Grw enumC10235GrwA0010 = A00(enumC10240Gs1, enumC10228Grp7, "MESSAGE", 9);
        EnumC10228Grp enumC10228Grp8 = EnumC10228Grp.A02;
        EnumC10235Grw enumC10235GrwA0011 = A00(enumC10240Gs1, enumC10228Grp8, "BYTES", 10);
        EnumC10235Grw enumC10235GrwA0012 = A00(enumC10240Gs1, enumC10228Grp4, "UINT32", 11);
        EnumC10228Grp enumC10228Grp9 = EnumC10228Grp.A04;
        EnumC10235Grw enumC10235GrwA0013 = A00(enumC10240Gs1, enumC10228Grp9, "ENUM", 12);
        EnumC10235Grw enumC10235GrwA0014 = A00(enumC10240Gs1, enumC10228Grp4, "SFIXED32", 13);
        EnumC10235Grw enumC10235GrwA0015 = A00(enumC10240Gs1, enumC10228Grp3, "SFIXED64", 14);
        EnumC10235Grw enumC10235GrwA0016 = A00(enumC10240Gs1, enumC10228Grp4, "SINT32", 15);
        EnumC10235Grw enumC10235GrwA0017 = A00(enumC10240Gs1, enumC10228Grp3, "SINT64", 16);
        EnumC10235Grw enumC10235GrwA0018 = A00(enumC10240Gs1, enumC10228Grp7, "GROUP", 17);
        EnumC10240Gs1 enumC10240Gs12 = EnumC10240Gs1.VECTOR;
        EnumC10235Grw enumC10235GrwA0019 = A00(enumC10240Gs12, enumC10228Grp, "DOUBLE_LIST", 18);
        EnumC10235Grw enumC10235GrwA0020 = A00(enumC10240Gs12, enumC10228Grp2, "FLOAT_LIST", 19);
        EnumC10235Grw enumC10235GrwA0021 = A00(enumC10240Gs12, enumC10228Grp3, "INT64_LIST", 20);
        EnumC10235Grw enumC10235GrwA0022 = A00(enumC10240Gs12, enumC10228Grp3, "UINT64_LIST", 21);
        EnumC10235Grw enumC10235GrwA0023 = A00(enumC10240Gs12, enumC10228Grp4, "INT32_LIST", 22);
        EnumC10235Grw enumC10235GrwA0024 = A00(enumC10240Gs12, enumC10228Grp3, "FIXED64_LIST", 23);
        EnumC10235Grw enumC10235GrwA0025 = A00(enumC10240Gs12, enumC10228Grp4, "FIXED32_LIST", 24);
        EnumC10235Grw enumC10235GrwA0026 = A00(enumC10240Gs12, enumC10228Grp5, "BOOL_LIST", 25);
        EnumC10235Grw enumC10235GrwA0027 = A00(enumC10240Gs12, enumC10228Grp6, "STRING_LIST", 26);
        EnumC10235Grw enumC10235GrwA0028 = A00(enumC10240Gs12, enumC10228Grp7, "MESSAGE_LIST", 27);
        EnumC10235Grw enumC10235GrwA0029 = A00(enumC10240Gs12, enumC10228Grp8, "BYTES_LIST", 28);
        EnumC10235Grw enumC10235GrwA0030 = A00(enumC10240Gs12, enumC10228Grp4, "UINT32_LIST", 29);
        EnumC10235Grw enumC10235GrwA0031 = A00(enumC10240Gs12, enumC10228Grp9, "ENUM_LIST", 30);
        EnumC10235Grw enumC10235GrwA0032 = A00(enumC10240Gs12, enumC10228Grp4, "SFIXED32_LIST", 31);
        EnumC10235Grw enumC10235GrwA0033 = A00(enumC10240Gs12, enumC10228Grp3, "SFIXED64_LIST", 32);
        EnumC10235Grw enumC10235GrwA0034 = A00(enumC10240Gs12, enumC10228Grp4, "SINT32_LIST", 33);
        EnumC10235Grw enumC10235GrwA0035 = A00(enumC10240Gs12, enumC10228Grp3, "SINT64_LIST", 34);
        EnumC10240Gs1 enumC10240Gs13 = EnumC10240Gs1.PACKED_VECTOR;
        EnumC10235Grw enumC10235GrwA0036 = A00(enumC10240Gs13, enumC10228Grp, "DOUBLE_LIST_PACKED", 35);
        A01 = enumC10235GrwA0036;
        EnumC10235Grw enumC10235GrwA0037 = A00(enumC10240Gs13, enumC10228Grp2, "FLOAT_LIST_PACKED", 36);
        EnumC10235Grw enumC10235GrwA0038 = A00(enumC10240Gs13, enumC10228Grp3, "INT64_LIST_PACKED", 37);
        EnumC10235Grw enumC10235GrwA0039 = A00(enumC10240Gs13, enumC10228Grp3, "UINT64_LIST_PACKED", 38);
        EnumC10235Grw enumC10235GrwA0040 = A00(enumC10240Gs13, enumC10228Grp4, "INT32_LIST_PACKED", 39);
        EnumC10235Grw enumC10235GrwA0041 = A00(enumC10240Gs13, enumC10228Grp3, "FIXED64_LIST_PACKED", 40);
        EnumC10235Grw enumC10235GrwA0042 = A00(enumC10240Gs13, enumC10228Grp4, "FIXED32_LIST_PACKED", 41);
        EnumC10235Grw enumC10235GrwA0043 = A00(enumC10240Gs13, enumC10228Grp5, "BOOL_LIST_PACKED", 42);
        EnumC10235Grw enumC10235GrwA0044 = A00(enumC10240Gs13, enumC10228Grp4, "UINT32_LIST_PACKED", 43);
        EnumC10235Grw enumC10235GrwA0045 = A00(enumC10240Gs13, enumC10228Grp9, "ENUM_LIST_PACKED", 44);
        EnumC10235Grw enumC10235GrwA0046 = A00(enumC10240Gs13, enumC10228Grp4, "SFIXED32_LIST_PACKED", 45);
        EnumC10235Grw enumC10235GrwA0047 = A00(enumC10240Gs13, enumC10228Grp3, "SFIXED64_LIST_PACKED", 46);
        EnumC10235Grw enumC10235GrwA0048 = A00(enumC10240Gs13, enumC10228Grp4, "SINT32_LIST_PACKED", 47);
        EnumC10235Grw enumC10235GrwA0049 = A00(enumC10240Gs13, enumC10228Grp3, "SINT64_LIST_PACKED", 48);
        A02 = enumC10235GrwA0049;
        EnumC10235Grw enumC10235GrwA0050 = A00(enumC10240Gs12, enumC10228Grp7, "GROUP_LIST", 49);
        EnumC10235Grw enumC10235GrwA0051 = A00(EnumC10240Gs1.MAP, EnumC10228Grp.A0A, "MAP", 50);
        EnumC10235Grw[] enumC10235GrwArr = new EnumC10235Grw[51];
        System.arraycopy(new EnumC10235Grw[]{enumC10235GrwA00, enumC10235GrwA002, enumC10235GrwA003, enumC10235GrwA004, enumC10235GrwA005, enumC10235GrwA006, enumC10235GrwA007, enumC10235GrwA008, enumC10235GrwA009, enumC10235GrwA0010, enumC10235GrwA0011, enumC10235GrwA0012, enumC10235GrwA0013, enumC10235GrwA0014, enumC10235GrwA0015, enumC10235GrwA0016, enumC10235GrwA0017, enumC10235GrwA0018, enumC10235GrwA0019, enumC10235GrwA0020, enumC10235GrwA0021, enumC10235GrwA0022, enumC10235GrwA0023, enumC10235GrwA0024, enumC10235GrwA0025, enumC10235GrwA0026, enumC10235GrwA0027}, 0, enumC10235GrwArr, 0, 27);
        AbstractC7609F5w.A1F(new EnumC10235Grw[]{enumC10235GrwA0028, enumC10235GrwA0029, enumC10235GrwA0030, enumC10235GrwA0031, enumC10235GrwA0032, enumC10235GrwA0033, enumC10235GrwA0034, enumC10235GrwA0035, enumC10235GrwA0036, enumC10235GrwA0037, enumC10235GrwA0038, enumC10235GrwA0039, enumC10235GrwA0040, enumC10235GrwA0041, enumC10235GrwA0042, enumC10235GrwA0043, enumC10235GrwA0044, enumC10235GrwA0045, enumC10235GrwA0046, enumC10235GrwA0047, enumC10235GrwA0048, enumC10235GrwA0049, enumC10235GrwA0050, enumC10235GrwA0051}, enumC10235GrwArr);
        A00 = enumC10235GrwArr;
        for (int i = 0; i < values().length; i++) {
        }
    }

    public static EnumC10235Grw A00(EnumC10240Gs1 enumC10240Gs1, EnumC10228Grp enumC10228Grp, String str, int i) {
        return new EnumC10235Grw(enumC10240Gs1, enumC10228Grp, str, i, i);
    }

    public static EnumC10235Grw[] values() {
        return (EnumC10235Grw[]) A00.clone();
    }

    public EnumC10235Grw(EnumC10240Gs1 enumC10240Gs1, EnumC10228Grp enumC10228Grp, String str, int i, int i2) {
        int iOrdinal;
        this.id = i2;
        this.collection = enumC10240Gs1;
        this.javaType = enumC10228Grp;
        AbstractC10229Grq abstractC10229Grq = AbstractC10229Grq.$redex_init_class;
        int iOrdinal2 = enumC10240Gs1.ordinal();
        this.elementType = (iOrdinal2 == 3 || iOrdinal2 == 1) ? enumC10228Grp.boxedType : null;
        this.primitiveScalar = (enumC10240Gs1 != EnumC10240Gs1.SCALAR || (iOrdinal = enumC10228Grp.ordinal()) == 7 || iOrdinal == 9 || iOrdinal == 6) ? false : true;
    }
}
