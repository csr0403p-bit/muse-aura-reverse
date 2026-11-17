package com.facebook.secure.attestation.keystore;

import X.EEy;
import X.EFA;
import X.FGI;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* loaded from: classes5.dex */
public final class KeystoreOperationException extends Exception {
    public final EEy mError;

    /* JADX WARN: Illegal instructions before constructor call */
    public KeystoreOperationException(EEy eEy) {
        String str;
        Integer num = eEy.A04;
        String strA00 = num != null ? EFA.A00(num) : HatchCcvLoggingKt.NO_POSTAL_FIELD;
        Integer num2 = eEy.A05;
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str = "LOAD_KEYSTORE";
                    break;
                case 2:
                    str = "READ_KEY";
                    break;
                case 3:
                    str = "COMPUTE_KEY_HASH";
                    break;
                case 4:
                    str = "CONFIGURE_KEY";
                    break;
                case 5:
                    str = "GENERATE_KEY";
                    break;
                case 6:
                    str = "READ_CERTIFICATE_CHAIN";
                    break;
                case 7:
                    str = "ENCODE_CERTIFICATE_CHAIN";
                    break;
                case 8:
                    str = "CHECK_PLATFORM_SUPPORT";
                    break;
                case 9:
                    str = "CREATE_SIGNATURE";
                    break;
                case 10:
                    str = "INITIALIZE_SIGNATURE";
                    break;
                case 11:
                    str = "SIGN_DATA";
                    break;
                case 12:
                    str = "ATTESTATION_AKA_PROOF_FLOW";
                    break;
                case 13:
                    str = "ATTESTATION_AKA_REFRESH_FLOW";
                    break;
                case 14:
                    str = "REQUEST_TOKEN";
                    break;
                case 15:
                    str = "READ_TOKEN";
                    break;
                case 16:
                    str = "ATTESTATION_GPIA_REFRESH_FLOW";
                    break;
                default:
                    str = "VALIDATE_INPUT";
                    break;
            }
        } else {
            str = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        }
        super(FGI.A0U(strA00, " at ", str), eEy.A03);
        this.mError = eEy;
    }
}
