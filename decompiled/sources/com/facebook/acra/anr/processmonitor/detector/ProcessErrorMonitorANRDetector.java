package com.facebook.acra.anr.processmonitor.detector;

import X.BV4;
import X.BV5;
import X.C3272C6z;
import X.C3cG;
import X.C5V;
import X.C64;
import X.C6D;
import X.C6N;
import X.C70;
import X.C8f;
import X.CFK;
import android.os.SystemClock;
import com.facebook.acra.anr.ANRException;
import com.facebook.acra.anr.IANRDetector;
import com.facebook.acra.anr.StackTraceDumper;
import com.facebook.acra.anr.base.AbstractANRDetector;
import com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor;
import com.facebook.acra.anr.processmonitor.ProcessErrorStateListener;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes5.dex */
public class ProcessErrorMonitorANRDetector extends AbstractANRDetector implements ProcessErrorStateListener {
    public static final String LOG_TAG = "ProcessErrorMonitorANRDetector";
    public static final int START_DELAY_MS = 4000;
    public static ProcessErrorMonitorANRDetector sInstance;
    public final ProcessAnrErrorMonitor mAnrErrorMonitor;
    public final Object mAnrRecoveredLock;
    public long mDetectorStartTime;
    public volatile boolean mErrorCleared;
    public boolean mFirstStart;
    public boolean mInAnr;
    public final Runnable mNotifyANRRecoveredRunnable;
    public final Object mReportLock;
    public boolean mShouldReport;

    public class ThreadProvider {
        public static void runOnNewThread(Runnable runnable) {
            new Thread(runnable, "ProcessErrorMonitorANRDetectorThread").start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void endAndProcessANRDataCapture() {
        if (this.mInAnr) {
            this.mInAnr = false;
            ThreadProvider.runOnNewThread(this.mNotifyANRRecoveredRunnable);
        }
    }

    @Override // com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
    public void onCheckFailed() {
    }

    @Override // com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
    public void onCheckPerformed() {
    }

    @Override // com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
    public void onErrorCleared() {
        boolean z;
        synchronized (this) {
            z = this.mShouldReport;
            if (!this.mErrorCleared) {
                this.mErrorCleared = true;
                notifyStateListeners(C6N.A04);
            }
        }
        synchronized (this.mReportLock) {
            anrHasEnded(z);
        }
    }

    @Override // com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
    public void onErrorDetected(String str, String str2) {
        boolean z;
        synchronized (this) {
            z = true;
            this.mInAnr = true;
            this.mErrorCleared = false;
            notifyStateListeners(C6N.A03);
            if (!this.mInForegroundV2 && !this.mInForegroundV1) {
                z = false;
            }
            boolean zShouldCollectAndUploadANRReportsNow = shouldCollectAndUploadANRReportsNow();
            this.mShouldReport = zShouldCollectAndUploadANRReportsNow;
            if (zShouldCollectAndUploadANRReportsNow) {
                C6D c6d = this.mANRConfig.A03;
                long jUptimeMillis = SystemClock.uptimeMillis();
                c6d.A0O = str;
                c6d.A0P = str2;
                c6d.A08 = jUptimeMillis;
                C6D.A00(c6d);
            }
        }
        try {
            if (this.mShouldReport) {
                ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
                StackTraceDumper.dumpStackTraces(byteArrayOutputStreamA0F, null, null);
                String string = byteArrayOutputStreamA0F.toString();
                synchronized (this.mReportLock) {
                    try {
                        startReport(string, null, null, false);
                    } catch (IOException unused) {
                    }
                }
            } else if (z) {
                C6D c6d2 = this.mANRConfig.A03;
                boolean z2 = this.mInForegroundV1;
                boolean z3 = this.mInForegroundV2;
                c6d2.A0S = z2;
                c6d2.A0T = z3;
                C6D.A00(c6d2);
            }
        } finally {
            this.mANRConfig.A02.post(new Runnable() { // from class: com.facebook.acra.anr.processmonitor.detector.ProcessErrorMonitorANRDetector.2
                @Override // java.lang.Runnable
                public void run() {
                    ProcessErrorMonitorANRDetector.this.endAndProcessANRDataCapture();
                }
            });
        }
    }

    @Override // com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
    public void onMaxChecksReachedAfterError() {
    }

    @Override // com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
    public void onMaxChecksReachedBeforeError() {
    }

    @Override // com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
    public void onStart() {
    }

    @Override // com.facebook.acra.anr.base.AbstractANRDetector
    public synchronized void start(long j) {
        if (this.mDetectorStartTime <= 0) {
            this.mDetectorStartTime = j;
        }
        if (this.mFirstStart) {
            this.mFirstStart = false;
            this.mAnrErrorMonitor.startMonitoringAfterDelay(this, 4000L);
        }
    }

    @Override // com.facebook.acra.anr.base.AbstractANRDetector, com.facebook.acra.anr.IANRDetector
    public void stop(IANRDetector.ANRDetectorStopListener aNRDetectorStopListener) {
        synchronized (this) {
            this.mAnrErrorMonitor.stopMonitoring();
        }
        if (aNRDetectorStopListener != null) {
            aNRDetectorStopListener.onStop();
        }
    }

    public static synchronized ProcessErrorMonitorANRDetector getInstance(C8f c8f, int i) {
        ProcessErrorMonitorANRDetector processErrorMonitorANRDetector;
        processErrorMonitorANRDetector = sInstance;
        if (processErrorMonitorANRDetector == null) {
            processErrorMonitorANRDetector = new ProcessErrorMonitorANRDetector(c8f, i);
            sInstance = processErrorMonitorANRDetector;
        }
        return processErrorMonitorANRDetector;
    }

    public static synchronized void resetInstance() {
        sInstance = null;
    }

    @Override // com.facebook.acra.anr.base.AbstractANRDetector
    public void notifyStateListeners(C6N c6n) {
        C70 c70 = this.mANRConfig.A00;
        C6N c6n2 = C6N.A03;
        if (c6n == c6n2) {
            synchronized (this.mAnrRecoveredLock) {
                this.mInForegroundV2 = C5V.A04 == null ? false : C5V.A04.A04;
                this.mInForegroundV1 = C5V.A04 == null ? false : C5V.A04.A04;
                C64.A00(((C3272C6z) c70).A00, c6n2);
            }
            return;
        }
        C6N c6n3 = C6N.A02;
        if (c6n != c6n3) {
            c6n3 = C6N.A04;
        }
        synchronized (this.mAnrRecoveredLock) {
            C64.A00(((C3272C6z) c70).A00, c6n3);
        }
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void pause() {
        this.mAnrErrorMonitor.pause();
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void resume() {
        this.mAnrErrorMonitor.resume();
    }

    public ProcessErrorMonitorANRDetector(C8f c8f, int i) {
        super(c8f);
        this.mFirstStart = true;
        this.mReportLock = C3cG.A0T();
        this.mAnrRecoveredLock = C3cG.A0T();
        this.mAnrErrorMonitor = new ProcessAnrErrorMonitor(c8f.A01, c8f.A04, false, i, true, 0, 0, 0);
        this.mNotifyANRRecoveredRunnable = new Runnable() { // from class: com.facebook.acra.anr.processmonitor.detector.ProcessErrorMonitorANRDetector.1
            @Override // java.lang.Runnable
            public void run() {
                if (ProcessErrorMonitorANRDetector.this.mErrorCleared) {
                    return;
                }
                ProcessErrorMonitorANRDetector.this.notifyStateListeners(C6N.A02);
            }
        };
    }

    @Override // com.facebook.acra.anr.base.AbstractANRDetector
    public void collectStackTrace() {
        StackTraceElement[] stackTrace = BV5.A0s().getStackTrace();
        ANRException aNRException = new ANRException("ANR detected by ProcessErrorMonitorAnrDetector");
        aNRException.setStackTrace(stackTrace);
        CFK.A0J(LOG_TAG, aNRException, "Generating ANR Report");
    }

    @Override // com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
    public boolean onErrorDetectOnOtherProcess(String str, String str2, String str3) {
        return true;
    }
}
