package X;

import android.text.Layout;
import android.text.TextPaint;
import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: X.Arx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1833Arx implements InterfaceC1841AsE {
    public As3 A00;
    public final int A01;
    public final C1822Arm A02;
    public final Av1 A03;
    public final C2K7 A04;
    public final C1779Aqf A05;
    public final CharSequence A06;
    public final AXN A07;
    public final String A08;
    public final List<C1733ApU<? extends C1OS>> A09;
    public final List<C1733ApU<C1821Arl>> A0A;
    public final boolean A0B;

    public static final float A00(AXN axn, float f, long j) {
        if (j == C1809ArT.A01) {
            return f;
        }
        long jA01 = C1809ArT.A01(j);
        if (jA01 == LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
            return axn.Ah3(j);
        }
        if (jA01 == 8589934592L) {
            return C1809ArT.A00(j) * f;
        }
        return Float.NaN;
    }

    @Override // X.InterfaceC1841AsE
    public final boolean AG7() {
        C1831Arv c1831Arv;
        C1830Aru c1830Aru;
        As3 as3 = this.A00;
        if (as3 != null && as3.A00()) {
            return true;
        }
        if (!this.A0B && ((c1831Arv = this.A02.A01) == null || (c1830Aru = c1831Arv.A00) == null || c1830Aru.A00 != 1)) {
            BEC bec = (BEC) AbstractC1846AsJ.A00;
            C1BO c1boA00 = bec.A00;
            if (c1boA00 == null) {
                if (E9X.A08 != null) {
                    c1boA00 = BEC.A00(bec);
                    bec.A00 = c1boA00;
                } else {
                    c1boA00 = BEF.A00;
                }
            }
            if (((Boolean) c1boA00.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1841AsE
    public final float AHR() {
        return this.A03.A01();
    }

    @Override // X.InterfaceC1841AsE
    public final float AHj() {
        float desiredWidth;
        Av1 av1 = this.A03;
        float f = av1.A00;
        if (!Float.isNaN(f)) {
            return f;
        }
        TextPaint textPaint = av1.A06;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = av1.A07;
        lineInstance.setText(new As1(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, AbstractC1842AsF.A00);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new ADq(i, next));
            } else {
                C0968AJv c0968AJv = (C0968AJv) priorityQueue.peek();
                if (c0968AJv != null && c0968AJv.A01 - c0968AJv.A00 < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new ADq(i, next));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            desiredWidth = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw C8j3.A1D();
            }
            C0968AJv c0968AJv2 = (C0968AJv) it.next();
            desiredWidth = Layout.getDesiredWidth(Av1.A00(av1), c0968AJv2.A00, c0968AJv2.A01, textPaint);
            while (it.hasNext()) {
                C0968AJv c0968AJv3 = (C0968AJv) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(Av1.A00(av1), c0968AJv3.A00, c0968AJv3.A01, textPaint));
            }
        }
        av1.A00 = desiredWidth;
        return desiredWidth;
    }

    public static final float A01(AXN axn, float f, long j) {
        float fA00;
        long jA01 = C1809ArT.A01(j);
        if (jA01 == LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
            if (axn.AFo() <= 1.05d) {
                return axn.Ah3(j);
            }
            fA00 = C1809ArT.A00(j) / C1809ArT.A00(axn.Ah8(f));
        } else {
            if (jA01 != 8589934592L) {
                return Float.NaN;
            }
            fA00 = C1809ArT.A00(j);
        }
        return fA00 * f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        r19 = false;
     */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/Arm;Ljava/util/List<+LX/ApU<+LX/1OS;>;>;Ljava/util/List<LX/ApU<LX/Arl;>;>;LX/2K7;LX/AXN;)V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0294 A[PHI: r5
  0x0294: PHI (r5v4 long) = (r5v3 long), (r5v27 long) binds: [B:128:0x0259, B:140:0x0292] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x00a8 A[EDGE_INSN: B:428:0x00a8->B:32:0x00a8 BREAK  A[LOOP:0: B:27:0x0095->B:61:0x0137], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01aa  */
    /* JADX WARN: Type inference failed for: r0v117 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v52, types: [android.text.Spannable, android.text.Spanned, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v73, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1833Arx(X.C1822Arm r47, X.C2K7 r48, X.AXN r49, java.lang.String r50, java.util.List r51, java.util.List r52) {
        /*
            Method dump skipped, instructions count: 2204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1833Arx.<init>(X.Arm, X.2K7, X.AXN, java.lang.String, java.util.List, java.util.List):void");
    }
}
