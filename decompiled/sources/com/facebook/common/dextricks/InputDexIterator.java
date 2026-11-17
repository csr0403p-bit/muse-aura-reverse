package com.facebook.common.dextricks;

import X.BV4;
import X.C8j3;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class InputDexIterator implements Closeable, Iterator<InputDex> {
    public int mDexPos = 0;
    public final DexManifest.Dex[] mDexes;
    public LightweightQuickPerformanceLogger mQplCollector;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract InputDex nextImpl(DexManifest.Dex dex);

    public final int getIdx() {
        return this.mDexPos;
    }

    public final int getLength() {
        return this.mDexes.length;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.mDexPos, this.mDexes.length);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final InputDex next() {
        try {
            DexManifest.Dex[] dexArr = this.mDexes;
            int i = this.mDexPos;
            this.mDexPos = i + 1;
            return nextImpl(dexArr[i]);
        } catch (IOException e) {
            throw BV4.A0e(e);
        }
    }

    public InputDexIterator(DexManifest dexManifest, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        this.mDexes = dexManifest.dexes;
        this.mQplCollector = lightweightQuickPerformanceLogger;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j3.A17();
    }
}
