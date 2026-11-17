package com.facebook.aura.gateway.service;

import X.AbstractC07127nr;
import X.AbstractC0882AGj;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BQG;
import X.C06H;
import X.C10533Hqc;
import X.C3UX;
import X.C3cF;
import X.C3cG;
import X.C3cI;
import X.C3cJ;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C6ys;
import X.C7384Etj;
import X.C78T;
import X.C78W;
import X.C79;
import X.CFK;
import X.EG6;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.HwK;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzP;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.facebook.aura.R;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.NodeForegroundServiceState;
import com.facebook.aura.nodes.HatchNodeClient;
import com.facebook.aura.perf.HatchNodeQplLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class NodeCommandService extends Service {
    public static final String ACTION_CANCEL_ALL = "action_cancel_all";
    public static final String ACTION_GEOFENCE_TRIGGER = "action_geofence_trigger";
    public static final String CHANNEL_ID = "aura_command_execution";
    public static final Companion Companion = new Companion();
    public static final String EXTRA_COMMAND = "extra_command";
    public static final String EXTRA_GEOFENCE_ID = "extra_geofence_id";
    public static final String EXTRA_GEOFENCE_LABEL = "extra_geofence_label";
    public static final String EXTRA_LATITUDE = "extra_latitude";
    public static final String EXTRA_LONGITUDE = "extra_longitude";
    public static final String EXTRA_PARAMS_JSON = "extra_params_json";
    public static final String EXTRA_REQUEST_ID = "extra_request_id";
    public static final String EXTRA_TIMEOUT_MS = "extra_timeout_ms";
    public static final String EXTRA_TRIGGER_TYPE = "extra_trigger_type";
    public static final int NOTIFICATION_ID = 9001;
    public static final String TAG = "AuraCommandExecService";
    public final Set<String> attemptedRequestIds;
    public int latestStartId;
    public final Set<Integer> silentlyCancelled;
    public final C3UX scope = C78T.A00();
    public final ConcurrentHashMap<Integer, HoC> activeJobs = C60O.A1C();

    @DebugMetadata(c = "com.facebook.aura.gateway.service.NodeCommandService", f = "NodeCommandService.kt", l = {180, 183}, m = "executeAndReport", v = 2)
    /* renamed from: com.facebook.aura.gateway.service.NodeCommandService$executeAndReport$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NodeCommandService.this.executeAndReport(null, null, null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.service.NodeCommandService$finishJob$2", f = "NodeCommandService.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.service.NodeCommandService$finishJob$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $startId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$startId = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NodeCommandService.this.new AnonymousClass2(this.$startId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            NodeCommandService.this.activeJobs.remove(C3cG.A0R(this.$startId));
            NodeCommandService.this.silentlyCancelled.remove(C3cG.A0R(this.$startId));
            NodeCommandService.this.stopSelfIfIdle();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        StringBuilder sbA0x;
        this.latestStartId = i2;
        boolean zPromoteToForeground = promoteToForeground();
        if (ACTION_CANCEL_ALL.equals(intent != null ? intent.getAction() : null)) {
            cancelAllCommands();
        } else if (zPromoteToForeground) {
            AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
            if (currentUserSession == null) {
                str = "Missing user session so stopping; startId=";
            } else {
                if (ACTION_GEOFENCE_TRIGGER.equals(intent != null ? intent.getAction() : null)) {
                    return handleGeofenceTrigger(currentUserSession, intent, i2);
                }
                if (intent != null) {
                    String stringExtra = intent.getStringExtra(EXTRA_COMMAND);
                    String stringExtra2 = intent.getStringExtra(EXTRA_REQUEST_ID);
                    if (stringExtra != null && stringExtra.length() != 0 && stringExtra2 != null && stringExtra2.length() != 0) {
                        if (!this.attemptedRequestIds.add(stringExtra2)) {
                            C3cG.A1G("Dropping redelivered command: requestId=", BQG.A17(stringExtra2, 8), TAG);
                            HatchNodeQplLogger.INSTANCE.logCommandRedeliveredDropped(stringExtra2, stringExtra);
                            stopSelfIfIdle();
                            return 2;
                        }
                        if (!HatchNodeClient.Companion.getInstance(currentUserSession, AnonymousClass001.A0I(this)).serviceDispatches.remove(stringExtra2)) {
                            sbA0x = C3cI.A0x("Dropping command dispatched by another session: requestId=", BQG.A17(stringExtra2, 8));
                            CFK.A06(TAG, sbA0x.toString());
                            stopSelfIfIdle();
                            return 2;
                        }
                        String stringExtra3 = intent.getStringExtra(EXTRA_PARAMS_JSON);
                        long longExtra = intent.getLongExtra(EXTRA_TIMEOUT_MS, 0L);
                        Long lValueOf = longExtra > 0 ? Long.valueOf(longExtra) : null;
                        String strA17 = BQG.A17(stringExtra2, 8);
                        int length = 0;
                        boolean z = false;
                        if (stringExtra3 != null) {
                            z = true;
                            length = stringExtra3.length();
                        }
                        StringBuilder sbA0x2 = C3cI.A0x("onStartCommand: command=", stringExtra);
                        sbA0x2.append(", requestId=");
                        sbA0x2.append(strA17);
                        sbA0x2.append(", hasParams=");
                        sbA0x2.append(z);
                        CFK.A05(TAG, C60P.A1O(", paramsLength=", sbA0x2, length));
                        PendingCommandStore.INSTANCE.save(AnonymousClass001.A0I(this), stringExtra2, stringExtra);
                        C10533Hqc c10533HqcA02 = GAo.A02(C79.A01, C6ys.A00, new NodeCommandService$onStartCommand$job$1(stringExtra, this, i2, stringExtra2, stringExtra3, currentUserSession, lValueOf, null), this.scope);
                        this.activeJobs.put(Integer.valueOf(i2), c10533HqcA02);
                        c10533HqcA02.Afv();
                        return 3;
                    }
                }
                str = "Missing command or request_id in intent, stopping startId=";
            }
            sbA0x = C60O.A0y(str, i2);
            CFK.A06(TAG, sbA0x.toString());
            stopSelfIfIdle();
            return 2;
        }
        return 2;
    }

    public final class Companion {
        public final void cancelAll(Context context) {
            C7384Etj.A0Y(context, 0);
            if (AnonymousClass003.A1Z(NodeForegroundServiceState._isForeground)) {
                Intent intent = new Intent(context, (Class<?>) NodeCommandService.class);
                intent.setAction(NodeCommandService.ACTION_CANCEL_ALL);
                context.startService(intent);
            }
        }

        public final void enqueueGeofenceTrigger(Context context, String str, String str2, String str3, double d, double d2, Long l, Float f) {
            AnonymousClass005.A14(context, str, str2, str3);
            GeofenceEventWorker.Companion.enqueue(context, str, str2, str3, d, d2, l, f);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void cancelAllCommands() {
        CFK.A05(TAG, FGI.A0I("Cancelling all ", this.activeJobs.size(), " active command(s)"));
        Set<Integer> set = this.silentlyCancelled;
        Set<Integer> setKeySet = this.activeJobs.keySet();
        C7384Etj.A0U(setKeySet);
        AbstractC0882AGj.A0r(setKeySet, set);
        Iterator itA1R = C60P.A1R(this.activeJobs);
        while (itA1R.hasNext()) {
            HoC hoC = (HoC) itA1R.next();
            C7384Etj.A0X(hoC);
            hoC.A5w(null);
        }
        this.activeJobs.clear();
        PendingCommandStore.INSTANCE.clearAll(AnonymousClass001.A0I(this));
        stopSelfIfIdle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void clearStaleCommands() {
        PendingCommandStore pendingCommandStore = PendingCommandStore.INSTANCE;
        List<HxE<String, String>> all = pendingCommandStore.getAll(AnonymousClass001.A0I(this));
        if (all.isEmpty()) {
            return;
        }
        CFK.A05(TAG, FGI.A0I("Clearing ", all.size(), " stale command(s) from previous session"));
        Iterator<HxE<String, String>> it = all.iterator();
        while (it.hasNext()) {
            String str = (String) C60Q.A10(it).first;
            this.attemptedRequestIds.add(str);
            pendingCommandStore.remove(AnonymousClass001.A0I(this), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeAndReport(java.lang.String r14, java.lang.String r15, java.lang.String r16, X.AbstractC3358CGz r17, java.lang.Long r18, kotlin.jvm.functions.Function0<java.lang.Boolean> r19, X.HtJ<? super kotlin.Unit> r20) {
        /*
            r13 = this;
            r3 = r20
            r12 = r19
            r10 = r18
            r6 = r17
            r9 = r16
            r7 = r15
            r8 = r14
            boolean r0 = r3 instanceof com.facebook.aura.gateway.service.NodeCommandService.AnonymousClass1
            if (r0 == 0) goto L93
            r14 = r3
            com.facebook.aura.gateway.service.NodeCommandService$executeAndReport$1 r14 = (com.facebook.aura.gateway.service.NodeCommandService.AnonymousClass1) r14
            int r2 = r14.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L93
            int r2 = r2 - r1
            r14.label = r2
        L1e:
            java.lang.Object r0 = r14.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r4 = r14.label
            r3 = 2
            r1 = 1
            if (r4 == 0) goto L32
            if (r4 == r1) goto L4e
            if (r4 != r3) goto L99
            X.Hwg.A00(r0)
        L2f:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L32:
            X.Hwg.A00(r0)
            com.facebook.aura.startup.readiness.BackgroundReadyState r4 = com.facebook.aura.startup.readiness.BackgroundReadyState.INSTANCE
            r14.L$0 = r8
            r14.L$1 = r15
            r14.L$2 = r9
            r14.L$3 = r6
            r14.L$4 = r10
            r14.L$5 = r12
            r14.label = r1
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r0 = r4.awaitReadyOrTimeout(r0, r14)
            if (r0 != r2) goto L68
            return r2
        L4e:
            java.lang.Object r12 = r14.L$5
            kotlin.jvm.functions.Function0 r12 = (kotlin.jvm.functions.Function0) r12
            java.lang.Object r10 = r14.L$4
            java.lang.Long r10 = (java.lang.Long) r10
            java.lang.Object r6 = r14.L$3
            X.CGz r6 = (X.AbstractC3358CGz) r6
            java.lang.Object r9 = r14.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r14.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r1 = r14.L$0
            java.lang.String r8 = X.C3cG.A0d(r1, r0)
        L68:
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 != 0) goto L75
            java.lang.String r1 = "AuraCommandExecService"
            java.lang.String r0 = "BackgroundReadyState not ready within timeout; proceeding best-effort"
            X.CFK.A06(r1, r0)
        L75:
            com.facebook.aura.gateway.service.NodeCommandDispatcher r4 = com.facebook.aura.gateway.service.NodeCommandDispatcher.INSTANCE
            android.content.Context r5 = X.AnonymousClass001.A0I(r13)
            r11 = 0
            r14.L$0 = r11
            r14.L$1 = r11
            r14.L$2 = r11
            r14.L$3 = r11
            r14.L$4 = r11
            r14.L$5 = r11
            r14.label = r3
            com.facebook.aura.gateway.service.NodeCommandDispatcher$execute$3 r13 = com.facebook.aura.gateway.service.NodeCommandDispatcher.AnonymousClass3.INSTANCE
            java.lang.Object r0 = r4.execute(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r0 != r2) goto L2f
            return r2
        L93:
            com.facebook.aura.gateway.service.NodeCommandService$executeAndReport$1 r14 = new com.facebook.aura.gateway.service.NodeCommandService$executeAndReport$1
            r14.<init>(r3)
            goto L1e
        L99:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.service.NodeCommandService.executeAndReport(java.lang.String, java.lang.String, java.lang.String, X.CGz, java.lang.Long, kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishJob(int i, HtJ<? super Unit> htJ) {
        return C3cJ.A0D(htJ, C78W.A02(HwK.A00, AuraDispatchers.mainImmediate), new AnonymousClass2(i, null));
    }

    private final int handleGeofenceTrigger(AbstractC3358CGz abstractC3358CGz, Intent intent, int i) {
        String stringExtra = intent.getStringExtra(EXTRA_GEOFENCE_ID);
        String stringExtra2 = intent.getStringExtra(EXTRA_GEOFENCE_LABEL);
        if (stringExtra2 == null) {
            stringExtra2 = "unknown";
        }
        String stringExtra3 = intent.getStringExtra(EXTRA_TRIGGER_TYPE);
        if (stringExtra3 == null) {
            stringExtra3 = "unknown";
        }
        double doubleExtra = intent.getDoubleExtra(EXTRA_LATITUDE, 0.0d);
        double doubleExtra2 = intent.getDoubleExtra(EXTRA_LONGITUDE, 0.0d);
        if (stringExtra == null || stringExtra.length() == 0) {
            CFK.A06(TAG, "Missing geofence_id in geofence trigger intent");
            stopSelfIfIdle();
            return 2;
        }
        C3UX c3ux = this.scope;
        C10533Hqc c10533HqcA02 = GAo.A02(C79.A01, C6ys.A00, new NodeCommandService$handleGeofenceTrigger$job$1(stringExtra, this, i, abstractC3358CGz, doubleExtra, doubleExtra2, stringExtra2, stringExtra3, null), c3ux);
        this.activeJobs.put(Integer.valueOf(i), c10533HqcA02);
        c10533HqcA02.Afv();
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopSelfIfIdle() {
        if (this.activeJobs.isEmpty()) {
            stopSelfResult(this.latestStartId);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    public NodeCommandService() {
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        C7384Etj.A0U(keySetViewNewKeySet);
        this.silentlyCancelled = keySetViewNewKeySet;
        this.attemptedRequestIds = C60O.A18();
    }

    private final Notification buildNotification() {
        ensureNotificationChannel();
        Intent launchIntentForPackage = getApplicationContext().getPackageManager().getLaunchIntentForPackage(getApplicationContext().getPackageName());
        PendingIntent activity = launchIntentForPackage != null ? PendingIntent.getActivity(getApplicationContext(), 0, launchIntentForPackage, 201326592) : null;
        Context applicationContext = getApplicationContext();
        Intent intent = new Intent(getApplicationContext(), (Class<?>) NodeCommandService.class);
        intent.setAction(ACTION_CANCEL_ALL);
        PendingIntent service = PendingIntent.getService(applicationContext, 1, intent, 201326592);
        EG6 eg6A08 = C3cI.A08(getApplicationContext(), "aura_command_execution");
        eg6A08.A07.flags |= 2;
        eg6A08.A0T = true;
        eg6A08.A09 = activity;
        eg6A08.A08(getString(R.string._name_removed__res_0x7f120b17));
        eg6A08.A07(getString(R.string._name_removed__res_0x7f120b14));
        eg6A08.A04(service, getString(R.string._name_removed__res_0x7f120b16), 0);
        return C60Q.A07(eg6A08);
    }

    private final void ensureNotificationChannel() {
        NotificationManager notificationManagerA07 = C60R.A07(getApplicationContext());
        if (notificationManagerA07.getNotificationChannel("aura_command_execution") == null) {
            C60Q.A15(notificationManagerA07, "Background Tasks", "aura_command_execution", 2);
        }
    }

    private final boolean promoteToForeground() {
        try {
            startForeground(NOTIFICATION_ID, buildNotification());
            AnonymousClass004.A1D(true, NodeForegroundServiceState._isForeground);
            return true;
        } catch (ForegroundServiceStartNotAllowedException unused) {
            CFK.A06(TAG, C3cF.A00(55));
            stopSelf();
            return false;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        promoteToForeground();
        clearStaleCommands();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        AnonymousClass004.A1D(false, NodeForegroundServiceState._isForeground);
        Hxb.A03(null, this.scope);
        this.activeJobs.clear();
    }
}
