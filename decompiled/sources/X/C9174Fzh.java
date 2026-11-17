package X;

/* renamed from: X.Fzh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9174Fzh extends GF2 implements HrP {
    public static final C9174Fzh DEFAULT_INSTANCE;
    public static final int END_LOCAL_DATE_TIME_FIELD_NUMBER = 4;
    public static final int END_TIME_EPOCH_MS_FIELD_NUMBER = 2;
    public static volatile G0P<C9174Fzh> PARSER = null;
    public static final int START_LOCAL_DATE_TIME_FIELD_NUMBER = 3;
    public static final int START_TIME_EPOCH_MS_FIELD_NUMBER = 1;
    public int bitField0_;
    public long endTimeEpochMs_;
    public long startTimeEpochMs_;
    public String startLocalDateTime_ = "";
    public String endLocalDateTime_ = "";

    static {
        C9174Fzh c9174Fzh = new C9174Fzh();
        DEFAULT_INSTANCE = c9174Fzh;
        GF2.A02(c9174Fzh, C9174Fzh.class);
    }
}
