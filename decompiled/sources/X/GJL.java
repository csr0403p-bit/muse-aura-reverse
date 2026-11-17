package X;

/* loaded from: classes6.dex */
public final class GJL extends GHM implements GEl {
    public static final GJL DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    public static volatile InterfaceC9394GHj<GJL> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    public int outputPrefixType_;
    public String typeUrl_ = "";
    public AbstractC9321GEc value_ = AbstractC9321GEc.A00;

    static {
        GJL gjl = new GJL();
        DEFAULT_INSTANCE = gjl;
        GHM.A07(gjl, GJL.class);
    }

    public final GKP A0F() {
        GKP gkpA00 = GKP.A00(this.outputPrefixType_);
        return gkpA00 == null ? GKP.UNRECOGNIZED : gkpA00;
    }
}
