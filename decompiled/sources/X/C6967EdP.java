package X;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;

/* renamed from: X.EdP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6967EdP implements InterfaceC6968EdQ {
    public final InterfaceC6968EdQ A00;
    public final InterfaceC6968EdQ A01;

    @Override // X.InterfaceC6968EdQ
    public final byte[] A6i(final byte[] data, int outputLength) {
        return (data.length <= 64 ? this.A01 : this.A00).A6i(data, outputLength);
    }

    public static C6967EdP A00(InterfaceC6968EdQ interfaceC6968EdQ, Hp7 hp7, Provider provider) throws NoSuchAlgorithmException {
        Mac.getInstance("AESCMAC", provider);
        return new C6967EdP(interfaceC6968EdQ, new EdN(provider, hp7.A00.A01()));
    }

    public C6967EdP(InterfaceC6968EdQ small, InterfaceC6968EdQ large) {
        this.A01 = small;
        this.A00 = large;
    }
}
