package X;

import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import com.facebook.mobileconfig.MobileConfigEmergencyPushChangeListener;
import com.facebook.mobileconfig.MobileConfigResolvedParamsReceiver;
import com.facebook.mobileconfig.MobileConfigUpdateOverridesTableCallback;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;
import java.util.Map;
import java.util.Set;

/* renamed from: X.DRj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC5058DRj {
    void clearCurrentUserData();

    void clearOverrides();

    boolean containsParamsHashForPackage(String str, String str2, int i);

    void deleteOldUserData(int i);

    void fetchNames(boolean z, MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback);

    String getConsistencyLoggingFlagsJSON();

    String getDataDirPath();

    String getFrameworkStatus();

    int getInitStatus();

    long getLastNormalUpdateTimestamp();

    Integer getLatestEPRefreshId();

    Long getLatestFetchIntervalSec();

    DSZ getLatestHandle();

    long getLatestTotalParamsCount();

    DS5 getOrCreateOverridesTable();

    String getParamsHashForPackage(String str);

    String getSchemaString();

    boolean isConsistencyLoggingNeeded(EnumC7501EyH enumC7501EyH);

    boolean isFetchNeeded();

    boolean isValid();

    void logAccessWithoutExposure(String str, String str2);

    void logConfigs(String str, EnumC7501EyH enumC7501EyH, Map<String, String> map);

    void logConfigs(String str, EnumC7501EyH enumC7501EyH, Map<String, String> map, String str2);

    void logError(String str, String str2, String str3);

    void logExposure(String str, long j);

    void logExposure(String str, long j, String str2);

    void logExposure(String str, long j, String str2, String str3);

    void logStorageConsistency();

    boolean registerConfigChangeListener(MobileConfigCxxChangeListener mobileConfigCxxChangeListener);

    boolean setEpHandler(MobileConfigEmergencyPushChangeListener mobileConfigEmergencyPushChangeListener);

    void setFamilyDeviceId(String str);

    void setOverridesTableCallback(MobileConfigUpdateOverridesTableCallback mobileConfigUpdateOverridesTableCallback);

    void setResolvedParamsReceiver(MobileConfigResolvedParamsReceiver mobileConfigResolvedParamsReceiver);

    String syncFetchReason();

    Set<String> tryLogExposuresInJava(Set<String> set);

    boolean tryUpdateConfigs();

    boolean tryUpdateConfigsSynchronously(int i);

    boolean updateConfigs();

    boolean updateConfigs(DS1 ds1);

    boolean updateConfigsSynchronouslyWithDefaultUpdater(int i);

    boolean updateEmergencyPushConfigs();

    boolean updateEmergencyPushConfigs(MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback);

    boolean updateEmergencyPushConfigs(MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback, Integer num);

    boolean updateEmergencyPushConfigsSynchronously(int i);

    boolean usePartialAndFullSyncFetch();
}
