package X;

/* renamed from: X.Gmp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC9975Gmp implements InterfaceC10179Gqp {
    WRAP_ROOT_VALUE(false),
    INDENT_OUTPUT(false),
    FAIL_ON_EMPTY_BEANS(true),
    FAIL_ON_SELF_REFERENCES(true),
    WRAP_EXCEPTIONS(true),
    FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS(true),
    WRITE_SELF_REFERENCES_AS_NULL(false),
    CLOSE_CLOSEABLE(false),
    FLUSH_AFTER_WRITE_VALUE(true),
    WRITE_DATES_AS_TIMESTAMPS(true),
    WRITE_DATE_KEYS_AS_TIMESTAMPS(false),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_DATES_WITH_ZONE_ID(false),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_DATES_WITH_CONTEXT_TIME_ZONE(true),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_DURATIONS_AS_TIMESTAMPS(true),
    WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS(false),
    WRITE_ENUMS_USING_TO_STRING(false),
    WRITE_ENUMS_USING_INDEX(false),
    WRITE_ENUM_KEYS_USING_INDEX(false),
    WRITE_NULL_MAP_VALUES(true),
    WRITE_EMPTY_JSON_ARRAYS(true),
    WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS(true),
    ORDER_MAP_ENTRIES_BY_KEYS(false),
    /* JADX INFO: Fake field, exist only in values array */
    EAGER_SERIALIZER_FETCH(true),
    USE_EQUALITY_FOR_OBJECT_ID(false);

    public final boolean _defaultState;
    public final int _mask = AbstractC7609F5w.A0F(this);

    @Override // X.InterfaceC10179Gqp
    public final boolean AA2() {
        return this._defaultState;
    }

    @Override // X.InterfaceC10179Gqp
    public final int AHO() {
        return this._mask;
    }

    EnumC9975Gmp(boolean z) {
        this._defaultState = z;
    }
}
