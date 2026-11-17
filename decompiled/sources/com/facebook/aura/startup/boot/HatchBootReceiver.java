package com.facebook.aura.startup.boot;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06H;
import X.C3UX;
import X.C78T;
import X.CFK;
import X.FGI;
import X.G0V;
import X.HtJ;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchBootReceiver extends BroadcastReceiver {
    public static final String BOOTSTRAP_WORK_NAME = "aura_proactive_sync_bootstrap";
    public static final Companion Companion = new Companion();
    public static final String TAG = "HatchBootReceiver";

    @DebugMetadata(c = "com.facebook.aura.startup.boot.HatchBootReceiver$onReceive$1", f = "HatchBootReceiver.kt", l = {HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX, MessageDraftSenderKt.UNICODE_MULTIPART_CHARS, 72}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.boot.HatchBootReceiver$onReceive$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $action;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        public int label;
        public final /* synthetic */ HatchBootReceiver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, String str, HatchBootReceiver hatchBootReceiver, BroadcastReceiver.PendingResult pendingResult, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$action = str;
            this.this$0 = hatchBootReceiver;
            this.$pendingResult = pendingResult;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, this.$action, this.this$0, this.$pendingResult, htJ);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(17:0|2|(1:39)|(1:(1:(1:(8:7|38|43|28|31|(2:47|33)|36|37)(2:8|9))(11:10|41|23|(1:25)|38|43|28|31|(0)|36|37))(1:11))(3:12|13|(1:15))|45|18|(1:20)|41|23|(0)|38|43|28|31|(0)|36|37) */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
        
            X.C3cG.A1G("Failed to enqueue proactive sync bootstrap: ", r0.getMessage(), com.facebook.aura.startup.boot.HatchBootReceiver.TAG);
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x005f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r4 = 3
                r6 = 2
                r5 = 1
                java.lang.String r2 = "HatchBootReceiver"
                if (r0 == 0) goto L22
                if (r0 == r5) goto L1e
                if (r0 == r6) goto L1a
                if (r0 != r4) goto L15
                X.Hwg.A00(r8)     // Catch: java.lang.Exception -> L60
                goto L6a
            L15:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L1a:
                X.Hwg.A00(r8)     // Catch: java.lang.Exception -> L49
                goto L53
            L1e:
                X.Hwg.A00(r8)     // Catch: java.lang.Exception -> L32
                goto L3c
            L22:
                X.Hwg.A00(r8)
                com.facebook.aura.commands.geofence.HatchGeofenceManager r1 = com.facebook.aura.commands.geofence.HatchGeofenceManager.INSTANCE     // Catch: java.lang.Exception -> L32
                android.content.Context r0 = r7.$context     // Catch: java.lang.Exception -> L32
                r7.label = r5     // Catch: java.lang.Exception -> L32
                java.lang.Object r0 = r1.reregisterAll(r0, r7)     // Catch: java.lang.Exception -> L32
                if (r0 != r3) goto L3c
                return r3
            L32:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                java.lang.String r0 = "Failed to re-register geofences: "
                X.C3cG.A1G(r0, r1, r2)
            L3c:
                com.facebook.aura.commands.alarm.HatchReminderScheduler r1 = com.facebook.aura.commands.alarm.HatchReminderScheduler.INSTANCE     // Catch: java.lang.Exception -> L49
                android.content.Context r0 = r7.$context     // Catch: java.lang.Exception -> L49
                r7.label = r6     // Catch: java.lang.Exception -> L49
                java.lang.Object r0 = r1.reregisterAll(r0, r7)     // Catch: java.lang.Exception -> L49
                if (r0 != r3) goto L53
                return r3
            L49:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                java.lang.String r0 = "Failed to re-arm reminders: "
                X.C3cG.A1G(r0, r1, r2)
            L53:
                com.facebook.aura.commands.alarm.HatchAlarmScheduler r1 = com.facebook.aura.commands.alarm.HatchAlarmScheduler.INSTANCE     // Catch: java.lang.Exception -> L60
                android.content.Context r0 = r7.$context     // Catch: java.lang.Exception -> L60
                r7.label = r4     // Catch: java.lang.Exception -> L60
                java.lang.Object r0 = r1.reregisterAll(r0, r7)     // Catch: java.lang.Exception -> L60
                if (r0 != r3) goto L6a
                return r3
            L60:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                java.lang.String r0 = "Failed to re-arm alarms: "
                X.C3cG.A1G(r0, r1, r2)
            L6a:
                android.content.Context r0 = r7.$context     // Catch: java.lang.Exception -> L85
                X.EK5 r5 = X.F3R.A02(r0)     // Catch: java.lang.Exception -> L85
                java.lang.String r4 = "aura_proactive_sync_bootstrap"
                X.7yC r3 = X.C7yC.A04     // Catch: java.lang.Exception -> L85
                java.lang.Class<com.facebook.aura.startup.boot.syncworker.AuraProactiveSyncBootstrapWorker> r1 = com.facebook.aura.startup.boot.syncworker.AuraProactiveSyncBootstrapWorker.class
                X.F1d r0 = new X.F1d     // Catch: java.lang.Exception -> L85
                r0.<init>(r1)     // Catch: java.lang.Exception -> L85
                X.ELb r0 = r0.A01()     // Catch: java.lang.Exception -> L85
                X.7yw r0 = (X.C7yw) r0     // Catch: java.lang.Exception -> L85
                r5.A04(r3, r0, r4)     // Catch: java.lang.Exception -> L85
                goto L8f
            L85:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                java.lang.String r0 = "Failed to enqueue proactive sync bootstrap: "
                X.C3cG.A1G(r0, r1, r2)
            L8f:
                java.lang.String r1 = r7.$action
                java.lang.String r0 = "android.intent.action.MY_PACKAGE_REPLACED"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto Lab
                com.facebook.aura.startup.boot.HatchBootReceiver r1 = r7.this$0     // Catch: java.lang.Exception -> La1
                android.content.Context r0 = r7.$context     // Catch: java.lang.Exception -> La1
                com.facebook.aura.startup.boot.HatchBootReceiver.access$forceNotificationListenerRebind(r1, r0)     // Catch: java.lang.Exception -> La1
                goto Lab
            La1:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                java.lang.String r0 = "Failed to force notification listener rebind: "
                X.C3cG.A1G(r0, r1, r2)
            Lab:
                android.content.BroadcastReceiver$PendingResult r0 = r7.$pendingResult
                r0.finish()
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.boot.HatchBootReceiver.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AnonymousClass003.A0u(context, intent);
        String action = intent.getAction();
        if ("android.intent.action.BOOT_COMPLETED".equals(action) || "android.intent.action.MY_PACKAGE_REPLACED".equals(action)) {
            CFK.A05(TAG, FGI.A0M("Boot/update received: ", action));
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            AnonymousClass001.A1J(new AnonymousClass1(context, action, this, pendingResultGoAsync, null), C78T.A01(AnonymousClass001.A0y(), null));
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forceNotificationListenerRebind(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context.getPackageName(), "com.facebook.aura.commands.notifications.NodeNotificationListenerService");
        packageManager.setComponentEnabledSetting(componentName, 2, 1);
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
        CFK.A05(TAG, "Forced notification listener rebind via component-enabled toggle");
    }
}
