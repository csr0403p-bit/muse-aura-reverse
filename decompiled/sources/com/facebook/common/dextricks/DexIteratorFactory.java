package com.facebook.common.dextricks;

import X.BV4;
import X.FGI;
import android.content.Context;
import com.facebook.common.dextricks.SuperpackInputDexIterator;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* loaded from: classes5.dex */
public class DexIteratorFactory {
    public final ResProvider mResProvider;

    private SuperpackInputDexIterator openSuperpackDexIterator(DexManifest dexManifest, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        SuperpackInputDexIterator.Builder builder = new SuperpackInputDexIterator.Builder(dexManifest, lightweightQuickPerformanceLogger);
        String archiveExtension = SuperpackInputDexIterator.getArchiveExtension(builder);
        for (int i = 0; i < dexManifest.superpackFiles; i++) {
            builder.addRawArchive(this.mResProvider.open(FGI.A0I("store-", i, archiveExtension)));
        }
        for (int i2 = 0; i2 < dexManifest.dexes.length; i2++) {
            builder.assignDexToArchive(i2, i2 % dexManifest.superpackFiles);
        }
        return builder.build();
    }

    public InputDexIterator openDexIterator(String str, DexManifest dexManifest, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, Context context) {
        if (dexManifest.superpackFiles > 0) {
            return openSuperpackDexIterator(dexManifest, lightweightQuickPerformanceLogger);
        }
        Mlog.v("using discrete file inputs for store", BV4.A1W());
        return new DiscreteFileInputDexIterator(dexManifest, this.mResProvider);
    }

    public DexIteratorFactory(ResProvider resProvider) {
        this.mResProvider = resProvider;
    }
}
