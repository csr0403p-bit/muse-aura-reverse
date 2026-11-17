package X;

/* renamed from: X.GNz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9543GNz extends GI0 {
    public static final C9543GNz DEFAULT_INSTANCE;
    public static volatile GIZ PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 7;
    public static final int h = 8;
    public int bitField0_;
    public int initializeRetryAttemptCount_;
    public int onPurchasesUpdatedSubResponseCode_;
    public int reason_;
    public int responseCode_;
    public String debugMessage_ = "";
    public String additionalDetails_ = "";

    static {
        C9543GNz c9543GNz = new C9543GNz();
        DEFAULT_INSTANCE = c9543GNz;
        GI0.A02(c9543GNz, C9543GNz.class);
    }

    public static void A0A(EnumC9535GNn enumC9535GNn, C9543GNz c9543GNz) {
        c9543GNz.getClass();
        c9543GNz.reason_ = enumC9535GNn.a;
        c9543GNz.bitField0_ |= 4;
    }
}
