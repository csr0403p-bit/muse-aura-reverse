package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.aura.gateway.JarvisProtocolKt;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DmD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5629DmD implements InterfaceC5638DmM {
    public final WeakReference<C5625Dm8> A00;

    public static C5625Dm8 A00(C5629DmD c5629DmD) {
        return c5629DmD.A00.get();
    }

    public static C5625Dm8 A01(C5629DmD c5629DmD) {
        return c5629DmD.A00.get();
    }

    public C5629DmD(C5625Dm8 c5625Dm8) {
        this.A00 = BV4.A0q(c5625Dm8);
    }

    @Override // X.InterfaceC5638DmM
    public final void ARl(int i) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            AtomicInteger atomicInteger = C5625Dm8.A0m;
            c5625Dm8A01.A0I.ARl(i);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ARq(C5723DoI c5723DoI) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            AtomicInteger atomicInteger = C5625Dm8.A0m;
            if (c5723DoI != null) {
                C5625Dm8.A0A(c5625Dm8A01, "onAudioInputFormatChanged Channels: %d, SampleRate: %d", BV5.A1a(Integer.valueOf(c5723DoI.audioChannels), c5723DoI.audioSamplingRate));
            }
            c5625Dm8A01.A0I.ARq(c5723DoI);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ARz(String str, long j) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            C5625Dm8.A0A(c5625Dm8A01, "onBlackScreenConfirmed", BV4.A1W());
            c5625Dm8A01.A0I.ARz(str, j);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AS0(Dq8 dq8, C5623Dm6 c5623Dm6, boolean z) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            C5625Dm8.A08(c5625Dm8A01, c5623Dm6, false);
            C5625Dm8.A0A(c5625Dm8A01, "onBufferingStarted", new Object[0]);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean zA1R = C8j3.A1R(((jElapsedRealtime - c5625Dm8A01.A0d) > c5625Dm8A01.A06.stallFromSeekThresholdMs ? 1 : ((jElapsedRealtime - c5625Dm8A01.A0d) == c5625Dm8A01.A06.stallFromSeekThresholdMs ? 0 : -1)));
            long j = c5625Dm8A01.A01;
            long j2 = j != -1 ? jElapsedRealtime - j : -1L;
            C5630DmE c5630DmE = c5625Dm8A01.A0e;
            if (c5630DmE != null) {
                C7384Etj.A0Y(dq8, 1);
                c5630DmE.A0T = Boolean.valueOf(zA1R);
                if (c5630DmE.A0F.mEnableMoveOffListenerDispatcher) {
                    C5630DmE.A09(c5630DmE, dq8, c5623Dm6);
                }
            }
            c5625Dm8A01.A0I.AW9(dq8, c5623Dm6, c5625Dm8A01.A08, j2, z, zA1R);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AS1(C5623Dm6 c5623Dm6, boolean z) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            C5625Dm8.A08(c5625Dm8A01, c5623Dm6, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[PHI: r1 r2
  0x002c: PHI (r1v1 X.Dq8) = (r1v0 X.Dq8), (r1v2 X.Dq8) binds: [B:16:0x0055, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x002c: PHI (r2v1 X.DmE) = (r2v0 X.DmE), (r2v2 X.DmE) binds: [B:16:0x0055, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC5638DmM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AS8(X.C5623Dm6 r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, long r12, boolean r14) {
        /*
            r6 = this;
            r6.AUj(r7)
            X.Dm8 r4 = A00(r6)
            if (r4 == 0) goto L45
            java.lang.Object[] r0 = X.BV4.A1W()
            java.lang.String r3 = "onCancelled"
            X.C5625Dm8.A0A(r4, r3, r0)
            r5 = 1
            boolean r0 = X.C5625Dm8.A0C(r4)
            if (r0 == 0) goto L46
            X.DmE r2 = X.C5625Dm8.A01(r4, r11, r5)
            if (r2 == 0) goto L46
            X.Dq8 r1 = X.BV7.A0h(r4)
            X.AnonymousClass002.A1A(r1, r5, r11)
            X.Dng r0 = r2.A0F
            boolean r0 = r0.mEnableMoveOffListenerDispatcher
            if (r0 == 0) goto L2f
        L2c:
            X.C5630DmE.A0A(r2, r1, r7, r11)
        L2f:
            X.DmF r5 = r4.A0I
            X.Dq8 r6 = X.BV7.A0g(r4)
            r5.AX3(r6, r7, r8, r9, r10, r11, r12, r14)
            X.DtM r0 = r4.A03
            r0.A00(r3)
            r4.hashCode()
            X.Dm9 r0 = r4.A0H
            X.C5626Dm9.A03(r0)
        L45:
            return
        L46:
            X.DmE r2 = r4.A0e
            if (r2 == 0) goto L2f
            X.Dq8 r1 = X.BV7.A0h(r4)
            X.AnonymousClass002.A1A(r1, r5, r11)
            X.Dng r0 = r2.A0F
            boolean r0 = r0.mEnableMoveOffListenerDispatcher
            if (r0 == 0) goto L2f
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5629DmD.AS8(X.Dm6, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, boolean):void");
    }

    @Override // X.InterfaceC5638DmM
    public final void ASF(String str, boolean z) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            AtomicInteger atomicInteger = C5625Dm8.A0m;
            C5625Dm8.A0A(c5625Dm8A01, "onCodecInitStart name: %s, isVideo %s", str, Boolean.valueOf(z));
            c5625Dm8A01.A0I.ASF(str, z);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ASG(String str, boolean z) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            AtomicInteger atomicInteger = C5625Dm8.A0m;
            C5625Dm8.A0A(c5625Dm8A01, "onCodecReleased name: %s, isVideo %s", str, Boolean.valueOf(z));
            c5625Dm8A01.A0I.ASG(str, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[PHI: r1 r2
  0x0056: PHI (r1v3 X.Dq8) = (r1v2 X.Dq8), (r1v4 X.Dq8) binds: [B:21:0x0079, B:14:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r2v2 X.DmE) = (r2v1 X.DmE), (r2v3 X.DmE) binds: [B:21:0x0079, B:14:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC5638DmM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ASL(X.C5623Dm6 r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18) {
        /*
            r13 = this;
            X.Dm8 r4 = A00(r13)
            if (r4 == 0) goto L69
            r3 = 0
            r10 = r14
            X.C5625Dm8.A08(r4, r14, r3)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = "onCompletion"
            X.C5625Dm8.A0A(r4, r0, r1)
            r5 = 1
            X.Duv r8 = X.C5625Dm8.A02(r4)
            java.lang.String r0 = r14.A0i
            java.lang.Integer r11 = X.AbstractC5716Dnz.A00(r0)
            long r0 = r14.A0M
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 > 0) goto L29
            boolean r0 = r14.A0l
            if (r0 == 0) goto L31
        L29:
            r14.A0l = r3
            r0 = -1
            r14.A0M = r0
            r14.A0N = r0
        L31:
            boolean r0 = r4.A0i
            boolean r3 = X.AnonymousClass002.A1L(r0)
            boolean r0 = r4.A0i
            r1 = r0 ^ 1
            boolean r0 = X.C5625Dm8.A0C(r4)
            r14 = r17
            if (r0 == 0) goto L6a
            X.DmE r2 = X.C5625Dm8.A01(r4, r14, r1)
            if (r2 == 0) goto L6a
            X.Dq8 r1 = X.BV7.A0h(r4)
            X.AnonymousClass002.A1B(r1, r5, r14)
            X.Dng r0 = r2.A0F
            boolean r0 = r0.mEnableMoveOffListenerDispatcher
            if (r0 == 0) goto L59
        L56:
            X.C5630DmE.A0D(r2, r1, r10, r14, r3)
        L59:
            X.DmF r7 = r4.A0I
            X.Dq8 r9 = X.BV7.A0g(r4)
            r12 = r15
            r13 = r16
            r15 = r18
            r16 = r3
            r7.AX4(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L69:
            return
        L6a:
            X.DmE r2 = r4.A0e
            if (r2 == 0) goto L59
            X.Dq8 r1 = X.BV7.A0h(r4)
            X.AnonymousClass002.A1B(r1, r5, r14)
            X.Dng r0 = r2.A0F
            boolean r0 = r0.mEnableMoveOffListenerDispatcher
            if (r0 == 0) goto L59
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5629DmD.ASL(X.Dm6, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    @Override // X.InterfaceC5638DmM
    public final void ASV(String str, boolean z, long j) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            AtomicInteger atomicInteger = C5625Dm8.A0m;
            C5625Dm8.A0A(c5625Dm8A01, "onDecoderInitialized name: %s, isVideo %s, duration: %d", str, Boolean.valueOf(z), Long.valueOf(j));
            if (z) {
                c5625Dm8A01.A0f = str;
            }
            c5625Dm8A01.A0I.ASV(str, z, j);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ASd(C5723DoI c5723DoI, String str, List<String> list, boolean z) {
        C5630DmE c5630DmE;
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            AtomicInteger atomicInteger = C5625Dm8.A0m;
            long jA0D = c5625Dm8A01.A0D();
            if (c5723DoI != null) {
                C5625Dm8.A0A(c5625Dm8A01, "onDownStreamFormatChanged Format: %s, bitrate: %d kbps, w: %d, h: %d", c5723DoI.mimeType, Integer.valueOf(c5723DoI.bitrate / 1000), Integer.valueOf(c5723DoI.width), Integer.valueOf(c5723DoI.height));
            }
            C5625Dm8.A0A(c5625Dm8A01, "onDownStreamFormatChanged customQualities: %s", list != null ? TextUtils.join(", ", list) : JarvisProtocolKt.NONE_LOG_VALUE);
            if (c5723DoI != null && (c5630DmE = c5625Dm8A01.A0e) != null && C5630DmE.A0J(c5630DmE, str, 1)) {
                C5630DmE.A0E(c5630DmE, c5723DoI);
            }
            c5625Dm8A01.A0I.ASc(c5723DoI, jA0D, str, list, z);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ASi(C5919Ds4 c5919Ds4) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            C5625Dm8.A0A(c5625Dm8A01, "onDrawnToSurface with metrics", BV4.A1W());
            c5625Dm8A01.A0I.ASi(c5919Ds4);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ASv(String str, String str2) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            AtomicInteger atomicInteger = C5625Dm8.A0m;
            c5625Dm8A01.A0I.AX8(str, str2);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AT4(String str, String str2, String str3, String str4, String str5) {
        EnumC5642DmW enumC5642DmWValueOf;
        EnumC5624Dm7 enumC5624Dm7ValueOf;
        C5630DmE c5630DmEA01;
        C5625Dm8 c5625Dm8A00 = A00(this);
        if (c5625Dm8A00 != null) {
            try {
                enumC5642DmWValueOf = EnumC5642DmW.valueOf(str);
            } catch (IllegalArgumentException | NullPointerException unused) {
                enumC5642DmWValueOf = EnumC5642DmW.A0L;
            }
            try {
                enumC5624Dm7ValueOf = EnumC5624Dm7.valueOf(str2);
            } catch (IllegalArgumentException | NullPointerException unused2) {
                enumC5624Dm7ValueOf = EnumC5624Dm7.A0n;
            }
            C5625Dm8.A0A(c5625Dm8A00, "onError", BV4.A1W());
            if (enumC5624Dm7ValueOf == EnumC5624Dm7.A0Z) {
                BV6.A0z(c5625Dm8A00.A0F, c5625Dm8A00, new String[]{enumC5642DmWValueOf.name(), "RESPONSE_CODE_410", str3, str4, str5}, 17);
            } else {
                C6060Duv c6060DuvA02 = c5625Dm8A00.A06.logStallOnPauseOnError ? C5625Dm8.A02(c5625Dm8A00) : null;
                if (!C5625Dm8.A0C(c5625Dm8A00) || (c5630DmEA01 = C5625Dm8.A01(c5625Dm8A00, str5, true)) == null) {
                    C5630DmE c5630DmE = c5625Dm8A00.A0e;
                    if (c5630DmE != null) {
                        c5630DmE.A0L(new C5790DpZ(enumC5624Dm7ValueOf, enumC5642DmWValueOf, str3, str4), BV7.A0h(c5625Dm8A00), BV7.A0i(c5625Dm8A00), str5);
                    }
                } else {
                    c5630DmEA01.A0L(new C5790DpZ(enumC5624Dm7ValueOf, enumC5642DmWValueOf, str3, str4), BV7.A0h(c5625Dm8A00), BV7.A0i(c5625Dm8A00), str5);
                }
                c5625Dm8A00.A0I.AUc(BV7.A0i(c5625Dm8A00), BV7.A0h(c5625Dm8A00), c6060DuvA02, new C5790DpZ(enumC5624Dm7ValueOf, enumC5642DmWValueOf, str3, str4), str5);
                c5625Dm8A00.A03.A00("onError");
            }
            c5625Dm8A00.hashCode();
            C5626Dm9.A03(c5625Dm8A00.A0H);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AT6(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        EnumC5642DmW enumC5642DmWValueOf;
        EnumC5624Dm7 enumC5624Dm7ValueOf;
        C5625Dm8 c5625Dm8A00 = A00(this);
        if (c5625Dm8A00 != null) {
            try {
                enumC5642DmWValueOf = EnumC5642DmW.valueOf(str);
            } catch (IllegalArgumentException | NullPointerException unused) {
                enumC5642DmWValueOf = EnumC5642DmW.A0L;
            }
            try {
                enumC5624Dm7ValueOf = EnumC5624Dm7.valueOf(str2);
            } catch (IllegalArgumentException | NullPointerException unused2) {
                enumC5624Dm7ValueOf = EnumC5624Dm7.A0n;
            }
            AtomicInteger atomicInteger = C5625Dm8.A0m;
            long jA0D = c5625Dm8A00.A0D();
            C5625Dm8.A0A(c5625Dm8A00, "onErrorRecoveryAttempt reason: %s", str6);
            C5630DmE c5630DmE = c5625Dm8A00.A0e;
            if (c5630DmE != null) {
                C5790DpZ c5790DpZ = new C5790DpZ(enumC5624Dm7ValueOf, enumC5642DmWValueOf, str3, str4);
                if (C5630DmE.A0J(c5630DmE, str7, 1)) {
                    C5630DmE.A02(EnumC7422Eva.UNKNOWN, EnumC7497EyC.UNKNOWN, c5630DmE, c5790DpZ, str7, str6);
                }
            }
            c5625Dm8A00.A0I.AT7(new C5790DpZ(enumC5624Dm7ValueOf, enumC5642DmWValueOf, str3, str4), str5, str6, str7, jA0D);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final /* synthetic */ void ATN(DEK dek) {
    }

    @Override // X.InterfaceC5638DmM
    public final void ATS(String str, long j) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            AtomicInteger atomicInteger = C5625Dm8.A0m;
            c5625Dm8A01.A0I.ATS(str, j);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ATb(String str, Map map) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            try {
                EnumC5642DmW.valueOf(str);
            } catch (IllegalArgumentException | NullPointerException unused) {
            }
            C5625Dm8.A0A(c5625Dm8A01, "onInfo", BV4.A1W());
            c5625Dm8A01.A0I.ATa(new C5892DrZ(map));
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ATm(String str, long j, long j2, long j3, long j4) {
        C5625Dm8 c5625Dm8A00 = A00(this);
        if (c5625Dm8A00 != null) {
            C5625Dm8.A0A(c5625Dm8A00, "onLatencyJump", BV4.A1W());
            c5625Dm8A00.A01 = SystemClock.elapsedRealtime();
            c5625Dm8A00.A08 = str;
            c5625Dm8A00.A0I.ATm(str, j, j2, j3, j4);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ATp(boolean z) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            C5625Dm8.A0A(c5625Dm8A01, "onLiveBroadcastInterruptStatusChanged", BV4.A1W());
            C5630DmE c5630DmE = c5625Dm8A01.A0e;
            if (c5630DmE != null && c5630DmE.A0F.mEnableMoveOffListenerDispatcher) {
                C5962Dsy c5962Dsy = new C5962Dsy();
                AbstractC8150FWo.A02(c5962Dsy, "is_broadcast_interrupted", Boolean.valueOf(z));
                c5630DmE.A0K(c5962Dsy);
            }
            c5625Dm8A01.A0I.ATp(z);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ATq(byte[] bArr, String str, long j, long j2) {
        C5625Dm8 c5625Dm8A00 = A00(this);
        if (c5625Dm8A00 != null) {
            C5625Dm8.A0A(c5625Dm8A00, "onLiveEmsg", BV4.A1W());
            c5625Dm8A00.A0I.ATq(bArr, str, j, j2);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ATr(Dq8 dq8) {
        C5631DmF c5631DmF;
        boolean z;
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            AtomicInteger atomicInteger = C5625Dm8.A0m;
            C5626Dm9 c5626Dm9 = c5625Dm8A01.A0H;
            C5625Dm8 c5625Dm8 = c5626Dm9.A0H;
            AtomicReference<Dq8> atomicReference = c5625Dm8.A0S;
            synchronized (atomicReference) {
                Dq8 dq82 = atomicReference.get();
                HeroPlayerSetting heroPlayerSetting = c5625Dm8.A06;
                if (heroPlayerSetting.gen.enable_stale_manifest_map_race_fix) {
                    synchronized (c5625Dm8.A0N) {
                        C5626Dm9.A08(c5626Dm9, dq82, dq8);
                    }
                } else {
                    C5626Dm9.A08(c5626Dm9, dq82, dq8);
                }
                if (dq82 == null || dq82.A09 <= dq8.A09) {
                    atomicReference.set(dq8);
                }
                int i = heroPlayerSetting.staleManifestThreshold;
                if (dq82 != null) {
                    int i2 = dq82.A00;
                    if (i2 < i && dq8.A00 >= i) {
                        c5631DmF = c5625Dm8.A0I;
                        z = true;
                    } else if (i2 >= i && dq8.A00 < i) {
                        c5631DmF = c5625Dm8.A0I;
                        z = false;
                    }
                    c5631DmF.AWL(z);
                }
            }
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void ATs(C5841DqX c5841DqX) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            AtomicInteger atomicInteger = C5625Dm8.A0m;
            synchronized (c5625Dm8A01.A0K) {
                c5625Dm8A01.A09.add(c5841DqX);
            }
            Dlv dlv = c5625Dm8A01.A06.gen;
            if (dlv == null || !dlv.use_lock_free_snapl_listener) {
                synchronized (c5625Dm8A01.A0M) {
                    C5630DmE c5630DmE = c5625Dm8A01.A0e;
                    if (c5630DmE != null && C5630DmE.A0J(c5630DmE, c5841DqX, 0)) {
                        c5630DmE.A0G.offer(c5841DqX);
                    }
                }
            } else {
                C5630DmE c5630DmE2 = c5625Dm8A01.A0e;
                if (c5630DmE2 != null && C5630DmE.A0J(c5630DmE2, c5841DqX, 0)) {
                    c5630DmE2.A0G.offer(c5841DqX);
                }
            }
            c5625Dm8A01.A0I.ATs(c5841DqX);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AUB(Object obj) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            C5625Dm8.A0A(c5625Dm8A01, "onMetadataMsg", BV4.A1W());
            c5625Dm8A01.A0I.AUB(obj);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AUI(byte[] bArr, long j) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            C5625Dm8.A0A(c5625Dm8A01, "onNewAudioData", BV4.A1W());
            c5625Dm8A01.A0I.AUI(bArr, j);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AUK(byte[] bArr) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            C5625Dm8.A0A(c5625Dm8A01, "onNewPCMBuffer", BV4.A1W());
            c5625Dm8A01.A0I.AUK(bArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[PHI: r1 r2
  0x004b: PHI (r1v2 X.Dq8) = (r1v1 X.Dq8), (r1v3 X.Dq8) binds: [B:22:0x0090, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x004b: PHI (r2v2 X.DmE) = (r2v1 X.DmE), (r2v3 X.DmE) binds: [B:22:0x0090, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC5638DmM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AUT(X.C5623Dm6 r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, long r29, boolean r31, boolean r32) {
        /*
            r22 = this;
            X.Dm8 r5 = A00(r22)
            if (r5 == 0) goto L80
            java.util.concurrent.atomic.AtomicInteger r0 = X.C5625Dm8.A0m
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r2 = r5.A06
            boolean r0 = r2.logPausedSeekPositionBeforeSettingState
            r9 = r23
            if (r0 == 0) goto L93
            long r16 = r9.A00()
        L14:
            r1 = 0
            X.C5625Dm8.A08(r5, r9, r1)
            boolean r0 = r2.logPausedSeekPositionBeforeSettingState
            if (r0 != 0) goto L20
            long r16 = r9.A00()
        L20:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r4 = "onPaused"
            X.C5625Dm8.A0A(r5, r4, r0)
            X.Dm9 r3 = r5.A0H
            r6 = 1
            r3.A0F = r6
            X.Duv r7 = X.C5625Dm8.A02(r5)
            boolean r0 = X.C5625Dm8.A0C(r5)
            r15 = r28
            if (r0 == 0) goto L81
            X.DmE r2 = X.C5625Dm8.A01(r5, r15, r6)
            if (r2 == 0) goto L81
            X.Dq8 r1 = X.BV7.A0g(r5)
            X.AnonymousClass002.A1B(r1, r6, r15)
            X.Dng r0 = r2.A0F
            boolean r0 = r0.mEnableMoveOffListenerDispatcher
            if (r0 == 0) goto L58
        L4b:
            r18 = r2
            r19 = r1
            r20 = r9
            r21 = r15
            r22 = r16
            X.C5630DmE.A0C(r18, r19, r20, r21, r22)
        L58:
            X.DmF r6 = r5.A0I
            X.Dq8 r8 = X.BV7.A0g(r5)
            java.lang.String r0 = r9.A0i
            java.lang.Integer r10 = X.AbstractC5716Dnz.A00(r0)
            r11 = r24
            r12 = r25
            r13 = r26
            r14 = r27
            r18 = r29
            r20 = r31
            r21 = r32
            r6.AXD(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21)
            X.DtM r0 = r5.A03
            r0.A00(r4)
            r5.hashCode()
            X.C5626Dm9.A03(r3)
        L80:
            return
        L81:
            X.DmE r2 = r5.A0e
            if (r2 == 0) goto L58
            X.Dq8 r1 = X.BV7.A0g(r5)
            X.AnonymousClass002.A1B(r1, r6, r15)
            X.Dng r0 = r2.A0F
            boolean r0 = r0.mEnableMoveOffListenerDispatcher
            if (r0 == 0) goto L58
            goto L4b
        L93:
            r16 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5629DmD.AUT(X.Dm6, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, boolean, boolean):void");
    }

    @Override // X.InterfaceC5638DmM
    public final void AUU(String str, String str2) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            AtomicInteger atomicInteger = C5625Dm8.A0m;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c5625Dm8A01.A0I.AUU(str, str2);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AUb() {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            C5625Dm8.A0A(c5625Dm8A01, "onPlaybackAboutToFinish", BV4.A1W());
            c5625Dm8A01.A0I.AUb();
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AUd(EnumC2375BWj enumC2375BWj) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            C5625Dm8.A0A(c5625Dm8A01, "onPlaybackPositionReached", BV4.A1W());
            c5625Dm8A01.A0I.AUd(enumC2375BWj);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AUf(float f) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            C5625Dm8.A0A(c5625Dm8A01, "onPlaybackSpeedChanged", BV4.A1W());
            long jA0D = c5625Dm8A01.A0D();
            C5630DmE c5630DmE = c5625Dm8A01.A0e;
            if (c5630DmE != null && c5630DmE.A0F.mEnableMoveOffListenerDispatcher) {
                C5962Dsy c5962Dsy = new C5962Dsy();
                AbstractC8150FWo.A02(c5962Dsy, "playback_speed", Double.valueOf(f));
                c5630DmE.A0K(c5962Dsy);
            }
            c5625Dm8A01.A0I.AUg(BV7.A0i(c5625Dm8A01), f, jA0D);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AUj(C5623Dm6 c5623Dm6) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            C5625Dm8.A08(c5625Dm8A01, c5623Dm6, false);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AUw(C5623Dm6 c5623Dm6, String str) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            C5625Dm8.A08(c5625Dm8A01, c5623Dm6, false);
            C5625Dm8.A0A(c5625Dm8A01, "onPrepared", new Object[0]);
            c5625Dm8A01.A0I.AUw(c5623Dm6, str);
            c5625Dm8A01.A03.A00("onPrepared");
            c5625Dm8A01.hashCode();
            C5626Dm9.A03(c5625Dm8A01.A0H);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AVF(boolean z, boolean z2) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 == null || !AnonymousClass002.A1L((c5625Dm8A01.A0a > 0L ? 1 : (c5625Dm8A01.A0a == 0L ? 0 : -1)))) {
            return;
        }
        C5625Dm8.A0A(c5625Dm8A01, "Service player was %s", z ? "evicted" : "released");
        BV6.A0z(c5625Dm8A01.A0F, c5625Dm8A01, new Object[]{Boolean.valueOf(z), Boolean.valueOf(z2)}, 12);
    }

    @Override // X.InterfaceC5638DmM
    public final void AVg(long j, long j2) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            AtomicInteger atomicInteger = C5625Dm8.A0m;
            StringBuilder sbA0g = C3cG.A0g("onSeekProcessed oldPos=");
            sbA0g.append(j);
            BV6.A13(c5625Dm8A01, BV7.A0z(" newPos=", sbA0g, j2));
            c5625Dm8A01.A0I.AVg(j, j2);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AVi(C5623Dm6 c5623Dm6, String str, long j) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            C5625Dm8.A08(c5625Dm8A01, c5623Dm6, false);
            C5625Dm8.A0A(c5625Dm8A01, "onSeeking", new Object[0]);
            C5630DmE c5630DmE = c5625Dm8A01.A0e;
            if (c5630DmE != null && C5630DmE.A0J(c5630DmE, str, 1)) {
                C5630DmE.A0I(c5630DmE, str);
            }
            c5625Dm8A01.A0I.AVh(j, str);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AVk(long j) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            C5625Dm8.A0A(c5625Dm8A01, "setRebindServicePlayerListener: message not sent to internal player", BV4.A1W());
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AWD(C5623Dm6 c5623Dm6, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        C5625Dm8 c5625Dm8A00 = A00(this);
        if (c5625Dm8A00 != null) {
            C5625Dm8.A08(c5625Dm8A00, c5623Dm6, false);
            C5625Dm8.A0A(c5625Dm8A00, "onStartedPlaying", new Object[0]);
            C5626Dm9 c5626Dm9 = c5625Dm8A00.A0H;
            c5626Dm9.A0G = false;
            C5630DmE c5630DmE = c5625Dm8A00.A0e;
            if (c5630DmE != null) {
                Dq8 dq8A0h = BV7.A0h(c5625Dm8A00);
                C7384Etj.A0Y(c5623Dm6, 0);
                if (C5630DmE.A0J(c5630DmE, dq8A0h, 1)) {
                    C5630DmE.A0B(c5630DmE, dq8A0h, c5623Dm6, str4);
                }
            }
            c5625Dm8A00.A0I.AXI(BV7.A0g(c5625Dm8A00), c5623Dm6, str, str2, str3, str4, str5, str6, str7, j, z, z2);
            c5625Dm8A00.A03.A00("onStartedPlaying");
            c5625Dm8A00.hashCode();
            C5626Dm9.A03(c5626Dm9);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AWI() {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            C5625Dm8.A0A(c5625Dm8A01, "onStopped", BV4.A1W());
            c5625Dm8A01.A0I.AWK(C5625Dm8.A02(c5625Dm8A01));
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AWZ(List<DwN> list) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            C5625Dm8.A0A(c5625Dm8A01, "onWarn", BV4.A1W());
            c5625Dm8A01.A0I.AWZ(list);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/DoI;LX/DoI;Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
    @Override // X.InterfaceC5638DmM
    public final void AWd(C5723DoI c5723DoI, C5723DoI c5723DoI2, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        EnumC5642DmW enumC5642DmWValueOf;
        EnumC5624Dm7 enumC5624Dm7ValueOf;
        C5625Dm8 c5625Dm8A00 = A00(this);
        if (c5625Dm8A00 != null) {
            try {
                enumC5642DmWValueOf = EnumC5642DmW.valueOf(str3);
            } catch (IllegalArgumentException | NullPointerException unused) {
                enumC5642DmWValueOf = EnumC5642DmW.A0L;
            }
            try {
                enumC5624Dm7ValueOf = EnumC5624Dm7.valueOf(str4);
            } catch (IllegalArgumentException | NullPointerException unused2) {
                enumC5624Dm7ValueOf = EnumC5624Dm7.A0n;
            }
            AtomicInteger atomicInteger = C5625Dm8.A0m;
            long jA0D = c5625Dm8A00.A0D();
            if (c5723DoI != null && c5723DoI2 != null) {
                C5625Dm8.A0A(c5625Dm8A00, "onTrackSelectionFallback MimeType: %s, QualityLabel: %s, nextQualityLabel: %s, reason: %s, error: %s", c5723DoI.mimeType, c5723DoI.fbQualityLabel, c5723DoI2.fbQualityLabel, str2, str5);
            }
            C5625Dm8.A0A(c5625Dm8A00, "onTrackSelectionFallback customQualities: %s", list != null ? TextUtils.join(", ", list) : JarvisProtocolKt.NONE_LOG_VALUE);
            c5625Dm8A00.A0I.AWc(new C5790DpZ(enumC5624Dm7ValueOf, enumC5642DmWValueOf, str5, str6), c5723DoI, c5723DoI2, str, str2, list, jA0D);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AXC(String str, String str2, String str3, String str4) {
        EnumC5642DmW enumC5642DmWValueOf;
        EnumC5624Dm7 enumC5624Dm7ValueOf;
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            try {
                enumC5642DmWValueOf = EnumC5642DmW.valueOf(str);
            } catch (IllegalArgumentException | NullPointerException unused) {
                enumC5642DmWValueOf = EnumC5642DmW.A0L;
            }
            try {
                enumC5624Dm7ValueOf = EnumC5624Dm7.valueOf(str2);
            } catch (IllegalArgumentException | NullPointerException unused2) {
                enumC5624Dm7ValueOf = EnumC5624Dm7.A0n;
            }
            C5625Dm8.A06(c5625Dm8A01, enumC5624Dm7ValueOf, enumC5642DmWValueOf, str3, str4);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void AXG(int i, int i2, float f) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            AtomicInteger atomicInteger = C5625Dm8.A0m;
            C5625Dm8.A0A(c5625Dm8A01, "onVideoSizeChanged: w=%d, h=%d", BV5.A1Z(i, i2));
            C5630DmE c5630DmE = c5625Dm8A01.A0e;
            if (c5630DmE != null && c5630DmE.A0F.mEnableMoveOffListenerDispatcher) {
                C5962Dsy c5962Dsy = new C5962Dsy();
                AbstractC8150FWo.A02(c5962Dsy, "video_width", Long.valueOf(i));
                AbstractC8150FWo.A02(c5962Dsy, "video_height", Long.valueOf(i2));
                c5630DmE.A0K(c5962Dsy);
            }
            c5625Dm8A01.A0I.AXG(i, i2, f);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final /* synthetic */ void AXO(String str) {
    }

    @Override // X.InterfaceC5638DmM
    public final void AXQ(String str, String str2, String str3) {
        EnumC5642DmW enumC5642DmWValueOf;
        EnumC5624Dm7 enumC5624Dm7ValueOf;
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            try {
                enumC5642DmWValueOf = EnumC5642DmW.valueOf(str);
            } catch (IllegalArgumentException | NullPointerException unused) {
                enumC5642DmWValueOf = EnumC5642DmW.A0L;
            }
            try {
                enumC5624Dm7ValueOf = EnumC5624Dm7.valueOf(str2);
            } catch (IllegalArgumentException | NullPointerException unused2) {
                enumC5624Dm7ValueOf = EnumC5624Dm7.A0n;
            }
            C5625Dm8.A0A(c5625Dm8A01, "onWarn", BV4.A1W());
            c5625Dm8A01.A0I.AXP(new C5790DpZ(enumC5624Dm7ValueOf, enumC5642DmWValueOf, str3));
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void onCues(List<DXC> list) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            C5625Dm8.A0A(c5625Dm8A01, "onCues", BV4.A1W());
            c5625Dm8A01.A0I.onCues(list);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void onImfEventEmsgReceived(byte[] bArr, String str, long j) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            C5625Dm8.A0A(c5625Dm8A01, "onImfEventEmsgReceived", BV4.A1W());
            c5625Dm8A01.A0I.onImfEventEmsgReceived(bArr, str, j);
        }
    }

    @Override // X.InterfaceC5638DmM
    public final void onVolumeChanged(float f) {
        C5625Dm8 c5625Dm8A01 = A01(this);
        if (c5625Dm8A01 != null) {
            AtomicInteger atomicInteger = C5625Dm8.A0m;
            C5625Dm8.A0A(c5625Dm8A01, "onVolumeChanged %f", Float.valueOf(f));
            c5625Dm8A01.A0Z = Math.max(0.0f, Math.min(1.0f, f));
            c5625Dm8A01.hashCode();
            C5626Dm9.A03(c5625Dm8A01.A0H);
            c5625Dm8A01.A0D();
            c5625Dm8A01.A0I.onVolumeChanged(c5625Dm8A01.A0Z);
        }
    }
}
