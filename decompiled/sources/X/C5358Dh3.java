package X;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.media3.common.util.Util;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: X.Dh3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5358Dh3 extends AbstractC6011Dtu {
    public static final C5358Dh3 $redex_init_class = null;
    public int A00;
    public int A01;
    public long A02;
    public long A03;

    @Deprecated
    public long A04;
    public long A05;
    public long A06;
    public Uri A07;
    public Handler A08;
    public C5777DpJ A09;
    public C1J A0A;
    public C6013Dtw A0B;
    public C5342Dgl A0C;
    public C5092DXa A0D;
    public C5580Dky A0E;
    public IOException A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0J;
    public Uri A0M;
    public CXB A0N;
    public final C5704Dnm A0O;
    public final C6013Dtw A0P;
    public final InterfaceC5334DgV A0Q;
    public final C5353Dgw A0R;
    public final C5423DiJ A0S;
    public final RunnableC5360Dh5 A0T;
    public final Object A0U;
    public final Runnable A0V;
    public final Runnable A0W;
    public final SparseArray<C5424DiK> A0X;
    public final CXN A0Y;
    public final InterfaceC5460Div A0Z;
    public final InterfaceC5512Djo A0a;
    public final DhA A0b;
    public final InterfaceC3126Byr<? extends C5580Dky> A0c;
    public final DEY A0d;
    public final C5527Dk3 A0e;
    public final DhS A0f;
    public final DhC A0g;
    public final Dh7 A0h;
    public final DhB A0i;
    public final boolean A0j;
    public final boolean A0k;
    public boolean A0I = false;
    public long A0K = 0;
    public long A0L = 0;

    public static List<Dl9> A00(C5580Dky c5580Dky) {
        C5585DlC c5585DlC;
        List<Dl9> list;
        LinkedList linkedListA0y = null;
        if (c5580Dky != null && C5580Dky.A00(c5580Dky) >= 1 && (c5585DlC = c5580Dky.A0R.get(0)) != null && (list = c5585DlC.A03) != null) {
            linkedListA0y = BV4.A0y();
            Iterator<Dl9> it = list.iterator();
            while (it.hasNext()) {
                Dl9 dl9A0b = BV6.A0b(it);
                if (dl9A0b.A06 == 3) {
                    linkedListA0y.add(dl9A0b);
                }
            }
        }
        return linkedListA0y;
    }

    public static boolean A09(C5585DlC c5585DlC) {
        int i = 0;
        while (true) {
            List<Dl9> list = c5585DlC.A03;
            if (i >= list.size()) {
                return false;
            }
            int i2 = BV6.A0c(list, i).A06;
            if (i2 == 1 || i2 == 2) {
                break;
            }
            i++;
        }
        return true;
    }

    @Override // X.AbstractC6011Dtu
    public final void A0B() {
        this.A0H = false;
        this.A0A = null;
        C5342Dgl c5342Dgl = this.A0C;
        if (c5342Dgl != null) {
            c5342Dgl.A01(null);
            this.A0C = null;
        }
        this.A06 = 0L;
        this.A05 = 0L;
        this.A0E = this.A0k ? this.A0E : null;
        this.A07 = this.A0M;
        this.A0F = null;
        Handler handler = this.A08;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.A08 = null;
        }
        this.A02 = -9223372036854775807L;
        this.A01 = 0;
        this.A03 = -9223372036854775807L;
        this.A00 = 0;
        this.A0I = false;
        this.A0X.clear();
        DhS dhS = this.A0f;
        dhS.A01.clear();
        dhS.A00.clear();
        dhS.A02.clear();
        this.A0Z.release();
    }

    static {
        C2369BVx.A00("goog.exo.dash");
    }

    public static Set<String> A01(List<Dl9> list) {
        List<AbstractC5553DkW> list2;
        if (list == null || list.isEmpty() || (list2 = ((Dl9) C8j4.A0p(list)).A0E) == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetA13 = C60O.A13();
        Iterator<AbstractC5553DkW> it = list2.iterator();
        while (it.hasNext()) {
            String str = BV6.A0d(it).A03.A0a;
            if (str != null) {
                hashSetA13.add(str);
            }
        }
        return hashSetA13;
    }

    public static void A02(InterfaceC5229Ddn interfaceC5229Ddn, DF3 df3, C5358Dh3 c5358Dh3, int i) {
        long jA00 = c5358Dh3.A0C.A00(interfaceC5229Ddn, df3, i);
        c5358Dh3.A0P.A02(null, new C5072DTn(df3.A02, df3.A01, jA00), null, df3.A00, -1, 0, 0, -9223372036854775807L, -9223372036854775807L);
    }

    public static void A03(C5358Dh3 c5358Dh3) {
        long j = c5358Dh3.A0E.A0B;
        if (j == 0) {
            j = 5000;
        }
        long jMax = Math.max(0L, C3cH.A04(c5358Dh3.A06 + j));
        RunnableC5360Dh5 runnableC5360Dh5 = c5358Dh3.A0T;
        runnableC5360Dh5.A00 = "scheduled_refresh";
        c5358Dh3.A08.postDelayed(runnableC5360Dh5, jMax);
    }

    public static void A04(C5358Dh3 c5358Dh3, long j) {
        c5358Dh3.A02 = j;
        if (c5358Dh3.A0S.A1K) {
            A08(c5358Dh3, true);
        } else {
            A07(c5358Dh3, true);
        }
    }

    public static void A05(C5358Dh3 c5358Dh3, IOException iOException) {
        Log.e("DashMediaSource", "Failed to resolve time offset.", iOException);
        if (c5358Dh3.A0S.A1K) {
            A08(c5358Dh3, true);
        } else {
            A07(c5358Dh3, true);
        }
    }

    public static void A06(C5358Dh3 c5358Dh3, final String str) {
        Uri uri;
        int i;
        c5358Dh3.A08.removeCallbacks(c5358Dh3.A0T);
        final boolean zA1X = AnonymousClass002.A1X(c5358Dh3.A0C.A00);
        boolean zA1M = AnonymousClass002.A1M(str.compareTo("scheduled_refresh"));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = c5358Dh3.A0K;
        final long j2 = j == 0 ? 0L : jElapsedRealtime - j;
        long j3 = c5358Dh3.A0L;
        final long j4 = j3 != 0 ? jElapsedRealtime - j3 : 0L;
        if (zA1M) {
            c5358Dh3.A0K = jElapsedRealtime;
        } else {
            c5358Dh3.A0L = jElapsedRealtime;
        }
        c5358Dh3.A0d.A01(new Callable() { // from class: X.BZY
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z = zA1X;
                String str2 = str;
                long j5 = j2;
                long j6 = j4;
                C5358Dh3 c5358Dh32 = C5358Dh3.$redex_init_class;
                HashMap mapA0u = BV4.A0u();
                BV4.A1G(C3cF.A00(19), mapA0u, z);
                mapA0u.put("reason", str2);
                BV4.A1F("since_last_scheduled_ms", mapA0u, j5);
                BV4.A1F("since_last_unscheduled_ms", mapA0u, j6);
                return mapA0u;
            }
        });
        C5342Dgl c5342Dgl = c5358Dh3.A0C;
        if (c5342Dgl.A01 == null) {
            if (c5342Dgl.A00 != null) {
                c5358Dh3.A0H = true;
                return;
            }
            synchronized (c5358Dh3.A0U) {
                uri = c5358Dh3.A07;
            }
            c5358Dh3.A0H = false;
            Map map = Collections.EMPTY_MAP;
            C5423DiJ c5423DiJ = c5358Dh3.A0S;
            int i2 = c5423DiJ.A0m ? DEF.LIVE_MANIFEST.value : -1;
            DE6 de6 = new DE6();
            DE7 de7 = DE7.A02;
            String str2 = c5423DiJ.A0f ? "fb4a-live-video" : "";
            String str3 = c5358Dh3.A0e.A00;
            C4890DDe c4890DDe = new C4890DDe(de7, de6, "", null, null, str2, str3, null, null, null, -1, -1, -1, i2, 0, -1, -1, -1, -1, -1L, -1L, -1L, -1L, -1L, -1L, -1L, false, false, false, false, false, false);
            C1G.A04(uri);
            C1O c1o = new C1O(uri, c4890DDe, null, map, null, 1, 1, 0L, 0L, -1L);
            if (c5423DiJ.A11 && !TextUtils.isEmpty(str3)) {
                AbstractC4889DDd.A01(c1o, "x-fb-psid", str3);
            }
            DF3 df3 = new DF3(c5358Dh3.A0A, c1o, c5358Dh3.A0c, 4);
            C5351Dgu c5351Dgu = new C5351Dgu(c5358Dh3.A0h.A00);
            int iAHm = c5358Dh3.A0Q.AHm(4);
            if (c5423DiJ.A0u && (i = c5423DiJ.A0B) >= 0 && !c5358Dh3.A0J) {
                iAHm = i;
            }
            A02(c5351Dgu, df3, c5358Dh3, iAHm);
        }
    }

    @Deprecated
    public static void A07(C5358Dh3 c5358Dh3, boolean z) {
        List<Dl9> list;
        int i;
        boolean z2;
        C5580Dky c5580Dky;
        int i2 = 0;
        while (true) {
            SparseArray<C5424DiK> sparseArray = c5358Dh3.A0X;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i2);
            int i3 = c5358Dh3.A00;
            if (iKeyAt >= i3) {
                sparseArray.valueAt(i2).A01(c5358Dh3.A0E, iKeyAt - i3);
            }
            i2++;
        }
        int iA00 = C5580Dky.A00(c5358Dh3.A0E) - 1;
        C5585DlC c5585DlC = c5358Dh3.A0E.A0R.get(iA00);
        long jA01 = C5580Dky.A01(c5358Dh3.A0E, iA00);
        long jA09 = Util.A09(c5358Dh3.A02);
        UUID uuid = AbstractC5400Dhr.A04;
        long jA0A = Util.A0A(jA09);
        C5585DlC c5585DlC2 = c5358Dh3.A0E.A0R.get(0);
        long jA012 = C5580Dky.A01(c5358Dh3.A0E, 0);
        boolean zA09 = A09(c5585DlC2);
        long jA0A2 = 0;
        int i4 = 0;
        while (true) {
            List<Dl9> list2 = c5585DlC2.A03;
            if (i4 >= list2.size()) {
                break;
            }
            Dl9 dl9A0c = BV6.A0c(list2, i4);
            List<AbstractC5553DkW> list3 = dl9A0c.A0E;
            if ((!zA09 || dl9A0c.A06 != 3) && !list3.isEmpty()) {
                DhD dhDA01 = AbstractC5553DkW.A01(list3);
                if (dhDA01 == null || dhDA01.ACe(jA012, jA0A) == 0) {
                    break;
                } else {
                    jA0A2 = Math.max(jA0A2, dhDA01.ALf(dhDA01.AFd(jA012, jA0A)));
                }
            }
            i4++;
        }
        jA0A2 = 0;
        boolean zA092 = A09(c5585DlC);
        long jMin = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        int i5 = 0;
        while (true) {
            list = c5585DlC.A03;
            if (i5 >= list.size()) {
                break;
            }
            Dl9 dl9A0c2 = BV6.A0c(list, i5);
            List<AbstractC5553DkW> list4 = dl9A0c2.A0E;
            if ((!zA092 || dl9A0c2.A06 != 3) && !list4.isEmpty()) {
                DhD dhDA012 = AbstractC5553DkW.A01(list4);
                if (dhDA012 == null) {
                    jMin = jA01;
                    break;
                }
                long jACe = dhDA012.ACe(jA01, jA0A);
                if (jACe == 0) {
                    jMin = 0;
                    break;
                } else {
                    long jA0S = BV7.A0S(dhDA012.AFd(jA01, jA0A), jACe);
                    jMin = Math.min(jMin, dhDA012.ALf(jA0S) + dhDA012.AEz(jA0S, jA01));
                }
            }
            i5++;
        }
        long jA0A3 = 0;
        if (!c5358Dh3.A0E.A0S) {
            i = 1;
            z2 = false;
            break;
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            DhD dhDA013 = AbstractC5553DkW.A01(Dl9.A03(list, i6));
            if (dhDA013 == null || dhDA013.AOO()) {
                i = 1;
                z2 = false;
                break;
            }
        }
        long j = c5358Dh3.A02;
        long jA0A4 = Util.A0A(j != 0 ? SystemClock.elapsedRealtime() + j : System.currentTimeMillis());
        C5580Dky c5580Dky2 = c5358Dh3.A0E;
        i = 1;
        jMin = Math.min((jA0A4 - Util.A0A(c5580Dky2.A05)) - Util.A0A(c5580Dky2.A0R.get(iA00).A00), jMin);
        long j2 = c5358Dh3.A0E.A0F;
        if (j2 != -9223372036854775807L) {
            long jA0A5 = jMin - Util.A0A(j2);
            while (jA0A5 < 0 && iA00 > 0) {
                iA00--;
                jA0A5 += C5580Dky.A01(c5358Dh3.A0E, iA00);
            }
            jA0A2 = iA00 == 0 ? Math.max(jA0A2, jA0A5) : C5580Dky.A01(c5358Dh3.A0E, 0);
        }
        z2 = true;
        long jA013 = jMin - jA0A2;
        int i7 = 0;
        while (true) {
            int iA002 = C5580Dky.A00(c5358Dh3.A0E) - i;
            c5580Dky = c5358Dh3.A0E;
            if (i7 >= iA002) {
                break;
            }
            jA013 += C5580Dky.A01(c5580Dky, i7);
            i7++;
        }
        if (c5580Dky.A0S) {
            long j3 = c5358Dh3.A04;
            if (j3 == -1) {
                j3 = c5580Dky.A0E;
                if (j3 == -9223372036854775807L) {
                    j3 = 30000;
                }
            }
            jA0A3 = jA013 - Util.A0A(j3);
            if (jA0A3 < 5000000) {
                jA0A3 = Math.min(5000000L, BV6.A0I(jA013));
            }
        }
        long jA0B = c5580Dky.A05 + c5580Dky.A0R.get(0).A00 + Util.A0B(jA0A2);
        if (c5358Dh3.A0S.A1G) {
            jA0A2 -= Util.A0A(c5358Dh3.A0E.A0C);
        }
        C5580Dky c5580Dky3 = c5358Dh3.A0E;
        long j4 = c5580Dky3.A05;
        long j5 = c5358Dh3.A02;
        c5358Dh3.A0A(new Dl8(c5580Dky3.A0S ? c5358Dh3.A09 : null, c5358Dh3.A0O, c5580Dky3, c5358Dh3.A00, j4, jA0B, j5, jA0A2, jA013, jA0A3));
        if (c5358Dh3.A0k) {
            return;
        }
        Handler handler = c5358Dh3.A08;
        Runnable runnable = c5358Dh3.A0W;
        handler.removeCallbacks(runnable);
        if (z2) {
            c5358Dh3.A08.postDelayed(runnable, 5000L);
        }
        if (c5358Dh3.A0H) {
            A06(c5358Dh3, "process_manifest");
            return;
        }
        if (z) {
            C5580Dky c5580Dky4 = c5358Dh3.A0E;
            if (!c5580Dky4.A0S || c5580Dky4.A0B == -9223372036854775807L) {
                return;
            }
            A03(c5358Dh3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ec, code lost:
    
        r14 = r21;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x026e A[PHI: r0
  0x026e: PHI (r0v58 long) = (r0v57 long), (r0v67 long) binds: [B:132:0x0264, B:135:0x026a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018c A[PHI: r0
  0x018c: PHI (r0v36 long) = (r0v35 long), (r0v87 long) binds: [B:71:0x0180, B:75:0x018a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bf A[PHI: r0
  0x01bf: PHI (r0v42 long) = (r0v41 long), (r0v84 long) binds: [B:86:0x01b3, B:90:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A08(X.C5358Dh3 r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5358Dh3.A08(X.Dh3, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    @Override // X.AbstractC6011Dtu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(X.CXB r8) {
        /*
            r7 = this;
            r7.A0N = r8
            X.Div r2 = r7.A0Z
            r2.prepare()
            android.os.Looper r1 = android.os.Looper.myLooper()
            X.E6Y r0 = r7.A00
            X.C1G.A05(r0)
            r2.Ae4(r1, r0)
            boolean r0 = r7.A0k
            r6 = 0
            if (r0 == 0) goto L22
            X.DiJ r5 = r7.A0S
        L1a:
            boolean r0 = r5.A1K
            if (r0 == 0) goto L82
            A08(r7, r6)
        L21:
            return
        L22:
            X.CXN r0 = r7.A0Y
            X.C1J r0 = r0.createDataSource()
            r7.A0A = r0
            X.DiJ r5 = r7.A0S
            int r3 = r5.A00
            r0 = 19
            if (r3 > r0) goto L37
            r1 = -19
            r0 = 1
            if (r3 >= r1) goto L38
        L37:
            r0 = 0
        L38:
            java.lang.String r2 = "Loader:DashMediaSource"
            if (r0 == 0) goto L7b
            X.Bpo r1 = new X.Bpo
            r1.<init>(r2, r3)
        L41:
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor(r1)
            X.C7384Etj.A0U(r2)
            r1 = 2
            X.F4o r0 = new X.F4o
            r0.<init>(r1)
            X.Dgm r1 = new X.Dgm
            r1.<init>(r0, r2)
            X.Dgl r0 = new X.Dgl
            r0.<init>(r1)
            r7.A0C = r0
            r0 = 0
            android.os.Handler r0 = X.C1G.A02(r0)
            r7.A08 = r0
            long r3 = r5.A0J
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L6d
            boolean r0 = r7.A0J
            if (r0 == 0) goto L76
        L6d:
            boolean r0 = r5.A18
            if (r0 != 0) goto L76
            java.lang.String r0 = "prepare_source_internal"
            A06(r7, r0)
        L76:
            X.Dky r0 = r7.A0E
            if (r0 == 0) goto L21
            goto L1a
        L7b:
            r0 = 2
            X.Ev6 r1 = new X.Ev6
            r1.<init>(r2, r0)
            goto L41
        L82:
            A07(r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5358Dh3.A0C(X.CXB):void");
    }

    @Override // X.InterfaceC6009Dts
    public final InterfaceC6006Dtp A7x(Dy6 dy6, InterfaceC5538DkF interfaceC5538DkF, long j) {
        int iA0F = AnonymousClass001.A0F(dy6.A04) - this.A00;
        this.A0E.A0R.get(iA0F);
        C6013Dtw c6013Dtw = new C6013Dtw(dy6, super.A04.A02, 0);
        C6014Dtx c6014Dtx = new C6014Dtx(dy6, super.A03.A02, 0);
        int i = this.A00 + iA0F;
        C5580Dky c5580Dky = this.A0E;
        DhS dhS = this.A0f;
        DhC dhC = this.A0g;
        CXB cxb = this.A0N;
        InterfaceC5460Div interfaceC5460Div = this.A0Z;
        InterfaceC5334DgV interfaceC5334DgV = this.A0Q;
        long j2 = this.A02;
        DhA dhA = this.A0b;
        InterfaceC5512Djo interfaceC5512Djo = this.A0a;
        DhB dhB = this.A0i;
        E6Y e6y = super.A00;
        C1G.A05(e6y);
        C5424DiK c5424DiK = new C5424DiK(cxb, e6y, c6014Dtx, interfaceC5460Div, interfaceC5512Djo, c6013Dtw, interfaceC5538DkF, interfaceC5334DgV, dhA, this.A0S, dhS, dhC, dhB, c5580Dky, i, iA0F, j2, this.A0j);
        this.A0X.put(c5424DiK.A09, c5424DiK);
        return c5424DiK;
    }

    @Override // X.InterfaceC6009Dts
    public final C5704Dnm AHb() {
        return this.A0O;
    }

    @Override // X.InterfaceC6009Dts
    public final void AQS() {
        this.A0b.AQQ();
    }

    @Override // X.InterfaceC6009Dts
    public final void AaI(InterfaceC6006Dtp interfaceC6006Dtp) {
        C5424DiK c5424DiK = (C5424DiK) interfaceC6006Dtp;
        C5366DhI c5366DhI = c5424DiK.A0M;
        c5366DhI.A03 = true;
        c5366DhI.A04.removeCallbacksAndMessages(null);
        for (C5422DiI<InterfaceC5541DkJ> c5422DiI : c5424DiK.A06) {
            c5422DiI.A0E(c5424DiK);
        }
        c5424DiK.A03 = null;
        this.A0X.remove(c5424DiK.A09);
    }

    public final void A0D(DF3 df3, long j) {
        this.A0P.A03(null, DF3.A00(df3, j), null, df3.A00, -1, 0, -9223372036854775807L, -9223372036854775807L);
    }

    public C5358Dh3(C5704Dnm c5704Dnm, CXN cxn, InterfaceC5460Div interfaceC5460Div, InterfaceC5512Djo interfaceC5512Djo, InterfaceC5334DgV interfaceC5334DgV, InterfaceC3126Byr interfaceC3126Byr, C5353Dgw c5353Dgw, C5092DXa c5092DXa, DEY dey, C5423DiJ c5423DiJ, C5527Dk3 c5527Dk3, DhC dhC, C5580Dky c5580Dky, long j, boolean z) {
        boolean z2 = false;
        this.A0O = c5704Dnm;
        this.A09 = c5704Dnm.A02;
        C5568Dkm c5568Dkm = c5704Dnm.A03;
        c5568Dkm.getClass();
        Uri uri = c5568Dkm.A01;
        this.A07 = uri;
        this.A0M = uri;
        this.A0E = c5580Dky;
        this.A0Y = cxn;
        this.A0c = interfaceC3126Byr;
        this.A0g = dhC;
        this.A0Z = interfaceC5460Div;
        this.A0Q = interfaceC5334DgV;
        this.A04 = j;
        this.A0a = interfaceC5512Djo;
        this.A0S = c5423DiJ;
        this.A0R = c5353Dgw;
        this.A0j = z;
        this.A0d = dey;
        this.A0e = c5527Dk3;
        this.A0f = new DhS();
        if (c5580Dky != null && !c5580Dky.A0S) {
            z2 = true;
        }
        this.A0k = z2;
        this.A0P = new C6013Dtw(null, super.A04.A02, 0);
        this.A0U = C3cG.A0T();
        this.A0X = BV4.A0B();
        this.A0D = c5092DXa;
        this.A0i = new Dh6(this);
        this.A03 = -9223372036854775807L;
        this.A02 = -9223372036854775807L;
        if (z2) {
            C1G.A08(!c5580Dky.A0S);
            this.A0b = new Dh9();
            return;
        }
        this.A0h = new Dh7(this);
        this.A0b = new C5352Dgv(this);
        this.A0T = new RunnableC5360Dh5(this);
        this.A0W = new RunnableC5356Dh0(c5423DiJ, this);
        this.A0V = new RunnableC5359Dh4(c5423DiJ, this);
    }
}
