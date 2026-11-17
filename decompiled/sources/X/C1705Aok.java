package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;

/* renamed from: X.Aok, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1705Aok implements AfI {
    public long A00;
    public boolean A01;

    @Override // X.AfI
    public final long A4x() {
        return this.A01 ? LinkEncryptedPairingKt.LINK_COUNTER_MAX : Math.max(0L, this.A00 - System.nanoTime());
    }
}
