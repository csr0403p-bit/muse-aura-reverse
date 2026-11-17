package X;

import android.media.NotProvisionedException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.KeysExpiredException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.Dx3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6160Dx3 implements InterfaceC5547DkP {
    public C3425CMr A01;
    public CMp A02;
    public byte[] A03;
    public byte[] A04;
    public int A05;
    public HandlerThread A06;
    public InterfaceC5392Dhj A07;
    public CMo A08;
    public DrmSession$DrmSessionException A09;
    public final InterfaceC6278DzV A0B;
    public final HandlerC6166Dx9 A0C;
    public final InterfaceC6174DxH A0D;
    public final BVO A0E;
    public final InterfaceC5334DgV A0F;
    public final List<DrmInitData.SchemeData> A0G;
    public final UUID A0H;
    public final Looper A0I;
    public final E6Y A0J;
    public final InterfaceC6283Dzf A0K;
    public final HashMap<String, String> A0L;
    public final C6179DxN<C6014Dtx> A0A = new C6179DxN<>();
    public int A00 = 2;

    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C6160Dx3 r3, java.lang.Throwable r4, int r5) throws java.lang.Throwable {
        /*
            boolean r0 = r4 instanceof android.media.MediaDrm.MediaDrmStateException
            if (r0 == 0) goto L42
            r0 = r4
            android.media.MediaDrm$MediaDrmStateException r0 = (android.media.MediaDrm.MediaDrmStateException) r0
            java.lang.String r0 = r0.getDiagnosticInfo()
            int r0 = androidx.media3.common.util.Util.A05(r0)
            int r1 = androidx.media3.common.util.Util.A02(r0)
        L13:
            androidx.media3.exoplayer.drm.DrmSession$DrmSessionException r0 = new androidx.media3.exoplayer.drm.DrmSession$DrmSessionException
            r0.<init>(r4, r1)
            r3.A09 = r0
            java.lang.String r1 = "DefaultDrmSession"
            java.lang.String r0 = "DRM session error"
            X.CNC.A05(r1, r0, r4)
            boolean r0 = r4 instanceof java.lang.Exception
            if (r0 == 0) goto L7b
            X.DxN<X.Dtx> r0 = r3.A0A
            java.util.Set r0 = r0.A01()
            java.util.Iterator r2 = r0.iterator()
        L2f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r1 = r2.next()
            X.Dtx r1 = (X.C6014Dtx) r1
            r0 = r4
            java.lang.Exception r0 = (java.lang.Exception) r0
            r1.A04(r0)
            goto L2f
        L42:
            boolean r0 = r4 instanceof android.media.MediaDrmResetException
            if (r0 != 0) goto L78
            boolean r0 = r4 instanceof android.media.NotProvisionedException
            if (r0 != 0) goto L75
            boolean r0 = A06(r4)
            if (r0 != 0) goto L75
            boolean r0 = r4 instanceof android.media.DeniedByServerException
            if (r0 == 0) goto L57
            r1 = 6007(0x1777, float:8.418E-42)
            goto L13
        L57:
            boolean r0 = r4 instanceof androidx.media3.exoplayer.drm.UnsupportedDrmException
            if (r0 == 0) goto L5e
            r1 = 6001(0x1771, float:8.409E-42)
            goto L13
        L5e:
            boolean r0 = r4 instanceof androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException
            if (r0 == 0) goto L65
            r1 = 6003(0x1773, float:8.412E-42)
            goto L13
        L65:
            boolean r0 = r4 instanceof androidx.media3.exoplayer.drm.KeysExpiredException
            if (r0 == 0) goto L6c
            r1 = 6008(0x1778, float:8.419E-42)
            goto L13
        L6c:
            r0 = 1
            if (r5 == r0) goto L78
            r0 = 2
            if (r5 != r0) goto L75
            r1 = 6004(0x1774, float:8.413E-42)
            goto L13
        L75:
            r1 = 6002(0x1772, float:8.41E-42)
            goto L13
        L78:
            r1 = 6006(0x1776, float:8.416E-42)
            goto L13
        L7b:
            boolean r0 = r4 instanceof java.lang.Error
            if (r0 == 0) goto L95
            boolean r0 = X.AbstractC6225DyI.A00(r4)
            if (r0 != 0) goto L8c
            boolean r0 = A06(r4)
            if (r0 != 0) goto L8c
            throw r4
        L8c:
            int r1 = r3.A00
            r0 = 4
            if (r1 == r0) goto L94
            r0 = 1
            r3.A00 = r0
        L94:
            return
        L95:
            java.lang.String r1 = "Unexpected Throwable subclass"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6160Dx3.A01(X.Dx3, java.lang.Throwable, int):void");
    }

    public static void A02(C6160Dx3 c6160Dx3, Throwable th, boolean z) throws Throwable {
        if (!(th instanceof NotProvisionedException) && !A06(th)) {
            A01(c6160Dx3, th, BV5.A01(z ? 1 : 0));
            return;
        }
        C6182DxQ c6182DxQ = (C6182DxQ) c6160Dx3.A0B;
        c6182DxQ.A01.add(c6160Dx3);
        if (c6182DxQ.A00 == null) {
            c6182DxQ.A00 = c6160Dx3;
            c6160Dx3.A07();
        }
    }

    public static void A03(C6160Dx3 c6160Dx3, boolean z) throws Throwable {
        Pair pairA0A;
        Map<String, String> mapAYv;
        String strA0p;
        String strA0p2;
        byte[] bArr = c6160Dx3.A04;
        byte[] bArr2 = c6160Dx3.A03;
        if (bArr2 == null) {
            c6160Dx3.A04(bArr, 1, z);
            return;
        }
        if (c6160Dx3.A00 != 4) {
            try {
                c6160Dx3.A0D.Abd(bArr, bArr2);
            } catch (Exception | NoSuchMethodError e) {
                A01(c6160Dx3, e, 1);
                return;
            }
        }
        if (AbstractC5400Dhr.A04.equals(c6160Dx3.A0H)) {
            A00(c6160Dx3);
            byte[] bArr3 = c6160Dx3.A04;
            if (bArr3 == null || (mapAYv = c6160Dx3.A0D.AYv(bArr3)) == null) {
                pairA0A = null;
            } else {
                try {
                    strA0p2 = C60O.A0p("LicenseDurationRemaining", mapAYv);
                } catch (NumberFormatException unused) {
                }
                long j = strA0p2 != null ? Long.parseLong(strA0p2) : -9223372036854775807L;
                Long lValueOf = Long.valueOf(j);
                try {
                    strA0p = C60O.A0p("PlaybackDurationRemaining", mapAYv);
                } catch (NumberFormatException unused2) {
                }
                long j2 = strA0p != null ? Long.parseLong(strA0p) : -9223372036854775807L;
                pairA0A = BV4.A0A(lValueOf, Long.valueOf(j2));
            }
            pairA0A.getClass();
            long jMin = Math.min(C3cG.A05(pairA0A.first), BV7.A0T(pairA0A));
            if (jMin <= 60) {
                CNC.A01("DefaultDrmSession", FGI.A0B(jMin, "Offline license has expired or will expire soon. Remaining seconds: "));
                c6160Dx3.A04(bArr, 2, z);
                return;
            } else if (jMin <= 0) {
                A01(c6160Dx3, new KeysExpiredException(), 2);
                return;
            }
        }
        c6160Dx3.A00 = 4;
        Iterator<C6014Dtx> it = c6160Dx3.A0A.A01().iterator();
        while (it.hasNext()) {
            it.next().A01();
        }
    }

    private void A04(byte[] bArr, int i, boolean z) throws Throwable {
        try {
            C3425CMr c3425CMrAGp = this.A0D.AGp(this.A0L, this.A0G, bArr, i);
            this.A01 = c3425CMrAGp;
            CMo cMo = this.A08;
            C5072DTn.A05.getAndIncrement();
            SystemClock.elapsedRealtime();
            BV6.A10(cMo, new CMq(c3425CMrAGp, z), 2);
        } catch (Exception | NoSuchMethodError e) {
            A02(this, e, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A05(X.C6160Dx3 r5) throws java.lang.Throwable {
        /*
            int r2 = r5.A00
            r4 = 3
            if (r2 == r4) goto L9
            r1 = 4
            r0 = 0
            if (r2 != r1) goto La
        L9:
            r0 = 1
        La:
            r3 = 1
            if (r0 != 0) goto L72
            X.DxH r2 = r5.A0D     // Catch: android.media.NotProvisionedException -> L44 java.lang.Throwable -> L58
            byte[] r1 = r2.AXX()     // Catch: android.media.NotProvisionedException -> L44 java.lang.Throwable -> L58
            r5.A04 = r1     // Catch: android.media.NotProvisionedException -> L44 java.lang.Throwable -> L58
            X.E6Y r0 = r5.A0J     // Catch: android.media.NotProvisionedException -> L44 java.lang.Throwable -> L58
            r2.Ae7(r0, r1)     // Catch: android.media.NotProvisionedException -> L44 java.lang.Throwable -> L58
            byte[] r0 = r5.A04     // Catch: android.media.NotProvisionedException -> L44 java.lang.Throwable -> L58
            X.Dhj r0 = r2.A7g(r0)     // Catch: android.media.NotProvisionedException -> L44 java.lang.Throwable -> L58
            r5.A07 = r0     // Catch: android.media.NotProvisionedException -> L44 java.lang.Throwable -> L58
            r5.A00 = r4     // Catch: android.media.NotProvisionedException -> L44 java.lang.Throwable -> L58
            X.DxN<X.Dtx> r0 = r5.A0A     // Catch: android.media.NotProvisionedException -> L44 java.lang.Throwable -> L58
            java.util.Set r0 = r0.A01()     // Catch: android.media.NotProvisionedException -> L44 java.lang.Throwable -> L58
            java.util.Iterator r1 = r0.iterator()     // Catch: android.media.NotProvisionedException -> L44 java.lang.Throwable -> L58
        L2e:
            boolean r0 = r1.hasNext()     // Catch: android.media.NotProvisionedException -> L44 java.lang.Throwable -> L58
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r1.next()     // Catch: android.media.NotProvisionedException -> L44 java.lang.Throwable -> L58
            X.Dtx r0 = (X.C6014Dtx) r0     // Catch: android.media.NotProvisionedException -> L44 java.lang.Throwable -> L58
            r0.A03(r4)     // Catch: android.media.NotProvisionedException -> L44 java.lang.Throwable -> L58
            goto L2e
        L3e:
            byte[] r0 = r5.A04     // Catch: android.media.NotProvisionedException -> L44 java.lang.Throwable -> L58
            r0.getClass()     // Catch: android.media.NotProvisionedException -> L44 java.lang.Throwable -> L58
            return r3
        L44:
            X.DzV r1 = r5.A0B
            X.DxQ r1 = (X.C6182DxQ) r1
            java.util.Set<X.Dx3> r0 = r1.A01
            r0.add(r5)
            X.Dx3 r0 = r1.A00
            if (r0 == 0) goto L52
            goto L6c
        L52:
            r1.A00 = r5
            r5.A07()
            goto L6c
        L58:
            r1 = move-exception
            boolean r0 = A06(r1)
            if (r0 == 0) goto L6e
            X.DzV r1 = r5.A0B
            X.DxQ r1 = (X.C6182DxQ) r1
            java.util.Set<X.Dx3> r0 = r1.A01
            r0.add(r5)
            X.Dx3 r0 = r1.A00
            if (r0 == 0) goto L52
        L6c:
            r0 = 0
            return r0
        L6e:
            A01(r5, r1, r3)
            goto L6c
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6160Dx3.A05(X.Dx3):boolean");
    }

    public static boolean A06(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    private final void A07() {
        CMp cMpAJF = this.A0D.AJF();
        this.A02 = cMpAJF;
        CMo cMo = this.A08;
        C5072DTn.A05.getAndIncrement();
        SystemClock.elapsedRealtime();
        BV6.A10(cMo, new CMq(cMpAJF, true), 1);
    }

    public C6160Dx3(Looper looper, E6Y e6y, InterfaceC6278DzV interfaceC6278DzV, InterfaceC6283Dzf interfaceC6283Dzf, InterfaceC6174DxH interfaceC6174DxH, BVO bvo, InterfaceC5334DgV interfaceC5334DgV, HashMap map, List list, UUID uuid) {
        this.A0H = uuid;
        this.A0B = interfaceC6278DzV;
        this.A0K = interfaceC6283Dzf;
        this.A0D = interfaceC6174DxH;
        this.A0G = Collections.unmodifiableList(list);
        this.A0L = map;
        this.A0E = bvo;
        this.A0F = interfaceC5334DgV;
        this.A0J = e6y;
        this.A0I = looper;
        this.A0C = new HandlerC6166Dx9(looper, this);
    }

    public static void A00(C6160Dx3 c6160Dx3) {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = c6160Dx3.A0I;
        if (threadCurrentThread != looper.getThread()) {
            CNC.A06("DefaultDrmSession", FGI.A0d("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: ", threadCurrentThread.getName(), "\nExpected thread: ", looper.getThread().getName()), BV4.A0T());
        }
    }

    @Override // X.InterfaceC5547DkP
    public final void A2v(C6014Dtx c6014Dtx) {
        int i;
        A00(this);
        int i2 = this.A05;
        if (i2 < 0) {
            CNC.A02("DefaultDrmSession", FGI.A0H("Session reference count less than zero: ", i2));
            this.A05 = 0;
        }
        if (c6014Dtx != null) {
            C6179DxN<C6014Dtx> c6179DxN = this.A0A;
            synchronized (c6179DxN.A02) {
                ArrayList arrayListA0t = BV4.A0t(c6179DxN.A00);
                arrayListA0t.add(c6014Dtx);
                c6179DxN.A00 = Collections.unmodifiableList(arrayListA0t);
                Map<C6014Dtx, Integer> map = c6179DxN.A03;
                Integer num = map.get(c6014Dtx);
                if (num == null) {
                    HashSet hashSetA0x = BV4.A0x(c6179DxN.A01);
                    hashSetA0x.add(c6014Dtx);
                    c6179DxN.A01 = Collections.unmodifiableSet(hashSetA0x);
                }
                BV4.A1H(c6014Dtx, map, num != null ? 1 + num.intValue() : 1);
            }
        }
        int i3 = this.A05 + 1;
        this.A05 = i3;
        if (i3 == 1) {
            C1G.A08(this.A00 == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.A06 = handlerThread;
            handlerThread.start();
            this.A08 = new CMo(this.A06.getLooper(), this);
            if (A05(this)) {
                A03(this, true);
            }
        } else if (c6014Dtx != null && (((i = this.A00) == 3 || i == 4) && this.A0A.A00(c6014Dtx) == 1)) {
            c6014Dtx.A03(this.A00);
        }
        C6159Dx2 c6159Dx2 = ((C6231DyX) this.A0K).A00;
        c6159Dx2.A09.remove(this);
        Handler handler = c6159Dx2.A01;
        handler.getClass();
        handler.removeCallbacksAndMessages(this);
    }

    @Override // X.InterfaceC5547DkP
    public final InterfaceC5392Dhj AEF() {
        A00(this);
        return this.A07;
    }

    @Override // X.InterfaceC5547DkP
    public final DrmSession$DrmSessionException AFI() {
        A00(this);
        if (this.A00 == 1) {
            return this.A09;
        }
        return null;
    }

    @Override // X.InterfaceC5547DkP
    public final UUID AJz() {
        A00(this);
        return this.A0H;
    }

    @Override // X.InterfaceC5547DkP
    public final int AL0() {
        A00(this);
        return this.A00;
    }

    @Override // X.InterfaceC5547DkP
    public final boolean AXx() {
        A00(this);
        return true;
    }

    @Override // X.InterfaceC5547DkP
    public final void Aa8(C6014Dtx c6014Dtx) {
        A00(this);
        int i = this.A05;
        if (i <= 0) {
            CNC.A02("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.A05 = i2;
        if (i2 == 0) {
            this.A00 = 0;
            this.A0C.removeCallbacksAndMessages(null);
            CMo cMo = this.A08;
            synchronized (cMo) {
                cMo.removeCallbacksAndMessages(null);
                cMo.A00 = true;
            }
            this.A08 = null;
            this.A06.quit();
            this.A06 = null;
            this.A07 = null;
            this.A09 = null;
            this.A01 = null;
            this.A02 = null;
            byte[] bArr = this.A04;
            if (bArr != null) {
                this.A0D.A6S(bArr);
                this.A04 = null;
            }
        }
        if (c6014Dtx != null) {
            C6179DxN<C6014Dtx> c6179DxN = this.A0A;
            synchronized (c6179DxN.A02) {
                Map<C6014Dtx, Integer> map = c6179DxN.A03;
                Integer num = map.get(c6014Dtx);
                if (num != null) {
                    ArrayList arrayListA0t = BV4.A0t(c6179DxN.A00);
                    arrayListA0t.remove(c6014Dtx);
                    c6179DxN.A00 = Collections.unmodifiableList(arrayListA0t);
                    int iIntValue = num.intValue();
                    if (iIntValue == 1) {
                        map.remove(c6014Dtx);
                        HashSet hashSetA0x = BV4.A0x(c6179DxN.A01);
                        hashSetA0x.remove(c6014Dtx);
                        c6179DxN.A01 = Collections.unmodifiableSet(hashSetA0x);
                    } else {
                        BV4.A1H(c6014Dtx, map, iIntValue - 1);
                    }
                }
            }
            if (c6179DxN.A00(c6014Dtx) == 0) {
                c6014Dtx.A02();
            }
        }
        InterfaceC6283Dzf interfaceC6283Dzf = this.A0K;
        int i3 = this.A05;
        C6231DyX c6231DyX = (C6231DyX) interfaceC6283Dzf;
        if (i3 == 1) {
            C6159Dx2 c6159Dx2 = c6231DyX.A00;
            if (c6159Dx2.A00 > 0) {
                long j = c6159Dx2.A06;
                c6159Dx2.A09.add(this);
                Handler handler = c6159Dx2.A01;
                handler.getClass();
                handler.postAtTime(new Runnable() { // from class: X.Dyz
                    public static final String __redex_internal_original_name = "DefaultDrmSessionManager$ReferenceCountListenerImpl$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.A00.Aa8(null);
                    }
                }, this, SystemClock.uptimeMillis() + j);
            }
        } else if (i3 == 0) {
            C6159Dx2 c6159Dx22 = c6231DyX.A00;
            c6159Dx22.A08.remove(this);
            if (c6159Dx22.A03 == this) {
                c6159Dx22.A03 = null;
            }
            C6182DxQ c6182DxQ = c6159Dx22.A07;
            Set<C6160Dx3> set = c6182DxQ.A01;
            set.remove(this);
            if (c6182DxQ.A00 == this) {
                c6182DxQ.A00 = null;
                if (!set.isEmpty()) {
                    C6160Dx3 next = set.iterator().next();
                    c6182DxQ.A00 = next;
                    next.A07();
                }
            }
            Handler handler2 = c6159Dx22.A01;
            handler2.getClass();
            handler2.removeCallbacksAndMessages(this);
            c6159Dx22.A09.remove(this);
        }
        C6159Dx2.A03(c6231DyX.A00);
    }

    @Override // X.InterfaceC5547DkP
    public final boolean AbH(String str) {
        A00(this);
        InterfaceC6174DxH interfaceC6174DxH = this.A0D;
        byte[] bArr = this.A04;
        C1G.A05(bArr);
        return interfaceC6174DxH.AbI(bArr, str);
    }
}
