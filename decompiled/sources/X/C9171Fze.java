package X;

/* renamed from: X.Fze, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9171Fze extends GF2 implements HrP {
    public static final int ASC_ORDERING_FIELD_NUMBER = 7;
    public static final int DATA_ORIGIN_FILTERS_FIELD_NUMBER = 3;
    public static final int DATA_TYPE_FIELD_NUMBER = 2;
    public static final C9171Fze DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 4;
    public static final int PAGE_SIZE_FIELD_NUMBER = 5;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 6;
    public static volatile G0P<C9171Fze> PARSER = null;
    public static final int TIME_SPEC_FIELD_NUMBER = 1;
    public int bitField0_;
    public C9184Fzr dataType_;
    public int limit_;
    public int pageSize_;
    public C9174Fzh timeSpec_;
    public GDN<C9183Fzq> dataOriginFilters_ = GDI.A02;
    public boolean ascOrdering_ = true;
    public String pageToken_ = "";

    static {
        C9171Fze c9171Fze = new C9171Fze();
        DEFAULT_INSTANCE = c9171Fze;
        GF2.A02(c9171Fze, C9171Fze.class);
    }
}
