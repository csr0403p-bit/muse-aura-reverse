package X;

import android.os.Build;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class BVp {
    public static InterfaceC2356BVg A01(HeroPlayerSetting heroPlayerSetting, final InterfaceC2356BVg interfaceC2356BVg) {
        if (heroPlayerSetting != null) {
            Dlv dlv = heroPlayerSetting.gen;
            boolean z = dlv.enable_mv_hevc_decoder_fallback;
            if (((int) dlv.video_decoder_error_count_threshold) > 0) {
                final C2370BVy c2370BVy = new C2370BVy(interfaceC2356BVg);
                return z ? new InterfaceC2356BVg() { // from class: X.BWa
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
                    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
                    /* JADX WARN: Type inference failed for: r9v10 */
                    /* JADX WARN: Type inference failed for: r9v11 */
                    /* JADX WARN: Type inference failed for: r9v12 */
                    /* JADX WARN: Type inference failed for: r9v13 */
                    /* JADX WARN: Type inference failed for: r9v14 */
                    /* JADX WARN: Type inference failed for: r9v15 */
                    /* JADX WARN: Type inference failed for: r9v16 */
                    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
                    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
                    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
                    @Override // X.InterfaceC2356BVg
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.util.List AEg(java.lang.String r18, boolean r19, boolean r20) {
                        /*
                            r17 = this;
                            r0 = r17
                            X.BVg r3 = r1
                            r0 = r18
                            r6 = r19
                            r4 = r20
                            java.util.List r9 = r3.AEg(r0, r6, r4)
                            java.lang.String r11 = "video/mv-hevc"
                            boolean r8 = r11.equals(r0)
                            if (r8 == 0) goto L69
                            boolean r0 = r9.isEmpty()
                            if (r0 == 0) goto L69
                            if (r19 == 0) goto L22
                            java.lang.String r10 = "c2.qti.mvhevc.decoder.secure"
                            goto L24
                        L22:
                            java.lang.String r10 = "c2.qti.mvhevc.decoder"
                        L24:
                            r13 = 1
                            android.media.MediaCodecList r0 = new android.media.MediaCodecList     // Catch: java.lang.Exception -> L5b
                            r0.<init>(r13)     // Catch: java.lang.Exception -> L5b
                            android.media.MediaCodecInfo[] r7 = r0.getCodecInfos()     // Catch: java.lang.Exception -> L5b
                            int r5 = r7.length     // Catch: java.lang.Exception -> L5b
                            r2 = 0
                        L30:
                            if (r2 >= r5) goto L41
                            r1 = r7[r2]     // Catch: java.lang.Exception -> L5b
                            java.lang.String r0 = r1.getName()     // Catch: java.lang.Exception -> L5b
                            boolean r0 = r10.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> L5b
                            if (r0 != 0) goto L42
                            int r2 = r2 + 1
                            goto L30
                        L41:
                            r1 = 0
                        L42:
                            if (r1 != 0) goto L47
                            java.util.List r9 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Exception -> L5b
                            goto L69
                        L47:
                            android.media.MediaCodecInfo$CodecCapabilities r9 = r1.getCapabilitiesForType(r11)     // Catch: java.lang.Exception -> L5b
                            r14 = 0
                            r12 = r11
                            r15 = r13
                            r16 = r14
                            r17 = r6
                            X.Dwv r0 = X.C6153Dwv.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L5b
                            java.util.List r9 = java.util.Collections.singletonList(r0)     // Catch: java.lang.Exception -> L5b
                            goto L69
                        L5b:
                            r0 = move-exception
                            java.lang.Object[] r2 = X.BV7.A1b(r0)
                            java.lang.String r1 = "MediaCodecSelectorHelper"
                            java.lang.String r0 = "Failed to create MV-HEVC decoder info: %s"
                            X.AbstractC3426CMt.A03(r1, r0, r2)
                            java.util.List r9 = java.util.Collections.EMPTY_LIST
                        L69:
                            if (r8 == 0) goto Lc3
                            boolean r0 = r9.isEmpty()
                            if (r0 == 0) goto L78
                            java.lang.String r0 = "video/x-mvhevc"
                            java.util.List r9 = r3.AEg(r0, r6, r4)
                        L78:
                            boolean r0 = r9.isEmpty()
                            if (r0 == 0) goto Lc3
                            java.lang.String r8 = "video/hevc"
                            java.util.List r0 = r3.AEg(r8, r6, r4)
                            java.util.ArrayList r9 = X.C60Q.A0t(r0)
                            java.util.Iterator r10 = r0.iterator()
                        L8d:
                            boolean r0 = r10.hasNext()
                            if (r0 == 0) goto Lc3
                            java.lang.Object r7 = r10.next()
                            X.Dwv r7 = (X.C6153Dwv) r7
                            java.lang.String r5 = r7.A06
                            android.media.MediaCodecInfo$CodecCapabilities r4 = r7.A03
                            boolean r3 = r7.A09
                            boolean r2 = r7.A0C
                            boolean r1 = r7.A0E
                            boolean r0 = r7.A07
                            r19 = r0 ^ 1
                            boolean r0 = r7.A0B
                            if (r0 != 0) goto Laf
                            r20 = 0
                            if (r6 == 0) goto Lb1
                        Laf:
                            r20 = 1
                        Lb1:
                            r12 = r4
                            r13 = r5
                            r14 = r11
                            r15 = r8
                            r16 = r3
                            r17 = r2
                            r18 = r1
                            X.Dwv r0 = X.C6153Dwv.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                            r9.add(r0)
                            goto L8d
                        Lc3:
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.BWa.AEg(java.lang.String, boolean, boolean):java.util.List");
                    }
                } : c2370BVy;
            }
            if (z) {
                return new InterfaceC2356BVg() { // from class: X.BWa
                    @Override // X.InterfaceC2356BVg
                    public final List AEg(String v, boolean v2, boolean v3) {
                        /*
                            this = this;
                            r0 = r17
                            X.BVg r3 = r1
                            r0 = r18
                            r6 = r19
                            r4 = r20
                            java.util.List r9 = r3.AEg(r0, r6, r4)
                            java.lang.String r11 = "video/mv-hevc"
                            boolean r8 = r11.equals(r0)
                            if (r8 == 0) goto L69
                            boolean r0 = r9.isEmpty()
                            if (r0 == 0) goto L69
                            if (r19 == 0) goto L22
                            java.lang.String r10 = "c2.qti.mvhevc.decoder.secure"
                            goto L24
                        L22:
                            java.lang.String r10 = "c2.qti.mvhevc.decoder"
                        L24:
                            r13 = 1
                            android.media.MediaCodecList r0 = new android.media.MediaCodecList     // Catch: java.lang.Exception -> L5b
                            r0.<init>(r13)     // Catch: java.lang.Exception -> L5b
                            android.media.MediaCodecInfo[] r7 = r0.getCodecInfos()     // Catch: java.lang.Exception -> L5b
                            int r5 = r7.length     // Catch: java.lang.Exception -> L5b
                            r2 = 0
                        L30:
                            if (r2 >= r5) goto L41
                            r1 = r7[r2]     // Catch: java.lang.Exception -> L5b
                            java.lang.String r0 = r1.getName()     // Catch: java.lang.Exception -> L5b
                            boolean r0 = r10.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> L5b
                            if (r0 != 0) goto L42
                            int r2 = r2 + 1
                            goto L30
                        L41:
                            r1 = 0
                        L42:
                            if (r1 != 0) goto L47
                            java.util.List r9 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Exception -> L5b
                            goto L69
                        L47:
                            android.media.MediaCodecInfo$CodecCapabilities r9 = r1.getCapabilitiesForType(r11)     // Catch: java.lang.Exception -> L5b
                            r14 = 0
                            r12 = r11
                            r15 = r13
                            r16 = r14
                            r17 = r6
                            X.Dwv r0 = X.C6153Dwv.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L5b
                            java.util.List r9 = java.util.Collections.singletonList(r0)     // Catch: java.lang.Exception -> L5b
                            goto L69
                        L5b:
                            r0 = move-exception
                            java.lang.Object[] r2 = X.BV7.A1b(r0)
                            java.lang.String r1 = "MediaCodecSelectorHelper"
                            java.lang.String r0 = "Failed to create MV-HEVC decoder info: %s"
                            X.AbstractC3426CMt.A03(r1, r0, r2)
                            java.util.List r9 = java.util.Collections.EMPTY_LIST
                        L69:
                            if (r8 == 0) goto Lc3
                            boolean r0 = r9.isEmpty()
                            if (r0 == 0) goto L78
                            java.lang.String r0 = "video/x-mvhevc"
                            java.util.List r9 = r3.AEg(r0, r6, r4)
                        L78:
                            boolean r0 = r9.isEmpty()
                            if (r0 == 0) goto Lc3
                            java.lang.String r8 = "video/hevc"
                            java.util.List r0 = r3.AEg(r8, r6, r4)
                            java.util.ArrayList r9 = X.C60Q.A0t(r0)
                            java.util.Iterator r10 = r0.iterator()
                        L8d:
                            boolean r0 = r10.hasNext()
                            if (r0 == 0) goto Lc3
                            java.lang.Object r7 = r10.next()
                            X.Dwv r7 = (X.C6153Dwv) r7
                            java.lang.String r5 = r7.A06
                            android.media.MediaCodecInfo$CodecCapabilities r4 = r7.A03
                            boolean r3 = r7.A09
                            boolean r2 = r7.A0C
                            boolean r1 = r7.A0E
                            boolean r0 = r7.A07
                            r19 = r0 ^ 1
                            boolean r0 = r7.A0B
                            if (r0 != 0) goto Laf
                            r20 = 0
                            if (r6 == 0) goto Lb1
                        Laf:
                            r20 = 1
                        Lb1:
                            r12 = r4
                            r13 = r5
                            r14 = r11
                            r15 = r8
                            r16 = r3
                            r17 = r2
                            r18 = r1
                            X.Dwv r0 = X.C6153Dwv.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                            r9.add(r0)
                            goto L8d
                        Lc3:
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.BWa.AEg(java.lang.String, boolean, boolean):java.util.List");
                    }
                };
            }
        }
        return interfaceC2356BVg;
    }

    public static boolean A03() {
        try {
            String str = Build.MODEL;
            if (!str.contains("google_sdk") && !str.contains("Emulator") && !str.contains("sdk_gphone")) {
                String str2 = Build.HARDWARE;
                if (!str2.equals("cutf_cvm")) {
                    if (!str2.equals("cutf_ivs")) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Error | Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0027 A[PHI: r10
  0x0027: PHI (r10v5 boolean) = (r10v0 boolean), (r10v6 boolean) binds: [B:19:0x0025, B:17:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002b A[PHI: r10
  0x002b: PHI (r10v4 boolean) = (r10v0 boolean), (r10v5 boolean) binds: [B:19:0x0025, B:21:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e A[PHI: r10
  0x002e: PHI (r10v1 boolean) = (r10v4 boolean), (r10v5 boolean) binds: [B:23:0x002c, B:21:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039 A[PHI: r11
  0x0039: PHI (r11v5 boolean) = (r11v0 boolean), (r11v6 boolean) binds: [B:29:0x0037, B:27:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e A[PHI: r11
  0x003e: PHI (r11v4 boolean) = (r11v0 boolean), (r11v5 boolean) binds: [B:29:0x0037, B:31:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0070 A[PHI: r1 r5
  0x0070: PHI (r1v5 boolean) = (r1v1 boolean), (r1v6 boolean) binds: [B:50:0x006e, B:48:0x0066] A[DONT_GENERATE, DONT_INLINE]
  0x0070: PHI (r5v4 X.Dlv) = (r5v0 X.Dlv), (r5v5 X.Dlv) binds: [B:50:0x006e, B:48:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0073 A[PHI: r4 r5
  0x0073: PHI (r4v2 boolean) = (r4v0 boolean), (r4v3 boolean) binds: [B:50:0x006e, B:52:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x0073: PHI (r5v3 X.Dlv) = (r5v0 X.Dlv), (r5v4 X.Dlv) binds: [B:50:0x006e, B:52:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007c A[PHI: r4 r5 r6
  0x007c: PHI (r4v1 boolean) = (r4v2 boolean), (r4v2 boolean), (r4v3 boolean) binds: [B:56:0x0078, B:57:0x007a, B:52:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r5v1 X.Dlv) = (r5v3 X.Dlv), (r5v3 X.Dlv), (r5v4 X.Dlv) binds: [B:56:0x0078, B:57:0x007a, B:52:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r6v1 boolean) = (r6v2 boolean), (r6v2 boolean), (r6v0 boolean) binds: [B:56:0x0078, B:57:0x007a, B:52:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be A[PHI: r11 r12
  0x00be: PHI (r11v1 boolean) = (r11v4 boolean), (r11v5 boolean) binds: [B:33:0x003f, B:31:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00be: PHI (r12v0 boolean) = (r12v3 boolean), (r12v4 boolean) binds: [B:33:0x003f, B:31:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC2356BVg A00(X.DmR r13, com.facebook.video.heroplayer.setting.HeroPlayerSetting r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BVp.A00(X.DmR, com.facebook.video.heroplayer.setting.HeroPlayerSetting, boolean, boolean):X.BVg");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/Dwv;>;Ljava/lang/String;ZZZ)V */
    public static void A02(String str, List list, boolean z, boolean z2, boolean z3) {
        if ("video/av01".equals(str)) {
            if (z) {
                list.add(C6153Dwv.A00(null, "meta.dav1d.av1.decoder", "video/av01", "video/av01", false, true, false, false, false));
            }
            if (z3) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = ((C6153Dwv) it.next()).A06;
                    if (!str2.equals("c2.android.av1-dav1d.decoder") && !str2.equals("meta.dav1d.av1.decoder")) {
                        it.remove();
                    }
                }
            }
            if (z2) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((C6153Dwv) it2.next()).A06.equals("c2.android.av1.decoder")) {
                        it2.remove();
                    }
                }
            }
        }
    }
}
