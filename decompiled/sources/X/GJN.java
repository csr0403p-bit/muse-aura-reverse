package X;

/* loaded from: classes6.dex */
public final class GJN extends GHM implements GEl {
    public static final GJN DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    public static volatile InterfaceC9394GHj<GJN> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    public int keyMaterialType_;
    public String typeUrl_ = "";
    public AbstractC9321GEc value_ = AbstractC9321GEc.A00;

    static {
        GJN gjn = new GJN();
        DEFAULT_INSTANCE = gjn;
        GHM.A07(gjn, GJN.class);
    }

    public final GJO A0F() {
        int i = this.keyMaterialType_;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? GJO.UNRECOGNIZED : GJO.REMOTE : GJO.ASYMMETRIC_PUBLIC : GJO.ASYMMETRIC_PRIVATE : GJO.SYMMETRIC : GJO.UNKNOWN_KEYMATERIAL;
    }
}
