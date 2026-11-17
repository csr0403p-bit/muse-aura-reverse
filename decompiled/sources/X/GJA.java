package X;

/* loaded from: classes6.dex */
public final class GJA extends GHM implements GEl {
    public static final GJA DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    public static volatile InterfaceC9394GHj<GJA> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public int bitField0_;
    public GJN keyData_;
    public int keyId_;
    public int outputPrefixType_;
    public int status_;

    static {
        GJA gja = new GJA();
        DEFAULT_INSTANCE = gja;
        GHM.A07(gja, GJA.class);
    }

    public final GJC A0F() {
        int i = this.status_;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? GJC.UNRECOGNIZED : GJC.DESTROYED : GJC.DISABLED : GJC.ENABLED : GJC.UNKNOWN_STATUS;
    }
}
