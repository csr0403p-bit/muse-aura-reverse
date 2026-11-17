package X;

import android.content.Context;
import com.facebook.aura.appmodules.AuraAppModuleDownloadActionManager;
import com.facebook.aura.appmodules.AuraPlayModuleDownloadManager;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class CDv {
    public final Context context;
    public final C7cU lightSharedPreferencesFactory;

    public CDv(Context context, C7cU c7cU) {
        C7384Etj.A0Y(context, 0);
        this.context = context;
        this.lightSharedPreferencesFactory = c7cU;
    }

    public abstract boolean areDownloadsEnabled();

    public final BY3 getActivePackaging(String str) {
        C7384Etj.A0Y(str, 0);
        return CCn.A01(str);
    }

    public abstract EnumC7441Ew4 getPackagingPreference(String str);

    public abstract InterfaceC3307CDg getVoltronDownloadManager();

    public abstract boolean isSystemPrefetchEnabled(String str);

    public final boolean wasDownloadedAttempted(String str) {
        C4oT c4oTA00;
        C7384Etj.A0Y(str, 0);
        C7cU c7cU = this.lightSharedPreferencesFactory;
        return (c7cU == null || (c4oTA00 = c7cU.A00("AppModules::PrevDownload")) == null || !c4oTA00.getBoolean(str, false)) ? false : true;
    }

    public final String getDownloaderName() {
        String str;
        InterfaceC3307CDg interfaceC3307CDg = ((AuraAppModuleDownloadActionManager) this).voltronDownloadManager;
        return (interfaceC3307CDg == null || (str = ((AuraPlayModuleDownloadManager) interfaceC3307CDg).name) == null) ? "unknown" : str;
    }

    public BY3 getSystemDecidePackaging() {
        return BY3.A02;
    }

    public Set<String> querySystemPrefetchModules() {
        return C60O.A13();
    }
}
