package X;

import android.os.Bundle;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.List;

/* renamed from: X.Ant, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1668Ant extends FRa {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat A00;

    @Override // X.FRa
    public final C2197BAc A04(int i) {
        int i2;
        if (i == 1) {
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
            Ab1 ab1 = AndroidComposeViewAccessibilityDelegateCompat.A0b;
            i2 = androidComposeViewAccessibilityDelegateCompat.A02;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
        } else {
            if (i != 2) {
                throw C60O.A0i(FGI.A0H("Unknown focus type: ", i));
            }
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this.A00;
            Ab1 ab12 = AndroidComposeViewAccessibilityDelegateCompat.A0b;
            i2 = androidComposeViewAccessibilityDelegateCompat2.A01;
        }
        return A03(i2);
    }

    public C1668Ant(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.A00 = androidComposeViewAccessibilityDelegateCompat;
    }

    public static void A00(C2197BAc c2197BAc, CharSequence charSequence, int i) {
        c2197BAc.A05(new C2203BAi(i, charSequence));
    }

    /* JADX WARN: Code restructure failed: missing block: B:397:0x0858, code lost:
    
        r3.setMovementGranularities(r3.getMovementGranularities() | 20);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0890 A[PHI: r29
  0x0890: PHI (r29v2 X.ApQ) = (r29v1 X.ApQ), (r29v3 X.ApQ) binds: [B:82:0x01d8, B:84:0x01dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0bcd  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0c01  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0c06  */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    @Override // X.FRa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2197BAc A03(int r41) {
        /*
            Method dump skipped, instructions count: 3137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1668Ant.A03(int):X.BAc");
    }

    @Override // X.FRa
    public final void A05(Bundle bundle, C2197BAc c2197BAc, String str, int i) {
        AndroidComposeViewAccessibilityDelegateCompat.A0D(bundle, this.A00, c2197BAc, str, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0452, code lost:
    
        if (r5 != false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f5, code lost:
    
        if (r3 != null) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ae A[PHI: r11
  0x01ae: PHI (r11v4 boolean) = (r11v3 boolean), (r11v3 boolean), (r11v3 boolean), (r11v5 boolean) binds: [B:105:0x0161, B:106:0x0163, B:103:0x0151, B:100:0x014c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:422:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0125 A[PHI: r4 r16
  0x0125: PHI (r4v31 boolean) = (r4v5 boolean), (r4v32 boolean) binds: [B:80:0x011b, B:82:0x0123] A[DONT_GENERATE, DONT_INLINE]
  0x0125: PHI (r16v7 boolean) = (r16v2 boolean), (r16v8 boolean) binds: [B:80:0x011b, B:82:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012c A[PHI: r4 r15 r16
  0x012c: PHI (r4v6 boolean) = (r4v31 boolean), (r4v32 boolean) binds: [B:84:0x012a, B:82:0x0123] A[DONT_GENERATE, DONT_INLINE]
  0x012c: PHI (r15v3 boolean) = (r15v7 boolean), (r15v8 boolean) binds: [B:84:0x012a, B:82:0x0123] A[DONT_GENERATE, DONT_INLINE]
  0x012c: PHI (r16v3 boolean) = (r16v7 boolean), (r16v8 boolean) binds: [B:84:0x012a, B:82:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0133 A[PHI: r4 r14 r15 r16
  0x0133: PHI (r4v30 boolean) = (r4v6 boolean), (r4v31 boolean) binds: [B:86:0x0131, B:84:0x012a] A[DONT_GENERATE, DONT_INLINE]
  0x0133: PHI (r14v5 boolean) = (r14v2 boolean), (r14v6 boolean) binds: [B:86:0x0131, B:84:0x012a] A[DONT_GENERATE, DONT_INLINE]
  0x0133: PHI (r15v6 boolean) = (r15v3 boolean), (r15v7 boolean) binds: [B:86:0x0131, B:84:0x012a] A[DONT_GENERATE, DONT_INLINE]
  0x0133: PHI (r16v6 boolean) = (r16v3 boolean), (r16v7 boolean) binds: [B:86:0x0131, B:84:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013a A[PHI: r4 r13 r14 r15 r16
  0x013a: PHI (r4v29 boolean) = (r4v6 boolean), (r4v30 boolean) binds: [B:86:0x0131, B:88:0x0138] A[DONT_GENERATE, DONT_INLINE]
  0x013a: PHI (r13v13 boolean) = (r13v11 boolean), (r13v14 boolean) binds: [B:86:0x0131, B:88:0x0138] A[DONT_GENERATE, DONT_INLINE]
  0x013a: PHI (r14v4 boolean) = (r14v2 boolean), (r14v5 boolean) binds: [B:86:0x0131, B:88:0x0138] A[DONT_GENERATE, DONT_INLINE]
  0x013a: PHI (r15v5 boolean) = (r15v3 boolean), (r15v6 boolean) binds: [B:86:0x0131, B:88:0x0138] A[DONT_GENERATE, DONT_INLINE]
  0x013a: PHI (r16v5 boolean) = (r16v3 boolean), (r16v6 boolean) binds: [B:86:0x0131, B:88:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0144  */
    /* JADX WARN: Type inference failed for: r0v216, types: [X.ApQ] */
    @Override // X.FRa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A06(int r15, int r16, android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 1708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1668Ant.A06(int, int, android.os.Bundle):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.AGi] */
    public static final boolean A01(List<C1562Alc> list) {
        ?? A0h;
        Object objA0F;
        if (list.size() >= 2) {
            if (list.size() <= 1) {
                A0h = C0881AGi.A00;
            } else {
                A0h = C3cG.A0h();
                C1562Alc c1562Alc = list.get(0);
                int iA00 = C60O.A00(list);
                int i = 0;
                while (i < iA00) {
                    i++;
                    C1562Alc c1562Alc2 = list.get(i);
                    C1562Alc c1562Alc3 = c1562Alc2;
                    C1562Alc c1562Alc4 = c1562Alc;
                    A0h.add(AWx.A0B(AnonymousClass005.A0L(C8j3.A01(AnonymousClass001.A00(c1562Alc4.A05().A00()), AnonymousClass001.A00(c1562Alc3.A05().A00())), C8j3.A01(AnonymousClass001.A01(c1562Alc4.A05().A00(), 4294967295L), AnonymousClass001.A01(c1562Alc3.A05().A00(), 4294967295L)))));
                    c1562Alc = c1562Alc2;
                }
            }
            if (A0h.size() == 1) {
                objA0F = AbstractC0878AGe.A0F(A0h);
            } else {
                if (A0h.isEmpty()) {
                    throw C8j3.A18(AnonymousClass000.A00(11));
                }
                objA0F = AbstractC0878AGe.A0F(A0h);
                int iA002 = C60O.A00(A0h);
                if (1 <= iA002) {
                    int i2 = 1;
                    while (true) {
                        objA0F = AWx.A0B(AWx.A05(((AWx) objA0F).A00, AWx.A09(A0h, i2)));
                        if (i2 == iA002) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            long j = ((AWx) objA0F).A00;
            if (AnonymousClass001.A01(4294967295L, j) >= AnonymousClass001.A00(j)) {
                return false;
            }
        }
        return true;
    }
}
