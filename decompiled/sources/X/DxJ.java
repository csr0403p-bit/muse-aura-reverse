package X;

import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public final class DxJ implements InterfaceC6224DyF {
    public static final DxJ A0B = new DxJ();
    public AbstractC6211Dxx A01;
    public Boolean A02;
    public volatile ExecutorService A08;
    public volatile Map<String, Set<InterfaceC6181DxP>> A07 = BV4.A0u();
    public final C6176DxK A05 = new C6176DxK(this);
    public int A00 = 0;
    public volatile long A06 = -1;
    public volatile boolean A0A = false;
    public volatile boolean A09 = false;
    public final Set<String> A04 = ConcurrentHashMap.newKeySet();
    public final Set<String> A03 = ConcurrentHashMap.newKeySet();

    /* JADX WARN: Incorrect types in method signature: (ZLjava/lang/String;)Ljava/util/LinkedList<LX/DxP;>; */
    private LinkedList A00(String str, boolean z) {
        LinkedList linkedListA0y = null;
        if (str == null) {
            return null;
        }
        synchronized (this) {
            Iterator itA0n = AnonymousClass002.A0n(this.A07);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                if (z == AnonymousClass002.A1L(str.equals(C60O.A0t(entryA0l)) ? 1 : 0)) {
                    Set set = (Set) entryA0l.getValue();
                    if (!set.isEmpty()) {
                        if (linkedListA0y == null) {
                            linkedListA0y = BV4.A0y();
                        }
                        linkedListA0y.addAll(set);
                        this.A00 -= set.size();
                    }
                    itA0n.remove();
                }
            }
        }
        return linkedListA0y;
    }

    public static InterfaceC6181DxP A01(Set set, DxJ dxJ) {
        dxJ.A00--;
        Iterator it = set.iterator();
        InterfaceC6181DxP interfaceC6181DxP = (InterfaceC6181DxP) it.next();
        it.remove();
        return interfaceC6181DxP;
    }

    public static boolean A04(C6175DxI c6175DxI, String str, DxJ dxJ, boolean z, boolean z2) {
        if (z2 || !c6175DxI.A0W) {
            return false;
        }
        if (z ? dxJ.A0A : dxJ.A09) {
            return false;
        }
        if (c6175DxI.A0X) {
            if ((z ? dxJ.A04 : dxJ.A03).contains(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A05(C6175DxI c6175DxI, DxJ dxJ, boolean z) {
        if (!c6175DxI.A0L || dxJ.A06 == -1 || SystemClock.elapsedRealtime() - dxJ.A06 <= 5000) {
            if (z) {
                return c6175DxI.A0a;
            }
            if (c6175DxI.A0Y) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC6224DyF
    public final /* synthetic */ InterfaceC6181DxP A2x(MediaFormat mediaFormat, Surface surface, AbstractC6211Dxx abstractC6211Dxx, C6175DxI c6175DxI, Integer num, String str, boolean z) {
        return A2w(abstractC6211Dxx, c6175DxI, num, str, z);
    }

    public static void A02(LinkedList<InterfaceC6181DxP> linkedList) {
        if (linkedList != null) {
            Iterator<InterfaceC6181DxP> it = linkedList.iterator();
            while (it.hasNext()) {
                InterfaceC6181DxP next = it.next();
                try {
                    try {
                        next.stop();
                        next.release();
                    } catch (Throwable th) {
                        next.release();
                        throw th;
                    }
                } catch (Exception unused) {
                }
            }
            linkedList.clear();
        }
    }

    private void A03(final LinkedList<InterfaceC6181DxP> linkedList, boolean z) {
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        if (!z) {
            A02(linkedList);
            return;
        }
        ExecutorService executorService = this.A08;
        if (executorService == null) {
            synchronized (this) {
                if (this.A08 == null) {
                    this.A08 = Executors.newSingleThreadExecutor();
                }
                executorService = this.A08;
            }
        }
        executorService.execute(new Runnable() { // from class: X.Dz7
            public static final String __redex_internal_original_name = "MediaCodecPoolV1$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                DxJ.A02(linkedList);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ad A[Catch: all -> 0x01f1, TryCatch #0 {, blocks: (B:130:0x0153, B:133:0x015a, B:138:0x0164, B:139:0x0166, B:137:0x0161, B:146:0x0175, B:145:0x0172, B:147:0x0177, B:149:0x017f, B:155:0x018d, B:154:0x018a, B:156:0x018f, B:159:0x0199, B:164:0x01a3, B:165:0x01a9, B:167:0x01ad, B:168:0x01af, B:187:0x01e8, B:160:0x019c, B:171:0x01bb, B:173:0x01c0, B:172:0x01be, B:131:0x0156, B:176:0x01c6, B:178:0x01ce, B:180:0x01d4, B:182:0x01dc, B:183:0x01de, B:184:0x01e5), top: B:238:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0259 A[Catch: MediaCodecUtil$DecoderQueryException -> 0x025b, TRY_LEAVE, TryCatch #1 {MediaCodecUtil$DecoderQueryException -> 0x025b, blocks: (B:223:0x0251, B:225:0x0259), top: B:239:0x0251 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x027c A[Catch: Exception -> 0x0286, TryCatch #7 {Exception -> 0x0286, blocks: (B:228:0x0264, B:230:0x027c, B:231:0x027e), top: B:250:0x0264 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    @Override // X.InterfaceC6224DyF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC6181DxP A2w(X.AbstractC6211Dxx r16, X.C6175DxI r17, java.lang.Integer r18, java.lang.String r19, boolean r20) throws com.facebook.video.heroplayer.exocustom.MediaCodecInitializationException {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DxJ.A2w(X.Dxx, X.DxI, java.lang.Integer, java.lang.String, boolean):X.DxP");
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0178, code lost:
    
        if (r2.size() >= r12.A03) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x017a, code lost:
    
        r2.add(r15);
        r10.A00++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0094, code lost:
    
        if (r12.A0Y != false) goto L47;
     */
    @Override // X.InterfaceC6224DyF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AaD(X.AbstractC6211Dxx r11, X.C6175DxI r12, java.lang.Integer r13, java.lang.String r14, X.InterfaceC6181DxP r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DxJ.AaD(X.Dxx, X.DxI, java.lang.Integer, java.lang.String, X.DxP, boolean):void");
    }
}
