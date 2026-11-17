package com.facebook.aura.commands.alarm;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C0881AGi;
import X.C2nw;
import X.C3UX;
import X.C3cF;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C7438Evz;
import X.C7BY;
import X.C7pd;
import X.C7qW;
import X.C9hr;
import X.C9oY;
import X.C9tI;
import X.CFK;
import X.F0C;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import com.facebook.aura.components.reactions.AuraHeartEyesKt;
import com.facebook.aura.components.reactions.AuraVictoryGleamKt;
import com.facebook.aura.feed.repo.FeedRepositoryKt;
import com.facebook.aura.model.ReplyAttributionSerializer;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class AlarmHandlersKt {
    public static final String CLOCK_HANDOFF_IN_BACKGROUND_MESSAGE = "No alarm was set: the app is in the background, and Android only lets it open the Clock app while it's on screen. Ask the user to open the app on this device and ask again.";
    public static final long CLOCK_INTENT_HANDOFF_DELAY_MS = 1000;
    public static final String CLOCK_ONLY_ALARMS_MESSAGE = "This device can only set alarms in its Clock app: a time, optionally repeating on chosen weekdays (all seven for every day). It can't set a date, an interval such as every three days, or an end to the repeat.";
    public static final long CLOCK_RETURN_TIMEOUT_MS = 3000;
    public static final int MAX_ALARMS = 100;
    public static final String PARAM_ALARMS = "alarms";
    public static final String PARAM_ALARMS_JSON = "alarms_json";
    public static final String PARAM_TARGETS = "targets";
    public static final String PARAM_TARGETS_JSON = "targets_json";
    public static final String PARAM_UPDATES = "updates";
    public static final String PARAM_UPDATES_JSON = "updates_json";
    public static final String TAG = "AlarmHandlers";

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AlarmHandlersKt", f = "AlarmHandlers.kt", l = {415, 419}, m = "awaitClockHandoff", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AlarmHandlersKt$awaitClockHandoff$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AlarmHandlersKt.awaitClockHandoff(null, null, 0L, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* renamed from: com.facebook.aura.commands.alarm.AlarmHandlersKt$clockHandoffInterruptedMessage$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C110631 extends C7438Evz implements G0U<AlarmSetRequest, String> {
        public static final C110631 INSTANCE = new C110631();

        public C110631() {
            super(1, AlarmHandlersKt.class, "describeAlarm", "describeAlarm(Lcom/facebook/aura/commands/alarm/AlarmSetRequest;)Ljava/lang/String;", 1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ String invoke(AlarmSetRequest alarmSetRequest) {
            AlarmSetRequest alarmSetRequest2 = alarmSetRequest;
            C7384Etj.A0Y(alarmSetRequest2, 0);
            return AlarmHandlersKt.describeAlarm(alarmSetRequest2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String invoke2(AlarmSetRequest alarmSetRequest) {
            C7384Etj.A0Y(alarmSetRequest, 0);
            return AlarmHandlersKt.describeAlarm(alarmSetRequest);
        }
    }

    /* renamed from: com.facebook.aura.commands.alarm.AlarmHandlersKt$clockHandoffInterruptedMessage$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends C7438Evz implements G0U<AlarmSetRequest, String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1, AlarmHandlersKt.class, "describeAlarm", "describeAlarm(Lcom/facebook/aura/commands/alarm/AlarmSetRequest;)Ljava/lang/String;", 1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ String invoke(AlarmSetRequest alarmSetRequest) {
            AlarmSetRequest alarmSetRequest2 = alarmSetRequest;
            C7384Etj.A0Y(alarmSetRequest2, 0);
            return AlarmHandlersKt.describeAlarm(alarmSetRequest2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String invoke2(AlarmSetRequest alarmSetRequest) {
            C7384Etj.A0Y(alarmSetRequest, 0);
            return AlarmHandlersKt.describeAlarm(alarmSetRequest);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AlarmHandlersKt", f = "AlarmHandlers.kt", l = {587, 588}, m = "computeAlarmDismiss", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AlarmHandlersKt$computeAlarmDismiss$1, reason: invalid class name and case insensitive filesystem */
    public final class C110641 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AlarmHandlersKt.computeAlarmDismiss(null, null, this);
        }

        public C110641(HtJ<? super C110641> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AlarmHandlersKt", f = "AlarmHandlers.kt", l = {AuraHeartEyesKt.HEART_EYES_TOTAL_MS, 693}, m = "computeAlarmDismissAll", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AlarmHandlersKt$computeAlarmDismissAll$1, reason: invalid class name and case insensitive filesystem */
    public final class C110651 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AlarmHandlersKt.computeAlarmDismissAll(null, this);
        }

        public C110651(HtJ<? super C110651> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AlarmHandlersKt", f = "AlarmHandlers.kt", l = {660}, m = "computeAlarmList", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AlarmHandlersKt$computeAlarmList$1, reason: invalid class name and case insensitive filesystem */
    public final class C110661 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AlarmHandlersKt.computeAlarmList(null, this);
        }

        public C110661(HtJ<? super C110661> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AlarmHandlersKt", f = "AlarmHandlers.kt", l = {244, 271}, m = "computeAlarmSet", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AlarmHandlersKt$computeAlarmSet$1, reason: invalid class name and case insensitive filesystem */
    public final class C110671 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AlarmHandlersKt.computeAlarmSet(null, null, 0L, this);
        }

        public C110671(HtJ<? super C110671> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AlarmHandlersKt", f = "AlarmHandlers.kt", l = {749, AuraVictoryGleamKt.VICTORY_TOTAL_MS}, m = "computeAlarmUpdate", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AlarmHandlersKt$computeAlarmUpdate$1, reason: invalid class name and case insensitive filesystem */
    public final class C110681 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AlarmHandlersKt.computeAlarmUpdate(null, null, this);
        }

        public C110681(HtJ<? super C110681> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AlarmHandlersKt$deviceHasClockApp$2", f = "AlarmHandlers.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AlarmHandlersKt$deviceHasClockApp$2, reason: invalid class name and case insensitive filesystem */
    public final class C110692 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ Context $context;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110692(Context context, HtJ<? super C110692> htJ) {
            super(2, htJ);
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C110692(this.$context, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return new C110692(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(AnonymousClass002.A1X(this.$context.getPackageManager().resolveActivity(C60P.A03("android.intent.action.SET_ALARM"), 65536)));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.AlarmHandlersKt", f = "AlarmHandlers.kt", l = {298, 329}, m = "setAlarmsInOrder", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.AlarmHandlersKt$setAlarmsInOrder$1, reason: invalid class name and case insensitive filesystem */
    public final class C110701 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AlarmHandlersKt.setAlarmsInOrder(null, null, null, null, 0L, null, this);
        }

        public C110701(HtJ<? super C110701> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    public static final Recurrence mergeRecurrenceBounds(String str, Recurrence recurrence, JsonObject jsonObject) {
        Integer numA02;
        String strA0l;
        JsonPrimitive jsonPrimitive;
        String strA04;
        JsonPrimitive jsonPrimitive2;
        Integer numA022;
        ?? A1Z = AnonymousClass005.A1Z(str, recurrence, jsonObject);
        Object obj = jsonObject.get("interval");
        Long untilMs = null;
        int iIntValue = (!(obj instanceof JsonPrimitive) || (jsonPrimitive2 = (JsonPrimitive) obj) == null || (numA022 = C9oY.A02(jsonPrimitive2)) == null) ? recurrence.interval : numA022.intValue();
        if (iIntValue < A1Z) {
            throw C60Q.A0U(str, ".interval must be a positive integer");
        }
        if (jsonObject.containsKey(AuraMetaFRLSecureTokenStore.JSON_KEY_COUNT)) {
            Object obj2 = jsonObject.get(AuraMetaFRLSecureTokenStore.JSON_KEY_COUNT);
            JsonPrimitive jsonPrimitive3 = obj2 instanceof JsonPrimitive ? (JsonPrimitive) obj2 : null;
            if (jsonPrimitive3 == null || (numA02 = C9oY.A02(jsonPrimitive3)) == null) {
                throw C60Q.A0U(str, ".count must be a positive integer");
            }
            if (numA02.intValue() < A1Z) {
                throw C60Q.A0U(str, ".count must be a positive integer");
            }
        } else {
            numA02 = recurrence.count;
        }
        if (jsonObject.containsKey("until")) {
            Object obj3 = jsonObject.get("until");
            if (!(obj3 instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj3) == null || (strA04 = C9oY.A04(jsonPrimitive)) == null || (strA0l = AnonymousClass002.A0l(strA04)) == null) {
                strA0l = "";
            }
            if (strA0l.length() != 0 && (untilMs = AlarmTimeUtil.INSTANCE.parseUntilMs(strA0l, C60Q.A0r())) == null) {
                throw C60Q.A0U(str, ".until must be an ISO-8601 date (e.g. '2026-12-31') or date-time");
            }
        } else {
            untilMs = recurrence.until;
        }
        F0C<C9hr<Object>>[] f0cArr = Recurrence.$childSerializers;
        return recurrence.copy(recurrence.frequency, iIntValue, recurrence.byWeekdays, numA02, untilMs);
    }

    public static final List<Integer> parseDays(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.length() == 0) {
            return C0881AGi.A00;
        }
        List listA0e = C7BY.A0e(str, ",");
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA0e.iterator();
        while (it.hasNext()) {
            Integer numA0r = C9tI.A0r(C7BY.A0b(it));
            if (numA0r != null) {
                arrayListA0h.add(numA0r);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (Object obj : arrayListA0h) {
            int iA0F = AnonymousClass001.A0F(obj);
            if (1 <= iA0F && iA0F < 8) {
                arrayListA0h2.add(obj);
            }
        }
        return arrayListA0h2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitClockHandoff(android.content.Context r10, com.facebook.aura.commands.alarm.MuseActivityTracker r11, long r12, X.HtJ<? super com.facebook.aura.commands.alarm.ClockHandoffStop> r14) {
        /*
            boolean r0 = r14 instanceof com.facebook.aura.commands.alarm.AlarmHandlersKt.AnonymousClass1
            if (r0 == 0) goto L86
            r6 = r14
            com.facebook.aura.commands.alarm.AlarmHandlersKt$awaitClockHandoff$1 r6 = (com.facebook.aura.commands.alarm.AlarmHandlersKt.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r2 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r5 = 2
            r0 = 1
            if (r1 == 0) goto L42
            if (r1 == r0) goto L56
            if (r1 != r5) goto L8d
            long r12 = r6.J$0
            java.lang.Object r0 = r6.L$0
            android.content.Context r10 = X.C60P.A02(r0, r2)
        L28:
            boolean r0 = X.AnonymousClass001.A1X(r2)
            r3 = 0
            if (r0 != 0) goto L8c
            long r1 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 >= 0) goto L92
            com.facebook.aura.assist.status.HatchDefaultAssistantStatus r0 = com.facebook.aura.assist.status.HatchDefaultAssistantStatus.INSTANCE
            boolean r0 = r0.isDefaultAssistant(r10)
            if (r0 != 0) goto L8c
            com.facebook.aura.commands.alarm.ClockHandoffStop r0 = com.facebook.aura.commands.alarm.ClockHandoffStop.LEFT_SCREEN
            return r0
        L42:
            X.Hwg.A00(r2)
            r6.L$0 = r10
            r6.L$1 = r11
            r6.J$0 = r12
            r6.label = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.C7Bq.A01(r0, r6)
            if (r0 != r7) goto L62
            return r7
        L56:
            long r12 = r6.J$0
            java.lang.Object r11 = r6.L$1
            com.facebook.aura.commands.alarm.MuseActivityTracker r11 = (com.facebook.aura.commands.alarm.MuseActivityTracker) r11
            java.lang.Object r0 = r6.L$0
            android.content.Context r10 = X.C60P.A02(r0, r2)
        L62:
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r12 - r0
            r8 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L92
            r0 = 3000(0xbb8, double:1.482E-320)
            long r0 = java.lang.Math.min(r0, r2)
            r6.L$0 = r10
            r4 = 0
            r6.L$1 = r4
            r6.J$0 = r12
            r6.J$1 = r2
            r6.label = r5
            java.lang.Object r2 = r11.awaitReturn(r0, r6)
            if (r2 != r7) goto L28
            return r7
        L86:
            com.facebook.aura.commands.alarm.AlarmHandlersKt$awaitClockHandoff$1 r6 = new com.facebook.aura.commands.alarm.AlarmHandlersKt$awaitClockHandoff$1
            r6.<init>(r14)
            goto L12
        L8c:
            return r3
        L8d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L92:
            com.facebook.aura.commands.alarm.ClockHandoffStop r0 = com.facebook.aura.commands.alarm.ClockHandoffStop.OUT_OF_TIME
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AlarmHandlersKt.awaitClockHandoff(android.content.Context, com.facebook.aura.commands.alarm.MuseActivityTracker, long, X.HtJ):java.lang.Object");
    }

    public static final boolean canHandOffToClock(Recurrence recurrence, boolean z) {
        if (z) {
            return false;
        }
        return recurrence == null || (recurrence.frequency == RecurrenceFrequency.WEEKLY && recurrence.interval == 1 && recurrence.count == null && recurrence.until == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e1, code lost:
    
        if (r2.length() > 0) goto L41;
     */
    /* JADX WARN: Path cross not found for [B:15:0x004b, B:31:0x00c5], limit reached: 84 */
    /* JADX WARN: Path cross not found for [B:31:0x00c5, B:15:0x004b], limit reached: 84 */
    /* JADX WARN: Path cross not found for [B:31:0x00c5, B:39:0x00dd], limit reached: 84 */
    /* JADX WARN: Path cross not found for [B:31:0x00c5, B:41:0x00e3], limit reached: 84 */
    /* JADX WARN: Path cross not found for [B:41:0x00e3, B:31:0x00c5], limit reached: 84 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3 A[PHI: r1 r2 r3 r4 r7 r8 r9 r15
  0x00e3: PHI (r1v6 com.facebook.aura.commands.alarm.ShadowAlarm) = (r1v4 com.facebook.aura.commands.alarm.ShadowAlarm), (r1v17 com.facebook.aura.commands.alarm.ShadowAlarm) binds: [B:32:0x00c7, B:40:0x00e1] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v8 java.lang.String) binds: [B:32:0x00c7, B:40:0x00e1] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r3v4 android.content.Context) = (r3v3 android.content.Context), (r3v6 android.content.Context) binds: [B:32:0x00c7, B:40:0x00e1] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r4v3 java.util.Iterator) = (r4v2 java.util.Iterator), (r4v5 java.util.Iterator) binds: [B:32:0x00c7, B:40:0x00e1] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r7v2 com.facebook.aura.commands.alarm.AuraAlarmShadowStore) = 
  (r7v1 com.facebook.aura.commands.alarm.AuraAlarmShadowStore)
  (r7v4 com.facebook.aura.commands.alarm.AuraAlarmShadowStore)
 binds: [B:32:0x00c7, B:40:0x00e1] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r8v2 java.util.List) = (r8v1 java.util.List), (r8v4 java.util.List) binds: [B:32:0x00c7, B:40:0x00e1] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r9v2 X.F1E) = (r9v1 X.F1E), (r9v4 X.F1E) binds: [B:32:0x00c7, B:40:0x00e1] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r15v3 com.facebook.aura.nodes.registry.HatchNodeCommandContext) = 
  (r15v1 com.facebook.aura.nodes.registry.HatchNodeCommandContext)
  (r15v7 com.facebook.aura.nodes.registry.HatchNodeCommandContext)
 binds: [B:32:0x00c7, B:40:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0171  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0099 -> B:13:0x0047). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c1 -> B:12:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object computeAlarmDismiss(com.facebook.aura.nodes.registry.HatchNodeCommandContext r15, java.lang.String r16, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r17) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AlarmHandlersKt.computeAlarmDismiss(com.facebook.aura.nodes.registry.HatchNodeCommandContext, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object computeAlarmDismissAll(com.facebook.aura.nodes.registry.HatchNodeCommandContext r13, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r14) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AlarmHandlersKt.computeAlarmDismissAll(com.facebook.aura.nodes.registry.HatchNodeCommandContext, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object computeAlarmList(com.facebook.aura.nodes.registry.HatchNodeCommandContext r6, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r7) {
        /*
            boolean r0 = r7 instanceof com.facebook.aura.commands.alarm.AlarmHandlersKt.C110661
            if (r0 == 0) goto L64
            r5 = r7
            com.facebook.aura.commands.alarm.AlarmHandlersKt$computeAlarmList$1 r5 = (com.facebook.aura.commands.alarm.AlarmHandlersKt.C110661) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L4b
            if (r0 != r3) goto L75
            X.Hwg.A00(r1)
        L20:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            com.facebook.aura.commands.alarm.AlarmHandlersKt$computeAlarmList$$inlined$sortedBy$1 r0 = new com.facebook.aura.commands.alarm.AlarmHandlersKt$computeAlarmList$$inlined$sortedBy$1
            r0.<init>()
            java.util.List r0 = X.AbstractC0878AGe.A0c(r1, r0)
            X.2nw r3 = X.C60O.A1K()
            X.7pd r2 = X.C7pd.A01()
            java.util.Iterator r1 = r0.iterator()
        L37:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r1.next()
            com.facebook.aura.commands.alarm.ShadowAlarm r0 = (com.facebook.aura.commands.alarm.ShadowAlarm) r0
            kotlinx.serialization.json.JsonObject r0 = toListEntryJson(r0)
            r2.A06(r0)
            goto L37
        L4b:
            X.Hwg.A00(r1)
            android.content.Context r2 = r6.context
            com.facebook.aura.commands.alarm.AuraAlarmShadowStore$Companion r0 = com.facebook.aura.commands.alarm.AuraAlarmShadowStore.Companion
            com.facebook.aura.commands.alarm.AuraAlarmShadowStore r1 = r0.getInstance(r2)
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r2
            r5.label = r3
            java.lang.Object r1 = r1.snapshot(r5)
            if (r1 != r4) goto L20
            return r4
        L64:
            com.facebook.aura.commands.alarm.AlarmHandlersKt$computeAlarmList$1 r5 = new com.facebook.aura.commands.alarm.AlarmHandlersKt$computeAlarmList$1
            r5.<init>(r7)
            goto L12
        L6a:
            kotlinx.serialization.json.JsonArray r1 = X.C7pd.A00(r2)
            java.lang.String r0 = "alarms"
            com.facebook.aura.nodes.core.NodeCommandResponse r4 = X.C60R.A0Q(r0, r1, r3)
            return r4
        L75:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AlarmHandlersKt.computeAlarmList(com.facebook.aura.nodes.registry.HatchNodeCommandContext, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Application] */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.app.Application] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object computeAlarmSet(com.facebook.aura.nodes.registry.HatchNodeCommandContext r14, java.lang.String r15, long r16, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r18) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AlarmHandlersKt.computeAlarmSet(com.facebook.aura.nodes.registry.HatchNodeCommandContext, java.lang.String, long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[LOOP:0: B:13:0x003d->B:15:0x0043, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0137 -> B:29:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object computeAlarmUpdate(com.facebook.aura.nodes.registry.HatchNodeCommandContext r18, java.lang.String r19, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r20) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AlarmHandlersKt.computeAlarmUpdate(com.facebook.aura.nodes.registry.HatchNodeCommandContext, java.lang.String, X.HtJ):java.lang.Object");
    }

    public static final String describeAlarm(AlarmSetRequest alarmSetRequest) {
        String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(alarmSetRequest.hour), Integer.valueOf(alarmSetRequest.minute)}, 2));
        String str2 = alarmSetRequest.label;
        return FGI.A0M(str, str2.length() == 0 ? "" : FGI.A0U(" \"", str2, "\""));
    }

    public static final AlarmDismissTarget parseAlarmDismissTarget(int i, JsonObject jsonObject) {
        JsonPrimitive jsonPrimitive;
        String strA0k = C60Q.A0k("targets_json[", i);
        Object obj = jsonObject.get(AlarmFireReceiver.EXTRA_ALARM_ID);
        String strA04 = null;
        if ((obj instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj) != null) {
            strA04 = C9oY.A04(jsonPrimitive);
        }
        if (strA04 == null) {
            strA04 = "";
        }
        String strA0g = C60R.A0g(ReplyAttributionSerializer.TYPE_MESSAGE, jsonObject);
        if (strA04.length() == 0 && strA0g.length() == 0) {
            throw C60Q.A0U(strA0k, " must include either 'alarm_id' or 'message'.");
        }
        return new AlarmDismissTarget(strA04, strA0g);
    }

    public static final AlarmSetRequest parseAlarmSetRequest(int i, JsonObject jsonObject) {
        String strA04;
        String strA042;
        ZoneId zoneIdSystemDefault;
        JsonPrimitive jsonPrimitive;
        String strA043;
        Boolean boolA01;
        JsonPrimitive jsonPrimitive2;
        JsonPrimitive jsonPrimitive3;
        JsonPrimitive jsonPrimitive4;
        JsonPrimitive jsonPrimitive5;
        Integer numA02;
        JsonPrimitive jsonPrimitive6;
        Integer numA022;
        String strA0k = C60Q.A0k("alarms_json[", i);
        Object obj = jsonObject.get("hour");
        int iIntValue = (!(obj instanceof JsonPrimitive) || (jsonPrimitive6 = (JsonPrimitive) obj) == null || (numA022 = C9oY.A02(jsonPrimitive6)) == null) ? -1 : numA022.intValue();
        Object obj2 = jsonObject.get("minutes");
        int iIntValue2 = (!(obj2 instanceof JsonPrimitive) || (jsonPrimitive5 = (JsonPrimitive) obj2) == null || (numA02 = C9oY.A02(jsonPrimitive5)) == null) ? -1 : numA02.intValue();
        if (iIntValue < 0 || iIntValue >= 24) {
            throw C60Q.A0U(strA0k, ".hour is missing or invalid; it must be an integer from 0 to 23");
        }
        if (iIntValue2 < 0 || iIntValue2 >= 60) {
            throw C60Q.A0U(strA0k, ".minutes is missing or invalid; it must be an integer from 0 to 59");
        }
        Object obj3 = jsonObject.get(ReplyAttributionSerializer.TYPE_MESSAGE);
        String strA044 = (!(obj3 instanceof JsonPrimitive) || (jsonPrimitive4 = (JsonPrimitive) obj3) == null) ? null : C9oY.A04(jsonPrimitive4);
        if (strA044 == null) {
            strA044 = "";
        }
        Object obj4 = jsonObject.get("days");
        if (!(obj4 instanceof JsonPrimitive) || (jsonPrimitive3 = (JsonPrimitive) obj4) == null || (strA04 = C9oY.A04(jsonPrimitive3)) == null) {
            strA04 = "";
        }
        Object obj5 = jsonObject.get("date");
        if (!(obj5 instanceof JsonPrimitive) || (jsonPrimitive2 = (JsonPrimitive) obj5) == null || (strA042 = C9oY.A04(jsonPrimitive2)) == null) {
            strA042 = "";
        }
        Object obj6 = jsonObject.get("vibrate");
        JsonPrimitive jsonPrimitive7 = obj6 instanceof JsonPrimitive ? (JsonPrimitive) obj6 : null;
        boolean zBooleanValue = (jsonPrimitive7 == null || (boolA01 = C9oY.A01(jsonPrimitive7)) == null) ? true : boolA01.booleanValue();
        Object obj7 = jsonObject.get("frequency");
        if ((!(obj7 instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj7) == null || (strA043 = C9oY.A04(jsonPrimitive)) == null || !(!C7BY.A0j(strA043))) && strA042.length() > 0) {
            if (strA04.length() <= 0) {
                throw C60Q.A0V("Future-dated alarms are not supported by the system Clock app. Omit 'date' and the alarm will fire at the next ", String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, 2)), ", or use 'days' for a recurring weekday alarm.");
            }
            throw C60Q.A0U(strA0k, " cannot combine 'date' (one-time) with 'days' (recurring). Pick one, or set 'frequency'.");
        }
        String timeZone = RecurrenceKt.parseTimeZone(strA0k, jsonObject);
        if (timeZone == null || (zoneIdSystemDefault = ZoneId.of(timeZone)) == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        Recurrence recurrence = RecurrenceKt.parseRecurrence(strA0k, jsonObject, strA04);
        AlarmTimeUtil alarmTimeUtil = AlarmTimeUtil.INSTANCE;
        C7384Etj.A0X(zoneIdSystemDefault);
        int i2 = iIntValue;
        int i3 = iIntValue2;
        Long lAnchorMsFor$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm = alarmTimeUtil.anchorMsFor$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(i2, i3, recurrence, strA042, zoneIdSystemDefault);
        if (lAnchorMsFor$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm == null) {
            throw C60Q.A0U(strA0k, ".date must be a valid YYYY-MM-DD date");
        }
        long jLongValue = lAnchorMsFor$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm.longValue();
        long jComputeFirstTriggerTimeMs$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm = alarmTimeUtil.computeFirstTriggerTimeMs$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(i2, i3, recurrence, strA042, System.currentTimeMillis(), zoneIdSystemDefault);
        if (jComputeFirstTriggerTimeMs$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm != -1) {
            return new AlarmSetRequest(iIntValue, iIntValue2, strA044, strA04, zBooleanValue, jComputeFirstTriggerTimeMs$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm, recurrence, jLongValue, AnonymousClass002.A1N(strA042.length()), timeZone);
        }
        throw C60Q.A0U(strA0k, " failed to compute trigger time");
    }

    public static final JsonObject parseParams(String str) {
        JsonObject jsonObjectA1H;
        return (str == null || (jsonObjectA1H = C60O.A1H(str)) == null) ? C60O.A1G() : jsonObjectA1H;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.commands.alarm.ShadowAlarm resolveAlarmUpdate(java.lang.String r30, kotlinx.serialization.json.JsonObject r31, com.facebook.aura.commands.alarm.ShadowAlarm r32) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AlarmHandlersKt.resolveAlarmUpdate(java.lang.String, kotlinx.serialization.json.JsonObject, com.facebook.aura.commands.alarm.ShadowAlarm):com.facebook.aura.commands.alarm.ShadowAlarm");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:36:0x0132, B:38:0x0139], limit reached: 69 */
    /* JADX WARN: Path cross not found for [B:38:0x0139, B:36:0x0132], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x022c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01ce -> B:14:0x006e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object setAlarmsInOrder(android.content.Context r42, com.facebook.aura.commands.alarm.AuraAlarmShadowStore r43, java.util.List<com.facebook.aura.commands.alarm.AlarmSetRequest> r44, com.facebook.aura.commands.alarm.MuseActivityTracker r45, long r46, java.lang.String r48, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r49) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.AlarmHandlersKt.setAlarmsInOrder(android.content.Context, com.facebook.aura.commands.alarm.AuraAlarmShadowStore, java.util.List, com.facebook.aura.commands.alarm.MuseActivityTracker, long, java.lang.String, X.HtJ):java.lang.Object");
    }

    public static final boolean tryHandOffToClockApp(Context context, AlarmSetRequest alarmSetRequest) {
        Intent intentA03 = C60P.A03("android.intent.action.SET_ALARM");
        intentA03.putExtra(C3cF.A00(20), alarmSetRequest.hour);
        intentA03.putExtra(C3cF.A00(22), alarmSetRequest.minute);
        String str = alarmSetRequest.label;
        if (str.length() > 0) {
            intentA03.putExtra(C3cF.A00(21), str);
        }
        intentA03.putExtra("android.intent.extra.alarm.VIBRATE", alarmSetRequest.vibrate);
        List<Integer> days = parseDays(alarmSetRequest.days);
        if (!days.isEmpty()) {
            intentA03.putIntegerArrayListExtra("android.intent.extra.alarm.DAYS", new ArrayList<>(days));
        }
        intentA03.putExtra("android.intent.extra.alarm.SKIP_UI", true);
        intentA03.addFlags(268435456);
        try {
            context.startActivity(intentA03);
            return true;
        } catch (ActivityNotFoundException e) {
            CFK.A0A(TAG, "No Clock app handles ACTION_SET_ALARM; falling back to in-app alarm", e);
            return false;
        }
    }

    public static final String clockHandoffInterruptedMessage(List<AlarmSetRequest> list, int i, ClockHandoffStop clockHandoffStop) {
        return FGI.A0j("Only some alarms were set. Set: ", AbstractC0878AGe.A0L(", ", "", "", AbstractC0878AGe.A0a(list, i), C110631.INSTANCE), ". Not set: ", AbstractC0878AGe.A0L(", ", "", "", AbstractC0878AGe.A0Z(list, i), AnonymousClass2.INSTANCE), ", ", clockHandoffStop.getReason());
    }

    public static final Object deviceHasClockApp(Context context, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C110692(context, null));
    }

    public static final JsonObject toListEntryJson(ShadowAlarm shadowAlarm) {
        C2nw c2nwA0s = C60R.A0s(shadowAlarm);
        C7qW.A06("id", shadowAlarm.id, c2nwA0s);
        C7qW.A06("label", shadowAlarm.label, c2nwA0s);
        C7qW.A05(Integer.valueOf(shadowAlarm.hour), "hour", c2nwA0s);
        C7qW.A05(Integer.valueOf(shadowAlarm.minute), "minute", c2nwA0s);
        C7qW.A05(Long.valueOf(shadowAlarm.triggerTimeMs), "trigger_time_ms", c2nwA0s);
        C7qW.A06("trigger_time_iso", Instant.ofEpochMilli(shadowAlarm.triggerTimeMs).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME), c2nwA0s);
        C7qW.A06("days", shadowAlarm.days, c2nwA0s);
        C7pd c7pdA01 = C7pd.A01();
        Iterator<String> it = AlarmTimeUtil.INSTANCE.weekdayNames(shadowAlarm.days).iterator();
        while (it.hasNext()) {
            C7pd.A03(it, c7pdA01);
        }
        c2nwA0s.A01("days_weekdays", C7pd.A00(c7pdA01));
        C7qW.A04(Boolean.valueOf(shadowAlarm.vibrate), "vibrate", c2nwA0s);
        Recurrence recurrenceEffectiveRecurrence = shadowAlarm.effectiveRecurrence();
        if (recurrenceEffectiveRecurrence != null) {
            C7qW.A06("frequency", recurrenceEffectiveRecurrence.frequency.name(), c2nwA0s);
            C7qW.A05(Integer.valueOf(recurrenceEffectiveRecurrence.interval), "interval", c2nwA0s);
            Integer num = recurrenceEffectiveRecurrence.count;
            if (num != null) {
                C7qW.A05(num, AuraMetaFRLSecureTokenStore.JSON_KEY_COUNT, c2nwA0s);
            }
            Long l = recurrenceEffectiveRecurrence.until;
            if (l != null) {
                C7qW.A06("until", Instant.ofEpochMilli(l.longValue()).toString(), c2nwA0s);
            }
        }
        String str = shadowAlarm.timezone;
        if (str != null) {
            C7qW.A06(FeedRepositoryKt.TIMEZONE_PARAM, str, c2nwA0s);
        }
        return C7qW.A01("type", "ALARM", c2nwA0s);
    }
}
