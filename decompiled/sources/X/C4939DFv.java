package X;

/* renamed from: X.DFv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4939DFv {
    public static DKG A00;

    public static synchronized DKG A00() {
        DKG dkg;
        dkg = A00;
        if (dkg == null) {
            dkg = new DKG(C4JM.A00().getAssets());
            A00 = dkg;
        }
        return dkg;
    }
}
