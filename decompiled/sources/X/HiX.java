package X;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public abstract class HiX {
    public static final Object A00 = C3cG.A0T();

    public static void A00(EX9 handle, GKR writer, Dfg masterAead) throws GeneralSecurityException, IOException {
        try {
            if (handle == null) {
                if (!masterAead.A00.putString(masterAead.A01, EX7.A00(writer.A04().A0D())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
                return;
            }
            GJ4 gj4A04 = writer.A04();
            byte[] bArrAAW = handle.AAW(gj4A04.A0D(), new byte[0]);
            GHW ghwA09 = GHS.A09(GJ1.DEFAULT_INSTANCE);
            ((GJ1) GHW.A00(ghwA09)).encryptedKeyset_ = AbstractC9321GEc.A01(bArrAAW, 0, bArrAAW.length);
            GJ3 gj3A00 = GJ9.A00(gj4A04);
            GJ1 gj1 = (GJ1) GHW.A00(ghwA09);
            gj3A00.getClass();
            gj1.keysetInfo_ = gj3A00;
            gj1.bitField0_ |= 1;
            if (masterAead.A00.putString(masterAead.A01, EX7.A00(ghwA09.A02().A0D())).commit()) {
            } else {
                throw new IOException("Failed to write to SharedPreferences");
            }
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
