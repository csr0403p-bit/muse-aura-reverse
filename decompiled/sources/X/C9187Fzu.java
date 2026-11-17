package X;

/* renamed from: X.Fzu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9187Fzu extends GF2 implements HrP {
    public static final int BOOLEAN_VAL_FIELD_NUMBER = 5;
    public static final C9187Fzu DEFAULT_INSTANCE;
    public static final int DOUBLE_VAL_FIELD_NUMBER = 2;
    public static final int ENUM_VAL_FIELD_NUMBER = 4;
    public static final int LONG_VAL_FIELD_NUMBER = 1;
    public static volatile G0P<C9187Fzu> PARSER = null;
    public static final int STRING_VAL_FIELD_NUMBER = 3;
    public int valueCase_ = 0;
    public Object value_;

    static {
        C9187Fzu c9187Fzu = new C9187Fzu();
        DEFAULT_INSTANCE = c9187Fzu;
        GF2.A02(c9187Fzu, C9187Fzu.class);
    }

    public final double A08() {
        if (this.valueCase_ == 2) {
            return BV6.A00(this.value_);
        }
        return 0.0d;
    }
}
