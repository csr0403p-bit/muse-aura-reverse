package X;

import android.content.res.Resources;
import java.util.Map;

/* renamed from: X.DRe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC5054DRe<UnitType> {
    void addChangeListener(DSh dSh);

    boolean getBoolean(C7491Exw<Boolean, ? extends UnitType> c7491Exw);

    @Deprecated
    boolean getBoolean(C7491Exw<Boolean, ? extends UnitType> c7491Exw, boolean z);

    boolean getBooleanWithOptions(C7491Exw<Boolean, ? extends UnitType> c7491Exw, C4992DKo c4992DKo);

    @Deprecated
    boolean getBooleanWithOptions(C7491Exw<Boolean, ? extends UnitType> c7491Exw, boolean z, C4992DKo c4992DKo);

    double getDouble(C7491Exw<Double, ? extends UnitType> c7491Exw);

    @Deprecated
    double getDouble(C7491Exw<Double, ? extends UnitType> c7491Exw, double d);

    @Deprecated
    double getDoubleWithOptions(C7491Exw<Double, ? extends UnitType> c7491Exw, double d, C4992DKo c4992DKo);

    double getDoubleWithOptions(C7491Exw<Double, ? extends UnitType> c7491Exw, C4992DKo c4992DKo);

    Map<Integer, Integer> getEmergencyPushInfo();

    long getLong(C7491Exw<Long, ? extends UnitType> c7491Exw);

    @Deprecated
    long getLong(C7491Exw<Long, ? extends UnitType> c7491Exw, long j);

    @Deprecated
    long getLongWithOptions(C7491Exw<Long, ? extends UnitType> c7491Exw, long j, C4992DKo c4992DKo);

    long getLongWithOptions(C7491Exw<Long, ? extends UnitType> c7491Exw, C4992DKo c4992DKo);

    String getString(C7491Exw<String, ? extends UnitType> c7491Exw);

    String getString(C7491Exw<String, ? extends UnitType> c7491Exw, int i, Resources resources);

    String getString(C7491Exw<String, ? extends UnitType> c7491Exw, String str);

    String getStringWithOptions(C7491Exw<String, ? extends UnitType> c7491Exw, int i, Resources resources, C4992DKo c4992DKo);

    String getStringWithOptions(C7491Exw<String, ? extends UnitType> c7491Exw, C4992DKo c4992DKo);

    String getStringWithOptions(C7491Exw<String, ? extends UnitType> c7491Exw, String str, C4992DKo c4992DKo);

    boolean hasExposure(C7491Exw<?, ? extends UnitType> c7491Exw);

    boolean isAdvancedConsistencyLoggingEnabled(long j);

    void logExposure(C7491Exw<?, ?> c7491Exw);
}
