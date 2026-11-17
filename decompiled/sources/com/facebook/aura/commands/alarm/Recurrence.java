package com.facebook.aura.commands.alarm;

import X.AII;
import X.AIM;
import X.AbstractC06907md;
import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import X.F60;
import X.FGI;
import java.time.Instant;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class Recurrence extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<Integer> byWeekdays;
    public final Integer count;
    public final RecurrenceFrequency frequency;
    public final int interval;
    public final Long until;

    public final class Companion {
        public final C9hr<Recurrence> serializer() {
            return Recurrence$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{AbstractC5321DgF.A02(num, Recurrence$Companion$$childSerializers$1.INSTANCE), null, AbstractC5321DgF.A02(num, Recurrence$Companion$$childSerializers$2.INSTANCE), null, null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Recurrence) {
                Recurrence recurrence = (Recurrence) obj;
                if (this.frequency != recurrence.frequency || this.interval != recurrence.interval || !C7384Etj.areEqual(this.byWeekdays, recurrence.byWeekdays) || !C7384Etj.areEqual(this.count, recurrence.count) || !C7384Etj.areEqual(this.until, recurrence.until)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Recurrence copy$default(Recurrence recurrence, RecurrenceFrequency recurrenceFrequency, int i, List list, Integer num, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            recurrenceFrequency = recurrence.frequency;
        }
        if ((i2 & 2) != 0) {
            i = recurrence.interval;
        }
        if ((i2 & 4) != 0) {
            list = recurrence.byWeekdays;
        }
        if ((i2 & 8) != 0) {
            num = recurrence.count;
        }
        if ((i2 & 16) != 0) {
            l = recurrence.until;
        }
        return recurrence.copy(recurrenceFrequency, i, list, num, l);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(Recurrence recurrence, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAQ(recurrence.frequency, C3cH.A15(f0cArr, 0), c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || recurrence.interval != 1) {
            c9j5.AAK(c9iZ, 1, recurrence.interval);
        }
        if (zAfR || !C3cG.A1L(recurrence.byWeekdays)) {
            c9j5.AAQ(recurrence.byWeekdays, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || recurrence.count != null) {
            c9j5.AAP(recurrence.count, C07729ii.A00, c9iZ, 3);
        }
        if (zAfR || recurrence.until != null) {
            c9j5.AAP(recurrence.until, C9j1.A00, c9iZ, 4);
        }
    }

    public final RecurrenceFrequency component1() {
        return this.frequency;
    }

    public final int component2() {
        return this.interval;
    }

    public final List<Integer> component3() {
        return this.byWeekdays;
    }

    public final Integer component4() {
        return this.count;
    }

    public final Long component5() {
        return this.until;
    }

    public final List<Integer> getByWeekdays() {
        return this.byWeekdays;
    }

    public final Integer getCount() {
        return this.count;
    }

    public final RecurrenceFrequency getFrequency() {
        return this.frequency;
    }

    public final int getInterval() {
        return this.interval;
    }

    public final Long getUntil() {
        return this.until;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.byWeekdays, (AnonymousClass005.A0E(this.frequency) + this.interval) * 31) + AnonymousClass006.A0D(this.count)) * 31) + C3cH.A02(this.until);
    }

    public Recurrence(RecurrenceFrequency recurrenceFrequency, int i, List<Integer> list, Integer num, Long l) {
        AnonymousClass003.A0v(recurrenceFrequency, list);
        this.frequency = recurrenceFrequency;
        this.interval = i;
        this.byWeekdays = list;
        this.count = num;
        this.until = l;
    }

    public final Recurrence copy(RecurrenceFrequency recurrenceFrequency, int i, List<Integer> list, Integer num, Long l) {
        AnonymousClass003.A0v(recurrenceFrequency, list);
        return new Recurrence(recurrenceFrequency, i, list, num, l);
    }

    public final String toRrule() {
        AII aiiA17 = AIM.A17();
        aiiA17.add(FGI.A0M("FREQ=", this.frequency.name()));
        int i = this.interval;
        if (i > 1) {
            aiiA17.add(FGI.A0H("INTERVAL=", i));
        }
        if (!this.byWeekdays.isEmpty()) {
            aiiA17.add(FGI.A0M("BYDAY=", AbstractC06907md.A01(",", this.byWeekdays, Recurrence$toRrule$1$1.INSTANCE)));
        }
        Integer num = this.count;
        if (num != null) {
            aiiA17.add(FGI.A0H("COUNT=", num.intValue()));
        }
        Long l = this.until;
        if (l != null) {
            aiiA17.add(FGI.A0M("UNTIL=", RecurrenceKt.RRULE_UNTIL_FORMAT.format(Instant.ofEpochMilli(l.longValue()))));
        }
        return C3cH.A0e(";", AIM.A18(aiiA17));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ Recurrence(RecurrenceFrequency recurrenceFrequency, int i, List list, Integer num, Long l, int i2, C06H c06h) {
        this(recurrenceFrequency, (i2 & 2) != 0 ? 1 : i, C3cI.A12(list, i2), (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : l);
    }

    public /* synthetic */ Recurrence(int i, RecurrenceFrequency recurrenceFrequency, int i2, List list, Integer num, Long l, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(Recurrence$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.frequency = recurrenceFrequency;
        if ((i & 2) == 0) {
            this.interval = 1;
        } else {
            this.interval = i2;
        }
        if ((i & 4) == 0) {
            this.byWeekdays = C0881AGi.A00;
        } else {
            this.byWeekdays = list;
        }
        if ((i & 8) == 0) {
            this.count = null;
        } else {
            this.count = num;
        }
        if ((i & 16) == 0) {
            this.until = null;
        } else {
            this.until = l;
        }
    }
}
