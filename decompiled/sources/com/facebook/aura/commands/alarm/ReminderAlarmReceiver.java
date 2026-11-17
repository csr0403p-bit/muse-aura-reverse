package com.facebook.aura.commands.alarm;

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
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ReminderAlarmReceiver extends BroadcastReceiver {
    public static final String ACTION_REMINDER_FIRE = "com.facebook.aura.REMINDER_FIRE";
    public static final String ACTION_REMINDER_SNOOZE = "com.facebook.aura.REMINDER_SNOOZE";
    public static final Companion Companion = new Companion();
    public static final String EXTRA_REMINDER_ID = "reminder_id";
    public static final String EXTRA_REMINDER_LABEL = "reminder_label";
    public static final String TAG = "ReminderAlarmReceiver";

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.ReminderAlarmReceiver$onReceive$1", f = "ReminderAlarmReceiver.kt", l = {48, 59, 64, AuraWaitlistConfettiKt.StandardParticleCount, SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.ReminderAlarmReceiver$onReceive$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $action;
        public final /* synthetic */ Context $appContext;
        public final /* synthetic */ Intent $intent;
        public final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        public final /* synthetic */ String $reminderId;
        public int I$0;
        public int I$1;
        public long J$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, String str, String str2, BroadcastReceiver.PendingResult pendingResult, Intent intent, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$appContext = context;
            this.$action = str;
            this.$reminderId = str2;
            this.$pendingResult = pendingResult;
            this.$intent = intent;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$appContext, this.$action, this.$reminderId, this.$pendingResult, this.$intent, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0088 A[Catch: Exception -> 0x01ec, all -> 0x0202, TryCatch #1 {Exception -> 0x01ec, blocks: (B:9:0x0021, B:62:0x01c2, B:63:0x01c5, B:39:0x0122, B:40:0x0125, B:42:0x0129, B:45:0x0138, B:47:0x014a, B:50:0x0153, B:52:0x0157, B:65:0x01d2, B:57:0x0163, B:59:0x0183, B:48:0x014d, B:34:0x0102, B:35:0x0105, B:22:0x0081, B:23:0x0084, B:25:0x0088, B:31:0x00f1, B:27:0x00b0, B:30:0x00cc, B:17:0x0047, B:19:0x005c, B:36:0x0112), top: B:75:0x0015, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b0 A[Catch: Exception -> 0x01ec, all -> 0x0202, TryCatch #1 {Exception -> 0x01ec, blocks: (B:9:0x0021, B:62:0x01c2, B:63:0x01c5, B:39:0x0122, B:40:0x0125, B:42:0x0129, B:45:0x0138, B:47:0x014a, B:50:0x0153, B:52:0x0157, B:65:0x01d2, B:57:0x0163, B:59:0x0183, B:48:0x014d, B:34:0x0102, B:35:0x0105, B:22:0x0081, B:23:0x0084, B:25:0x0088, B:31:0x00f1, B:27:0x00b0, B:30:0x00cc, B:17:0x0047, B:19:0x005c, B:36:0x0112), top: B:75:0x0015, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0129 A[Catch: Exception -> 0x01ec, all -> 0x0202, TRY_LEAVE, TryCatch #1 {Exception -> 0x01ec, blocks: (B:9:0x0021, B:62:0x01c2, B:63:0x01c5, B:39:0x0122, B:40:0x0125, B:42:0x0129, B:45:0x0138, B:47:0x014a, B:50:0x0153, B:52:0x0157, B:65:0x01d2, B:57:0x0163, B:59:0x0183, B:48:0x014d, B:34:0x0102, B:35:0x0105, B:22:0x0081, B:23:0x0084, B:25:0x0088, B:31:0x00f1, B:27:0x00b0, B:30:0x00cc, B:17:0x0047, B:19:0x005c, B:36:0x0112), top: B:75:0x0015, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0138 A[Catch: Exception -> 0x01ec, all -> 0x0202, TRY_ENTER, TryCatch #1 {Exception -> 0x01ec, blocks: (B:9:0x0021, B:62:0x01c2, B:63:0x01c5, B:39:0x0122, B:40:0x0125, B:42:0x0129, B:45:0x0138, B:47:0x014a, B:50:0x0153, B:52:0x0157, B:65:0x01d2, B:57:0x0163, B:59:0x0183, B:48:0x014d, B:34:0x0102, B:35:0x0105, B:22:0x0081, B:23:0x0084, B:25:0x0088, B:31:0x00f1, B:27:0x00b0, B:30:0x00cc, B:17:0x0047, B:19:0x005c, B:36:0x0112), top: B:75:0x0015, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01eb A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r33) {
            /*
                Method dump skipped, instructions count: 521
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.ReminderAlarmReceiver.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
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
        if (ACTION_REMINDER_FIRE.equals(action) || ACTION_REMINDER_SNOOZE.equals(action)) {
            String stringExtra = intent.getStringExtra(EXTRA_REMINDER_ID);
            if (stringExtra == null || stringExtra.length() == 0) {
                CFK.A06(TAG, FGI.A0U("Reminder ", action, " with no id"));
                return;
            }
            Context applicationContext = context.getApplicationContext();
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            AnonymousClass001.A1J(new AnonymousClass1(applicationContext, action, stringExtra, pendingResultGoAsync, intent, null), C78T.A01(AnonymousClass001.A0y(), null));
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
