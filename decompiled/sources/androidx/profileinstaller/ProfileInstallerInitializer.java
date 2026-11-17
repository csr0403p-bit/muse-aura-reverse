package androidx.profileinstaller;

import X.Bx4;
import X.C4870D9q;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class ProfileInstallerInitializer implements Bx4<C4870D9q> {
    @Override // X.Bx4
    public final List<Class<? extends Bx4<?>>> A8o() {
        return Collections.EMPTY_LIST;
    }

    @Override // X.Bx4
    public final /* bridge */ /* synthetic */ C4870D9q A7V(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: X.D9o
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                final Context context2 = applicationContext;
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: X.D9k
                    public static final String __redex_internal_original_name = "ProfileInstallerInitializer$$ExternalSyntheticLambda1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        final Context context3 = context2;
                        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: X.D9j
                            public static final String __redex_internal_original_name = "ProfileInstallerInitializer$$ExternalSyntheticLambda2";

                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC4857D9c.A00(context3, AbstractC4857D9c.A00, new F52(2), false);
                            }
                        });
                    }
                }, new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new C4870D9q();
    }
}
