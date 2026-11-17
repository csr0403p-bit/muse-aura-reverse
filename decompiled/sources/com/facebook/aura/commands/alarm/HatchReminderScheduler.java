package com.facebook.aura.commands.alarm;

import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C3cH;
import X.C60O;
import X.C60R;
import X.CFK;
import X.FGI;
import X.HtJ;
import X.HzP;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchReminderScheduler {
    public static final HatchReminderScheduler INSTANCE = new HatchReminderScheduler();

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.HatchReminderScheduler", f = "HatchReminderScheduler.kt", l = {AuraWaitlistConfettiKt.StandardParticleCount, 96, 97}, m = "reregisterAll", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.HatchReminderScheduler$reregisterAll$1, reason: invalid class name */
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
            return HatchReminderScheduler.this.reregisterAll(null, this);
        }
    }

    private final PendingIntent broadcastIntent(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) ReminderAlarmReceiver.class);
        intent.setAction(ReminderAlarmReceiver.ACTION_REMINDER_FIRE);
        intent.putExtra(ReminderAlarmReceiver.EXTRA_REMINDER_ID, str);
        return PendingIntent.getBroadcast(context, str.hashCode(), intent, z ? 201326592 : 603979776);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0056 -> B:13:0x003b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005a -> B:13:0x003b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00bf -> B:13:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reregisterAll(android.content.Context r29, X.HtJ<? super kotlin.Unit> r30) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.HatchReminderScheduler.reregisterAll(android.content.Context, X.HtJ):java.lang.Object");
    }

    public final boolean schedule$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(Context context, ShadowReminder shadowReminder) {
        boolean zA1a = AnonymousClass002.A1a(context, shadowReminder);
        Object systemService = context.getSystemService("alarm");
        AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
        boolean z = false;
        if (alarmManager == null) {
            C60O.A1P("AlarmManager unavailable; cannot schedule reminder ", shadowReminder.id, HatchReminderSchedulerKt.TAG);
        } else {
            PendingIntent pendingIntentBroadcastIntent = broadcastIntent(context, shadowReminder.id, zA1a);
            if (pendingIntentBroadcastIntent != null) {
                Intent intentA08 = C60R.A08(context);
                try {
                    alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(shadowReminder.triggerTimeMs, intentA08 != null ? PendingIntent.getActivity(context, shadowReminder.id.hashCode(), intentA08, 201326592) : null), pendingIntentBroadcastIntent);
                    CFK.A05(HatchReminderSchedulerKt.TAG, FGI.A0a("Scheduled exact reminder ", shadowReminder.id, " at ", shadowReminder.triggerTimeMs));
                    return zA1a;
                } catch (SecurityException e) {
                    CFK.A0A(HatchReminderSchedulerKt.TAG, FGI.A0U("setAlarmClock rejected for reminder ", shadowReminder.id, "; falling back to inexact set()"), e);
                    try {
                        alarmManager.set(0, shadowReminder.triggerTimeMs, pendingIntentBroadcastIntent);
                        CFK.A05(HatchReminderSchedulerKt.TAG, FGI.A0a("Scheduled inexact reminder ", shadowReminder.id, " at ", shadowReminder.triggerTimeMs));
                        z = true;
                        return true;
                    } catch (RuntimeException e2) {
                        C3cH.A1B("Failed to schedule reminder ", shadowReminder.id, HatchReminderSchedulerKt.TAG, e2);
                        return z;
                    }
                }
            }
        }
        return false;
    }

    public final void cancel(Context context, String str) {
        AlarmManager alarmManager;
        PendingIntent pendingIntentBroadcastIntent;
        boolean zA1b = AnonymousClass004.A1b(context, str);
        Object systemService = context.getSystemService("alarm");
        if (!(systemService instanceof AlarmManager) || (alarmManager = (AlarmManager) systemService) == null || (pendingIntentBroadcastIntent = broadcastIntent(context, str, zA1b)) == null) {
            return;
        }
        alarmManager.cancel(pendingIntentBroadcastIntent);
        pendingIntentBroadcastIntent.cancel();
    }
}
