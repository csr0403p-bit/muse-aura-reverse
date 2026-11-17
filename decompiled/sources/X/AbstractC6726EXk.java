package X;

/* renamed from: X.EXk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6726EXk {
    public static final C6719EXd A00(C6729EXn c6729EXn) {
        C6719EXd c6719EXd = new C6719EXd();
        AbstractC8150FWo.A00(c6719EXd);
        AbstractC8150FWo.A01(c6719EXd, c6729EXn, AnonymousClass000.A00(15));
        C6729EXn.A10(c6719EXd, c6729EXn);
        C6729EXn.A0z(c6719EXd, c6729EXn);
        String str = c6729EXn.A02;
        if (str != null) {
            AbstractC8150FWo.A02(c6719EXd, "dcp_api_name", str);
        }
        Long l = c6729EXn.A01;
        if (l != null) {
            AbstractC8150FWo.A02(c6719EXd, "latency_ms", l);
        }
        String str2 = c6729EXn.A05;
        if (str2 != null) {
            AbstractC8150FWo.A02(c6719EXd, AbstractC7606F5t.A00(11), str2);
        }
        Integer num = c6729EXn.A00;
        if (num != null) {
            AbstractC8150FWo.A02(c6719EXd, "debug_step", AbstractC6730EXo.A00(num));
        }
        return c6719EXd;
    }
}
