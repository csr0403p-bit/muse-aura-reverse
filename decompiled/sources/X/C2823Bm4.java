package X;

import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.net.Uri;
import android.util.Range;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Bm4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2823Bm4 implements InterfaceC2616Bfh {
    public static final BdC A0n;
    public static final C2439BbS A0o;
    public static final AbstractC2440BbT A0p;
    public static final InterfaceC2695Bhv A0q;
    public static final Exception A0r;
    public static final Executor A0s;
    public static final Set<BmF> A0t = Collections.unmodifiableSet(EnumSet.of(BmF.PENDING_RECORDING, BmF.PENDING_PAUSED));
    public static final Set<BmF> A0u = Collections.unmodifiableSet(EnumSet.of(BmF.CONFIGURING, BmF.IDLING, BmF.RESETTING, BmF.STOPPING, BmF.ERROR));
    public BmM A0G;
    public BWz A0H;
    public Bm7 A0N;
    public final C2680Bhd<Boolean> A0c;
    public final C2680Bhd<BdC> A0d;
    public final InterfaceC2695Bhv A0f;
    public final Executor A0i;
    public final Executor A0j;
    public final C2680Bhd<BfR> A0l;
    public final InterfaceC2695Bhv A0m;
    public final Object A0g = C3cG.A0T();
    public final boolean A0k = AnonymousClass002.A1X(AbstractC2411BaU.A00.A01(EncoderNotUsePersistentInputSurfaceQuirk.class));
    public BmF A0M = BmF.CONFIGURING;
    public BmF A0b = null;
    public int A01 = 0;
    public Bm5 A0I = null;
    public Bm5 A0K = null;
    public long A05 = 0;
    public Bm5 A0J = null;
    public boolean A0Y = false;
    public BhO A0a = null;
    public BhO A0F = null;
    public AbstractC2527Bcy A0P = null;
    public final List<ListenableFuture<Void>> A0h = C3cG.A0h();
    public Integer A0V = null;
    public Surface A0E = null;
    public Surface A0D = null;
    public MediaMuxer A0A = null;
    public InterfaceC2849Bms A0R = null;
    public Bn4 A0S = null;
    public Integer A0T = C79.A00;
    public Uri A0B = Uri.EMPTY;
    public long A08 = 0;
    public long A09 = 0;
    public long A04 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
    public Range<Integer> A0C = null;
    public long A03 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
    public long A07 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
    public long A06 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
    public long A02 = 0;
    public int A00 = 1;
    public Throwable A0W = null;
    public BmS A0Q = null;
    public final InterfaceC2837Bmg<BmS> A0e = new Bm3(null, 60);
    public Integer A0U = C79.A0C;
    public ScheduledFuture<?> A0X = null;
    public boolean A0Z = false;
    public Bm7 A0O = null;
    public BmH A0L = null;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void A0I() {
        boolean z;
        boolean z2;
        synchronized (this.A0g) {
            BmF bmF = this.A0M;
            z = true;
            z2 = false;
            switch (bmF) {
                case CONFIGURING:
                case IDLING:
                case ERROR:
                    break;
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                    A0C(BmF.RESETTING);
                    break;
                case RECORDING:
                case PAUSED:
                    BeS.A07(AnonymousClass002.A1X(this.A0J), AnonymousClass007.A0a("In-progress recording shouldn't be null when in state ", bmF));
                    if (this.A0I != this.A0J) {
                        throw BV4.A0N("In-progress recording does not match the active recording. Unable to reset encoder.");
                    }
                    A0D(BmF.RESETTING, this);
                    z = false;
                    z2 = true;
                    break;
                case STOPPING:
                    A0D(BmF.RESETTING, this);
                    z = false;
                    break;
                case RESETTING:
                default:
                    z = false;
                    break;
            }
        }
        if (z) {
            A05();
        } else if (z2) {
            A09(this.A0J, this, null, 4, -1L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0127 A[Catch: all -> 0x019a, TryCatch #2 {, blocks: (B:34:0x00b5, B:36:0x00b9, B:37:0x00bd, B:43:0x00dd, B:44:0x00e7, B:64:0x0135, B:46:0x00eb, B:102:0x0199, B:61:0x0121, B:63:0x0127, B:66:0x0137, B:68:0x013b, B:70:0x0141, B:72:0x0149, B:77:0x0158, B:79:0x015c, B:49:0x00f9, B:51:0x00fd, B:53:0x0103, B:55:0x010b, B:57:0x0113, B:101:0x0193), top: B:116:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0137 A[Catch: all -> 0x019a, TryCatch #2 {, blocks: (B:34:0x00b5, B:36:0x00b9, B:37:0x00bd, B:43:0x00dd, B:44:0x00e7, B:64:0x0135, B:46:0x00eb, B:102:0x0199, B:61:0x0121, B:63:0x0127, B:66:0x0137, B:68:0x013b, B:70:0x0141, B:72:0x0149, B:77:0x0158, B:79:0x015c, B:49:0x00f9, B:51:0x00fd, B:53:0x0103, B:55:0x010b, B:57:0x0113, B:101:0x0193), top: B:116:0x00b5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0J(int r15, java.lang.Throwable r16) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2823Bm4.A0J(int, java.lang.Throwable):void");
    }

    static {
        C2421Bax c2421Bax = C2421Bax.A00;
        C2439BbS c2439BbSA00 = C2439BbS.A00(new C2442BbV(c2421Bax, 1), Arrays.asList(c2421Bax, C2421Bax.A01, C2421Bax.A05));
        A0o = c2439BbSA00;
        C2439BbS c2439BbS = AbstractC2440BbT.A02;
        Range<Integer> range = AbstractC2440BbT.A01;
        Range<Integer> range2 = AbstractC2440BbT.A00;
        Bd8 bd8A00 = BdD.A00(range2, range, c2439BbSA00, -1);
        A0p = bd8A00;
        Range<Integer> range3 = Be3.A00;
        Range<Integer> range4 = Be3.A01;
        if (!"".isEmpty()) {
            throw BV8.A0l("");
        }
        Be1 be1 = new Be1(range3, range4, -1);
        BdD.A00(range2, range, c2439BbS, -1);
        A0n = AbstractC2559Bdn.A00(be1, bd8A00, -1);
        A0r = BV4.A0c("The video frame producer became inactive before any data was received.");
        A0q = new InterfaceC2695Bhv() { // from class: X.Bmo
        };
        A0s = new ExecutorC2949Bpk(BpJ.A00());
    }

    private final C7446EwG A00() {
        int i;
        long j = this.A09;
        long j2 = this.A08;
        Integer num = this.A0T;
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 2) {
            i = 1;
        } else {
            i = 3;
            if (iIntValue != 4) {
                if (iIntValue != 5) {
                    throw BV4.A0N(FGI.A0M("Invalid internal audio state: ", A04(num)));
                }
                i = 4;
            }
        }
        C7466Ewy c7466Ewy = new C7466Ewy(i);
        BeS.A06(C8j3.A1Q((j > 0L ? 1 : (j == 0L ? 0 : -1))), "duration must be positive value.");
        BeS.A06(j2 >= 0, "bytes must be positive value.");
        return new C7446EwG(c7466Ewy, j, j2);
    }

    public static Bm5 A01(BmF bmF, C2823Bm4 c2823Bm4) {
        boolean z;
        if (bmF == BmF.PENDING_PAUSED) {
            z = true;
        } else {
            if (bmF != BmF.PENDING_RECORDING) {
                throw BV4.A0N("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z = false;
        }
        if (c2823Bm4.A0I != null) {
            throw BV4.A0N("Cannot make pending recording active because another recording is already active.");
        }
        Bm5 bm5 = c2823Bm4.A0K;
        if (bm5 == null) {
            throw BV4.A0N("Pending recording should exist when in a PENDING state.");
        }
        c2823Bm4.A0I = bm5;
        bm5.A00.A3j(new C2687Bhm(c2823Bm4), ExecutorC2446BbZ.A00());
        c2823Bm4.A0K = null;
        if (z) {
            A0D(BmF.PAUSED, c2823Bm4);
            return bm5;
        }
        A0D(BmF.RECORDING, c2823Bm4);
        return bm5;
    }

    public static ListenableFuture A02(C2823Bm4 c2823Bm4) {
        AbstractC2875Bni.A01("Recorder", C8j3.A14(c2823Bm4.A0R, C60O.A0x("Try to safely release video encoder: ")));
        Bm7 bm7 = c2823Bm4.A0N;
        Bm7.A00(bm7);
        return AbstractC2942BpW.A01(bm7.A07);
    }

    public static Integer A03(BmF bmF) {
        return (bmF == BmF.RECORDING || (bmF == BmF.STOPPING && AbstractC2411BaU.A00.A01(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) == null)) ? C79.A00 : C79.A01;
    }

    private void A05() {
        A0G(this, C79.A00);
        if (this.A0R != null) {
            AbstractC2875Bni.A01("Recorder", "Releasing video encoder.");
            Bm7 bm7 = this.A0O;
            if (bm7 != null) {
                InterfaceC2849Bms interfaceC2849Bms = bm7.A03;
                InterfaceC2849Bms interfaceC2849Bms2 = this.A0R;
                BeS.A07(AnonymousClass002.A1Z(interfaceC2849Bms, interfaceC2849Bms2), null);
                AbstractC2875Bni.A00(interfaceC2849Bms2, "Releasing video encoder: ", "Recorder");
                this.A0O.A01();
                this.A0O = null;
                this.A0R = null;
                this.A0S = null;
                A0K(null);
            } else {
                A02(this);
            }
        }
        synchronized (this.A0g) {
            switch (this.A0M.ordinal()) {
                case 1:
                case 2:
                    A0C(BmF.CONFIGURING);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    A0D(BmF.CONFIGURING, this);
                    break;
            }
        }
        this.A0Z = false;
        BmM bmM = this.A0G;
        if (bmM == null || bmM.A0A.isDone()) {
            return;
        }
        A07(this.A0G, this.A0H, this, false);
    }

    public static final void A06(BhO bhO, C2823Bm4 c2823Bm4) {
        AbstractC2875Bni.A00(bhO, "Update stream transformation info: ", "Recorder");
        c2823Bm4.A0a = bhO;
        synchronized (c2823Bm4.A0g) {
            C2680Bhd.A01(c2823Bm4.A0l, new C2611Bfc(bhO, A03(c2823Bm4.A0M), c2823Bm4.A01));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A07(X.BmM r8, X.BWz r9, final X.C2823Bm4 r10, boolean r11) {
        /*
            com.google.common.util.concurrent.ListenableFuture<android.view.Surface> r0 = r8.A0A
            boolean r0 = r0.isDone()
            java.lang.String r6 = "Recorder"
            if (r0 == 0) goto L10
            java.lang.String r0 = "Ignore the SurfaceRequest since it is already served."
            X.AbstractC2875Bni.A03(r6, r0)
            return
        L10:
            java.util.concurrent.Executor r1 = r10.A0j
            X.Bme r0 = new X.Bme
            r0.<init>()
            r8.A02(r0, r1)
            android.util.Size r7 = r8.A04
            X.Bcd r5 = r8.A05
            X.Bfb r0 = r8.A06
            X.BdV r1 = r0.ADJ()
            r2 = 0
            X.BpS<X.BdF, X.BbP> r0 = X.C2572Be4.A01
            X.Bcq r4 = new X.Bcq
            r4.<init>(r0, r1)
            X.Bct r0 = X.C2519Bcq.A00(r5, r4)
            if (r0 == 0) goto L6e
            java.util.TreeMap<android.util.Size, X.Bax> r1 = r0.A01
            android.util.Size r0 = X.AbstractC2484BcB.A00
            java.util.Map$Entry r0 = r1.ceilingEntry(r7)
            if (r0 != 0) goto L69
            java.util.Map$Entry r0 = r1.floorEntry(r7)
            if (r0 != 0) goto L69
            r0 = 0
        L43:
            X.Bax r0 = (X.C2421Bax) r0
            if (r0 == 0) goto L6e
        L47:
            java.lang.String r1 = "Using supported quality of "
            java.lang.StringBuilder r3 = X.C3cG.A0f(r0, r1)
            java.lang.String r1 = " for surface size "
            java.lang.String r1 = X.AnonymousClass006.A0y(r7, r1, r3)
            X.AbstractC2875Bni.A01(r6, r1)
            X.Bax r1 = X.C2421Bax.A04
            if (r0 == r1) goto L71
            X.Bcy r0 = r4.AJC(r5, r0)
            r10.A0P = r0
            if (r0 != 0) goto L71
            java.lang.String r0 = "Camera advertised available quality but did not produce EncoderProfiles  for advertised quality."
            java.lang.AssertionError r0 = X.BV4.A0N(r0)
            throw r0
        L69:
            java.lang.Object r0 = r0.getValue()
            goto L43
        L6e:
            X.Bax r0 = X.C2421Bax.A04
            goto L47
        L71:
            X.BmH r1 = r10.A0L
            if (r1 == 0) goto L86
            boolean r0 = r1.A02
            if (r0 != 0) goto L86
            r0 = 1
            r1.A02 = r0
            java.util.concurrent.ScheduledFuture<?> r0 = r1.A01
            if (r0 == 0) goto L86
            r0.cancel(r2)
            r0 = 0
            r1.A01 = r0
        L86:
            r0 = 0
            if (r11 == 0) goto L8a
            r0 = 3
        L8a:
            X.BmH r5 = new X.BmH
            r5.<init>(r8, r9, r10, r0)
            r10.A0L = r5
            X.BmM r4 = r5.A04
            X.BWz r3 = r5.A05
            X.Bm4 r0 = r5.A06
            com.google.common.util.concurrent.ListenableFuture r2 = A02(r0)
            X.Bm6 r1 = new X.Bm6
            r1.<init>(r4, r3, r5)
            java.util.concurrent.Executor r0 = r0.A0j
            r2.addListener(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2823Bm4.A07(X.BmM, X.BWz, X.Bm4, boolean):void");
    }

    public static final void A08(Bm5 bm5, C2823Bm4 c2823Bm4, Throwable th, int i) {
        boolean z;
        if (bm5 != c2823Bm4.A0J) {
            throw BV4.A0N("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (c2823Bm4.A0g) {
            BmF bmF = c2823Bm4.A0M;
            z = false;
            switch (bmF) {
                case CONFIGURING:
                case IDLING:
                case ERROR:
                    throw BV4.A0N(AnonymousClass007.A0a("In-progress recording error occurred while in unexpected state: ", bmF));
                case RECORDING:
                case PAUSED:
                    A0D(BmF.STOPPING, c2823Bm4);
                    z = true;
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                case STOPPING:
                case RESETTING:
                    if (bm5 != c2823Bm4.A0I) {
                        throw BV4.A0N("Internal error occurred for recording but it is not the active recording.");
                    }
            }
        }
        if (z) {
            A09(bm5, c2823Bm4, th, i, -1L);
        }
    }

    public static final void A09(Bm5 bm5, C2823Bm4 c2823Bm4, Throwable th, int i, final long j) {
        if (c2823Bm4.A0J != bm5 || c2823Bm4.A0Y) {
            return;
        }
        c2823Bm4.A0Y = true;
        c2823Bm4.A00 = i;
        c2823Bm4.A0W = th;
        BmS bmS = c2823Bm4.A0Q;
        if (bmS != null) {
            bmS.close();
            c2823Bm4.A0Q = null;
        }
        Integer num = c2823Bm4.A0U;
        Integer num2 = C79.A01;
        final InterfaceC2849Bms interfaceC2849Bms = c2823Bm4.A0R;
        if (num != num2) {
            Runnable runnable = new Runnable() { // from class: X.BmI
                public static final String __redex_internal_original_name = "Recorder$$ExternalSyntheticLambda8";

                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC2849Bms interfaceC2849Bms2 = interfaceC2849Bms;
                    Set<BmF> set = C2823Bm4.A0t;
                    AbstractC2875Bni.A01("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
                    if (AbstractC2411BaU.A00.A01(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
                        C2823Bm4.A0H(interfaceC2849Bms2);
                    }
                }
            };
            Executor executor = c2823Bm4.A0j;
            c2823Bm4.A0X = BoS.A00().schedule(new RunnableC2833Bmc(executor, runnable), 1000L, TimeUnit.MILLISECONDS);
        } else {
            A0H(interfaceC2849Bms);
        }
        final Bo1 bo1 = (Bo1) c2823Bm4.A0R;
        final long jA0G = BV8.A0G();
        bo1.A0R.execute(new Runnable() { // from class: X.Bo5
            public static final String __redex_internal_original_name = "EncoderImpl$$ExternalSyntheticLambda11";

            @Override // java.lang.Runnable
            public final void run() {
                final Bo1 bo12 = bo1;
                long j2 = j;
                long j3 = jA0G;
                Integer num3 = bo12.A04;
                switch (num3.intValue()) {
                    case 0:
                    case 3:
                    case 7:
                        return;
                    case 1:
                    case 2:
                        Bo1.A02(bo12, C79.A0K);
                        Long l = (Long) bo12.A01.getLower();
                        long jLongValue = l.longValue();
                        if (jLongValue == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
                            throw BV4.A0N("There should be a \"start\" before \"stop\"");
                        }
                        if (j2 == -1) {
                            j2 = j3;
                        } else if (j2 < jLongValue) {
                            AbstractC2875Bni.A03(bo12.A0L, "The expected stop time is less than the start time. Use current time as stop time.");
                            j2 = j3;
                        }
                        if (j2 < jLongValue) {
                            throw BV4.A0N("The start time should be before the stop time.");
                        }
                        bo12.A01 = Range.create(l, Long.valueOf(j2));
                        AbstractC2875Bni.A04("Stop on ", AbstractC2993BrL.A00(j2), bo12.A0L);
                        if (num3 == C79.A0C && bo12.A05 != null) {
                            bo12.A04();
                            return;
                        } else {
                            bo12.A0B = true;
                            bo12.A08 = BoS.A00().schedule(new Runnable() { // from class: X.BoK
                                public static final String __redex_internal_original_name = "EncoderImpl$$ExternalSyntheticLambda9";

                                @Override // java.lang.Runnable
                                public final void run() {
                                    final Bo1 bo13 = bo12;
                                    bo13.A0R.execute(new Runnable() { // from class: X.BoJ
                                        public static final String __redex_internal_original_name = "EncoderImpl$$ExternalSyntheticLambda2";

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Bo1 bo14 = bo13;
                                            if (bo14.A0B) {
                                                AbstractC2875Bni.A03(bo14.A0L, "The data didn't reach the expected timestamp before timeout, stop the codec.");
                                                bo14.A05 = null;
                                                bo14.A04();
                                                bo14.A0B = false;
                                            }
                                        }
                                    });
                                }
                            }, 1000L, TimeUnit.MILLISECONDS);
                            return;
                        }
                    case 4:
                    case 5:
                        Bo1.A02(bo12, C79.A00);
                        return;
                    case 6:
                    case 8:
                        throw C3cG.A0Q("Encoder is released");
                    default:
                        throw BV5.A0U("Unknown state: ", AbstractC2828BmV.A00(num3));
                }
            }
        });
    }

    public static void A0A(Bm5 bm5, C2823Bm4 c2823Bm4, boolean z) {
        if (c2823Bm4.A0J != null) {
            throw BV4.A0N("Attempted to start a new recording while another was in progress.");
        }
        long j = ((C2686Bhj) ((BmG) bm5).A01.A00).A00;
        if (j > 0) {
            long jA0G = BV6.A0G(j, 0.95d);
            c2823Bm4.A02 = jA0G;
            AbstractC2875Bni.A01("Recorder", FGI.A0B(jA0G, "File size limit in bytes: "));
        } else {
            c2823Bm4.A02 = 0L;
        }
        c2823Bm4.A0J = bm5;
        Integer num = c2823Bm4.A0T;
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                throw BV4.A0N(FGI.A0M("Incorrectly invoke startInternal in audio state ", A04(num)));
            }
            A0G(c2823Bm4, C79.A0C);
        }
        List<ListenableFuture<Void>> list = c2823Bm4.A0h;
        if (!list.isEmpty()) {
            Bpa bpaA00 = AbstractC2942BpW.A00(list);
            if (!bpaA00.isDone()) {
                bpaA00.cancel(true);
            }
            list.clear();
        }
        list.add(AbstractC2947Bpi.A02(bm5, c2823Bm4, 7));
        AbstractC2942BpW.A03(new F56(c2823Bm4, 3), AbstractC2942BpW.A00(list), ExecutorC2446BbZ.A00());
        Bo1 bo1 = (Bo1) c2823Bm4.A0R;
        bo1.A0R.execute(new RunnableC2891Bo3(bo1, BV8.A0G()));
        Bm5 bm52 = c2823Bm4.A0J;
        bm52.A01(new C2852Bmx(((BmG) bm52).A01, c2823Bm4.A00()));
        if (z && c2823Bm4.A0J == bm5 && !c2823Bm4.A0Y) {
            Bo1 bo12 = (Bo1) c2823Bm4.A0R;
            bo12.A0R.execute(new Bo9(bo12, BV8.A0G()));
            Bm5 bm53 = c2823Bm4.A0J;
            bm53.A01(new C2851Bmw(((BmG) bm53).A01, c2823Bm4.A00()));
        }
    }

    public static void A0B(Bm5 bm5, Throwable th, int i) {
        Uri uri = Uri.EMPTY;
        bm5.A00(uri);
        AbstractC2841Bmk abstractC2841Bmk = ((BmG) bm5).A01;
        C7446EwG c7446EwG = new C7446EwG(new C7466Ewy(1), 0L, 0L);
        BeS.A03(uri, "OutputUri cannot be null.");
        C2418Bas c2418Bas = new C2418Bas(uri);
        BeS.A06(i != 0, "An error type is required.");
        bm5.A01(new BmO(abstractC2841Bmk, c2418Bas, c7446EwG, th, i));
    }

    private void A0C(BmF bmF) {
        if (!A0t.contains(this.A0M)) {
            throw BV4.A0N(C8j3.A14(this.A0M, C60O.A0x("Can only updated non-pending state from a pending state, but state is ")));
        }
        if (!A0u.contains(bmF)) {
            throw BV4.A0N(AnonymousClass007.A0a("Invalid state transition. State is not a valid non-pending state while in a pending state: ", bmF));
        }
        if (this.A0b != bmF) {
            this.A0b = bmF;
            C2680Bhd<BfR> c2680Bhd = this.A0l;
            int i = this.A01;
            C2680Bhd.A01(c2680Bhd, new C2611Bfc(this.A0a, A03(bmF), i));
        }
    }

    public static final void A0D(BmF bmF, C2823Bm4 c2823Bm4) {
        BmF bmF2 = c2823Bm4.A0M;
        if (bmF2 == bmF) {
            throw BV4.A0N(AnonymousClass006.A0y(bmF, ", but Recorder is already in state ", C3cG.A0f(bmF, "Attempted to transition to state ")));
        }
        AbstractC2875Bni.A01("Recorder", AnonymousClass006.A0y(bmF, " --> ", C3cG.A0f(bmF2, "Transitioning Recorder internal state: ")));
        Set<BmF> set = A0t;
        Integer numA03 = null;
        if (set.contains(bmF)) {
            if (!set.contains(c2823Bm4.A0M)) {
                boolean zContains = A0u.contains(c2823Bm4.A0M);
                BmF bmF3 = c2823Bm4.A0M;
                if (!zContains) {
                    throw BV4.A0N(AnonymousClass007.A0a("Invalid state transition. Should not be transitioning to a PENDING state from state ", bmF3));
                }
                c2823Bm4.A0b = bmF3;
                numA03 = A03(bmF3);
            }
        } else if (c2823Bm4.A0b != null) {
            c2823Bm4.A0b = null;
        }
        c2823Bm4.A0M = bmF;
        if (numA03 == null) {
            numA03 = A03(bmF);
        }
        C2680Bhd.A01(c2823Bm4.A0l, new C2611Bfc(c2823Bm4.A0a, numA03, c2823Bm4.A01));
    }

    public static void A0E(C2823Bm4 c2823Bm4) {
        if (A0t.contains(c2823Bm4.A0M)) {
            A0D(c2823Bm4.A0b, c2823Bm4);
        } else {
            throw BV4.A0N(C8j3.A14(c2823Bm4.A0M, C60O.A0x("Cannot restore non-pending state when in state ")));
        }
    }

    public static void A0F(C2823Bm4 c2823Bm4, int i) {
        int i2 = c2823Bm4.A01;
        if (i2 != i) {
            AbstractC2875Bni.A01("Recorder", FGI.A0T("Transitioning streamId: ", " --> ", i2, i));
            c2823Bm4.A01 = i;
            C2680Bhd.A01(c2823Bm4.A0l, new C2611Bfc(c2823Bm4.A0a, A03(c2823Bm4.A0M), i));
        }
    }

    public static final void A0G(C2823Bm4 c2823Bm4, Integer num) {
        AbstractC2875Bni.A01("Recorder", FGI.A0d("Transitioning audio state: ", A04(c2823Bm4.A0T), " --> ", A04(num)));
        c2823Bm4.A0T = num;
    }

    public static void A0H(InterfaceC2849Bms interfaceC2849Bms) {
        if (interfaceC2849Bms instanceof Bo1) {
            final Bo1 bo1 = (Bo1) interfaceC2849Bms;
            bo1.A0R.execute(new Runnable() { // from class: X.BoH
                public static final String __redex_internal_original_name = "EncoderImpl$$ExternalSyntheticLambda5";

                @Override // java.lang.Runnable
                public final void run() {
                    Bo1 bo12 = bo1;
                    bo12.A0C = true;
                    if (bo12.A09) {
                        bo12.A0D.stop();
                        Bo1.A01(bo12);
                    }
                }
            });
        }
    }

    public final void A0K(Surface surface) {
        if (this.A0E != surface) {
            this.A0E = surface;
            synchronized (this.A0g) {
                A0F(this, surface != null ? surface.hashCode() : 0);
            }
        }
    }

    public final void A0L(Bm5 bm5, BmS bmS) {
        if (this.A0V == null) {
            throw BV4.A0N("Video data comes before the track is added to MediaMuxer.");
        }
        long j = this.A08;
        C2894Bo6 c2894Bo6 = (C2894Bo6) bmS;
        MediaCodec.BufferInfo bufferInfo = c2894Bo6.A00;
        long j2 = j + bufferInfo.size;
        long j3 = this.A02;
        long nanos = 0;
        if (j3 != 0 && j2 > j3) {
            AbstractC2875Bni.A07("Reach file size limit %d > %d", "Recorder", BV4.A1Y(Long.valueOf(j2), j3));
            A08(bm5, this, null, 2);
            return;
        }
        long j4 = bufferInfo.presentationTimeUs;
        long j5 = this.A04;
        if (j5 == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            this.A04 = j4;
            AbstractC2875Bni.A07("First video time: %d (%s)", "Recorder", new Object[]{Long.valueOf(j4), AbstractC2993BrL.A00(j4)});
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            nanos = timeUnit.toNanos(j4 - Math.min(j5, this.A03));
            long j6 = this.A07;
            BeS.A07(AnonymousClass002.A1L((j6 > LinkEncryptedPairingKt.LINK_COUNTER_MAX ? 1 : (j6 == LinkEncryptedPairingKt.LINK_COUNTER_MAX ? 0 : -1))), "There should be a previous data for adjusting the duration.");
            timeUnit.toNanos(j4 - j6);
        }
        MediaMuxer mediaMuxer = this.A0A;
        int iIntValue = this.A0V.intValue();
        if (c2894Bo6.A03.get()) {
            throw C3cG.A0Q("encoded data is closed.");
        }
        ByteBuffer byteBuffer = c2894Bo6.A02;
        byteBuffer.position(bufferInfo.offset);
        BV7.A19(bufferInfo, byteBuffer);
        mediaMuxer.writeSampleData(iIntValue, byteBuffer, bufferInfo);
        this.A08 = j2;
        this.A09 = nanos;
        this.A07 = j4;
        Bm5 bm52 = this.A0J;
        if (bm52 != null) {
            bm52.A01(new C2853Bmy(((BmG) bm52).A01, A00()));
        }
    }

    @Override // X.InterfaceC2616Bfh
    public final Bd1 AHY(InterfaceC2546BdX interfaceC2546BdX) {
        return new C2519Bcq(C2572Be4.A01, (InterfaceC2544BdV) interfaceC2546BdX);
    }

    @Override // X.InterfaceC2616Bfh
    public final InterfaceC2620Bfm<BdC> AHd() {
        return this.A0d;
    }

    @Override // X.InterfaceC2616Bfh
    public final InterfaceC2620Bfm<BfR> ALA() {
        return this.A0l;
    }

    @Override // X.InterfaceC2616Bfh
    public final InterfaceC2620Bfm<Boolean> AP4() {
        return this.A0c;
    }

    @Override // X.InterfaceC2616Bfh
    public final void AW2(final Integer num) {
        this.A0j.execute(new Runnable() { // from class: X.BmB
            public static final String __redex_internal_original_name = "Recorder$$ExternalSyntheticLambda13";

            public static String A00(Integer num2) {
                if (num2 == null) {
                    return HatchCcvLoggingKt.NO_POSTAL_FIELD;
                }
                switch (num2.intValue()) {
                    case 1:
                        return "ACTIVE_NON_STREAMING";
                    case 2:
                        return "INACTIVE";
                    default:
                        return "ACTIVE_STREAMING";
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                ScheduledFuture<?> scheduledFuture;
                InterfaceC2849Bms interfaceC2849Bms;
                C2823Bm4 c2823Bm4 = this.A00;
                Integer num2 = num;
                Integer num3 = c2823Bm4.A0U;
                c2823Bm4.A0U = num2;
                if (num3 == num2) {
                    AbstractC2875Bni.A04("Video source transitions to the same state: ", A00(num2), "Recorder");
                    return;
                }
                AbstractC2875Bni.A04("Video source has transitioned to state: ", A00(num2), "Recorder");
                if (num2 != C79.A0C) {
                    if (num2 != C79.A01 || (scheduledFuture = c2823Bm4.A0X) == null || !scheduledFuture.cancel(false) || (interfaceC2849Bms = c2823Bm4.A0R) == null) {
                        return;
                    }
                    C2823Bm4.A0H(interfaceC2849Bms);
                    return;
                }
                if (c2823Bm4.A0D != null) {
                    c2823Bm4.A0Z = true;
                    Bm5 bm5 = c2823Bm4.A0J;
                    if (bm5 != null) {
                        C2823Bm4.A08(bm5, c2823Bm4, null, 4);
                        return;
                    }
                    return;
                }
                BmH bmH = c2823Bm4.A0L;
                if (bmH != null) {
                    if (!bmH.A02) {
                        bmH.A02 = true;
                        ScheduledFuture<?> scheduledFuture2 = bmH.A01;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            bmH.A01 = null;
                        }
                    }
                    c2823Bm4.A0L = null;
                }
                c2823Bm4.A0I();
            }
        });
    }

    @Override // X.InterfaceC2616Bfh
    public final void AWS(final BmM bmM, final BWz bWz) {
        synchronized (this.A0g) {
            StringBuilder sbA0x = C60O.A0x("Surface is requested in state: ");
            sbA0x.append(this.A0M);
            sbA0x.append(", Current surface: ");
            AbstractC2875Bni.A01("Recorder", BV4.A0l(sbA0x, this.A01));
            if (this.A0M == BmF.ERROR) {
                A0D(BmF.CONFIGURING, this);
            }
        }
        this.A0j.execute(new Runnable() { // from class: X.BmK
            public static final String __redex_internal_original_name = "Recorder$$ExternalSyntheticLambda12";

            @Override // java.lang.Runnable
            public final void run() {
                C2823Bm4 c2823Bm4 = this;
                BmM bmM2 = bmM;
                BWz bWz2 = bWz;
                BmM bmM3 = c2823Bm4.A0G;
                if (bmM3 != null && !bmM3.A0A.isDone()) {
                    c2823Bm4.A0G.A00();
                }
                c2823Bm4.A0G = bmM2;
                c2823Bm4.A0H = bWz2;
                C2823Bm4.A07(bmM2, bWz2, c2823Bm4, true);
            }
        });
    }

    public C2823Bm4(BdC bdC, InterfaceC2695Bhv interfaceC2695Bhv, InterfaceC2695Bhv interfaceC2695Bhv2) {
        Executor executorA00 = BpJ.A00();
        this.A0i = executorA00;
        ExecutorC2949Bpk executorC2949Bpk = new ExecutorC2949Bpk(executorA00);
        this.A0j = executorC2949Bpk;
        C2558Bdm c2558Bdm = (C2558Bdm) bdC;
        AbstractC2440BbT abstractC2440BbTA00 = c2558Bdm.A02;
        Be3 be3 = c2558Bdm.A01;
        Integer numValueOf = Integer.valueOf(c2558Bdm.A00);
        Bd8 bd8 = (Bd8) abstractC2440BbTA00;
        if (bd8.A00 == -1) {
            if (abstractC2440BbTA00 == null) {
                throw C3cG.A0Q("Property \"videoSpec\" has not been set");
            }
            C2439BbS c2439BbS = bd8.A03;
            abstractC2440BbTA00 = BdD.A00(bd8.A01, bd8.A02, c2439BbS, Integer.valueOf(((Bd8) A0p).A00));
        }
        this.A0d = new C2680Bhd<>(AbstractC2559Bdn.A00(be3, abstractC2440BbTA00, numValueOf));
        this.A0l = new C2680Bhd<>(new C2611Bfc(null, A03(this.A0M), 0));
        this.A0c = new C2680Bhd<>(false);
        this.A0f = interfaceC2695Bhv;
        this.A0m = interfaceC2695Bhv2;
        this.A0N = new Bm7(interfaceC2695Bhv, executorC2949Bpk, executorA00);
    }

    public static String A04(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "INITIALIZING";
            case 1:
                return "IDLING";
            case 2:
                return "DISABLED";
            case 3:
            default:
                return "ERROR_SOURCE";
            case 4:
                return "ERROR_ENCODER";
        }
    }
}
