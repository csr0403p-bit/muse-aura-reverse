package androidx.room;

import X.BLG;
import X.C3cG;

/* loaded from: classes3.dex */
public final class ObservedTableVersions {
    public final BLG<int[]> A00;

    /* JADX WARN: Incorrect types in method signature: (LX/20Z<-[I>;LX/HtJ<*>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC10460Hji A00(X.HtJ r6, X.C20Z r7) {
        /*
            r5 = this;
            r3 = 4
            boolean r0 = r6 instanceof X.C8iO
            if (r0 == 0) goto L27
            r4 = r6
            X.8iO r4 = (X.C8iO) r4
            int r0 = r4.$t
            if (r0 != r3) goto L27
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r3 = r4.A01
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 == r1) goto L3b
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L27:
            X.8iO r4 = new X.8iO
            r4.<init>(r5, r6, r3)
            goto L17
        L2d:
            X.Hwg.A00(r3)
            X.BLG<int[]> r0 = r5.A00
            r4.A00 = r1
            java.lang.Object r0 = r0.collect(r7, r4)
            if (r0 != r2) goto L3e
            return r2
        L3b:
            X.Hwg.A00(r3)
        L3e:
            kotlin.KotlinNothingValueException r0 = X.C3cG.A0p()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.ObservedTableVersions.A00(X.HtJ, X.20Z):X.Hji");
    }

    public ObservedTableVersions(int i) {
        this.A00 = C3cG.A14(new int[i]);
    }
}
