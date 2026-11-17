package X;

import com.facebook.aura.login.nativeflow.HatchRegistrationAttestorKt;

/* loaded from: classes5.dex */
public abstract class EFA extends Enum<EFA> {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "INVALID_SIGNING_PAYLOAD";
            case 2:
                return "UNSUPPORTED_API";
            case 3:
                return "KEYSTORE_UNAVAILABLE";
            case 4:
                return "KEYSTORE_ACCESS_FAILED";
            case 5:
                return "KEY_DISAPPEARED";
            case 6:
                return "UNEXPECTED_KEY_TYPE";
            case 7:
                return "KEY_MATERIAL_UNAVAILABLE";
            case 8:
                return "KEY_GENERATION_FAILED";
            case 9:
                return "UNATTESTED_KEY_GENERATED";
            case 10:
                return "STRONGBOX_UNAVAILABLE";
            case 11:
                return "DEVICE_INFORMATION_UNAVAILABLE";
            case 12:
                return "CERTIFICATE_CHAIN_UNAVAILABLE";
            case 13:
                return "CERTIFICATE_CHAIN_ENCODING_FAILED";
            case 14:
                return "SIGNATURE_ALGORITHM_UNAVAILABLE";
            case 15:
                return "KEY_INVALIDATED";
            case 16:
                return "INVALID_SIGNING_KEY";
            case 17:
                return "CRYPTOGRAPHIC_OPERATION_FAILED";
            case 18:
                return "PROVIDER_FAILURE";
            case 19:
                return "MISSING";
            case 20:
                return "MISSING_KEY";
            case 21:
                return "KEY_IDENTITY_MISMATCH";
            case 22:
                return "OPERATION_TIMED_OUT";
            case 23:
                return "OPERATION_REJECTED";
            case 24:
                return HatchRegistrationAttestorKt.UNEXPECTED_FAILURE;
            case 25:
                return "INVALID_REQUEST";
            case 26:
                return "INVALID_EXPECTED_KEY_HASH";
            case 27:
                return "COMPONENT_NOT_REGISTERED";
            case 28:
                return "PROVIDER_ERROR";
            case 29:
                return "INVALID_RESPONSE";
            case 30:
                return "DISABLED_BY_CONFIG";
            case 31:
                return "CONFIG_UNAVAILABLE";
            case 32:
                return "ALIAS_NOT_DECLARED";
            case 33:
                return "ALIAS_ALLOWLIST_UNAVAILABLE";
            default:
                return "INVALID_ATTESTATION_CHALLENGE";
        }
    }
}
