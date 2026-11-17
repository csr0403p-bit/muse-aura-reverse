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
/* renamed from: X.Hbg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10409Hbg implements InterfaceC4520Cxw {
    public static final /* synthetic */ EnumC10409Hbg[] A00;
    public static final EnumC10409Hbg A01;
    public static final EnumC10409Hbg A02;
    public static final EnumC10409Hbg A03;
    public static final EnumC10409Hbg A04;
    public static final EnumC10409Hbg A05;
    public final int zzX;

    static {
        EnumC10409Hbg enumC10409Hbg = new EnumC10409Hbg("NO_ERROR", 0, 0);
        A04 = enumC10409Hbg;
        EnumC10409Hbg enumC10409Hbg2 = new EnumC10409Hbg("INCOMPATIBLE_INPUT", 1, 1);
        EnumC10409Hbg enumC10409Hbg3 = new EnumC10409Hbg("INCOMPATIBLE_OUTPUT", 2, 2);
        EnumC10409Hbg enumC10409Hbg4 = new EnumC10409Hbg("INCOMPATIBLE_TFLITE_VERSION", 3, 3);
        EnumC10409Hbg enumC10409Hbg5 = new EnumC10409Hbg("MISSING_OP", 4, 4);
        EnumC10409Hbg enumC10409HbgA00 = A00("DATA_TYPE_ERROR", 5, 6);
        EnumC10409Hbg enumC10409HbgA002 = A00("TFLITE_INTERNAL_ERROR", 6, 7);
        EnumC10409Hbg enumC10409HbgA003 = A00("TFLITE_UNKNOWN_ERROR", 7, 8);
        EnumC10409Hbg enumC10409HbgA004 = A00("MEDIAPIPE_ERROR", 8, 9);
        EnumC10409Hbg enumC10409HbgA005 = A00("TIME_OUT_FETCHING_MODEL_METADATA", 9, 5);
        EnumC10409Hbg enumC10409HbgA006 = A00("MODEL_NOT_DOWNLOADED", 10, 100);
        A05 = enumC10409HbgA006;
        EnumC10409Hbg enumC10409HbgA007 = A00("URI_EXPIRED", 11, FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE);
        EnumC10409Hbg enumC10409HbgA008 = A00("NO_NETWORK_CONNECTION", 12, 102);
        EnumC10409Hbg enumC10409HbgA009 = A00("METERED_NETWORK", 13, 103);
        EnumC10409Hbg enumC10409HbgA0010 = A00("DOWNLOAD_FAILED", 14, 104);
        EnumC10409Hbg enumC10409HbgA0011 = A00("MODEL_INFO_DOWNLOAD_UNSUCCESSFUL_HTTP_STATUS", 15, 105);
        EnumC10409Hbg enumC10409HbgA0012 = A00("MODEL_INFO_DOWNLOAD_NO_HASH", 16, 106);
        EnumC10409Hbg enumC10409HbgA0013 = A00("MODEL_INFO_DOWNLOAD_CONNECTION_FAILED", 17, 107);
        EnumC10409Hbg enumC10409HbgA0014 = A00("NO_VALID_MODEL", 18, MinidumpReader.MODULE_FULL_SIZE);
        EnumC10409Hbg enumC10409HbgA0015 = A00("LOCAL_MODEL_INVALID", 19, 109);
        EnumC10409Hbg enumC10409HbgA0016 = A00("REMOTE_MODEL_INVALID", 20, 110);
        EnumC10409Hbg enumC10409HbgA0017 = A00("REMOTE_MODEL_LOADER_ERROR", 21, 111);
        EnumC10409Hbg enumC10409HbgA0018 = A00("REMOTE_MODEL_LOADER_LOADS_NO_MODEL", 22, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        EnumC10409Hbg enumC10409HbgA0019 = A00("SMART_REPLY_LANG_ID_DETECTAION_FAILURE", 23, 113);
        EnumC10409Hbg enumC10409HbgA0020 = A00("MODEL_NOT_REGISTERED", 24, 114);
        EnumC10409Hbg enumC10409HbgA0021 = A00("MODEL_TYPE_MISUSE", 25, 115);
        EnumC10409Hbg enumC10409HbgA0022 = A00("MODEL_HASH_MISMATCH", 26, 116);
        EnumC10409Hbg enumC10409HbgA0023 = A00("OPTIONAL_MODULE_NOT_AVAILABLE", 27, 201);
        A01 = enumC10409HbgA0023;
        EnumC10409Hbg enumC10409HbgA0024 = A00("OPTIONAL_MODULE_INIT_ERROR", 28, 202);
        A02 = enumC10409HbgA0024;
        EnumC10409Hbg enumC10409HbgA0025 = A00("OPTIONAL_MODULE_INFERENCE_ERROR", 29, 203);
        EnumC10409Hbg enumC10409HbgA0026 = A00("OPTIONAL_MODULE_RELEASE_ERROR", 30, HatchWidgetWebViewKt.HTTP_NO_CONTENT);
        EnumC10409Hbg enumC10409HbgA0027 = A00("OPTIONAL_TFLITE_MODULE_INIT_ERROR", 31, 205);
        EnumC10409Hbg enumC10409HbgA0028 = A00("NATIVE_LIBRARY_LOAD_ERROR", 32, HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT);
        EnumC10409Hbg enumC10409HbgA0029 = A00("OPTIONAL_MODULE_CREATE_ERROR", 33, 207);
        EnumC10409Hbg enumC10409HbgA0030 = A00("CAMERAX_SOURCE_ERROR", 34, 301);
        EnumC10409Hbg enumC10409HbgA0031 = A00("CAMERA1_SOURCE_CANT_START_ERROR", 35, 302);
        EnumC10409Hbg enumC10409HbgA0032 = A00("CAMERA1_SOURCE_NO_SUITABLE_SIZE_ERROR", 36, 303);
        EnumC10409Hbg enumC10409HbgA0033 = A00("CAMERA1_SOURCE_NO_SUITABLE_FPS_ERROR", 37, 304);
        EnumC10409Hbg enumC10409HbgA0034 = A00("CAMERA1_SOURCE_NO_BYTE_SOURCE_FOUND_ERROR", 38, 305);
        EnumC10409Hbg enumC10409HbgA0035 = A00("CODE_SCANNER_UNAVAILABLE", 39, 400);
        EnumC10409Hbg enumC10409HbgA0036 = A00("CODE_SCANNER_CANCELLED", 40, 401);
        EnumC10409Hbg enumC10409HbgA0037 = A00("CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED", 41, MC.stella_payments_in_app_purchases.__CONFIG__);
        EnumC10409Hbg enumC10409HbgA0038 = A00("CODE_SCANNER_APP_NAME_UNAVAILABLE", 42, 403);
        EnumC10409Hbg enumC10409HbgA0039 = A00("CODE_SCANNER_TASK_IN_PROGRESS", 43, 404);
        EnumC10409Hbg enumC10409HbgA0040 = A00("CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR", 44, 405);
        EnumC10409Hbg enumC10409HbgA0041 = A00("CODE_SCANNER_PIPELINE_INFERENCE_ERROR", 45, MC.mwa_accounts_center_3p_link.__CONFIG__);
        EnumC10409Hbg enumC10409HbgA0042 = A00("CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD", 46, 407);
        EnumC10409Hbg enumC10409HbgA0043 = A00("UNKNOWN_ERROR", 47, IndexedInlineEntityExtension.MAX_SENTINEL_INDEX);
        A03 = enumC10409HbgA0043;
        EnumC10409Hbg[] enumC10409HbgArr = new EnumC10409Hbg[48];
        System.arraycopy(new EnumC10409Hbg[]{enumC10409HbgA0023, enumC10409HbgA0024, enumC10409HbgA0025, enumC10409HbgA0026, enumC10409HbgA0027, enumC10409HbgA0028, enumC10409HbgA0029, enumC10409HbgA0030, enumC10409HbgA0031, enumC10409HbgA0032, enumC10409HbgA0033, enumC10409HbgA0034, enumC10409HbgA0035, enumC10409HbgA0036, enumC10409HbgA0037, enumC10409HbgA0038, enumC10409HbgA0039, enumC10409HbgA0040, enumC10409HbgA0041, enumC10409HbgA0042, enumC10409HbgA0043}, BV5.A1U(new EnumC10409Hbg[]{enumC10409Hbg, enumC10409Hbg2, enumC10409Hbg3, enumC10409Hbg4, enumC10409Hbg5, enumC10409HbgA00, enumC10409HbgA002, enumC10409HbgA003, enumC10409HbgA004, enumC10409HbgA005, enumC10409HbgA006, enumC10409HbgA007, enumC10409HbgA008, enumC10409HbgA009, enumC10409HbgA0010, enumC10409HbgA0011, enumC10409HbgA0012, enumC10409HbgA0013, enumC10409HbgA0014, enumC10409HbgA0015, enumC10409HbgA0016, enumC10409HbgA0017, enumC10409HbgA0018, enumC10409HbgA0019, enumC10409HbgA0020, enumC10409HbgA0021, enumC10409HbgA0022}, enumC10409HbgArr) ? 1 : 0, enumC10409HbgArr, 27, 21);
        A00 = enumC10409HbgArr;
    }

    public static EnumC10409Hbg A00(String str, int i, int i2) {
        return new EnumC10409Hbg(str, i, i2);
    }

    public static EnumC10409Hbg[] values() {
        return (EnumC10409Hbg[]) A00.clone();
    }

    @Override // X.InterfaceC4520Cxw
    public final int AjA() {
        return this.zzX;
    }

    public EnumC10409Hbg(String str, int i, int i2) {
        this.zzX = i2;
    }
}
