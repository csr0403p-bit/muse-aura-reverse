package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.video.heroplayer.exocustom.MediaCodecInitializationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Dwu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6152Dwu implements InterfaceC6224DyF {
    public static final C6152Dwu A0A = new C6152Dwu();
    public ScheduledExecutorService A03;
    public ScheduledFuture<?> A04;
    public final Object A05 = C3cG.A0T();
    public final Map<String, Deque<C6253Dyw>> A07 = BV4.A0u();
    public final Map<String, Deque<C6253Dyw>> A08 = BV4.A0u();
    public int A00 = 0;
    public int A01 = 0;
    public final Map<String, Integer> A06 = BV4.A0u();
    public final Set<String> A09 = C60O.A13();
    public long A02 = 0;

    private InterfaceC6181DxP A01(AbstractC6211Dxx abstractC6211Dxx, C6175DxI c6175DxI, Integer num, String str, boolean z) throws MediaCodecInitializationException, IOException {
        InterfaceC6181DxP c2981Bqq;
        InterfaceC6181DxP interfaceC6181DxP;
        if (A06(c6175DxI, str, z)) {
            synchronized (this.A05) {
                Deque<C6253Dyw> deque = this.A08.get(str);
                if (deque == null || deque.isEmpty()) {
                    interfaceC6181DxP = null;
                } else {
                    interfaceC6181DxP = deque.pollFirst().A01;
                    this.A01--;
                }
            }
            if (interfaceC6181DxP != null) {
                abstractC6211Dxx.A05(num, str, interfaceC6181DxP.hashCode(), z);
                return interfaceC6181DxP;
            }
        }
        try {
            AnonymousClass003.A0x(str, num);
            BY9 by9 = new BY9(num, str, RealtimeSinceBootClock.A00.now(), z);
            boolean z2 = c6175DxI.A0c;
            if (z && "meta.dav1d.av1.decoder".equals(str)) {
                try {
                    c2981Bqq = (InterfaceC6181DxP) BV8.A0q("exoplayer2.av1.src.Dav1dMediaCodecAdapter");
                } catch (Exception e) {
                    Log.w("MediaCodecPoolV2", BV5.A0n("Exception instantiating exoplayer2.av1.src.Dav1dMediaCodecAdapter: ", e));
                }
            } else {
                MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                if (z2 && mediaCodecCreateByCodecName == null) {
                    throw BV5.A0M("MediaCodec.createByCodecName returned null for ", str);
                }
                c2981Bqq = new C2981Bqq(mediaCodecCreateByCodecName);
            }
            abstractC6211Dxx.A04(by9, c2981Bqq.hashCode());
            return c2981Bqq;
        } catch (Exception e2) {
            throw new MediaCodecInitializationException(str, e2);
        }
    }

    public static boolean A06(C6175DxI c6175DxI, String str, boolean z) {
        boolean z2;
        Set<String> set = c6175DxI.A0A;
        if (set != null && !set.isEmpty() && !set.contains(AnonymousClass001.A0u(str))) {
            return false;
        }
        if ("meta.dav1d.av1.decoder".equals(str)) {
            return c6175DxI.A0Z;
        }
        if (z) {
            if (c6175DxI.A0O) {
                return true;
            }
            if (!c6175DxI.A0e) {
                return false;
            }
            z2 = c6175DxI.A0a;
        } else {
            if (c6175DxI.A0M) {
                return true;
            }
            if (!c6175DxI.A0e) {
                return false;
            }
            z2 = c6175DxI.A0Y;
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.InterfaceC6224DyF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC6181DxP A2x(android.media.MediaFormat r12, android.view.Surface r13, X.AbstractC6211Dxx r14, X.C6175DxI r15, java.lang.Integer r16, java.lang.String r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6152Dwu.A2x(android.media.MediaFormat, android.view.Surface, X.Dxx, X.DxI, java.lang.Integer, java.lang.String, boolean):X.DxP");
    }

    @Override // X.InterfaceC6224DyF
    public final void AaD(AbstractC6211Dxx abstractC6211Dxx, C6175DxI c6175DxI, Integer num, String str, InterfaceC6181DxP interfaceC6181DxP, boolean z) {
        Map<String, Deque<C6253Dyw>> map;
        boolean z2;
        MediaFormat mediaFormatADu;
        Set<String> set;
        MediaFormat mediaFormatADu2;
        boolean z3 = false;
        if (z && c6175DxI.A0T && c6175DxI.A0O && (((set = c6175DxI.A0A) == null || set.isEmpty() || set.contains(AnonymousClass001.A0u(str))) && (mediaFormatADu2 = interfaceC6181DxP.ADu()) != null && interfaceC6181DxP.AOt())) {
            try {
                mediaFormatADu2.getInteger("audio-session-id");
            } catch (RuntimeException unused) {
                if (!AbstractC5337DgY.A00(str, z)) {
                    synchronized (this.A05) {
                        z3 = !this.A09.contains(str);
                    }
                }
            }
        }
        DyW dyW = null;
        boolean z4 = false;
        if (!z3) {
            if (A06(c6175DxI, str, z)) {
                if (!c6175DxI.A0N || (mediaFormatADu = interfaceC6181DxP.ADu()) == null) {
                    Object obj = this.A05;
                    synchronized (obj) {
                        map = this.A08;
                        Deque<C6253Dyw> deque = map.get(str);
                        int size = deque == null ? 0 : deque.size();
                        int i = this.A00;
                        int i2 = this.A01;
                        if (i + i2 >= c6175DxI.A04 || size >= c6175DxI.A03) {
                            z2 = false;
                        } else {
                            this.A01 = i2 + 1;
                            z2 = true;
                        }
                    }
                    if (z2) {
                        try {
                            interfaceC6181DxP.reset();
                            synchronized (obj) {
                                Deque<C6253Dyw> dequeA0s = map.get(str);
                                if (dequeA0s == null) {
                                    dequeA0s = BV4.A0s();
                                    map.put(str, dequeA0s);
                                }
                                if (dequeA0s.size() < c6175DxI.A03) {
                                    dequeA0s.addLast(new C6253Dyw(interfaceC6181DxP, null, SystemClock.uptimeMillis()));
                                    A02(c6175DxI.A05);
                                    z4 = true;
                                } else {
                                    this.A01--;
                                }
                            }
                            if (z4) {
                                abstractC6211Dxx.A03(interfaceC6181DxP.hashCode(), num);
                                return;
                            }
                        } catch (RuntimeException e) {
                            synchronized (obj) {
                                this.A01--;
                                Log.w("MediaCodecPoolV2", BV5.A0n("reset on release failed, releasing codec: ", e));
                            }
                        }
                    }
                } else {
                    try {
                        mediaFormatADu.getInteger("audio-session-id");
                    } catch (RuntimeException unused2) {
                    }
                }
            }
            abstractC6211Dxx.A02(interfaceC6181DxP.hashCode());
            try {
                interfaceC6181DxP.release();
            } catch (RuntimeException unused3) {
            }
            abstractC6211Dxx.A01(interfaceC6181DxP.hashCode());
            return;
        }
        try {
            interfaceC6181DxP.flush();
            interfaceC6181DxP.AeU(false);
            if (c6175DxI.A0B) {
                DyW dyW2 = new DyW();
                try {
                    interfaceC6181DxP.Ady(dyW2.A01);
                    dyW = dyW2;
                } catch (RuntimeException e2) {
                    e = e2;
                    dyW = dyW2;
                    Log.w("MediaCodecPoolV2", BV5.A0n("flush on release failed, releasing codec: ", e));
                    try {
                        interfaceC6181DxP.release();
                    } catch (RuntimeException unused4) {
                    }
                    if (dyW != null) {
                        dyW.A01.release();
                        dyW.A00.release();
                    }
                    A03(str);
                    return;
                }
            }
            synchronized (this.A05) {
                if (this.A00 + this.A01 < c6175DxI.A04) {
                    Map<String, Deque<C6253Dyw>> map2 = this.A07;
                    Deque<C6253Dyw> dequeA0s2 = map2.get(str);
                    if (dequeA0s2 == null) {
                        dequeA0s2 = BV4.A0s();
                        map2.put(str, dequeA0s2);
                    }
                    if (dequeA0s2.size() < c6175DxI.A03) {
                        dequeA0s2.addLast(new C6253Dyw(interfaceC6181DxP, dyW, SystemClock.uptimeMillis()));
                        this.A00++;
                        A02(c6175DxI.A05);
                        z4 = true;
                    }
                }
            }
            if (z4) {
                abstractC6211Dxx.A03(interfaceC6181DxP.hashCode(), num);
                return;
            }
            abstractC6211Dxx.A02(interfaceC6181DxP.hashCode());
            try {
                interfaceC6181DxP.release();
            } catch (RuntimeException unused5) {
            }
            abstractC6211Dxx.A01(interfaceC6181DxP.hashCode());
            if (dyW != null) {
                dyW.A01.release();
                dyW.A00.release();
            }
        } catch (RuntimeException e3) {
            e = e3;
        }
    }

    private void A02(int i) {
        if (i > 0) {
            this.A02 = i;
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = this.A03;
            if (scheduledExecutorServiceNewSingleThreadScheduledExecutor == null) {
                scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC2510Bcg(1));
                this.A03 = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            }
            if (this.A04 == null) {
                long jMax = Math.max(1000L, BV6.A0I(this.A02));
                this.A04 = scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(new Runnable() { // from class: X.Dnu
                    public static final String __redex_internal_original_name = "MediaCodecPoolV2$$ExternalSyntheticLambda1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C6152Dwu c6152Dwu = this.A00;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        ArrayList arrayListA0h = C3cG.A0h();
                        synchronized (c6152Dwu.A05) {
                            long j = c6152Dwu.A02;
                            if (j > 0) {
                                c6152Dwu.A00 -= C6152Dwu.A00(arrayListA0h, c6152Dwu.A07, jUptimeMillis, j);
                                c6152Dwu.A01 -= C6152Dwu.A00(arrayListA0h, c6152Dwu.A08, jUptimeMillis, j);
                            }
                            if (c6152Dwu.A00 == 0 && c6152Dwu.A01 == 0) {
                                ScheduledFuture<?> scheduledFuture = c6152Dwu.A04;
                                if (scheduledFuture != null) {
                                    scheduledFuture.cancel(false);
                                    c6152Dwu.A04 = null;
                                }
                                ScheduledExecutorService scheduledExecutorService = c6152Dwu.A03;
                                if (scheduledExecutorService != null) {
                                    scheduledExecutorService.shutdown();
                                    c6152Dwu.A03 = null;
                                }
                            }
                        }
                        C6152Dwu.A04(arrayListA0h);
                    }
                }, jMax, jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    private void A03(String str) {
        ArrayList arrayListA0h = C3cG.A0h();
        synchronized (this.A05) {
            Map<String, Integer> map = this.A06;
            int iA07 = BV6.A07(map.getOrDefault(str, BV4.A0V())) + 1;
            BV4.A1H(str, map, iA07);
            if (iA07 >= 3) {
                this.A09.add(str);
                Deque<C6253Dyw> dequeRemove = this.A07.remove(str);
                if (dequeRemove != null) {
                    arrayListA0h.addAll(dequeRemove);
                    this.A00 -= dequeRemove.size();
                }
                Log.w("MediaCodecPoolV2", FGI.A0A(iA07, "flush reuse circuit-broken for codec=", str, " after ", " failures"));
            }
        }
        A04(arrayListA0h);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;Ljava/util/Deque<LX/Dyw;>;>;JJLjava/util/List<LX/Dyw;>;)I */
    public static int A00(List list, Map map, long j, long j2) {
        Iterator itA0n = AnonymousClass002.A0n(map);
        int i = 0;
        while (itA0n.hasNext()) {
            Deque deque = (Deque) BV7.A0s(itA0n);
            Iterator it = deque.iterator();
            while (it.hasNext()) {
                C6253Dyw c6253Dyw = (C6253Dyw) it.next();
                if (j - c6253Dyw.A00 >= j2) {
                    list.add(c6253Dyw);
                    it.remove();
                    i++;
                }
            }
            if (deque.isEmpty()) {
                itA0n.remove();
            }
        }
        return i;
    }

    public static void A04(List<C6253Dyw> list) {
        for (C6253Dyw c6253Dyw : list) {
            try {
                c6253Dyw.A01.release();
            } catch (RuntimeException unused) {
            }
            DyW dyW = c6253Dyw.A02;
            if (dyW != null) {
                dyW.A01.release();
                dyW.A00.release();
            }
        }
    }

    public static boolean A05(MediaFormat mediaFormat, MediaFormat mediaFormat2, String str) {
        Integer numValueOf;
        Integer numValueOf2;
        try {
            numValueOf = Integer.valueOf(mediaFormat.getInteger(str));
        } catch (RuntimeException unused) {
            numValueOf = null;
        }
        try {
            numValueOf2 = Integer.valueOf(mediaFormat2.getInteger(str));
        } catch (RuntimeException unused2) {
            numValueOf2 = null;
        }
        if (numValueOf != null) {
            if (numValueOf2 != null && numValueOf2.intValue() <= numValueOf.intValue()) {
                return true;
            }
        } else if (numValueOf2 == null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC6224DyF
    public final InterfaceC6181DxP A2w(AbstractC6211Dxx abstractC6211Dxx, C6175DxI c6175DxI, Integer num, String str, boolean z) {
        return A01(abstractC6211Dxx, c6175DxI, num, str, z);
    }
}
