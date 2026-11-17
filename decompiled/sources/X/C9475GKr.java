package X;

import java.security.GeneralSecurityException;

/* renamed from: X.GKr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9475GKr extends AbstractC9465GKh {
    public final GKV A00;

    public final C6966EdO A00() throws GeneralSecurityException {
        GKV gkv = this.A00;
        GKP gkp = gkv.A01;
        if (gkp.equals(GKP.RAW)) {
            return C6966EdO.A00(new byte[0]);
        }
        if (gkp.equals(GKP.TINK)) {
            return AbstractC7608F5v.A0T(gkv.A04);
        }
        if (gkp.equals(GKP.LEGACY) || gkp.equals(GKP.CRUNCHY)) {
            return AbstractC7608F5v.A0S(gkv.A04);
        }
        throw BV6.A0u("Unknown output prefix type");
    }

    public C9475GKr(GKV gkv) {
        this.A00 = gkv;
    }
}
