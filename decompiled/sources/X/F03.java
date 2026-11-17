package X;

import android.content.Context;
import android.util.Base64;
import com.facebook.pushlite.hpke.JsonKeypair;
import com.facebook.pushlite.hpke.KeyNotFoundException;
import java.io.File;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyStoreException;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.List;

/* loaded from: classes5.dex */
public final class F03 implements InterfaceC3998CjI {
    public final Context A00;

    @Override // X.InterfaceC3998CjI
    public final KeyPair AGo(String str) throws Exception {
        C7384Etj.A0Y(str, 0);
        try {
            File fileA0O = C3cG.A0O(EDZ.A01(this.A00).get(F1c.A00, (C6537EDs) null), "hpke.json");
            if (!fileA0O.exists() || fileA0O.length() == 0) {
                throw new KeyNotFoundException(FGI.A0U("Keystore is empty or non-existent: ", str, " does not exist in CaskKeystore"));
            }
            for (JsonKeypair jsonKeypair : (List) C9sU.A03.A00(CFP.A04(fileA0O, DCl.A05), new A64(A5G.A00))) {
                if (str.equals(jsonKeypair.A00)) {
                    byte[] bArrDecode = Base64.decode(jsonKeypair.A02, 0);
                    C7384Etj.A0U(bArrDecode);
                    KeyFactory keyFactory = KeyFactory.getInstance("EC");
                    PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new X509EncodedKeySpec(bArrDecode));
                    byte[] bArrDecode2 = Base64.decode(jsonKeypair.A01, 0);
                    C7384Etj.A0U(bArrDecode2);
                    return new KeyPair(publicKeyGeneratePublic, keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArrDecode2)));
                }
            }
            throw new KeyNotFoundException(FGI.A0U("Key specified by keyAlias: ", str, " does not exist in CaskKeystore"));
        } catch (Exception e) {
            if (e instanceof KeyNotFoundException) {
                throw e;
            }
            throw new KeyStoreException(FGI.A0M("Error getting keypair from file: ", e.getMessage()));
        }
    }

    public F03(Context context) {
        this.A00 = context;
    }
}
