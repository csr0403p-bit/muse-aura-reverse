package X;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;

/* renamed from: X.Fx0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9023Fx0 {
    public static final Duration A00;

    static {
        Duration durationOfDays = Duration.ofDays(1L);
        C7384Etj.A0U(durationOfDays);
        A00 = durationOfDays;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.Fx6<?> A00(X.C9025Fx3 r4) {
        /*
            java.time.LocalDateTime r3 = r4.A03
            if (r3 != 0) goto L10
            java.time.LocalDateTime r0 = r4.A02
            if (r0 == 0) goto L36
            java.time.Instant r1 = java.time.Instant.EPOCH
            java.time.ZoneOffset r0 = java.time.ZoneOffset.MIN
            java.time.LocalDateTime r3 = java.time.LocalDateTime.ofInstant(r1, r0)
        L10:
            java.time.LocalDateTime r0 = r4.A02
            if (r0 != 0) goto L28
            java.time.Instant r2 = java.time.Instant.now()
            r0 = 1
            java.time.Duration r0 = java.time.Duration.ofDays(r0)
            java.time.Instant r1 = r2.plus(r0)
            java.time.ZoneOffset r0 = java.time.ZoneOffset.MAX
            java.time.LocalDateTime r0 = java.time.LocalDateTime.ofInstant(r1, r0)
        L28:
            X.C7384Etj.A0X(r3)
            X.C7384Etj.A0X(r0)
            X.Fwu r2 = new X.Fwu
            r2.<init>(r3, r0)
        L33:
            X.Fx6 r2 = (X.Fx6) r2
            return r2
        L36:
            java.time.Instant r1 = r4.A01
            if (r1 != 0) goto L3c
            java.time.Instant r1 = java.time.Instant.EPOCH
        L3c:
            java.time.Instant r0 = r4.A00
            if (r0 != 0) goto L44
            java.time.Instant r0 = java.time.Instant.now()
        L44:
            X.C7384Etj.A0X(r1)
            X.C7384Etj.A0X(r0)
            X.Fwv r2 = new X.Fwv
            r2.<init>(r1, r0)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9023Fx0.A00(X.Fx3):X.Fx6");
    }

    public static final C9025Fx3 A01(C9025Fx3 c9025Fx3) {
        Instant instant = c9025Fx3.A01;
        Instant instantMinus = instant != null ? instant.minus((TemporalAmount) A00) : null;
        Instant instant2 = c9025Fx3.A00;
        LocalDateTime localDateTime = c9025Fx3.A03;
        return new C9025Fx3(instantMinus, instant2, localDateTime != null ? localDateTime.minus((TemporalAmount) A00) : null, c9025Fx3.A02);
    }
}
