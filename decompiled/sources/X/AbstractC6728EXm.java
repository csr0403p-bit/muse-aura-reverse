package X;

/* renamed from: X.EXm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6728EXm {
    public static final C6722EXg A00(C6729EXn c6729EXn) {
        C6722EXg c6722EXg = new C6722EXg();
        AbstractC8150FWo.A00(c6722EXg);
        AbstractC8150FWo.A01(c6722EXg, c6729EXn, "payment");
        C6729EXn.A10(c6722EXg, c6729EXn);
        C6729EXn.A0z(c6722EXg, c6729EXn);
        Long l = c6729EXn.A01;
        if (l != null) {
            AbstractC8150FWo.A02(c6722EXg, "latency_ms", l);
        }
        Integer num = c6729EXn.A00;
        if (num != null) {
            AbstractC8150FWo.A02(c6722EXg, "debug_step", AbstractC6730EXo.A00(num));
        }
        return c6722EXg;
    }
}
