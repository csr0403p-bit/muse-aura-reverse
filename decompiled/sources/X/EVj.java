package X;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class EVj<Data> implements Observer {
    public EVh A00;

    public final boolean equals(Object obj) {
        return (obj instanceof EVj) && this.A00.equals(((EVj) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        EVh eVh = this.A00;
        eVh.A0D(null, C79.A00);
        ExecutorService executorService = eVh.A02.A02.diskExecutor;
        C7384Etj.A0T(executorService);
        executorService.execute(new EVl(eVh));
    }
}
