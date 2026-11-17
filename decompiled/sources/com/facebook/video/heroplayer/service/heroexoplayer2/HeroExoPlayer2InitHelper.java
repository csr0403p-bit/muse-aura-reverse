package com.facebook.video.heroplayer.service.heroexoplayer2;

import X.AbstractC2353BVd;
import X.AbstractC3426CMt;
import X.AbstractC5553DkW;
import X.BV4;
import X.BVD;
import X.BVE;
import X.BVG;
import X.BWU;
import X.BXt;
import X.BY6;
import X.BZQ;
import X.BzX;
import X.C1H;
import X.C2354BVe;
import X.C2369BVx;
import X.C2386BYm;
import X.C3083BxP;
import X.C3cG;
import X.C4904DDx;
import X.C4919DEo;
import X.C5383Dha;
import X.C5506Dji;
import X.C5507Djj;
import X.C5580Dky;
import X.C5585DlC;
import X.C5605Dlk;
import X.C5619Dm2;
import X.C5686DnS;
import X.C5688DnU;
import X.C60O;
import X.C6153Dwv;
import X.C6175DxI;
import X.C6260DzB;
import X.C7384Etj;
import X.CFK;
import X.DEM;
import X.DMX;
import X.DMY;
import X.Dl9;
import X.Dlv;
import X.Dlw;
import X.DmR;
import X.EA1;
import X.EA2;
import X.EA4;
import X.EA8;
import X.EAM;
import X.EAQ;
import X.EAX;
import X.InterfaceC2356BVg;
import X.InterfaceC2361BVo;
import X.InterfaceC5460Div;
import X.InterfaceC5637DmL;
import X.InterfaceC5665Dmu;
import X.InterfaceC5860Dqu;
import X.InterfaceC5909Drs;
import X.InterfaceC6068Dv6;
import X.InterfaceC6087DvR;
import X.InterfaceC6103Dvi;
import X.InterfaceC6272DzP;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import meta.androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;

/* loaded from: classes5.dex */
public class HeroExoPlayer2InitHelper {
    public static int A0R = 921600;
    public InterfaceC5460Div A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final float A04;
    public final long A05;
    public final Context A06;
    public final Handler A07;
    public final InterfaceC2361BVo A08;
    public final C6175DxI A09;
    public final C2386BYm A0A;
    public final BZQ A0B;
    public final C5605Dlk A0C;
    public final InterfaceC5860Dqu A0D;
    public final BY6 A0E;
    public final ServiceEventCallbackImpl A0F;
    public final HeroExoPlayer2EventListener A0G;
    public final InterfaceC5665Dmu A0H;
    public final DEM A0I;
    public final BVD A0J;
    public final HeroPlayerSetting A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final DmR A0N;
    public final C5619Dm2 A0O;
    public final Map<String, String> A0P;
    public volatile C3083BxP A0Q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022b  */
    /* JADX WARN: Type inference failed for: r12v28, types: [java.util.AbstractCollection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r12v30, types: [java.util.Set<java.util.UUID>] */
    /* JADX WARN: Type inference failed for: r27v4, types: [exoplayer2.av1.src.Dav1dMediaCodecAdapterSetting] */
    /* JADX WARN: Type inference failed for: r42v0, types: [com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2InitHelper, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC6068Dv6[] A0E(X.DmR r43, X.InterfaceC5860Dqu r44, X.C5580Dky r45) throws androidx.media3.exoplayer.drm.UnsupportedDrmException, org.json.JSONException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 1735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2InitHelper.A0E(X.DmR, X.Dqu, X.Dky):X.Dv6[]");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/DmR;LX/BVg;LX/Dwx;LX/BVB;)Landroid/util/Pair<LX/Dwo;Lexoplayer2/av1/src/Dav1dMediaCodecAdapterSetting;>; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.util.Pair A00(X.C6154Dwx r114, X.DmR r115, X.BVB r116, X.InterfaceC2356BVg r117) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2InitHelper.A00(X.Dwx, X.DmR, X.BVB, X.BVg):android.util.Pair");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r5.upgrade_media_codec_video_for_ig == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.AbstractC6146Dwo A01(X.C6154Dwx r40, X.DmR r41, X.InterfaceC2356BVg r42) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2InitHelper.A01(X.Dwx, X.DmR, X.BVg):X.Dwo");
    }

    public static C5688DnU A02(DmR dmR, InterfaceC5860Dqu interfaceC5860Dqu, ServiceEventCallbackImpl serviceEventCallbackImpl, HeroPlayerSetting heroPlayerSetting, String str, boolean z) {
        C4904DDx c4904DDx = dmR.A03;
        String str2 = c4904DDx.A0Q;
        if (str2 == null) {
            AbstractC3426CMt.A04("AbrMonitorFactory", "request.mVideoSource.mVideoId is null", new Object[0]);
        } else if (heroPlayerSetting.abrMonitorEnabled) {
            long j = ((Dlw) interfaceC5860Dqu).A20;
            boolean zA04 = c4904DDx.A04();
            boolean z2 = c4904DDx.A0Y;
            C5686DnS c5686DnS = heroPlayerSetting.abrSetting;
            return new C5688DnU(serviceEventCallbackImpl, str2, str, j, zA04, z2, z, c5686DnS != null ? c5686DnS.usePlaybackCsvqm : false);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0168 A[Catch: RuntimeException -> 0x0174, TryCatch #0 {RuntimeException -> 0x0174, blocks: (B:65:0x00e5, B:67:0x00f0, B:69:0x00f4, B:71:0x00fb, B:72:0x00fe, B:74:0x0104, B:76:0x0109, B:77:0x010c, B:79:0x0119, B:80:0x011c, B:82:0x0122, B:83:0x012b, B:85:0x0131, B:86:0x013a, B:89:0x0148, B:91:0x014d, B:94:0x0155, B:102:0x0164, B:103:0x0168, B:104:0x016c, B:105:0x0170), top: B:109:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x016c A[Catch: RuntimeException -> 0x0174, TryCatch #0 {RuntimeException -> 0x0174, blocks: (B:65:0x00e5, B:67:0x00f0, B:69:0x00f4, B:71:0x00fb, B:72:0x00fe, B:74:0x0104, B:76:0x0109, B:77:0x010c, B:79:0x0119, B:80:0x011c, B:82:0x0122, B:83:0x012b, B:85:0x0131, B:86:0x013a, B:89:0x0148, B:91:0x014d, B:94:0x0155, B:102:0x0164, B:103:0x0168, B:104:0x016c, B:105:0x0170), top: B:109:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0015 A[PHI: r11
  0x0015: PHI (r11v3 boolean) = (r11v0 boolean), (r11v4 boolean) binds: [B:7:0x000e, B:9:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0010 A[PHI: r11
  0x0010: PHI (r11v4 boolean) = (r11v0 boolean), (r11v5 boolean) binds: [B:7:0x000e, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.EnumC2351BVa A03(int r15) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2InitHelper.A03(int):X.BVa");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C2358BVi A04(com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2InitHelper r11, long r12) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2InitHelper.A04(com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2InitHelper, long):X.BVi");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d3 A[Catch: XmlPullParserException -> 0x00f4, IOException -> 0x00fc, ParserException | RuntimeException -> 0x0107, ParserException | RuntimeException -> 0x0107, all -> 0x0117, TRY_LEAVE, TryCatch #2 {XmlPullParserException -> 0x00f4, blocks: (B:58:0x00c0, B:60:0x00c4, B:62:0x00cc, B:65:0x00d3), top: B:113:0x00c0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C5580Dky A06(android.content.Context r18, X.DmR r19, com.facebook.video.heroplayer.setting.HeroPlayerSetting r20) throws java.io.IOException, com.facebook.video.heroplayer.service.exo2util.DashManifestHelper2$ManifestParsingException {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2InitHelper.A06(android.content.Context, X.DmR, com.facebook.video.heroplayer.setting.HeroPlayerSetting):X.Dky");
    }

    public static String A07(C5507Djj c5507Djj) {
        List<AbstractC5553DkW> list;
        if (c5507Djj == null || (list = c5507Djj.A01) == null || list.isEmpty()) {
            return "";
        }
        int size = list.size();
        int[] iArr = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = AbstractC5553DkW.A00(list, i2).A05;
        }
        Arrays.sort(iArr);
        StringBuilder sbA0w = C60O.A0w();
        while (true) {
            int i3 = size - 1;
            if (i >= i3) {
                return BV4.A0l(sbA0w, iArr[i3]);
            }
            sbA0w.append(iArr[i]);
            sbA0w.append(":");
            i++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A08(java.lang.String r4, boolean r5) {
        /*
            java.lang.String r3 = "N/A"
            if (r4 == 0) goto L3d
            int r0 = r4.hashCode()
            switch(r0) {
                case -456963117: goto L1c;
                case 124730804: goto L27;
                case 246781959: goto L32;
                default: goto Lb;
            }
        Lb:
            r0 = r3
        Lc:
            if (r5 == 0) goto L10
            java.lang.String r0 = "HardwareDecoder"
        L10:
            java.lang.String r2 = "AV1 decoding using "
            java.lang.String r1 = ";"
            if (r4 != 0) goto L17
            r4 = r3
        L17:
            java.lang.String r0 = X.FGI.A0d(r2, r0, r1, r4)
            return r0
        L1c:
            java.lang.String r0 = "c2.android.av1-dav1d.decoder"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "PlatformDav1d"
            goto L10
        L27:
            java.lang.String r0 = "c2.android.av1.decoder"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "LibGav1"
            goto L10
        L32:
            java.lang.String r0 = "meta.dav1d.av1.decoder"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "Dav1d"
            goto L10
        L3d:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2InitHelper.A08(java.lang.String, boolean):java.lang.String");
    }

    public static String A09(InterfaceC2356BVg interfaceC2356BVg, boolean z, boolean z2) {
        C6153Dwv c6153Dwv;
        if (!z2 && z) {
            return "meta.dav1d.av1.decoder";
        }
        try {
            List<C6153Dwv> listAEg = interfaceC2356BVg.AEg("video/av01", false, false);
            return (listAEg == null || listAEg.isEmpty() || (c6153Dwv = listAEg.get(0)) == null) ? "N/A" : c6153Dwv.A06;
        } catch (MediaCodecUtil$DecoderQueryException e) {
            BzX.A01("AV1Helper", e, "Failed to get AV1 decoder info");
            return "N/A";
        }
    }

    private InterfaceC6272DzP A0A(C6175DxI c6175DxI, DmR dmR) {
        HeroPlayerSetting heroPlayerSetting = this.A0K;
        Dlv dlv = heroPlayerSetting.gen;
        int iA01 = (dlv.enable_moq_media_source && dmR.A03 != null && dmR.A02()) ? BV4.A01(dlv.moq_pcm_buffer_duration_us, 750000L) : 0;
        if (dlv.use_media3_audio_sink) {
            DMY dmy = DMY.A02;
            C1H.A00(dmy);
            InterfaceC5909Drs interfaceC5909Drs = InterfaceC5909Drs.A00;
            ArrayList arrayListA0h = C3cG.A0h();
            if (heroPlayerSetting.enablePCMBufferListener) {
                arrayListA0h.add(new C6260DzB(this.A0G));
            }
            EAM eam = new EAM((EAX[]) arrayListA0h.toArray(new EAX[arrayListA0h.size()]));
            int i = 750000;
            int iA04 = TextUtils.isEmpty(heroPlayerSetting.gen.pcm_min_buffer_duration_us_config_json) ? 250000 : C7384Etj.A04(BWU.A02, heroPlayerSetting.gen.pcm_min_buffer_duration_us_config_json, 250000);
            int iA042 = TextUtils.isEmpty(heroPlayerSetting.gen.pcm_multiplication_factor_config_json) ? 4 : C7384Etj.A04(BWU.A03, heroPlayerSetting.gen.pcm_multiplication_factor_config_json, 4);
            if (iA01 > 0) {
                iA04 = iA01;
                i = iA01;
            }
            return new EA8(dmy, new EA2(eam, dmy, new BVE(), new BVG(i, iA04, iA042), interfaceC5909Drs));
        }
        DMX dmx = DMX.A03;
        ArrayList arrayListA0h2 = C3cG.A0h();
        if (heroPlayerSetting.enablePCMBufferListener) {
            arrayListA0h2.add(new C6260DzB(this.A0G));
        }
        EAQ eaq = new EAQ((EAX[]) arrayListA0h2.toArray(new EAX[arrayListA0h2.size()]));
        int i2 = 750000;
        int iA043 = TextUtils.isEmpty(heroPlayerSetting.gen.pcm_min_buffer_duration_us_config_json) ? 250000 : C7384Etj.A04(BWU.A02, heroPlayerSetting.gen.pcm_min_buffer_duration_us_config_json, 250000);
        int iA044 = TextUtils.isEmpty(heroPlayerSetting.gen.pcm_multiplication_factor_config_json) ? 4 : C7384Etj.A04(BWU.A03, heroPlayerSetting.gen.pcm_multiplication_factor_config_json, 4);
        if (iA01 > 0) {
            iA043 = iA01;
            i2 = iA01;
        }
        EA1 ea1 = new EA1(eaq, dmx, new BXt(i2, iA043, iA044));
        ea1.A0F = c6175DxI.A0F;
        return new EA4(ea1);
    }

    public static boolean A0B(DmR dmR, C5580Dky c5580Dky) {
        if (dmR.A03.A0a && c5580Dky != null && C5580Dky.A00(c5580Dky) > 0) {
            List<C5585DlC> list = c5580Dky.A0R;
            if (list.get(0).A03 != null && list.get(0).A03.size() > 1 && Dl9.A03(list.get(0).A03, 1).size() > 0 && "audio/webm".equalsIgnoreCase(AbstractC5553DkW.A00(Dl9.A03(list.get(0).A03, 1), 0).A0X)) {
                return true;
            }
        }
        return false;
    }

    private InterfaceC6068Dv6 tryCreateAacFromFactory(DmR dmR, C5506Dji c5506Dji, C2354BVe c2354BVe, boolean z) {
        C4904DDx c4904DDx;
        String str;
        Dlv dlv = this.A0K.gen;
        if (dlv.enable_sw_aac_library && ((!dlv.enable_sw_aac_for_aac_audio || ((c4904DDx = dmR.A03) != null && (str = c4904DDx.A0D) != null && str.contains("codecs=\"mp4a.40."))) && this.A0C.A05.aacAudioRendererFactory() != null)) {
            try {
                A0A(this.A09, dmR);
                throw BV4.A0a("create");
            } catch (LinkageError e) {
                CFK.A0A("HeroExoPlayer2InitHelper", "AAC renderer unavailable (Voltron module not loaded)", e);
            }
        }
        return null;
    }

    public final C5383Dha A0C(DmR dmR) {
        InterfaceC5860Dqu interfaceC5860Dqu = this.A0D;
        HeroPlayerSetting heroPlayerSetting = this.A0K;
        ServiceEventCallbackImpl serviceEventCallbackImpl = this.A0F;
        C5688DnU c5688DnUA02 = A02(dmR, interfaceC5860Dqu, serviceEventCallbackImpl, heroPlayerSetting, dmR.A09, false);
        C5688DnU c5688DnUA022 = A02(dmR, interfaceC5860Dqu, serviceEventCallbackImpl, heroPlayerSetting, dmR.A09, true);
        InterfaceC5665Dmu interfaceC5665Dmu = this.A0H;
        C5383Dha c5383Dha = new C5383Dha(interfaceC5665Dmu.AMd(c5688DnUA02, dmR), interfaceC5665Dmu.ACX(c5688DnUA022, dmR), this.A0O, heroPlayerSetting, this.A0P);
        this.A0Q = c5383Dha.A05;
        return c5383Dha;
    }

    public final boolean A0D(C4904DDx c4904DDx) {
        String strA08;
        if (c4904DDx.A03()) {
            HeroPlayerSetting heroPlayerSetting = this.A0K;
            boolean zA03 = AbstractC2353BVd.A03(heroPlayerSetting.blockListedHardwareDecoderMap, heroPlayerSetting.prioritizeAv1HardwareDecoder);
            String str = HatchCcvLoggingKt.NO_POSTAL_FIELD;
            if (zA03) {
                ServiceEventCallbackImpl serviceEventCallbackImpl = this.A0F;
                String str2 = c4904DDx.A0Q;
                if (str2 != null) {
                    str = str2;
                }
                serviceEventCallbackImpl.A5s(new C4919DEo(str, "AV1_INSTANTIATION", "AV1_INSTANTIATION", A08(this.A01, true)));
                strA08 = A08(this.A01, true);
            } else {
                if (!this.A03 && Build.VERSION.SDK_INT < 30) {
                    return true;
                }
                ServiceEventCallbackImpl serviceEventCallbackImpl2 = this.A0F;
                String str3 = c4904DDx.A0Q;
                if (str3 != null) {
                    str = str3;
                }
                serviceEventCallbackImpl2.A5s(new C4919DEo(str, "AV1_INSTANTIATION", "AV1_INSTANTIATION", A08(this.A01, false)));
                strA08 = A08(this.A01, false);
            }
            AbstractC3426CMt.A02("HeroExo2InitHelper", strA08);
        }
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Lcom/facebook/video/heroplayer/service/ServiceEventCallbackImpl;Landroid/os/Handler;LX/Dqu;LX/Dmu;LX/DEM;LX/BVo;LX/Dlk;LX/Dm2;LX/DmR;)V */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.BVF] */
    public HeroExoPlayer2InitHelper(Context context, Handler handler, InterfaceC2361BVo interfaceC2361BVo, DmR dmR, C5605Dlk c5605Dlk, InterfaceC5860Dqu interfaceC5860Dqu, C5619Dm2 c5619Dm2, ServiceEventCallbackImpl serviceEventCallbackImpl, InterfaceC5665Dmu interfaceC5665Dmu, DEM dem, Map map) {
        C2386BYm c2386BYm;
        BVD bvd;
        float f;
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        Set<String> set;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i5;
        boolean z16;
        boolean z17;
        boolean z18;
        int i6;
        int i7;
        int i8;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        int i9;
        this.A06 = context;
        this.A0P = map;
        this.A0C = c5605Dlk;
        HeroPlayerSetting heroPlayerSetting = c5605Dlk.A09;
        this.A0K = heroPlayerSetting;
        this.A0B = c5605Dlk.A08;
        this.A07 = handler;
        this.A0F = serviceEventCallbackImpl;
        this.A0E = new BY6(serviceEventCallbackImpl);
        InterfaceC5637DmL interfaceC5637DmL = c5605Dlk.A05;
        Dlv dlv = heroPlayerSetting.gen;
        if (dlv.enable_video_decoder_name_lacrima) {
            final InterfaceC6087DvR interfaceC6087DvRBreakpadManagerDelegate = interfaceC5637DmL.breakpadManagerDelegate();
            final InterfaceC6103Dvi interfaceC6103DviCrashReportAnnotationDelegate = interfaceC5637DmL.crashReportAnnotationDelegate();
            c2386BYm = new C2386BYm(new Object() { // from class: X.BVF
            });
        } else {
            c2386BYm = C2386BYm.A02;
        }
        this.A0A = c2386BYm;
        this.A0D = interfaceC5860Dqu;
        this.A0I = dem;
        this.A08 = interfaceC2361BVo;
        if (dem != null) {
            bvd = dem.A07;
        } else {
            bvd = null;
        }
        this.A0J = bvd;
        this.A0O = c5619Dm2;
        this.A0N = dmR;
        this.A0M = dlv.parse_av1_sample_dependencies;
        this.A05 = (long) dlv.late_threshold_to_drop_decoder_input_us;
        double d = dlv.override_assumed_minimum_codec_operating_rate_video;
        if (d > 0.0d) {
            f = (float) d;
        } else {
            f = 30.0f;
        }
        this.A04 = f;
        this.A0L = dlv.enable_codec_operating_rate_change;
        C2369BVx.A01 = heroPlayerSetting.enableSystrace;
        this.A0G = new HeroExoPlayer2EventListener(interfaceC5860Dqu, dem, interfaceC2361BVo, heroPlayerSetting.errorRecoveryAttemptRepeatCountFlushThreshold, heroPlayerSetting.disableTextRendererOn404LoadError, heroPlayerSetting.disableTextRendererOn404InitSegmentLoadError, heroPlayerSetting.disableTextRendererOn500LoadError, heroPlayerSetting.disableTextRendererOn500InitSegmentLoadError, heroPlayerSetting.surfaceMPDFailoverImmediately, heroPlayerSetting.disableTextTrackOnMissingTextTrack, heroPlayerSetting);
        int i10 = heroPlayerSetting.xHEAACTargetReferenceLvl;
        boolean z32 = false;
        boolean z33 = false;
        if (heroPlayerSetting.isExo2MediaCodecReuseEnabled) {
            z = heroPlayerSetting.enableMediaCodecPoolingForVodVideo;
            z2 = heroPlayerSetting.enableMediaCodecPoolingForVodAudio;
            i = heroPlayerSetting.maxMediaCodecInstancesPerCodecName;
            i2 = heroPlayerSetting.maxMediaCodecInstancesTotal;
            z11 = heroPlayerSetting.skipMediaCodecStopOnRelease;
            z12 = heroPlayerSetting.skipAudioMediaCodecStopOnRelease;
            z13 = heroPlayerSetting.enableCodecDeadlockFix;
            z14 = heroPlayerSetting.failOnNullCodecFromCreate;
            z32 = heroPlayerSetting.enableMediaCodecReuseOptimizeLock;
            z33 = heroPlayerSetting.enableMediaCodecReuseOptimizeRelease;
            z21 = heroPlayerSetting.useMediaCodecPoolingConcurrentCollections;
            i3 = heroPlayerSetting.releaseThreadInterval;
            z15 = heroPlayerSetting.enableCustomizedXHEAACConfig;
            i5 = heroPlayerSetting.xHEAACCEffectType;
            z16 = heroPlayerSetting.enableSeamlessAudioCodecAdaptation;
            z17 = dlv.keep_audio_codec_on_repeat_loop;
            z18 = heroPlayerSetting.enableCustomizedDRCEffect;
            i6 = heroPlayerSetting.customizedDRCEffectType;
            i7 = heroPlayerSetting.lateNightHourUpperThreshold;
            i8 = heroPlayerSetting.lateNightHourLowerThreshold;
            if (heroPlayerSetting.enableLowLatencyDecoding || (dlv.enable_low_latency_decoding_for_live && (C4904DDx.A00(dmR) || dmR.A02()))) {
                z19 = true;
            } else {
                z19 = false;
            }
            z20 = dlv.disable_low_latency_latency_decoding_for_platform_dav1d;
            z3 = heroPlayerSetting.disablePoolingForDav1dMediaCodec;
            z4 = heroPlayerSetting.enablePoolingForDav1dAv1Decoder;
            z5 = heroPlayerSetting.enableMediaCodecPoolV2;
            i4 = heroPlayerSetting.mediaCodecPoolV2TtlMs;
            z6 = heroPlayerSetting.enableCodecPoolVideoV2;
            z7 = heroPlayerSetting.enableCodecPoolAudioV2;
            z8 = heroPlayerSetting.enableCodecPoolV2ReuseGuards;
            z9 = heroPlayerSetting.detachSurfaceBeforeCodecPark;
            i9 = heroPlayerSetting.videoCodecHeadroomMaxLongEdgePx;
            z10 = heroPlayerSetting.respectLegacyPooling;
            set = heroPlayerSetting.mediaCodecPoolV2CodecAllowlist;
            set = set == null ? Collections.EMPTY_SET : set;
            z22 = heroPlayerSetting.enableAudioTrackRetry || dlv.enable_audio_track_retry;
            z23 = dlv.enable_one_time_pool_acquisition;
            z24 = dlv.enable_one_time_pool_acquisition_consume_on_hit;
            z25 = heroPlayerSetting.enableFlushPooledAudioCodecAfterStart;
            z26 = dlv.enable_clear_stale_video_codec_on_acquire_miss;
            z27 = dlv.enable_clear_stale_video_on_onetime_video_miss;
            z28 = dlv.enable_clear_aac_on_onetime_audio_miss;
            z29 = dlv.enable_clear_other_video_codecs_on_onetime_hit;
            z30 = dlv.enable_clear_other_aac_codecs_on_onetime_hit;
            z31 = dlv.enable_async_release_for_miss_cleanup;
        } else {
            z = false;
            z2 = false;
            i = 3;
            i2 = 6;
            i3 = 1000;
            z3 = false;
            z4 = false;
            z5 = false;
            i4 = 0;
            z6 = false;
            z7 = false;
            z8 = false;
            z9 = false;
            z10 = false;
            set = Collections.EMPTY_SET;
            z11 = heroPlayerSetting.skipMediaCodecStopOnRelease;
            z12 = heroPlayerSetting.skipAudioMediaCodecStopOnRelease;
            z13 = heroPlayerSetting.enableCodecDeadlockFix;
            z14 = heroPlayerSetting.failOnNullCodecFromCreate;
            z15 = heroPlayerSetting.enableCustomizedXHEAACConfig;
            i5 = heroPlayerSetting.xHEAACCEffectType;
            z16 = heroPlayerSetting.enableSeamlessAudioCodecAdaptation;
            z17 = dlv.keep_audio_codec_on_repeat_loop;
            z18 = heroPlayerSetting.enableCustomizedDRCEffect;
            i6 = heroPlayerSetting.customizedDRCEffectType;
            i7 = heroPlayerSetting.lateNightHourUpperThreshold;
            i8 = heroPlayerSetting.lateNightHourLowerThreshold;
            if (heroPlayerSetting.enableLowLatencyDecoding || (dlv.enable_low_latency_decoding_for_live && (C4904DDx.A00(dmR) || dmR.A02()))) {
                z19 = true;
            } else {
                z19 = false;
            }
            z20 = dlv.disable_low_latency_latency_decoding_for_platform_dav1d;
            z21 = heroPlayerSetting.useMediaCodecPoolingConcurrentCollections;
            z22 = heroPlayerSetting.enableAudioTrackRetry || dlv.enable_audio_track_retry;
            z23 = dlv.enable_one_time_pool_acquisition;
            z24 = dlv.enable_one_time_pool_acquisition_consume_on_hit;
            z25 = heroPlayerSetting.enableFlushPooledAudioCodecAfterStart;
            z26 = dlv.enable_clear_stale_video_codec_on_acquire_miss;
            z27 = dlv.enable_clear_stale_video_on_onetime_video_miss;
            z28 = dlv.enable_clear_aac_on_onetime_audio_miss;
            z29 = dlv.enable_clear_other_video_codecs_on_onetime_hit;
            z30 = dlv.enable_clear_other_aac_codecs_on_onetime_hit;
            z31 = dlv.enable_async_release_for_miss_cleanup;
            i9 = heroPlayerSetting.videoCodecHeadroomMaxLongEdgePx;
        }
        this.A09 = new C6175DxI(set, i6, i8, i7, i, i2, i4, i3, i9, i5, i10, z9, z20, z3, z31, z22, z28, z30, z29, z26, z27, z13, z7, z8, z6, z18, z15, z25, z19, z5, z32, z33, z23, z24, z2, z4, z, z16, z14, z17, z10, z12, z11, z21);
        this.A0H = interfaceC5665Dmu;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ac A[PHI: r20
  0x02ac: PHI (r20v2 boolean) = (r20v0 boolean), (r20v3 boolean) binds: [B:215:0x02aa, B:118:0x018a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02f1 A[PHI: r16
  0x02f1: PHI (r16v3 boolean) = (r16v1 boolean), (r16v1 boolean), (r16v4 boolean) binds: [B:233:0x02dc, B:242:0x02ef, B:231:0x02d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.BVB A05(X.C6154Dwx r50, X.DmR r51, X.C5580Dky r52, int r53, boolean r54, boolean r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2InitHelper.A05(X.Dwx, X.DmR, X.Dky, int, boolean, boolean, boolean):X.BVB");
    }
}
