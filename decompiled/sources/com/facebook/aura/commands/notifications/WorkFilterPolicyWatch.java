package com.facebook.aura.commands.notifications;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C60O;
import X.C7384Etj;
import X.CFK;
import android.content.Context;
import android.os.Bundle;
import com.facebook.aura.gateway.AuraProactiveSyncManager;
import com.facebook.aura.mdm.AuraManagedConfig;
import com.facebook.aura.mdm.AuraManagedKey;
import com.facebook.aura.mdm.ManagedConfigChangeListener;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class WorkFilterPolicyWatch {
    public static final WorkFilterPolicyWatch INSTANCE = new WorkFilterPolicyWatch();
    public static final AtomicBoolean registered = C60O.A1E();

    public final void ensureRegistered(Context context) {
        C7384Etj.A0Y(context, 0);
        if (registered.compareAndSet(false, true)) {
            final Context applicationContext = context.getApplicationContext();
            AuraManagedConfig auraManagedConfig = AuraManagedConfig.INSTANCE;
            C7384Etj.A0X(applicationContext);
            auraManagedConfig.addChangeListener(applicationContext, new ManagedConfigChangeListener() { // from class: com.facebook.aura.commands.notifications.WorkFilterPolicyWatch.ensureRegistered.1
                @Override // com.facebook.aura.mdm.ManagedConfigChangeListener
                public final void onManagedConfigChanged(Bundle bundle, Bundle bundle2) throws IOException {
                    AnonymousClass003.A0u(bundle, bundle2);
                    if (WorkFilterPolicyWatch.INSTANCE.isLoosened(bundle, bundle2)) {
                        CFK.A05(WorkFilterPolicyWatchKt.TAG, "Managed configuration loosened; rewinding notification sync watermark");
                        Context context2 = applicationContext;
                        C7384Etj.A0X(context2);
                        NotificationSyncPrefsKt.resetLastSyncedPostTime(context2);
                        AuraProactiveSyncManager auraProactiveSyncManager = AuraProactiveSyncManager.INSTANCE;
                        Context context3 = applicationContext;
                        C7384Etj.A0X(context3);
                        auraProactiveSyncManager.scheduleNotificationsSync(context3);
                    }
                }
            });
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraManagedKey.values().length];
            try {
                AnonymousClass002.A13(AuraManagedKey.DISABLE_NOTIFICATION_INGESTION, iArr);
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLoosened(Bundle bundle, Bundle bundle2) {
        for (AuraManagedKey auraManagedKey : AuraManagedKey.values()) {
            WorkFilterPolicyWatch workFilterPolicyWatch = INSTANCE;
            if (workFilterPolicyWatch.suppresses(bundle, auraManagedKey) && !workFilterPolicyWatch.suppresses(bundle2, auraManagedKey)) {
                return true;
            }
        }
        return false;
    }

    private final boolean suppresses(Bundle bundle, AuraManagedKey auraManagedKey) {
        int iOrdinal = auraManagedKey.ordinal();
        String wireKey = auraManagedKey.getWireKey();
        return iOrdinal == 0 ? bundle.getBoolean(wireKey, false) : bundle.getBoolean(wireKey, true);
    }
}
