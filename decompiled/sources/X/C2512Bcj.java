package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Bcj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2512Bcj implements InterfaceC2420Baw {
    public final int A00;
    public final C2511Bch A01;
    public final String A02;
    public final Map<Integer, InterfaceC2523Bcu> A03 = BV4.A0u();
    public final boolean A04;

    private InterfaceC2523Bcu A00() {
        Iterator<Integer> it = InterfaceC2420Baw.A00.iterator();
        while (it.hasNext()) {
            InterfaceC2523Bcu interfaceC2523BcuACK = ACK(C60Q.A03(it));
            if (interfaceC2523BcuACK != null) {
                return interfaceC2523BcuACK;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080 A[PHI: r10
  0x0080: PHI (r10v6 ??) = (r10v5 ??), (r10v5 ??), (r10v5 ??), (r10v5 ??), (r10v7 ??), (r10v8 ??) binds: [B:15:0x0033, B:17:0x003f, B:19:0x0047, B:21:0x0061, B:34:0x0082, B:81:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v5, types: [X.Bcw] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [X.Bcu] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC2420Baw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC2523Bcu ACK(int r20) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2512Bcj.ACK(int):X.Bcu");
    }

    @Override // X.InterfaceC2420Baw
    public final boolean ANG(int i) {
        return this.A04 && ACK(i) != null;
    }

    public C2512Bcj(C2511Bch c2511Bch, String str) throws NumberFormatException {
        boolean z;
        int i;
        this.A02 = str;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            AbstractC2875Bni.A03("Camera2EncoderProfilesProvider", FGI.A0U("Camera id is not an integer: ", str, ", unable to create Camera2EncoderProfilesProvider"));
            z = false;
            i = -1;
        }
        this.A04 = z;
        this.A00 = i;
        this.A01 = c2511Bch;
    }
}
