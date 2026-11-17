package X;

import android.content.Context;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EX1 implements InterfaceC3998CjI {
    public static volatile EX1 A01;
    public final Context A00;

    public static final EX1 A00(Context context) {
        if (A01 == null) {
            synchronized (EX1.class) {
                if (A01 == null) {
                    A01 = new EX1(context);
                }
            }
        }
        EX1 ex1 = A01;
        C7384Etj.A0X(ex1);
        return ex1;
    }

    public static Ht8 A01(String name) {
        GKQ gkq;
        Hna hna = Hna.A01;
        synchronized (hna) {
            Map<String, GKQ> map = hna.A00;
            if (!map.containsKey(name)) {
                throw BV6.A0u(FGI.A0U("Name ", name, " does not exist"));
            }
            gkq = map.get(name);
        }
        return new Ht8(gkq);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v57, types: [X.EX3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [X.EX4] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r2v15, types: [X.EX3, java.lang.Object] */
    @Override // X.InterfaceC3998CjI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.security.KeyPair AGo(java.lang.String r16) throws com.facebook.pushlite.hpke.KeyNotFoundException, java.security.NoSuchAlgorithmException, java.security.KeyStoreException {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EX1.AGo(java.lang.String):java.security.KeyPair");
    }

    public EX1(Context context) {
        this.A00 = AnonymousClass001.A0I(context);
    }

    public static Hqb A02(byte[] serializedKeyset) throws IOException {
        ByteArrayInputStream byteArrayInputStreamA0E = BV4.A0E(serializedKeyset);
        try {
            GHM ghmA02 = GHM.A02(new GGB(byteArrayInputStreamA0E), HzL.A00(), GJ4.DEFAULT_INSTANCE);
            GHM.A06(ghmA02);
            GJ4 gj4 = (GJ4) ghmA02;
            byteArrayInputStreamA0E.close();
            return Hqb.A00(GKR.A02(gj4));
        } catch (Throwable th) {
            byteArrayInputStreamA0E.close();
            throw th;
        }
    }
}
