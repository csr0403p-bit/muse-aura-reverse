package com.facebook.acra.anr.multisignal;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BeQ;
import X.C3cG;
import X.C5V;
import X.C60O;
import X.C6D;
import X.C6N;
import X.C70;
import X.C7Z;
import X.C8f;
import X.C8j3;
import X.CFK;
import X.FGI;
import X.InterfaceC3284C7y;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import com.facebook.acra.anr.ANRDetectorListener;
import com.facebook.acra.anr.ANRReportProvider;
import com.facebook.acra.anr.IANRDetector;
import com.facebook.acra.anr.SigquitRecord;
import com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener;
import com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor;
import com.facebook.acra.anr.processmonitor.ProcessErrorStateListener;
import com.facebook.acra.anr.sigquit.SigquitDetector;
import com.facebook.acra.anr.sigquit.SigquitDetectorLacrima;
import com.facebook.acra.anr.sigquit.SigquitDetectorListener;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class MultiSignalANRDetector implements SigquitDetectorListener, IANRDetector {
    public static final String MULTI_SIGNAL_DETECTOR_THREAD_NAME = "MultiSignalANRDetectorThread";
    public static final Map<C8f, MultiSignalANRDetector> sInstances = BV4.A0u();
    public ANRReportProvider mANRReportProvider;
    public long mANRReportTime;
    public final C8f mAnrDetectorConfig;
    public ANRDetectorListener mAnrDetectorListener;
    public final InterfaceC3284C7y mAnrStagesListener;
    public final Runnable mConfirmationExpiredRunnable;
    public C6N mCurrentState;
    public long mDetectorStartTime;
    public BeQ mDurationHistoryAtSigquitTime;
    public BeQ mDurationHistoryAtTracesAvailableTime;
    public int mErrorCheckCounter;
    public final ProcessErrorStateListener mErrorMonitorListener;
    public final C7Z mForegroundTransitionListener;
    public boolean mHasPendingReport;
    public long mLastSigquitReceivedTime;
    public long mLastSigquitReceivedUptime;
    public String mLogTag;
    public long mLostErrorDetectionTime;
    public boolean mMovedToBackground;
    public boolean mNativeHookInPlace;
    public final AtomicBoolean mNativeLibraryInitialized;
    public final ConditionVariable mNativeLibraryInitializedCV;
    public final OnMainThreadUnblockedRunnable mOnMainThreadUnblockedRunnable;
    public volatile boolean mPaused;
    public ProcessAnrErrorMonitor mProcessAnrErrorMonitor;
    public boolean mProcessAnrErrorMonitorPaused;
    public final HandlerThread mProcessingThread;
    public final Handler mProcessingThreadHandler;
    public boolean mRunning;
    public volatile Long mSigQuitCode;
    public volatile Long mSigQuitPid;
    public volatile Long mSigQuitUid;
    public long mSigquitCallbackTime;
    public long mSigquitCallbackUptime;
    public String mSigquitData;
    public final SigquitDetector mSigquitDetector;
    public String mSigquitFileName;
    public final AtomicReference<TraceDataHook> mSigquitHook;
    public long mSigquitReceivedTime;
    public long mSigquitReceivedUptime;
    public final Object mStartStopLock;
    public boolean mStartedInForegroundV1;
    public boolean mStartedInForegroundV2;
    public String mSystemErrorMessage;
    public String mSystemErrorTag;
    public long mSystemErrorUptime;
    public final AtomicReference<TraceDataHook> mTracesHook;
    public boolean mWaitingForConfirmation;
    public boolean mWaitingForMainThreadBlockedCheck;

    public enum ActionOnSigquit {
        IGNORE,
        CLEAR_CURRENT_ERROR_STATE,
        START_REPORT
    }

    public enum Event {
        SIGQUIT_RECEIVED,
        AM_CONFIRMED,
        AM_EXPIRED,
        MT_UNBLOCKED,
        DIALOG_DISMISSED
    }

    public class OnMainThreadUnblockedRunnable implements Runnable {
        public long mUptimeMillisWhenSomethingCouldRunOnMainThread;

        public OnMainThreadUnblockedRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
            multiSignalANRDetector.mWaitingForMainThreadBlockedCheck = false;
            multiSignalANRDetector.setCurrentAnrState(Event.MT_UNBLOCKED);
            MultiSignalANRDetector multiSignalANRDetector2 = MultiSignalANRDetector.this;
            if (multiSignalANRDetector2.mHasPendingReport) {
                C6D c6d = multiSignalANRDetector2.mAnrDetectorConfig.A03;
                c6d.A07 = this.mUptimeMillisWhenSomethingCouldRunOnMainThread;
                C6D.A00(c6d);
            }
            MultiSignalANRDetector multiSignalANRDetector3 = MultiSignalANRDetector.this;
            if (multiSignalANRDetector3.isCurrentStateNoAnrDetected()) {
                multiSignalANRDetector3.errorCleared();
            }
        }

        public void setUptimeMillis(long j) {
            this.mUptimeMillisWhenSomethingCouldRunOnMainThread = j;
        }
    }

    public interface TraceDataHook {
        void handleTracesExternally(String str);
    }

    /* loaded from: classes6.dex */
    public class TraceDataResult {
        public String tracesFilePath = null;
        public String errMsg = null;

        public String getErrMsg() {
            return this.errMsg;
        }

        public String getTracesFilePath() {
            return this.tracesFilePath;
        }

        public boolean setError(String str) {
            this.errMsg = str;
            this.tracesFilePath = null;
            return false;
        }

        public boolean setTracesFilePath(String str) {
            this.tracesFilePath = str;
            this.errMsg = null;
            return true;
        }
    }

    public static MultiSignalANRDetector getInstance(C8f c8f) {
        return getInstance(c8f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void startReport(com.facebook.acra.anr.multisignal.MultiSignalANRDetector.Event r40) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r39 = this;
            r0 = 1
            r4 = r39
            r4.mHasPendingReport = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.mANRReportTime = r0
            com.facebook.acra.anr.ANRDetectorListener r8 = r4.mAnrDetectorListener
            r11 = 0
            if (r8 == 0) goto Lbc
            java.lang.String r29 = r8.getBlackBoxTraceId()
            java.lang.String r30 = r8.getLongStallTraceId()
            r8.onStartANRDataCapture()
        L1b:
            com.facebook.acra.anr.multisignal.MultiSignalANRDetector$Event r0 = com.facebook.acra.anr.multisignal.MultiSignalANRDetector.Event.SIGQUIT_RECEIVED
            r16 = 0
            r13 = r40
            if (r13 != r0) goto Lb1
            java.lang.String r7 = r4.mSigquitData
            java.lang.String r12 = r4.mSigquitFileName
            long r0 = r4.mSigquitCallbackUptime
            long r2 = r4.mSigquitCallbackTime
            long r5 = r4.mSigquitReceivedUptime
            long r9 = r4.mSigquitReceivedTime
            if (r7 != 0) goto Lae
            if (r12 != 0) goto Lae
        L33:
            java.io.ByteArrayOutputStream r7 = X.BV4.A0F()
            com.facebook.acra.anr.StackTraceDumper.dumpStackTraces(r7, r11, r11)
            java.lang.String r7 = r7.toString()
            r40 = 0
        L40:
            X.C8f r11 = r4.mAnrDetectorConfig
            X.C6D r11 = r11.A03
            r19 = r11
            com.facebook.acra.anr.ANRReportProvider r11 = r4.mANRReportProvider
            boolean r37 = X.AnonymousClass002.A1Y(r11)
            boolean r11 = r4.mStartedInForegroundV1
            r18 = r11
            boolean r11 = r4.mStartedInForegroundV2
            long r33 = android.os.SystemClock.uptimeMillis()
            long r14 = r4.mDetectorStartTime
            java.lang.Long r22 = java.lang.Long.valueOf(r0)
            java.lang.Long r23 = java.lang.Long.valueOf(r2)
            java.lang.Long r24 = java.lang.Long.valueOf(r5)
            java.lang.Long r25 = java.lang.Long.valueOf(r9)
            X.BeQ r6 = r4.mDurationHistoryAtSigquitTime
            X.BeQ r5 = r4.mDurationHistoryAtTracesAvailableTime
            X.C6N r3 = r4.mCurrentState
            java.lang.Long r2 = r4.mSigQuitCode
            java.lang.Long r1 = r4.mSigQuitPid
            java.lang.Long r0 = r4.mSigQuitUid
            r21 = r3
            r26 = r2
            r27 = r1
            r28 = r0
            r31 = r7
            r32 = r12
            r35 = r14
            r38 = r18
            r39 = r11
            r18 = r19
            r19 = r6
            r20 = r5
            r18.A01(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r37, r38, r39, r40)
            com.facebook.acra.anr.multisignal.MultiSignalANRDetector$Event r0 = com.facebook.acra.anr.multisignal.MultiSignalANRDetector.Event.AM_CONFIRMED
            if (r13 != r0) goto L96
            r4.addActivityManagerConfirmationDataToReport()
        L96:
            long r2 = r4.mLostErrorDetectionTime
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 == 0) goto La8
            X.C8f r0 = r4.mAnrDetectorConfig
            X.C6D r1 = r0.A03
            r0 = 3
            r1.A09 = r2
            r1.A01 = r0
            X.C6D.A00(r1)
        La8:
            if (r8 == 0) goto Lad
            r8.onEndANRDataCapture()
        Lad:
            return
        Lae:
            r40 = 1
            goto L40
        Lb1:
            r12 = r11
            r9 = 0
            r0 = 0
            r2 = 0
            r5 = 0
            goto L33
        Lbc:
            r29 = r11
            r30 = r11
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.startReport(com.facebook.acra.anr.multisignal.MultiSignalANRDetector$Event):void");
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void pause() {
        this.mPaused = true;
        this.mProcessAnrErrorMonitor.pause();
        this.mSigquitDetector.stopDetector();
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void resume() {
        this.mPaused = false;
        this.mProcessAnrErrorMonitor.resume();
        this.mSigquitDetector.startDetector();
    }

    public void setCurrentAnrState(Event event) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        setCurrentAnrState(event, false, false);
    }

    /* renamed from: com.facebook.acra.anr.multisignal.MultiSignalANRDetector$9, reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass9 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$reliability$anr$AnrState;

        static {
            int[] iArr = new int[C6N.values().length];
            $SwitchMap$com$facebook$reliability$anr$AnrState = iArr;
            try {
                BV6.A1T(iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[8] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[9] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private void addActivityManagerConfirmationDataToReport() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        C6D c6d = this.mAnrDetectorConfig.A03;
        String str = this.mSystemErrorMessage;
        String str2 = this.mSystemErrorTag;
        long j = this.mSystemErrorUptime;
        c6d.A0O = str;
        c6d.A0P = str2;
        c6d.A08 = j;
        C6D.A00(c6d);
    }

    private void addInfoToReport(Event event) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (event == Event.SIGQUIT_RECEIVED) {
            addSigquitDataToReport();
        } else {
            if (event != Event.AM_CONFIRMED) {
                throw C60O.A0i("Event should be SIGQUIT_RECEIVED or AM_CONFIRMED");
            }
            addActivityManagerConfirmationDataToReport();
        }
    }

    private void addSigquitDataToReport() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        C6D c6d = this.mAnrDetectorConfig.A03;
        String str = this.mSigquitData;
        String str2 = this.mSigquitFileName;
        long j = this.mSigquitCallbackUptime;
        long j2 = this.mSigquitCallbackTime;
        long j3 = this.mSigquitReceivedUptime;
        long j4 = this.mSigquitReceivedTime;
        BeQ beQ = this.mDurationHistoryAtSigquitTime;
        BeQ beQ2 = this.mDurationHistoryAtTracesAvailableTime;
        c6d.A0M = str;
        c6d.A0N = str2;
        c6d.A0Q = null;
        c6d.A0V = true;
        c6d.A0H = Long.valueOf(j);
        c6d.A0G = Long.valueOf(j2);
        c6d.A0J = Long.valueOf(j3);
        c6d.A0I = Long.valueOf(j4);
        c6d.A0C = beQ;
        c6d.A0D = beQ2;
        C6D.A00(c6d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void errorCleared() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        CFK.A0H(this.mLogTag, "Clearing error state has pending report %b", Boolean.valueOf(this.mHasPendingReport));
        if (this.mHasPendingReport) {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.mANRReportTime;
            C6D c6d = this.mAnrDetectorConfig.A03;
            c6d.A0B = jUptimeMillis;
            C6D.A00(c6d);
            c6d.A0R = false;
            this.mHasPendingReport = false;
        }
        this.mSystemErrorMessage = null;
        this.mSystemErrorTag = null;
        this.mSystemErrorUptime = 0L;
        this.mSigquitReceivedUptime = 0L;
        this.mSigquitReceivedTime = 0L;
        this.mSigquitCallbackUptime = 0L;
        this.mSigquitData = null;
        this.mSigquitFileName = null;
        this.mSigquitCallbackTime = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ActionOnSigquit getActionOnSigquit() {
        C6N c6n = this.mCurrentState;
        return (c6n == C6N.A04 || c6n == C6N.A05 || c6n == C6N.A06) ? ActionOnSigquit.START_REPORT : ActionOnSigquit.IGNORE;
    }

    public static void getTraceDataFromHook(final TraceDataHook traceDataHook) {
        Iterator itA10 = BV5.A10(sInstances);
        if (itA10.hasNext()) {
            MultiSignalANRDetector multiSignalANRDetector = (MultiSignalANRDetector) itA10.next();
            if (multiSignalANRDetector.mNativeLibraryInitialized.get()) {
                multiSignalANRDetector.triggerSigquit(traceDataHook);
            } else {
                new Thread() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.8
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        MultiSignalANRDetector.this.mNativeLibraryInitializedCV.block();
                        MultiSignalANRDetector.this.triggerSigquit(traceDataHook);
                    }
                }.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isCurrentStateNoAnrDetected() {
        return AnonymousClass002.A1Z(this.mCurrentState, C6N.A04);
    }

    private boolean isCurrentStateUnconfirmed() {
        C6N c6n = this.mCurrentState;
        return c6n == C6N.A0A || c6n == C6N.A0B;
    }

    private boolean isDebuggerConnected() {
        return false;
    }

    public static boolean isTest() {
        return false;
    }

    private void logUnexpectedStateTransition(Event event) {
        ANRReportProvider aNRReportProvider;
        CFK.A0H(this.mLogTag, "Unexpected event %s received in state %s", event, this.mCurrentState);
        if (event == Event.SIGQUIT_RECEIVED || (aNRReportProvider = this.mANRReportProvider) == null) {
            return;
        }
        StringBuilder sbA0f = C3cG.A0f(event, "Unexpected event ");
        sbA0f.append(" received in state ");
        aNRReportProvider.reportSoftError("Unexpected event", C3cG.A0Q(C8j3.A14(this.mCurrentState, sbA0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mainThreadUnblocked() {
        CFK.A06(this.mLogTag, "Running on the main thread");
        OnMainThreadUnblockedRunnable onMainThreadUnblockedRunnable = this.mOnMainThreadUnblockedRunnable;
        onMainThreadUnblockedRunnable.mUptimeMillisWhenSomethingCouldRunOnMainThread = SystemClock.uptimeMillis();
        this.mProcessingThreadHandler.post(onMainThreadUnblockedRunnable);
    }

    private void maybeStartMainThreadBlockedCheck() {
        if (this.mWaitingForMainThreadBlockedCheck) {
            return;
        }
        C6N c6n = this.mCurrentState;
        if (c6n == C6N.A0A || c6n == C6N.A05) {
            CFK.A06(this.mLogTag, "Posting main thread check");
            this.mWaitingForMainThreadBlockedCheck = true;
            this.mAnrDetectorConfig.A02.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.7
                @Override // java.lang.Runnable
                public void run() {
                    MultiSignalANRDetector.this.mainThreadUnblocked();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeStartReport(Event event) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        String str;
        CFK.A0H(this.mLogTag, "On maybeStartReport event: %s has pending report %b", event, Boolean.valueOf(this.mHasPendingReport));
        if (this.mHasPendingReport) {
            addInfoToReport(event);
            return;
        }
        if (this.mStartedInForegroundV2 || this.mStartedInForegroundV1) {
            boolean zShouldUploadAnrReports = shouldUploadAnrReports();
            maybeStartTimerForActivityManagerConfirmation();
            if (zShouldUploadAnrReports) {
                CFK.A06(this.mLogTag, "Reporting ANR start");
                try {
                    startReport(event);
                    return;
                } catch (IOException e) {
                    CFK.A0J(this.mLogTag, e, "Error starting ANR report");
                    this.mHasPendingReport = false;
                    return;
                }
            }
            C6D c6d = this.mAnrDetectorConfig.A03;
            boolean z = this.mStartedInForegroundV1;
            boolean z2 = this.mStartedInForegroundV2;
            c6d.A0S = z;
            c6d.A0T = z2;
            C6D.A00(c6d);
        }
        if (event != Event.SIGQUIT_RECEIVED || (str = this.mSigquitFileName) == null) {
            return;
        }
        BV4.A0G(str).delete();
    }

    private void maybeStartTimerForActivityManagerConfirmation() {
        if (this.mWaitingForConfirmation || !isCurrentStateUnconfirmed()) {
            return;
        }
        CFK.A06(this.mLogTag, "Starting timer for AM confirmation");
        this.mWaitingForConfirmation = true;
        this.mProcessingThreadHandler.postDelayed(this.mConfirmationExpiredRunnable, 30000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setASLState(com.facebook.acra.anr.multisignal.MultiSignalANRDetector.Event r7, boolean r8, boolean r9) {
        /*
            r6 = this;
            com.facebook.acra.anr.multisignal.MultiSignalANRDetector$Event r0 = com.facebook.acra.anr.multisignal.MultiSignalANRDetector.Event.SIGQUIT_RECEIVED
            boolean r5 = X.AnonymousClass002.A1Z(r7, r0)
            X.C8f r0 = r6.mAnrDetectorConfig
            X.C70 r4 = r0.A00
            r3 = 0
            if (r5 == 0) goto L12
            com.facebook.acra.anr.multisignal.MultiSignalANRDetector$6 r3 = new com.facebook.acra.anr.multisignal.MultiSignalANRDetector$6
            r3.<init>()
        L12:
            X.C6N r1 = r6.mCurrentState
            X.C6N r0 = X.C6N.A0A
            if (r1 == r0) goto L1d
            X.C6N r0 = X.C6N.A05
            r2 = 0
            if (r1 != r0) goto L1e
        L1d:
            r2 = 1
        L1e:
            if (r5 == 0) goto L33
            if (r2 == 0) goto L33
            X.C6z r4 = (X.C3272C6z) r4
            X.C64 r0 = r4.A00
            X.C64.A00(r0, r1)
            if (r3 == 0) goto L2e
            r3.run()
        L2e:
            r6.mStartedInForegroundV1 = r8
            r6.mStartedInForegroundV2 = r9
        L32:
            return
        L33:
            X.C5W r0 = X.C5V.A04
            if (r0 != 0) goto L53
            r9 = 0
        L38:
            X.C5W r0 = X.C5V.A04
            if (r0 != 0) goto L4e
            r8 = 0
        L3d:
            X.C6N r1 = r6.mCurrentState
            X.C6z r4 = (X.C3272C6z) r4
            X.C64 r0 = r4.A00
            X.C64.A00(r0, r1)
            if (r3 == 0) goto L4b
            r3.run()
        L4b:
            if (r2 == 0) goto L32
            goto L2e
        L4e:
            X.C5W r0 = X.C5V.A04
            boolean r8 = r0.A04
            goto L3d
        L53:
            X.C5W r0 = X.C5V.A04
            boolean r9 = r0.A04
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.setASLState(com.facebook.acra.anr.multisignal.MultiSignalANRDetector$Event, boolean, boolean):void");
    }

    private boolean shouldUploadAnrReports() {
        ANRReportProvider aNRReportProvider = this.mANRReportProvider;
        if (aNRReportProvider != null) {
            return aNRReportProvider.shouldCollectAndUploadANRReports();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void triggerSigquit(TraceDataHook traceDataHook) {
        this.mSigquitHook.set(traceDataHook);
        this.mSigquitDetector.doNotIgnoreNextSiguit();
        Process.sendSignal(Process.myPid(), 3);
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public long getANRReceivedTime() {
        return this.mSigquitReceivedTime;
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public long getANRReceivedUpTime() {
        return this.mSigquitReceivedUptime;
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void nativeLibraryLoaded(boolean z) {
        this.mSigquitDetector.init(this.mAnrDetectorConfig, shouldUploadAnrReports());
        this.mSigquitDetector.installSignalHandler(this.mProcessingThreadHandler, z);
        this.mNativeLibraryInitialized.set(true);
        this.mNativeLibraryInitializedCV.open();
    }

    @Override // com.facebook.acra.anr.sigquit.SigquitDetectorListener
    public void onHookedMethods(boolean z) {
        synchronized (this.mStartStopLock) {
            this.mNativeHookInPlace = z;
        }
    }

    @Override // com.facebook.acra.anr.sigquit.SigquitDetectorListener
    public void onSigquit(boolean z, long j, long j2, long j3) {
        try {
            Trace.beginSection("SigquitDetected");
            if (!this.mPaused) {
                TraceDataHook traceDataHook = (TraceDataHook) C8j3.A10(this.mSigquitHook);
                if (traceDataHook != null) {
                    this.mTracesHook.set(traceDataHook);
                } else {
                    this.mLastSigquitReceivedUptime = SystemClock.uptimeMillis();
                    this.mLastSigquitReceivedTime = System.currentTimeMillis();
                    if (z) {
                        this.mSigQuitCode = Long.valueOf(j);
                        this.mSigQuitPid = Long.valueOf(j2);
                        this.mSigQuitUid = Long.valueOf(j3);
                    }
                    this.mDurationHistoryAtSigquitTime = this.mProcessAnrErrorMonitor.getDurationHistory();
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.facebook.acra.anr.sigquit.SigquitDetectorListener
    public void onSigquitTracesAvailable(final String str, final String str2, final boolean z, final boolean z2) {
        try {
            Trace.beginSection("Sigquit traces available");
            if (!this.mPaused) {
                CFK.A06(this.mLogTag, "On onSigquitTracesAvailable call");
                synchronized (this.mStartStopLock) {
                    if (this.mRunning) {
                        TraceDataHook traceDataHook = (TraceDataHook) C8j3.A10(this.mTracesHook);
                        if (traceDataHook != null) {
                            traceDataHook.handleTracesExternally(str2);
                        } else {
                            this.mDurationHistoryAtTracesAvailableTime = this.mProcessAnrErrorMonitor.getDurationHistory();
                            final long jUptimeMillis = SystemClock.uptimeMillis();
                            final long jCurrentTimeMillis = System.currentTimeMillis();
                            this.mProcessingThreadHandler.post(new Runnable(this) { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.5
                                public final /* synthetic */ MultiSignalANRDetector this$0;

                                {
                                    this.this$0 = this;
                                }

                                @Override // java.lang.Runnable
                                public void run() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                                    MultiSignalANRDetector multiSignalANRDetector = this.this$0;
                                    ActionOnSigquit actionOnSigquit = multiSignalANRDetector.getActionOnSigquit();
                                    if (actionOnSigquit == ActionOnSigquit.IGNORE) {
                                        CFK.A06(multiSignalANRDetector.mLogTag, "Ignoring new sigquit");
                                        String str3 = str2;
                                        if (str3 != null) {
                                            BV4.A0G(str3).delete();
                                        }
                                        this.this$0.mSigquitDetector.cleanupAppStateFile();
                                        MultiSignalANRDetector multiSignalANRDetector2 = this.this$0;
                                        if (multiSignalANRDetector2.mHasPendingReport) {
                                            C6D c6d = multiSignalANRDetector2.mAnrDetectorConfig.A03;
                                            c6d.A06 = jUptimeMillis;
                                            C6D.A00(c6d);
                                            return;
                                        }
                                        return;
                                    }
                                    multiSignalANRDetector.mSigquitReceivedTime = multiSignalANRDetector.mLastSigquitReceivedTime;
                                    multiSignalANRDetector.mSigquitReceivedUptime = multiSignalANRDetector.mLastSigquitReceivedUptime;
                                    ActionOnSigquit actionOnSigquit2 = ActionOnSigquit.CLEAR_CURRENT_ERROR_STATE;
                                    String str4 = multiSignalANRDetector.mLogTag;
                                    if (actionOnSigquit == actionOnSigquit2) {
                                        CFK.A06(str4, "Will clear error state");
                                        this.this$0.errorCleared();
                                    } else {
                                        CFK.A06(str4, "Will start new report");
                                    }
                                    MultiSignalANRDetector multiSignalANRDetector3 = this.this$0;
                                    multiSignalANRDetector3.mSigquitCallbackUptime = jUptimeMillis;
                                    multiSignalANRDetector3.mSigquitData = str;
                                    multiSignalANRDetector3.mSigquitFileName = str2;
                                    multiSignalANRDetector3.mSigquitCallbackTime = jCurrentTimeMillis;
                                    Event event = Event.SIGQUIT_RECEIVED;
                                    multiSignalANRDetector3.setCurrentAnrState(event, z, z2);
                                    SigquitRecord.updateRecords(jUptimeMillis, this.this$0.mAnrDetectorConfig.A00());
                                    this.this$0.maybeStartReport(event);
                                }
                            });
                        }
                    }
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void start() {
        synchronized (this.mStartStopLock) {
            if (!this.mRunning) {
                CFK.A06(this.mLogTag, "Starting");
                this.mRunning = true;
                this.mDetectorStartTime = SystemClock.uptimeMillis();
                this.mProcessAnrErrorMonitor.startMonitoringAfterDelay(this.mErrorMonitorListener, 0L);
                final C70 c70 = this.mAnrDetectorConfig.A00;
                this.mProcessingThreadHandler.post(new Runnable(this) { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.4
                    public final /* synthetic */ MultiSignalANRDetector this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if ((C5V.A04 == null || !C5V.A04.A04) && (C5V.A04 == null || !C5V.A04.A04)) {
                            this.this$0.mMovedToBackground = true;
                        }
                        C70 c702 = c70;
                        C7Z c7z = this.this$0.mForegroundTransitionListener;
                        List<C7Z> list = c702.A00;
                        synchronized (list) {
                            list.add(c7z);
                        }
                    }
                });
            }
        }
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void stop(IANRDetector.ANRDetectorStopListener aNRDetectorStopListener) {
        synchronized (this.mStartStopLock) {
            if (this.mRunning) {
                CFK.A06(this.mLogTag, "Stopping");
                this.mRunning = false;
                this.mProcessAnrErrorMonitor.stopMonitoring();
                this.mProcessingThreadHandler.removeCallbacks(this.mConfirmationExpiredRunnable);
                if (this.mNativeHookInPlace) {
                    this.mSigquitDetector.stopDetector();
                }
                C70 c70 = this.mAnrDetectorConfig.A00;
                C7Z c7z = this.mForegroundTransitionListener;
                List<C7Z> list = c70.A00;
                synchronized (list) {
                    list.remove(c7z);
                }
                if (aNRDetectorStopListener != null) {
                    aNRDetectorStopListener.onStop();
                }
            }
        }
    }

    /* renamed from: -$$Nest$misDebuggerConnected, reason: not valid java name */
    public static /* bridge */ /* synthetic */ boolean m89$$Nest$misDebuggerConnected(MultiSignalANRDetector multiSignalANRDetector) {
        return false;
    }

    public MultiSignalANRDetector(C8f c8f, InterfaceC3284C7y interfaceC3284C7y) {
        String str;
        this.mLogTag = "MultiSignalANRDetector";
        this.mStartStopLock = C3cG.A0T();
        this.mNativeLibraryInitialized = BV4.A12(false);
        this.mNativeLibraryInitializedCV = new ConditionVariable();
        this.mSigquitHook = BV4.A15();
        this.mTracesHook = BV4.A15();
        this.mDurationHistoryAtSigquitTime = null;
        this.mDurationHistoryAtTracesAvailableTime = null;
        this.mOnMainThreadUnblockedRunnable = new OnMainThreadUnblockedRunnable();
        this.mConfirmationExpiredRunnable = new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.1
            @Override // java.lang.Runnable
            public void run() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                CFK.A06(MultiSignalANRDetector.this.mLogTag, "On confirmation expired");
                MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                if (multiSignalANRDetector.mWaitingForConfirmation) {
                    multiSignalANRDetector.setCurrentAnrState(Event.AM_EXPIRED);
                    MultiSignalANRDetector multiSignalANRDetector2 = MultiSignalANRDetector.this;
                    multiSignalANRDetector2.mWaitingForConfirmation = false;
                    if (multiSignalANRDetector2.mHasPendingReport) {
                        C6D c6d = multiSignalANRDetector2.mAnrDetectorConfig.A03;
                        c6d.A03 = SystemClock.uptimeMillis();
                        C6D.A00(c6d);
                    }
                    MultiSignalANRDetector multiSignalANRDetector3 = MultiSignalANRDetector.this;
                    if (multiSignalANRDetector3.isCurrentStateNoAnrDetected()) {
                        multiSignalANRDetector3.errorCleared();
                    }
                }
            }
        };
        this.mErrorMonitorListener = new DefaultProcessErrorStateListener() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2
            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onCheckFailed() {
                CFK.A04(MultiSignalANRDetector.this.mLogTag, "onCheckFailed");
                MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                multiSignalANRDetector.mLostErrorDetectionTime = SystemClock.uptimeMillis();
                multiSignalANRDetector.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.3
                    @Override // java.lang.Runnable
                    public void run() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                        MultiSignalANRDetector multiSignalANRDetector2 = MultiSignalANRDetector.this;
                        if (multiSignalANRDetector2.mHasPendingReport) {
                            C6D c6d = multiSignalANRDetector2.mAnrDetectorConfig.A03;
                            c6d.A09 = multiSignalANRDetector2.mLostErrorDetectionTime;
                            c6d.A01 = 3;
                            C6D.A00(c6d);
                        }
                    }
                });
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onCheckPerformed() {
                MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.5
                    @Override // java.lang.Runnable
                    public void run() {
                        MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                        if (multiSignalANRDetector.mMovedToBackground) {
                            int i = multiSignalANRDetector.mErrorCheckCounter + 1;
                            multiSignalANRDetector.mErrorCheckCounter = i;
                            if (i % 5 == 0) {
                                CFK.A06(multiSignalANRDetector.mLogTag, "Pausing error state checks");
                                MultiSignalANRDetector.this.mProcessAnrErrorMonitor.pause();
                                MultiSignalANRDetector.this.mProcessAnrErrorMonitorPaused = true;
                            }
                        }
                    }
                });
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onErrorCleared() {
                try {
                    Trace.beginSection("ANR Error state cleared");
                    CFK.A06(MultiSignalANRDetector.this.mLogTag, "On onErrorCleared");
                    MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.2
                        @Override // java.lang.Runnable
                        public void run() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                            MultiSignalANRDetector.this.setCurrentAnrState(Event.DIALOG_DISMISSED);
                            MultiSignalANRDetector.this.errorCleared();
                        }
                    });
                } finally {
                    Trace.endSection();
                }
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onErrorDetected(final String str2, final String str3) {
                try {
                    Trace.beginSection("ANR Error state detected");
                    CFK.A0H(MultiSignalANRDetector.this.mLogTag, "On error detected %s %s", str2, str3);
                    synchronized (MultiSignalANRDetector.this.mStartStopLock) {
                        if (MultiSignalANRDetector.this.mRunning) {
                            MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable(this) { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.1
                                public final /* synthetic */ AnonymousClass2 this$1;

                                {
                                    this.this$1 = this;
                                }

                                @Override // java.lang.Runnable
                                public void run() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                                    MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                                    CFK.A0H(multiSignalANRDetector.mLogTag, "On error detected waiting for confirmation %b", Boolean.valueOf(multiSignalANRDetector.mWaitingForConfirmation));
                                    MultiSignalANRDetector multiSignalANRDetector2 = MultiSignalANRDetector.this;
                                    multiSignalANRDetector2.mSystemErrorMessage = str2;
                                    multiSignalANRDetector2.mSystemErrorTag = str3;
                                    multiSignalANRDetector2.mSystemErrorUptime = SystemClock.uptimeMillis();
                                    Event event = Event.AM_CONFIRMED;
                                    multiSignalANRDetector2.setCurrentAnrState(event);
                                    MultiSignalANRDetector multiSignalANRDetector3 = MultiSignalANRDetector.this;
                                    if (multiSignalANRDetector3.mWaitingForConfirmation) {
                                        multiSignalANRDetector3.mProcessingThreadHandler.removeCallbacks(multiSignalANRDetector3.mConfirmationExpiredRunnable);
                                        multiSignalANRDetector3 = MultiSignalANRDetector.this;
                                        multiSignalANRDetector3.mWaitingForConfirmation = false;
                                    }
                                    multiSignalANRDetector3.maybeStartReport(event);
                                }
                            });
                        }
                    }
                } finally {
                    Trace.endSection();
                }
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onStart() {
                CFK.A06(MultiSignalANRDetector.this.mLogTag, "Started monitoring");
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public boolean onErrorDetectOnOtherProcess(final String str2, final String str3, final String str4) {
                final long jUptimeMillis = SystemClock.uptimeMillis();
                MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable(this) { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.4
                    public final /* synthetic */ AnonymousClass2 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                        MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                        if (multiSignalANRDetector.mHasPendingReport) {
                            C6D c6d = multiSignalANRDetector.mAnrDetectorConfig.A03;
                            String str5 = str2;
                            String str6 = str3;
                            String str7 = str4;
                            long j = jUptimeMillis;
                            List<String> list = c6d.A0f;
                            if (list.size() < 5) {
                                StringBuilder sbA0g = C3cG.A0g(str5);
                                sbA0g.append(',');
                                sbA0g.append(j);
                                sbA0g.append(',');
                                sbA0g.append(str6);
                                sbA0g.append(',');
                                list.add(AnonymousClass001.A0v(str7, sbA0g));
                                C6D.A00(c6d);
                            }
                        }
                    }
                });
                return true;
            }
        };
        this.mForegroundTransitionListener = new C7Z() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.3
            @Override // X.C7Z
            public void onBackground() {
                MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        CFK.A06(MultiSignalANRDetector.this.mLogTag, "Moving to background");
                        MultiSignalANRDetector.this.mMovedToBackground = true;
                    }
                });
            }

            @Override // X.C7Z
            public void onForeground() {
                MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                        multiSignalANRDetector.mMovedToBackground = false;
                        if (multiSignalANRDetector.mProcessAnrErrorMonitorPaused) {
                            CFK.A06(multiSignalANRDetector.mLogTag, "Resuming error state checks");
                            MultiSignalANRDetector.this.mProcessAnrErrorMonitor.resume();
                            MultiSignalANRDetector.this.mProcessAnrErrorMonitorPaused = false;
                        }
                    }
                });
            }
        };
        this.mAnrDetectorConfig = c8f;
        this.mSigquitDetector = SigquitDetectorLacrima.getInstance(this);
        this.mCurrentState = C6N.A04;
        this.mProcessAnrErrorMonitor = new ProcessAnrErrorMonitor(c8f.A01, c8f.A04, false, 500, true, 0, 0, 0);
        this.mAnrStagesListener = interfaceC3284C7y;
        HandlerThread handlerThread = new HandlerThread(FGI.A0M("MultiSignalANRDetectorThread:", (C5V.A04 == null || (str = C5V.A04.A03) == null) ? "unknown" : str));
        this.mProcessingThread = handlerThread;
        this.mProcessingThreadHandler = BV5.A0B(handlerThread);
    }

    public static MultiSignalANRDetector getTestInstance(C8f c8f, SigquitDetector sigquitDetector, HandlerThread handlerThread, InterfaceC3284C7y interfaceC3284C7y) {
        throw BV6.A0f();
    }

    private void setCurrentAnrStateFromNoAnrDetected(Event event) {
        C6N c6n;
        int iOrdinal = event.ordinal();
        if (iOrdinal == 0) {
            c6n = C6N.A0A;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 3) {
                    logUnexpectedStateTransition(event);
                    return;
                }
                return;
            }
            c6n = C6N.A05;
        }
        this.mCurrentState = c6n;
    }

    private void setCurrentAnrStateFromNoSigquitAmConfirmedMtBlocked(Event event) {
        C6N c6n;
        int iOrdinal = event.ordinal();
        if (iOrdinal == 0) {
            c6n = C6N.A07;
        } else if (iOrdinal == 3) {
            c6n = C6N.A06;
        } else {
            if (iOrdinal != 4) {
                logUnexpectedStateTransition(event);
                return;
            }
            c6n = C6N.A04;
        }
        this.mCurrentState = c6n;
    }

    private void setCurrentAnrStateFromNoSigquitAmConfirmedMtUnblocked(Event event) {
        C6N c6n;
        int iOrdinal = event.ordinal();
        if (iOrdinal == 0) {
            c6n = C6N.A08;
        } else {
            if (iOrdinal != 4) {
                logUnexpectedStateTransition(event);
                return;
            }
            c6n = C6N.A04;
        }
        this.mCurrentState = c6n;
    }

    private void setCurrentAnrStateFromSigquitReceivedAmConfirmedMtBlocked(Event event) {
        C6N c6n;
        int iOrdinal = event.ordinal();
        if (iOrdinal == 3) {
            c6n = C6N.A08;
        } else {
            if (iOrdinal != 4) {
                logUnexpectedStateTransition(event);
                return;
            }
            c6n = C6N.A04;
        }
        this.mCurrentState = c6n;
    }

    private void setCurrentAnrStateFromSigquitReceivedAmConfirmedMtUnblocked(Event event) {
        if (event.ordinal() != 4) {
            logUnexpectedStateTransition(event);
        } else {
            this.mCurrentState = C6N.A04;
        }
    }

    private void setCurrentAnrStateFromSigquitReceivedAmExpiredMtBlocked(Event event) {
        C6N c6n;
        int iOrdinal = event.ordinal();
        if (iOrdinal == 0) {
            c6n = C6N.A0A;
        } else if (iOrdinal == 1) {
            c6n = C6N.A07;
        } else {
            if (iOrdinal != 3) {
                logUnexpectedStateTransition(event);
                return;
            }
            c6n = C6N.A04;
        }
        this.mCurrentState = c6n;
    }

    private void setCurrentAnrStateFromSigquitReceivedAmUnconfirmedMtBlocked(Event event) {
        C6N c6n;
        int iOrdinal = event.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                c6n = C6N.A07;
            } else if (iOrdinal == 2) {
                c6n = C6N.A09;
            } else {
                if (iOrdinal != 3) {
                    logUnexpectedStateTransition(event);
                    return;
                }
                c6n = C6N.A0B;
            }
            this.mCurrentState = c6n;
        }
    }

    private void setCurrentAnrStateFromSigquitReceivedAmUnconfirmedMtUnblocked(Event event) {
        C6N c6n;
        int iOrdinal = event.ordinal();
        if (iOrdinal == 0) {
            c6n = C6N.A0A;
        } else if (iOrdinal == 1) {
            c6n = C6N.A08;
        } else {
            if (iOrdinal != 2) {
                logUnexpectedStateTransition(event);
                return;
            }
            c6n = C6N.A04;
        }
        this.mCurrentState = c6n;
    }

    public C6N getCurrentState() {
        throw BV6.A0f();
    }

    public ProcessErrorStateListener getErrorMonitorListener() {
        throw BV6.A0f();
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void setANRReportProvider(ANRReportProvider aNRReportProvider) {
        this.mANRReportProvider = aNRReportProvider;
    }

    public void setAnrErrorMonitor(ProcessAnrErrorMonitor processAnrErrorMonitor) {
        throw BV6.A0f();
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void setCheckIntervalMs(long j) {
    }

    public void setInternalState(C6N c6n) {
        throw BV6.A0f();
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void setListener(ANRDetectorListener aNRDetectorListener) {
        this.mAnrDetectorListener = aNRDetectorListener;
    }

    public void startForTesting() {
        throw BV6.A0f();
    }

    public MultiSignalANRDetector(C8f c8f, SigquitDetector sigquitDetector, HandlerThread handlerThread, InterfaceC3284C7y interfaceC3284C7y) {
        this.mLogTag = "MultiSignalANRDetector";
        this.mStartStopLock = C3cG.A0T();
        this.mNativeLibraryInitialized = BV4.A12(false);
        this.mNativeLibraryInitializedCV = new ConditionVariable();
        this.mSigquitHook = BV4.A15();
        this.mTracesHook = BV4.A15();
        this.mDurationHistoryAtSigquitTime = null;
        this.mDurationHistoryAtTracesAvailableTime = null;
        this.mOnMainThreadUnblockedRunnable = new OnMainThreadUnblockedRunnable();
        this.mConfirmationExpiredRunnable = new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.1
            @Override // java.lang.Runnable
            public void run() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                CFK.A06(MultiSignalANRDetector.this.mLogTag, "On confirmation expired");
                MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                if (multiSignalANRDetector.mWaitingForConfirmation) {
                    multiSignalANRDetector.setCurrentAnrState(Event.AM_EXPIRED);
                    MultiSignalANRDetector multiSignalANRDetector2 = MultiSignalANRDetector.this;
                    multiSignalANRDetector2.mWaitingForConfirmation = false;
                    if (multiSignalANRDetector2.mHasPendingReport) {
                        C6D c6d = multiSignalANRDetector2.mAnrDetectorConfig.A03;
                        c6d.A03 = SystemClock.uptimeMillis();
                        C6D.A00(c6d);
                    }
                    MultiSignalANRDetector multiSignalANRDetector3 = MultiSignalANRDetector.this;
                    if (multiSignalANRDetector3.isCurrentStateNoAnrDetected()) {
                        multiSignalANRDetector3.errorCleared();
                    }
                }
            }
        };
        this.mErrorMonitorListener = new DefaultProcessErrorStateListener() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2
            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onCheckFailed() {
                CFK.A04(MultiSignalANRDetector.this.mLogTag, "onCheckFailed");
                MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                multiSignalANRDetector.mLostErrorDetectionTime = SystemClock.uptimeMillis();
                multiSignalANRDetector.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.3
                    @Override // java.lang.Runnable
                    public void run() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                        MultiSignalANRDetector multiSignalANRDetector2 = MultiSignalANRDetector.this;
                        if (multiSignalANRDetector2.mHasPendingReport) {
                            C6D c6d = multiSignalANRDetector2.mAnrDetectorConfig.A03;
                            c6d.A09 = multiSignalANRDetector2.mLostErrorDetectionTime;
                            c6d.A01 = 3;
                            C6D.A00(c6d);
                        }
                    }
                });
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onCheckPerformed() {
                MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.5
                    @Override // java.lang.Runnable
                    public void run() {
                        MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                        if (multiSignalANRDetector.mMovedToBackground) {
                            int i = multiSignalANRDetector.mErrorCheckCounter + 1;
                            multiSignalANRDetector.mErrorCheckCounter = i;
                            if (i % 5 == 0) {
                                CFK.A06(multiSignalANRDetector.mLogTag, "Pausing error state checks");
                                MultiSignalANRDetector.this.mProcessAnrErrorMonitor.pause();
                                MultiSignalANRDetector.this.mProcessAnrErrorMonitorPaused = true;
                            }
                        }
                    }
                });
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onErrorCleared() {
                try {
                    Trace.beginSection("ANR Error state cleared");
                    CFK.A06(MultiSignalANRDetector.this.mLogTag, "On onErrorCleared");
                    MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.2
                        @Override // java.lang.Runnable
                        public void run() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                            MultiSignalANRDetector.this.setCurrentAnrState(Event.DIALOG_DISMISSED);
                            MultiSignalANRDetector.this.errorCleared();
                        }
                    });
                } finally {
                    Trace.endSection();
                }
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onErrorDetected(final String str2, final String str3) {
                try {
                    Trace.beginSection("ANR Error state detected");
                    CFK.A0H(MultiSignalANRDetector.this.mLogTag, "On error detected %s %s", str2, str3);
                    synchronized (MultiSignalANRDetector.this.mStartStopLock) {
                        if (MultiSignalANRDetector.this.mRunning) {
                            MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable(this) { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.1
                                public final /* synthetic */ AnonymousClass2 this$1;

                                {
                                    this.this$1 = this;
                                }

                                @Override // java.lang.Runnable
                                public void run() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                                    MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                                    CFK.A0H(multiSignalANRDetector.mLogTag, "On error detected waiting for confirmation %b", Boolean.valueOf(multiSignalANRDetector.mWaitingForConfirmation));
                                    MultiSignalANRDetector multiSignalANRDetector2 = MultiSignalANRDetector.this;
                                    multiSignalANRDetector2.mSystemErrorMessage = str2;
                                    multiSignalANRDetector2.mSystemErrorTag = str3;
                                    multiSignalANRDetector2.mSystemErrorUptime = SystemClock.uptimeMillis();
                                    Event event = Event.AM_CONFIRMED;
                                    multiSignalANRDetector2.setCurrentAnrState(event);
                                    MultiSignalANRDetector multiSignalANRDetector3 = MultiSignalANRDetector.this;
                                    if (multiSignalANRDetector3.mWaitingForConfirmation) {
                                        multiSignalANRDetector3.mProcessingThreadHandler.removeCallbacks(multiSignalANRDetector3.mConfirmationExpiredRunnable);
                                        multiSignalANRDetector3 = MultiSignalANRDetector.this;
                                        multiSignalANRDetector3.mWaitingForConfirmation = false;
                                    }
                                    multiSignalANRDetector3.maybeStartReport(event);
                                }
                            });
                        }
                    }
                } finally {
                    Trace.endSection();
                }
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onStart() {
                CFK.A06(MultiSignalANRDetector.this.mLogTag, "Started monitoring");
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public boolean onErrorDetectOnOtherProcess(final String str2, final String str3, final String str4) {
                final long jUptimeMillis = SystemClock.uptimeMillis();
                MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable(this) { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.4
                    public final /* synthetic */ AnonymousClass2 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                        MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                        if (multiSignalANRDetector.mHasPendingReport) {
                            C6D c6d = multiSignalANRDetector.mAnrDetectorConfig.A03;
                            String str5 = str2;
                            String str6 = str3;
                            String str7 = str4;
                            long j = jUptimeMillis;
                            List<String> list = c6d.A0f;
                            if (list.size() < 5) {
                                StringBuilder sbA0g = C3cG.A0g(str5);
                                sbA0g.append(',');
                                sbA0g.append(j);
                                sbA0g.append(',');
                                sbA0g.append(str6);
                                sbA0g.append(',');
                                list.add(AnonymousClass001.A0v(str7, sbA0g));
                                C6D.A00(c6d);
                            }
                        }
                    }
                });
                return true;
            }
        };
        this.mForegroundTransitionListener = new C7Z() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.3
            @Override // X.C7Z
            public void onBackground() {
                MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        CFK.A06(MultiSignalANRDetector.this.mLogTag, "Moving to background");
                        MultiSignalANRDetector.this.mMovedToBackground = true;
                    }
                });
            }

            @Override // X.C7Z
            public void onForeground() {
                MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                        multiSignalANRDetector.mMovedToBackground = false;
                        if (multiSignalANRDetector.mProcessAnrErrorMonitorPaused) {
                            CFK.A06(multiSignalANRDetector.mLogTag, "Resuming error state checks");
                            MultiSignalANRDetector.this.mProcessAnrErrorMonitor.resume();
                            MultiSignalANRDetector.this.mProcessAnrErrorMonitorPaused = false;
                        }
                    }
                });
            }
        };
        this.mAnrDetectorConfig = c8f;
        this.mSigquitDetector = sigquitDetector;
        this.mCurrentState = C6N.A04;
        this.mProcessAnrErrorMonitor = new ProcessAnrErrorMonitor(c8f.A01, c8f.A04, false, 500, true, 0, 0, 0);
        this.mProcessingThread = handlerThread;
        this.mAnrStagesListener = interfaceC3284C7y;
        this.mProcessingThreadHandler = BV5.A0B(handlerThread);
    }

    public static MultiSignalANRDetector getInstance(C8f c8f, InterfaceC3284C7y interfaceC3284C7y) {
        Map<C8f, MultiSignalANRDetector> map = sInstances;
        MultiSignalANRDetector multiSignalANRDetector = map.get(c8f);
        if (multiSignalANRDetector == null) {
            multiSignalANRDetector = new MultiSignalANRDetector(c8f, interfaceC3284C7y);
            map.put(c8f, multiSignalANRDetector);
        }
        multiSignalANRDetector.mLogTag = "MultiSignalANRDetector".concat("Lacrima");
        return multiSignalANRDetector;
    }

    public static MultiSignalANRDetector getTestInstance(C8f c8f, SigquitDetector sigquitDetector, HandlerThread handlerThread) {
        throw BV6.A0f();
    }

    public void setCurrentAnrState(Event event, boolean z, boolean z2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        C6N c6n;
        CFK.A0H(this.mLogTag, "Transitioning from %s event %s inFgV1: %b inFgV2: %b", this.mCurrentState, event, Boolean.valueOf(z), Boolean.valueOf(z2));
        C6N c6n2 = this.mCurrentState;
        switch (c6n2.ordinal()) {
            case 0:
                setCurrentAnrStateFromNoAnrDetected(event);
                break;
            case 1:
            case 2:
            default:
                throw C3cG.A0Q(AnonymousClass007.A0a("Unknown state: ", c6n2));
            case 3:
                setCurrentAnrStateFromSigquitReceivedAmUnconfirmedMtBlocked(event);
                break;
            case 4:
                setCurrentAnrStateFromSigquitReceivedAmConfirmedMtBlocked(event);
                break;
            case 5:
                setCurrentAnrStateFromSigquitReceivedAmConfirmedMtUnblocked(event);
                break;
            case 6:
                setCurrentAnrStateFromSigquitReceivedAmUnconfirmedMtUnblocked(event);
                break;
            case 7:
                setCurrentAnrStateFromSigquitReceivedAmExpiredMtBlocked(event);
                break;
            case 8:
                setCurrentAnrStateFromNoSigquitAmConfirmedMtBlocked(event);
                break;
            case 9:
                setCurrentAnrStateFromNoSigquitAmConfirmedMtUnblocked(event);
                break;
        }
        setASLState(event, z, z2);
        maybeStartMainThreadBlockedCheck();
        C6N c6n3 = this.mCurrentState;
        if (c6n2 != c6n3 && c6n2 != (c6n = C6N.A04) && c6n3 != c6n) {
            C6D c6d = this.mAnrDetectorConfig.A03;
            c6d.A0E = c6n3;
            if (c6d.A0R) {
                C6D.A00(c6d);
            }
        }
    }
}
