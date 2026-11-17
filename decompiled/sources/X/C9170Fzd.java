package X;

/* renamed from: X.Fzd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9170Fzd extends GF2 implements HrP {
    public static final int DATA_ORIGIN_FIELD_NUMBER = 3;
    public static final C9170Fzd DEFAULT_INSTANCE;
    public static final int METRIC_SPEC_FIELD_NUMBER = 2;
    public static volatile G0P<C9170Fzd> PARSER = null;
    public static final int SLICE_DURATION_MILLIS_FIELD_NUMBER = 4;
    public static final int SLICE_PERIOD_FIELD_NUMBER = 5;
    public static final int TIME_SPEC_FIELD_NUMBER = 1;
    public int bitField0_;
    public GDN<C9183Fzq> dataOrigin_;
    public GDN<C9178Fzl> metricSpec_;
    public long sliceDurationMillis_;
    public String slicePeriod_;
    public C9174Fzh timeSpec_;

    static {
        C9170Fzd c9170Fzd = new C9170Fzd();
        DEFAULT_INSTANCE = c9170Fzd;
        GF2.A02(c9170Fzd, C9170Fzd.class);
    }

    public C9170Fzd() {
        GDI<Object> gdi = GDI.A02;
        this.metricSpec_ = gdi;
        this.dataOrigin_ = gdi;
        this.slicePeriod_ = "";
    }
}
