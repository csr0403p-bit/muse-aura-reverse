package X;

import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.function.Supplier;

/* renamed from: X.Ftj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8927Ftj implements Supplier {
    public final int $t;

    public C8927Ftj(int i) {
        this.$t = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i;
        switch (this.$t) {
            case 0:
                C7318Ekj<StringBuilder> c7318Ekj = Gt5.A03;
                return BV4.A0p(1024);
            case 1:
                HashMap<String, String> map = HuP.A03;
                i = 2;
                break;
            case 2:
                C7318Ekj<String[]> c7318Ekj2 = GtL.A0B;
                return new String[512];
            case 3:
                C7318Ekj<String[]> c7318Ekj3 = GtL.A0B;
                i = 2048;
                break;
            case 4:
                return new C10242Gsb();
            case 5:
                return new WeakHashMap();
            case 6:
                C7318Ekj<C10259Gsy<Gt4>> c7318Ekj4 = C10260Gsz.A01;
                C10262GtH c10262GtH = new C10262GtH();
                ((GtD) c10262GtH).A00 = "";
                return new C10259Gsy(Gt4.class, c10262GtH);
            default:
                return null;
        }
        return new char[i];
    }
}
