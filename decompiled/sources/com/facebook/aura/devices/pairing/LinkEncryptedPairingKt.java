package com.facebook.aura.devices.pairing;

import X.AnonymousClass002;
import X.C06827l3;
import X.C07779iq;
import X.C31u;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C7462Ewq;
import X.C9jH;
import X.C9sU;
import X.C9tI;
import X.C9tS;
import X.InterfaceC7359EnW;
import com.facebook.aura.devices.pairing.MC;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import java.security.interfaces.ECPublicKey;
import java.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class LinkEncryptedPairingKt {
    public static final int LINK_AES_GCM_NONCE_SIZE = 12;
    public static final int LINK_AES_GCM_TAG_SIZE = 16;
    public static final long LINK_COUNTER_MAX = Long.MAX_VALUE;
    public static final int LINK_DEBUG_PAIRING_AUTH_EPOCH = 9000;
    public static final int LINK_DEVICE_KEY_AUTH_V1 = 1;
    public static final int LINK_MGCOMMANDS_V1 = 1;
    public static final int LINK_NONCE_SIZE = 16;
    public static final String LINK_PAIRING_CIPHER_SUITE = "p256-hkdf-sha256-aes-gcm-v1";
    public static final String LINK_PAIRING_COMMUNITY_AUTH = "none";
    public static final int LINK_PAIRING_CONFIRM_TIMEOUT_SECONDS = 60;
    public static final String LINK_PAIRING_FLEET_ECDSA_P256_AUTH = "fleet_ecdsa_p256_v1";
    public static final String LINK_PAIRING_MODEL = "hatch_link";
    public static final String LINK_PAIRING_POLICY_CONFIRM_APP = "confirm_app";
    public static final String LINK_PAIRING_POLICY_CONFIRM_PRESS = "confirm_press";
    public static final int LINK_PAIRING_PROTOCOL_V4 = 4;
    public static final int LINK_PAIRING_PROTOCOL_V5 = 5;
    public static final int LINK_PAIRING_TRANSCRIPT_V2 = 2;
    public static final int LINK_PUBLIC_KEY_SIZE = 65;
    public static final int LINK_SHA256_SIZE = 32;
    public static final String LINK_WIFI_NONE = "none";
    public static final String LINK_WIFI_OPTIONAL = "optional";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(LinkEncryptedPairingKt.class, "encryptedPairingFleetPublicKeysJson", "getEncryptedPairingFleetPublicKeysJson()Ljava/lang/String;", 1), new C7462Ewq(LinkEncryptedPairingKt.class, "encryptedPairingDebugPublicKeysJson", "getEncryptedPairingDebugPublicKeysJson()Ljava/lang/String;", 1)};
    public static final C06827l3 LINK_COUNTER_REGEX = C06827l3.A02("[1-9][0-9]*");
    public static final C31u encryptedPairingFleetPublicKeysJson$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_link.encrypted_pairing_fleet_public_keys);
    public static final C31u encryptedPairingDebugPublicKeysJson$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_link.encrypted_pairing_debug_public_keys);

    public static final Map<Integer, ECPublicKey> decodeLinkFleetPublicKeys(String str) {
        int iIntValue;
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() != 0) {
            try {
                C9sU c9sU = HatchJsonKt.HatchJson;
                C07779iq c07779iq = C07779iq.A01;
                Map map = (Map) c9sU.A00(strA0l, new C9tS(c07779iq, c07779iq));
                if (!map.isEmpty()) {
                    LinkedHashMap linkedHashMapA0j = C3cG.A0j();
                    Iterator itA0n = AnonymousClass002.A0n(map);
                    while (itA0n.hasNext()) {
                        Map.Entry entryA0l = C3cH.A0l(itA0n);
                        String strA0t = C60O.A0t(entryA0l);
                        String str2 = (String) entryA0l.getValue();
                        Integer numA0r = C9tI.A0r(strA0t);
                        if (numA0r != null && (iIntValue = numA0r.intValue()) > 0 && String.valueOf(iIntValue).equals(strA0t) && !linkedHashMapA0j.containsKey(numA0r)) {
                            byte[] bArrDecode = Base64.getDecoder().decode(str2);
                            LinkSetupCrypto linkSetupCrypto = LinkSetupCrypto.INSTANCE;
                            C7384Etj.A0X(bArrDecode);
                            ECPublicKey eCPublicKeyP256PublicKeyFromSpkiDer = linkSetupCrypto.p256PublicKeyFromSpkiDer(bArrDecode);
                            if (eCPublicKeyP256PublicKeyFromSpkiDer != null) {
                                linkedHashMapA0j.put(numA0r, eCPublicKeyP256PublicKeyFromSpkiDer);
                            }
                        }
                    }
                    return linkedHashMapA0j;
                }
            } catch (IllegalArgumentException | Exception unused) {
                return C9jH.A00;
            }
        }
        return C9jH.A00;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkPairingMode.values().length];
            try {
                AnonymousClass002.A13(LinkPairingMode.V4_CONFIRM_PRESS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(LinkPairingMode.V5, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getEncryptedPairingDebugPublicKeysJson() {
        return (String) encryptedPairingDebugPublicKeysJson$delegate.getValue(null, $$delegatedProperties[1]);
    }

    public static final String getEncryptedPairingFleetPublicKeysJson() {
        return (String) C31u.A00(encryptedPairingFleetPublicKeysJson$delegate, $$delegatedProperties);
    }

    public static final boolean matchesPairingMode(LinkPairingReady linkPairingReady, LinkPairingMode linkPairingMode) {
        Integer num;
        Integer num2;
        Integer num3;
        int iOrdinal = linkPairingMode.ordinal();
        if (iOrdinal == 0) {
            Integer num4 = linkPairingReady.transcriptVersion;
            if (num4 != null && num4.intValue() == 2 && LINK_PAIRING_POLICY_CONFIRM_PRESS.equals(linkPairingReady.pairingPolicy) && (num = linkPairingReady.confirmTimeoutSeconds) != null && num.intValue() == 60) {
                return true;
            }
        } else {
            if (iOrdinal != 1) {
                throw C3cG.A0q();
            }
            String str = linkPairingReady.pairingPolicy;
            if ((LINK_PAIRING_POLICY_CONFIRM_PRESS.equals(str) && (num3 = linkPairingReady.confirmTimeoutSeconds) != null && num3.intValue() == 60) || ("none".equals(linkPairingReady.pairingAuth) && LINK_PAIRING_POLICY_CONFIRM_APP.equals(str) && (num2 = linkPairingReady.confirmTimeoutSeconds) != null && num2.intValue() == 0)) {
                return true;
            }
        }
        return false;
    }

    public static final String nonEmptyTrimmed(String str) {
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() == 0) {
            return null;
        }
        return strA0l;
    }

    public static final String sizedBase64(String str, int i) {
        String strA0l = AnonymousClass002.A0l(str);
        byte[] bArrBase64UrlDecode = LinkSetupCrypto.INSTANCE.base64UrlDecode(strA0l);
        if (bArrBase64UrlDecode == null || bArrBase64UrlDecode.length != i) {
            return null;
        }
        return strA0l;
    }

    public static final String validP256PublicKey(String str) {
        String strA0l = AnonymousClass002.A0l(str);
        LinkSetupCrypto linkSetupCrypto = LinkSetupCrypto.INSTANCE;
        byte[] bArrBase64UrlDecode = linkSetupCrypto.base64UrlDecode(strA0l);
        if (bArrBase64UrlDecode == null || linkSetupCrypto.p256PublicKeyFromUncompressed(bArrBase64UrlDecode) == null) {
            return null;
        }
        return strA0l;
    }
}
