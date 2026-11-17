package X;

import com.facebook.aura.confidentialvm.repository.ConfidentialVmRepositoryKt$awaitResult$2$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes4.dex */
public final class ACv<T> {
    public volatile T A03;
    public final Object A00 = C3cG.A0T();
    public final CountDownLatch A02 = new CountDownLatch(1);
    public final ArrayList A01 = C3cG.A0h();

    public final void A00(T t) {
        ArrayList arrayList;
        this.A03 = t;
        synchronized (this.A00) {
            this.A02.countDown();
            arrayList = new ArrayList(this.A01);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ConfidentialVmRepositoryKt$awaitResult$2$1) it.next()).run(this.A03);
        }
    }
}
