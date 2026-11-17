package X;

import android.app.Application;
import com.facebook.aura.startup.AuraStartupMetricTracker;
import com.facebook.aura.startup.AuraStartupMetricTracker$startupDoneStrategyPicker$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.DAa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4874DAa implements CIP {
    public final /* synthetic */ Application A00;
    public final /* synthetic */ DAW<ColdInfo> A01;
    public final /* synthetic */ Function0<Unit> A02;

    /* JADX WARN: Incorrect types in method signature: (LX/DAW<TColdInfo;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;Landroid/app/Application;)V */
    public C4874DAa(Application application, DAW daw, Function0 function0) {
        this.A01 = daw;
        this.A02 = function0;
        this.A00 = application;
    }

    @Override // X.CIP
    public final void onColdStartMode(int i, boolean z) {
        DB0 db0;
        DAW<ColdInfo> daw = this.A01;
        Function0<Unit> function0 = this.A02;
        Application application = this.A00;
        synchronized (daw) {
            if (z) {
                db0 = null;
            } else {
                db0 = ((AuraStartupMetricTracker$startupDoneStrategyPicker$1) ((AuraStartupMetricTracker) daw).startupDoneStrategyPicker).backgroundStartupDoneStrategy;
                if (db0 != null) {
                }
                CFK.A06(DAW.TAG, "Begin BACKGROUND UNTRACKED start");
                DAe.A00(null, null);
                daw.beginBackgroundStart();
                ((AuraStartupMetricTracker) daw).startupMarker$1.A8z();
            }
            if (function0 != null) {
                function0.invoke();
            }
            daw.getAsyncRecorder().onBackgroundStartupModeKnown(application);
            if (z) {
                CFK.A06(DAW.TAG, "Begin FOREGROUND COLD start");
            } else if (db0 != null) {
                CFK.A06(DAW.TAG, "Begin BACKGROUND COLD start");
                daw.beginBackgroundStart();
                DAW.setDoneStrategy$default(daw, db0, "backgroundColdStart", null, null, (short) 0, 28, null);
            } else {
                CFK.A06(DAW.TAG, "Begin BACKGROUND UNTRACKED start");
                DAe.A00(null, null);
                daw.beginBackgroundStart();
                ((AuraStartupMetricTracker) daw).startupMarker$1.A8z();
            }
        }
    }
}
