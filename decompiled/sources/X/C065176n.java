package X;

/* renamed from: X.76n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C065176n extends GF0 implements C77F {
    public static final int ACTIONKEY_FIELD_NUMBER = 3;
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    public static final C065176n DEFAULT_INSTANCE;
    public static volatile Hx9<C065176n> PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    public int appWidgetId_;
    public String receiver_ = "";
    public String actionKey_ = "";

    static {
        C065176n c065176n = new C065176n();
        DEFAULT_INSTANCE = c065176n;
        GF0.A03(c065176n, C065176n.class);
    }

    @Override // X.GF0
    public final Object A05(Integer num) {
        Hx9 hxt;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C9360GFt(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0003\u0208", new Object[]{"receiver_", "appWidgetId_", "actionKey_"});
            case 3:
                return new C065176n();
            case 4:
                return new AbstractC10440Hhn() { // from class: X.76t
                    {
                        C065176n c065176n = C065176n.DEFAULT_INSTANCE;
                    }
                };
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Hx9<C065176n> hx9 = PARSER;
                if (hx9 != null) {
                    return hx9;
                }
                synchronized (C065176n.class) {
                    hxt = PARSER;
                    if (hxt == null) {
                        AnonymousClass796 anonymousClass796 = Hxt.A01;
                        hxt = new Hxt(DEFAULT_INSTANCE);
                        PARSER = hxt;
                    }
                }
                return hxt;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
