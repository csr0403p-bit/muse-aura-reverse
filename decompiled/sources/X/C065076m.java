package X;

/* renamed from: X.76m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C065076m extends GF0 implements C77F {
    public static final int APP_WIDGET_IDS_FIELD_NUMBER = 2;
    public static final C065076m DEFAULT_INSTANCE;
    public static volatile Hx9<C065076m> PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    public int appWidgetIdsMemoizedSerializedSize = -1;
    public String receiver_ = "";
    public AnonymousClass775 appWidgetIds_ = GDU.A02;

    static {
        C065076m c065076m = new C065076m();
        DEFAULT_INSTANCE = c065076m;
        GF0.A03(c065076m, C065076m.class);
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
                return new C9360GFt(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002'", new Object[]{"receiver_", "appWidgetIds_"});
            case 3:
                return new C065076m();
            case 4:
                return new AbstractC10440Hhn() { // from class: X.76x
                    {
                        C065076m c065076m = C065076m.DEFAULT_INSTANCE;
                    }
                };
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Hx9<C065076m> hx9 = PARSER;
                if (hx9 != null) {
                    return hx9;
                }
                synchronized (C065076m.class) {
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
