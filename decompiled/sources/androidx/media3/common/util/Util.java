package androidx.media3.common.util;

import X.AbstractC6280DzZ;
import X.AnonymousClass006;
import X.BV4;
import X.BV6;
import X.BV7;
import X.BV8;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C6xC;
import X.E19;
import X.E1P;
import X.FGI;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.commands.photos.MediaDeviceSyncClientKt;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine;
import com.facebook.aura.devices.pairing.HatchDeviceBleManagerKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.feed.view.FeedEditHapticsKt;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.sharesheet.HatchShareSheetViewModelKt;
import com.google.common.base.Ascii;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes5.dex */
public abstract class Util {

    @Deprecated
    public static final int A00;

    @Deprecated
    public static final String A01;
    public static final String A02;

    @Deprecated
    public static final String A03;

    @Deprecated
    public static final String A04;
    public static final Pattern A05;
    public static final Pattern A06;
    public static final byte[] A07;
    public static final int[] A08;
    public static final int[] A09;
    public static final int[] A0A;
    public static final long[] A0B;
    public static final Pattern A0C;
    public static final Pattern A0D;

    public static int A01(int i) {
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 1;
        }
        if (i != 4) {
            if (i != 21) {
                if (i != 22) {
                    if (i == 268435456) {
                        return 2;
                    }
                    if (i != 1342177280) {
                        if (i != 1610612736) {
                            throw BV4.A0P();
                        }
                    }
                }
            }
            return 3;
        }
        return 4;
    }

    public static int A02(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A05(java.lang.String r6) throws java.lang.NumberFormatException {
        /*
            r5 = 0
            if (r6 == 0) goto L2d
            java.lang.String r0 = "_"
            java.lang.String[] r4 = X.BV4.A1a(r6, r0)
            int r3 = r4.length
            r1 = 2
            if (r3 < r1) goto L2d
            int r0 = r3 + (-1)
            r2 = r4[r0]
            r0 = 3
            if (r3 < r0) goto L20
            int r3 = r3 - r1
            r1 = r4[r3]
            java.lang.String r0 = "neg"
            boolean r1 = r0.equals(r1)
            r0 = 1
            if (r1 != 0) goto L21
        L20:
            r0 = 0
        L21:
            r2.getClass()     // Catch: java.lang.NumberFormatException -> L2c
            int r5 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L2c
            if (r0 == 0) goto L2c
            int r0 = -r5
            return r0
        L2c:
            return r5
        L2d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.Util.A05(java.lang.String):int");
    }

    public static boolean A0O(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    public static <T> boolean A0Q(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size == sparseArray2.size()) {
            for (int i = 0; i < size; i++) {
                if (C6xC.A00(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                }
            }
            return true;
        }
        return false;
    }

    static {
        int i = Build.VERSION.SDK_INT;
        A00 = i;
        String str = Build.DEVICE;
        A01 = str;
        String str2 = Build.MANUFACTURER;
        A03 = str2;
        String str3 = Build.MODEL;
        A04 = str3;
        StringBuilder sbA0g = C3cG.A0g(str);
        C60O.A1R(", ", str3, sbA0g);
        sbA0g.append(str2);
        A02 = C60P.A1O(", ", sbA0g, i);
        A07 = new byte[0];
        A0B = new long[0];
        A0D = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        A06 = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        A0C = Pattern.compile("%([A-Fa-f0-9]{2})");
        A05 = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        A09 = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        A08 = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        A0A = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 119, 126, 121, MinidumpReader.MODULE_FULL_SIZE, 107, 98, FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE, 223, 214, 209, 196, 195, 202, 205, VoiceCallForegroundService.AVATAR_TARGET_PX, 151, 158, 153, 140, 139, 130, 133, 168, HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS, 166, 161, 180, FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE, 186, 189, 199, 192, 201, HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN, 171, 172, 165, 162, 143, 136, AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH, HatchDeviceBleManagerKt.REQUESTED_MTU, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, HatchMessageShareDocumentRenderer.CONTENT_TOP_PX, HatchWidgetWebViewKt.HTTP_NO_CONTENT, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static int A00(int i) {
        if (i == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i == 12) {
            return 743676;
        }
        if (i != 24) {
            switch (i) {
                case 1:
                    return 4;
                case 2:
                    return 12;
                case 3:
                    return 28;
                case 4:
                    return HatchWidgetWebViewKt.HTTP_NO_CONTENT;
                case 5:
                    return 220;
                case 6:
                    return 252;
                case 7:
                    return 1276;
                case 8:
                    return 6396;
            }
        }
        if (Build.VERSION.SDK_INT >= 32) {
            return 67108860;
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A03(android.net.Uri r5, java.lang.String r6) {
        /*
            if (r6 != 0) goto L84
            java.lang.String r1 = r5.getScheme()
            if (r1 == 0) goto L1a
            java.lang.String r0 = "rtsp"
            boolean r0 = com.google.common.base.Ascii.equalsIgnoreCase(r0, r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = "rtspt"
            boolean r0 = com.google.common.base.Ascii.equalsIgnoreCase(r0, r1)
            if (r0 == 0) goto L1a
        L18:
            r4 = 3
        L19:
            return r4
        L1a:
            java.lang.String r1 = r5.getLastPathSegment()
            if (r1 == 0) goto L8f
            int r0 = X.BV6.A0B(r1)
            r4 = 1
            if (r0 < 0) goto L36
            java.lang.String r0 = X.BV4.A0g(r0, r1)
            java.lang.String r1 = com.google.common.base.Ascii.toLowerCase(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case 104579: goto L5a;
                case 108321: goto L5d;
                case 3242057: goto L67;
                case 3299913: goto L71;
                default: goto L36;
            }
        L36:
            java.util.regex.Pattern r1 = androidx.media3.common.util.Util.A05
            java.lang.String r0 = r5.getPath()
            r0.getClass()
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L8f
            r2 = 2
            java.lang.String r1 = r1.group(r2)
            if (r1 == 0) goto L19
            java.lang.String r0 = "format=mpd-time-csf"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L7b
            r4 = 0
            return r4
        L5a:
            java.lang.String r0 = "ism"
            goto L69
        L5d:
            java.lang.String r0 = "mpd"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L36
            r2 = 0
            return r2
        L67:
            java.lang.String r0 = "isml"
        L69:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L36
            r2 = 1
            return r2
        L71:
            java.lang.String r0 = "m3u8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L36
            r2 = 2
            return r2
        L7b:
            java.lang.String r0 = "format=m3u8-aapl"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L19
            return r2
        L84:
            int r0 = r6.hashCode()
            r3 = 3
            r4 = 2
            r2 = 1
            r1 = 0
            switch(r0) {
                case -979127466: goto L91;
                case -156749520: goto L9a;
                case 64194685: goto La3;
                case 1154777587: goto Lac;
                default: goto L8f;
            }
        L8f:
            r4 = 4
            return r4
        L91:
            java.lang.String r0 = "application/x-mpegURL"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L19
            goto L8f
        L9a:
            java.lang.String r0 = "application/vnd.ms-sstr+xml"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L8f
            return r2
        La3:
            java.lang.String r0 = "application/dash+xml"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L8f
            return r1
        Lac:
            java.lang.String r0 = "application/x-rtsp"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L8f
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.Util.A03(android.net.Uri, java.lang.String):int");
    }

    public static <T> int A04(SparseArray<T> sparseArray) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int iKeyAt = 17;
        for (int i = 0; i < sparseArray.size(); i++) {
            iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i)) * 31) + AnonymousClass006.A0D(sparseArray.valueAt(i));
        }
        return iKeyAt;
    }

    public static int A06(ByteOrder byteOrder, int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static long A0C(long j, float f) {
        return f != 1.0f ? BV6.A0G(j, f) : j;
    }

    public static long A0D(long j, float f) {
        return f != 1.0f ? Math.round(j / f) : j;
    }

    public static long A0E(String str) throws ParserException {
        Matcher matcher = A0D.matcher(str);
        if (!matcher.matches()) {
            throw BV8.A0c(FGI.A0M("Invalid date/time format: ", str));
        }
        int iA0O = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            iA0O = (BV7.A0O(matcher, 12) * 60) + BV7.A0O(matcher, 13);
            if ("-".equals(matcher.group(11))) {
                iA0O = -iA0O;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(BV7.A0O(matcher, 1), BV7.A0O(matcher, 2) - 1, BV7.A0O(matcher, 3), BV7.A0O(matcher, 4), BV7.A0O(matcher, 5), BV7.A0O(matcher, 6));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal(FGI.A0M("0.", matcher.group(8))).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return iA0O != 0 ? timeInMillis - (iA0O * 60000) : timeInMillis;
    }

    public static long A0F(RoundingMode roundingMode, long j, long j2, long j3) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        return (j3 < j2 || j3 % j2 != 0) ? (j3 >= j2 || j2 % j3 != 0) ? (j3 < j || j3 % j != 0) ? (j3 >= j || j % j3 != 0) ? A0G(roundingMode, j, j2, j3) : AbstractC6280DzZ.A02(j2, AbstractC6280DzZ.A03(RoundingMode.UNNECESSARY, j, j3)) : AbstractC6280DzZ.A03(roundingMode, j2, AbstractC6280DzZ.A03(RoundingMode.UNNECESSARY, j3, j)) : AbstractC6280DzZ.A02(j, AbstractC6280DzZ.A03(RoundingMode.UNNECESSARY, j2, j3)) : AbstractC6280DzZ.A03(roundingMode, j, AbstractC6280DzZ.A03(RoundingMode.UNNECESSARY, j3, j2));
    }

    public static long A0G(RoundingMode roundingMode, long j, long j2, long j3) {
        long jA03 = j3;
        long jA02 = AbstractC6280DzZ.A02(j, j2);
        if (jA02 == LinkEncryptedPairingKt.LINK_COUNTER_MAX || jA02 == Long.MIN_VALUE) {
            long jA01 = AbstractC6280DzZ.A01(Math.abs(j2), Math.abs(jA03));
            RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
            long jA032 = AbstractC6280DzZ.A03(roundingMode2, j2, jA01);
            long jA033 = AbstractC6280DzZ.A03(roundingMode2, jA03, jA01);
            long jA012 = AbstractC6280DzZ.A01(Math.abs(j), Math.abs(jA033));
            long jA034 = AbstractC6280DzZ.A03(roundingMode2, j, jA012);
            jA03 = AbstractC6280DzZ.A03(roundingMode2, jA033, jA012);
            jA02 = AbstractC6280DzZ.A02(jA034, jA032);
            if (jA02 == LinkEncryptedPairingKt.LINK_COUNTER_MAX || jA02 == Long.MIN_VALUE) {
                double d = jA034 * (jA032 / jA03);
                if (d > 9.223372036854776E18d) {
                    return LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                }
                if (d >= -9.223372036854776E18d) {
                    return E19.A00(roundingMode, d);
                }
                return Long.MIN_VALUE;
            }
        }
        return AbstractC6280DzZ.A03(roundingMode, jA02, jA03);
    }

    public static String A0H(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw BV4.A0T();
    }

    public static String A0I(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return Ascii.toLowerCase(str);
        }
    }

    public static void A0K(Context context) {
        String str;
        String str2;
        if (context.getApplicationInfo().targetSdkVersion >= 29) {
            int i = Build.VERSION.SDK_INT;
            if (i == 30) {
                str = Build.MODEL;
                if (Ascii.equalsIgnoreCase(str, "moto g(20)")) {
                    return;
                } else {
                    str2 = "rmx3231";
                }
            } else {
                if (i != 34) {
                    return;
                }
                str = Build.MODEL;
                str2 = "sm-x200";
            }
            Ascii.equalsIgnoreCase(str, str2);
        }
    }

    public static boolean A0N(char c) {
        return c == '\"' || c == '%' || c == '*' || c == '/' || c == ':' || c == '<' || c == '\\' || c == '|' || c == '>' || c == '?';
    }

    public static int A07(long[] jArr, long j, boolean z) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            return iBinarySearch ^ (-1);
        }
        while (true) {
            i = iBinarySearch + 1;
            if (i >= jArr.length || jArr[i] != j) {
                break;
            }
            iBinarySearch = i;
        }
        return z ? iBinarySearch : i;
    }

    public static int A08(long[] jArr, long j, boolean z) {
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            iBinarySearch = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i = iBinarySearch - 1;
                if (i < 0 || jArr[i] != j) {
                    break;
                }
                iBinarySearch = i;
            }
        }
        return z ? Math.max(0, iBinarySearch) : iBinarySearch;
    }

    public static String A0J(String str) {
        int length = str.length();
        int iEnd = 0;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) == '%') {
                i++;
            }
        }
        if (i == 0) {
            return str;
        }
        int i3 = length - (i * 2);
        StringBuilder sbA0p = BV4.A0p(i3);
        Matcher matcher = A0C.matcher(str);
        while (i > 0 && matcher.find()) {
            char c = (char) Integer.parseInt(BV6.A0p(matcher, 1), 16);
            sbA0p.append((CharSequence) str, iEnd, matcher.start());
            sbA0p.append(c);
            iEnd = matcher.end();
            i--;
        }
        if (iEnd < length) {
            sbA0p.append((CharSequence) str, iEnd, length);
        }
        if (sbA0p.length() != i3) {
            return null;
        }
        return sbA0p.toString();
    }

    public static void A0L(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (BV7.A1V(looper)) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void A0M(long[] jArr, long j) {
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            long jA03 = AbstractC6280DzZ.A03(RoundingMode.UNNECESSARY, j, 1000000L);
            while (i < jArr.length) {
                jArr[i] = AbstractC6280DzZ.A03(roundingMode, jArr[i], jA03);
                i++;
            }
            return;
        }
        if (j < 1000000 && 1000000 % j == 0) {
            long jA032 = AbstractC6280DzZ.A03(RoundingMode.UNNECESSARY, 1000000L, j);
            while (i < jArr.length) {
                jArr[i] = AbstractC6280DzZ.A02(jArr[i], jA032);
                i++;
            }
            return;
        }
        while (i < jArr.length) {
            long j2 = jArr[i];
            if (j2 != 0) {
                jArr[i] = (j < j2 || j % j2 != 0) ? (j >= j2 || j2 % j != 0) ? A0G(roundingMode, j2, 1000000L, j) : AbstractC6280DzZ.A02(1000000L, AbstractC6280DzZ.A03(RoundingMode.UNNECESSARY, j2, j)) : AbstractC6280DzZ.A03(roundingMode, 1000000L, AbstractC6280DzZ.A03(RoundingMode.UNNECESSARY, j, j2));
            }
            i++;
        }
    }

    public static boolean A0P(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean A0R(E1P e1p, E1P e1p2, Inflater inflater) {
        int iA04 = e1p.A04();
        if (iA04 <= 0 || (e1p.A02[e1p.A01] & 255) != 120) {
            return false;
        }
        if (e1p2.A02.length < iA04) {
            e1p2.A0O(iA04 * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(e1p.A02, e1p.A01, e1p.A04());
        int iInflate = 0;
        while (true) {
            try {
                byte[] bArr = e1p2.A02;
                iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                if (inflater.finished()) {
                    e1p2.A0Q(iInflate);
                    inflater.reset();
                    return true;
                }
                if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                }
                int length = e1p2.A02.length;
                if (iInflate == length) {
                    e1p2.A0O(length * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static boolean A0S(String str) {
        String str2;
        switch (str.hashCode()) {
            case -1487656890:
                if (!str.equals("image/avif") || Build.VERSION.SDK_INT < 34) {
                }
                break;
            case -1487464693:
                str2 = "image/heic";
                if (str.equals(str2)) {
                }
                break;
            case -1487464690:
                str2 = "image/heif";
                if (str.equals(str2)) {
                }
                break;
            case -1487394660:
                str2 = MediaDeviceSyncClientKt.FALLBACK_MIME;
                if (str.equals(str2)) {
                }
                break;
            case -1487018032:
                str2 = "image/webp";
                if (str.equals(str2)) {
                }
                break;
            case -879272239:
                str2 = "image/bmp";
                if (str.equals(str2)) {
                }
                break;
            case -879258763:
                str2 = HatchShareSheetViewModelKt.AVATAR_STORY_STICKER_MIME_TYPE;
                if (str.equals(str2)) {
                }
                break;
        }
        return false;
    }

    public static long A09(long j) {
        return j == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j;
    }

    public static long A0A(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static long A0B(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : BV4.A04(j);
    }
}
