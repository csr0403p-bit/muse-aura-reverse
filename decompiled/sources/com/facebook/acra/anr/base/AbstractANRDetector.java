package com.facebook.acra.anr.base;

import X.AnonymousClass002;
import X.C3cG;
import X.C6D;
import X.C6N;
import X.C8f;
import android.os.SystemClock;
import com.facebook.acra.anr.ANRDetectorListener;
import com.facebook.acra.anr.ANRReportProvider;
import com.facebook.acra.anr.IANRDetector;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public abstract class AbstractANRDetector implements IANRDetector {
    public final C8f mANRConfig;
    public ANRReportProvider mANRReportProvider;
    public long mANRReportTime;
    public ANRDetectorListener mAnrDetectorListener;
    public long mDetectorStartTime;
    public boolean mInAnr;
    public volatile boolean mInForegroundV1;
    public volatile boolean mInForegroundV2;
    public final Object mStateLock = C3cG.A0T();

    public abstract void collectStackTrace();

    public abstract void notifyStateListeners(C6N c6n);

    @Override // com.facebook.acra.anr.IANRDetector
    public synchronized void setListener(ANRDetectorListener aNRDetectorListener) {
        this.mAnrDetectorListener = aNRDetectorListener;
    }

    public abstract void start(long j);

    @Override // com.facebook.acra.anr.IANRDetector
    public abstract void stop(IANRDetector.ANRDetectorStopListener aNRDetectorStopListener);

    public static boolean isTest() {
        return false;
    }

    public void anrHasEnded(boolean z) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (z) {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.mANRReportTime;
            C6D c6d = this.mANRConfig.A03;
            c6d.A0B = jUptimeMillis;
            C6D.A00(c6d);
            c6d.A0R = false;
        }
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public long getANRReceivedTime() {
        return 0L;
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public long getANRReceivedUpTime() {
        return 0L;
    }

    public long getDetectorStartTime() {
        return this.mDetectorStartTime;
    }

    public long getReadyTime() {
        return 0L;
    }

    public long getSwitchTime() {
        return 0L;
    }

    public boolean inAnrState() {
        boolean z;
        synchronized (this.mStateLock) {
            z = this.mInAnr;
        }
        return z;
    }

    public boolean isDebuggerConnected() {
        return false;
    }

    public boolean isInForegroundV1() {
        return this.mInForegroundV1;
    }

    public void logMainThreadUnblocked(long j) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        C6D c6d = this.mANRConfig.A03;
        c6d.A07 = j;
        C6D.A00(c6d);
    }

    public void reportSoftError(String str, Throwable th) {
        ANRReportProvider aNRReportProvider = this.mANRReportProvider;
        if (aNRReportProvider != null) {
            aNRReportProvider.reportSoftError(str, th);
        }
    }

    public void setInAnrState(boolean z) {
        synchronized (this.mStateLock) {
            this.mInAnr = z;
        }
    }

    public boolean shouldCollectAndUploadANRReports() {
        ANRReportProvider aNRReportProvider = this.mANRReportProvider;
        if (aNRReportProvider != null) {
            return aNRReportProvider.shouldCollectAndUploadANRReports();
        }
        return true;
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void start() {
        start(-1L);
    }

    public void startReport(String str, String str2, Long l, boolean z) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ANRDetectorListener aNRDetectorListener;
        String longStallTraceId;
        String blackBoxTraceId;
        synchronized (this) {
            aNRDetectorListener = this.mAnrDetectorListener;
        }
        if (aNRDetectorListener != null) {
            blackBoxTraceId = aNRDetectorListener.getBlackBoxTraceId();
            longStallTraceId = aNRDetectorListener.getLongStallTraceId();
            aNRDetectorListener.onStartANRDataCapture();
        } else {
            longStallTraceId = null;
            blackBoxTraceId = null;
        }
        collectStackTrace();
        this.mANRReportTime = SystemClock.uptimeMillis();
        this.mANRConfig.A03.A01(null, null, null, l, null, null, null, null, null, null, blackBoxTraceId, longStallTraceId, str, str2, this.mANRReportTime, this.mDetectorStartTime, AnonymousClass002.A1Y(this.mANRReportProvider), this.mInForegroundV1, this.mInForegroundV2, z);
        if (aNRDetectorListener != null) {
            aNRDetectorListener.onEndANRDataCapture();
        }
    }

    public AbstractANRDetector(C8f c8f) {
        this.mANRConfig = c8f;
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void nativeLibraryLoaded(boolean z) {
    }

    public void processMonitorStarted() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (shouldCollectAndUploadANRReportsNow()) {
            C6D c6d = this.mANRConfig.A03;
            c6d.A0A = SystemClock.uptimeMillis();
            C6D.A00(c6d);
        }
    }

    public void processMonitorStopped(int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (shouldCollectAndUploadANRReportsNow()) {
            C6D c6d = this.mANRConfig.A03;
            c6d.A09 = SystemClock.uptimeMillis();
            c6d.A01 = i;
            C6D.A00(c6d);
        }
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void setANRReportProvider(ANRReportProvider aNRReportProvider) {
        this.mANRReportProvider = aNRReportProvider;
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void setCheckIntervalMs(long j) {
    }

    public boolean shouldCollectAndUploadANRReportsNow() {
        if (shouldCollectAndUploadANRReports()) {
            return this.mInForegroundV2 || this.mInForegroundV1;
        }
        return false;
    }
}
