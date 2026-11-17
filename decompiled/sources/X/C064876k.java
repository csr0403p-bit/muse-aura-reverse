package X;

/* renamed from: X.76k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C064876k extends GF0 implements C77F {
    public static final int ACTION_PARAMETERS_FIELD_NUMBER = 3;
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    public static final int CLASS_NAME_FIELD_NUMBER = 1;
    public static final C064876k DEFAULT_INSTANCE;
    public static volatile Hx9<C064876k> PARSER;
    public int appWidgetId_;
    public String className_ = "";
    public AbstractC9320GEb actionParameters_ = AbstractC9320GEb.A00;

    static {
        C064876k c064876k = new C064876k();
        DEFAULT_INSTANCE = c064876k;
        GF0.A03(c064876k, C064876k.class);
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
                return new C9360GFt(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0003\n", new Object[]{"className_", "appWidgetId_", "actionParameters_"});
            case 3:
                return new C064876k();
            case 4:
                return new AbstractC10440Hhn() { // from class: X.76w
                    {
                        C064876k c064876k = C064876k.DEFAULT_INSTANCE;
                    }
                };
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Hx9<C064876k> hx9 = PARSER;
                if (hx9 != null) {
                    return hx9;
                }
                synchronized (C064876k.class) {
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
