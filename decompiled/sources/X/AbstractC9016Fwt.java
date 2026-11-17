package X;

/* renamed from: X.Fwt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9016Fwt {
    /* JADX WARN: Incorrect types in method signature: (Ljava/time/Instant;LX/Fx6<*>;Ljava/time/ZoneOffset;)Z */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.time.ZoneId] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(X.Fx6 r4, java.time.Instant r5, java.time.ZoneOffset r6) {
        /*
            r3 = 0
            r2 = 1
            boolean r0 = r4 instanceof X.C9018Fwv
            if (r0 == 0) goto L19
            X.Fwv r4 = (X.C9018Fwv) r4
            java.time.Instant r0 = r4.A01
            boolean r0 = r5.isBefore(r0)
            if (r0 != 0) goto L4d
            java.time.Instant r0 = r4.A00
        L12:
            boolean r0 = r5.isBefore(r0)
            if (r0 == 0) goto L4d
            return r2
        L19:
            boolean r0 = r4 instanceof X.C9017Fwu
            if (r0 == 0) goto L4e
            X.Fwu r4 = (X.C9017Fwu) r4
            java.time.LocalDateTime r1 = r4.A01
            r0 = r6
            if (r6 != 0) goto L28
            java.time.ZoneId r0 = java.time.ZoneId.systemDefault()
        L28:
            java.time.ZonedDateTime r0 = r1.atZone(r0)
            java.time.Instant r0 = r0.toInstant()
            X.C7384Etj.A0U(r0)
            boolean r0 = r5.isBefore(r0)
            if (r0 != 0) goto L4d
            java.time.LocalDateTime r0 = r4.A00
            if (r6 != 0) goto L41
            java.time.ZoneId r6 = java.time.ZoneId.systemDefault()
        L41:
            java.time.ZonedDateTime r0 = r0.atZone(r6)
            java.time.Instant r0 = r0.toInstant()
            X.C7384Etj.A0U(r0)
            goto L12
        L4d:
            return r3
        L4e:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9016Fwt.A00(X.Fx6, java.time.Instant, java.time.ZoneOffset):boolean");
    }
}
