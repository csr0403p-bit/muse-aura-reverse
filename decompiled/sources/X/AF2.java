package X;

import X.AEx;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes4.dex */
public final class AF2<T_WRAPPER extends AEx<JcePrimitiveT>, JcePrimitiveT> {
    public final AF7<JcePrimitiveT> A00;
    public static final AF2<AF6, Cipher> A01 = new AF2<>(new AF6());
    public static final AF2<AF1, Mac> A05 = new AF2<>(new AF1());
    public static final AF2<AEy, Signature> A07 = new AF2<>(new AEy());
    public static final AF2<AF0, MessageDigest> A06 = new AF2<>(new AF0());
    public static final AF2<AEw, KeyAgreement> A02 = new AF2<>(new AEw());
    public static final AF2<AEv, KeyPairGenerator> A04 = new AF2<>(new AEv());
    public static final AF2<AEz, KeyFactory> A03 = new AF2<>(new AEz());

    public AF2(T_WRAPPER instanceBuilder) {
        AF7<JcePrimitiveT> af5;
        if (C7338ElG.A00.get()) {
            af5 = new AF4<>(instanceBuilder);
        } else {
            af5 = BV3.A00(45).equals(System.getProperty("java.vendor")) ? new AF5<>(instanceBuilder) : new AF3<>(instanceBuilder);
        }
        this.A00 = af5;
    }
}
