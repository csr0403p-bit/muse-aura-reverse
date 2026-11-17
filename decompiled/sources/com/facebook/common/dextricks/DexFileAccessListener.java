package com.facebook.common.dextricks;

import dalvik.system.DexFile;

/* loaded from: classes5.dex */
public interface DexFileAccessListener {
    void onClassLoadedFromDexFile(Class<?> cls, DexFile dexFile);
}
