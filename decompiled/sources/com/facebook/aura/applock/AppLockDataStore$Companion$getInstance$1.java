package com.facebook.aura.applock;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AbstractC9266GBt;
import X.C0881AGi;
import X.C3cG;
import X.C6JO;
import X.C6PF;
import X.C78W;
import X.GBK;
import X.HlU;
import android.content.Context;
import androidx.datastore.preferences.core.Preferences;
import com.facebook.aura.common.appcontext.AuraAppContext;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AppLockDataStore$Companion$getInstance$1 extends AbstractC7559F3s implements Function0<AppLockDataStore> {
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLockDataStore$Companion$getInstance$1(AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$userSession = abstractC3358CGz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AppLockDataStore invoke() {
        C6JO<Preferences> c6jo;
        Context context = AuraAppContext.INSTANCE.getContext();
        if (context == null) {
            throw C3cG.A0Q("Application context not available");
        }
        String strDataStoreNameForUser = AppLockDataStore.Companion.dataStoreNameForUser(this.$userSession);
        Map<String, C6JO<Preferences>> map = AppLockDataStore.dataStoreInstances;
        synchronized (map) {
            C6JO<Preferences> c6joA00 = map.get(strDataStoreNameForUser);
            if (c6joA00 == null) {
                AppLockDataStore$Companion$getInstance$1$dataStore$1$1$1 appLockDataStore$Companion$getInstance$1$dataStore$1$1$1 = new AppLockDataStore$Companion$getInstance$1$dataStore$1$1$1(context, strDataStoreNameForUser);
                C0881AGi c0881AGi = C0881AGi.A00;
                GBK gbk = AbstractC9266GBt.A00;
                c6joA00 = C6PF.A00(c0881AGi, appLockDataStore$Companion$getInstance$1$dataStore$1$1$1, C78W.A04(HlU.A01));
                map.put(strDataStoreNameForUser, c6joA00);
            }
            c6jo = c6joA00;
        }
        return new AppLockDataStore(c6jo);
    }
}
