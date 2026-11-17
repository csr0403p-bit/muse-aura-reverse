package X;

/* loaded from: classes4.dex */
public abstract class AvW {
    public static final <R> Object A00(G0U<? super Long, ? extends R> g0u, HtJ<? super R> htJ) {
        BQr bQr = (BQr) htJ.getContext().get(BQr.A00);
        if (bQr != null) {
            return bQr.AiS(new C2297BSx((G0U) g0u, 22), htJ);
        }
        throw C3cG.A0Q("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final <R> Object A01(G0U<? super Long, ? extends R> g0u, HtJ<? super R> htJ) {
        BQr bQr = (BQr) htJ.getContext().get(BQr.A00);
        if (bQr != null) {
            return bQr.AiS(g0u, htJ);
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }
}
