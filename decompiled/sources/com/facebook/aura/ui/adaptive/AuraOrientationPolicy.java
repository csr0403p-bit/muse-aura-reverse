package com.facebook.aura.ui.adaptive;

import X.BV4;
import X.BeM;
import X.C7384Etj;
import X.Hr3;
import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public final class AuraOrientationPolicy {
    public static final int $stable = 0;
    public static final AuraOrientationPolicy INSTANCE = new AuraOrientationPolicy();

    public final void install(Application application) {
        C7384Etj.A0Y(application, 0);
        application.registerActivityLifecycleCallbacks(OrientationCallbacks.INSTANCE);
    }

    public final class OrientationCallbacks implements Application.ActivityLifecycleCallbacks {
        public static final OrientationCallbacks INSTANCE = new OrientationCallbacks();
        public static final WeakHashMap<Activity, BeM<Configuration>> portraitLockedActivities = BV4.A11();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(final Activity activity, Bundle bundle) {
            Hr3 hr3;
            C7384Etj.A0Y(activity, 0);
            if (activity.getRequestedOrientation() == 1) {
                BeM<Configuration> beM = new BeM() { // from class: com.facebook.aura.ui.adaptive.AuraOrientationPolicy$OrientationCallbacks$onActivityCreated$listener$1
                    @Override // X.BeM
                    public final void accept(Configuration configuration) {
                        AuraOrientationPolicy.INSTANCE.applyOrientation(activity);
                    }
                };
                portraitLockedActivities.put(activity, beM);
                if ((activity instanceof Hr3) && (hr3 = (Hr3) activity) != null) {
                    hr3.addOnConfigurationChangedListener(beM);
                }
                AuraOrientationPolicy.INSTANCE.applyOrientation(activity);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Hr3 hr3;
            C7384Etj.A0Y(activity, 0);
            BeM<Configuration> beMRemove = portraitLockedActivities.remove(activity);
            if (beMRemove == null || !(activity instanceof Hr3) || (hr3 = (Hr3) activity) == null) {
                return;
            }
            hr3.removeOnConfigurationChangedListener(beMRemove);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C7384Etj.A0Y(activity, 0);
            if (portraitLockedActivities.containsKey(activity)) {
                AuraOrientationPolicy.INSTANCE.applyOrientation(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }

    private final boolean rotatesOn(Activity activity) {
        AuraDevice auraDevice = AuraDevice.INSTANCE;
        return auraDevice.type(activity) == AuraDeviceType.Automotive || auraDevice.isLargeScreen(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyOrientation(Activity activity) {
        int i = rotatesOn(activity) ? 13 : 1;
        if (activity.getRequestedOrientation() != i) {
            activity.setRequestedOrientation(i);
        }
    }
}
