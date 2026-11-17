package X;

/* renamed from: X.GNx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9541GNx extends GI0 {
    public static final C9541GNx DEFAULT_INSTANCE;
    public static volatile GIZ PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 5;
    public static final int f = 4;
    public static final int g = 6;
    public static final int h = 7;
    public int apiDetailsCase_ = 0;
    public Object apiDetails_;
    public int apiMethod_;
    public int billingBroadcastAction_;
    public C9543GNz billingResultDetails_;
    public int bitField0_;

    static {
        C9541GNx c9541GNx = new C9541GNx();
        DEFAULT_INSTANCE = c9541GNx;
        GI0.A02(c9541GNx, C9541GNx.class);
    }

    public static void A0A(C9541GNx c9541GNx, EnumC9540GNw enumC9540GNw) {
        c9541GNx.getClass();
        c9541GNx.apiMethod_ = enumC9540GNw.a;
        c9541GNx.bitField0_ |= 1;
    }
}
