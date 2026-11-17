package com.facebook.aura.commands.alarm;

import X.C60P;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import android.content.ContentUris;
import android.content.Context;
import android.provider.CalendarContract;
import com.facebook.aura.composer.util.ImageCompressor;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class ReminderCalendar {
    public static final ReminderCalendar INSTANCE = new ReminderCalendar();

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.ReminderCalendar", f = "ReminderCalendar.kt", l = {48, 58, 59}, m = "add", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.ReminderCalendar$add$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReminderCalendar.this.add(null, null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.ReminderCalendar", f = "ReminderCalendar.kt", l = {ImageCompressor.IMAGE_COMPRESSION_QUALITY, 89, 91}, m = "pruneFinished", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.ReminderCalendar$pruneFinished$1, reason: invalid class name and case insensitive filesystem */
    public final class C110831 extends HzP {
        public int I$0;
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C110831(HtJ<? super C110831> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReminderCalendar.this.pruneFinished(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.ReminderCalendar", f = "ReminderCalendar.kt", l = {78}, m = "remove", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.ReminderCalendar$remove$1, reason: invalid class name and case insensitive filesystem */
    public final class C110841 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C110841(HtJ<? super C110841> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReminderCalendar.this.remove(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.ReminderCalendar", f = "ReminderCalendar.kt", l = {72, 73}, m = "replace", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.ReminderCalendar$replace$1, reason: invalid class name and case insensitive filesystem */
    public final class C110851 extends HzP {
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C110851(HtJ<? super C110851> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReminderCalendar.this.replace(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.alarm.ReminderCalendar", f = "ReminderCalendar.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop}, m = "targetCalendarId", v = 2)
    /* renamed from: com.facebook.aura.commands.alarm.ReminderCalendar$targetCalendarId$1, reason: invalid class name and case insensitive filesystem */
    public final class C110861 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C110861(HtJ<? super C110861> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReminderCalendar.this.targetCalendarId(null, this);
        }
    }

    public final boolean hasAccess(Context context) {
        C7384Etj.A0Y(context, 0);
        return context.checkSelfPermission("android.permission.READ_CALENDAR") == 0 && context.checkSelfPermission("android.permission.WRITE_CALENDAR") == 0;
    }

    public final boolean hasCalendarApp(Context context) {
        C7384Etj.A0Y(context, 0);
        C7384Etj.A0U(context.getPackageManager().queryIntentActivities(C60P.A03("android.intent.action.VIEW").setDataAndType(ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, 0L), ReminderCalendarKt.EVENT_MIME_TYPE), 0));
        return !r0.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object replace(android.content.Context r11, com.facebook.aura.commands.alarm.ShadowReminder r12, X.HtJ<? super com.facebook.aura.commands.alarm.ShadowReminder> r13) {
        /*
            r10 = this;
            r8 = r11
            r3 = r13
            r9 = r12
            boolean r0 = r13 instanceof com.facebook.aura.commands.alarm.ReminderCalendar.C110851
            r7 = r10
            if (r0 == 0) goto L74
            r12 = r3
            com.facebook.aura.commands.alarm.ReminderCalendar$replace$1 r12 = (com.facebook.aura.commands.alarm.ReminderCalendar.C110851) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r12.label = r2
        L16:
            java.lang.Object r5 = r12.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r6 = 0
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 == r1) goto L45
            if (r0 != r3) goto L7a
            java.lang.Object r6 = r12.L$2
            X.Hwg.A00(r5)
        L2a:
            return r6
        L2b:
            X.Hwg.A00(r5)
            java.lang.Long r0 = r9.calendarId
            if (r0 == 0) goto L2a
            long r10 = r0.longValue()
            r12.L$0 = r8
            r12.L$1 = r9
            r12.J$0 = r10
            r12.label = r1
            java.lang.Object r5 = r7.add(r8, r9, r10, r12)
            if (r5 != r4) goto L51
        L44:
            return r4
        L45:
            long r10 = r12.J$0
            java.lang.Object r9 = r12.L$1
            com.facebook.aura.commands.alarm.ShadowReminder r9 = (com.facebook.aura.commands.alarm.ShadowReminder) r9
            java.lang.Object r0 = r12.L$0
            android.content.Context r8 = X.C60P.A02(r0, r5)
        L51:
            if (r5 == 0) goto L2a
            java.lang.Long r0 = r9.eventId
            if (r0 == 0) goto L7f
            long r1 = r0.longValue()
            com.facebook.aura.commands.calendar.CalendarRepository$Companion r0 = com.facebook.aura.commands.calendar.CalendarRepository.Companion
            com.facebook.aura.commands.calendar.CalendarRepository r0 = r0.getInstance(r8)
            r12.L$0 = r6
            r12.L$1 = r6
            r12.L$2 = r5
            r12.J$0 = r10
            r12.J$1 = r1
            r12.label = r3
            java.lang.Object r0 = r0.deleteEvent(r1, r12)
            if (r0 == r4) goto L44
            return r5
        L74:
            com.facebook.aura.commands.alarm.ReminderCalendar$replace$1 r12 = new com.facebook.aura.commands.alarm.ReminderCalendar$replace$1
            r12.<init>(r13)
            goto L16
        L7a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L7f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.ReminderCalendar.replace(android.content.Context, com.facebook.aura.commands.alarm.ShadowReminder, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object add(android.content.Context r24, com.facebook.aura.commands.alarm.ShadowReminder r25, long r26, X.HtJ<? super com.facebook.aura.commands.alarm.ShadowReminder> r28) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.ReminderCalendar.add(android.content.Context, com.facebook.aura.commands.alarm.ShadowReminder, long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0038, code lost:
    
        if (r5 == null) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ab -> B:13:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pruneFinished(android.content.Context r14, com.facebook.aura.commands.alarm.AuraReminderShadowStore r15, X.HtJ<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.ReminderCalendar.pruneFinished(android.content.Context, com.facebook.aura.commands.alarm.AuraReminderShadowStore, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(android.content.Context r8, com.facebook.aura.commands.alarm.ShadowReminder r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.commands.alarm.ReminderCalendar.C110841
            if (r0 == 0) goto L44
            r6 = r10
            com.facebook.aura.commands.alarm.ReminderCalendar$remove$1 r6 = (com.facebook.aura.commands.alarm.ReminderCalendar.C110841) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L23
            if (r0 != r4) goto L4a
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L23:
            X.Hwg.A00(r1)
            java.lang.Long r0 = r9.eventId
            if (r0 == 0) goto L20
            long r2 = r0.longValue()
            com.facebook.aura.commands.calendar.CalendarRepository$Companion r0 = com.facebook.aura.commands.calendar.CalendarRepository.Companion
            com.facebook.aura.commands.calendar.CalendarRepository r1 = r0.getInstance(r8)
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.J$0 = r2
            r6.label = r4
            java.lang.Object r0 = r1.deleteEvent(r2, r6)
            if (r0 != r5) goto L20
            return r5
        L44:
            com.facebook.aura.commands.alarm.ReminderCalendar$remove$1 r6 = new com.facebook.aura.commands.alarm.ReminderCalendar$remove$1
            r6.<init>(r10)
            goto L12
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.ReminderCalendar.remove(android.content.Context, com.facebook.aura.commands.alarm.ShadowReminder, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object targetCalendarId(android.content.Context r7, X.HtJ<? super java.lang.Long> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.commands.alarm.ReminderCalendar.C110861
            if (r0 == 0) goto L46
            r5 = r8
            com.facebook.aura.commands.alarm.ReminderCalendar$targetCalendarId$1 r5 = (com.facebook.aura.commands.alarm.ReminderCalendar.C110861) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L4c
            X.Hwg.A00(r4)
        L21:
            com.facebook.aura.commands.calendar.CalendarRepository$CalendarInfo r4 = (com.facebook.aura.commands.calendar.CalendarRepository.CalendarInfo) r4
            if (r4 == 0) goto L2b
            long r0 = r4.id
            java.lang.Long r2 = X.C3cG.A0S(r0)
        L2b:
            return r2
        L2c:
            X.Hwg.A00(r4)
            boolean r0 = r6.hasAccess(r7)
            if (r0 == 0) goto L2b
            com.facebook.aura.commands.calendar.CalendarRepository$Companion r0 = com.facebook.aura.commands.calendar.CalendarRepository.Companion
            com.facebook.aura.commands.calendar.CalendarRepository r0 = r0.getInstance(r7)
            r5.L$0 = r2
            r5.label = r1
            java.lang.Object r4 = r0.getDefaultWritableCalendar(r5)
            if (r4 != r3) goto L21
            return r3
        L46:
            com.facebook.aura.commands.alarm.ReminderCalendar$targetCalendarId$1 r5 = new com.facebook.aura.commands.alarm.ReminderCalendar$targetCalendarId$1
            r5.<init>(r8)
            goto L12
        L4c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.alarm.ReminderCalendar.targetCalendarId(android.content.Context, X.HtJ):java.lang.Object");
    }
}
