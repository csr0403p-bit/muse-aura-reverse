package com.facebook.aura.commands.alarm;

import X.AbstractC0885AGm;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C2nw;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C7438Evz;
import X.C7BY;
import X.C7pd;
import X.C7qW;
import X.C9oY;
import X.F60;
import X.FGI;
import X.G0U;
import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import com.facebook.aura.components.reactions.AuraVictoryGleamKt;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine;
import com.facebook.aura.feed.repo.FeedRepositoryKt;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.utils.MC;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class ReminderHandlersKt {
    public static final int DEFAULT_REMINDER_SNOOZE_MINUTES = 10;
    public static final int MAX_REMINDERS = 100;
    public static final String PARAM_REMINDERS = "reminders";
    public static final String PARAM_REMINDERS_JSON = "reminders_json";
    public static final String PARAM_TARGETS = "targets";
    public static final String PARAM_TARGETS_JSON = "targets_json";
    public static final String PARAM_UPDATES = "updates";
    public static final String PARAM_UPDATES_JSON = "updates_json";
    public static final String TAG = "ReminderHandlers";
    public static volatile boolean legacyReminderEvictDone;

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.ReminderHandlersKt", f = "ReminderHandlers.kt", l = {395, 396, 414}, m = "computeReminderDismiss", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.ReminderHandlersKt$computeReminderDismiss$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
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
            return ReminderHandlersKt.computeReminderDismiss(null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.ReminderHandlersKt", f = "ReminderHandlers.kt", l = {511, 514, 529}, m = "computeReminderDismissAll", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.ReminderHandlersKt$computeReminderDismissAll$1, reason: invalid class name and case insensitive filesystem */
    public final class C110871 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReminderHandlersKt.computeReminderDismissAll(null, this);
        }

        public C110871(HtJ<? super C110871> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.ReminderHandlersKt", f = "ReminderHandlers.kt", l = {482, 486}, m = "computeReminderList", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.ReminderHandlersKt$computeReminderList$1, reason: invalid class name and case insensitive filesystem */
    public final class C110881 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReminderHandlersKt.computeReminderList(null, this);
        }

        public C110881(HtJ<? super C110881> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.ReminderHandlersKt", f = "ReminderHandlers.kt", l = {238, 239, HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH, 272, 274, 277}, m = "computeReminderSet", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.ReminderHandlersKt$computeReminderSet$1, reason: invalid class name and case insensitive filesystem */
    public final class C110891 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
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
            return ReminderHandlersKt.computeReminderSet(null, null, this);
        }

        public C110891(HtJ<? super C110891> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.ReminderHandlersKt", f = "ReminderHandlers.kt", l = {737, 749, 753}, m = "computeReminderSnooze", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.ReminderHandlersKt$computeReminderSnooze$1, reason: invalid class name and case insensitive filesystem */
    public final class C110901 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
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
            return ReminderHandlersKt.computeReminderSnooze(null, null, this);
        }

        public C110901(HtJ<? super C110901> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.ReminderHandlersKt", f = "ReminderHandlers.kt", l = {MC.hatch_message_bubble.__CONFIG__, 594, 600}, m = "computeReminderUpdate", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.ReminderHandlersKt$computeReminderUpdate$1, reason: invalid class name and case insensitive filesystem */
    public final class C110911 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
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
            return ReminderHandlersKt.computeReminderUpdate(null, null, this);
        }

        public C110911(HtJ<? super C110911> htJ) {
            super(htJ);
        }
    }

    /* renamed from: com.facebook.aura.commands.alarm.ReminderHandlersKt$evictLegacyReminderRowsOnce$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C110921 extends C7438Evz implements G0U<Context, Unit> {
        public static final C110921 INSTANCE = new C110921();

        public C110921() {
            super(1, ReminderHandlersKt.class, "evictLegacyReminderRowsOnce", "evictLegacyReminderRowsOnce(Landroid/content/Context;)V", 1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Context context) {
            invoke2(context);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Context context) {
            C7384Etj.A0Y(context, 0);
            ReminderHandlersKt.evictLegacyReminderRowsOnce(context);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.ReminderHandlersKt", f = "ReminderHandlers.kt", l = {443, 445}, m = "removeReminder", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.ReminderHandlersKt$removeReminder$1, reason: invalid class name and case insensitive filesystem */
    public final class C110931 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReminderHandlersKt.removeReminder(null, null, null, this);
        }

        public C110931(HtJ<? super C110931> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.ReminderHandlersKt", f = "ReminderHandlers.kt", l = {779, AuraVictoryGleamKt.VICTORY_TOTAL_MS, 782, 782}, m = "rescheduleReminder", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.ReminderHandlersKt$rescheduleReminder$1, reason: invalid class name and case insensitive filesystem */
    public final class C110941 extends HzP {
        public long J$0;
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
            return ReminderHandlersKt.rescheduleReminder(null, null, null, this);
        }

        public C110941(HtJ<? super C110941> htJ) {
            super(htJ);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReminderDelivery.values().length];
            try {
                AnonymousClass002.A13(ReminderDelivery.IN_APP, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ReminderDelivery.CALENDAR, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ShadowReminder asCalendarSnooze(ShadowReminder shadowReminder) {
        if (shadowReminder.delivery != ReminderDelivery.CALENDAR || !AnonymousClass002.A1X(shadowReminder.effectiveRecurrence())) {
            return shadowReminder;
        }
        ZonedDateTime zonedDateTimeAtZone = Instant.ofEpochMilli(shadowReminder.triggerTimeMs).atZone(shadowReminder.zoneId());
        String strA0k = AnonymousClass002.A0k();
        int hour = zonedDateTimeAtZone.getHour();
        int minute = zonedDateTimeAtZone.getMinute();
        String str = shadowReminder.label;
        long j = shadowReminder.triggerTimeMs;
        Long l = shadowReminder.calendarId;
        String str2 = shadowReminder.timezone;
        ReminderDelivery reminderDelivery = shadowReminder.delivery;
        AnonymousClass003.A0u(strA0k, str);
        return new ShadowReminder(strA0k, str, hour, minute, "", j, null, l, null, 0L, 0, false, str2, reminderDelivery);
    }

    public static final NodeCommandResponse calendarAccessError(Context context, List<ShadowReminder> list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator<ShadowReminder> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().delivery == ReminderDelivery.CALENDAR) {
                if (ReminderCalendar.INSTANCE.hasAccess(context)) {
                    return null;
                }
                return new NodeCommandResponse(false, null, "Calendar access is off, so reminders saved in the user's calendar can't be changed here. The user can turn calendar access back on, or change them in their calendar app.", null, null);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01ba -> B:13:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object computeReminderDismiss(com.facebook.aura.nodes.registry.HatchNodeCommandContext r10, java.lang.String r11, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r12) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.ReminderHandlersKt.computeReminderDismiss(com.facebook.aura.nodes.registry.HatchNodeCommandContext, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[LOOP:1: B:26:0x0085->B:28:0x008b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object computeReminderDismissAll(com.facebook.aura.nodes.registry.HatchNodeCommandContext r11, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r12) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.ReminderHandlersKt.computeReminderDismissAll(com.facebook.aura.nodes.registry.HatchNodeCommandContext, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7 A[LOOP:1: B:28:0x00c1->B:30:0x00c7, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object computeReminderList(com.facebook.aura.nodes.registry.HatchNodeCommandContext r23, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r24) {
        /*
            r3 = r24
            boolean r0 = r3 instanceof com.facebook.aura.commands.alarm.ReminderHandlersKt.C110881
            if (r0 == 0) goto La5
            r7 = r3
            com.facebook.aura.commands.alarm.ReminderHandlersKt$computeReminderList$1 r7 = (com.facebook.aura.commands.alarm.ReminderHandlersKt.C110881) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La5
            int r2 = r2 - r1
            r7.label = r2
        L14:
            java.lang.Object r2 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L66
            if (r0 == r4) goto L8a
            if (r0 != r5) goto Le0
            long r0 = r7.J$0
            X.Hwg.A00(r2)
        L27:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = X.AnonymousClass003.A0i(r2)
            java.util.Iterator r4 = r2.iterator()
        L31:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto Lac
            java.lang.Object r6 = r4.next()
            com.facebook.aura.commands.alarm.ShadowReminder r6 = (com.facebook.aura.commands.alarm.ShadowReminder) r6
            com.facebook.aura.commands.alarm.ReminderDelivery r3 = r6.delivery
            com.facebook.aura.commands.alarm.ReminderDelivery r2 = com.facebook.aura.commands.alarm.ReminderDelivery.CALENDAR
            if (r3 != r2) goto L62
            long r12 = com.facebook.aura.commands.alarm.ReminderCalendarKt.nextOccurrence(r6, r0)
            r23 = 16351(0x3fdf, float:2.2913E-41)
            r7 = 0
            r9 = 0
            r17 = 0
            r8 = r7
            r10 = r9
            r11 = r7
            r14 = r7
            r15 = r7
            r16 = r7
            r19 = r9
            r20 = r9
            r21 = r7
            r22 = r7
            r24 = r7
            com.facebook.aura.commands.alarm.ShadowReminder r6 = com.facebook.aura.commands.alarm.ShadowReminder.copy$default(r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24)
        L62:
            r5.add(r6)
            goto L31
        L66:
            X.Hwg.A00(r2)
            r8 = r23
            android.content.Context r0 = r8.context
            evictLegacyReminderRowsOnce(r0)
            com.facebook.aura.commands.alarm.AuraReminderShadowStore$Companion r1 = com.facebook.aura.commands.alarm.AuraReminderShadowStore.Companion
            android.content.Context r0 = r8.context
            com.facebook.aura.commands.alarm.AuraReminderShadowStore r3 = r1.getInstance(r0)
            com.facebook.aura.commands.alarm.ReminderCalendar r2 = com.facebook.aura.commands.alarm.ReminderCalendar.INSTANCE
            android.content.Context r1 = r8.context
            r0 = 0
            r7.L$0 = r0
            r7.L$1 = r3
            r7.label = r4
            java.lang.Object r0 = r2.pruneFinished(r1, r3, r7)
            if (r0 != r6) goto L91
            return r6
        L8a:
            java.lang.Object r3 = r7.L$1
            com.facebook.aura.commands.alarm.AuraReminderShadowStore r3 = (com.facebook.aura.commands.alarm.AuraReminderShadowStore) r3
            X.Hwg.A00(r2)
        L91:
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            r7.L$0 = r2
            r7.L$1 = r2
            r7.J$0 = r0
            r7.label = r5
            java.lang.Object r2 = r3.snapshot(r7)
            if (r2 != r6) goto L27
            return r6
        La5:
            com.facebook.aura.commands.alarm.ReminderHandlersKt$computeReminderList$1 r7 = new com.facebook.aura.commands.alarm.ReminderHandlersKt$computeReminderList$1
            r7.<init>(r3)
            goto L14
        Lac:
            com.facebook.aura.commands.alarm.ReminderHandlersKt$computeReminderList$$inlined$sortedBy$1 r0 = new com.facebook.aura.commands.alarm.ReminderHandlersKt$computeReminderList$$inlined$sortedBy$1
            r0.<init>()
            java.util.List r0 = X.AbstractC0878AGe.A0c(r5, r0)
            X.2nw r3 = X.C60O.A1K()
            X.7pd r2 = X.C7pd.A01()
            java.util.Iterator r1 = r0.iterator()
        Lc1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ld5
            java.lang.Object r0 = r1.next()
            com.facebook.aura.commands.alarm.ShadowReminder r0 = (com.facebook.aura.commands.alarm.ShadowReminder) r0
            kotlinx.serialization.json.JsonObject r0 = toListEntryJson(r0)
            r2.A06(r0)
            goto Lc1
        Ld5:
            kotlinx.serialization.json.JsonArray r1 = X.C7pd.A00(r2)
            java.lang.String r0 = "reminders"
            com.facebook.aura.nodes.core.NodeCommandResponse r6 = X.C60R.A0Q(r0, r1, r3)
            return r6
        Le0:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.ReminderHandlersKt.computeReminderList(com.facebook.aura.nodes.registry.HatchNodeCommandContext, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d6, code lost:
    
        r9.add(new com.facebook.aura.commands.alarm.ReminderCardItemInput(r13, X.C3cG.A0R(r8.hour), X.C3cG.A0R(r8.minute), X.C3cG.A0S(r8.triggerTimeMs)));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object computeReminderSet(com.facebook.aura.nodes.registry.HatchNodeCommandContext r31, java.lang.String r32, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r33) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.ReminderHandlersKt.computeReminderSet(com.facebook.aura.nodes.registry.HatchNodeCommandContext, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[LOOP:0: B:14:0x0040->B:16:0x0046, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0104 -> B:51:0x0122). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01a4 -> B:64:0x01bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object computeReminderSnooze(com.facebook.aura.nodes.registry.HatchNodeCommandContext r30, java.lang.String r31, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r32) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.ReminderHandlersKt.computeReminderSnooze(com.facebook.aura.nodes.registry.HatchNodeCommandContext, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[LOOP:0: B:14:0x0040->B:16:0x0046, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0111 A[Catch: IllegalArgumentException -> 0x01cb, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x01cb, blocks: (B:44:0x0111, B:18:0x0060, B:20:0x006a, B:67:0x01c4, B:68:0x01ca), top: B:75:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ad  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e2 -> B:41:0x0106). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x015b -> B:55:0x0175). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object computeReminderUpdate(com.facebook.aura.nodes.registry.HatchNodeCommandContext r15, java.lang.String r16, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r17) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.ReminderHandlersKt.computeReminderUpdate(com.facebook.aura.nodes.registry.HatchNodeCommandContext, java.lang.String, X.HtJ):java.lang.Object");
    }

    public static final void evictLegacyReminderRowsOnce(Context context) {
        if (legacyReminderEvictDone) {
            return;
        }
        synchronized (C110921.INSTANCE) {
            if (!legacyReminderEvictDone) {
                AlarmStore companion = AlarmStore.Companion.getInstance(context);
                List<NodeAlarm> all = companion.getAll();
                ArrayList arrayListA0h = C3cG.A0h();
                for (NodeAlarm nodeAlarm : all) {
                    if (nodeAlarm.type == AlarmType.REMINDER) {
                        arrayListA0h.add(nodeAlarm);
                    }
                }
                int i = 0;
                if (!(arrayListA0h instanceof Collection) || !arrayListA0h.isEmpty()) {
                    Iterator it = arrayListA0h.iterator();
                    while (it.hasNext()) {
                        if (companion.remove(((NodeAlarm) it.next()).id) && (i = i + 1) < 0) {
                            AbstractC0885AGm.A13();
                            throw F60.createAndThrow();
                        }
                    }
                    if (i > 0) {
                        C60O.A1O("Evicted ", i, " legacy reminder rows from AlarmStore", TAG);
                    }
                }
                legacyReminderEvictDone = true;
            }
        }
    }

    public static final NodeCommandResponse offerChatReminder(String str) {
        return C60R.A0P(FGI.A0M(str, " The reminder was not set on the phone. Offer to set it for the user yourself as a chat reminder instead, and set it only if they agree."));
    }

    public static final ReminderDismissTarget parseReminderDismissTarget(int i, JsonObject jsonObject) {
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
        return new ReminderDismissTarget(strA04, strA0g);
    }

    public static final ReminderSetRequest parseReminderSetRequest(int i, JsonObject jsonObject) {
        String strA04;
        String strA042;
        ZoneId zoneIdSystemDefault;
        JsonPrimitive jsonPrimitive;
        String strA043;
        JsonPrimitive jsonPrimitive2;
        JsonPrimitive jsonPrimitive3;
        JsonPrimitive jsonPrimitive4;
        JsonPrimitive jsonPrimitive5;
        Integer numA02;
        JsonPrimitive jsonPrimitive6;
        Integer numA022;
        String strA0k = C60Q.A0k("reminders_json[", i);
        Object obj = jsonObject.get("hour");
        String strA044 = null;
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
        if ((obj3 instanceof JsonPrimitive) && (jsonPrimitive4 = (JsonPrimitive) obj3) != null) {
            strA044 = C9oY.A04(jsonPrimitive4);
        }
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
        Object obj6 = jsonObject.get("frequency");
        if ((!(obj6 instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj6) == null || (strA043 = C9oY.A04(jsonPrimitive)) == null || !(!C7BY.A0j(strA043))) && strA042.length() > 0 && strA04.length() > 0) {
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
            return new ReminderSetRequest(iIntValue, iIntValue2, strA044, strA04, jComputeFirstTriggerTimeMs$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm, recurrence, jLongValue, timeZone);
        }
        throw C60Q.A0U(strA0k, " failed to compute trigger time");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object removeReminder(android.content.Context r7, com.facebook.aura.commands.alarm.AuraReminderShadowStore r8, com.facebook.aura.commands.alarm.ShadowReminder r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            boolean r0 = r10 instanceof com.facebook.aura.commands.alarm.ReminderHandlersKt.C110931
            if (r0 == 0) goto L71
            r3 = r10
            com.facebook.aura.commands.alarm.ReminderHandlersKt$removeReminder$1 r3 = (com.facebook.aura.commands.alarm.ReminderHandlersKt.C110931) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r1 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r4 = 2
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L27
            if (r0 == r6) goto L54
            if (r0 != r4) goto L77
            X.Hwg.A00(r1)
        L24:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L27:
            X.Hwg.A00(r1)
            com.facebook.aura.commands.alarm.ReminderDelivery r1 = r9.delivery
            if (r1 != 0) goto L30
            com.facebook.aura.commands.alarm.ReminderDelivery r1 = com.facebook.aura.commands.alarm.ReminderDelivery.IN_APP
        L30:
            int[] r0 = com.facebook.aura.commands.alarm.ReminderHandlersKt.WhenMappings.$EnumSwitchMapping$0
            int r0 = r1.ordinal()
            if (r0 == r5) goto L4c
            if (r0 != r6) goto L7c
            com.facebook.aura.commands.alarm.ReminderCalendar r1 = com.facebook.aura.commands.alarm.ReminderCalendar.INSTANCE
            r0 = 0
            r3.L$0 = r0
            r3.L$1 = r8
            r3.L$2 = r9
            r3.label = r6
            java.lang.Object r0 = r1.remove(r7, r9, r3)
            if (r0 != r2) goto L5f
            return r2
        L4c:
            com.facebook.aura.commands.alarm.HatchReminderScheduler r1 = com.facebook.aura.commands.alarm.HatchReminderScheduler.INSTANCE
            java.lang.String r0 = r9.id
            r1.cancel(r7, r0)
            goto L5f
        L54:
            java.lang.Object r9 = r3.L$2
            com.facebook.aura.commands.alarm.ShadowReminder r9 = (com.facebook.aura.commands.alarm.ShadowReminder) r9
            java.lang.Object r8 = r3.L$1
            com.facebook.aura.commands.alarm.AuraReminderShadowStore r8 = (com.facebook.aura.commands.alarm.AuraReminderShadowStore) r8
            X.Hwg.A00(r1)
        L5f:
            java.lang.String r1 = r9.id
            r0 = 0
            r3.L$0 = r0
            r3.L$1 = r0
            r3.L$2 = r0
            r3.label = r4
            java.lang.Object r0 = r8.removeById(r1, r3)
            if (r0 != r2) goto L24
            return r2
        L71:
            com.facebook.aura.commands.alarm.ReminderHandlersKt$removeReminder$1 r3 = new com.facebook.aura.commands.alarm.ReminderHandlersKt$removeReminder$1
            r3.<init>(r10)
            goto L12
        L77:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L7c:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.ReminderHandlersKt.removeReminder(android.content.Context, com.facebook.aura.commands.alarm.AuraReminderShadowStore, com.facebook.aura.commands.alarm.ShadowReminder, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object rescheduleReminder(android.content.Context r13, com.facebook.aura.commands.alarm.AuraReminderShadowStore r14, com.facebook.aura.commands.alarm.ShadowReminder r15, X.HtJ<? super com.facebook.aura.commands.alarm.ShadowReminder> r16) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.ReminderHandlersKt.rescheduleReminder(android.content.Context, com.facebook.aura.commands.alarm.AuraReminderShadowStore, com.facebook.aura.commands.alarm.ShadowReminder, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.commands.alarm.ShadowReminder resolveReminderUpdate(java.lang.String r31, kotlinx.serialization.json.JsonObject r32, com.facebook.aura.commands.alarm.ShadowReminder r33) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.ReminderHandlersKt.resolveReminderUpdate(java.lang.String, kotlinx.serialization.json.JsonObject, com.facebook.aura.commands.alarm.ShadowReminder):com.facebook.aura.commands.alarm.ShadowReminder");
    }

    public static final JsonObject toListEntryJson(ShadowReminder shadowReminder) {
        C2nw c2nwA0s = C60R.A0s(shadowReminder);
        C7qW.A06("id", shadowReminder.id, c2nwA0s);
        C7qW.A06("label", shadowReminder.label, c2nwA0s);
        C7qW.A05(Integer.valueOf(shadowReminder.hour), "hour", c2nwA0s);
        C7qW.A05(Integer.valueOf(shadowReminder.minute), "minute", c2nwA0s);
        C7qW.A05(Long.valueOf(shadowReminder.triggerTimeMs), "trigger_time_ms", c2nwA0s);
        C7qW.A06("trigger_time_iso", Instant.ofEpochMilli(shadowReminder.triggerTimeMs).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME), c2nwA0s);
        C7qW.A06("days", shadowReminder.days, c2nwA0s);
        C7pd c7pdA01 = C7pd.A01();
        Iterator<String> it = AlarmTimeUtil.INSTANCE.weekdayNames(shadowReminder.days).iterator();
        while (it.hasNext()) {
            C7pd.A03(it, c7pdA01);
        }
        c2nwA0s.A01("days_weekdays", C7pd.A00(c7pdA01));
        Recurrence recurrenceEffectiveRecurrence = shadowReminder.effectiveRecurrence();
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
        String str = shadowReminder.timezone;
        if (str != null) {
            C7qW.A06(FeedRepositoryKt.TIMEZONE_PARAM, str, c2nwA0s);
        }
        ReminderDelivery reminderDelivery = shadowReminder.delivery;
        if (reminderDelivery == null) {
            reminderDelivery = ReminderDelivery.IN_APP;
        }
        C7qW.A06("delivery", reminderDelivery.getWireName(), c2nwA0s);
        return C7qW.A01("type", "REMINDER", c2nwA0s);
    }
}
