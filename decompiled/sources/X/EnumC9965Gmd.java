package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Gmd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC9965Gmd implements InterfaceC10179Gqp {
    public static final /* synthetic */ EnumC9965Gmd[] A00;
    public static final EnumC9965Gmd A01;
    public static final EnumC9965Gmd A02;
    public static final EnumC9965Gmd A03;
    public static final EnumC9965Gmd A04;
    public static final EnumC9965Gmd A05;
    public static final EnumC9965Gmd A06;
    public static final EnumC9965Gmd A07;
    public static final EnumC9965Gmd A08;
    public static final EnumC9965Gmd A09;
    public static final EnumC9965Gmd A0A;
    public static final EnumC9965Gmd A0B;
    public static final EnumC9965Gmd A0C;
    public static final EnumC9965Gmd A0D;
    public static final EnumC9965Gmd A0E;
    public static final EnumC9965Gmd A0F;
    public static final EnumC9965Gmd A0G;
    public static final EnumC9965Gmd A0H;
    public static final EnumC9965Gmd A0I;
    public static final EnumC9965Gmd A0J;
    public static final EnumC9965Gmd A0K;
    public static final EnumC9965Gmd A0L;
    public static final EnumC9965Gmd A0M;
    public static final EnumC9965Gmd A0N;
    public static final EnumC9965Gmd A0O;
    public static final EnumC9965Gmd A0P;
    public static final EnumC9965Gmd A0Q;
    public static final EnumC9965Gmd A0R;
    public final boolean _defaultState;
    public final int _mask = AbstractC7609F5w.A0F(this);

    static {
        EnumC9965Gmd enumC9965Gmd = new EnumC9965Gmd("USE_BIG_DECIMAL_FOR_FLOATS", 0, false);
        A0N = enumC9965Gmd;
        EnumC9965Gmd enumC9965Gmd2 = new EnumC9965Gmd("USE_BIG_INTEGER_FOR_INTS", 1, false);
        A0O = enumC9965Gmd2;
        EnumC9965Gmd enumC9965Gmd3 = new EnumC9965Gmd("USE_LONG_FOR_INTS", 2, false);
        A0Q = enumC9965Gmd3;
        EnumC9965Gmd enumC9965Gmd4 = new EnumC9965Gmd("USE_JAVA_ARRAY_FOR_JSON_ARRAY", 3, false);
        A0P = enumC9965Gmd4;
        EnumC9965Gmd enumC9965Gmd5 = new EnumC9965Gmd("FAIL_ON_UNKNOWN_PROPERTIES", 4, true);
        A0G = enumC9965Gmd5;
        EnumC9965Gmd enumC9965Gmd6 = new EnumC9965Gmd("FAIL_ON_NULL_FOR_PRIMITIVES", 5, false);
        A0B = enumC9965Gmd6;
        EnumC9965Gmd enumC9965Gmd7 = new EnumC9965Gmd("FAIL_ON_NUMBERS_FOR_ENUMS", 6, false);
        A0C = enumC9965Gmd7;
        EnumC9965Gmd enumC9965Gmd8 = new EnumC9965Gmd("FAIL_ON_INVALID_SUBTYPE", 7, true);
        A07 = enumC9965Gmd8;
        EnumC9965Gmd enumC9965Gmd9 = new EnumC9965Gmd("FAIL_ON_READING_DUP_TREE_KEY", 8, false);
        A0D = enumC9965Gmd9;
        EnumC9965Gmd enumC9965Gmd10 = new EnumC9965Gmd("FAIL_ON_IGNORED_PROPERTIES", 9, false);
        A06 = enumC9965Gmd10;
        EnumC9965Gmd enumC9965Gmd11 = new EnumC9965Gmd("FAIL_ON_UNRESOLVED_OBJECT_IDS", 10, true);
        A0H = enumC9965Gmd11;
        EnumC9965Gmd enumC9965Gmd12 = new EnumC9965Gmd("FAIL_ON_MISSING_CREATOR_PROPERTIES", 11, false);
        A08 = enumC9965Gmd12;
        EnumC9965Gmd enumC9965Gmd13 = new EnumC9965Gmd("FAIL_ON_NULL_CREATOR_PROPERTIES", 12, false);
        A0A = enumC9965Gmd13;
        EnumC9965Gmd enumC9965Gmd14 = new EnumC9965Gmd("FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY", 13, true);
        A09 = enumC9965Gmd14;
        EnumC9965Gmd enumC9965Gmd15 = new EnumC9965Gmd("FAIL_ON_TRAILING_TOKENS", 14, false);
        A0E = enumC9965Gmd15;
        EnumC9965Gmd enumC9965Gmd16 = new EnumC9965Gmd("WRAP_EXCEPTIONS", 15, true);
        A0R = enumC9965Gmd16;
        EnumC9965Gmd enumC9965Gmd17 = new EnumC9965Gmd("FAIL_ON_UNEXPECTED_VIEW_PROPERTIES", 16, false);
        A0F = enumC9965Gmd17;
        EnumC9965Gmd enumC9965Gmd18 = new EnumC9965Gmd("ACCEPT_SINGLE_VALUE_AS_ARRAY", 17, false);
        A04 = enumC9965Gmd18;
        EnumC9965Gmd enumC9965Gmd19 = new EnumC9965Gmd("UNWRAP_SINGLE_VALUE_ARRAYS", 18, false);
        A0M = enumC9965Gmd19;
        EnumC9965Gmd enumC9965Gmd20 = new EnumC9965Gmd("UNWRAP_ROOT_VALUE", 19, false);
        A0L = enumC9965Gmd20;
        EnumC9965Gmd enumC9965Gmd21 = new EnumC9965Gmd("ACCEPT_EMPTY_STRING_AS_NULL_OBJECT", 20, false);
        A02 = enumC9965Gmd21;
        EnumC9965Gmd enumC9965Gmd22 = new EnumC9965Gmd("ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT", 21, false);
        A01 = enumC9965Gmd22;
        EnumC9965Gmd enumC9965Gmd23 = new EnumC9965Gmd("ACCEPT_FLOAT_AS_INT", 22, true);
        A03 = enumC9965Gmd23;
        EnumC9965Gmd enumC9965Gmd24 = new EnumC9965Gmd("READ_ENUMS_USING_TO_STRING", 23, false);
        A0I = enumC9965Gmd24;
        EnumC9965Gmd enumC9965Gmd25 = new EnumC9965Gmd("READ_UNKNOWN_ENUM_VALUES_AS_NULL", 24, false);
        A0J = enumC9965Gmd25;
        EnumC9965Gmd enumC9965Gmd26 = new EnumC9965Gmd("READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE", 25, false);
        A0K = enumC9965Gmd26;
        EnumC9965Gmd enumC9965Gmd27 = new EnumC9965Gmd("READ_DATE_TIMESTAMPS_AS_NANOSECONDS", 26, true);
        EnumC9965Gmd enumC9965Gmd28 = new EnumC9965Gmd("ADJUST_DATES_TO_CONTEXT_TIME_ZONE", 27, true);
        EnumC9965Gmd enumC9965Gmd29 = new EnumC9965Gmd("EAGER_DESERIALIZER_FETCH", 28, true);
        A05 = enumC9965Gmd29;
        EnumC9965Gmd[] enumC9965GmdArr = new EnumC9965Gmd[29];
        System.arraycopy(new EnumC9965Gmd[]{enumC9965Gmd, enumC9965Gmd2, enumC9965Gmd3, enumC9965Gmd4, enumC9965Gmd5, enumC9965Gmd6, enumC9965Gmd7, enumC9965Gmd8, enumC9965Gmd9, enumC9965Gmd10, enumC9965Gmd11, enumC9965Gmd12, enumC9965Gmd13, enumC9965Gmd14, enumC9965Gmd15, enumC9965Gmd16, enumC9965Gmd17, enumC9965Gmd18, enumC9965Gmd19, enumC9965Gmd20, enumC9965Gmd21, enumC9965Gmd22, enumC9965Gmd23, enumC9965Gmd24, enumC9965Gmd25, enumC9965Gmd26, enumC9965Gmd27}, 0, enumC9965GmdArr, 0, 27);
        System.arraycopy(new EnumC9965Gmd[]{enumC9965Gmd28, enumC9965Gmd29}, 0, enumC9965GmdArr, 27, 2);
        A00 = enumC9965GmdArr;
    }

    public static EnumC9965Gmd valueOf(String str) {
        return (EnumC9965Gmd) Enum.valueOf(EnumC9965Gmd.class, str);
    }

    public static EnumC9965Gmd[] values() {
        return (EnumC9965Gmd[]) A00.clone();
    }

    @Override // X.InterfaceC10179Gqp
    public final boolean AA2() {
        return this._defaultState;
    }

    @Override // X.InterfaceC10179Gqp
    public final int AHO() {
        return this._mask;
    }

    public EnumC9965Gmd(String str, int i, boolean z) {
        this._defaultState = z;
    }
}
