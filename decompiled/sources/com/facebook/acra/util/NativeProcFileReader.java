package com.facebook.acra.util;

import X.C3cG;
import X.C60O;
import com.facebook.acra.util.ProcFileReader;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public class NativeProcFileReader extends ProcFileReader {
    public static NativeProcFileReader sInstance;
    public static final AtomicBoolean sReadyToUse = C60O.A1E();

    private native int[] getOpenFDLimitsNative();

    private native int readSchedCountersNative(int i, long[] jArr);

    private native boolean readSchedStatNative(int i, long[] jArr);

    @Override // com.facebook.acra.util.ProcFileReader
    public native int getOpenFDCount();

    @Override // com.facebook.acra.util.ProcFileReader
    public native String getOpenFileDescriptors();

    @Override // com.facebook.acra.util.ProcFileReader
    public int readSchedCounters(int i, long[] jArr) {
        if (jArr.length >= 3) {
            return readSchedCountersNative(i, jArr);
        }
        throw C60O.A0i("outNanos must hold at least 3 values");
    }

    @Override // com.facebook.acra.util.ProcFileReader
    public boolean readSchedStat(int i, long[] jArr) {
        if (jArr.length >= 2) {
            return readSchedStatNative(i, jArr);
        }
        throw C60O.A0i("outNanos must hold at least 2 values");
    }

    @Override // com.facebook.acra.util.ProcFileReader
    public native int readThreadStateChar(int i);

    public static synchronized NativeProcFileReader getInstance() {
        NativeProcFileReader nativeProcFileReader;
        nativeProcFileReader = sInstance;
        if (nativeProcFileReader == null) {
            nativeProcFileReader = new NativeProcFileReader();
            sInstance = nativeProcFileReader;
        }
        return nativeProcFileReader;
    }

    public static boolean isReady() {
        return sReadyToUse.get();
    }

    public static void nativeLibraryLoaded() {
        synchronized (NativeProcFileReader.class) {
            sReadyToUse.set(true);
            NativeProcFileReader.class.notifyAll();
        }
    }

    public NativeProcFileReader() {
        if (!sReadyToUse.get()) {
            throw C3cG.A0Q("Class is not ready");
        }
    }

    @Override // com.facebook.acra.util.ProcFileReader
    public ProcFileReader.OpenFDLimits getOpenFDLimits() {
        int[] openFDLimitsNative = getOpenFDLimitsNative();
        return new ProcFileReader.OpenFDLimits(openFDLimitsNative[0], openFDLimitsNative[1]);
    }
}
