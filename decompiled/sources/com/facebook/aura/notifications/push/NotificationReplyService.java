package com.facebook.aura.notifications.push;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C60Q;
import X.C7380Etd;
import X.C7384Etj;
import X.C7502EyJ;
import X.C78T;
import X.C7BY;
import X.CFK;
import X.EFz;
import X.EG6;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.R;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.NotificationCompat$MessagingStyle;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.notifications.push.api.ConversationNotificationContributors;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class NotificationReplyService extends Service {
    public static final Companion Companion = new Companion();
    public static final String EXTRA_NOTIFICATION_ID = "extra_notification_id";
    public static final String EXTRA_REPLY_TEXT = "extra_reply_text";
    public static final String EXTRA_THREAD_KEY = "extra_thread_key";
    public static final long RECONNECT_TIMEOUT_MS = 10000;
    public static final int SERVICE_NOTIFICATION_ID = 9003;
    public static final String TAG = "NotifReplyService";
    public final C3UX scope = C78T.A00();

    @DebugMetadata(c = "com.facebook.aura.notifications.push.NotificationReplyService$awaitCurrentSession$2", f = "NotificationReplyService.kt", l = {143}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.notifications.push.NotificationReplyService$awaitCurrentSession$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AbstractC3358CGz>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super AbstractC3358CGz> htJ) {
            return new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<AuraSessionManager.SessionState> c1bn = AuraSessionManager.state;
                NotificationReplyService$awaitCurrentSession$2$state$1 notificationReplyService$awaitCurrentSession$2$state$1 = new NotificationReplyService$awaitCurrentSession$2$state$1(null);
                this.label = 1;
                obj = AbstractC9777Gfy.A00(this, notificationReplyService$awaitCurrentSession$2$state$1, c1bn);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            AuraSessionManager.SessionState sessionState = (AuraSessionManager.SessionState) obj;
            if (sessionState instanceof AuraSessionManager.SessionState.Active) {
                return ((AuraSessionManager.SessionState.Active) sessionState).session;
            }
            if (sessionState instanceof AuraSessionManager.SessionState.Activating) {
                return ((AuraSessionManager.SessionState.Activating) sessionState).session;
            }
            if (C7384Etj.areEqual(sessionState, AuraSessionManager.SessionState.SignedOut.INSTANCE) || C7384Etj.areEqual(sessionState, AuraSessionManager.SessionState.Initializing.INSTANCE)) {
                return null;
            }
            throw C3cG.A0q();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.notifications.push.NotificationReplyService$onStartCommand$1", f = "NotificationReplyService.kt", l = {73, HatchIdeaShareImageRenderer.TEXT_LEFT, 81}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.notifications.push.NotificationReplyService$onStartCommand$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $notificationId;
        public final /* synthetic */ String $replyText;
        public final /* synthetic */ int $startId;
        public final /* synthetic */ String $threadKey;
        public Object L$0;
        public int label;

        /* JADX WARN: Removed duplicated region for block: B:24:0x004b A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #0 {all -> 0x0078, blocks: (B:7:0x0012, B:21:0x0044, B:22:0x0047, B:24:0x004b, B:27:0x005a, B:14:0x002b, B:15:0x002e, B:17:0x0034, B:18:0x0039, B:11:0x001e), top: B:35:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005a A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #0 {all -> 0x0078, blocks: (B:7:0x0012, B:21:0x0044, B:22:0x0047, B:24:0x004b, B:27:0x005a, B:14:0x002b, B:15:0x002e, B:17:0x0034, B:18:0x0039, B:11:0x001e), top: B:35:0x000a }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                r7 = r11
                X.Hji r2 = X.EnumC10460Hji.A02
                int r1 = r10.label
                java.lang.String r6 = "NotifReplyService"
                r4 = 3
                r5 = 2
                r0 = 1
                if (r1 == 0) goto L1b
                if (r1 == r0) goto L2b
                if (r1 == r5) goto L44
                if (r1 != r4) goto L16
                X.Hwg.A00(r11)     // Catch: java.lang.Throwable -> L78
                goto L6e
            L16:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L1b:
                X.Hwg.A00(r11)
                com.facebook.aura.startup.readiness.BackgroundReadyState r3 = com.facebook.aura.startup.readiness.BackgroundReadyState.INSTANCE     // Catch: java.lang.Throwable -> L78
                r10.label = r0     // Catch: java.lang.Throwable -> L78
                r0 = 30000(0x7530, double:1.4822E-319)
                java.lang.Object r7 = r3.awaitReadyOrTimeout(r0, r10)     // Catch: java.lang.Throwable -> L78
                if (r7 != r2) goto L2e
                return r2
            L2b:
                X.Hwg.A00(r11)     // Catch: java.lang.Throwable -> L78
            L2e:
                boolean r0 = X.AnonymousClass001.A1X(r7)     // Catch: java.lang.Throwable -> L78
                if (r0 != 0) goto L39
                java.lang.String r0 = "BackgroundReadyState not ready within timeout; proceeding best-effort"
                X.CFK.A06(r6, r0)     // Catch: java.lang.Throwable -> L78
            L39:
                com.facebook.aura.notifications.push.NotificationReplyService r0 = com.facebook.aura.notifications.push.NotificationReplyService.this     // Catch: java.lang.Throwable -> L78
                r10.label = r5     // Catch: java.lang.Throwable -> L78
                java.lang.Object r7 = com.facebook.aura.notifications.push.NotificationReplyService.access$awaitCurrentSession(r0, r10)     // Catch: java.lang.Throwable -> L78
                if (r7 != r2) goto L47
                return r2
            L44:
                X.Hwg.A00(r11)     // Catch: java.lang.Throwable -> L78
            L47:
                X.CGz r7 = (X.AbstractC3358CGz) r7     // Catch: java.lang.Throwable -> L78
                if (r7 != 0) goto L5a
                java.lang.String r0 = "No user session after background startup, stopping"
                X.CFK.A06(r6, r0)     // Catch: java.lang.Throwable -> L78
                kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L78
                com.facebook.aura.notifications.push.NotificationReplyService r1 = com.facebook.aura.notifications.push.NotificationReplyService.this
                int r0 = r10.$startId
                r1.stopSelf(r0)
                return r2
            L5a:
                com.facebook.aura.notifications.push.NotificationReplyService r5 = com.facebook.aura.notifications.push.NotificationReplyService.this     // Catch: java.lang.Throwable -> L78
                java.lang.String r6 = r10.$replyText     // Catch: java.lang.Throwable -> L78
                int r8 = r10.$notificationId     // Catch: java.lang.Throwable -> L78
                java.lang.String r9 = r10.$threadKey     // Catch: java.lang.Throwable -> L78
                r0 = 0
                r10.L$0 = r0     // Catch: java.lang.Throwable -> L78
                r10.label = r4     // Catch: java.lang.Throwable -> L78
                java.lang.Object r0 = com.facebook.aura.notifications.push.NotificationReplyService.access$sendReply(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L78
                if (r0 != r2) goto L6e
                return r2
            L6e:
                com.facebook.aura.notifications.push.NotificationReplyService r1 = com.facebook.aura.notifications.push.NotificationReplyService.this
                int r0 = r10.$startId
                r1.stopSelf(r0)
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
            L78:
                r2 = move-exception
                com.facebook.aura.notifications.push.NotificationReplyService r1 = com.facebook.aura.notifications.push.NotificationReplyService.this
                int r0 = r10.$startId
                r1.stopSelf(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.notifications.push.NotificationReplyService.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, int i, String str2, int i2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$replyText = str;
            this.$notificationId = i;
            this.$threadKey = str2;
            this.$startId = i2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NotificationReplyService.this.new AnonymousClass1(this.$replyText, this.$notificationId, this.$threadKey, this.$startId, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.notifications.push.NotificationReplyService", f = "NotificationReplyService.kt", l = {102}, m = "sendReply", v = 2)
    /* renamed from: com.facebook.aura.notifications.push.NotificationReplyService$sendReply$1, reason: invalid class name and case insensitive filesystem */
    public final class C127811 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C127811(HtJ<? super C127811> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationReplyService.this.sendReply(null, null, 0, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitCurrentSession(HtJ<? super AbstractC3358CGz> htJ) {
        return GAX.A01(htJ, new AnonymousClass2(null), 10000L);
    }

    public final class Companion {
        public final void enqueue(Context context, String str, int i, String str2) {
            AnonymousClass005.A0y(context, str, str2);
            Intent intent = new Intent(context, (Class<?>) NotificationReplyService.class);
            intent.putExtra(NotificationReplyService.EXTRA_REPLY_TEXT, str);
            intent.putExtra("extra_notification_id", i);
            intent.putExtra("extra_thread_key", str2);
            try {
                context.startForegroundService(intent);
            } catch (ForegroundServiceStartNotAllowedException unused) {
                CFK.A06(NotificationReplyService.TAG, "FGS start blocked for reply service");
            }
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final Notification buildServiceNotification() {
        AuraNotificationChannels.INSTANCE.ensureChannelsExist(AnonymousClass001.A0I(this));
        EG6 eg6 = new EG6(getApplicationContext(), "aura_command_execution");
        eg6.A03(R.drawable.ic_popup_sync);
        eg6.A08(getString(com.facebook.aura.R.string._name_removed__res_0x7f120b17));
        eg6.A07.flags |= 2;
        eg6.A0T = true;
        return C60Q.A07(eg6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b A[Catch: Exception -> 0x009c, TryCatch #0 {Exception -> 0x009c, blocks: (B:23:0x007f, B:25:0x008b, B:26:0x0091), top: B:32:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendReply(java.lang.String r16, X.AbstractC3358CGz r17, int r18, java.lang.String r19, X.HtJ<? super kotlin.Unit> r20) {
        /*
            r15 = this;
            r2 = r17
            r4 = r18
            r6 = r20
            r3 = r19
            r10 = r16
            boolean r0 = r6 instanceof com.facebook.aura.notifications.push.NotificationReplyService.C127811
            if (r0 == 0) goto Laa
            r8 = r6
            com.facebook.aura.notifications.push.NotificationReplyService$sendReply$1 r8 = (com.facebook.aura.notifications.push.NotificationReplyService.C127811) r8
            int r5 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r1
            if (r0 == 0) goto Laa
            int r5 = r5 - r1
            r8.label = r5
        L1c:
            java.lang.Object r6 = r8.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r12 = 0
            r1 = 1
            java.lang.String r5 = "NotifReplyService"
            if (r0 == 0) goto L53
            if (r0 != r1) goto Lb1
            int r4 = r8.I$0
            java.lang.Object r9 = r8.L$3
            com.facebook.aura.gateway.HatchGatewayConnection r9 = (com.facebook.aura.gateway.HatchGatewayConnection) r9
            java.lang.Object r3 = r8.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r8.L$1
            X.CGz r2 = (X.AbstractC3358CGz) r2
            java.lang.Object r0 = r8.L$0
            java.lang.String r10 = X.C3cG.A0d(r0, r6)
        L3e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L48
            boolean r0 = r6.booleanValue()
            if (r0 != 0) goto L7f
        L48:
            java.lang.String r0 = "Could not reconnect gateway within timeout"
            X.CFK.A06(r5, r0)
            r15.updateNotificationWithError(r4, r2, r3)
        L50:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L53:
            X.Hwg.A00(r6)
            com.facebook.aura.gateway.HatchGatewayConnection r9 = X.C60O.A05(r2)
            boolean r0 = r9.isConnected()
            if (r0 != 0) goto L7f
            java.lang.String r0 = "Gateway disconnected, attempting reconnection"
            X.CFK.A05(r5, r0)
            com.facebook.aura.notifications.push.NotificationReplyService$sendReply$connected$1 r6 = new com.facebook.aura.notifications.push.NotificationReplyService$sendReply$connected$1
            r6.<init>(r9, r12)
            r8.L$0 = r10
            r8.L$1 = r2
            r8.L$2 = r3
            r8.L$3 = r9
            r8.I$0 = r4
            r8.label = r1
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r6 = X.GAX.A01(r8, r6, r0)
            if (r6 != r7) goto L3e
            return r7
        L7f:
            java.lang.String r14 = X.AnonymousClass002.A0k()     // Catch: java.lang.Exception -> L9c
            java.lang.String r0 = "main"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Exception -> L9c
            if (r0 != 0) goto L91
            java.lang.String r0 = "session_id"
            java.util.Map r12 = X.AnonymousClass006.A10(r0, r3)     // Catch: java.lang.Exception -> L9c
        L91:
            r11 = 0
            r13 = r11
            r9.sendChatMessage(r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> L9c
            java.lang.String r0 = "Reply sent successfully"
            X.CFK.A05(r5, r0)     // Catch: java.lang.Exception -> L9c
            goto L50
        L9c:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "Failed to send reply: "
            X.C60O.A1P(r0, r1, r5)
            r15.updateNotificationWithError(r4, r2, r3)
            goto L50
        Laa:
            com.facebook.aura.notifications.push.NotificationReplyService$sendReply$1 r8 = new com.facebook.aura.notifications.push.NotificationReplyService$sendReply$1
            r8.<init>(r6)
            goto L1c
        Lb1:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.notifications.push.NotificationReplyService.sendReply(java.lang.String, X.CGz, int, java.lang.String, X.HtJ):java.lang.Object");
    }

    private final void updateNotificationWithError(int i, AbstractC3358CGz abstractC3358CGz, String str) {
        ConversationNotificationState companion = ConversationNotificationState.Companion.getInstance(abstractC3358CGz);
        NotificationCompat$MessagingStyle notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle(companion.getUserPerson(AnonymousClass001.A0I(this)));
        Iterator<EFz> it = companion.recentMessages(str).iterator();
        while (it.hasNext()) {
            notificationCompat$MessagingStyle.A06(it.next());
        }
        C7502EyJ c7502EyJReplyAction = NotificationReplyReceiver.Companion.replyAction(AnonymousClass001.A0I(this), i, str, false);
        EG6 eg6A08 = C3cI.A08(getApplicationContext(), AuraNotificationChannels.CONVERSATIONS);
        eg6A08.A06(notificationCompat$MessagingStyle);
        eg6A08.A0L = AuraConversationShortcut.SHORTCUT_ID;
        eg6A08.A0I = "msg";
        eg6A08.A0E = EG6.A00(getString(com.facebook.aura.R.string._name_removed__res_0x7f120b8d));
        eg6A08.A02();
        eg6A08.A04 = 1;
        ConversationNotificationContributors.INSTANCE.contribute(AnonymousClass001.A0I(this), abstractC3358CGz, eg6A08, c7502EyJReplyAction, i, str);
        C7380Etd c7380Etd = new C7380Etd(getApplicationContext());
        eg6A08.A0M.add(c7502EyJReplyAction.A00());
        c7380Etd.A01(null, i, eg6A08.A01());
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra;
        int intExtra;
        String stringExtra2;
        try {
            startForeground(SERVICE_NOTIFICATION_ID, buildServiceNotification());
            if (intent != null) {
                stringExtra = intent.getStringExtra(EXTRA_REPLY_TEXT);
                intExtra = intent.getIntExtra("extra_notification_id", 0);
                stringExtra2 = intent.getStringExtra("extra_thread_key");
                if (stringExtra2 == null) {
                }
                if (stringExtra != null || C7BY.A0j(stringExtra)) {
                    CFK.A06(TAG, "No reply text, stopping");
                    stopSelf();
                    return 2;
                }
                AnonymousClass001.A1J(new AnonymousClass1(stringExtra, intExtra, stringExtra2, i2, null), this.scope);
                return 2;
            }
            stringExtra = null;
            intExtra = 0;
            stringExtra2 = "main";
            if (stringExtra != null) {
            }
            CFK.A06(TAG, "No reply text, stopping");
            stopSelf();
            return 2;
        } catch (ForegroundServiceStartNotAllowedException unused) {
            CFK.A06(TAG, "FGS start blocked, stopping");
            stopSelf();
            return 2;
        }
    }
}
