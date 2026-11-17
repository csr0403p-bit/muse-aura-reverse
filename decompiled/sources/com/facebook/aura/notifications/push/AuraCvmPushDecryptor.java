package com.facebook.aura.notifications.push;

import X.AIW;
import X.AbstractC08489zs;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BV3;
import X.C06H;
import X.C0924AIa;
import X.C3cG;
import X.C60N;
import X.C60O;
import X.C7384Etj;
import X.C7438Evz;
import X.C7BY;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.C9tI;
import X.C9zv;
import X.DCl;
import X.FGI;
import android.net.Uri;
import android.util.Base64;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.notifications.push.AuraCvmPushDecryptResult;
import com.facebook.secure.hatchcvm.HatchCVMException;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraCvmPushDecryptor {
    public static final String APPROVAL_REQUEST_TYPE = "approval_request";
    public static final int BASE64_FLAGS = 11;
    public static final long CLOCK_SKEW_MS = 120000;
    public static final int MAX_CIPHERTEXT_BASE64_LENGTH = 2752;
    public static final int MAX_CIPHERTEXT_BYTES = 2064;
    public static final int MAX_HEADER_BASE64_LENGTH = 4096;
    public static final long MAX_LIFETIME_MS = 600000;
    public static final int NONCE_BASE64_LENGTH = 16;
    public static final int NONCE_LENGTH_BYTES = 12;
    public static final String PARAM_SESSION_ID = "session_id";
    public static final String PARAM_VM_ID = "vm_id";
    public static final String PROTOCOL_VERSION = "1";
    public static final int TAG_LENGTH_BYTES = 16;
    public static final int UUID_LENGTH = 36;
    public static final String WILDCARD_DEVICE_ID = "*";
    public final Function0<Long> nowMs;
    public static final Companion Companion = new Companion();
    public static final String BOT_MESSAGE_TYPE = "bot_message";
    public static final Set<String> SUPPORTED_TYPES = C60O.A19(BOT_MESSAGE_TYPE, "approval_request");

    /* renamed from: com.facebook.aura.notifications.push.AuraCvmPushDecryptor$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements Function0<Long> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return C60O.A0k();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return C60O.A0k();
        }
    }

    private final boolean isCanonicalUuid(String str) {
        try {
            if (str.length() == 36) {
                if (UUID.fromString(str).toString().equals(str)) {
                    return true;
                }
            }
        } catch (IllegalArgumentException unused) {
        }
        return false;
    }

    public final AuraCvmPushDecryptResult decrypt(AuraPushNotificationData auraPushNotificationData, AuraCvmPushEnvelope auraCvmPushEnvelope, String str, String str2, byte[] bArr) throws Throwable {
        String strA00;
        int length;
        int length2;
        AuraCvmPushDecryptResult failure;
        C7384Etj.A0Y(auraPushNotificationData, 0);
        AnonymousClass005.A11(auraCvmPushEnvelope, str, str2, 1);
        C7384Etj.A0Y(bArr, 4);
        if ("1".equals(auraCvmPushEnvelope.version)) {
            String str3 = auraPushNotificationData.vmId;
            if (str3 == null || C7BY.A0j(str3)) {
                strA00 = "missing_vm";
            } else {
                if (str3.equals(str)) {
                    String str4 = auraCvmPushEnvelope.header;
                    int length3 = str4.length();
                    if (length3 != 0 && length3 <= 4096 && auraCvmPushEnvelope.nonce.length() == 16 && (length = auraCvmPushEnvelope.ciphertext.length()) != 0 && length <= 2752) {
                        byte[] bArrDecodeCanonicalBase64Url = decodeCanonicalBase64Url(str4);
                        if (bArrDecodeCanonicalBase64Url == null) {
                            return new AuraCvmPushDecryptResult.Failure("invalid_header");
                        }
                        byte[] bArrDecodeCanonicalBase64Url2 = decodeCanonicalBase64Url(auraCvmPushEnvelope.nonce);
                        if (bArrDecodeCanonicalBase64Url2 == null) {
                            strA00 = "invalid_nonce";
                        } else {
                            byte[] bArrDecodeCanonicalBase64Url3 = decodeCanonicalBase64Url(auraCvmPushEnvelope.ciphertext);
                            if (bArrDecodeCanonicalBase64Url3 == null) {
                                strA00 = "invalid_ciphertext";
                            } else if (bArrDecodeCanonicalBase64Url2.length == 12 && (length2 = bArrDecodeCanonicalBase64Url3.length) >= 16 && length2 <= 2064) {
                                try {
                                    byte[] bArr2 = AbstractC08489zs.A01;
                                    if (bArr.length != 32) {
                                        throw C60O.A0i(BV3.A00(42));
                                    }
                                    byte[] bArr3 = C9zv.A00;
                                    byte[] bArrA01 = C9zv.A01(bArr, AbstractC08489zs.A01);
                                    try {
                                        try {
                                            Cipher cipherA0e = C8j5.A0e(bArrA01, bArrDecodeCanonicalBase64Url2, 2);
                                            cipherA0e.updateAAD(AbstractC08489zs.A00);
                                            cipherA0e.updateAAD(bArrDecodeCanonicalBase64Url);
                                            byte[] bArrDoFinal = cipherA0e.doFinal(bArrDecodeCanonicalBase64Url3);
                                            C7384Etj.A0U(bArrDoFinal);
                                            Arrays.fill(bArrA01, 0, 32, (byte) 0);
                                            try {
                                                AuraCvmPushHeaderJson auraCvmPushHeaderJsonDecodeHeader = decodeHeader(bArrDecodeCanonicalBase64Url);
                                                if (auraCvmPushHeaderJsonDecodeHeader == null) {
                                                    failure = new AuraCvmPushDecryptResult.Failure("invalid_header");
                                                } else {
                                                    String strValidateHeader = validateHeader(auraCvmPushHeaderJsonDecodeHeader, str3, str, str2);
                                                    if (strValidateHeader != null) {
                                                        failure = new AuraCvmPushDecryptResult.Failure(strValidateHeader);
                                                    } else {
                                                        AuraCvmPushPlaintextJson auraCvmPushPlaintextJsonDecodePlaintext = decodePlaintext(bArrDoFinal);
                                                        failure = auraCvmPushPlaintextJsonDecodePlaintext == null ? new AuraCvmPushDecryptResult.Failure("invalid_plaintext") : normalize(auraPushNotificationData, auraCvmPushHeaderJsonDecodeHeader, auraCvmPushPlaintextJsonDecodePlaintext);
                                                    }
                                                }
                                                return failure;
                                            } finally {
                                                C8j3.A1L(bArrDoFinal);
                                            }
                                        } catch (GeneralSecurityException e) {
                                            throw new HatchCVMException("CVM push decryption failed", e);
                                        }
                                    } catch (Throwable th) {
                                        Arrays.fill(bArrA01, 0, 32, (byte) 0);
                                        throw th;
                                    }
                                } catch (Exception unused) {
                                    return new AuraCvmPushDecryptResult.Failure("authentication_failed");
                                }
                            }
                        }
                    }
                    return new AuraCvmPushDecryptResult.Failure("invalid_envelope");
                }
                strA00 = "vm_mismatch";
            }
        } else {
            strA00 = C60N.A00(103);
        }
        return new AuraCvmPushDecryptResult.Failure(strA00);
    }

    public /* synthetic */ AuraCvmPushDecryptor(Function0 function0, int i, C06H c06h) {
        this((i & 1) != 0 ? AnonymousClass1.INSTANCE : function0);
    }

    private final AuraCvmPushHeaderJson decodeHeader(byte[] bArr) {
        try {
            return (AuraCvmPushHeaderJson) HatchJsonKt.HatchJson.A00(decodeUtf8(bArr), AuraCvmPushHeaderJson$$serializer.INSTANCE);
        } catch (Exception unused) {
            return null;
        }
    }

    private final AuraCvmPushPlaintextJson decodePlaintext(byte[] bArr) {
        try {
            return (AuraCvmPushPlaintextJson) HatchJsonKt.HatchJson.A00(decodeUtf8(bArr), AuraCvmPushPlaintextJson$$serializer.INSTANCE);
        } catch (Exception unused) {
            return null;
        }
    }

    private final String decodeUtf8(byte[] bArr) {
        CharsetDecoder charsetDecoderNewDecoder = DCl.A05.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        return C60O.A0o(charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr)));
    }

    private final AuraCvmPushDecryptResult.Failure failure(String str) {
        return new AuraCvmPushDecryptResult.Failure(str);
    }

    private final AuraCvmPushDecryptResult normalize(AuraPushNotificationData auraPushNotificationData, AuraCvmPushHeaderJson auraCvmPushHeaderJson, AuraCvmPushPlaintextJson auraCvmPushPlaintextJson) {
        String strA00;
        String str;
        AuraCvmPushDecryptResult auraCvmPushDecryptResultSuccess;
        if (C7384Etj.areEqual(auraCvmPushPlaintextJson.notification_type, auraCvmPushHeaderJson.type)) {
            String str2 = auraCvmPushPlaintextJson.title;
            if (str2 == null || C7BY.A0j(str2) || (str = auraCvmPushPlaintextJson.body) == null || C7BY.A0j(str)) {
                strA00 = C60N.A00(76);
            } else {
                if ("approval_request".equals(auraCvmPushHeaderJson.type)) {
                    return normalizeApproval(auraPushNotificationData, auraCvmPushHeaderJson, auraCvmPushPlaintextJson);
                }
                String str3 = auraCvmPushPlaintextJson.data.message_id;
                Integer numA0r = null;
                if (C7BY.A0j(str3) || str3 == null) {
                    strA00 = "missing_message_id";
                } else {
                    String str4 = auraCvmPushPlaintextJson.data.thread_id;
                    if (str4 == null || !C7BY.A0j(str4)) {
                        String str5 = auraCvmPushPlaintextJson.data.unread_count;
                        if (str5 == null) {
                            Uri.Builder builderAuthority = new Uri.Builder().scheme("hatch").authority(str4 == null ? "chat" : "thread");
                            if (str4 != null) {
                                builderAuthority.appendPath(str4);
                            }
                            String strA0o = C60O.A0o(builderAuthority.appendPath(str3).build());
                            C0924AIa c0924AIaA0u = C3cG.A0u();
                            Map<String, String> map = auraPushNotificationData.params;
                            String strA002 = C60N.A00(15);
                            String str6 = map.get(strA002);
                            if (str6 != null) {
                                c0924AIaA0u.put(strA002, str6);
                            }
                            c0924AIaA0u.put("vm_id", auraCvmPushHeaderJson.vm_id);
                            c0924AIaA0u.put("path", strA0o);
                            if (str4 != null) {
                                c0924AIaA0u.put("session_id", str4);
                            }
                            C0924AIa c0924AIaA0K = AIW.A0K(c0924AIaA0u);
                            String str7 = auraCvmPushPlaintextJson.title;
                            String str8 = auraCvmPushPlaintextJson.body;
                            String str9 = auraCvmPushHeaderJson.vm_id;
                            String strA003 = C60N.A00(85);
                            auraCvmPushDecryptResultSuccess = success(auraPushNotificationData.copy(strA003, auraPushNotificationData.timeStamp, str7, null, str8, auraPushNotificationData.targetUid, c0924AIaA0K, auraPushNotificationData.isLoggedOutPush, null, null, strA003, auraPushNotificationData.inappNotifId, numA0r, str9), auraCvmPushHeaderJson);
                        } else {
                            if (str5.length() != 0) {
                                int i = 0;
                                while (true) {
                                    if (i < str5.length()) {
                                        char cCharAt = str5.charAt(i);
                                        if ('0' > cCharAt || cCharAt >= ':') {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        numA0r = C9tI.A0r(str5);
                                        if (numA0r != null) {
                                        }
                                    }
                                }
                            }
                            auraCvmPushDecryptResultSuccess = new AuraCvmPushDecryptResult.Failure("invalid_unread_count");
                        }
                        return auraCvmPushDecryptResultSuccess;
                    }
                    strA00 = "invalid_thread_id";
                }
            }
        } else {
            strA00 = "invalid_notification_type";
        }
        auraCvmPushDecryptResultSuccess = new AuraCvmPushDecryptResult.Failure(strA00);
        return auraCvmPushDecryptResultSuccess;
    }

    private final AuraCvmPushDecryptResult normalizeApproval(AuraPushNotificationData auraPushNotificationData, AuraCvmPushHeaderJson auraCvmPushHeaderJson, AuraCvmPushPlaintextJson auraCvmPushPlaintextJson) {
        AuraCvmPushDecryptResult failure;
        String str = auraCvmPushPlaintextJson.data.approval_id;
        if (C7BY.A0j(str) || str == null) {
            failure = new AuraCvmPushDecryptResult.Failure("missing_approval_id");
        } else {
            String strA0M = FGI.A0M("hatch://chat?approval_id=", Uri.encode(str));
            String str2 = auraCvmPushPlaintextJson.title;
            String str3 = auraCvmPushPlaintextJson.body;
            Map<String, String> mapA0d = AnonymousClass007.A0d("path", strA0M, C3cG.A0r("vm_id", auraCvmPushHeaderJson.vm_id));
            String str4 = auraCvmPushHeaderJson.vm_id;
            String strA00 = C60N.A00(86);
            failure = success(auraPushNotificationData.copy(strA00, auraPushNotificationData.timeStamp, str2, null, str3, auraPushNotificationData.targetUid, mapA0d, auraPushNotificationData.isLoggedOutPush, null, "approval_request", strA00, auraPushNotificationData.inappNotifId, null, str4), auraCvmPushHeaderJson);
        }
        return failure;
    }

    private final AuraCvmPushDecryptResult.Success success(AuraPushNotificationData auraPushNotificationData, AuraCvmPushHeaderJson auraCvmPushHeaderJson) {
        return new AuraCvmPushDecryptResult.Success(auraPushNotificationData, auraCvmPushHeaderJson.notification_id, auraCvmPushHeaderJson.expires_at_ms + 120000);
    }

    private final String validateHeader(AuraCvmPushHeaderJson auraCvmPushHeaderJson, String str, String str2, String str3) {
        if (auraCvmPushHeaderJson.v != 1 || auraCvmPushHeaderJson.key_epoch != 1 || !SUPPORTED_TYPES.contains(auraCvmPushHeaderJson.type)) {
            return "unsupported_header";
        }
        if (!C7384Etj.areEqual(auraCvmPushHeaderJson.vm_id, str) || !C7384Etj.areEqual(auraCvmPushHeaderJson.vm_id, str2)) {
            return "vm_mismatch";
        }
        String str4 = auraCvmPushHeaderJson.device_id;
        if (!"*".equals(str4) && !C7384Etj.areEqual(str4, str3)) {
            return "device_mismatch";
        }
        if (!isCanonicalUuid(auraCvmPushHeaderJson.notification_id)) {
            return "invalid_notification_id";
        }
        long j = auraCvmPushHeaderJson.issued_at_ms;
        if (j <= 0) {
            return "invalid_lifetime";
        }
        long j2 = auraCvmPushHeaderJson.expires_at_ms;
        if (j2 <= j || j2 - j > 600000) {
            return "invalid_lifetime";
        }
        long jA0Q = C8j4.A0Q(this.nowMs);
        if (auraCvmPushHeaderJson.issued_at_ms > jA0Q + 120000 || auraCvmPushHeaderJson.expires_at_ms < jA0Q - 120000) {
            return "outside_validity_window";
        }
        return null;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final byte[] decodeCanonicalBase64Url(String str) {
        byte[] bArrDecode;
        int length = str.length();
        if (length != 0) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '-' || cCharAt == '_') {
                }
            }
            try {
                bArrDecode = Base64.decode(str, 11);
            } catch (IllegalArgumentException unused) {
            }
            if (str.equals(Base64.encodeToString(bArrDecode, 11))) {
                return bArrDecode;
            }
            return null;
        }
        return null;
    }

    public AuraCvmPushDecryptor(Function0<Long> function0) {
        C7384Etj.A0Y(function0, 0);
        this.nowMs = function0;
    }

    public AuraCvmPushDecryptor() {
        this(AnonymousClass1.INSTANCE);
    }
}
