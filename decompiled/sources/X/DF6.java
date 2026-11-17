package X;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class DF6 extends DF7 implements InterfaceC5229Ddn<DF3<C5580Dky>> {
    public long A00;
    public HeroPlayerSetting A01;
    public C5571Dkp A02;
    public boolean A03;
    public boolean A04;
    public final CXN A05;
    public final C5342Dgl A06;
    public final Runnable A07;
    public volatile C5580Dky A08;
    public volatile Integer A09;
    public volatile String A0A;

    public static void A00(final DF6 df6, String str) {
        boolean z;
        if (df6.A01.enableLivePrefetchManifestSelfRefresh) {
            synchronized (df6.A0E) {
                df6.A00++;
                df6.A03 = true;
                if (df6.A09 == C79.A01) {
                    df6.A09 = C79.A0C;
                    z = true;
                } else {
                    z = false;
                }
            }
            Handler handler = ((DF7) df6).A06;
            handler.removeCallbacks(df6.A07);
            if (z) {
                AbstractC3426CMt.A03("Exo2DashLiveManifestFetcher", "Canceling self manifest refresh because of %s", str);
                handler.post(new Runnable() { // from class: X.DFC
                    public static final String __redex_internal_original_name = "Exo2DashLiveManifestFetcher$$ExternalSyntheticLambda3";

                    @Override // java.lang.Runnable
                    public final void run() {
                        HandlerC5228Ddm<? extends InterfaceC5231Ddp> handlerC5228Ddm = this.A00.A06.A00;
                        if (handlerC5228Ddm != null) {
                            handlerC5228Ddm.A01(false);
                        }
                    }
                });
            }
        }
    }

    private final void A01(C5580Dky c5580Dky, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iA00 = C5580Dky.A00(c5580Dky);
        for (int i = 0; i < iA00; i++) {
            Iterator itA05 = C5580Dky.A05(c5580Dky, i);
            while (itA05.hasNext()) {
                Iterator itA02 = Dl9.A02(BV6.A0b(itA05));
                while (itA02.hasNext()) {
                    AbstractC5553DkW abstractC5553DkWA0d = BV6.A0d(itA02);
                    if (abstractC5553DkWA0d instanceof C5355Dgz) {
                        C5325DgJ c5325DgJ = abstractC5553DkWA0d.A04;
                        String str2 = ((C5355Dgz) abstractC5553DkWA0d).A01;
                        if (c5325DgJ != null && str2 != null && !str2.isEmpty()) {
                            Uri uriA00 = C0F.A00(c5325DgJ, abstractC5553DkWA0d);
                            try {
                                byte[] bArrDecode = Base64.decode(str2, 0);
                                DE9.A00(uriA00, super.A07, C79.A00, str, bArrDecode, bArrDecode.length, false);
                                AbstractC3426CMt.A03("Exo2DashLiveManifestFetcher", "Added inline for %s, uri=%s", str, uriA00);
                            } catch (IllegalArgumentException e) {
                                BV6.A1J("Invalid inline binary is given for %s, uri=%s", "Exo2DashLiveManifestFetcher", e, new Object[]{str, uriA00});
                            }
                        }
                    }
                }
            }
        }
    }

    private final void A02(C5580Dky c5580Dky, boolean z) {
        AbstractC3426CMt.A03("Exo2DashLiveManifestFetcher", "Process single manifest, uri=%s", super.A05);
        if (this.A01.enableLivePrefetchManifestSelfRefresh && A03(c5580Dky, false)) {
            return;
        }
        synchronized (this) {
            this.A08 = c5580Dky;
        }
        A04(C79.A01);
        DFB<?> dfb = super.A00;
        if (dfb != null) {
            dfb.AVu(c5580Dky);
        }
        VpsEventCallback vpsEventCallback = super.A0A;
        if (z) {
            vpsEventCallback.A5s(new C2459Bbm(this.A0B.A04, 0, c5580Dky.A03, true, c5580Dky.A0Q));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x006b A[Catch: all -> 0x006e, DONT_GENERATE, TryCatch #1 {, blocks: (B:21:0x002d, B:23:0x0031, B:25:0x0035, B:27:0x0039, B:29:0x003d, B:31:0x0041, B:33:0x0045, B:35:0x004d, B:41:0x0067, B:42:0x0069, B:44:0x006b), top: B:59:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A03(X.C5580Dky r12, boolean r13) {
        /*
            r11 = this;
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r11.A01
            boolean r0 = r0.enableLivePrefetchManifestSelfRefresh
            r2 = 0
            if (r0 == 0) goto Lae
            java.lang.Object r7 = r11.A0E
            monitor-enter(r7)
            java.lang.Integer r1 = r11.A09     // Catch: java.lang.Throwable -> Lab
            java.lang.Integer r0 = X.C79.A0C     // Catch: java.lang.Throwable -> Lab
            r10 = 1
            if (r1 != r0) goto L17
            java.lang.Integer r0 = X.C79.A0K     // Catch: java.lang.Throwable -> Lab
            r11.A09 = r0     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lab
            return r10
        L17:
            java.lang.Integer r0 = r11.A09     // Catch: java.lang.Throwable -> Lab
            java.lang.Integer r1 = X.C79.A01     // Catch: java.lang.Throwable -> Lab
            if (r0 == r1) goto L1f
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lab
            return r2
        L1f:
            java.lang.Integer r0 = X.C79.A0K     // Catch: java.lang.Throwable -> Lab
            r11.A09 = r0     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lab
            long r8 = android.os.SystemClock.elapsedRealtime()
            if (r13 != 0) goto L71
            if (r12 == 0) goto L71
            monitor-enter(r7)
            java.lang.Integer r0 = r11.A0H     // Catch: java.lang.Throwable -> L6e
            if (r0 != r1) goto L6b
            boolean r0 = r11.A0I     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L6b
            boolean r0 = r11.A03     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L6b
            X.DFB<?> r0 = r11.A00     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L6b
            X.Dky r0 = r11.A08     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L6b
            X.Dky r5 = r11.A08     // Catch: java.lang.Throwable -> L6e
            if (r5 == 0) goto L6b
            long r3 = r5.A05     // Catch: java.lang.Throwable -> L6e
            long r1 = r12.A05     // Catch: java.lang.Throwable -> L6e
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L6b
            long[] r0 = X.Dl2.A03(r5)     // Catch: java.lang.Throwable -> L6e
            r5 = r0[r10]     // Catch: java.lang.Throwable -> L6e
            long[] r0 = X.Dl2.A03(r12)     // Catch: java.lang.Throwable -> L6e
            r3 = r0[r10]     // Catch: java.lang.Throwable -> L6e
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L6b
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L6b
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L6b
            r11.A08 = r12     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6e
            goto L80
        L6b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6e
            r0 = 0
            goto L95
        L6e:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6e
            throw r0
        L71:
            java.lang.String r4 = "Exo2DashLiveManifestFetcher"
            java.lang.String r3 = "Self manifest refresh failed after %dms, trigger=%s, keeping held manifest"
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            java.lang.String r0 = r11.A0A
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            goto La7
        L80:
            java.lang.String r2 = "Exo2DashLiveManifestFetcher"
            java.lang.String r1 = "Adopted refreshed live manifest, uri=%s"
            android.net.Uri r0 = r11.A05
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            X.AbstractC3426CMt.A03(r2, r1, r0)
            X.C0h r0 = r11.A0B
            java.lang.String r0 = r0.A04
            r11.A01(r12, r0)
            r0 = 1
        L95:
            java.lang.String r4 = "Exo2DashLiveManifestFetcher"
            java.lang.String r3 = "Self manifest refresh resolved in %dms, trigger=%s, adopted=%b"
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.lang.String r1 = r11.A0A
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r1, r0}
        La7:
            X.AbstractC3426CMt.A03(r4, r3, r0)
            return r10
        Lab:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lab
            throw r0
        Lae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DF6.A03(X.Dky, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A07(java.io.IOException r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DF6.A07(java.io.IOException):void");
    }

    public final void A06() {
        for (C4923DEt c4923DEt : this.A0D.A0O) {
            if (c4923DEt.A06 == this && "cache_jump".equals(c4923DEt.A08)) {
                c4923DEt.A00(C79.A0K);
            }
        }
    }

    @Override // X.InterfaceC5229Ddn
    public final /* bridge */ /* synthetic */ void ATt(InterfaceC5231Ddp interfaceC5231Ddp, long j, boolean z) {
        if (this.A01.enableLivePrefetchManifestSelfRefresh) {
            synchronized (this.A0E) {
                if (this.A09 == C79.A0C) {
                    this.A09 = C79.A0K;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC5229Ddn
    public final /* bridge */ /* synthetic */ void ATu(InterfaceC5231Ddp interfaceC5231Ddp, long j, long j2) {
        C5580Dky c5580Dky = (C5580Dky) ((DF3) interfaceC5231Ddp).A05;
        HeroPlayerSetting heroPlayerSetting = this.A01;
        if (heroPlayerSetting.errorOnExpiredLiveManifest) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j3 = heroPlayerSetting.expiredLiveManifestThresholdMs;
            if (c5580Dky != null && c5580Dky.A0S) {
                long j4 = c5580Dky.A04;
                if (j4 != -9223372036854775807L && jCurrentTimeMillis > j4 + j3) {
                    Uri uri = super.A05;
                    AbstractC3426CMt.A03("Exo2DashLiveManifestFetcher", "Loaded live manifest already expired (broadcast ended), uri=%s", uri);
                    A07(new HttpDataSource$InvalidResponseCodeException(new C1O(uri, null, 0L, -1L), null, "Live manifest expired: availabilityEndTime passed (broadcast ended)", Collections.EMPTY_MAP, new byte[0], 410));
                    return;
                }
            }
        }
        A02(c5580Dky, true);
    }

    @Override // X.InterfaceC5229Ddn
    public final /* bridge */ /* synthetic */ C5230Ddo ATv(InterfaceC5231Ddp interfaceC5231Ddp, IOException iOException, int i, long j, long j2) {
        if (super.A00 != null && (((iOException instanceof HttpDataSource$HttpDataSourceException) && i <= this.A01.retryCountsForStartPlayManifestFetch) || ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode == 503 && i <= this.A01.retryCountsForStartPlayManifest503))) {
            return new C5230Ddo(0, BV4.A01(BV6.A0H(i - 1) + 500, 5000L));
        }
        A07(iOException);
        return C5342Dgl.A03;
    }

    @Override // X.InterfaceC5229Ddn
    public final /* synthetic */ void ATx(InterfaceC5231Ddp interfaceC5231Ddp, int i, long j) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0014 A[PHI: r26
  0x0014: PHI (r26v6 boolean) = (r26v0 boolean), (r26v7 boolean) binds: [B:7:0x000c, B:9:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0018 A[PHI: r26 r27
  0x0018: PHI (r26v1 boolean) = (r26v6 boolean), (r26v7 boolean) binds: [B:11:0x0016, B:9:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x0018: PHI (r27v0 boolean) = (r27v5 boolean), (r27v6 boolean) binds: [B:11:0x0016, B:9:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[PHI: r26 r27
  0x001e: PHI (r26v5 boolean) = (r26v1 boolean), (r26v6 boolean) binds: [B:13:0x001c, B:11:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x001e: PHI (r27v4 boolean) = (r27v0 boolean), (r27v5 boolean) binds: [B:13:0x001c, B:11:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0022 A[PHI: r26 r27 r28
  0x0022: PHI (r26v4 boolean) = (r26v1 boolean), (r26v5 boolean) binds: [B:13:0x001c, B:15:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0022: PHI (r27v3 boolean) = (r27v0 boolean), (r27v4 boolean) binds: [B:13:0x001c, B:15:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0022: PHI (r28v3 boolean) = (r28v0 boolean), (r28v4 boolean) binds: [B:13:0x001c, B:15:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0028 A[PHI: r26 r27 r28
  0x0028: PHI (r26v2 boolean) = (r26v4 boolean), (r26v5 boolean) binds: [B:17:0x0026, B:15:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r27v1 boolean) = (r27v3 boolean), (r27v4 boolean) binds: [B:17:0x0026, B:15:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r28v1 boolean) = (r28v3 boolean), (r28v4 boolean) binds: [B:17:0x0026, B:15:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000e A[PHI: r26
  0x000e: PHI (r26v7 boolean) = (r26v0 boolean), (r26v8 boolean) binds: [B:7:0x000c, B:5:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DF6(android.content.Context r31, android.net.Uri r32, android.os.Handler r33, X.DE9 r34, X.DFE r35, com.facebook.exoplayer.monitor.VpsEventCallback r36, X.C3159C0h r37, X.C4922DEs r38, com.facebook.video.heroplayer.setting.HeroPlayerSetting r39, X.C5580Dky r40, com.google.common.base.Supplier r41, java.util.Map r42, java.util.concurrent.atomic.AtomicBoolean r43, java.util.concurrent.atomic.AtomicBoolean r44, int r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DF6.<init>(android.content.Context, android.net.Uri, android.os.Handler, X.DE9, X.DFE, com.facebook.exoplayer.monitor.VpsEventCallback, X.C0h, X.DEs, com.facebook.video.heroplayer.setting.HeroPlayerSetting, X.Dky, com.google.common.base.Supplier, java.util.Map, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean, int, boolean):void");
    }
}
