package com.facebook.mobileconfig.factory;

import X.C4992DKo;
import android.content.res.Resources;

/* loaded from: classes5.dex */
public interface MobileConfigUnsafeContext {
    boolean getBoolean(long j);

    @Deprecated
    boolean getBoolean(long j, boolean z);

    boolean getBooleanWithOptions(long j, C4992DKo c4992DKo);

    @Deprecated
    boolean getBooleanWithOptions(long j, boolean z, C4992DKo c4992DKo);

    double getDouble(long j);

    @Deprecated
    double getDouble(long j, double d);

    @Deprecated
    double getDoubleWithOptions(long j, double d, C4992DKo c4992DKo);

    double getDoubleWithOptions(long j, C4992DKo c4992DKo);

    long getLong(long j);

    @Deprecated
    long getLong(long j, long j2);

    @Deprecated
    long getLongWithOptions(long j, long j2, C4992DKo c4992DKo);

    long getLongWithOptions(long j, C4992DKo c4992DKo);

    String getString(long j);

    String getString(long j, int i, Resources resources);

    String getString(long j, String str);

    String getStringWithOptions(long j, int i, Resources resources, C4992DKo c4992DKo);

    String getStringWithOptions(long j, C4992DKo c4992DKo);

    String getStringWithOptions(long j, String str, C4992DKo c4992DKo);

    boolean hasExposure(long j);

    void logExposure(long j);
}
