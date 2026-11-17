package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public final class EsK<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(EsK.class, "notCompletedCount$volatile");
    public final C27k<T>[] A00;
    public volatile /* synthetic */ int notCompletedCount$volatile;

    public final Object A00(HtJ<? super List<? extends T>> htJ) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GBL.A04;
        GBL gbl = new GBL(1, C7Bm.A02(htJ));
        gbl.A0I();
        C27k<T>[] c27kArr = this.A00;
        int length = c27kArr.length;
        C7368EsL[] c7368EsLArr = new C7368EsL[length];
        for (int i = 0; i < length; i++) {
            C27k<T> c27k = c27kArr[i];
            c27k.Afv();
            C7368EsL c7368EsL = new C7368EsL(this, gbl);
            c7368EsL.A00 = HzS.A01(c27k, c7368EsL, true);
            c7368EsLArr[i] = c7368EsL;
        }
        EsM esM = new EsM(this, c7368EsLArr);
        for (int i2 = 0; i2 < length; i2++) {
            C7368EsL.A03.set(c7368EsLArr[i2], esM);
        }
        if (!(GBL.A04.get(gbl) instanceof G6I)) {
            esM.A00();
        } else {
            GBO.A01(esM, gbl);
        }
        return gbl.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EsK(C27k<? extends T>[] c27kArr) {
        this.A00 = c27kArr;
        this.notCompletedCount$volatile = c27kArr.length;
    }
}
