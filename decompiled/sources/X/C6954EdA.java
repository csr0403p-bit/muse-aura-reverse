package X;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: X.EdA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6954EdA extends ThreadLocal<Cipher> {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Cipher initialValue() {
        try {
            Cipher cipherAGa = AF2.A01.A00.AGa("AES/GCM-SIV/NoPadding");
            if (C6956EdC.A00(cipherAGa)) {
                return cipherAGa;
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
