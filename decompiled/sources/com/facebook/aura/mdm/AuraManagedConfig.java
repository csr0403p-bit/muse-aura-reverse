package com.facebook.aura.mdm;

import X.AbstractC0878AGe;
import X.AbstractC4103Cmd;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.C7384Etj;
import X.CFK;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class AuraManagedConfig {
    public static volatile Bundle cached;
    public static volatile boolean receiverRegistered;
    public static final AuraManagedConfig INSTANCE = new AuraManagedConfig();
    public static final CopyOnWriteArraySet<ManagedConfigChangeListener> changeListeners = new CopyOnWriteArraySet<>();

    private final synchronized void ensureReceiverRegistered(Context context) {
        if (!receiverRegistered) {
            final Context applicationContext = context.getApplicationContext();
            AbstractC4103Cmd.A04(new BroadcastReceiver() { // from class: com.facebook.aura.mdm.AuraManagedConfig$ensureReceiverRegistered$receiver$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    Bundle bundle = AuraManagedConfig.cached;
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    AuraManagedConfig auraManagedConfig = AuraManagedConfig.INSTANCE;
                    Context context3 = applicationContext;
                    C7384Etj.A0X(context3);
                    Bundle bundleRefresh = auraManagedConfig.refresh(context3);
                    Iterator<ManagedConfigChangeListener> it = AuraManagedConfig.changeListeners.iterator();
                    while (it.hasNext()) {
                        ManagedConfigChangeListener next = it.next();
                        C7384Etj.A0X(bundle);
                        next.onManagedConfigChanged(bundle, bundleRefresh);
                    }
                }
            }, applicationContext, new IntentFilter("android.intent.action.APPLICATION_RESTRICTIONS_CHANGED"), 4);
            receiverRegistered = true;
        }
    }

    public final boolean isNotificationIngestionDisabled(Context context) {
        C7384Etj.A0Y(context, 0);
        return AnonymousClass002.A1b(managedBoolean(context, AuraManagedKey.DISABLE_NOTIFICATION_INGESTION), true);
    }

    public final Long lastReceivedAtMs(Context context) {
        C7384Etj.A0Y(context, 0);
        long j = prefs(context).getLong(AuraManagedConfigKt.KEY_LAST_RECEIVED_AT_MS, 0L);
        Long lValueOf = Long.valueOf(j);
        if (j <= 0) {
            return null;
        }
        return lValueOf;
    }

    public final Bundle restrictions(Context context) {
        C7384Etj.A0Y(context, 0);
        ensureReceiverRegistered(context);
        Bundle bundle = cached;
        return bundle == null ? refresh(context) : bundle;
    }

    private final SharedPreferences prefs(Context context) {
        return context.getApplicationContext().getSharedPreferences(AuraManagedConfigKt.PREFS, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle refresh(Context context) {
        Bundle applicationRestrictions;
        RestrictionsManager restrictionsManager;
        Context applicationContext = context.getApplicationContext();
        Object systemService = applicationContext.getSystemService("restrictions");
        if (!(systemService instanceof RestrictionsManager) || (restrictionsManager = (RestrictionsManager) systemService) == null || (applicationRestrictions = restrictionsManager.getApplicationRestrictions()) == null) {
            applicationRestrictions = Bundle.EMPTY;
        }
        cached = applicationRestrictions;
        if (!applicationRestrictions.isEmpty()) {
            SharedPreferences sharedPreferencesPrefs = prefs(applicationContext);
            C7384Etj.A0U(sharedPreferencesPrefs);
            SharedPreferences.Editor editorEdit = sharedPreferencesPrefs.edit();
            editorEdit.putLong(AuraManagedConfigKt.KEY_LAST_RECEIVED_AT_MS, System.currentTimeMillis());
            editorEdit.apply();
        }
        Set<String> setKeySet = applicationRestrictions.keySet();
        C7384Etj.A0U(setKeySet);
        CFK.A05(AuraManagedConfigKt.TAG, AnonymousClass007.A0a("Managed configuration refreshed: ", AbstractC0878AGe.A0W(setKeySet)));
        return applicationRestrictions;
    }

    public final void addChangeListener(Context context, ManagedConfigChangeListener managedConfigChangeListener) {
        AnonymousClass003.A0u(context, managedConfigChangeListener);
        ensureReceiverRegistered(context);
        changeListeners.add(managedConfigChangeListener);
    }

    public final Boolean managedBoolean(Context context, AuraManagedKey auraManagedKey) {
        AnonymousClass003.A0u(context, auraManagedKey);
        Bundle bundleRestrictions = restrictions(context);
        if (bundleRestrictions.containsKey(auraManagedKey.getWireKey())) {
            return Boolean.valueOf(bundleRestrictions.getBoolean(auraManagedKey.getWireKey()));
        }
        return null;
    }
}
