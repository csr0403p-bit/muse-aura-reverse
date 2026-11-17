package X;

import android.text.TextUtils;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.commands.photos.MediaDeviceSyncClientKt;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.Dx4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6161Dx4 {
    public static final ArrayList A00 = C3cG.A0h();
    public static final Pattern A01 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static int A00(int i) {
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public static String A04(String str) {
        String strA03;
        int i = 0;
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.startsWith("avc1") || lowerCase.startsWith("avc3")) {
            return "video/avc";
        }
        if (lowerCase.startsWith("hev1") || lowerCase.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (lowerCase.startsWith("dvav") || lowerCase.startsWith("dva1") || lowerCase.startsWith("dvhe") || lowerCase.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (lowerCase.startsWith("av01")) {
            return "video/av01";
        }
        if (lowerCase.startsWith("vp9") || lowerCase.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (lowerCase.startsWith("vp8") || lowerCase.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (lowerCase.startsWith("mp4a")) {
            if (!lowerCase.startsWith("mp4a.")) {
                return "audio/mp4a-latm";
            }
            Matcher matcher = A01.matcher(lowerCase);
            boolean z = false;
            if (matcher.matches()) {
                String strA0p = BV6.A0p(matcher, 1);
                String strGroup = matcher.group(2);
                try {
                    int i2 = Integer.parseInt(strA0p, 16);
                    if (strGroup != null) {
                        Integer.parseInt(strGroup);
                    }
                    z = true;
                    i = i2;
                } catch (NumberFormatException unused) {
                }
            }
            return (!z || (strA03 = A03(i)) == null) ? "audio/mp4a-latm" : strA03;
        }
        if (lowerCase.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (lowerCase.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (lowerCase.startsWith("ac-3") || lowerCase.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (lowerCase.startsWith("ec-3") || lowerCase.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (lowerCase.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (lowerCase.startsWith("ac-4") || lowerCase.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (lowerCase.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (lowerCase.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (lowerCase.startsWith("dtsh") || lowerCase.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (lowerCase.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (lowerCase.startsWith("opus")) {
            return "audio/opus";
        }
        if (lowerCase.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (lowerCase.startsWith("flac")) {
            return "audio/flac";
        }
        if (lowerCase.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (lowerCase.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (lowerCase.contains("cea708")) {
            return "application/cea-708";
        }
        if (lowerCase.contains("eia608") || lowerCase.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList arrayList = A00;
        if (0 >= arrayList.size()) {
            return null;
        }
        arrayList.get(0);
        throw BV4.A0a("codecPrefix");
    }

    public static String A05(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return BV4.A0j(str, iIndexOf);
    }

    public static boolean A08(String str) {
        if (str != null) {
            return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
        }
        return false;
    }

    public static boolean A0A(String str, String str2) throws NumberFormatException {
        String str3;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    str3 = "audio/eac3-joc";
                    if (str.equals(str3)) {
                    }
                    break;
                case -432837260:
                    str3 = "audio/mpeg-L1";
                    if (str.equals(str3)) {
                    }
                    break;
                case -432837259:
                    str3 = "audio/mpeg-L2";
                    if (str.equals(str3)) {
                    }
                    break;
                case -53558318:
                    if (str.equals("audio/mp4a-latm") && str2 != null) {
                        Matcher matcher = A01.matcher(str2);
                        if (matcher.matches()) {
                            String strA0p = BV6.A0p(matcher, 1);
                            String strGroup = matcher.group(2);
                            try {
                                Integer.parseInt(strA0p, 16);
                                int iA00 = A00(strGroup != null ? Integer.parseInt(strGroup) : 0);
                                if (iA00 == 0 || iA00 == 16) {
                                }
                            } catch (NumberFormatException unused) {
                                break;
                            }
                        }
                    }
                    break;
                case 187078296:
                    str3 = "audio/ac3";
                    if (str.equals(str3)) {
                    }
                    break;
                case 187094639:
                    str3 = "audio/raw";
                    if (str.equals(str3)) {
                    }
                    break;
                case 1504578661:
                    str3 = "audio/eac3";
                    if (str.equals(str3)) {
                    }
                    break;
                case 1504619009:
                    str3 = "audio/flac";
                    if (str.equals(str3)) {
                    }
                    break;
                case 1504831518:
                    str3 = "audio/mpeg";
                    if (str.equals(str3)) {
                    }
                    break;
                case 1903231877:
                    str3 = "audio/g711-alaw";
                    if (str.equals(str3)) {
                    }
                    break;
                case 1903589369:
                    str3 = "audio/g711-mlaw";
                    if (str.equals(str3)) {
                    }
                    break;
            }
        }
        return false;
    }

    public static String A03(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE /* 101 */:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case MinidumpReader.MODULE_FULL_SIZE /* 108 */:
                return MediaDeviceSyncClientKt.FALLBACK_MIME;
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static String A06(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str);
        switch (lowerCase.hashCode()) {
            case -1833600100:
                return lowerCase.equals("video/x-mvhevc") ? "video/mv-hevc" : lowerCase;
            case -1007807498:
                return lowerCase.equals("audio/x-flac") ? "audio/flac" : lowerCase;
            case -979095690:
                return lowerCase.equals("application/x-mpegurl") ? "application/x-mpegURL" : lowerCase;
            case -586683234:
                return lowerCase.equals("audio/x-wav") ? "audio/wav" : lowerCase;
            case -432836268:
                return lowerCase.equals("audio/mpeg-l1") ? "audio/mpeg-L1" : lowerCase;
            case -432836267:
                return lowerCase.equals("audio/mpeg-l2") ? "audio/mpeg-L2" : lowerCase;
            case 187090231:
                return lowerCase.equals("audio/mp3") ? "audio/mpeg" : lowerCase;
            default:
                return lowerCase;
        }
    }

    public static boolean A07(String str) {
        return BV7.A1Z(str, "image") || "application/x-image-uri".equals(str);
    }

    public static boolean A0B(String str, String str2) {
        if (str != null) {
            String[] strArrA1a = TextUtils.isEmpty(str) ? new String[0] : BV4.A1a(str.trim(), "(\\s*,\\s*)");
            StringBuilder sbA0w = C60O.A0w();
            for (String str3 : strArrA1a) {
                if (str2.equals(A04(str3))) {
                    if (sbA0w.length() > 0) {
                        sbA0w.append(",");
                    }
                    sbA0w.append(str3);
                }
            }
            if (sbA0w.length() > 0) {
                return true;
            }
        }
        return false;
    }

    public static int A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (BV7.A1Z(str, "audio")) {
            return 1;
        }
        if (BV7.A1Z(str, "video")) {
            return 2;
        }
        if (A09(str)) {
            return 3;
        }
        if (A07(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = A00;
        if (0 >= arrayList.size()) {
            return -1;
        }
        arrayList.get(0);
        throw BV4.A0a("mimeType");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A02(java.lang.String r7, java.lang.String r8) {
        /*
            int r0 = r7.hashCode()
            r6 = 9
            r5 = 7
            r4 = 6
            r2 = 5
            r1 = 8
            r3 = 0
            switch(r0) {
                case -2123537834: goto L10;
                case -1365340241: goto L1b;
                case -1095064472: goto L1e;
                case -53558318: goto L27;
                case 187078296: goto L53;
                case 187078297: goto L5c;
                case 550520934: goto L67;
                case 1504578661: goto L72;
                case 1504831518: goto L7b;
                case 1504891608: goto L84;
                case 1505942594: goto L8f;
                case 1556697186: goto L98;
                default: goto Lf;
            }
        Lf:
            return r3
        L10:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lf
            r1 = 18
            return r1
        L1b:
            java.lang.String r0 = "audio/vnd.dts.hd;profile=lbr"
            goto L91
        L1e:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lf
            return r5
        L27:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lf
            if (r8 == 0) goto Lf
            java.util.regex.Pattern r0 = X.AbstractC6161Dx4.A01
            java.util.regex.Matcher r1 = r0.matcher(r8)
            boolean r0 = r1.matches()
            if (r0 == 0) goto Lf
            r0 = 1
            java.lang.String r2 = X.BV6.A0p(r1, r0)
            r0 = 2
            java.lang.String r1 = r1.group(r0)
            r0 = 16
            java.lang.Integer.parseInt(r2, r0)     // Catch: java.lang.NumberFormatException -> Lf
            if (r1 == 0) goto La3
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> Lf
            goto La4
        L53:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lf
            return r2
        L5c:
            java.lang.String r0 = "audio/ac4"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lf
            r1 = 17
            return r1
        L67:
            java.lang.String r0 = "audio/vnd.dts.uhd;profile=p2"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lf
            r1 = 30
            return r1
        L72:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lf
            return r4
        L7b:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lf
            return r6
        L84:
            java.lang.String r0 = "audio/opus"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lf
            r1 = 20
            return r1
        L8f:
            java.lang.String r0 = "audio/vnd.dts.hd"
        L91:
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto La2
            return r3
        L98:
            java.lang.String r0 = "audio/true-hd"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lf
            r1 = 14
        La2:
            return r1
        La3:
            r0 = 0
        La4:
            int r1 = A00(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6161Dx4.A02(java.lang.String, java.lang.String):int");
    }

    public static boolean A09(String str) {
        return BV7.A1Z(str, "text") || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }
}
