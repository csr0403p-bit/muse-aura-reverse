package X;

import android.util.SparseArray;
import java.util.List;

/* renamed from: X.Hmz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10500Hmz implements EES<SparseArray<HsM>> {
    public final /* synthetic */ FDW A00;

    public C10500Hmz(FDW fdw) {
        this.A00 = fdw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.EES
    public final /* bridge */ /* synthetic */ SparseArray<HsM> get() {
        Object obj = this.A00.A06.get(135);
        if (!(obj instanceof List)) {
            return BV4.A0B();
        }
        List list = (List) obj;
        SparseArray<HsM> sparseArray = new SparseArray<>(list.size() / 2);
        for (int i = 0; i < list.size(); i += 2) {
            sparseArray.put(C8j4.A0H(list, i), list.get(i + 1));
        }
        return sparseArray;
    }
}
