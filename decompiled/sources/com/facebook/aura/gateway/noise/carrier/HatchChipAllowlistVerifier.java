package com.facebook.aura.gateway.noise.carrier;

import X.AnonymousClass004;
import X.AnonymousClass005;
import X.C9zh;
import X.C9zi;

/* loaded from: classes4.dex */
public final class HatchChipAllowlistVerifier {
    public static final HatchChipAllowlistVerifier INSTANCE = new HatchChipAllowlistVerifier();

    public static final native HatchChipAllowlistVerdict verifyNative(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, long j, long j2);

    public final HatchChipAllowlistVerdict verify(String str, String str2, String str3, String str4, String str5, HatchChipAllowlistTransparencyPolicy hatchChipAllowlistTransparencyPolicy, long j) {
        int iA1b = AnonymousClass004.A1b(str, str2);
        AnonymousClass005.A16(str3, str4, str5, hatchChipAllowlistTransparencyPolicy, 2);
        try {
            C9zi c9zi = C9zi.A03;
            HatchChipAllowlistVerdict hatchChipAllowlistVerdictVerifyNative = verifyNative(str, C9zh.A03(str2, c9zi), C9zh.A03(str3, c9zi), C9zh.A03(str4, c9zi), C9zh.A03(str5, c9zi), hatchChipAllowlistTransparencyPolicy.getNativeValue$fbandroid_express_aura_java_com_facebook_aura_gateway_noise_carrier_carrier(), j, System.currentTimeMillis());
            return (hatchChipAllowlistVerdictVerifyNative.rejection.length() != 0 || hatchChipAllowlistVerdictVerifyNative.chipIds.length >= hatchChipAllowlistTransparencyPolicy.getMinChipCount$fbandroid_express_aura_java_com_facebook_aura_gateway_noise_carrier_carrier()) ? hatchChipAllowlistVerdictVerifyNative : new HatchChipAllowlistVerdict(new String[iA1b], "chip_allowlist_too_small");
        } catch (IllegalArgumentException unused) {
            return new HatchChipAllowlistVerdict(new String[iA1b], "transparency_bundle_malformed");
        }
    }

    static {
        NoiseGatewayCarrierSoLoader.ensureLoaded();
    }
}
