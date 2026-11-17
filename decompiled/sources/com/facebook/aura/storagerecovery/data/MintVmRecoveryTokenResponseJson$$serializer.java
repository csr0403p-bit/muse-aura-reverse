package com.facebook.aura.storagerecovery.data;

import X.AnonymousClass003;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.gateway.VmNotaryTokenKt;
import java.util.Map;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class MintVmRecoveryTokenResponseJson$$serializer implements C9cd<MintVmRecoveryTokenResponseJson> {
    public static final MintVmRecoveryTokenResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final MintVmRecoveryTokenResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = MintVmRecoveryTokenResponseJson.$childSerializers;
        Map map = null;
        Long lA0P = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new MintVmRecoveryTokenResponseJson(i, map, lA0P, (C2hx) null);
            }
            if (iA8N == 0) {
                map = (Map) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 0);
                i |= 1;
            } else {
                if (iA8N != 1) {
                    throw C3cG.A17(iA8N);
                }
                lA0P = C3cI.A0P(c9iZ, c9j4A55, 1);
                i |= 2;
            }
        }
    }

    static {
        MintVmRecoveryTokenResponseJson$$serializer mintVmRecoveryTokenResponseJson$$serializer = new MintVmRecoveryTokenResponseJson$$serializer();
        INSTANCE = mintVmRecoveryTokenResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.storagerecovery.data.MintVmRecoveryTokenResponseJson", mintVmRecoveryTokenResponseJson$$serializer, 2);
        c9iKA1C.A08("tokens", true);
        c9iKA1C.A08(VmNotaryTokenKt.KEY_NOTARY_TOKEN_EXPIRATION_TS, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cH.A1Z(C9j1.A00, C3cH.A0z(MintVmRecoveryTokenResponseJson.$childSerializers));
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, MintVmRecoveryTokenResponseJson mintVmRecoveryTokenResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, mintVmRecoveryTokenResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        MintVmRecoveryTokenResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_storagerecovery_data_data(mintVmRecoveryTokenResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
