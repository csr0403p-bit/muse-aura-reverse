package X;

/* loaded from: classes6.dex */
public final class GKJ extends GHM implements GEl {
    public static final GKJ DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    public static volatile InterfaceC9394GHj<GKJ> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    public int hash_;
    public int tagSize_;

    static {
        GKJ gkj = new GKJ();
        DEFAULT_INSTANCE = gkj;
        GHM.A07(gkj, GKJ.class);
    }

    public final GKK A0F() {
        int i = this.hash_;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? GKK.UNRECOGNIZED : GKK.SHA224 : GKK.SHA512 : GKK.SHA256 : GKK.SHA384 : GKK.SHA1 : GKK.UNKNOWN_HASH;
    }
}
