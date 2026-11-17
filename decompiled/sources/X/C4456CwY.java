package X;

import android.os.SystemClock;
import android.util.Base64;
import com.google.common.base.Supplier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.CwY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4456CwY implements Supplier {
    public final int $t;

    public C4456CwY(int i) {
        this.$t = i;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        long jElapsedRealtime;
        switch (this.$t) {
            case 0:
                return new DmP();
            case 1:
                byte[] bArr = new byte[12];
                C6199Dxj.A09.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                jElapsedRealtime = SystemClock.elapsedRealtime();
                break;
            case 3:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new Ev6("Loader:ProgressiveMediaPeriod", 2));
                C7384Etj.A0U(executorServiceNewSingleThreadExecutor);
                return new C5343Dgm(new C7575F4o(2), executorServiceNewSingleThreadExecutor);
            case 4:
                ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor(new Ev6("SingleSampleMediaPeriod", 2));
                C7384Etj.A0U(executorServiceNewSingleThreadExecutor2);
                return executorServiceNewSingleThreadExecutor2;
            case 5:
                jElapsedRealtime = 0;
                break;
            case 6:
                throw BV4.A0T();
            default:
                return null;
        }
        return Long.valueOf(jElapsedRealtime);
    }
}
