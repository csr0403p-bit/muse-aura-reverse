package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Grv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10234Grv {
    public static final /* synthetic */ EnumC10234Grv[] A00;
    public static final EnumC10234Grv A01;
    public static final EnumC10234Grv A02;
    public final EnumC10239Gs0 collection;
    public final Class<?> elementType;
    public final int id;
    public final EnumC10227Gro javaType;
    public final boolean primitiveScalar;

    static {
        EnumC10239Gs0 enumC10239Gs0 = EnumC10239Gs0.SCALAR;
        EnumC10227Gro enumC10227Gro = EnumC10227Gro.A03;
        EnumC10234Grv enumC10234GrvA00 = A00(enumC10239Gs0, enumC10227Gro, "DOUBLE", 0);
        EnumC10227Gro enumC10227Gro2 = EnumC10227Gro.A05;
        EnumC10234Grv enumC10234GrvA002 = A00(enumC10239Gs0, enumC10227Gro2, "FLOAT", 1);
        EnumC10227Gro enumC10227Gro3 = EnumC10227Gro.A07;
        EnumC10234Grv enumC10234GrvA003 = A00(enumC10239Gs0, enumC10227Gro3, "INT64", 2);
        EnumC10234Grv enumC10234GrvA004 = A00(enumC10239Gs0, enumC10227Gro3, "UINT64", 3);
        EnumC10227Gro enumC10227Gro4 = EnumC10227Gro.A06;
        EnumC10234Grv enumC10234GrvA005 = A00(enumC10239Gs0, enumC10227Gro4, "INT32", 4);
        EnumC10234Grv enumC10234GrvA006 = A00(enumC10239Gs0, enumC10227Gro3, "FIXED64", 5);
        EnumC10234Grv enumC10234GrvA007 = A00(enumC10239Gs0, enumC10227Gro4, "FIXED32", 6);
        EnumC10227Gro enumC10227Gro5 = EnumC10227Gro.A01;
        EnumC10234Grv enumC10234GrvA008 = A00(enumC10239Gs0, enumC10227Gro5, "BOOL", 7);
        EnumC10227Gro enumC10227Gro6 = EnumC10227Gro.A09;
        EnumC10234Grv enumC10234GrvA009 = A00(enumC10239Gs0, enumC10227Gro6, "STRING", 8);
        EnumC10227Gro enumC10227Gro7 = EnumC10227Gro.A08;
        EnumC10234Grv enumC10234GrvA0010 = A00(enumC10239Gs0, enumC10227Gro7, "MESSAGE", 9);
        EnumC10227Gro enumC10227Gro8 = EnumC10227Gro.A02;
        EnumC10234Grv enumC10234GrvA0011 = A00(enumC10239Gs0, enumC10227Gro8, "BYTES", 10);
        EnumC10234Grv enumC10234GrvA0012 = A00(enumC10239Gs0, enumC10227Gro4, "UINT32", 11);
        EnumC10227Gro enumC10227Gro9 = EnumC10227Gro.A04;
        EnumC10234Grv enumC10234GrvA0013 = A00(enumC10239Gs0, enumC10227Gro9, "ENUM", 12);
        EnumC10234Grv enumC10234GrvA0014 = A00(enumC10239Gs0, enumC10227Gro4, "SFIXED32", 13);
        EnumC10234Grv enumC10234GrvA0015 = A00(enumC10239Gs0, enumC10227Gro3, "SFIXED64", 14);
        EnumC10234Grv enumC10234GrvA0016 = A00(enumC10239Gs0, enumC10227Gro4, "SINT32", 15);
        EnumC10234Grv enumC10234GrvA0017 = A00(enumC10239Gs0, enumC10227Gro3, "SINT64", 16);
        EnumC10234Grv enumC10234GrvA0018 = A00(enumC10239Gs0, enumC10227Gro7, "GROUP", 17);
        EnumC10239Gs0 enumC10239Gs02 = EnumC10239Gs0.VECTOR;
        EnumC10234Grv enumC10234GrvA0019 = A00(enumC10239Gs02, enumC10227Gro, "DOUBLE_LIST", 18);
        EnumC10234Grv enumC10234GrvA0020 = A00(enumC10239Gs02, enumC10227Gro2, "FLOAT_LIST", 19);
        EnumC10234Grv enumC10234GrvA0021 = A00(enumC10239Gs02, enumC10227Gro3, "INT64_LIST", 20);
        EnumC10234Grv enumC10234GrvA0022 = A00(enumC10239Gs02, enumC10227Gro3, "UINT64_LIST", 21);
        EnumC10234Grv enumC10234GrvA0023 = A00(enumC10239Gs02, enumC10227Gro4, "INT32_LIST", 22);
        EnumC10234Grv enumC10234GrvA0024 = A00(enumC10239Gs02, enumC10227Gro3, "FIXED64_LIST", 23);
        EnumC10234Grv enumC10234GrvA0025 = A00(enumC10239Gs02, enumC10227Gro4, "FIXED32_LIST", 24);
        EnumC10234Grv enumC10234GrvA0026 = A00(enumC10239Gs02, enumC10227Gro5, "BOOL_LIST", 25);
        EnumC10234Grv enumC10234GrvA0027 = A00(enumC10239Gs02, enumC10227Gro6, "STRING_LIST", 26);
        EnumC10234Grv enumC10234GrvA0028 = A00(enumC10239Gs02, enumC10227Gro7, "MESSAGE_LIST", 27);
        EnumC10234Grv enumC10234GrvA0029 = A00(enumC10239Gs02, enumC10227Gro8, "BYTES_LIST", 28);
        EnumC10234Grv enumC10234GrvA0030 = A00(enumC10239Gs02, enumC10227Gro4, "UINT32_LIST", 29);
        EnumC10234Grv enumC10234GrvA0031 = A00(enumC10239Gs02, enumC10227Gro9, "ENUM_LIST", 30);
        EnumC10234Grv enumC10234GrvA0032 = A00(enumC10239Gs02, enumC10227Gro4, "SFIXED32_LIST", 31);
        EnumC10234Grv enumC10234GrvA0033 = A00(enumC10239Gs02, enumC10227Gro3, "SFIXED64_LIST", 32);
        EnumC10234Grv enumC10234GrvA0034 = A00(enumC10239Gs02, enumC10227Gro4, "SINT32_LIST", 33);
        EnumC10234Grv enumC10234GrvA0035 = A00(enumC10239Gs02, enumC10227Gro3, "SINT64_LIST", 34);
        EnumC10239Gs0 enumC10239Gs03 = EnumC10239Gs0.PACKED_VECTOR;
        EnumC10234Grv enumC10234GrvA0036 = A00(enumC10239Gs03, enumC10227Gro, "DOUBLE_LIST_PACKED", 35);
        A01 = enumC10234GrvA0036;
        EnumC10234Grv enumC10234GrvA0037 = A00(enumC10239Gs03, enumC10227Gro2, "FLOAT_LIST_PACKED", 36);
        EnumC10234Grv enumC10234GrvA0038 = A00(enumC10239Gs03, enumC10227Gro3, "INT64_LIST_PACKED", 37);
        EnumC10234Grv enumC10234GrvA0039 = A00(enumC10239Gs03, enumC10227Gro3, "UINT64_LIST_PACKED", 38);
        EnumC10234Grv enumC10234GrvA0040 = A00(enumC10239Gs03, enumC10227Gro4, "INT32_LIST_PACKED", 39);
        EnumC10234Grv enumC10234GrvA0041 = A00(enumC10239Gs03, enumC10227Gro3, "FIXED64_LIST_PACKED", 40);
        EnumC10234Grv enumC10234GrvA0042 = A00(enumC10239Gs03, enumC10227Gro4, "FIXED32_LIST_PACKED", 41);
        EnumC10234Grv enumC10234GrvA0043 = A00(enumC10239Gs03, enumC10227Gro5, "BOOL_LIST_PACKED", 42);
        EnumC10234Grv enumC10234GrvA0044 = A00(enumC10239Gs03, enumC10227Gro4, "UINT32_LIST_PACKED", 43);
        EnumC10234Grv enumC10234GrvA0045 = A00(enumC10239Gs03, enumC10227Gro9, "ENUM_LIST_PACKED", 44);
        EnumC10234Grv enumC10234GrvA0046 = A00(enumC10239Gs03, enumC10227Gro4, "SFIXED32_LIST_PACKED", 45);
        EnumC10234Grv enumC10234GrvA0047 = A00(enumC10239Gs03, enumC10227Gro3, "SFIXED64_LIST_PACKED", 46);
        EnumC10234Grv enumC10234GrvA0048 = A00(enumC10239Gs03, enumC10227Gro4, "SINT32_LIST_PACKED", 47);
        EnumC10234Grv enumC10234GrvA0049 = A00(enumC10239Gs03, enumC10227Gro3, "SINT64_LIST_PACKED", 48);
        A02 = enumC10234GrvA0049;
        EnumC10234Grv enumC10234GrvA0050 = A00(enumC10239Gs02, enumC10227Gro7, "GROUP_LIST", 49);
        EnumC10234Grv enumC10234GrvA0051 = A00(EnumC10239Gs0.MAP, EnumC10227Gro.A0A, "MAP", 50);
        EnumC10234Grv[] enumC10234GrvArr = new EnumC10234Grv[51];
        BV5.A1U(new EnumC10234Grv[]{enumC10234GrvA00, enumC10234GrvA002, enumC10234GrvA003, enumC10234GrvA004, enumC10234GrvA005, enumC10234GrvA006, enumC10234GrvA007, enumC10234GrvA008, enumC10234GrvA009, enumC10234GrvA0010, enumC10234GrvA0011, enumC10234GrvA0012, enumC10234GrvA0013, enumC10234GrvA0014, enumC10234GrvA0015, enumC10234GrvA0016, enumC10234GrvA0017, enumC10234GrvA0018, enumC10234GrvA0019, enumC10234GrvA0020, enumC10234GrvA0021, enumC10234GrvA0022, enumC10234GrvA0023, enumC10234GrvA0024, enumC10234GrvA0025, enumC10234GrvA0026, enumC10234GrvA0027}, enumC10234GrvArr);
        AbstractC7609F5w.A1F(new EnumC10234Grv[]{enumC10234GrvA0028, enumC10234GrvA0029, enumC10234GrvA0030, enumC10234GrvA0031, enumC10234GrvA0032, enumC10234GrvA0033, enumC10234GrvA0034, enumC10234GrvA0035, enumC10234GrvA0036, enumC10234GrvA0037, enumC10234GrvA0038, enumC10234GrvA0039, enumC10234GrvA0040, enumC10234GrvA0041, enumC10234GrvA0042, enumC10234GrvA0043, enumC10234GrvA0044, enumC10234GrvA0045, enumC10234GrvA0046, enumC10234GrvA0047, enumC10234GrvA0048, enumC10234GrvA0049, enumC10234GrvA0050, enumC10234GrvA0051}, enumC10234GrvArr);
        A00 = enumC10234GrvArr;
        for (int i = 0; i < values().length; i++) {
        }
    }

    public static EnumC10234Grv A00(EnumC10239Gs0 enumC10239Gs0, EnumC10227Gro enumC10227Gro, String str, int i) {
        return new EnumC10234Grv(enumC10239Gs0, enumC10227Gro, str, i, i);
    }

    public static EnumC10234Grv[] values() {
        return (EnumC10234Grv[]) A00.clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EnumC10234Grv(X.EnumC10239Gs0 r6, X.EnumC10227Gro r7, java.lang.String r8, int r9, int r10) {
        /*
            r5 = this;
            r5.<init>(r8, r9)
            r5.id = r10
            r5.collection = r6
            r5.javaType = r7
            int r1 = r6.ordinal()
            r0 = 3
            r4 = 6
            r3 = 1
            r2 = 7
            if (r1 == r3) goto L2f
            if (r1 == r0) goto L2f
            r0 = 0
        L16:
            r5.elementType = r0
            X.Gs0 r0 = X.EnumC10239Gs0.SCALAR
            if (r6 != r0) goto L2d
            X.Grs r0 = X.AbstractC10231Grs.$redex_init_class
            int r1 = r7.ordinal()
            if (r1 == r2) goto L2d
            r0 = 9
            if (r1 == r0) goto L2d
            if (r1 == r4) goto L2d
        L2a:
            r5.primitiveScalar = r3
            return
        L2d:
            r3 = 0
            goto L2a
        L2f:
            java.lang.Class<?> r0 = r7.boxedType
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EnumC10234Grv.<init>(X.Gs0, X.Gro, java.lang.String, int, int):void");
    }
}
