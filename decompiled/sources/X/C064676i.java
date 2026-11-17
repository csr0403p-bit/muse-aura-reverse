package X;

/* renamed from: X.76i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C064676i extends GF0 implements C77F {
    public static final C064676i DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    public static volatile Hx9<C064676i> PARSER;
    public int bitField0_;
    public int layoutIndex_;
    public C064376f layout_;

    static {
        C064676i c064676i = new C064676i();
        DEFAULT_INSTANCE = c064676i;
        GF0.A03(c064676i, C064676i.class);
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
                return new C9360GFt(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
            case 3:
                return new C064676i();
            case 4:
                return new AbstractC10440Hhn() { // from class: X.76z
                    {
                        C064676i c064676i = C064676i.DEFAULT_INSTANCE;
                    }
                };
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Hx9<C064676i> hx9 = PARSER;
                if (hx9 != null) {
                    return hx9;
                }
                synchronized (C064676i.class) {
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
