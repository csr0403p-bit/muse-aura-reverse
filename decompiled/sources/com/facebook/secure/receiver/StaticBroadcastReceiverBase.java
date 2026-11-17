package com.facebook.secure.receiver;

import X.AnonymousClass003;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C7n1;
import X.C7o5;
import X.C8fD;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.facebook.secure.trustedapp.exception.SignatureNotFoundException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class StaticBroadcastReceiverBase extends SecureBroadcastReceiverBase {
    public abstract void doReceive(Context context, Intent intent, C8fD c8fD);

    public Executor getAsyncExecutor() {
        throw new UnsupportedOperationException("getAsyncExecutor() must be overridden when shouldProcessAsync() returns true");
    }

    @Override // com.facebook.secure.receiver.SecureBroadcastReceiverBase
    public Object getEndpointObject(String str) {
        return this;
    }

    public final C7n1 getScope() {
        return this.scope;
    }

    @Override // com.facebook.secure.receiver.SecureBroadcastReceiverBase
    public String getTag() {
        return "StaticBroadcastReceiverBase";
    }

    public boolean shouldProcessAsync() {
        return false;
    }

    private final boolean canFailOpen(String str) {
        getClass().isAnnotationPresent(FailOpenDuringMigration.class);
        return false;
    }

    private final boolean checkActionList(Context context, Intent intent) {
        int i;
        if (intent.getComponent() != null) {
            String action = intent.getAction();
            if (action == null) {
                action = "";
            }
            if (action.length() != 0 || shouldCheckActionNotNull()) {
                PackageManager packageManager = context.getPackageManager();
                C7384Etj.A0U(packageManager);
                Intent intentA03 = C60P.A03(action);
                Intent intentA032 = C60P.A03(action);
                Uri data = intent.getData();
                if (data != null) {
                    intentA032.setData(data);
                }
                try {
                    Iterator it = Arrays.asList(intentA03, intentA032).iterator();
                    loop0: while (it.hasNext()) {
                        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers((Intent) it.next(), 64);
                        C7384Etj.A0U(listQueryBroadcastReceivers);
                        for (ResolveInfo resolveInfo : listQueryBroadcastReceivers) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            if (activityInfo != null && ((PackageItemInfo) activityInfo).packageName.equals(context.getPackageName())) {
                                String str = ((PackageItemInfo) resolveInfo.activityInfo).name;
                                ComponentName component = intent.getComponent();
                                if (str.equals(String.valueOf(component != null ? component.getClassName() : null))) {
                                    IntentFilter intentFilter = resolveInfo.filter;
                                    C7384Etj.A0T(intentFilter);
                                    int iCountActions = intentFilter.countActions() - 1;
                                    if (iCountActions >= 0) {
                                        while (true) {
                                            String action2 = intentFilter.getAction(i);
                                            C7384Etj.A0U(action2);
                                            if (action2.compareTo(action) == 0) {
                                                break loop0;
                                            }
                                            i = i != iCountActions ? i + 1 : 0;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processOnReceive(Context context, Intent intent) {
        String endpointName = getEndpointName(context);
        try {
            super.onReceive(context, intent);
            if (!checkActionList(context, intent)) {
                C7o5.A00.A01(intent, endpointName, "action_not_in_manifest");
                return;
            }
            intent.getAction();
            doReceive(context, intent, this);
            C7o5.A00.A00(intent, endpointName);
        } catch (SecurityException e) {
            boolean z = e instanceof SignatureNotFoundException;
            String strA1L = z ? "signature_not_found" : C60P.A1L("security_exception: ", C60Q.A0e(e), e.getMessage());
            canFailOpen(endpointName);
            C7o5.A00.A01(intent, endpointName, strA1L);
            if (z) {
                throw e;
            }
        }
    }

    @Override // com.facebook.secure.receiver.SecureBroadcastReceiverBase, android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        AnonymousClass003.A0u(context, intent);
        if (!shouldProcessAsync()) {
            processOnReceive(context, intent);
        } else {
            final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            getAsyncExecutor().execute(new Runnable() { // from class: X.7o3
                public static final String __redex_internal_original_name = "StaticBroadcastReceiverBase$onReceive$1";

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.processOnReceive(context, intent);
                    } finally {
                        pendingResultGoAsync.finish();
                    }
                }
            });
        }
    }

    public boolean verifyActionCustomCheck(Context context, String str) {
        return true;
    }
}
