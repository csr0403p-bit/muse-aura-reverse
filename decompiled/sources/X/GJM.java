package X;

/* loaded from: classes6.dex */
public final class GJM extends GHW implements GEl {
    public GJM() {
        super(GJL.DEFAULT_INSTANCE);
    }

    public final void A05(GKP value) {
        GJL gjl = (GJL) GHW.A00(this);
        int i = GJL.OUTPUT_PREFIX_TYPE_FIELD_NUMBER;
        gjl.outputPrefixType_ = value.A01();
    }

    public final void A06(AbstractC9321GEc value) {
        GJL gjl = (GJL) GHW.A00(this);
        int i = GJL.OUTPUT_PREFIX_TYPE_FIELD_NUMBER;
        value.getClass();
        gjl.value_ = value;
    }

    public final void A07(String value) {
        GJL gjl = (GJL) GHW.A00(this);
        int i = GJL.OUTPUT_PREFIX_TYPE_FIELD_NUMBER;
        value.getClass();
        gjl.typeUrl_ = value;
    }

    @Override // X.AbstractC9393GHi
    public final /* bridge */ /* synthetic */ Object clone() {
        return A01();
    }
}
