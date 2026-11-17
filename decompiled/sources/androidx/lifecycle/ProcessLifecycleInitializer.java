package androidx.lifecycle;

import X.AbstractC3086Bxn;
import X.Bx3;
import X.Bx4;
import X.C0881AGi;
import X.C1HY;
import X.C3089Bxt;
import X.C3cG;
import X.C7384Etj;
import X.EnumC3085Bxl;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.List;

/* loaded from: classes5.dex */
public final class ProcessLifecycleInitializer implements Bx4<C1HY> {
    @Override // X.Bx4
    public final /* bridge */ /* synthetic */ C1HY A7V(Context context) {
        C7384Etj.A0Y(context, 0);
        Bx3 bx3A00 = Bx3.A00(context);
        C7384Etj.A0U(bx3A00);
        if (!bx3A00.A02.contains(getClass())) {
            throw C3cG.A0Q("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC3086Bxn.A00.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            C7384Etj.A0Z(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new LifecycleDispatcher$DispatcherActivityCallback());
        }
        final C3089Bxt c3089Bxt = C3089Bxt.A08;
        c3089Bxt.A02 = new Handler();
        c3089Bxt.A05.A06(EnumC3085Bxl.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        C7384Etj.A0Z(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1
            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                C7384Etj.A0Y(activity, 0);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPreCreated(Activity activity, Bundle bundle) {
                C7384Etj.A0Y(activity, 0);
                final C3089Bxt c3089Bxt2 = c3089Bxt;
                activity.registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostResumed(Activity activity2) {
                        C3089Bxt c3089Bxt3 = c3089Bxt2;
                        int i = c3089Bxt3.A00 + 1;
                        c3089Bxt3.A00 = i;
                        if (i == 1) {
                            if (c3089Bxt3.A03) {
                                c3089Bxt3.A05.A06(EnumC3085Bxl.ON_RESUME);
                                c3089Bxt3.A03 = false;
                            } else {
                                Handler handler = c3089Bxt3.A02;
                                C7384Etj.A0X(handler);
                                handler.removeCallbacks(c3089Bxt3.A06);
                            }
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostStarted(Activity activity2) {
                        C3089Bxt c3089Bxt3 = c3089Bxt2;
                        int i = c3089Bxt3.A01 + 1;
                        c3089Bxt3.A01 = i;
                        if (i == 1 && c3089Bxt3.A04) {
                            c3089Bxt3.A05.A06(EnumC3085Bxl.ON_START);
                            c3089Bxt3.A04 = false;
                        }
                    }
                });
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                C3089Bxt c3089Bxt2 = c3089Bxt;
                int i = c3089Bxt2.A00 - 1;
                c3089Bxt2.A00 = i;
                if (i == 0) {
                    Handler handler = c3089Bxt2.A02;
                    C7384Etj.A0X(handler);
                    handler.postDelayed(c3089Bxt2.A06, 700L);
                }
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                C3089Bxt c3089Bxt2 = c3089Bxt;
                int i = c3089Bxt2.A01 - 1;
                c3089Bxt2.A01 = i;
                if (i == 0 && c3089Bxt2.A03) {
                    c3089Bxt2.A05.A06(EnumC3085Bxl.ON_STOP);
                    c3089Bxt2.A04 = true;
                }
            }
        });
        return c3089Bxt;
    }

    @Override // X.Bx4
    public final List<Class<? extends Bx4<?>>> A8o() {
        return C0881AGi.A00;
    }
}
