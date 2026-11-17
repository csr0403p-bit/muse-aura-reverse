package X;

import java.util.List;

/* renamed from: X.AQm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1028AQm implements InterfaceC1380AiA {
    public final C0995ANh<?> A00;

    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad A[PHI: r8
  0x00ad: PHI (r8v3 int) = (r8v1 int), (r8v4 int) binds: [B:41:0x00ab, B:60:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1380AiA
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1134Abi mo7measure3p2s80s(X.AXY r18, java.util.List<? extends X.C3TG> r19, long r20) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1028AQm.mo7measure3p2s80s(X.AXY, java.util.List, long):X.Abi");
    }

    public C1028AQm(C0995ANh<?> c0995ANh) {
        this.A00 = c0995ANh;
    }

    @Override // X.InterfaceC1380AiA
    public final int maxIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(C8j4.A0a(list, 0).AQM(i));
        int iA00 = C60O.A00(list);
        int i2 = 1;
        if (1 <= iA00) {
            while (true) {
                Integer numValueOf2 = Integer.valueOf(C8j4.A0a(list, i2).AQM(i));
                if (numValueOf2.compareTo(numValueOf) > 0) {
                    numValueOf = numValueOf2;
                }
                if (i2 == iA00) {
                    break;
                }
                i2++;
            }
        }
        return numValueOf.intValue();
    }

    @Override // X.InterfaceC1380AiA
    public final int maxIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(C8j4.A0a(list, 0).AQO(i));
        int iA00 = C60O.A00(list);
        int i2 = 1;
        if (1 <= iA00) {
            while (true) {
                Integer numValueOf2 = Integer.valueOf(C8j4.A0a(list, i2).AQO(i));
                if (numValueOf2.compareTo(numValueOf) > 0) {
                    numValueOf = numValueOf2;
                }
                if (i2 == iA00) {
                    break;
                }
                i2++;
            }
        }
        return numValueOf.intValue();
    }

    @Override // X.InterfaceC1380AiA
    public final int minIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(C8j4.A0a(list, 0).AQo(i));
        int iA00 = C60O.A00(list);
        int i2 = 1;
        if (1 <= iA00) {
            while (true) {
                Integer numValueOf2 = Integer.valueOf(C8j4.A0a(list, i2).AQo(i));
                if (numValueOf2.compareTo(numValueOf) > 0) {
                    numValueOf = numValueOf2;
                }
                if (i2 == iA00) {
                    break;
                }
                i2++;
            }
        }
        return numValueOf.intValue();
    }

    @Override // X.InterfaceC1380AiA
    public final int minIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(C8j4.A0a(list, 0).AQq(i));
        int iA00 = C60O.A00(list);
        int i2 = 1;
        if (1 <= iA00) {
            while (true) {
                Integer numValueOf2 = Integer.valueOf(C8j4.A0a(list, i2).AQq(i));
                if (numValueOf2.compareTo(numValueOf) > 0) {
                    numValueOf = numValueOf2;
                }
                if (i2 == iA00) {
                    break;
                }
                i2++;
            }
        }
        return numValueOf.intValue();
    }
}
