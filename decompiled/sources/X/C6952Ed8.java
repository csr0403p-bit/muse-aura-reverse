package X;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: X.Ed8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6952Ed8 extends ThreadLocal<Cipher> {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Cipher initialValue() {
        try {
            return AF2.A01.A00.AGa("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
