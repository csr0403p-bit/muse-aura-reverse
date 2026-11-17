package X;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.media3.common.util.Util;
import com.facebook.acra.util.JavaProcFileReader;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.DiL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5425DiL implements InterfaceC5541DkJ {
    public static HashMap<String, Integer> A11 = BV4.A0u();
    public int A03;
    public InterfaceC5441Dic A0D;
    public C5437DiY A0E;
    public C5580Dky A0F;
    public IOException A0G;
    public IOException A0H;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0T;
    public AbstractC5411Di6 A0U;
    public C5092DXa A0V;
    public C5596Dlb A0W;
    public C5526Dk2 A0X;
    public boolean A0Z;
    public final int A0a;
    public final long A0b;
    public final CXB A0c;
    public final C6013Dtw A0d;
    public final DhA A0e;
    public final C5534DkB A0f;
    public final C5353Dgw A0g;
    public final DEY A0h;
    public final C5423DiJ A0i;
    public final C5477DjE A0j;
    public final C6061Duw A0k;
    public final C5527Dk3 A0l;
    public final DhS A0m;
    public final C5375DhR A0n;
    public final C5366DhI A0o;
    public final AtomicBoolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final boolean A0v;
    public final C5432DiT[] A0w;
    public final int[] A0x;
    public final int A0y;
    public final C1J A0z;
    public final C5442Did A10;
    public final Map<String, C5432DiT> A0p = BV4.A0u();
    public long A07 = -9223372036854775807L;
    public long A05 = -9223372036854775807L;
    public long A0C = 0;
    public int A04 = 0;
    public long A0A = -9223372036854775807L;
    public int A00 = 0;
    public long A0B = 0;
    public boolean A0N = false;
    public HashMap<Long, Long> A0I = BV4.A0u();
    public int A01 = -1;
    public int A02 = 0;
    public boolean A0S = false;
    public long A09 = 0;
    public long A08 = 0;
    public boolean A0Y = false;
    public long A06 = 0;

    public static C1O A03(C4890DDe c4890DDe, C5325DgJ c5325DgJ, AbstractC5553DkW abstractC5553DkW, String str, int i) {
        Map map = Collections.EMPTY_MAP;
        String str2 = c5325DgJ.A03;
        Uri uri = Uri.parse(C0F.A01(str, str2));
        long j = c5325DgJ.A02;
        long j2 = c5325DgJ.A01;
        String strA04 = abstractC5553DkW.A04();
        if (strA04 == null) {
            strA04 = Uri.parse(C0F.A01(((C5376DhT) C8j4.A0p(abstractC5553DkW.A05)).A03, str2)).toString();
        }
        C1G.A04(uri);
        return new C1O(uri, c4890DDe, strA04, map, null, 1, i, 0L, j, j2);
    }

    public final long A0C(AbstractC5415DiB abstractC5415DiB, C5432DiT c5432DiT, long j) {
        long jA00;
        long jValueOf;
        Pair pairCreate;
        int i;
        Pair pairA02 = A02(c5432DiT, this);
        long jA05 = C3cG.A05(pairA02.first);
        Long l = (Long) pairA02.second;
        long jLongValue = l.longValue();
        boolean z = false;
        if (abstractC5415DiB != null) {
            jA00 = abstractC5415DiB.A00();
            if (jA00 < jA05) {
                if (this.A0J) {
                    jA00 = jA05;
                } else {
                    jValueOf = -1L;
                    pairCreate = Pair.create(jValueOf, false);
                }
            }
            return C3cG.A05(pairCreate.first);
        }
        jA00 = Math.max(jA05, A01(c5432DiT, j, jLongValue));
        if (this.A0i.A0P.enableStartFromCache) {
            long jA002 = A00(c5432DiT, jA00);
            this.A09 = jA00;
            this.A08 = jA002;
            if (jA002 > jA00) {
                this.A0S = true;
            } else {
                jA002 = jA00;
            }
            jA00 = jA002;
        }
        C6061Duw c6061Duw = this.A0k;
        if (c6061Duw != null && c6061Duw.A00) {
            C5423DiJ c5423DiJ = this.A0i;
            if (!c5423DiJ.A17 || this.A0F.A0S) {
                int i2 = c5423DiJ.A05;
                if (i2 > 0 && (i = c5423DiJ.A06) > 0) {
                    long jA04 = c5432DiT.A04(jLongValue) - (i2 * 1000);
                    long jMax = Math.max(jA05, A01(c5432DiT, jA04 - (i * 1000), jLongValue));
                    if (jA00 < jMax && (!c5423DiJ.A13 || this.A0R)) {
                        jA00 = Math.max(jMax, A01(c5432DiT, jA04, jLongValue));
                        StringBuilder sbA0z = C60O.A0z("Range: ", jA05);
                        sbA0z.append(JavaProcFileReader.LS_SYMLINK_ARROW);
                        sbA0z.append(jLongValue);
                        sbA0z.append(", jumping to segment: ");
                        sbA0z.append(jA00);
                        sbA0z.append(" for latency: ");
                        sbA0z.append(i2);
                        Log.d("DefaultDashChunkSource", C60P.A1O(" tolerance: ", sbA0z, i));
                    }
                } else if (this.A0F.A0T) {
                    long j2 = jLongValue - 10;
                    if (jA00 < j2) {
                        BV6.A1K("Using latest %d segments from total of %d segments", "DefaultDashChunkSource", new Object[]{10, l});
                        jA00 = j2;
                        z = true;
                    }
                }
                pairCreate = Pair.create(Long.valueOf(jA00), Boolean.valueOf(z));
                return C3cG.A05(pairCreate.first);
            }
        }
        jValueOf = Long.valueOf(jA00);
        pairCreate = Pair.create(jValueOf, false);
        return C3cG.A05(pairCreate.first);
    }

    public static final Pair A02(C5432DiT c5432DiT, C5425DiL c5425DiL) {
        long jA05;
        DhD dhD = c5432DiT.A02;
        long jAFg = dhD.AFg() + c5432DiT.A01;
        long jAK9 = dhD.AK9(c5432DiT.A00);
        if (jAK9 == -1) {
            long j = c5425DiL.A0b;
            long jElapsedRealtime = j != 0 ? SystemClock.elapsedRealtime() + j : System.currentTimeMillis();
            C5580Dky c5580Dky = c5425DiL.A0F;
            long j2 = c5580Dky.A05;
            UUID uuid = AbstractC5400Dhr.A04;
            long jA0A = ((jElapsedRealtime * 1000) - Util.A0A(j2)) - Util.A0A(c5580Dky.A0R.get(c5425DiL.A03).A00);
            long j3 = c5425DiL.A0F.A0F;
            if (j3 != -9223372036854775807L) {
                jAFg = Math.max(jAFg, c5432DiT.A05(jA0A - Util.A0A(j3)));
            }
            jA05 = c5432DiT.A05(jA0A);
        } else {
            jA05 = jAK9 + jAFg;
        }
        return BV4.A0A(Long.valueOf(jAFg), Long.valueOf(jA05 - 1));
    }

    private final C5432DiT A04(int i) {
        C5432DiT[] c5432DiTArr = this.A0w;
        C5432DiT c5432DiT = c5432DiTArr[i];
        C5376DhT c5376DhTA02 = this.A0m.A02(c5432DiT.A03.A05);
        if (c5376DhTA02 == null || c5376DhTA02.equals(c5432DiT.A07)) {
            return c5432DiT;
        }
        long j = c5432DiT.A04;
        long j2 = c5432DiT.A00;
        AbstractC5553DkW abstractC5553DkW = c5432DiT.A03;
        InterfaceC5417DiD interfaceC5417DiD = c5432DiT.A05;
        long j3 = c5432DiT.A01;
        C5432DiT c5432DiT2 = new C5432DiT(interfaceC5417DiD, c5432DiT.A06, c5432DiT.A02, c5376DhTA02, abstractC5553DkW, j, j2, j3, c5432DiT.A08);
        c5432DiTArr[i] = c5432DiT2;
        return c5432DiT2;
    }

    public static void A08(C1O c1o, AbstractC5553DkW abstractC5553DkW, long j) {
        int i;
        List<C5525Dk1> list;
        C4890DDe c4890DDeA00 = C4890DDe.A00(c1o);
        long j2 = c1o.A04;
        if (j2 >= 0) {
            long j3 = c1o.A03;
            if (j3 <= 0 || j3 - 1 > LinkEncryptedPairingKt.LINK_COUNTER_MAX - j2 || (i = c4890DDeA00.A0D) < 0) {
                return;
            }
            long j4 = i;
            if (j > j4) {
                long j5 = (j2 + j3) - 1;
                C5525Dk1 c5525Dk1 = new C5525Dk1(j5, j);
                ArrayList arrayListA0h = C3cG.A0h();
                if (abstractC5553DkW instanceof Dl7) {
                    Dl7 dl7 = (Dl7) abstractC5553DkW;
                    List<C5589DlM> list2 = dl7.A05;
                    ArrayList arrayListA11 = C60O.A11(list2.size() + 2);
                    arrayListA11.add(new C5525Dk1(dl7.A02, dl7.A01));
                    for (C5589DlM c5589DlM : list2) {
                        arrayListA11.add(new C5525Dk1(c5589DlM.A01, c5589DlM.A00));
                    }
                    arrayListA11.add(new C5525Dk1(dl7.A04, dl7.A03));
                    list = arrayListA11;
                } else {
                    list = Collections.EMPTY_LIST;
                }
                for (C5525Dk1 c5525Dk12 : list) {
                    long j6 = c5525Dk12.A01;
                    if (j6 >= j2 && j6 <= j5) {
                        long j7 = c5525Dk12.A00;
                        if (j7 > j4 && j7 <= j) {
                            arrayListA0h.add(c5525Dk12);
                        }
                    }
                }
                arrayListA0h.add(c5525Dk1);
                C7572F4l.A00(32, arrayListA0h);
                ArrayList arrayListA0h2 = C3cG.A0h();
                long j8 = j2 - 1;
                long j9 = j4;
                Iterator it = arrayListA0h.iterator();
                while (it.hasNext()) {
                    C5525Dk1 c5525Dk13 = (C5525Dk1) it.next();
                    long j10 = c5525Dk13.A01;
                    if (j10 != j8 || c5525Dk13.A00 != j9) {
                        if (j10 > j8) {
                            long j11 = c5525Dk13.A00;
                            if (j11 > j9) {
                                arrayListA0h2.add(c5525Dk13);
                                j8 = j10;
                                j9 = j11;
                            }
                        }
                        arrayListA0h2.clear();
                        arrayListA0h2.add(c5525Dk1);
                        break;
                    }
                }
                if (arrayListA0h2.isEmpty()) {
                    return;
                }
                long[] jArr = new long[arrayListA0h2.size()];
                long[] jArr2 = new long[arrayListA0h2.size()];
                for (int i2 = 0; i2 < arrayListA0h2.size(); i2++) {
                    C5525Dk1 c5525Dk14 = (C5525Dk1) arrayListA0h2.get(i2);
                    jArr[i2] = c5525Dk14.A01;
                    jArr2[i2] = c5525Dk14.A00;
                }
                c4890DDeA00.A00 = new C4893DDm(jArr, jArr2, j2, j4);
            }
        }
    }

    public static final void A0A(C5425DiL c5425DiL, HashMap map) {
        C5582Dl1 c5582Dl1;
        C6154Dwx c6154Dwx;
        String str;
        C5580Dky c5580Dky = c5425DiL.A0F;
        if (c5580Dky == null) {
            map.put("manifest", HatchCcvLoggingKt.NO_POSTAL_FIELD);
            return;
        }
        HashMap mapA0u = BV4.A0u();
        HashMap mapA0u2 = BV4.A0u();
        HashMap mapA0u3 = BV4.A0u();
        map.put("manifest_type", c5580Dky.A0S ? "dynamic" : "static");
        for (int i = 0; i < C5580Dky.A00(c5425DiL.A0F); i++) {
            Iterator itA05 = C5580Dky.A05(c5425DiL.A0F, i);
            while (itA05.hasNext()) {
                Iterator itA02 = Dl9.A02(BV6.A0b(itA05));
                while (itA02.hasNext()) {
                    AbstractC5553DkW abstractC5553DkWA0d = BV6.A0d(itA02);
                    if ((abstractC5553DkWA0d instanceof C5582Dl1) && (str = (c6154Dwx = (c5582Dl1 = (C5582Dl1) abstractC5553DkWA0d).A03).A0Y) != null) {
                        Dl3 dl3 = c5582Dl1.A00;
                        C8j4.A1O(str, mapA0u, ((dl3 instanceof Dl0) && c5582Dl1.A07()) ? ((Dl0) dl3).A00.A00 : -1);
                        C8j4.A1O(str, mapA0u2, c6154Dwx.A05);
                        C8j4.A1O(str, mapA0u3, Dl5.A00(c6154Dwx).A02);
                    }
                }
            }
        }
        map.put("end_numbers", mapA0u);
        map.put("bitrates", mapA0u2);
        map.put("max_bandwidths", mapA0u3);
    }

    public static final boolean A0B(C5432DiT c5432DiT, C5425DiL c5425DiL, long j) {
        DEV dev;
        boolean z;
        C5527Dk3 c5527Dk3 = c5425DiL.A0l;
        C5534DkB c5534DkB = c5425DiL.A0f;
        try {
            C5325DgJ c5325DgJAKC = c5432DiT.A02.AKC(j - c5432DiT.A01);
            if (c5325DgJAKC != null) {
                String str = c5527Dk3.A01;
                Uri uri = Uri.parse(C0F.A01(c5432DiT.A07.A03, c5325DgJAKC.A03));
                boolean zA1a = AnonymousClass002.A1a(str, uri);
                DE9 de9 = c5534DkB.A00;
                if (de9 == null || (dev = (DEV) de9.A00) == null) {
                    dev = DE0.A0G;
                }
                DEV dev2 = DE0.A0G;
                DEC dec = new DEC(uri, str, 0, 0);
                synchronized (dev) {
                    z = dev.A00(dec) != null;
                }
                if (z) {
                    return zA1a;
                }
            }
        } catch (IndexOutOfBoundsException unused) {
        }
        return false;
    }

    public final ArrayList<AbstractC5553DkW> A0D() {
        List<Dl9> list = this.A0F.A0R.get(this.A03).A03;
        ArrayList<AbstractC5553DkW> arrayListA0h = C3cG.A0h();
        for (int i : this.A0x) {
            arrayListA0h.addAll(Dl9.A03(list, i));
        }
        return arrayListA0h;
    }

    @Override // X.InterfaceC5528Dk5
    public final void ASD(AbstractC5411Di6 abstractC5411Di6) {
        C5591DlR c5591DlR;
        C5437DiY c5437DiY;
        boolean z;
        this.A0C = 0L;
        this.A05 = -9223372036854775807L;
        this.A02 = 0;
        this.A0H = null;
        if (this.A0s && (abstractC5411Di6 instanceof AbstractC5415DiB) && (c5437DiY = this.A0E) != null) {
            AbstractC5415DiB abstractC5415DiB = (AbstractC5415DiB) abstractC5411Di6;
            boolean z2 = this.A0a == 1;
            C5448Dij c5448Dij = c5437DiY.A09;
            synchronized (c5448Dij) {
                z = c5448Dij.A0J;
            }
            c5448Dij.A01(z2, z ? abstractC5415DiB.A00() : abstractC5415DiB.A02);
        }
        if (abstractC5411Di6 instanceof C5416DiC) {
            int iANW = this.A0D.ANW(abstractC5411Di6.A05);
            C5432DiT[] c5432DiTArr = this.A0w;
            C5432DiT c5432DiT = c5432DiTArr[iANW];
            if (c5432DiT.A02 == null) {
                InterfaceC5417DiD interfaceC5417DiD = c5432DiT.A05;
                InterfaceC5509Djl interfaceC5509Djl = ((C5443Die) interfaceC5417DiD).A00;
                if ((interfaceC5509Djl instanceof C5591DlR) && (c5591DlR = (C5591DlR) interfaceC5509Djl) != null) {
                    boolean z3 = this.A0i.A0d;
                    AbstractC5553DkW abstractC5553DkW = c5432DiT.A03;
                    long j = abstractC5553DkW.A01;
                    if (z3) {
                        c5432DiTArr[iANW] = new C5432DiT(interfaceC5417DiD, c5432DiT.A06, new DlQ(c5591DlR, j), c5432DiT.A07, abstractC5553DkW, c5432DiT.A04, c5432DiT.A00, c5432DiT.A01, c5432DiT.A08);
                    } else {
                        c5432DiT.A02 = new DlQ(c5591DlR, j);
                    }
                }
            }
        }
        C5375DhR c5375DhR = this.A0n;
        if (c5375DhR != null) {
            long j2 = c5375DhR.A00;
            if (j2 == -9223372036854775807L || abstractC5411Di6.A02 > j2) {
                c5375DhR.A00 = abstractC5411Di6.A02;
            }
            c5375DhR.A05.A01 = true;
        }
        this.A0B = 0L;
        this.A0h.A01(new CallableC7565F4e(6, this, abstractC5411Di6));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long A00(X.C5432DiT r8, long r9) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5425DiL.A00(X.DiT, long):long");
    }

    public static long A01(C5432DiT c5432DiT, long j, long j2) {
        return Math.min(c5432DiT.A05(j), j2);
    }

    public static final HashMap A05(C5425DiL c5425DiL) {
        HashMap mapA0u = BV4.A0u();
        int i = c5425DiL.A0a;
        mapA0u.put("track", i == 2 ? "video" : i == 1 ? "audio" : i == 3 ? "text" : String.format("other %s", BV5.A1Y(i)));
        return mapA0u;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(X.C1O r6, X.C5435DiW r7, int r8) {
        /*
            X.DDe r6 = X.C4890DDe.A00(r6)
            r0 = 2
            if (r8 == r0) goto La
            r0 = 1
            if (r8 != r0) goto L21
        La:
            if (r7 == 0) goto L21
            X.DjH r0 = r7.A09
            r4 = 0
            r3 = 0
            if (r0 == 0) goto L22
            long r1 = r0.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L22
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
        L1d:
            r6.A01 = r0
            r6.A02 = r3
        L21:
            return
        L22:
            r0 = r3
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5425DiL.A06(X.C1O, X.DiW, int):void");
    }

    public static void A09(C1O c1o, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        AbstractC4889DDd.A01(c1o, (String) entry.getKey(), (String) entry.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5425DiL(X.C1J r38, X.CXB r39, X.C6013Dtw r40, X.InterfaceC5544DkM r41, X.InterfaceC5441Dic r42, X.DhA r43, X.C5534DkB r44, X.C5353Dgw r45, X.C5092DXa r46, X.DEY r47, X.C5423DiJ r48, X.C5437DiY r49, X.C6061Duw r50, X.C5527Dk3 r51, X.C5596Dlb r52, X.DhS r53, X.C5375DhR r54, X.C5366DhI r55, X.C5580Dky r56, java.util.List r57, java.util.concurrent.atomic.AtomicBoolean r58, int[] r59, int r60, int r61, int r62, long r63, boolean r65, boolean r66, boolean r67) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5425DiL.<init>(X.C1J, X.CXB, X.Dtw, X.DkM, X.Dic, X.DhA, X.DkB, X.Dgw, X.DXa, X.DEY, X.DiJ, X.DiY, X.Duw, X.Dk3, X.Dlb, X.DhS, X.DhR, X.DhI, X.Dky, java.util.List, java.util.concurrent.atomic.AtomicBoolean, int[], int, int, int, long, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0436 A[Catch: all -> 0x052c, TryCatch #3 {, blocks: (B:59:0x0190, B:61:0x0197, B:112:0x02d0, B:114:0x02d4, B:115:0x02d6, B:140:0x0369, B:144:0x036e, B:170:0x03ca, B:232:0x052b, B:171:0x03cb, B:173:0x03e1, B:176:0x0403, B:180:0x040e, B:184:0x0436, B:186:0x0444, B:188:0x044a, B:190:0x046f, B:191:0x0474, B:192:0x0476, B:196:0x0480, B:202:0x04a3, B:181:0x041f), top: B:241:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0481 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A07(X.C1O r52, X.C5435DiW r53, X.C5442Did r54, X.AbstractC5553DkW r55, java.lang.String r56, X.C5432DiT[] r57, int r58, long r59, long r61, long r63, boolean r65, boolean r66, boolean r67) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5425DiL.A07(X.C1O, X.DiW, X.Did, X.DkW, java.lang.String, X.DiT[], int, long, long, long, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Incorrect types in method signature: (JJLjava/util/List<+LX/DiB;>;LX/Dk0;J)V */
    /* JADX WARN: Removed duplicated region for block: B:1029:0x119b A[PHI: r9
  0x119b: PHI (r9v3 long) = (r9v1 long), (r9v1 long), (r9v5 long) binds: [B:1037:0x11b3, B:1039:0x11b7, B:1028:0x1199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:1034:0x11ab  */
    /* JADX WARN: Removed duplicated region for block: B:1046:0x11e1  */
    /* JADX WARN: Removed duplicated region for block: B:1051:0x11f2  */
    /* JADX WARN: Removed duplicated region for block: B:1059:0x1209  */
    /* JADX WARN: Removed duplicated region for block: B:1065:0x1214  */
    /* JADX WARN: Removed duplicated region for block: B:1072:0x1235  */
    /* JADX WARN: Removed duplicated region for block: B:1117:0x12df  */
    /* JADX WARN: Removed duplicated region for block: B:1122:0x12f2  */
    /* JADX WARN: Removed duplicated region for block: B:1147:0x1393  */
    /* JADX WARN: Removed duplicated region for block: B:1186:0x14ec  */
    /* JADX WARN: Removed duplicated region for block: B:1189:0x151f  */
    /* JADX WARN: Removed duplicated region for block: B:1192:0x1568  */
    /* JADX WARN: Removed duplicated region for block: B:1195:0x15b2  */
    /* JADX WARN: Removed duplicated region for block: B:1208:0x15e7  */
    /* JADX WARN: Removed duplicated region for block: B:1216:0x1625  */
    /* JADX WARN: Removed duplicated region for block: B:1220:0x1634 A[LOOP:19: B:1218:0x162e->B:1220:0x1634, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:1227:0x164e  */
    /* JADX WARN: Removed duplicated region for block: B:1241:0x16bd  */
    /* JADX WARN: Removed duplicated region for block: B:1242:0x16bf  */
    /* JADX WARN: Removed duplicated region for block: B:1243:0x16e4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:1401:0x0861 A[EDGE_INSN: B:1401:0x0861->B:468:0x0861 BREAK  A[LOOP:12: B:461:0x0849->B:476:0x0888], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1436:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04de A[Catch: RuntimeException -> 0x125c, TRY_ENTER, TryCatch #15 {RuntimeException -> 0x125c, blocks: (B:180:0x0392, B:182:0x03a2, B:184:0x03a6, B:188:0x03ba, B:192:0x03c8, B:197:0x03d6, B:199:0x03dc, B:219:0x041e, B:223:0x0432, B:225:0x0438, B:227:0x0440, B:233:0x0457, B:236:0x0461, B:238:0x047a, B:254:0x04a6, B:256:0x04b9, B:264:0x04de, B:269:0x04ee, B:274:0x04f8, B:279:0x0505, B:278:0x0503, B:276:0x04fd, B:245:0x048d, B:250:0x049a, B:231:0x044a), top: B:1356:0x0392, inners: #0, #4, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x07bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0a58  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0a82  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0b09  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0b19  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0ba5  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x0bc8  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0c2d  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x0c46  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x0c58  */
    /* JADX WARN: Removed duplicated region for block: B:807:0x0da5 A[Catch: all -> 0x17f3, TryCatch #7 {, blocks: (B:747:0x0cbe, B:750:0x0cc4, B:752:0x0cc8, B:754:0x0ccc, B:755:0x0cd7, B:757:0x0ce3, B:759:0x0ce7, B:761:0x0ced, B:763:0x0cf5, B:765:0x0d02, B:780:0x0d37, B:783:0x0d3f, B:785:0x0d49, B:790:0x0d5d, B:792:0x0d61, B:793:0x0d67, B:796:0x0d6f, B:797:0x0d77, B:799:0x0d7d, B:801:0x0d83, B:803:0x0d89, B:805:0x0d8f, B:807:0x0da5, B:815:0x0dc8, B:808:0x0dad, B:810:0x0db1, B:811:0x0db5, B:813:0x0db9, B:814:0x0dc1, B:786:0x0d50, B:766:0x0d07, B:770:0x0d0f, B:772:0x0d16, B:816:0x0dd5, B:817:0x0ddd, B:819:0x0de3, B:820:0x0deb, B:821:0x0dfa, B:746:0x0cbb), top: B:1342:0x0cad }] */
    /* JADX WARN: Removed duplicated region for block: B:815:0x0dc8 A[Catch: all -> 0x17f3, TryCatch #7 {, blocks: (B:747:0x0cbe, B:750:0x0cc4, B:752:0x0cc8, B:754:0x0ccc, B:755:0x0cd7, B:757:0x0ce3, B:759:0x0ce7, B:761:0x0ced, B:763:0x0cf5, B:765:0x0d02, B:780:0x0d37, B:783:0x0d3f, B:785:0x0d49, B:790:0x0d5d, B:792:0x0d61, B:793:0x0d67, B:796:0x0d6f, B:797:0x0d77, B:799:0x0d7d, B:801:0x0d83, B:803:0x0d89, B:805:0x0d8f, B:807:0x0da5, B:815:0x0dc8, B:808:0x0dad, B:810:0x0db1, B:811:0x0db5, B:813:0x0db9, B:814:0x0dc1, B:786:0x0d50, B:766:0x0d07, B:770:0x0d0f, B:772:0x0d16, B:816:0x0dd5, B:817:0x0ddd, B:819:0x0de3, B:820:0x0deb, B:821:0x0dfa, B:746:0x0cbb), top: B:1342:0x0cad }] */
    /* JADX WARN: Removed duplicated region for block: B:816:0x0dd5 A[Catch: all -> 0x17f3, TryCatch #7 {, blocks: (B:747:0x0cbe, B:750:0x0cc4, B:752:0x0cc8, B:754:0x0ccc, B:755:0x0cd7, B:757:0x0ce3, B:759:0x0ce7, B:761:0x0ced, B:763:0x0cf5, B:765:0x0d02, B:780:0x0d37, B:783:0x0d3f, B:785:0x0d49, B:790:0x0d5d, B:792:0x0d61, B:793:0x0d67, B:796:0x0d6f, B:797:0x0d77, B:799:0x0d7d, B:801:0x0d83, B:803:0x0d89, B:805:0x0d8f, B:807:0x0da5, B:815:0x0dc8, B:808:0x0dad, B:810:0x0db1, B:811:0x0db5, B:813:0x0db9, B:814:0x0dc1, B:786:0x0d50, B:766:0x0d07, B:770:0x0d0f, B:772:0x0d16, B:816:0x0dd5, B:817:0x0ddd, B:819:0x0de3, B:820:0x0deb, B:821:0x0dfa, B:746:0x0cbb), top: B:1342:0x0cad }] */
    /* JADX WARN: Removed duplicated region for block: B:824:0x0e0d  */
    /* JADX WARN: Removed duplicated region for block: B:847:0x0e53  */
    /* JADX WARN: Removed duplicated region for block: B:849:0x0e59  */
    /* JADX WARN: Removed duplicated region for block: B:887:0x0f31  */
    /* JADX WARN: Removed duplicated region for block: B:895:0x0f51  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:972:0x10b0 A[Catch: all -> 0x1261, DONT_GENERATE, TryCatch #2 {, blocks: (B:957:0x108a, B:959:0x1092, B:962:0x1099, B:964:0x109d, B:968:0x10a6, B:970:0x10ac, B:979:0x10c9, B:974:0x10b3, B:976:0x10ba, B:978:0x10c6, B:980:0x10cc, B:981:0x10d8, B:983:0x10de, B:985:0x10ea, B:988:0x10f1, B:990:0x10f7, B:1006:0x1135, B:1007:0x113b, B:1009:0x1141, B:1011:0x114d, B:1012:0x1152, B:994:0x1107, B:997:0x1110, B:999:0x111c, B:965:0x10a0, B:972:0x10b0, B:960:0x1095), top: B:1333:0x108a }] */
    @Override // X.InterfaceC5476DjD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AI0(X.C5524Dk0 r146, java.util.List r147, long r148, long r150, long r152) {
        /*
            Method dump skipped, instructions count: 6143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5425DiL.AI0(X.Dk0, java.util.List, long, long, long):void");
    }
}
