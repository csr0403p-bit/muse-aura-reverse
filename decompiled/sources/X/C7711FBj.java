package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FBj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7711FBj {
    public static final C7711FBj A01 = new C7711FBj(LinkEncryptedPairingKt.LINK_COUNTER_MAX);
    public final long A00;

    public final boolean A00(long j, long j2) {
        long j3 = this.A00;
        if (!AnonymousClass002.A1M((j3 > LinkEncryptedPairingKt.LINK_COUNTER_MAX ? 1 : (j3 == LinkEncryptedPairingKt.LINK_COUNTER_MAX ? 0 : -1)))) {
            long millis = TimeUnit.SECONDS.toMillis(j3);
            if (j < 0 || millis <= 0 || j + millis <= j2) {
                return false;
            }
        }
        return true;
    }

    public final boolean A01(HlX hlX, long j, long j2) {
        C7384Etj.A0Y(hlX, 2);
        if (A00(j, j2)) {
            return true;
        }
        return hlX == HlX.A03 && this.A00 == 0 && j2 - j < 5000;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7711FBj) && this.A00 == ((C7711FBj) obj).A00);
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        return FGI.A0J("CacheTtl(ttlSeconds=", this.A00, ")");
    }

    public C7711FBj(long j) {
        this.A00 = j;
    }
}
