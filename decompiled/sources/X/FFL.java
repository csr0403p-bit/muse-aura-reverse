package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FFL extends AbstractC8091FSx {
    public int A00;
    public int A01;
    public RecyclerView A02;
    public List A03;
    public final FFF A04;

    public FFL() {
        this(null);
    }

    public static void A02(AbstractC8091FSx abstractC8091FSx, int i, int i2, int i3) {
        if (i != 2) {
            abstractC8091FSx.A01.A02(i2, i3);
        } else {
            abstractC8091FSx.A01.A04(i2, i3);
        }
    }

    public static C7782FEm A01(FFL ffl, int i) {
        return (C7782FEm) ffl.A03.get(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x024c, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011d, code lost:
    
        r15 = (r8.A02 - r8.A03) - (r8.A00 - r8.A01);
        r20 = X.AnonymousClass002.A1M(r15 % 2);
        r14 = -r6;
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0130, code lost:
    
        if (r5 > r6) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0132, code lost:
    
        if (r5 == r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0134, code lost:
    
        if (r5 == r6) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0140, code lost:
    
        if (r9[(r5 + 1) + r10] >= r9[(r5 - 1) + r10]) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0142, code lost:
    
        r4 = r9[(r5 + 1) + r10];
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0148, code lost:
    
        r2 = r8.A00 - ((r8.A02 - r3) - r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014f, code lost:
    
        if (r6 == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0151, code lost:
    
        r19 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0153, code lost:
    
        if (r3 == r4) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0155, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0159, code lost:
    
        if (r3 <= r8.A03) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015d, code lost:
    
        if (r2 <= r8.A01) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017f, code lost:
    
        if (((X.C7782FEm) r0.get(r3 - 1)).A01.A04 != A01(r24, r2 - 1).A01.A04) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0181, code lost:
    
        r3 = r3 - 1;
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0186, code lost:
    
        r9[r5 + r10] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018a, code lost:
    
        if (r20 == false) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018c, code lost:
    
        r0 = r15 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018e, code lost:
    
        if (r0 < r14) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0190, code lost:
    
        if (r0 > r6) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0195, code lost:
    
        if (r11[r0 + r10] < r3) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0197, code lost:
    
        r1 = new X.FFP();
        r1.A02 = r3;
        r1.A03 = r2;
        r1.A00 = r4;
        r1.A01 = r19;
        r1.A04 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a9, code lost:
    
        r5 = r5 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ac, code lost:
    
        r4 = r9[(r5 - 1) + r10];
        r3 = r4 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A05(X.FFN r25) {
        /*
            Method dump skipped, instructions count: 1335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FFL.A05(X.FFN):void");
    }

    public static FFS A00(Collection<FFS> collection, int i, boolean z) {
        FFS next;
        Iterator<FFS> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.A01 == i && next.A02 == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            FFS next2 = it.next();
            int i2 = next2.A00;
            int i3 = i2 + 1;
            if (z) {
                i3 = i2 - 1;
            }
            next2.A00 = i3;
        }
        return next;
    }

    public FFL(FFF fff) {
        this.A03 = C3cG.A0h();
        this.A04 = fff;
        if (!super.A01.A05()) {
            super.A00 = true;
            return;
        }
        throw C3cG.A0Q("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }
}
