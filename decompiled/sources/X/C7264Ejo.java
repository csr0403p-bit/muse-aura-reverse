package X;

import android.util.Range;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Ejo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7264Ejo implements InterfaceC2940BpU {
    public final int $t;
    public final Object A00;
    public final String A01;

    public C7264Ejo(String str, AtomicReference atomicReference, int i) {
        this.$t = i;
        this.A00 = atomicReference;
        this.A01 = str;
    }

    @Override // X.InterfaceC2940BpU
    public final Object A4r(C3010Brs c3010Brs) {
        String str;
        int i = this.$t;
        AtomicReference atomicReference = (AtomicReference) this.A00;
        String str2 = this.A01;
        Range<Integer> range = BmM.A0F;
        switch (i) {
            case 0:
                atomicReference.set(c3010Brs);
                str = "-cancellation";
                break;
            case 1:
                atomicReference.set(c3010Brs);
                str = "-status";
                break;
            default:
                atomicReference.set(c3010Brs);
                str = "-Surface";
                break;
        }
        return FGI.A0M(str2, str);
    }
}
