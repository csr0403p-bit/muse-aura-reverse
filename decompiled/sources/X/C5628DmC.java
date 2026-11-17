package X;

import android.os.Handler;
import android.os.SystemClock;
import android.util.LruCache;
import android.view.Surface;
import android.view.ViewGroup;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.common.video.HatchVideoPlayer;
import com.facebook.debug.tracer.Tracer;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DmC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5628DmC implements InterfaceC5756Dor {
    public boolean A00;
    public final /* synthetic */ C5627DmA A01;

    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(X.C5790DpZ r6, java.lang.String r7) {
        /*
            r4 = 0
            X.DmW r5 = r6.A03
            X.DmW r0 = X.EnumC5642DmW.A02
            if (r5 == r0) goto L23
            X.DmW r0 = X.EnumC5642DmW.A06
            if (r5 == r0) goto L23
            X.DmW r0 = X.EnumC5642DmW.A0E
            if (r5 == r0) goto L23
            X.DmW r0 = X.EnumC5642DmW.A0F
            if (r5 == r0) goto L23
            X.DmW r0 = X.EnumC5642DmW.A08
            if (r5 == r0) goto L23
            java.lang.String r1 = r6.A01
            java.lang.String r3 = "meta.dav1d.av1.decoder"
            if (r1 == 0) goto L24
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L24
        L23:
            return r4
        L24:
            boolean r0 = r3.equals(r1)
            r2 = 1
            if (r0 != 0) goto L3d
            java.lang.String r1 = r6.A04
            if (r1 == 0) goto L4a
            boolean r0 = X.C7BY.A0q(r1, r3, r4)
            if (r0 == r2) goto L3d
            java.lang.String r0 = "Dav1dMediaCodecAdapter"
            boolean r0 = X.C7BY.A0q(r1, r0, r4)
            if (r0 != r2) goto L4a
        L3d:
            r1 = 1
        L3e:
            X.Dm7 r0 = r6.A02
            if (r0 == 0) goto L23
            int r0 = r0.ordinal()
            switch(r0) {
                case 18: goto L59;
                case 19: goto L59;
                case 24: goto L59;
                case 62: goto L59;
                case 111: goto L50;
                case 112: goto L50;
                case 113: goto L50;
                case 115: goto L58;
                case 116: goto L58;
                case 119: goto L58;
                case 120: goto L50;
                case 122: goto L58;
                case 123: goto L58;
                case 129: goto L50;
                default: goto L49;
            }
        L49:
            return r4
        L4a:
            X.DmW r0 = X.EnumC5642DmW.A03
            r1 = 0
            if (r5 != r0) goto L3e
            goto L3d
        L50:
            if (r1 != 0) goto L58
            boolean r0 = r3.equals(r7)
            if (r0 == 0) goto L23
        L58:
            return r2
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5628DmC.A01(X.DpZ, java.lang.String):boolean");
    }

    @Override // X.InterfaceC5756Dor
    public final synchronized void ARl(int i) {
        C5627DmA c5627DmA = this.A01;
        c5627DmA.A14 += i;
        c5627DmA.A13++;
    }

    @Override // X.InterfaceC5756Dor
    public final void ARz(String str, long j) {
        C7384Etj.A0Y(str, 0);
    }

    @Override // X.InterfaceC5756Dor
    public final void ASF(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        C5643DmX c5643DmX = this.A01.A15;
        if (c5643DmX != null) {
            C5643DmX.A00(c5643DmX, new RunnableC5969DtA(c5643DmX));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void ASG(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
    }

    @Override // X.InterfaceC5756Dor
    public final void ASV(String str, boolean z, long j) {
        C7384Etj.A0Y(str, 0);
        C5627DmA c5627DmA = this.A01;
        if (z) {
            c5627DmA.A0p.set(str);
            c5627DmA.A0A = Integer.valueOf((int) j);
        } else {
            c5627DmA.A0o.set(str);
            c5627DmA.A09 = Integer.valueOf((int) j);
        }
        C5643DmX c5643DmX = c5627DmA.A15;
        if (c5643DmX != null) {
            C5643DmX.A00(c5643DmX, new RunnableC5970DtB(c5643DmX));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AT7(C5790DpZ c5790DpZ, String str, String str2, String str3, long j) {
        AnonymousClass005.A12(str, str2, str3, 1);
        C5643DmX c5643DmX = this.A01.A15;
        if (c5643DmX != null) {
            C5643DmX.A00(c5643DmX, new RunnableC5930DsN(c5643DmX, c5790DpZ));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void ATS(String str, long j) {
        C7384Etj.A0Y(str, 0);
    }

    @Override // X.InterfaceC5756Dor
    public final void ATm(String str, long j, long j2, long j3, long j4) {
        C7384Etj.A0Y(str, 4);
        C5643DmX c5643DmX = this.A01.A15;
        if (c5643DmX != null) {
            C5643DmX.A00(c5643DmX, new DtD(c5643DmX));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AUB(Object obj) {
        C7384Etj.A0Y(obj, 0);
    }

    @Override // X.InterfaceC5756Dor
    public final void AUI(byte[] bArr, long j) {
        C7384Etj.A0Y(bArr, 0);
    }

    @Override // X.InterfaceC5756Dor
    public final void AUb() {
    }

    @Override // X.InterfaceC5756Dor
    public final void AUc(C5623Dm6 c5623Dm6, Dq8 dq8, C6060Duv c6060Duv, C5790DpZ c5790DpZ, String str) {
        C7384Etj.A0Y(c5623Dm6, 0);
        AnonymousClass005.A12(dq8, c5790DpZ, str, 1);
        C5627DmA c5627DmA = this.A01;
        c5790DpZ.toString();
        A00(c5790DpZ, c5623Dm6.A0j);
        if (c5627DmA.A0s && C5627DmA.A0A(c5627DmA, c5790DpZ)) {
            return;
        }
        HeroPlayerSetting heroPlayerSetting = c5627DmA.A0Q;
        if (!heroPlayerSetting.gen.move_groot_error_state) {
            c5627DmA.A0c.set(true);
        }
        C5627DmA.A07(c5627DmA, true);
        c5627DmA.A0H.onPlaybackError(c5623Dm6, dq8, c6060Duv, c5790DpZ, str);
        C5643DmX c5643DmX = c5627DmA.A15;
        if (c5643DmX != null) {
            C5643DmX.A00(c5643DmX, new RunnableC5861Dqv(c5643DmX, c6060Duv, c5790DpZ, dq8, c5623Dm6));
            if (heroPlayerSetting.gen.move_groot_error_state) {
                c5627DmA.A0c.set(true);
            }
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AUd(EnumC2375BWj enumC2375BWj) {
        C7384Etj.A0Y(enumC2375BWj, 0);
    }

    @Override // X.InterfaceC5756Dor
    public final void AUg(C5623Dm6 c5623Dm6, float f, long j) {
        C7384Etj.A0Y(c5623Dm6, 2);
        C5643DmX c5643DmX = this.A01.A15;
        if (c5643DmX != null) {
            C5643DmX.A00(c5643DmX, new RunnableC5931DsP(c5643DmX, c5623Dm6));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AUx() {
    }

    @Override // X.InterfaceC5756Dor
    public final void AWG(C5623Dm6 c5623Dm6, long j, long j2, boolean z, boolean z2, boolean z3) {
        C7384Etj.A0Y(c5623Dm6, 0);
        C5627DmA c5627DmA = this.A01;
        c5627DmA.A0H.onStopBuffering((int) j2);
        C5643DmX c5643DmX = c5627DmA.A15;
        if (c5643DmX != null) {
            c5627DmA.A07.A0D();
            C5643DmX.A00(c5643DmX, new DsM(c5643DmX, c5623Dm6));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AWK(C6060Duv c6060Duv) {
        C7384Etj.A0Y(c6060Duv, 0);
    }

    @Override // X.InterfaceC5756Dor
    public final void AWZ(List<? extends DwN> list) {
        C7384Etj.A0Y(list, 0);
    }

    @Override // X.InterfaceC5756Dor
    public final void AX3(Dq8 dq8, C5623Dm6 c5623Dm6, String str, String str2, String str3, String str4, long j, boolean z) {
        boolean zA1Z = AnonymousClass005.A1Z(c5623Dm6, dq8, str);
        C7384Etj.A0Y(str3, 4);
        C7384Etj.A0Y(str4, 7);
        C5627DmA c5627DmA = this.A01;
        C5643DmX c5643DmX = c5627DmA.A15;
        if (c5643DmX != null) {
            SystemClock.elapsedRealtime();
            C5643DmX.A00(c5643DmX, new RunnableC5906Drp(c5643DmX, dq8, c5623Dm6));
        }
        C5627DmA.A04(c5627DmA, str, j, SystemClock.elapsedRealtime() - c5627DmA.A00);
        C5627DmA.A07(c5627DmA, zA1Z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    @Override // X.InterfaceC5756Dor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AX4(X.C6060Duv r6, X.Dq8 r7, X.C5623Dm6 r8, java.lang.Integer r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        /*
            r5 = this;
            r0 = 0
            X.AnonymousClass005.A16(r8, r7, r6, r9, r0)
            r0 = 8
            X.C7384Etj.A0Y(r12, r0)
            X.DmA r3 = r5.A01
            X.DmX r5 = r3.A15
            if (r5 == 0) goto L1d
            X.DoJ r0 = r5.A01
            java.util.ArrayList r9 = r0.AFt()
            X.DoH r4 = new X.DoH
            r4.<init>(r5, r6, r7, r8, r9)
            X.C5643DmX.A00(r5, r4)
        L1d:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r3.A0Q
            X.Dlv r0 = r0.gen
            boolean r0 = r0.keep_audio_focus_on_looping_complete
            r2 = 1
            if (r0 == 0) goto L2f
            X.DmR r0 = r3.A08
            if (r0 == 0) goto L2f
            boolean r1 = r0.A0D
            r0 = 1
            if (r1 == r2) goto L30
        L2f:
            r0 = 0
        L30:
            r0 = r0 ^ 1
            X.C5627DmA.A07(r3, r0)
            com.facebook.aura.common.video.HatchVideoPlayerGrootListener r2 = r3.A0H
            long r0 = r8.A00()
            r2.onVideoComplete(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5628DmC.AX4(X.Duv, X.Dq8, X.Dm6, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    @Override // X.InterfaceC5756Dor
    public final void AXB(C5790DpZ c5790DpZ) {
        long j;
        C7384Etj.A0Y(c5790DpZ, 0);
        C5627DmA c5627DmA = this.A01;
        if (C5627DmA.A09(c5627DmA) && C5627DmA.A0B(c5627DmA, c5790DpZ)) {
            C5623Dm6 c5623Dm6A0i = BV7.A0i(c5627DmA.A07);
            if (A01(c5790DpZ, c5623Dm6A0i != null ? c5623Dm6A0i.A0j : null)) {
                c5790DpZ.A00 = new C5955Dsq(C79.A0T);
                return;
            }
        }
        EnumC5624Dm7 enumC5624Dm7 = c5790DpZ.A02;
        if (enumC5624Dm7 != null) {
            int iOrdinal = enumC5624Dm7.ordinal();
            if (iOrdinal == 111) {
                j = c5627DmA.A0Q.gen.stall_with_healthy_buffer_recovery_mode;
            } else if (iOrdinal == 129) {
                j = c5627DmA.A0Q.gen.stuck_buffering_recovery_mode;
            }
            if (j == 3) {
                C5625Dm8 c5625Dm8 = c5627DmA.A07;
                C5625Dm8.A0A(c5625Dm8, "retry video playback with stop", new Object[0]);
                C5625Dm8.A0B(c5625Dm8.A0F.obtainMessage(61), c5625Dm8);
                return;
            } else if (j == 2) {
                return;
            }
        }
        A00(c5790DpZ, null);
        if (c5627DmA.A0s) {
            C5627DmA.A0A(c5627DmA, c5790DpZ);
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AXD(C6060Duv c6060Duv, Dq8 dq8, C5623Dm6 c5623Dm6, Integer num, String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z, boolean z2) {
        AnonymousClass005.A12(c5623Dm6, dq8, c6060Duv, 0);
        C60O.A1N(num, 6, str3);
        C7384Etj.A0Y(str5, 12);
        C5627DmA c5627DmA = this.A01;
        C5643DmX c5643DmX = c5627DmA.A15;
        if (c5643DmX != null) {
            Tracer.A01("GrootBaseTextureViewControllerImpl.getGrootSurfaceListenerLogger");
            Tracer.A00();
            TextureViewSurfaceTextureListenerC5632DmG textureViewSurfaceTextureListenerC5632DmG = c5627DmA.A18.A01;
            Surface surface = textureViewSurfaceTextureListenerC5632DmG != null ? textureViewSurfaceTextureListenerC5632DmG.A00 : null;
            String hexString = HatchCcvLoggingKt.NO_POSTAL_FIELD;
            if (surface != null) {
                hexString = Integer.toHexString(surface.hashCode());
            }
            C7384Etj.A0U(hexString);
            C5643DmX.A00(c5643DmX, new RunnableC5721DoG(c5643DmX, c6060Duv, dq8, c5623Dm6, c5643DmX.A01.AFt()));
        }
        C5627DmA.A06(c5627DmA, false);
        HandlerC5659Dmo handlerC5659Dmo = c5627DmA.A05;
        if (handlerC5659Dmo != null) {
            AtomicReference<BWI> atomicReference = handlerC5659Dmo.A01;
            BWI bwi = atomicReference.get();
            BWI bwi2 = BWI.A04;
            if (bwi != bwi2) {
                HandlerC5659Dmo.A00(handlerC5659Dmo);
            }
            handlerC5659Dmo.removeMessages(2);
            handlerC5659Dmo.A03 = 0;
            atomicReference.set(bwi2);
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AXG(int i, int i2, float f) {
        this.A00 = true;
        if (i <= 0 || i2 <= 0) {
            EnumC5642DmW enumC5642DmW = EnumC5642DmW.A0D;
            EnumC5624Dm7 enumC5624Dm7 = EnumC5624Dm7.A0K;
            StringBuilder sbA0y = C60O.A0y("onVideoSizeChanged: width=", i);
            sbA0y.append(", height=");
            sbA0y.append(i2);
            sbA0y.append(", pixelWidthHeightRatio=");
            sbA0y.append(f);
            AXP(new C5790DpZ(enumC5624Dm7, enumC5642DmW, sbA0y.toString()));
            if (i == 0 && i2 == 0) {
                return;
            }
        }
        C5627DmA c5627DmA = this.A01;
        c5627DmA.A0H.onVideoSizeUpdated(i, i2, f);
        C5643DmX c5643DmX = c5627DmA.A15;
        if (c5643DmX != null) {
            C5643DmX.A00(c5643DmX, new RunnableC5979DtL(c5643DmX));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AXJ(C5623Dm6 c5623Dm6) {
        C7384Etj.A0Y(c5623Dm6, 0);
    }

    @Override // X.InterfaceC5756Dor
    public final void AXP(C5790DpZ c5790DpZ) {
        C7384Etj.A0Y(c5790DpZ, 0);
        C5627DmA c5627DmA = this.A01;
        List<String> listA0Z = c5627DmA.A1A;
        if (listA0Z.size() >= 5) {
            listA0Z = AbstractC0878AGe.A0Z(listA0Z, 1);
        }
        c5627DmA.A1A = AbstractC0878AGe.A0Q(c5790DpZ.toString(), listA0Z);
        C5643DmX c5643DmX = c5627DmA.A15;
        if (c5643DmX != null) {
            C5643DmX.A00(c5643DmX, new DsO(c5643DmX, c5790DpZ));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void onCues(List<DXC> list) {
        C7384Etj.A0Y(list, 0);
    }

    public C5628DmC(C5627DmA c5627DmA) {
        this.A01 = c5627DmA;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(X.C5790DpZ r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5628DmC.A00(X.DpZ, java.lang.String):void");
    }

    @Override // X.InterfaceC5756Dor
    public final void ASi(C5919Ds4 c5919Ds4) {
        ViewGroup viewGroup;
        int i;
        TextureViewSurfaceTextureListenerC5632DmG textureViewSurfaceTextureListenerC5632DmG;
        Surface surface;
        C5627DmA c5627DmA = this.A01;
        if (!this.A00) {
            AXP(new C5790DpZ(EnumC5624Dm7.A0K, EnumC5642DmW.A0D, "onVideoSizeChanged was never called before onDrawnToSurface"));
        }
        HeroPlayerSetting heroPlayerSetting = c5627DmA.A0Q;
        if (heroPlayerSetting.gen.retry_surface_invalid_on_first_frame && c5627DmA.A02 != null && (textureViewSurfaceTextureListenerC5632DmG = c5627DmA.A18.A01) != null && (surface = textureViewSurfaceTextureListenerC5632DmG.A00) != null) {
            surface.isValid();
        }
        c5627DmA.A0H.onDrawnToSurface();
        Dlv dlv = heroPlayerSetting.gen;
        if (dlv.enable_zero_sized_container_recovery && (viewGroup = c5627DmA.A03) != null && (viewGroup.getWidth() < (i = (int) dlv.zero_sized_container_min_size) || viewGroup.getHeight() < i)) {
            AXP(new C5790DpZ(EnumC5624Dm7.A0J, EnumC5642DmW.A0D, FGI.A0T("UndersizedContainerAtFirstFrame ", "x", viewGroup.getWidth(), viewGroup.getHeight())));
            if (C3cH.A1K()) {
                viewGroup.requestLayout();
            } else {
                C5627DmA.A1B.post(new RunnableC5905Dro(viewGroup));
            }
        }
        C5643DmX c5643DmX = c5627DmA.A15;
        if (c5643DmX != null) {
            C5643DmX.A00(c5643DmX, new RunnableC5971DtC(c5643DmX));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void ATQ() {
        C5627DmA.A1B.post(new DrR(this.A01));
    }

    @Override // X.InterfaceC5756Dor
    public final void ATp(boolean z) {
        C5643DmX c5643DmX = this.A01.A15;
        if (c5643DmX != null) {
            C5643DmX.A00(c5643DmX, new RunnableC5972DtE(c5643DmX));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AUU(String str, String str2) {
        C5643DmX c5643DmX = this.A01.A15;
        if (c5643DmX != null) {
            C5643DmX.A00(c5643DmX, new RunnableC5975DtH(c5643DmX));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AVg(long j, long j2) {
        C5643DmX c5643DmX = this.A01.A15;
        if (c5643DmX != null) {
            C5643DmX.A00(c5643DmX, new RunnableC5973DtF(c5643DmX));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AVh(long j, String str) {
        C5643DmX c5643DmX = this.A01.A15;
        if (c5643DmX != null) {
            C5643DmX.A00(c5643DmX, new RunnableC5974DtG(c5643DmX));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AXE(C5623Dm6 c5623Dm6) {
        C5627DmA c5627DmA = this.A01;
        C5643DmX c5643DmX = c5627DmA.A15;
        c5627DmA.A00 = SystemClock.elapsedRealtime();
        if (c5643DmX != null) {
            c5627DmA.A07.A0D();
            C7384Etj.A0Y(c5627DmA.A0B, 4);
            C5643DmX.A00(c5643DmX, new DsQ(c5643DmX, c5623Dm6));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AXF() {
        C5643DmX c5643DmX = this.A01.A15;
        if (c5643DmX != null) {
            C5643DmX.A00(c5643DmX, new RunnableC5978DtK(c5643DmX));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AXL(boolean z, boolean z2) {
        C5720DoF c5720DoF = this.A01.A04;
        if (c5720DoF != null) {
            synchronized (c5720DoF) {
                HeroPlayerSetting heroPlayerSetting = c5720DoF.A02;
                if (heroPlayerSetting.enableBlackscreenDetector || heroPlayerSetting.gen.enable_blackscreen_detector) {
                    c5720DoF.A04 = z ? SystemClock.elapsedRealtime() : -1L;
                    if (heroPlayerSetting.gen.enable_blackscreen_detector && z) {
                        Handler handler = c5720DoF.A00;
                        Runnable runnable = c5720DoF.A03;
                        handler.removeCallbacks(runnable);
                        handler.postDelayed(runnable, heroPlayerSetting.blackscreenSampleIntervalMs);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void ARq(C5723DoI c5723DoI) {
    }

    @Override // X.InterfaceC5756Dor
    public final void ASc(C5723DoI c5723DoI, long j, String str, List<String> list, boolean z) {
        AnonymousClass003.A0v(c5723DoI, str);
        String str2 = c5723DoI.mimeType;
        if (str2 != null && str2.startsWith("video")) {
            this.A01.A0n.set(c5723DoI);
        }
        String str3 = c5723DoI.mimeType;
        if (str3 != null && str3.startsWith("audio")) {
            this.A01.A0m.set(c5723DoI);
        }
        C5643DmX c5643DmX = this.A01.A15;
        if (c5643DmX != null) {
            C5643DmX.A00(c5643DmX, new RunnableC5839DqV(c5643DmX, c5723DoI, list));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void ATa(C5892DrZ c5892DrZ) {
    }

    @Override // X.InterfaceC5756Dor
    public final void ATq(byte[] bArr, String str, long j, long j2) {
        LruCache<Long, Long> lruCache;
        AnonymousClass003.A0u(bArr, str);
        if ("urn:fb:metadata".equals(str) || str.length() <= 0) {
            return;
        }
        C5627DmA c5627DmA = this.A01;
        if (c5627DmA.A0Q.enableDeduplicateImfEmsgAtPlayer) {
            HashMap<String, LruCache<Long, Long>> map = c5627DmA.A0V;
            if (!map.containsKey(str) || (lruCache = map.get(str)) == null || lruCache.get(Long.valueOf(j)) == null) {
                if (!map.containsKey(str)) {
                    map.put(str, new LruCache<>(1000));
                }
                LruCache<Long, Long> lruCache2 = map.get(str);
                if (lruCache2 != null) {
                    lruCache2.put(Long.valueOf(j), Long.valueOf(j2));
                }
                c5627DmA.A0U.put(str, new DuX(bArr));
            }
        }
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void ATs(C5841DqX c5841DqX) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AUK(byte[] bArr) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AUw(C5623Dm6 c5623Dm6, String str) {
        AnonymousClass003.A0u(c5623Dm6, str);
        C5627DmA c5627DmA = this.A01;
        c5627DmA.A0H.onPrepared(c5623Dm6.A00(), str);
        C5643DmX c5643DmX = c5627DmA.A15;
        if (c5643DmX != null) {
            c5623Dm6.A00();
            C5643DmX.A00(c5643DmX, new RunnableC5976DtI(c5643DmX));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AW9(Dq8 dq8, C5623Dm6 c5623Dm6, String str, long j, boolean z, boolean z2) {
        AnonymousClass003.A0u(c5623Dm6, dq8);
        C7384Etj.A0Y(str, 5);
        C5627DmA c5627DmA = this.A01;
        C5643DmX c5643DmX = c5627DmA.A15;
        if (c5643DmX != null) {
            c5627DmA.A07.A0D();
            C5643DmX.A00(c5643DmX, new RunnableC5907Drq(c5643DmX, dq8, c5623Dm6));
        }
        c5627DmA.A0H.onStartBuffering(z2);
    }

    @Override // X.InterfaceC5756Dor
    public final void AWL(boolean z) {
    }

    /* JADX WARN: Incorrect types in method signature: (LX/DoI;LX/DoI;JLjava/lang/String;Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;LX/DpZ;)V */
    @Override // X.InterfaceC5756Dor
    public final void AWc(C5790DpZ c5790DpZ, C5723DoI c5723DoI, C5723DoI c5723DoI2, String str, String str2, List list, long j) {
        AnonymousClass005.A0y(c5723DoI, c5723DoI2, str);
        AnonymousClass003.A0z(str2, c5790DpZ);
        C5643DmX c5643DmX = this.A01.A15;
        if (c5643DmX != null) {
            C5643DmX.A00(c5643DmX, new RunnableC5807Dpr(c5643DmX, c5790DpZ, c5723DoI, c5723DoI2, list));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AX8(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        C5643DmX c5643DmX = this.A01.A15;
        if (c5643DmX != null) {
            C5643DmX.A00(c5643DmX, new RunnableC5977DtJ(c5643DmX));
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void AXI(Dq8 dq8, C5623Dm6 c5623Dm6, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        Surface surface;
        AnonymousClass003.A0w(c5623Dm6, dq8);
        C7384Etj.A0Y(str3, 6);
        C7384Etj.A0Y(str7, 11);
        C5627DmA c5627DmA = this.A01;
        if (c5627DmA.A0Y.get() || c5627DmA.A0Q.enableGrootAlwaysSendPlayStarted) {
            Iterator<HatchVideoPlayer.Listener> it = c5627DmA.A0H.listeners.iterator();
            while (it.hasNext()) {
                it.next().onIsPlayingChanged(true);
            }
        }
        C5643DmX c5643DmX = c5627DmA.A15;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - c5627DmA.A00;
        if (c5643DmX != null) {
            C7384Etj.A0Y(c5627DmA.A0B, 15);
            C5643DmX.A00(c5643DmX, new RunnableC5908Drr(c5643DmX, dq8, c5623Dm6));
        }
        C5627DmA.A04(c5627DmA, str3, j, jElapsedRealtime);
        HandlerC5659Dmo handlerC5659Dmo = c5627DmA.A05;
        if (handlerC5659Dmo != null) {
            handlerC5659Dmo.A03 = (int) c5623Dm6.A00();
            handlerC5659Dmo.A01.set(BWI.A03);
            handlerC5659Dmo.removeMessages(2);
            handlerC5659Dmo.sendEmptyMessageDelayed(2, 200L);
        }
        if (c5627DmA.A0Q.enabledViewManagementInGroot) {
            TextureViewSurfaceTextureListenerC5632DmG textureViewSurfaceTextureListenerC5632DmG = c5627DmA.A18.A01;
            if (textureViewSurfaceTextureListenerC5632DmG != null && (surface = textureViewSurfaceTextureListenerC5632DmG.A00) != null) {
                surface.isValid();
            }
            Tracer.A01("GrootBaseTextureViewControllerImpl.getGrootSurfaceListenerLogger");
            Tracer.A00();
            C5627DmA.A06(c5627DmA, true);
        }
    }

    @Override // X.InterfaceC5756Dor
    public final void onIsLoadingChanged(boolean z) {
    }

    @Override // X.InterfaceC5756Dor
    public final void onVolumeChanged(float f) {
    }

    @Override // X.InterfaceC5756Dor
    public final void onImfEventEmsgReceived(byte[] bArr, String str, long j) {
        AnonymousClass003.A0u(bArr, str);
    }
}
