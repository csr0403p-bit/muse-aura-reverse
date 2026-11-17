package X;

import android.content.Context;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.CDn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3313CDn extends CET {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final C3103ByQ A07;
    public final CCz A08;
    public final C3318CDx A09;
    public final CDr A0A;
    public final Map<Integer, CE8> A0B;
    public final Queue<CE8> A0C;
    public final Executor A0D;
    public final CEN A0E;
    public final CER A0F;
    public final CER A0G;
    public final CD8 A0H;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<+LX/CJN;>;)V */
    public static final void A01(C3313CDn c3313CDn) {
        synchronized (c3313CDn) {
            if (!c3313CDn.A01) {
                try {
                    c3313CDn.A0A.Aa1(new C3319CDy(c3313CDn));
                    c3313CDn.A01 = true;
                } catch (SecurityException e) {
                    CFK.A0J("GooglePlayDownloader", e, "unable to register listener");
                }
            }
        }
        synchronized (c3313CDn) {
            if (!c3313CDn.A04) {
                c3313CDn.A04 = true;
                Set<String> setAGZ = c3313CDn.A0A.AGZ();
                C7384Etj.A0U(setAGZ);
                Iterator<String> it = setAGZ.iterator();
                while (it.hasNext()) {
                    String strA0j = AnonymousClass005.A0j(it);
                    if (CCn.A00(strA0j) < 0) {
                        CFK.A07("GooglePlayDownloader", FGI.A0M("Unknown module name received from Google sessionState: ", strA0j));
                    }
                    CD1.A06.A00().A01(CD2.A04, strA0j);
                }
            }
        }
        synchronized (c3313CDn) {
            if (!c3313CDn.A05 && !c3313CDn.A03) {
                c3313CDn.A00 = true;
                c3313CDn.A03 = true;
                c3313CDn.A0D.execute(new RunnableC3317CDw(c3313CDn));
            }
        }
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r3v0 X.CDn) */
    public static final synchronized void A02(C3313CDn c3313CDn) {
        synchronized (c3313CDn) {
            Queue<CE8> queue = c3313CDn.A0C;
            queue.isEmpty();
            if (!c3313CDn.A02 && !queue.isEmpty() && !c3313CDn.A00) {
                CE8 ce8Remove = queue.remove();
                if (ce8Remove == null) {
                    throw BV4.A0U();
                }
                A00(BV4.A0t(ce8Remove.A01.A01));
                c3313CDn.A02 = true;
                A01(c3313CDn);
                c3313CDn.A0D.execute(new RunnableC3314CDo(ce8Remove, c3313CDn));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x011e, code lost:
    
        r4 = r2.get(r4);
        X.C7384Etj.A0Z(r4, X.C8j2.A00(68));
        r4 = (android.app.Activity) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012d, code lost:
    
        if (r4 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012f, code lost:
    
        r3 = r27.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0139, code lost:
    
        if (r3.Afx(r4, r28, 100) != false) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013b, code lost:
    
        r3.A5y(r1).A0A(new X.C3316CDu(r8, r27, r1), r27.A0D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014b, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0150, code lost:
    
        if (r2.getMessage() != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015c, code lost:
    
        X.C7384Etj.A0X(r2.getMessage());
     */
    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r27v0 X.CDn) */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0163 A[Catch: all -> 0x06aa, EDGE_INSN: B:348:0x0163->B:75:0x0163 BREAK  A[LOOP:1: B:57:0x00ec->B:350:?], TryCatch #8 {, blocks: (B:4:0x0003, B:6:0x000f, B:9:0x0017, B:18:0x0026, B:21:0x002e, B:22:0x0036, B:24:0x003c, B:26:0x0049, B:27:0x0054, B:20:0x002c, B:19:0x0029, B:28:0x005e, B:30:0x007b, B:31:0x0081, B:45:0x00b7, B:47:0x00c2, B:48:0x00c9, B:50:0x00d1, B:52:0x00dd, B:54:0x00e1, B:56:0x00e7, B:57:0x00ec, B:59:0x00f2, B:61:0x00f8, B:62:0x0118, B:64:0x011e, B:66:0x012f, B:68:0x013b, B:70:0x014c, B:72:0x0152, B:74:0x015c, B:75:0x0163, B:76:0x0175, B:109:0x025c, B:112:0x0267, B:77:0x0190, B:79:0x01cc, B:91:0x0209, B:93:0x020d, B:94:0x0211, B:96:0x0217, B:98:0x0226, B:100:0x022e, B:102:0x0234, B:103:0x023e, B:104:0x0244, B:105:0x024a, B:108:0x0251, B:107:0x024c, B:81:0x01d0, B:82:0x01dc, B:84:0x01e2, B:86:0x01ef, B:89:0x01f6, B:90:0x01fa, B:113:0x0268, B:115:0x0278, B:117:0x027e, B:118:0x0290, B:120:0x0296, B:125:0x02b5, B:127:0x02bf, B:128:0x02c5, B:129:0x02c9, B:131:0x02d6, B:133:0x02de, B:135:0x02ea, B:137:0x02f2, B:141:0x0309, B:143:0x030f, B:140:0x02fd, B:144:0x0316, B:145:0x0318, B:253:0x0564, B:257:0x0569, B:139:0x02f8, B:124:0x02ae, B:261:0x056f, B:262:0x0577, B:264:0x057d, B:266:0x058b, B:267:0x058f, B:269:0x0595, B:270:0x05a6, B:271:0x05b2, B:273:0x05b8, B:275:0x05c4, B:277:0x05d1, B:279:0x05d7, B:280:0x05e6, B:282:0x05f8, B:276:0x05cb, B:281:0x05e7, B:284:0x0608, B:32:0x0084, B:285:0x0625, B:287:0x0636, B:288:0x063c, B:290:0x0642, B:292:0x0652, B:293:0x065d, B:295:0x0663, B:297:0x067a, B:298:0x067e, B:300:0x0682, B:301:0x068c, B:302:0x068f, B:110:0x0261), top: B:323:0x0003, inners: #4, #10, #13, #14, #16 }] */
    /* JADX WARN: Type inference failed for: r0v150, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v209, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized void A03(X.C3313CDn r27, X.CJN r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3313CDn.A03(X.CDn, X.CJN, boolean):void");
    }

    public C3313CDn() {
    }

    public static final String A00(List<String> list) {
        StringBuilder sbA0w = C60O.A0w();
        Iterator<String> it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            if (z) {
                z = false;
            } else {
                sbA0w.append(",");
            }
            sbA0w.append(strA0j);
        }
        return sbA0w.toString();
    }

    public C3313CDn(Context context, CEN cen, CCz cCz, CD8 cd8, C3318CDx c3318CDx, Executor executor) {
        CF9 cf9;
        AnonymousClass005.A0x(context, cd8, cCz);
        C7384Etj.A0Y(executor, 4);
        this.A06 = context;
        this.A0B = BV4.A0u();
        this.A0C = BV4.A0y();
        this.A0H = cd8;
        synchronized (CEL.class) {
            cf9 = CEL.A00;
            if (cf9 == null) {
                cf9 = new CF9(context);
                CEL.A00 = cf9;
            }
        }
        this.A0A = cf9;
        this.A08 = cCz;
        this.A09 = c3318CDx;
        this.A0D = executor;
        this.A0F = CEK.A00;
        this.A0G = CEM.A00;
        this.A07 = new C3103ByQ(RealtimeSinceBootClock.A00);
        this.A0E = cen;
    }
}
