package X;

import java.util.HashMap;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Ets {
    public static HashMap<Integer, Ets> A00;
    public static final /* synthetic */ Ey9 A01;
    public static final /* synthetic */ Ets[] A02;
    public static final Ets A03;
    public final String algorithmName;
    public final int nEnc;
    public final int nPk;
    public final int nSecret;
    public final int nSk;
    public final int value;

    static {
        Ets ets = new Ets("DHKEM_P256_SHA256", "DHKEM(P-256, HKDF-SHA256)", 0, 16, 32, 65, 65, 32);
        A03 = ets;
        Ets[] etsArr = {ets, new Ets("DHKEM_P384_SHA384", "DHKEM(P-384, HKDF-SHA384)", 1, 17, 48, 97, 97, 48), new Ets("DHKEM_P512_SHA512", "DHKEM(P-521, HKDF-SHA512)", 2, 18, 64, 133, 133, 66), new Ets("DHKEM_X25519_SHA256", "DHKEM(X25519, HKDF-SHA256)", 3, 32, 32, 32, 32, 32), new Ets("DHKEM_X488_SHA512", "DHKEM(X448, HKDF-SHA512)", 4, 33, 64, 56, 56, 56)};
        A02 = etsArr;
        F3w f3wA0w = C3cG.A0w(etsArr);
        A01 = f3wA0w;
        A00 = BV4.A0u();
        Iterator<T> it = f3wA0w.iterator();
        while (it.hasNext()) {
            Ets ets2 = (Ets) it.next();
            BV6.A1E(ets2, A00, ets2.value);
        }
    }

    public static Ets valueOf(String str) {
        return (Ets) Enum.valueOf(Ets.class, str);
    }

    public static Ets[] values() {
        return (Ets[]) A02.clone();
    }

    public Ets(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6) {
        this.algorithmName = str2;
        this.value = i2;
        this.nSecret = i3;
        this.nEnc = i4;
        this.nPk = i5;
        this.nSk = i6;
    }
}
