package X;

import com.facebook.pushlite.hpke.HPKEException;

/* renamed from: X.CjE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3994CjE {
    public final int A00;
    public static final EnumC3992CjC A02 = EnumC3992CjC.A03;
    public static final EnumC3992CjC A01 = EnumC3992CjC.A04;

    public AbstractC3994CjE(int i) throws HPKEException {
        if (i != A02.nk && i != A01.nk) {
            throw new HPKEException(FGI.A0H("Unsupported key length: ", i));
        }
        this.A00 = i;
    }
}
