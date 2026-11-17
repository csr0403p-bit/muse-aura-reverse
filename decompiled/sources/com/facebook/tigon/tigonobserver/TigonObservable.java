package com.facebook.tigon.tigonobserver;

import X.BV4;
import X.C60O;
import X.CFK;
import X.ETi;
import X.EUK;
import X.EUL;
import X.EUN;
import X.EUU;
import X.EUV;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.jni.HybridData;
import com.facebook.tigon.TigonXplatService;
import com.facebook.tigon.tigonobserver.interfaces.TigonBodyObservation;
import com.facebook.tigon.tigonobserver.interfaces.TigonRequestAdded;
import com.facebook.tigon.tigonobserver.interfaces.TigonRequestConnectionAcquisitionStarted;
import com.facebook.tigon.tigonobserver.interfaces.TigonRequestErrored;
import com.facebook.tigon.tigonobserver.interfaces.TigonRequestResponse;
import com.facebook.tigon.tigonobserver.interfaces.TigonRequestStarted;
import com.facebook.tigon.tigonobserver.interfaces.TigonRequestSucceeded;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public class TigonObservable {
    public static final String TAG;
    public final ArrayList<EUU> mDebugObservers;
    public final Executor mExecutor;
    public final HybridData mHybridData;
    public final EUL<EUK> mObjectPool;
    public final ArrayList<EUV> mObservers;

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void callOnAdded(TigonRequestAdded tigonRequestAdded) {
        Iterator<EUV> it = this.mObservers.iterator();
        if (it.hasNext()) {
            it.next();
            if (tigonRequestAdded.submittedRequest() == null) {
                CFK.A0H(TAG, "SubmittedRequest was null before callOnAdded for id %d", Long.valueOf(tigonRequestAdded.requestId()));
            }
            throw new NullPointerException("onAdded");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void callOnConnectionAcquisitionStarted(TigonRequestConnectionAcquisitionStarted tigonRequestConnectionAcquisitionStarted) {
        Iterator<EUV> it = this.mObservers.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("onConnectionAcquisitionStarted");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void callOnDownloadBody(TigonBodyObservation tigonBodyObservation) {
        Iterator<EUU> it = this.mDebugObservers.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("onDownloadBody");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void callOnEOM(TigonRequestSucceeded tigonRequestSucceeded) {
        Iterator<EUV> it = this.mObservers.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("onEOM");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void callOnError(TigonRequestErrored tigonRequestErrored) {
        Iterator<EUV> it = this.mObservers.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("onError");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void callOnResponse(TigonRequestResponse tigonRequestResponse) {
        Iterator<EUV> it = this.mObservers.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("onResponse");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void callOnStarted(TigonRequestStarted tigonRequestStarted) {
        Iterator<EUV> it = this.mObservers.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("onStarted");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void callOnUploadBody(TigonBodyObservation tigonBodyObservation) {
        Iterator<EUU> it = this.mDebugObservers.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("onUploadBody");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void callOnWillRetry(TigonRequestErrored tigonRequestErrored) {
        Iterator<EUV> it = this.mObservers.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("onWillRetry");
        }
    }

    private native HybridData initHybrid(TigonXplatService tigonXplatService, boolean z, boolean z2);

    private void onConnectionAcquisitionStarted(TigonObserverData tigonObserverData) {
        runExecutor(1, tigonObserverData);
    }

    private void onEOM(TigonObserverData tigonObserverData) {
        runExecutor(4, tigonObserverData);
    }

    private void onError(TigonObserverData tigonObserverData) {
        runExecutor(5, tigonObserverData);
    }

    private void onResponse(TigonObserverData tigonObserverData) {
        runExecutor(3, tigonObserverData);
    }

    private void onStarted(TigonObserverData tigonObserverData) {
        runExecutor(2, tigonObserverData);
    }

    private void onUploadBody(TigonBodyObservation tigonBodyObservation) {
        runDebugExecutor(7, tigonBodyObservation);
    }

    private void onWillRetry(TigonObserverData tigonObserverData) {
        runExecutor(6, tigonObserverData);
    }

    public synchronized void addDebugObserver(EUU euu) {
        this.mDebugObservers.add(euu);
    }

    public synchronized void addObserver(EUV euv) {
        this.mObservers.add(euv);
    }

    public synchronized void removeObserver(EUV euv) {
        this.mObservers.remove(euv);
    }

    private void onDownloadBody(TigonBodyObservation tigonBodyObservation) {
        runDebugExecutor(8, tigonBodyObservation);
    }

    private void runDebugExecutor(int i, TigonBodyObservation tigonBodyObservation) {
        EUK eukA01 = this.mObjectPool.A01();
        eukA01.A00 = i;
        eukA01.A02 = tigonBodyObservation;
        this.mExecutor.execute(eukA01);
    }

    private void runExecutor(int i, TigonObserverData tigonObserverData) {
        EUK eukA01 = this.mObjectPool.A01();
        eukA01.A00 = i;
        eukA01.A01 = tigonObserverData;
        if (tigonObserverData.submittedRequest() == null) {
            CFK.A0H(eukA01.A03, "SubmittedRequest was null after initStep for id %d", Long.valueOf(tigonObserverData.requestId()));
        }
        this.mExecutor.execute(eukA01);
    }

    static {
        ETi.loadLibrary("tigonobserver");
        TAG = "TigonObservable";
    }

    public TigonObservable(TigonXplatService tigonXplatService, boolean z, boolean z2, Executor executor, EUV[] euvArr, EUU[] euuArr) {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        EUN eun = new EUN(this);
        if (awakeTimeSinceBootClock == null) {
            throw C60O.A0i("Must add a clock to the object pool builder");
        }
        this.mObjectPool = new EUL<>(eun, awakeTimeSinceBootClock, EUK.class);
        if (executor == null) {
            throw BV4.A0a("Executor is required");
        }
        if (!tigonXplatService.isObservable()) {
            throw C60O.A0i("Tigon stack is not Observable");
        }
        this.mObservers = BV4.A0t(Arrays.asList(euvArr == null ? new EUV[0] : euvArr));
        this.mDebugObservers = BV4.A0t(Arrays.asList(euuArr == null ? new EUU[0] : euuArr));
        this.mExecutor = executor;
        this.mHybridData = initHybrid(tigonXplatService, z, z2);
    }

    private void onAdded(TigonObserverData tigonObserverData) {
        if (tigonObserverData.submittedRequest() == null) {
            CFK.A0H(TAG, "SubmittedRequest was null before Java onAdded for id %d", Long.valueOf(tigonObserverData.requestId()));
        }
        runExecutor(0, tigonObserverData);
    }
}
