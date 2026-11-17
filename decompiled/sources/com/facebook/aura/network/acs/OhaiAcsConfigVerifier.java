package com.facebook.aura.network.acs;

import X.C7384Etj;
import X.C9hr;
import X.C9sU;
import X.CFK;
import X.DCl;
import X.F0C;
import android.util.Base64;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.privacy.acs.VoprfEd25519;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public final class OhaiAcsConfigVerifier {
    public static final byte[] CONFIG_PUBLIC_KEY;
    public static final String CONFIG_PUBLIC_KEY_HEX = "1011c96ba44db78eb91387eda6c3548a9d651e7b226f8aff34298dc7f7c0c200";
    public static final OhaiAcsConfigVerifier INSTANCE;
    public static final String TAG = "OhaiAcsConfigVerifier";

    static {
        OhaiAcsConfigVerifier ohaiAcsConfigVerifier = new OhaiAcsConfigVerifier();
        INSTANCE = ohaiAcsConfigVerifier;
        CONFIG_PUBLIC_KEY = ohaiAcsConfigVerifier.hexStringToByteArray(CONFIG_PUBLIC_KEY_HEX);
    }

    public final OhaiAcsConfig verifyAndParse(String str) {
        C7384Etj.A0Y(str, 0);
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            FastlyOhaiAcsConfigEnvelopeJson fastlyOhaiAcsConfigEnvelopeJson = (FastlyOhaiAcsConfigEnvelopeJson) c9sU.A00(str, FastlyOhaiAcsConfigEnvelopeJson$$serializer.INSTANCE);
            if (fastlyOhaiAcsConfigEnvelopeJson.config_json_ser_b64url.length() == 0) {
                return null;
            }
            String str2 = fastlyOhaiAcsConfigEnvelopeJson.signature_b64url;
            if (str2.length() == 0) {
                return null;
            }
            Charset charset = DCl.A05;
            byte[] bArrDecode = Base64.decode(str2.getBytes(charset), 8);
            byte[] bytes = fastlyOhaiAcsConfigEnvelopeJson.config_json_ser_b64url.getBytes(charset);
            int iVerify = new VoprfEd25519().verify(bArrDecode, bytes, CONFIG_PUBLIC_KEY);
            if (iVerify != 0) {
                CFK.A0H(TAG, "ACS/OHAI config signature verification failed: %d", Integer.valueOf(iVerify));
                return null;
            }
            byte[] bArrDecode2 = Base64.decode(bytes, 8);
            C7384Etj.A0U(bArrDecode2);
            String str3 = new String(bArrDecode2, charset);
            F0C<C9hr<Object>>[] f0cArr = OhaiAcsConfigJson.$childSerializers;
            return ((OhaiAcsConfigJson) c9sU.A00(str3, OhaiAcsConfigJson$$serializer.INSTANCE)).toDomain();
        } catch (Exception e) {
            CFK.A08(TAG, "Failed to verify/parse ACS/OHAI config", e);
            return null;
        }
    }

    private final byte[] hexStringToByteArray(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }
}
