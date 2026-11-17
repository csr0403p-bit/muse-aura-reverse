package com.facebook.aura.commands.alarm;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C10571Hud;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.time.ZoneId;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShadowAlarm extends C06G {
    public static final Companion Companion = new Companion();
    public final long anchorMs;
    public final String days;
    public final int firedCount;
    public final int hour;
    public final String id;
    public final boolean inApp;
    public final String label;
    public final int minute;
    public final Recurrence recurrence;
    public final String timezone;
    public final long triggerTimeMs;
    public final boolean vibrate;

    public final class Companion {
        public final C9hr<ShadowAlarm> serializer() {
            return ShadowAlarm$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(ShadowAlarm shadowAlarm, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(shadowAlarm.id, c9iZ, 0);
        c9j5.AAV(shadowAlarm.label, c9iZ, 1);
        c9j5.AAK(c9iZ, 2, shadowAlarm.hour);
        c9j5.AAK(c9iZ, 3, shadowAlarm.minute);
        c9j5.AAN(c9iZ, 4, shadowAlarm.triggerTimeMs);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(shadowAlarm.days)) {
            c9j5.AAV(shadowAlarm.days, c9iZ, 5);
        }
        if (zAfR || !shadowAlarm.vibrate) {
            c9j5.AA7(c9iZ, 6, shadowAlarm.vibrate);
        }
        if (zAfR || shadowAlarm.inApp) {
            c9j5.AA7(c9iZ, 7, shadowAlarm.inApp);
        }
        if (zAfR || shadowAlarm.recurrence != null) {
            c9j5.AAP(shadowAlarm.recurrence, Recurrence$$serializer.INSTANCE, c9iZ, 8);
        }
        if (zAfR || shadowAlarm.anchorMs != 0) {
            c9j5.AAN(c9iZ, 9, shadowAlarm.anchorMs);
        }
        if (zAfR || shadowAlarm.firedCount != 0) {
            c9j5.AAK(c9iZ, 10, shadowAlarm.firedCount);
        }
        if (zAfR || shadowAlarm.timezone != null) {
            c9j5.AAP(shadowAlarm.timezone, C07779iq.A01, c9iZ, 11);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShadowAlarm) {
                ShadowAlarm shadowAlarm = (ShadowAlarm) obj;
                if (!C7384Etj.areEqual(this.id, shadowAlarm.id) || !C7384Etj.areEqual(this.label, shadowAlarm.label) || this.hour != shadowAlarm.hour || this.minute != shadowAlarm.minute || this.triggerTimeMs != shadowAlarm.triggerTimeMs || !C7384Etj.areEqual(this.days, shadowAlarm.days) || this.vibrate != shadowAlarm.vibrate || this.inApp != shadowAlarm.inApp || !C7384Etj.areEqual(this.recurrence, shadowAlarm.recurrence) || this.anchorMs != shadowAlarm.anchorMs || this.firedCount != shadowAlarm.firedCount || !C7384Etj.areEqual(this.timezone, shadowAlarm.timezone)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ShadowAlarm(String str, String str2, int i, int i2, long j, String str3, boolean z, boolean z2, Recurrence recurrence, long j2, int i3, String str4, int i4, C06H c06h) {
        this(str, str2, i, i2, j, (i4 & 32) != 0 ? "" : str3, C60Q.A1Q(i4 & 64, z), C3cH.A1N(i4, z2), (i4 & 256) != 0 ? null : recurrence, C3cH.A03(i4 & 512, j2), (i4 & 1024) != 0 ? 0 : i3, (i4 & 2048) != 0 ? null : str4);
    }

    public static /* synthetic */ ShadowAlarm copy$default(ShadowAlarm shadowAlarm, String str, String str2, int i, int i2, long j, String str3, boolean z, boolean z2, Recurrence recurrence, long j2, int i3, String str4, int i4, Object obj) {
        int i5 = i3;
        String str5 = str4;
        if ((i4 & 1) != 0) {
            str = shadowAlarm.id;
        }
        if ((i4 & 2) != 0) {
            str2 = shadowAlarm.label;
        }
        if ((i4 & 4) != 0) {
            i = shadowAlarm.hour;
        }
        if ((i4 & 8) != 0) {
            i2 = shadowAlarm.minute;
        }
        if ((i4 & 16) != 0) {
            j = shadowAlarm.triggerTimeMs;
        }
        if ((i4 & 32) != 0) {
            str3 = shadowAlarm.days;
        }
        if ((i4 & 64) != 0) {
            z = shadowAlarm.vibrate;
        }
        if ((i4 & 128) != 0) {
            z2 = shadowAlarm.inApp;
        }
        if ((i4 & 256) != 0) {
            recurrence = shadowAlarm.recurrence;
        }
        if ((i4 & 512) != 0) {
            j2 = shadowAlarm.anchorMs;
        }
        if ((i4 & 1024) != 0) {
            i5 = shadowAlarm.firedCount;
        }
        if ((i4 & 2048) != 0) {
            str5 = shadowAlarm.timezone;
        }
        return shadowAlarm.copy(str, str2, i, i2, j, str3, z, z2, recurrence, j2, i5, str5);
    }

    public final String component1() {
        return this.id;
    }

    public final long component10() {
        return this.anchorMs;
    }

    public final int component11() {
        return this.firedCount;
    }

    public final String component12() {
        return this.timezone;
    }

    public final String component2() {
        return this.label;
    }

    public final int component3() {
        return this.hour;
    }

    public final int component4() {
        return this.minute;
    }

    public final long component5() {
        return this.triggerTimeMs;
    }

    public final String component6() {
        return this.days;
    }

    public final boolean component7() {
        return this.vibrate;
    }

    public final boolean component8() {
        return this.inApp;
    }

    public final Recurrence component9() {
        return this.recurrence;
    }

    public final Recurrence effectiveRecurrence() {
        Recurrence recurrence = this.recurrence;
        if (recurrence != null) {
            return recurrence;
        }
        List<Integer> days = AlarmHandlersKt.parseDays(this.days);
        if (days.isEmpty()) {
            return null;
        }
        F0C<C9hr<Object>>[] f0cArr = Recurrence.$childSerializers;
        return new Recurrence(RecurrenceFrequency.WEEKLY, 1, days, null, null);
    }

    public final long getAnchorMs() {
        return this.anchorMs;
    }

    public final String getDays() {
        return this.days;
    }

    public final int getFiredCount() {
        return this.firedCount;
    }

    public final int getHour() {
        return this.hour;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getInApp() {
        return this.inApp;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getMinute() {
        return this.minute;
    }

    public final Recurrence getRecurrence() {
        return this.recurrence;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final long getTriggerTimeMs() {
        return this.triggerTimeMs;
    }

    public final boolean getVibrate() {
        return this.vibrate;
    }

    public int hashCode() {
        return ((AnonymousClass006.A06(this.anchorMs, (C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.days, AnonymousClass006.A06(this.triggerTimeMs, (((AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.id)) + this.hour) * 31) + this.minute) * 31)), this.vibrate), this.inApp) + AnonymousClass006.A0D(this.recurrence)) * 31) + this.firedCount) * 31) + AnonymousClass005.A0H(this.timezone);
    }

    public final ZoneId zoneId() {
        Object objA0s;
        String str = this.timezone;
        if (str != null) {
            try {
                objA0s = ZoneId.of(str);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            ZoneId zoneId = (ZoneId) objA0s;
            if (zoneId != null) {
                return zoneId;
            }
        }
        return C60Q.A0r();
    }

    public final ShadowAlarm copy(String str, String str2, int i, int i2, long j, String str3, boolean z, boolean z2, Recurrence recurrence, long j2, int i3, String str4) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str3, 5);
        return new ShadowAlarm(str, str2, i, i2, j, str3, z, z2, recurrence, j2, i3, str4);
    }

    public final boolean isRecurring() {
        return AnonymousClass002.A1X(effectiveRecurrence());
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShadowAlarm(int i, String str, String str2, int i2, int i3, long j, String str3, boolean z, boolean z2, Recurrence recurrence, long j2, int i4, String str4, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(ShadowAlarm$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.label = str2;
        this.hour = i2;
        this.minute = i3;
        this.triggerTimeMs = j;
        this.days = (i & 32) == 0 ? "" : str3;
        if ((i & 64) == 0) {
            this.vibrate = true;
        } else {
            this.vibrate = z;
        }
        if ((i & 128) == 0) {
            this.inApp = false;
        } else {
            this.inApp = z2;
        }
        if ((i & 256) == 0) {
            this.recurrence = null;
        } else {
            this.recurrence = recurrence;
        }
        if ((i & 512) == 0) {
            this.anchorMs = 0L;
        } else {
            this.anchorMs = j2;
        }
        if ((i & 1024) == 0) {
            this.firedCount = 0;
        } else {
            this.firedCount = i4;
        }
        if ((i & 2048) == 0) {
            this.timezone = null;
        } else {
            this.timezone = str4;
        }
    }

    public ShadowAlarm(String str, String str2, int i, int i2, long j, String str3, boolean z, boolean z2, Recurrence recurrence, long j2, int i3, String str4) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str3, 5);
        this.id = str;
        this.label = str2;
        this.hour = i;
        this.minute = i2;
        this.triggerTimeMs = j;
        this.days = str3;
        this.vibrate = z;
        this.inApp = z2;
        this.recurrence = recurrence;
        this.anchorMs = j2;
        this.firedCount = i3;
        this.timezone = str4;
    }
}
