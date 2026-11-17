package X;

import android.util.Pair;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.C0c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3154C0c {
    public int A00;
    public int A01;
    public long A04;
    public long A05;
    public Pair<Long, Long> A06;
    public boolean A08;
    public boolean A09;
    public final C3159C0h A0A;
    public String A07 = "";
    public long A03 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
    public long A02 = -1;

    public final String toString() {
        return String.format(Locale.US, "isKeyCached=%s, networkRequests=%d, mCacheRequests=%d, mRequestedRange=[%d,%d], mDynamicRange=%s", Arrays.copyOf(new Object[]{Boolean.valueOf(this.A09), Integer.valueOf(this.A01), Integer.valueOf(this.A00), Long.valueOf(this.A05), Long.valueOf(this.A04), Pair.create(Long.valueOf(this.A03), Long.valueOf(this.A02))}, 6));
    }

    public C3154C0c(C3159C0h c3159C0h) {
        this.A0A = c3159C0h;
        Pair<Long, Long> pairCreate = Pair.create(-1L, -1L);
        C7384Etj.A0U(pairCreate);
        this.A06 = pairCreate;
    }
}
