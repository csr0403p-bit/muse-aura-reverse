package X;

/* renamed from: X.GnS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC9998GnS {
    AUTO_CLOSE_TARGET(true),
    AUTO_CLOSE_JSON_CONTENT(true),
    FLUSH_PASSED_TO_STREAM(true),
    QUOTE_FIELD_NAMES(true),
    QUOTE_NON_NUMERIC_NUMBERS(true),
    ESCAPE_NON_ASCII(false),
    WRITE_NUMBERS_AS_STRINGS(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    STRICT_DUPLICATE_DETECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    IGNORE_UNKNOWN(false),
    USE_FAST_DOUBLE_WRITER(false),
    WRITE_HEX_UPPER_CASE(true),
    ESCAPE_FORWARD_SLASHES(false),
    COMBINE_UNICODE_SURROGATES_IN_UTF8(false);

    public final boolean _defaultState;
    public final int _mask = AbstractC7609F5w.A0F(this);

    EnumC9998GnS(boolean z) {
        this._defaultState = z;
    }
}
