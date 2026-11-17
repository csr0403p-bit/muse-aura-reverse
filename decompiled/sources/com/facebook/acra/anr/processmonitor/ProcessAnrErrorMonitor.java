package com.facebook.acra.anr.processmonitor;

import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import X.BeQ;
import X.C3cG;
import X.C5V;
import X.C60O;
import X.CFK;
import X.FGI;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public class ProcessAnrErrorMonitor {
    public static final int DEFAULT_POLLING_TIME_MS = 500;
    public static final String LOG_TAG = "ProcessAnrErrorMonitor";
    public static final int UNLIMITED_NUMBER_OF_CHECKS = 0;
    public final Context mContext;
    public final boolean mContinuousMonitoring;
    public long mCurrentMonitorThreadId;
    public int mDurationWritePos;
    public MonitorThread mErrorCheckThread;
    public boolean mFullHistoryData;
    public final int mMaxNumberOfChecksAfterError;
    public final int mMaxNumberOfChecksBeforeError;
    public final int mMyUid;
    public final int mPollingTime;
    public final String mProcessName;
    public final long[] mQueryDurationHistory;
    public State mState;

    public class AnrCheckState {
        public boolean mAnrConfirmed;
        public int mCount;
    }

    public class AnrErrorState {
        public String mErrorMsg;
        public String mProcessName;
        public String mTag;
    }

    public class MonitorThread extends Thread {
        public final ActivityManager mAm;
        public final long mDelay;
        public boolean mFirstCheck;
        public final long mId;
        public volatile ProcessErrorStateListener mListener;
        public final Object mMonitorLock;
        public boolean mPauseRequested;
        public final Set<String> mProcessesInAnr;
        public boolean mStopRequested;

        /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean checkIteration(com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor.AnrCheckState r9) {
            /*
                Method dump skipped, instructions count: 289
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor.MonitorThread.checkIteration(com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor$AnrCheckState):boolean");
        }

        public MonitorThread(ActivityManager activityManager, ProcessErrorStateListener processErrorStateListener, long j, long j2) {
            String str;
            super(FGI.A0M("ProcessAnrErrorMonitorThread:", (C5V.A04 == null || (str = C5V.A04.A03) == null) ? "unknown" : str));
            this.mMonitorLock = C3cG.A0T();
            this.mProcessesInAnr = C60O.A13();
            this.mAm = activityManager;
            this.mListener = processErrorStateListener;
            this.mId = j;
            this.mDelay = j2;
            this.mFirstCheck = true;
        }

        private void maybeCallIterationListener() {
            if (this.mListener != null) {
                this.mListener.onCheckPerformed();
            }
        }

        private void maybeLogAnrStateFromOtherProcesses(LinkedList<AnrErrorState> linkedList, String str) {
            if (this.mListener != null) {
                Iterator<AnrErrorState> it = linkedList.iterator();
                while (it.hasNext()) {
                    AnrErrorState next = it.next();
                    String str2 = next.mProcessName;
                    if (!str.equals(str2)) {
                        CFK.A0H(ProcessAnrErrorMonitor.LOG_TAG, "Error found in process '%s' different from process being searched '%s'", str2, str);
                        String str3 = next.mProcessName;
                        if (str3 != null && !this.mProcessesInAnr.contains(str3) && this.mListener.onErrorDetectOnOtherProcess(next.mProcessName, next.mErrorMsg, next.mTag)) {
                            this.mProcessesInAnr.add(next.mProcessName);
                        }
                    }
                }
            }
        }

        private void monitorLoop() {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            if (this.mDelay > 0 || this.mListener == null) {
                long jUptimeMillis = this.mDelay;
                synchronized (this.mMonitorLock) {
                    if (jUptimeMillis > 0) {
                        z = this.mStopRequested ? false : true;
                    } else if (this.mListener == null) {
                    }
                    z2 = this.mStopRequested;
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    if (z) {
                        while (true) {
                            try {
                                this.mMonitorLock.wait(jUptimeMillis);
                            } catch (InterruptedException unused) {
                            }
                            if (jUptimeMillis > 0) {
                                z3 = this.mStopRequested ? false : true;
                            } else if (this.mListener == null) {
                            }
                            z2 = this.mStopRequested;
                            if (!z3) {
                                break;
                            }
                            if (jUptimeMillis > 0) {
                                jUptimeMillis = this.mDelay - (SystemClock.uptimeMillis() - jUptimeMillis2);
                                if (jUptimeMillis < 1) {
                                    break;
                                }
                            }
                        }
                    }
                }
                if (z2) {
                    return;
                }
            }
            AnrCheckState anrCheckState = new AnrCheckState();
            anrCheckState.mAnrConfirmed = false;
            anrCheckState.mCount = 0;
            while (checkIteration(anrCheckState)) {
                synchronized (this.mMonitorLock) {
                    z4 = this.mStopRequested;
                    if (!z4) {
                        int i = ProcessAnrErrorMonitor.this.mPollingTime;
                        do {
                            if (this.mPauseRequested) {
                                i = 0;
                            }
                            try {
                                this.mMonitorLock.wait(i);
                            } catch (InterruptedException unused2) {
                            }
                            if (!this.mPauseRequested) {
                                break;
                            }
                        } while (!this.mStopRequested);
                        z4 = this.mStopRequested;
                    }
                }
                if (z4) {
                    ProcessAnrErrorMonitor.this.updateStateAndMaybeCallListener(StateChangeReason.STOP_REQUESTED, this.mListener);
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pauseRequested() {
            synchronized (this.mMonitorLock) {
                this.mPauseRequested = true;
                this.mMonitorLock.notifyAll();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void resumeRequested() {
            synchronized (this.mMonitorLock) {
                this.mPauseRequested = false;
                this.mMonitorLock.notifyAll();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void stopRequested() {
            synchronized (this.mMonitorLock) {
                this.mStopRequested = true;
                this.mMonitorLock.notifyAll();
            }
        }

        public long getMonitorId() {
            return this.mId;
        }

        public boolean hasListener() {
            return AnonymousClass002.A1X(this.mListener);
        }

        public void setListener(ProcessErrorStateListener processErrorStateListener) {
            synchronized (this.mMonitorLock) {
                this.mListener = processErrorStateListener;
                this.mMonitorLock.notifyAll();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            monitorLoop();
        }
    }

    public enum State {
        NOT_MONITORING,
        MONITORING_NO_ERROR_DETECTED,
        MONITORING_ERROR_DETECTED
    }

    public enum StateChangeReason {
        MONITOR_STARTED,
        ERROR_CLEARED,
        ERROR_DETECTED,
        MAX_NUMBER_BEFORE_ERROR,
        MAX_NUMBER_AFTER_ERROR,
        STOP_REQUESTED,
        ERROR_QUERYING_ACTIVITY_MANAGER
    }

    public ProcessAnrErrorMonitor(Context context, String str, boolean z, int i, int i2) {
        this(context, str, z, 500, false, i, i2, 0);
    }

    public synchronized MonitorThread getErrorCheckThread() {
        return this.mErrorCheckThread;
    }

    public synchronized State getState() {
        return this.mState;
    }

    public void pause() {
        MonitorThread monitorThread;
        synchronized (this) {
            if (this.mState != State.NOT_MONITORING && (monitorThread = this.mErrorCheckThread) != null) {
                monitorThread.pauseRequested();
            }
        }
    }

    public void resume() {
        MonitorThread monitorThread;
        synchronized (this) {
            if (this.mState != State.NOT_MONITORING && (monitorThread = this.mErrorCheckThread) != null) {
                monitorThread.resumeRequested();
            }
        }
    }

    public synchronized void setErrorCheckThread(MonitorThread monitorThread) {
        this.mErrorCheckThread = monitorThread;
    }

    public MonitorThread startMonitoringForTest(ProcessErrorStateListener processErrorStateListener) {
        MonitorThread monitorThread;
        MonitorThread monitorThread2;
        ActivityManager activityManager = (ActivityManager) this.mContext.getSystemService("activity");
        synchronized (this) {
            if (this.mState != State.NOT_MONITORING && (monitorThread2 = this.mErrorCheckThread) != null) {
                monitorThread2.stopRequested();
            }
            long j = this.mCurrentMonitorThreadId + 1;
            this.mCurrentMonitorThreadId = j;
            monitorThread = new MonitorThread(activityManager, processErrorStateListener, j, 0L);
            this.mErrorCheckThread = monitorThread;
        }
        return monitorThread;
    }

    public void stopMonitoring() {
        MonitorThread monitorThread;
        synchronized (this) {
            if (this.mState != State.NOT_MONITORING && (monitorThread = this.mErrorCheckThread) != null) {
                monitorThread.stopRequested();
            }
        }
    }

    public void updateStateAndMaybeCallListener(StateChangeReason stateChangeReason, ProcessErrorStateListener processErrorStateListener) {
        updateStateAndMaybeCallListener(stateChangeReason, processErrorStateListener, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logDuration(long j) {
        long[] jArr = this.mQueryDurationHistory;
        if (jArr != null) {
            synchronized (jArr) {
                long[] jArr2 = this.mQueryDurationHistory;
                int i = this.mDurationWritePos;
                jArr2[i] = j;
                int i2 = i + 1;
                this.mDurationWritePos = i2;
                if (i2 >= jArr2.length) {
                    this.mFullHistoryData = true;
                    this.mDurationWritePos = 0;
                }
            }
        }
    }

    public BeQ getDurationHistory() {
        BeQ beQ;
        long[] jArr = this.mQueryDurationHistory;
        if (jArr == null) {
            return null;
        }
        synchronized (jArr) {
            long[] jArr2 = this.mQueryDurationHistory;
            int length = jArr2.length;
            long[] jArr3 = new long[length];
            System.arraycopy(jArr2, 0, jArr3, 0, length);
            beQ = new BeQ(jArr3, this.mDurationWritePos, this.mFullHistoryData);
        }
        return beQ;
    }

    public void startMonitoring(ProcessErrorStateListener processErrorStateListener) {
        startMonitoringAfterDelay(processErrorStateListener, 0L);
    }

    public void startMonitoringAfterDelay(ProcessErrorStateListener processErrorStateListener, long j) {
        MonitorThread monitorThread;
        CFK.A0H(LOG_TAG, "startMonitoring with delay: %d", BV4.A1X(j));
        ActivityManager activityManager = (ActivityManager) this.mContext.getSystemService("activity");
        synchronized (this) {
            if (processErrorStateListener == null && j != 0) {
                throw C60O.A0i("Cannot delay and wait for listener at the same time");
            }
            MonitorThread monitorThread2 = this.mErrorCheckThread;
            if (monitorThread2 == null || AnonymousClass002.A1X(monitorThread2.mListener)) {
                State state = this.mState;
                State state2 = State.NOT_MONITORING;
                if (state != state2 && (monitorThread = this.mErrorCheckThread) != null) {
                    monitorThread.stopRequested();
                }
                long j2 = this.mCurrentMonitorThreadId + 1;
                this.mCurrentMonitorThreadId = j2;
                MonitorThread monitorThread3 = new MonitorThread(activityManager, processErrorStateListener, j2, j);
                this.mErrorCheckThread = monitorThread3;
                if (processErrorStateListener != null) {
                    state2 = State.MONITORING_NO_ERROR_DETECTED;
                }
                this.mState = state2;
                monitorThread3.start();
            } else {
                if (processErrorStateListener == null) {
                    throw C60O.A0i("Listener cannot be null");
                }
                this.mErrorCheckThread.setListener(processErrorStateListener);
            }
        }
    }

    public LinkedList<AnrErrorState> checkProcessError(ActivityManager activityManager) {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
        LinkedList<AnrErrorState> linkedListA0y = BV4.A0y();
        if (processesInErrorState != null) {
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == this.mMyUid) {
                    AnrErrorState anrErrorState = new AnrErrorState();
                    anrErrorState.mErrorMsg = processErrorStateInfo.shortMsg;
                    anrErrorState.mTag = processErrorStateInfo.tag;
                    String str = processErrorStateInfo.processName;
                    anrErrorState.mProcessName = str;
                    if (this.mProcessName.equals(str)) {
                        linkedListA0y.addFirst(anrErrorState);
                    } else {
                        linkedListA0y.addLast(anrErrorState);
                    }
                }
            }
        }
        return linkedListA0y;
    }

    public ProcessAnrErrorMonitor(Context context, String str, boolean z, int i, boolean z2, int i2, int i3, int i4) {
        this.mContext = context;
        this.mProcessName = str;
        this.mState = State.NOT_MONITORING;
        this.mPollingTime = i;
        this.mContinuousMonitoring = z2;
        this.mMaxNumberOfChecksBeforeError = i2;
        this.mMaxNumberOfChecksAfterError = i3;
        this.mMyUid = Process.myUid();
        if (i4 > 0) {
            this.mQueryDurationHistory = new long[i4];
        } else {
            this.mQueryDurationHistory = null;
        }
        this.mFullHistoryData = false;
        this.mDurationWritePos = 0;
        if (z) {
            startMonitoringAfterDelay(null, 0L);
        }
    }

    public synchronized void updateStateAndMaybeCallListener(StateChangeReason stateChangeReason, ProcessErrorStateListener processErrorStateListener, String str, String str2) {
        MonitorThread monitorThread = this.mErrorCheckThread;
        if (monitorThread == null || monitorThread.mId == this.mCurrentMonitorThreadId) {
            switch (stateChangeReason) {
                case MONITOR_STARTED:
                    if (processErrorStateListener != null) {
                        processErrorStateListener.onStart();
                        break;
                    }
                    break;
                case ERROR_CLEARED:
                    if (this.mContinuousMonitoring) {
                        this.mState = State.MONITORING_NO_ERROR_DETECTED;
                    } else {
                        this.mState = State.NOT_MONITORING;
                    }
                    if (processErrorStateListener != null) {
                        processErrorStateListener.onErrorCleared();
                        break;
                    }
                    break;
                case ERROR_DETECTED:
                    this.mState = State.MONITORING_ERROR_DETECTED;
                    if (processErrorStateListener != null) {
                        processErrorStateListener.onErrorDetected(str, str2);
                        break;
                    }
                    break;
                case MAX_NUMBER_BEFORE_ERROR:
                    this.mState = State.NOT_MONITORING;
                    if (processErrorStateListener != null) {
                        processErrorStateListener.onMaxChecksReachedBeforeError();
                        break;
                    }
                    break;
                case MAX_NUMBER_AFTER_ERROR:
                    this.mState = State.NOT_MONITORING;
                    if (processErrorStateListener != null) {
                        processErrorStateListener.onMaxChecksReachedAfterError();
                        break;
                    }
                    break;
                case STOP_REQUESTED:
                    this.mState = State.NOT_MONITORING;
                    break;
                case ERROR_QUERYING_ACTIVITY_MANAGER:
                    this.mState = State.NOT_MONITORING;
                    if (processErrorStateListener != null) {
                        processErrorStateListener.onCheckFailed();
                        break;
                    }
                    break;
                default:
                    throw BV5.A0O(stateChangeReason, "Unexpected state change reason: ");
            }
        }
    }

    public ProcessAnrErrorMonitor(Context context, String str, int i, int i2) {
        this(context, str, false, 500, false, i, i2, 0);
    }
}
