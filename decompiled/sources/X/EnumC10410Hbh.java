package X;

import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.accountcenter.MC;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.iap.MC;
import com.facebook.aura.markdown.parser.custom.extensions.IndexedInlineEntityExtension;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hbh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10410Hbh implements InterfaceC4521Cxx {
    public static final /* synthetic */ EnumC10410Hbh[] A00;
    public static final EnumC10410Hbh A01;
    public static final EnumC10410Hbh A02;
    public static final EnumC10410Hbh A03;
    public final int zzX;

    static {
        EnumC10410Hbh enumC10410Hbh = new EnumC10410Hbh("NO_ERROR", 0, 0);
        A02 = enumC10410Hbh;
        EnumC10410Hbh enumC10410Hbh2 = new EnumC10410Hbh("INCOMPATIBLE_INPUT", 1, 1);
        EnumC10410Hbh enumC10410Hbh3 = new EnumC10410Hbh("INCOMPATIBLE_OUTPUT", 2, 2);
        EnumC10410Hbh enumC10410Hbh4 = new EnumC10410Hbh("INCOMPATIBLE_TFLITE_VERSION", 3, 3);
        EnumC10410Hbh enumC10410Hbh5 = new EnumC10410Hbh("MISSING_OP", 4, 4);
        EnumC10410Hbh enumC10410HbhA00 = A00("DATA_TYPE_ERROR", 5, 6);
        EnumC10410Hbh enumC10410HbhA002 = A00("TFLITE_INTERNAL_ERROR", 6, 7);
        EnumC10410Hbh enumC10410HbhA003 = A00("TFLITE_UNKNOWN_ERROR", 7, 8);
        EnumC10410Hbh enumC10410HbhA004 = A00("MEDIAPIPE_ERROR", 8, 9);
        EnumC10410Hbh enumC10410HbhA005 = A00("TIME_OUT_FETCHING_MODEL_METADATA", 9, 5);
        EnumC10410Hbh enumC10410HbhA006 = A00("MODEL_NOT_DOWNLOADED", 10, 100);
        A03 = enumC10410HbhA006;
        EnumC10410Hbh enumC10410HbhA007 = A00("URI_EXPIRED", 11, FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE);
        EnumC10410Hbh enumC10410HbhA008 = A00("NO_NETWORK_CONNECTION", 12, 102);
        EnumC10410Hbh enumC10410HbhA009 = A00("METERED_NETWORK", 13, 103);
        EnumC10410Hbh enumC10410HbhA0010 = A00("DOWNLOAD_FAILED", 14, 104);
        EnumC10410Hbh enumC10410HbhA0011 = A00("MODEL_INFO_DOWNLOAD_UNSUCCESSFUL_HTTP_STATUS", 15, 105);
        EnumC10410Hbh enumC10410HbhA0012 = A00("MODEL_INFO_DOWNLOAD_NO_HASH", 16, 106);
        EnumC10410Hbh enumC10410HbhA0013 = A00("MODEL_INFO_DOWNLOAD_CONNECTION_FAILED", 17, 107);
        EnumC10410Hbh enumC10410HbhA0014 = A00("NO_VALID_MODEL", 18, MinidumpReader.MODULE_FULL_SIZE);
        EnumC10410Hbh enumC10410HbhA0015 = A00("LOCAL_MODEL_INVALID", 19, 109);
        EnumC10410Hbh enumC10410HbhA0016 = A00("REMOTE_MODEL_INVALID", 20, 110);
        EnumC10410Hbh enumC10410HbhA0017 = A00("REMOTE_MODEL_LOADER_ERROR", 21, 111);
        EnumC10410Hbh enumC10410HbhA0018 = A00("REMOTE_MODEL_LOADER_LOADS_NO_MODEL", 22, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        EnumC10410Hbh enumC10410HbhA0019 = A00("SMART_REPLY_LANG_ID_DETECTAION_FAILURE", 23, 113);
        EnumC10410Hbh enumC10410HbhA0020 = A00("MODEL_NOT_REGISTERED", 24, 114);
        EnumC10410Hbh enumC10410HbhA0021 = A00("MODEL_TYPE_MISUSE", 25, 115);
        EnumC10410Hbh enumC10410HbhA0022 = A00("MODEL_HASH_MISMATCH", 26, 116);
        EnumC10410Hbh enumC10410HbhA0023 = A00("OPTIONAL_MODULE_NOT_AVAILABLE", 27, 201);
        EnumC10410Hbh enumC10410HbhA0024 = A00("OPTIONAL_MODULE_INIT_ERROR", 28, 202);
        EnumC10410Hbh enumC10410HbhA0025 = A00("OPTIONAL_MODULE_INFERENCE_ERROR", 29, 203);
        EnumC10410Hbh enumC10410HbhA0026 = A00("OPTIONAL_MODULE_RELEASE_ERROR", 30, HatchWidgetWebViewKt.HTTP_NO_CONTENT);
        EnumC10410Hbh enumC10410HbhA0027 = A00("OPTIONAL_TFLITE_MODULE_INIT_ERROR", 31, 205);
        EnumC10410Hbh enumC10410HbhA0028 = A00("NATIVE_LIBRARY_LOAD_ERROR", 32, HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT);
        EnumC10410Hbh enumC10410HbhA0029 = A00("OPTIONAL_MODULE_CREATE_ERROR", 33, 207);
        EnumC10410Hbh enumC10410HbhA0030 = A00("CAMERAX_SOURCE_ERROR", 34, 301);
        EnumC10410Hbh enumC10410HbhA0031 = A00("CAMERA1_SOURCE_CANT_START_ERROR", 35, 302);
        EnumC10410Hbh enumC10410HbhA0032 = A00("CAMERA1_SOURCE_NO_SUITABLE_SIZE_ERROR", 36, 303);
        EnumC10410Hbh enumC10410HbhA0033 = A00("CAMERA1_SOURCE_NO_SUITABLE_FPS_ERROR", 37, 304);
        EnumC10410Hbh enumC10410HbhA0034 = A00("CAMERA1_SOURCE_NO_BYTE_SOURCE_FOUND_ERROR", 38, 305);
        EnumC10410Hbh enumC10410HbhA0035 = A00("CODE_SCANNER_UNAVAILABLE", 39, 400);
        EnumC10410Hbh enumC10410HbhA0036 = A00("CODE_SCANNER_CANCELLED", 40, 401);
        EnumC10410Hbh enumC10410HbhA0037 = A00("CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED", 41, MC.stella_payments_in_app_purchases.__CONFIG__);
        EnumC10410Hbh enumC10410HbhA0038 = A00("CODE_SCANNER_APP_NAME_UNAVAILABLE", 42, 403);
        EnumC10410Hbh enumC10410HbhA0039 = A00("CODE_SCANNER_TASK_IN_PROGRESS", 43, 404);
        EnumC10410Hbh enumC10410HbhA0040 = A00("CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR", 44, 405);
        EnumC10410Hbh enumC10410HbhA0041 = A00("CODE_SCANNER_PIPELINE_INFERENCE_ERROR", 45, MC.mwa_accounts_center_3p_link.__CONFIG__);
        EnumC10410Hbh enumC10410HbhA0042 = A00("CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD", 46, 407);
        EnumC10410Hbh enumC10410HbhA0043 = A00("UNKNOWN_ERROR", 47, IndexedInlineEntityExtension.MAX_SENTINEL_INDEX);
        A01 = enumC10410HbhA0043;
        EnumC10410Hbh[] enumC10410HbhArr = new EnumC10410Hbh[48];
        System.arraycopy(new EnumC10410Hbh[]{enumC10410HbhA0023, enumC10410HbhA0024, enumC10410HbhA0025, enumC10410HbhA0026, enumC10410HbhA0027, enumC10410HbhA0028, enumC10410HbhA0029, enumC10410HbhA0030, enumC10410HbhA0031, enumC10410HbhA0032, enumC10410HbhA0033, enumC10410HbhA0034, enumC10410HbhA0035, enumC10410HbhA0036, enumC10410HbhA0037, enumC10410HbhA0038, enumC10410HbhA0039, enumC10410HbhA0040, enumC10410HbhA0041, enumC10410HbhA0042, enumC10410HbhA0043}, BV5.A1U(new EnumC10410Hbh[]{enumC10410Hbh, enumC10410Hbh2, enumC10410Hbh3, enumC10410Hbh4, enumC10410Hbh5, enumC10410HbhA00, enumC10410HbhA002, enumC10410HbhA003, enumC10410HbhA004, enumC10410HbhA005, enumC10410HbhA006, enumC10410HbhA007, enumC10410HbhA008, enumC10410HbhA009, enumC10410HbhA0010, enumC10410HbhA0011, enumC10410HbhA0012, enumC10410HbhA0013, enumC10410HbhA0014, enumC10410HbhA0015, enumC10410HbhA0016, enumC10410HbhA0017, enumC10410HbhA0018, enumC10410HbhA0019, enumC10410HbhA0020, enumC10410HbhA0021, enumC10410HbhA0022}, enumC10410HbhArr) ? 1 : 0, enumC10410HbhArr, 27, 21);
        A00 = enumC10410HbhArr;
    }

    public static EnumC10410Hbh A00(String str, int i, int i2) {
        return new EnumC10410Hbh(str, i, i2);
    }

    public static EnumC10410Hbh[] values() {
        return (EnumC10410Hbh[]) A00.clone();
    }

    @Override // X.InterfaceC4521Cxx
    public final int AjA() {
        return this.zzX;
    }

    public EnumC10410Hbh(String str, int i, int i2) {
        this.zzX = i2;
    }
}
