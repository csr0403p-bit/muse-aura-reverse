package com.facebook.aura.devices.pairing;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.C8j4;
import X.C9sU;
import com.facebook.aura.devices.pairing.LinkEncryptedDecryptResult;
import com.facebook.aura.devices.pairing.LinkSetupCrypto;
import com.facebook.aura.devices.token.LinkDeviceKeyProvisionFields;
import com.facebook.aura.json.HatchJsonKt;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public final class LinkEncryptedPairingSession {
    public static final int $stable = 8;
    public final Integer confirmTimeoutSeconds;
    public final boolean isCommunity;
    public final byte[] mobileRxKey;
    public final byte[] mobileTxKey;
    public long nextRxCounter;
    public long nextTxCounter;
    public final LinkPairingMode pairingMode;
    public final String pairingPolicy;
    public final byte[] sessionId;
    public final String sessionIdB64;

    public final synchronized LinkEncryptedDecryptResult decryptDeviceToMobile(LinkEncryptedRecordJson linkEncryptedRecordJson) {
        LinkEncryptedDecryptResult failure;
        byte[] bArrBase64UrlDecode;
        LinkEncryptedDecryptResult.Failure failure2;
        C7384Etj.A0Y(linkEncryptedRecordJson, 0);
        if (C7384Etj.areEqual(linkEncryptedRecordJson.session_id, this.sessionIdB64)) {
            LinkSetupCrypto linkSetupCrypto = LinkSetupCrypto.INSTANCE;
            Long counter = linkSetupCrypto.parseCounter(linkEncryptedRecordJson.counter);
            if (counter != null) {
                long jLongValue = counter.longValue();
                long j = this.nextRxCounter;
                if (jLongValue == j) {
                    byte[] bArrBase64UrlDecode2 = linkSetupCrypto.base64UrlDecode(linkEncryptedRecordJson.ciphertext);
                    if (bArrBase64UrlDecode2 == null || (bArrBase64UrlDecode = linkSetupCrypto.base64UrlDecode(linkEncryptedRecordJson.tag)) == null) {
                        failure2 = new LinkEncryptedDecryptResult.Failure(LinkEncryptedDecryptFailure.INVALID_CIPHERTEXT, null, null);
                    } else {
                        byte[] bArrDecryptAesGcm = linkSetupCrypto.decryptAesGcm(this.mobileRxKey, linkSetupCrypto.recordNonce((byte) 1, jLongValue), recordAad(LinkPairingProtocolStrings.RECORD_DIRECTION_DEVICE_TO_MOBILE, jLongValue), bArrBase64UrlDecode2, bArrBase64UrlDecode);
                        if (bArrDecryptAesGcm == null) {
                            failure2 = new LinkEncryptedDecryptResult.Failure(LinkEncryptedDecryptFailure.AUTHENTICATION_FAILED, null, null);
                        } else {
                            this.nextRxCounter = checkedIncrement(jLongValue);
                            failure = new LinkEncryptedDecryptResult.Success(bArrDecryptAesGcm);
                        }
                    }
                    return failure2;
                }
                failure = new LinkEncryptedDecryptResult.Failure(LinkEncryptedDecryptFailure.UNEXPECTED_COUNTER, Long.valueOf(j), counter);
            } else {
                failure = new LinkEncryptedDecryptResult.Failure(LinkEncryptedDecryptFailure.INVALID_COUNTER, null, null);
            }
        } else {
            failure = new LinkEncryptedDecryptResult.Failure(LinkEncryptedDecryptFailure.SESSION_MISMATCH, null, null);
        }
        return failure;
    }

    public final synchronized LinkEncryptedRecordJson encryptMobileToDevice(byte[] bArr) {
        long j;
        LinkSetupCrypto linkSetupCrypto;
        LinkSetupCrypto.SealedAesGcm sealedAesGcmEncryptAesGcm;
        C7384Etj.A0Y(bArr, 0);
        j = this.nextTxCounter;
        this.nextTxCounter = checkedIncrement(j);
        linkSetupCrypto = LinkSetupCrypto.INSTANCE;
        sealedAesGcmEncryptAesGcm = linkSetupCrypto.encryptAesGcm(this.mobileTxKey, linkSetupCrypto.recordNonce((byte) 0, j), recordAad(LinkPairingProtocolStrings.RECORD_DIRECTION_MOBILE_TO_DEVICE, j), bArr);
        return new LinkEncryptedRecordJson(LinkPairingProtocolStrings.ACTION_ENCRYPTED_RECORD, this.sessionIdB64, String.valueOf(j), linkSetupCrypto.base64UrlEncode(sealedAesGcmEncryptAesGcm.ciphertext), linkSetupCrypto.base64UrlEncode(sealedAesGcmEncryptAesGcm.tag));
    }

    public final LinkEncryptedRecordJson encryptOta(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        if (this.isCommunity) {
            throw C60O.A0i("Meta updates are unavailable for community devices");
        }
        return encryptPayload(HatchJsonKt.HatchJson.A02(new LinkOtaActionJson(LinkPairingProtocolStrings.ACTION_OTA, str, z), LinkOtaActionJson$$serializer.INSTANCE));
    }

    private final LinkEncryptedRecordJson encryptAuthenticatedAction(String str) {
        return encryptPayload(HatchJsonKt.HatchJson.A02(new LinkAuthenticatedActionJson(str), LinkAuthenticatedActionJson$$serializer.INSTANCE));
    }

    private final LinkEncryptedRecordJson encryptPayload(String str) {
        Charset charset = StandardCharsets.UTF_8;
        C7384Etj.A0V(charset);
        byte[] bytes = str.getBytes(charset);
        try {
            return encryptMobileToDevice(bytes);
        } finally {
            C8j4.A1T(bytes);
        }
    }

    public static /* synthetic */ LinkEncryptedRecordJson encryptProvision$default(LinkEncryptedPairingSession linkEncryptedPairingSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, LinkDeviceKeyProvisionFields linkDeviceKeyProvisionFields, int i, Object obj) {
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 32) != 0) {
            str6 = null;
        }
        if ((i & 64) != 0) {
            str7 = null;
        }
        if ((i & 128) != 0) {
            bool = null;
        }
        if ((i & 256) != 0) {
            str8 = null;
        }
        if ((i & 512) != 0) {
            str9 = null;
        }
        if ((i & 1024) != 0) {
            str10 = null;
        }
        if ((i & 2048) != 0) {
            linkDeviceKeyProvisionFields = null;
        }
        return linkEncryptedPairingSession.encryptProvision(str, str2, str3, str4, str5, str6, str7, bool, str8, str9, str10, linkDeviceKeyProvisionFields);
    }

    private final byte[] recordAad(String str, long j) {
        StringBuilder sbA0x = C3cI.A0x("hatch-link ble setup v1|", this.sessionIdB64);
        C60O.A1R("|", str, sbA0x);
        sbA0x.append(j);
        String string = sbA0x.toString();
        Charset charset = StandardCharsets.UTF_8;
        C7384Etj.A0V(charset);
        return string.getBytes(charset);
    }

    public final LinkEncryptedRecordJson encryptPairingClientFinished() {
        return encryptPayload(HatchJsonKt.HatchJson.A02(new LinkPairingClientFinishedJson(LinkPairingProtocolStrings.ACTION_CLIENT_FINISHED), LinkPairingClientFinishedJson$$serializer.INSTANCE));
    }

    public final LinkEncryptedRecordJson encryptProvision(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, LinkDeviceKeyProvisionFields linkDeviceKeyProvisionFields) {
        String strA0l;
        String strA0l2;
        String str11;
        String str12;
        String str13;
        String str14 = str7;
        Boolean bool2 = bool;
        AnonymousClass002.A1B(str3, 2, str4);
        if (str7 != null && linkDeviceKeyProvisionFields != null) {
            throw C60O.A0i("An OTA round never carries a device key");
        }
        C9sU c9sU = HatchJsonKt.HatchJson;
        LinkProvisionV2Json$$serializer linkProvisionV2Json$$serializer = LinkProvisionV2Json$$serializer.INSTANCE;
        String str15 = null;
        if (str5 == null || (strA0l = AnonymousClass002.A0l(str5)) == null || strA0l.length() <= 0) {
            strA0l = null;
        }
        if (str6 == null || (strA0l2 = AnonymousClass002.A0l(str6)) == null || strA0l2.length() <= 0) {
            strA0l2 = null;
        }
        if (this.isCommunity) {
            str14 = null;
            bool2 = null;
        }
        if (linkDeviceKeyProvisionFields != null) {
            str11 = linkDeviceKeyProvisionFields.deviceKey;
            str12 = linkDeviceKeyProvisionFields.deviceKeyId;
            str13 = linkDeviceKeyProvisionFields.vmId;
            str15 = linkDeviceKeyProvisionFields.vmKind;
        } else {
            str11 = null;
            str12 = null;
            str13 = null;
        }
        return encryptPayload(c9sU.A02(new LinkProvisionV2Json(LinkPairingProtocolStrings.ACTION_PROVISION_V2, str, str2, str3, str4, "device", strA0l, strA0l2, str14, bool2, str8, str9, str10, str11, str12, str13, str15), linkProvisionV2Json$$serializer));
    }

    public final LinkEncryptedRecordJson encryptUnpair() {
        return encryptAuthenticatedAction(LinkPairingProtocolStrings.ACTION_UNPAIR);
    }

    public final LinkEncryptedRecordJson encryptWiFiScan() {
        return encryptAuthenticatedAction(LinkPairingProtocolStrings.ACTION_WIFI_SCAN);
    }

    public final Integer getConfirmTimeoutSeconds() {
        return this.confirmTimeoutSeconds;
    }

    public final LinkPairingMode getPairingMode() {
        return this.pairingMode;
    }

    public final String getPairingPolicy() {
        return this.pairingPolicy;
    }

    public final boolean getRequiresAppConfirmation() {
        return this.isCommunity && LinkEncryptedPairingKt.LINK_PAIRING_POLICY_CONFIRM_APP.equals(this.pairingPolicy);
    }

    public final String getSessionIdB64() {
        return this.sessionIdB64;
    }

    public final boolean isCommunity() {
        return this.isCommunity;
    }

    public LinkEncryptedPairingSession(byte[] bArr, byte[] bArr2, byte[] bArr3, LinkPairingMode linkPairingMode, Integer num, String str, boolean z) {
        AnonymousClass005.A14(bArr, bArr2, bArr3, linkPairingMode);
        this.sessionId = bArr;
        this.mobileTxKey = bArr2;
        this.mobileRxKey = bArr3;
        this.pairingMode = linkPairingMode;
        this.confirmTimeoutSeconds = num;
        this.pairingPolicy = str;
        this.isCommunity = z;
        this.sessionIdB64 = LinkSetupCrypto.INSTANCE.base64UrlEncode(bArr);
    }

    private final long checkedIncrement(long j) {
        if (j < LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            return j + 1;
        }
        throw C60O.A0i("Link encrypted counter overflow");
    }

    public /* synthetic */ LinkEncryptedPairingSession(byte[] bArr, byte[] bArr2, byte[] bArr3, LinkPairingMode linkPairingMode, Integer num, String str, boolean z, int i, C06H c06h) {
        this(bArr, bArr2, bArr3, (i & 8) != 0 ? LinkPairingMode.V5 : linkPairingMode, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str, C3cG.A1K(i & 64, z));
    }
}
