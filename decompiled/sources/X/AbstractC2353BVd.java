package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import meta.androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;

/* renamed from: X.BVd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2353BVd {
    public static boolean A00() {
        List<C6153Dwv> listA04;
        try {
            listA04 = C6155Dwy.A04("video/av01", false, false);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            AbstractC3426CMt.A04("AV1Helper", "Failed to query AV1 decoders on device with exception %s.", BV7.A1b(e));
            listA04 = null;
        }
        if (listA04 == null) {
            return false;
        }
        for (C6153Dwv c6153Dwv : listA04) {
            if (c6153Dwv != null && c6153Dwv.A06.equals("c2.android.av1-dav1d.decoder")) {
                return true;
            }
        }
        return false;
    }

    public static boolean A01(C6154Dwx c6154Dwx, HeroPlayerSetting heroPlayerSetting, InterfaceC2356BVg interfaceC2356BVg) {
        if (!BV6.A1W(c6154Dwx, "video/av01") || c6154Dwx.A0T != null || !A02(heroPlayerSetting, true)) {
            return false;
        }
        if (!heroPlayerSetting.addMetaDav1dMediaCodecInfo || BVp.A03()) {
            return true;
        }
        try {
            ArrayList arrayListA0t = BV4.A0t(C6155Dwy.A01(c6154Dwx, interfaceC2356BVg, false, false));
            Collections.sort(arrayListA0t, new C7573F4m(new C6258Dz8(c6154Dwx), 7));
            if (arrayListA0t.isEmpty()) {
                return false;
            }
            return "meta.dav1d.av1.decoder".equals(((C6153Dwv) arrayListA0t.get(0)).A06);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            BzX.A01("AV1Helper", e, "Failed to resolve the AV1 decoder for a concrete format");
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A02(com.facebook.video.heroplayer.setting.HeroPlayerSetting r7, boolean r8) {
        /*
            r6 = 0
            if (r8 == 0) goto L3d
            boolean r0 = X.BVp.A03()
            r5 = 1
            boolean r4 = X.AnonymousClass002.A1L(r0)
            boolean r1 = r7.prioritizeAv1HardwareDecoder
            java.util.HashSet<java.lang.String> r0 = r7.blockListedHardwareDecoderMap
            boolean r0 = A03(r0, r1)
            boolean r3 = X.AnonymousClass002.A1L(r0)
            boolean r0 = r7.prioritizeAv1PlatformDecoder
            if (r0 != 0) goto L1e
            if (r4 == 0) goto L25
        L1e:
            boolean r0 = A00()
            r2 = 1
            if (r0 != 0) goto L26
        L25:
            r2 = 0
        L26:
            boolean r0 = r7.addMetaDav1dMediaCodecInfo
            if (r0 == 0) goto L2d
            r1 = 1
            if (r4 == 0) goto L2e
        L2d:
            r1 = 0
        L2e:
            boolean r0 = r7.forceDisableMetaDav1dDecoder
            boolean r0 = X.AnonymousClass002.A1L(r0)
            if (r1 != 0) goto L3c
            if (r3 != 0) goto L3d
            if (r2 != 0) goto L3d
            if (r0 != 0) goto L3d
        L3c:
            return r5
        L3d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2353BVd.A02(com.facebook.video.heroplayer.setting.HeroPlayerSetting, boolean):boolean");
    }

    /* JADX WARN: Incorrect types in method signature: (ZLjava/util/HashSet<Ljava/lang/String;>;)Z */
    public static boolean A03(HashSet hashSet, boolean z) {
        if (!z) {
            return false;
        }
        try {
            List<C6153Dwv> listA04 = C6155Dwy.A04("video/av01", false, false);
            if (listA04 == null) {
                return false;
            }
            for (C6153Dwv c6153Dwv : listA04) {
                if (c6153Dwv != null) {
                    String str = c6153Dwv.A06;
                    if (!c6153Dwv.A0C && c6153Dwv.A09 && (hashSet == null || hashSet.isEmpty() || !hashSet.contains(AnonymousClass001.A0u(str)))) {
                        return true;
                    }
                }
            }
            return false;
        } catch (MediaCodecUtil$DecoderQueryException e) {
            AbstractC3426CMt.A04("AV1Helper", "Failed to query AV1 decoders on device with exception %s.", BV7.A1b(e));
            return false;
        }
    }
}
