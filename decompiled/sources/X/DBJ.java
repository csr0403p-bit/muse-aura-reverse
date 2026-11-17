package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.facebook.aura.qpl.startup.HatchStartupQpl;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public abstract class DBJ<ColdInfo> {
    public static final String ACTIVITIES_CREATED_ANNOTATION = "activitiesCreated";
    public static final String ACTIVITY_ON_BACK_PRESSED_POINT = "Activity:onBackPressed";
    public static final String ACTIVITY_ON_CREATE_POINT = "Activity:onCreate";
    public static final String ACTIVITY_ON_DESTROY_POINT = "Activity:onDestroy";
    public static final String ACTIVITY_ON_FINISH_POINT = "Activity:onFinish";
    public static final String ACTIVITY_ON_PAUSE_POINT = "Activity:onPause";
    public static final String ACTIVITY_ON_RESUME_POINT = "Activity:onResume";
    public static final String ACTIVITY_ON_START_POINT = "Activity:onStart";
    public static final String ACTIVITY_ON_STOP_POINT = "Activity:onStop";
    public static final String COLD_START_MODE_ANNOTATION = "coldStartMode";
    public static final String DEXES_GENERATED_ANNOTATION = "dexesGenerated";
    public static final String FIRST_FOREGROUND_TAG = "firstForeground";
    public static final String FIRST_LINE_OF_CODE_POINT = "firstLineOfCode";
    public static final String FIRST_RUN_INSTALL = "install";
    public static final String FIRST_RUN_TYPE_ANNOTATION = "firstRunType";
    public static final String FIRST_RUN_UPGRADE = "upgrade";
    public static final String INTERRUPTED_BG_START_ANNOTATION = "interruptedBgStart";
    public static final String IS_DEBUG_BUILD_ANNOTATION = "isDebugBuild";
    public static final String IS_EXOPACKAGE_BUILD_ANNOTATION = "isExopackageBuild";
    public static final String IS_NATIVE_MULTIDEX_ANNOTATION = "isNativeMultidex";
    public static final String IS_TENTATIVE_SURFACE_ANNOTATION = "isTentativeSurface";
    public static final int MAX_POINT_INDEX = 5;
    public static final String ON_INTENT_LAUNCHED_POINT = "onIntentLaunched";
    public static final String PRIOR_START_TYPE_ANNOTATION = "priorStartType";
    public static final String PROCESS_REQUESTED_TO_START_TIME = "processRequestedToStart";
    public static final String PROCESS_START_REQUESTED_TIME = "processRequested";
    public static final String PROCESS_START_TIME = "processStart";
    public static final String START_CANCEL_REASON_TAG = "cancelReason";
    public static final String START_COUNT_ANNOTATION = "startCount";
    public static final String START_FAIL_REASON_TAG = "failReason";
    public static final String START_FIRST_RUN_TAG = "firstRun";
    public static final String START_SUCCESS_REASON_TAG = "successReason";
    public static final String SURFACE_ANNOTATION = "surface";
    public static final String WARM_START_TIME_SINCE_APP_LAUNCH_TAG = "sinceAppLaunch";
    public int activitiesCreated;
    public int activityOnBackPressedPointIndex;
    public int activityOnCreatePointIndex;
    public int activityOnDestroyPointIndex;
    public int activityOnFinishPointIndex;
    public int activityOnPausePointIndex;
    public int activityOnResumePointIndex;
    public int activityOnStartPointIndex;
    public int activityOnStopPointIndex;
    public CopyOnWriteArrayList<DBJ<ColdInfo>.ActivityRecord> activityRecordStack;
    public int coldStartMarkerId;
    public CopyOnWriteArrayList<DBJ<ColdInfo>.NavEventRecord> navEventRecords;
    public final Executor serialExecutor;

    public DBJ(Executor executor) {
        C7384Etj.A0Y(executor, 0);
        this.serialExecutor = executor;
        this.coldStartMarkerId = -1;
        this.activityRecordStack = new CopyOnWriteArrayList<>();
        this.navEventRecords = new CopyOnWriteArrayList<>();
        executor.execute(new DBR(this));
    }

    public abstract void annotateEnd(int i, MarkerEditor markerEditor, boolean z, Activity activity);

    public void annotatePredictedSurfaces(MarkerEditor markerEditor, String str, boolean z, boolean z2) {
    }

    public abstract void annotateStart(MarkerEditor markerEditor, Context context);

    public abstract QuickPerformanceLogger getQpl();

    public final void onEndStart(int i, long j, short s, String str, boolean z, boolean z2, int i2, int i3, DKP dkp, DKP dkp2, String str2, boolean z3, Activity activity) {
        this.serialExecutor.execute(new DBM(activity, dkp, dkp2, this, str2, str, this.activityRecordStack, this.navEventRecords, i, i2, i3, j, s, z3, z, z2));
    }

    public final void onIntentLaunched(int i, long j, String str) {
        this.serialExecutor.execute(new DBP(this, str, i, j));
    }

    public final void onLifecycleEvent(int i, long j, int i2, Activity activity) {
        C7384Etj.A0Y(activity, 3);
        this.serialExecutor.execute(new DBK(activity, this, i2, i, j));
    }

    public void onTrackStartCommon() {
        this.activityOnCreatePointIndex = 0;
        this.activityOnDestroyPointIndex = 0;
        this.activityOnStartPointIndex = 0;
        this.activityOnStopPointIndex = 0;
        this.activityOnResumePointIndex = 0;
        this.activityOnPausePointIndex = 0;
        this.activityOnFinishPointIndex = 0;
        this.activityOnBackPressedPointIndex = 0;
        this.activitiesCreated = 0;
    }

    public final void onTrackWarmStart(Activity activity, long j, long j2, boolean z) {
        this.serialExecutor.execute(new DBN(activity, this, j, j2, z));
    }

    public final void setActivityRecordStack(CopyOnWriteArrayList<DBJ<ColdInfo>.ActivityRecord> copyOnWriteArrayList) {
        C7384Etj.A0Y(copyOnWriteArrayList, 0);
        this.activityRecordStack = copyOnWriteArrayList;
    }

    public final void setNavEventRecords(CopyOnWriteArrayList<DBJ<ColdInfo>.NavEventRecord> copyOnWriteArrayList) {
        C7384Etj.A0Y(copyOnWriteArrayList, 0);
        this.navEventRecords = copyOnWriteArrayList;
    }

    public abstract int startColdStart(long j, ColdInfo coldinfo);

    public abstract int startHotStart(long j);

    public abstract int startWarmStart(long j);

    public abstract void waitForQpl();

    public final CopyOnWriteArrayList<DBJ<ColdInfo>.ActivityRecord> getActivityRecordStack() {
        return this.activityRecordStack;
    }

    public final CopyOnWriteArrayList<DBJ<ColdInfo>.NavEventRecord> getNavEventRecords() {
        return this.navEventRecords;
    }

    public final Executor getSerialExecutor() {
        return this.serialExecutor;
    }

    public final void onBackgroundStartupModeKnown(Application application) {
        this.serialExecutor.execute(new RunnableC4876DAf(application, this));
    }

    public final void onTrackColdStart(long j, ColdInfo coldinfo, boolean z) {
        F1E f1e = new F1E();
        f1e.element = -1;
        if (z) {
            HatchStartupQpl.Companion.markerStart(j);
            f1e.element = 734857510;
        }
        this.serialExecutor.execute(new DAP(this, coldinfo, f1e, j, z));
    }

    public final void onTrackHotStart(Activity activity, long j) {
        this.serialExecutor.execute(new DBI(activity, this, j));
    }

    public void annotateSplitNames(MarkerEditor markerEditor) {
    }

    public void onAfterEndStart(long j) {
    }

    public void onTentativeSurface(Activity activity, int i) {
    }

    public void annotateActivityRecords(MarkerEditor markerEditor, List<DBJ<ColdInfo>.ActivityRecord> list, List<? extends DBJ<ColdInfo>.NavEventRecord> list2) {
    }
}
