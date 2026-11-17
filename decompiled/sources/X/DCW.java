package X;

import com.crossapp.tigonhttp.TigonHttpClient$TigonHttpClientServiceHolder;
import com.facebook.tigon.tigonobserver.TigonObservable;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public class DCW extends AbstractC4085Cli {
    public final TigonHttpClient$TigonHttpClientServiceHolder A00;
    public final TigonObservable A01;
    public final ScheduledExecutorService A02;

    public DCW(TigonHttpClient$TigonHttpClientServiceHolder tigonHttpClient$TigonHttpClientServiceHolder, ScheduledExecutorService scheduledExecutorService) {
        this.A02 = scheduledExecutorService;
        this.A00 = tigonHttpClient$TigonHttpClientServiceHolder;
        this.A01 = new TigonObservable(tigonHttpClient$TigonHttpClientServiceHolder, true, false, scheduledExecutorService, new EUV[0], new EUU[0]);
    }
}
