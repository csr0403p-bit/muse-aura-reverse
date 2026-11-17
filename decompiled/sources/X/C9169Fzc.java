package X;

/* renamed from: X.Fzc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9169Fzc extends GF2 implements HrP {
    public static final int DATA_ORIGINS_FIELD_NUMBER = 8;
    public static final C9169Fzc DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUES_FIELD_NUMBER = 6;
    public static final int END_LOCAL_DATE_TIME_FIELD_NUMBER = 4;
    public static final int END_TIME_EPOCH_MS_FIELD_NUMBER = 2;
    public static final int LONG_VALUES_FIELD_NUMBER = 7;
    public static volatile G0P<C9169Fzc> PARSER = null;
    public static final int START_LOCAL_DATE_TIME_FIELD_NUMBER = 3;
    public static final int START_TIME_EPOCH_MS_FIELD_NUMBER = 1;
    public static final int ZONE_OFFSET_SECONDS_FIELD_NUMBER = 5;
    public int bitField0_;
    public GDN<C9183Fzq> dataOrigins_;
    public HxZ<String, Double> doubleValues_;
    public String endLocalDateTime_;
    public long endTimeEpochMs_;
    public HxZ<String, Long> longValues_;
    public String startLocalDateTime_;
    public long startTimeEpochMs_;
    public int zoneOffsetSeconds_;

    static {
        C9169Fzc c9169Fzc = new C9169Fzc();
        DEFAULT_INSTANCE = c9169Fzc;
        GF2.A02(c9169Fzc, C9169Fzc.class);
    }

    public C9169Fzc() {
        HxZ hxZ = HxZ.A00;
        this.doubleValues_ = hxZ;
        this.longValues_ = hxZ;
        this.startLocalDateTime_ = "";
        this.endLocalDateTime_ = "";
        this.dataOrigins_ = GDI.A02;
    }
}
