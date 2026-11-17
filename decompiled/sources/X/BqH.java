package X;

import com.facebook.aura.analytics.timespent.config.MC;
import com.facebook.aura.commands.health.MC;
import java.nio.ByteOrder;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class BqH {
    public static final HashSet<String> A02;
    public static final C2965BqG[] A03;
    public static final C2965BqG[][] A04;
    public static final C2965BqG[] A05;
    public static final C2965BqG[] A06;
    public static final C2965BqG[] A07;
    public static final C2965BqG[] A08;
    public final ByteOrder A00;
    public final List<Map<String, C2967BqK>> A01;

    public final Map<String, C2967BqK> A02(int i) {
        BeS.A04(FGI.A0I("Invalid IFD index: ", i, ". Index should be between [0, EXIF_TAGS.length] "), i, 0, 4);
        return this.A01.get(i);
    }

    static {
        C2965BqG[] c2965BqGArr = new C2965BqG[14];
        c2965BqGArr[0] = new C2965BqG("ImageWidth", 256, 3, 4);
        c2965BqGArr[1] = new C2965BqG("ImageLength", 257, 3, 4);
        c2965BqGArr[2] = A00("Make", 271, 2);
        A01("Model", c2965BqGArr, 272, 2, 3);
        A01("Orientation", c2965BqGArr, 274, 3, 4);
        c2965BqGArr[5] = A00("XResolution", 282, 5);
        A01("YResolution", c2965BqGArr, 283, 5, 6);
        A01("ResolutionUnit", c2965BqGArr, 296, 3, 7);
        A01("Software", c2965BqGArr, 305, 2, 8);
        A01("DateTime", c2965BqGArr, MC.mwa_time_spent_killswitch.__CONFIG__, 2, 9);
        A01("YCbCrPositioning", c2965BqGArr, MC.wearables_hatch_health_connectors.__CONFIG__, 3, 10);
        A01("SubIFDPointer", c2965BqGArr, 330, 4, 11);
        A01("ExifIFDPointer", c2965BqGArr, 34665, 4, 12);
        A01("GPSInfoIFDPointer", c2965BqGArr, 34853, 4, 13);
        A08 = c2965BqGArr;
        C2965BqG[] c2965BqGArr2 = new C2965BqG[37];
        A01("ExposureTime", c2965BqGArr2, 33434, 5, 0);
        A01("FNumber", c2965BqGArr2, 33437, 5, 1);
        A01("ExposureProgram", c2965BqGArr2, 34850, 3, 2);
        c2965BqGArr2[3] = A00("PhotographicSensitivity", 34855, 3);
        A01("SensitivityType", c2965BqGArr2, 34864, 3, 4);
        A01("ExifVersion", c2965BqGArr2, 36864, 2, 5);
        A01("DateTimeOriginal", c2965BqGArr2, 36867, 2, 6);
        A01("DateTimeDigitized", c2965BqGArr2, 36868, 2, 7);
        A01("ComponentsConfiguration", c2965BqGArr2, 37121, 7, 8);
        A01("ShutterSpeedValue", c2965BqGArr2, 37377, 10, 9);
        A01("ApertureValue", c2965BqGArr2, 37378, 5, 10);
        A01("BrightnessValue", c2965BqGArr2, 37379, 10, 11);
        A01("ExposureBiasValue", c2965BqGArr2, 37380, 10, 12);
        A01("MaxApertureValue", c2965BqGArr2, 37381, 5, 13);
        A01("MeteringMode", c2965BqGArr2, 37383, 3, 14);
        c2965BqGArr2[15] = A00("LightSource", 37384, 3);
        c2965BqGArr2[16] = A00("Flash", 37385, 3);
        c2965BqGArr2[17] = A00("FocalLength", 37386, 5);
        c2965BqGArr2[18] = A00("SubSecTime", 37520, 2);
        c2965BqGArr2[19] = A00("SubSecTimeOriginal", 37521, 2);
        c2965BqGArr2[20] = A00("SubSecTimeDigitized", 37522, 2);
        c2965BqGArr2[21] = A00("FlashpixVersion", 40960, 7);
        c2965BqGArr2[22] = A00("ColorSpace", 40961, 3);
        c2965BqGArr2[23] = new C2965BqG("PixelXDimension", 40962, 3, 4);
        c2965BqGArr2[24] = new C2965BqG("PixelYDimension", 40963, 3, 4);
        c2965BqGArr2[25] = A00("InteroperabilityIFDPointer", 40965, 4);
        c2965BqGArr2[26] = A00("FocalPlaneResolutionUnit", 41488, 3);
        c2965BqGArr2[27] = A00("SensingMethod", 41495, 3);
        c2965BqGArr2[28] = A00("FileSource", 41728, 7);
        c2965BqGArr2[29] = A00("SceneType", 41729, 7);
        c2965BqGArr2[30] = A00("CustomRendered", 41985, 3);
        c2965BqGArr2[31] = A00("ExposureMode", 41986, 3);
        c2965BqGArr2[32] = A00("WhiteBalance", 41987, 3);
        c2965BqGArr2[33] = A00("SceneCaptureType", 41990, 3);
        c2965BqGArr2[34] = A00("Contrast", 41992, 3);
        c2965BqGArr2[35] = A00("Saturation", 41993, 3);
        c2965BqGArr2[36] = A00("Sharpness", 41994, 3);
        A05 = c2965BqGArr2;
        C2965BqG[] c2965BqGArr3 = new C2965BqG[13];
        c2965BqGArr3[0] = A00("GPSVersionID", 0, 1);
        c2965BqGArr3[1] = A00("GPSLatitudeRef", 1, 2);
        c2965BqGArr3[2] = new C2965BqG("GPSLatitude", 2, 5, 10);
        c2965BqGArr3[3] = A00("GPSLongitudeRef", 3, 2);
        c2965BqGArr3[4] = new C2965BqG("GPSLongitude", 4, 5, 10);
        c2965BqGArr3[5] = A00("GPSAltitudeRef", 5, 1);
        c2965BqGArr3[6] = A00("GPSAltitude", 6, 5);
        c2965BqGArr3[7] = A00("GPSTimeStamp", 7, 5);
        A01("GPSSpeedRef", c2965BqGArr3, 12, 2, 8);
        A01("GPSTrackRef", c2965BqGArr3, 14, 2, 9);
        A01("GPSImgDirectionRef", c2965BqGArr3, 16, 2, 10);
        A01("GPSDestBearingRef", c2965BqGArr3, 23, 2, 11);
        A01("GPSDestDistanceRef", c2965BqGArr3, 25, 2, 12);
        A06 = c2965BqGArr3;
        A03 = new C2965BqG[]{A00("SubIFDPointer", 330, 4), A00("ExifIFDPointer", 34665, 4), A00("GPSInfoIFDPointer", 34853, 4), A00("InteroperabilityIFDPointer", 40965, 4)};
        C2965BqG[] c2965BqGArr4 = new C2965BqG[1];
        A01("InteroperabilityIndex", c2965BqGArr4, 1, 2, 0);
        A07 = c2965BqGArr4;
        A04 = new C2965BqG[][]{c2965BqGArr, c2965BqGArr2, c2965BqGArr3, c2965BqGArr4};
        A02 = BV5.A0v(new String[]{"FNumber", "ExposureTime", "GPSTimeStamp"});
    }

    public static C2965BqG A00(String str, int i, int i2) {
        return new C2965BqG(str, i, i2);
    }

    public static void A01(String str, Object[] objArr, int i, int i2, int i3) {
        objArr[i3] = new C2965BqG(str, i, i2);
    }

    public BqH(ByteOrder byteOrder, List<Map<String, C2967BqK>> list) {
        BeS.A07(AnonymousClass003.A17(list.size()), "Malformed attributes list. Number of IFDs mismatch.");
        this.A00 = byteOrder;
        this.A01 = list;
    }
}
