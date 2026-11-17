package X;

/* renamed from: X.76f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C064376f extends GF0 implements C77F {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    public static final C064376f DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_ALPHA_FIELD_NUMBER = 12;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    public static volatile Hx9<C064376f> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    public GDM<C064376f> children_ = GDK.A02;
    public boolean hasAction_;
    public boolean hasImageAlpha_;
    public boolean hasImageColorFilter_;
    public boolean hasImageDescription_;
    public int height_;
    public int horizontalAlignment_;
    public int identity_;
    public int imageScale_;
    public int type_;
    public int verticalAlignment_;
    public int width_;

    static {
        C064376f c064376f = new C064376f();
        DEFAULT_INSTANCE = c064376f;
        GF0.A03(c064376f, C064376f.class);
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
                return new C9360GFt(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007\f\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", C064376f.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_", "hasImageAlpha_"});
            case 3:
                return new C064376f();
            case 4:
                return new AbstractC10440Hhn() { // from class: X.75r
                    {
                        C064376f c064376f = C064376f.DEFAULT_INSTANCE;
                    }
                };
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Hx9<C064376f> hx9 = PARSER;
                if (hx9 != null) {
                    return hx9;
                }
                synchronized (C064376f.class) {
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
