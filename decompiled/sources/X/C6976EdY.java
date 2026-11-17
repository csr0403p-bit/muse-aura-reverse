package X;

import java.security.GeneralSecurityException;

/* renamed from: X.EdY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6976EdY implements Hwz {
    public static final EnumC7335ElD A01 = EnumC7335ElD.A02;
    public final Ho4 A00;

    public C6976EdY(Ho4 key) throws GeneralSecurityException {
        if (!A01.A00()) {
            throw BV6.A0u("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.A00 = key;
    }
}
