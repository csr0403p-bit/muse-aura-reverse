package com.facebook.aura.commands.alarm;

import X.AnonymousClass004;
import X.C3cH;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import X.HtJ;
import X.HzP;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchAlarmScheduler {
    public static final HatchAlarmScheduler INSTANCE = new HatchAlarmScheduler();

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.HatchAlarmScheduler", f = "HatchAlarmScheduler.kt", l = {73}, m = "reregisterAll", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.HatchAlarmScheduler$reregisterAll$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAlarmScheduler.this.reregisterAll(null, this);
        }
    }

    private final PendingIntent broadcastIntent(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) AlarmFireReceiver.class);
        intent.setAction(AlarmFireReceiver.ACTION_ALARM_FIRE);
        intent.putExtra(AlarmFireReceiver.EXTRA_ALARM_ID, str);
        return PendingIntent.getBroadcast(context, str.hashCode(), intent, z ? 201326592 : 603979776);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reregisterAll(android.content.Context r6, X.HtJ<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.commands.alarm.HatchAlarmScheduler.AnonymousClass1
            if (r0 == 0) goto L54
            r4 = r7
            com.facebook.aura.commands.alarm.HatchAlarmScheduler$reregisterAll$1 r4 = (com.facebook.aura.commands.alarm.HatchAlarmScheduler.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L3d
            if (r0 != r2) goto L5d
            java.lang.Object r0 = r4.L$0
            android.content.Context r6 = X.C60P.A02(r0, r1)
        L23:
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r2 = r1.iterator()
        L29:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r1 = r2.next()
            com.facebook.aura.commands.alarm.ShadowAlarm r1 = (com.facebook.aura.commands.alarm.ShadowAlarm) r1
            boolean r0 = r1.inApp
            if (r0 == 0) goto L29
            r5.schedule$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(r6, r1)
            goto L29
        L3d:
            X.Hwg.A00(r1)
            com.facebook.aura.commands.alarm.AuraAlarmShadowStore$Companion r0 = com.facebook.aura.commands.alarm.AuraAlarmShadowStore.Companion
            com.facebook.aura.commands.alarm.AuraAlarmShadowStore r1 = r0.getInstance(r6)
            r4.L$0 = r6
            r0 = 0
            r4.L$1 = r0
            r4.label = r2
            java.lang.Object r1 = r1.snapshot(r4)
            if (r1 != r3) goto L23
            return r3
        L54:
            com.facebook.aura.commands.alarm.HatchAlarmScheduler$reregisterAll$1 r4 = new com.facebook.aura.commands.alarm.HatchAlarmScheduler$reregisterAll$1
            r4.<init>(r7)
            goto L12
        L5a:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L5d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.HatchAlarmScheduler.reregisterAll(android.content.Context, X.HtJ):java.lang.Object");
    }

    public final boolean schedule$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(Context context, ShadowAlarm shadowAlarm) {
        C7384Etj.A0Y(context, 0);
        C7384Etj.A0Y(shadowAlarm, 1);
        Object systemService = context.getSystemService("alarm");
        AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
        boolean z = false;
        if (alarmManager == null) {
            C60O.A1P("AlarmManager unavailable; cannot schedule alarm ", shadowAlarm.id, HatchAlarmSchedulerKt.TAG);
        } else {
            PendingIntent pendingIntentBroadcastIntent = broadcastIntent(context, shadowAlarm.id, true);
            if (pendingIntentBroadcastIntent != null) {
                Intent intentA08 = C60R.A08(context);
                try {
                    alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(shadowAlarm.triggerTimeMs, intentA08 != null ? PendingIntent.getActivity(context, shadowAlarm.id.hashCode(), intentA08, 201326592) : null), pendingIntentBroadcastIntent);
                    CFK.A05(HatchAlarmSchedulerKt.TAG, FGI.A0a("Scheduled exact alarm ", shadowAlarm.id, " at ", shadowAlarm.triggerTimeMs));
                    return true;
                } catch (SecurityException e) {
                    CFK.A0A(HatchAlarmSchedulerKt.TAG, FGI.A0U("setAlarmClock rejected for alarm ", shadowAlarm.id, "; falling back to inexact set()"), e);
                    try {
                        alarmManager.set(0, shadowAlarm.triggerTimeMs, pendingIntentBroadcastIntent);
                        CFK.A05(HatchAlarmSchedulerKt.TAG, FGI.A0a("Scheduled inexact alarm ", shadowAlarm.id, " at ", shadowAlarm.triggerTimeMs));
                        z = true;
                        return true;
                    } catch (RuntimeException e2) {
                        C3cH.A1B("Failed to schedule alarm ", shadowAlarm.id, HatchAlarmSchedulerKt.TAG, e2);
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
