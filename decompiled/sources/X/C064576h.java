package X;

/* renamed from: X.76h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C064576h extends GF0 implements C77F {
    public static final C064576h DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    public static volatile Hx9<C064576h> PARSER;
    public GDM<C064676i> layout_ = GDK.A02;
    public int nextIndex_;

    static {
        C064576h c064576h = new C064576h();
        DEFAULT_INSTANCE = c064576h;
        GF0.A03(c064576h, C064576h.class);
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
                return new C9360GFt(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", C064676i.class, "nextIndex_"});
            case 3:
                return new C064576h();
            case 4:
                return new AbstractC10440Hhn() { // from class: X.76y
                    {
                        C064576h c064576h = C064576h.DEFAULT_INSTANCE;
                    }
                };
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Hx9<C064576h> hx9 = PARSER;
                if (hx9 != null) {
                    return hx9;
                }
                synchronized (C064576h.class) {
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
