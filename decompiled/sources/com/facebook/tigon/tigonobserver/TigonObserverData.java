package com.facebook.tigon.tigonobserver;

import X.AbstractC3613CXs;
import X.C3614CXy;
import X.C3615CXz;
import X.CFK;
import X.CY0;
import X.CY1;
import X.CYF;
import android.os.SystemClock;
import com.facebook.aura.login.nativeflow.HatchPasskeyW3cKt;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.iface.TigonRequest;
import com.facebook.tigon.tigonobserver.interfaces.TigonRequestConnectionAcquisitionStarted;
import com.facebook.tigon.tigonobserver.interfaces.TigonRequestErrored;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public class TigonObserverData implements TigonRequestConnectionAcquisitionStarted, TigonRequestErrored {
    public static final AtomicInteger sSkippedDeserializations = new AtomicInteger();
    public int mAttempts;
    public long mCreationTime = SystemClock.uptimeMillis();
    public TigonError mError;
    public long mRequestId;
    public CYF mResponse;
    public TigonRequest mSentRequest;
    public TigonRequest mSubmittedRequest;
    public CY1 mSummary;
    public long mTsConnectionAcquisitionStartedMs;
    public long mTsEndedMs;
    public long mTsStartedMs;

    private void onEom(byte[] bArr, int i, long j) {
        this.mError = null;
        if (bArr == null || i <= 0 || i > bArr.length) {
            logSkippedDeserialization("summary", this.mRequestId, i, bArr);
        } else {
            this.mSummary = AbstractC3613CXs.A01(bArr, i);
        }
        this.mTsEndedMs = j;
    }

    public static void logSkippedDeserialization(String str, long j, int i, byte[] bArr) {
        int iIncrementAndGet = sSkippedDeserializations.incrementAndGet();
        if (iIncrementAndGet <= 5 || iIncrementAndGet % 100 == 0) {
            CFK.A0F("TigonObserverData", "Skipping %s deserialization for id %d: size=%d bufferLength=%d totalSkips=%d", str, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(bArr == null ? -1 : bArr.length), Integer.valueOf(iIncrementAndGet));
        }
    }

    private void onError(byte[] bArr, int i, byte[] bArr2, int i2, long j) {
        if (bArr == null || i <= 0 || i > bArr.length) {
            logSkippedDeserialization("error", this.mRequestId, i, bArr);
        } else {
            this.mError = AbstractC3613CXs.A00(bArr, i);
        }
        if (bArr2 == null || i2 <= 0 || i2 > bArr2.length) {
            logSkippedDeserialization("summary", this.mRequestId, i2, bArr2);
        } else {
            this.mSummary = AbstractC3613CXs.A01(bArr2, i2);
        }
        this.mTsEndedMs = j;
    }

    private void onResponse(byte[] bArr, int i) {
        if (bArr == null || i <= 0 || i > bArr.length) {
            logSkippedDeserialization(HatchPasskeyW3cKt.RESPONSE_KEY, this.mRequestId, i, bArr);
            return;
        }
        C3614CXy c3614CXy = new C3614CXy(bArr, i);
        this.mResponse = new CYF(C3615CXz.A00(c3614CXy), C3615CXz.A03(CY0.A00, c3614CXy));
    }

    private void onStarted(int i, byte[] bArr, int i2, long j) {
        this.mAttempts = i;
        if (bArr == null || i2 <= 0 || i2 > bArr.length) {
            logSkippedDeserialization("sent-request", this.mRequestId, i2, bArr);
        } else {
            this.mSentRequest = AbstractC3613CXs.A02(new C3614CXy(bArr, i2));
        }
        this.mTsStartedMs = j;
    }

    @Override // com.facebook.tigon.tigonobserver.interfaces.TigonRequestStarted
    public int attempts() {
        return this.mAttempts;
    }

    @Override // com.facebook.tigon.tigonobserver.interfaces.TigonRequestAdded
    public long creationTime() {
        return this.mCreationTime;
    }

    @Override // com.facebook.tigon.tigonobserver.interfaces.TigonRequestErrored
    public TigonError error() {
        return this.mError;
    }

    @Override // com.facebook.tigon.tigonobserver.interfaces.TigonRequestConnectionAcquisitionStarted, com.facebook.tigon.tigonobserver.interfaces.TigonRequestAdded
    public long requestId() {
        return this.mRequestId;
    }

    @Override // com.facebook.tigon.tigonobserver.interfaces.TigonRequestResponse
    public CYF response() {
        return this.mResponse;
    }

    @Override // com.facebook.tigon.tigonobserver.interfaces.TigonRequestAdded
    public TigonRequest submittedRequest() {
        return this.mSubmittedRequest;
    }

    @Override // com.facebook.tigon.tigonobserver.interfaces.TigonRequestSucceeded
    public CY1 summary() {
        return this.mSummary;
    }

    @Override // com.facebook.tigon.tigonobserver.interfaces.TigonRequestConnectionAcquisitionStarted
    public long tsConnectionAcquisitionStartedMs() {
        return this.mTsConnectionAcquisitionStartedMs;
    }

    @Override // com.facebook.tigon.tigonobserver.interfaces.TigonRequestSucceeded
    public long tsEndedMs() {
        return this.mTsEndedMs;
    }

    @Override // com.facebook.tigon.tigonobserver.interfaces.TigonRequestStarted
    public long tsStartedMs() {
        return this.mTsStartedMs;
    }

    public TigonObserverData(long j, TigonRequest tigonRequest, byte[] bArr, int i) {
        this.mRequestId = j;
        if (tigonRequest != null) {
            this.mSubmittedRequest = tigonRequest;
            return;
        }
        if (bArr == null || i <= 0 || i > bArr.length) {
            logSkippedDeserialization("submitted-request", j, i, bArr);
            return;
        }
        TigonRequest tigonRequestA02 = AbstractC3613CXs.A02(new C3614CXy(bArr, i));
        this.mSubmittedRequest = tigonRequestA02;
        if (tigonRequestA02 == null) {
            CFK.A0H("TigonObserverData", "SubmittedRequest was null after deserialization for id %d", Long.valueOf(j));
        }
    }

    private void onConnectionAcquisitionStarted(long j) {
        this.mTsConnectionAcquisitionStartedMs = j;
    }
}
