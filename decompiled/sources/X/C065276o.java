package X;

/* renamed from: X.76o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C065276o extends GF0 implements C77F {
    public static final C065276o DEFAULT_INSTANCE;
    public static volatile Hx9<C065276o> PARSER;

    static {
        C065276o c065276o = new C065276o();
        DEFAULT_INSTANCE = c065276o;
        GF0.A03(c065276o, C065276o.class);
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
                return new C9360GFt(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new C065276o();
            case 4:
                return new AbstractC10440Hhn() { // from class: X.76u
                    {
                        C065276o c065276o = C065276o.DEFAULT_INSTANCE;
                    }
                };
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Hx9<C065276o> hx9 = PARSER;
                if (hx9 != null) {
                    return hx9;
                }
                synchronized (C065276o.class) {
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
