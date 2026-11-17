package X;

/* renamed from: X.EXl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6727EXl {
    public static final C6720EXe A00(C6729EXn c6729EXn) {
        C6720EXe c6720EXe = new C6720EXe();
        AbstractC8150FWo.A00(c6720EXe);
        AbstractC8150FWo.A01(c6720EXe, c6729EXn, "catalog");
        C6729EXn.A10(c6720EXe, c6729EXn);
        C6729EXn.A0z(c6720EXe, c6729EXn);
        String str = c6729EXn.A02;
        if (str != null) {
            AbstractC8150FWo.A02(c6720EXe, "dcp_api_name", str);
        }
        Long l = c6729EXn.A01;
        if (l != null) {
            AbstractC8150FWo.A02(c6720EXe, "latency_ms", l);
        }
        Integer num = c6729EXn.A00;
        if (num != null) {
            AbstractC8150FWo.A02(c6720EXe, "debug_step", AbstractC6730EXo.A00(num));
        }
        return c6720EXe;
    }
}
