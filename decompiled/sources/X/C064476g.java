package X;

/* renamed from: X.76g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C064476g extends GF0 implements C77F {
    public static final C064476g DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 3;
    public static final int LAMBDA_FIELD_NUMBER = 4;
    public static final int MY_PACKAGE_REPLACED_FIELD_NUMBER = 6;
    public static final int OPTIONS_CHANGED_FIELD_NUMBER = 2;
    public static volatile Hx9<C064476g> PARSER = null;
    public static final int RUN_CALLBACK_FIELD_NUMBER = 5;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public int requestCase_ = 0;
    public Object request_;

    static {
        C064476g c064476g = new C064476g();
        DEFAULT_INSTANCE = c064476g;
        GF0.A03(c064476g, C064476g.class);
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
                return new C9360GFt(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"request_", "requestCase_", C065076m.class, C064776j.class, C064976l.class, C065176n.class, C064876k.class, C065276o.class});
            case 3:
                return new C064476g();
            case 4:
                return new AbstractC10440Hhn() { // from class: X.76r
                    {
                        C064476g c064476g = C064476g.DEFAULT_INSTANCE;
                    }
                };
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Hx9<C064476g> hx9 = PARSER;
                if (hx9 != null) {
                    return hx9;
                }
                synchronized (C064476g.class) {
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
