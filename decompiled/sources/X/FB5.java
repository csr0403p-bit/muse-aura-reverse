package X;

import com.facebook.aura.bloks.coreplugins.AuraBloksCorePlugins;
import java.util.List;

/* loaded from: classes6.dex */
public final class FB5 {
    public static final FB5 A00 = new FB5();

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.FDW r4, X.FB8 r5, int r6) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r4, r0)
            X.FDy<java.lang.Integer> r3 = X.AbstractC7752FDe.A01
            java.lang.Object r2 = r3.A01()
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L15
            int r0 = r2.intValue()
            r1 = 0
            if (r0 == r6) goto L1d
        L15:
            r1 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r3.A02(r0)
        L1d:
            X.FB5 r0 = X.FB5.A00     // Catch: java.lang.Throwable -> L28
            r0.A01(r4, r5)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L27
            r3.A02(r2)
        L27:
            return
        L28:
            r0 = move-exception
            if (r1 == 0) goto L2e
            r3.A02(r2)
        L2e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FB5.A00(X.FDW, X.FB8, int):void");
    }

    private final boolean A01(FDW fdw, FB8 fb8) {
        if (!fb8.AiJ(fdw)) {
            FAP fap = AuraBloksCorePlugins.CHILD_ATTRIBUTE_MAPPER;
            C7384Etj.A0U(fap);
            int i = fdw.A05;
            for (int i2 : fap.getSubNodes(i)) {
                FDW fdwA0C = fdw.A0C(i2);
                if (fdwA0C == null || !A01(fdwA0C, fb8)) {
                }
            }
            int[] pluralSubNodes = fap.getPluralSubNodes(i);
            C7384Etj.A0U(pluralSubNodes);
            for (int i3 : pluralSubNodes) {
                List<FDW> listA0I = fdw.A0I(i3);
                if (listA0I != null) {
                    int size = listA0I.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        FDW fdwA0z = AbstractC7607F5u.A0z(listA0I, i4);
                        if (fdwA0z != null && A00.A01(fdwA0z, fb8)) {
                            return true;
                        }
                    }
                }
            }
            for (int i5 : FA7.A02(i)) {
                List<?> listA01 = FA7.A01(fdw, i5, true);
                if (listA01 != null) {
                    int size2 = listA01.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        FDW fdwA00 = FA7.A00(listA01, i6, true);
                        if (fdwA00 != null && A00.A01(fdwA00, fb8)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
