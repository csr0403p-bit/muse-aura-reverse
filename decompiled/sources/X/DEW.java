package X;

import android.os.SystemClock;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.ipc.FirstDataSegmentCacheCheckEndEvent;
import com.facebook.video.heroplayer.ipc.FirstDataSegmentCacheCheckStartEvent;
import com.google.common.base.Supplier;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class DEW implements DDj {
    public static final AtomicLong A1a = BV5.A19();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;
    public long A0P;
    public long A0Q;
    public long A0R;
    public long A0S;
    public long A0T;
    public long A0U;
    public DEK A0V;
    public DEF A0W;
    public IOException A0X;
    public Long A0Y;
    public Long A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public int A11;
    public long A12;
    public final InterfaceC4913DEg A13;
    public final InterfaceC4913DEg A14;
    public final VpsEventCallback A15;
    public final DEY A16;
    public final Supplier<Long> A17;
    public final String A18;
    public final String A19;
    public final String A1A;
    public final String A1B;
    public final String A1C;
    public final String A1D;
    public final String A1E;
    public final CopyOnWriteArraySet A1F;
    public final AtomicBoolean A1G;
    public final AtomicBoolean A1H;
    public final AtomicReference<String> A1I;
    public final AtomicReference<String> A1J;
    public final AtomicReference<String> A1K;
    public final G0U<String, String> A1L;
    public final boolean A1M;
    public final boolean A1N;
    public final boolean A1O;
    public final boolean A1P;
    public final boolean A1Q;
    public final boolean A1R;
    public final int A1S;
    public final E7C A1T;
    public final C1U A1U;
    public final InterfaceC6113Dvs A1V;
    public final AtomicBoolean A1W;
    public final AtomicLong A1X;
    public final boolean A1Y;
    public volatile HxE<String, String> A1Z;

    @Override // X.DDj
    public final void ATL(DEK dek, long j, long j2, long j3) {
        C7384Etj.A0Y(dek, 0);
        VpsEventCallback vpsEventCallback = this.A15;
        if (vpsEventCallback != null) {
            DEF def = this.A0W;
            vpsEventCallback.A5s(new FirstDataSegmentCacheCheckEndEvent(dek, this.A1D, def.value, C60P.A01(this.A17.get()), j, j2, j3));
        }
    }

    @Override // X.CXB
    public final void AWh(C1J c1j, C1O c1o, boolean z) {
        C7384Etj.A0Y(c1o, 1);
        if (this.A1N && (!this.A0x || this.A1O)) {
            AtomicReference<String> atomicReference = this.A1J;
            C4890DDe c4890DDeA00 = C4890DDe.A00(c1o);
            atomicReference.set(c4890DDeA00 != null ? c4890DDeA00.A0S : null);
        }
        A03(SystemClock.elapsedRealtime());
    }

    @Override // X.DDj
    public final void AWi(IOException iOException) {
        C7384Etj.A0Y(iOException, 0);
        long j = this.A1X.get();
        Iterator itA0N = C7384Etj.A0N(this.A1F);
        while (itA0N.hasNext()) {
            try {
                ((C4908DEb) itA0N.next()).A02(j);
            } catch (RuntimeException e) {
                CFK.A0A("HttpTransferEventTracker", "HTTP transfer observer failed", e);
            }
        }
        this.A0X = iOException;
        if (iOException instanceof HttpDataSource$InvalidResponseCodeException) {
            HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException = (HttpDataSource$InvalidResponseCodeException) iOException;
            Map<String, List<String>> map = httpDataSource$InvalidResponseCodeException.headerFields;
            C7384Etj.A0T(map);
            this.A0h = String.valueOf(DEX.A01(AbstractC7382Etg.A02(map)));
            Map<String, List<String>> map2 = httpDataSource$InvalidResponseCodeException.headerFields;
            C7384Etj.A0T(map2);
            this.A0f = String.valueOf(DEX.A04(AbstractC7382Etg.A02(map2), this.A1S));
            Map<String, List<String>> map3 = httpDataSource$InvalidResponseCodeException.headerFields;
            C7384Etj.A0T(map3);
            this.A0i = DEX.A03(AbstractC7382Etg.A02(map3), "x-fb-one-variant");
            if (httpDataSource$InvalidResponseCodeException.responseCode == 416) {
                this.A0Z = Long.valueOf(AbstractC7382Etg.A00(httpDataSource$InvalidResponseCodeException.headerFields, false));
            }
        }
        A01(SystemClock.elapsedRealtime(), false);
        if (this.A0Q == 0) {
            this.A0Q = SystemClock.elapsedRealtime();
        }
        this.A16.A01(new CallableC7565F4e(1, iOException, this));
    }

    @Override // X.InterfaceC4897DDq
    public final void AWj(String str, Object obj) {
        C7384Etj.A0Y(str, 0);
        try {
            if ("X-FB-Connection-Quality".equals(str)) {
                this.A0c = (String) obj;
                return;
            }
            if ("up-ttfb".equals(str) && obj != null) {
                this.A0T = Long.parseLong((String) obj);
                return;
            }
            if ("x-fb-session-id".equals(str) && obj != null) {
                this.A0a = (String) obj;
                return;
            }
            if ("x-fb-conn-uuid-client".equals(str) && obj != null && this.A1N && (!this.A0x || this.A1O)) {
                this.A1I.set(obj);
                return;
            }
            if ("x-fb-ptm-uuid".equals(str) && obj != null && this.A1N && (!this.A0x || this.A1O)) {
                this.A1K.set(obj);
                return;
            }
            if ("x-fb-edge-hit".equals(str) && obj != null) {
                this.A0e = (String) obj;
                return;
            }
            if ("x-fb-origin-hit".equals(str) && obj != null) {
                this.A0j = (String) obj;
                return;
            }
            if ("x-fb-response-time-ms".equals(str) && obj != null) {
                this.A0F = Long.parseLong((String) obj);
                return;
            }
            if ("x-fb-dynamic-latest-segment-id".equals(str) && obj != null) {
                this.A06 = Integer.parseInt((String) obj);
                return;
            }
            if (!"x-fb-dynamic-predictive-response-chunk-size".equalsIgnoreCase(str) || obj == null) {
                if (!"x-fb-dynamic-client-wallclock-offset-ms".equalsIgnoreCase(str) || obj == null) {
                    return;
                }
                this.A0Y = Long.valueOf(Long.parseLong((String) obj));
                return;
            }
            try {
                this.A05 = Integer.parseInt((String) obj);
            } catch (NumberFormatException e) {
                CFK.A0A("HttpTransferEventTracker", "Malformed chunk-size CDN header", e);
            }
        } catch (NumberFormatException e2) {
            CFK.A0A("HttpTransferEventTracker", "Malformed numeric CDN header", e2);
        }
    }

    @Override // X.CXB
    public final void AWm(C1J c1j, C1O c1o, boolean z) {
        VpsEventCallback vpsEventCallback;
        Long l;
        C7384Etj.A0Y(c1o, 1);
        C4890DDe c4890DDeA00 = C4890DDe.A00(c1o);
        this.A0q = c4890DDeA00.A0Y;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.A0S = jElapsedRealtime;
        if (c1o.A07 != null) {
            this.A11 = c4890DDeA00.A0E;
        }
        if (this.A1Y && this.A0N == 0 && (vpsEventCallback = this.A15) != null) {
            long j = this.A0M;
            long jLongValue = 0;
            if (j <= 0) {
                j = this.A0R;
            }
            IOException iOException = this.A0X;
            DEF def = this.A0W;
            String message = iOException != null ? iOException.getMessage() : "";
            String str = this.A1D;
            Supplier<Long> supplier = this.A17;
            if (supplier.get() != null && (l = supplier.get()) != null) {
                jLongValue = l.longValue();
            }
            String strA00 = C7426Evi.A00(this.A0o);
            boolean z2 = this.A0x;
            String str2 = this.A1C;
            long j2 = this.A0R;
            long jMax = (long) Math.max(j - j2, -1.0d);
            long jMax2 = (long) Math.max(this.A0S - j2, -1.0d);
            int i = this.A0B;
            DEK dek = this.A0V;
            boolean z3 = this.A1G.get();
            boolean z4 = this.A1H.get();
            String str3 = this.A0k;
            long j3 = this.A0D;
            long j4 = this.A0E;
            int i2 = def.value;
            long j5 = this.A0N;
            int i3 = this.A0A;
            String str4 = this.A1A;
            String str5 = this.A0n;
            String str6 = this.A0c;
            int i4 = this.A08;
            long j6 = this.A0C;
            boolean z5 = this.A0t;
            int i5 = this.A00;
            long j7 = this.A0O;
            long j8 = this.A0P;
            boolean z6 = this.A1P;
            boolean z7 = this.A1Q;
            boolean z8 = this.A0z;
            String str7 = this.A0b;
            long j9 = this.A0T;
            String str8 = this.A0a;
            long j10 = this.A0I;
            long j11 = this.A0J;
            long j12 = this.A0K;
            int i6 = this.A01;
            long j13 = this.A0H;
            String str9 = this.A0l;
            boolean z9 = this.A0r;
            boolean z10 = this.A0s;
            boolean z11 = this.A0y;
            boolean z12 = this.A0p;
            boolean z13 = this.A0u;
            boolean z14 = this.A0q;
            boolean z15 = this.A0w;
            int i7 = this.A09;
            int i8 = this.A04;
            long j14 = this.A0L;
            vpsEventCallback.A5s(new HXD(dek, this.A0Y, this.A0Z, str, strA00, message, str2, str3, str4, str5, str6, str7, str8, str9, this.A0e, this.A0j, this.A18, this.A19, this.A0g, this.A0h, this.A0f, this.A0i, this.A1B, this.A1E, i, i2, i3, i4, i5, i6, i7, i8, this.A06, this.A03, this.A07, this.A05, jElapsedRealtime, jLongValue, jMax, jMax2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, this.A0F, this.A0G, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15));
        }
        String str10 = this.A0o;
        DEF def2 = this.A0W;
        VpsEventCallback vpsEventCallback2 = this.A15;
        if (vpsEventCallback2 != null && str10 != null && def2 == DEF.LIVE_MANIFEST && this.A10) {
            vpsEventCallback2.A5s(new BYE(this.A1D, str10, def2.name, System.currentTimeMillis()));
        }
        DEY.A00(this.A16, this, 9);
    }

    @Override // X.DDj
    public final void AdN(String str) {
        C7384Etj.A0Y(str, 0);
        this.A0d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01(long r122, boolean r124) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DEW.A01(long, boolean):void");
    }

    public static final void A02(DEW dew, HashMap map) {
        map.put("transfer_start_time_ms", Long.valueOf(dew.A0S));
        map.put("request_start_time_ms", Long.valueOf(dew.A0M));
        map.put("transfer_end_time_ms", Long.valueOf(dew.A0Q));
        map.put("transfer_end_lastcall_time_ms", C3cI.A0O());
        map.put("first_chunk_transfer_end_time_ms", Long.valueOf(dew.A12));
        map.put(C8j2.A00(22), Integer.valueOf(dew.A02));
    }

    public final void A03(long j) {
        if (this.A0X == null) {
            A01(j, false);
        }
        if (this.A0Q == 0) {
            this.A0Q = SystemClock.elapsedRealtime();
        }
        DEY.A00(this.A16, this, 7);
    }

    @Override // X.CXB
    public final void AS2(C1J c1j, C1O c1o, int i, boolean z) {
        int i2;
        DEF def;
        this.A02 += i;
        VpsEventCallback vpsEventCallback = this.A15;
        if (vpsEventCallback != null && (def = this.A0W) == DEF.LIVE_VIDEO && this.A10) {
            String str = this.A1D;
            String str2 = this.A0o;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = def.name;
            vpsEventCallback.A5s(new BYD(str, str2, str3 != null ? str3 : "", i));
        }
        if (!this.A0q || (i2 = this.A05) <= 0 || this.A02 < i2) {
            return;
        }
        this.A12 = SystemClock.elapsedRealtime();
    }

    @Override // X.DDj
    public final void ATM(long j, long j2) {
        Long l;
        VpsEventCallback vpsEventCallback = this.A15;
        if (vpsEventCallback != null) {
            DEF def = this.A0W;
            Supplier<Long> supplier = this.A17;
            long jLongValue = 0;
            if (supplier.get() != null && (l = supplier.get()) != null) {
                jLongValue = l.longValue();
            }
            vpsEventCallback.A5s(new FirstDataSegmentCacheCheckStartEvent(this.A1D, def.value, jLongValue, j, j2));
        }
    }

    @Override // X.DDj
    public final void AVB() {
        long j = this.A1X.get();
        Iterator itA0N = C7384Etj.A0N(this.A1F);
        while (itA0N.hasNext()) {
            try {
                ((C4908DEb) itA0N.next()).A02(j);
            } catch (RuntimeException e) {
                CFK.A0A("HttpTransferEventTracker", "HTTP transfer observer failed", e);
            }
        }
    }

    @Override // X.DDj
    public final void AWg() {
        long j = this.A1X.get();
        Iterator itA0N = C7384Etj.A0N(this.A1F);
        while (itA0N.hasNext()) {
            try {
                ((C4908DEb) itA0N.next()).A02(j);
            } catch (RuntimeException e) {
                CFK.A0A("HttpTransferEventTracker", "HTTP transfer observer failed", e);
            }
        }
        A01(SystemClock.elapsedRealtime(), true);
        if (this.A0Q == 0) {
            this.A0Q = SystemClock.elapsedRealtime();
        }
        DEY.A00(this.A16, this, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x035c  */
    @Override // X.DDj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AWl(X.C1O r95, X.DEK r96) {
        /*
            Method dump skipped, instructions count: 1280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DEW.AWl(X.C1O, X.DEK):void");
    }

    public static final HashMap A00(DEW dew) {
        HashMap mapA0u = BV4.A0u();
        String str = dew.A0o;
        if (str == null) {
            str = "<null>";
        }
        mapA0u.put("url", str);
        mapA0u.put("predicted_number", Integer.valueOf(dew.A04));
        mapA0u.put("tigon_transaction_id", BV4.A0V());
        return mapA0u;
    }

    @Override // X.DDj
    public final void AdA(long j) {
        this.A0Z = Long.valueOf(j);
    }

    @Override // X.DDj
    public final void AdZ(boolean z) {
        this.A0v = z;
    }

    @Override // X.CXB
    public final void AWk(C1J c1j, C1O c1o, boolean z) {
    }

    public DEW(InterfaceC4913DEg interfaceC4913DEg, InterfaceC4913DEg interfaceC4913DEg2, VpsEventCallback vpsEventCallback, DEF def, DEY dey, C3159C0h c3159C0h, InterfaceC6113Dvs interfaceC6113Dvs, Supplier supplier, String str, String str2, String str3, String str4, String str5, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicBoolean atomicBoolean3, G0U g0u, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        C7384Etj.A0Y(str3, 9);
        C7384Etj.A0Y(atomicBoolean3, 10);
        this.A17 = supplier;
        this.A1B = str;
        this.A15 = vpsEventCallback;
        this.A0x = z;
        this.A1C = str2;
        this.A1G = atomicBoolean;
        this.A1H = atomicBoolean2;
        this.A1A = str3;
        this.A1W = atomicBoolean3;
        this.A1M = z12;
        this.A1L = g0u;
        this.A1T = E7C.A00;
        this.A1F = new CopyOnWriteArraySet();
        this.A1X = BV5.A19();
        String str6 = c3159C0h.A04;
        C7384Etj.A0U(str6);
        this.A1D = str6;
        String str7 = c3159C0h.A02;
        this.A0k = str7 == null ? "" : str7;
        this.A0l = c3159C0h.A03;
        this.A1I = BV4.A15();
        this.A1K = BV4.A15();
        this.A1J = BV4.A15();
        this.A07 = -1;
        this.A0U = -1L;
        this.A0I = -1L;
        this.A0J = -1L;
        this.A0K = -1L;
        this.A0L = -1L;
        this.A11 = -2;
        this.A13 = interfaceC4913DEg;
        this.A14 = interfaceC4913DEg2;
        this.A0V = DEK.NOT_APPLY;
        this.A0W = def;
        this.A1P = z2;
        this.A1Q = z3;
        this.A0z = z4;
        this.A1V = interfaceC6113Dvs;
        this.A0r = z5;
        this.A0s = z6;
        this.A0u = z7;
        this.A1R = z8;
        this.A1Y = z9;
        this.A1N = z10;
        this.A1O = z11;
        this.A18 = str4;
        this.A19 = c3159C0h.A01.name();
        this.A1S = i;
        this.A1E = str5;
        this.A16 = dey;
        C1U c1u = c3159C0h.A00;
        C7384Etj.A0U(c1u);
        this.A1U = c1u;
    }
}
