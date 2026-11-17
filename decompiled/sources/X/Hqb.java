package X;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Hqb {
    public final GJ5 A00;

    public Hqb(GJ5 val) {
        this.A00 = val;
    }

    public static Hqb A00(GKR val) throws GeneralSecurityException {
        GJ4 gj4A04 = val.A04();
        GHW ghwA09 = GHS.A09(gj4A04);
        if (!ghwA09.A01.equals(gj4A04)) {
            GHM ghmA00 = GHW.A00(ghwA09);
            AbstractC7609F5w.A0d(ghmA00).AQb(ghmA00, gj4A04);
        }
        return new Hqb((GJ5) ghwA09);
    }
}
