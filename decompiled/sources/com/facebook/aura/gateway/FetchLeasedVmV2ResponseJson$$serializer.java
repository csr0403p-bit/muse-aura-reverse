package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class FetchLeasedVmV2ResponseJson$$serializer implements C9cd<FetchLeasedVmV2ResponseJson> {
    public static final int $stable = 0;
    public static final FetchLeasedVmV2ResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final FetchLeasedVmV2ResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = FetchLeasedVmV2ResponseJson.$childSerializers;
        List list = null;
        CvmEligibilityJson cvmEligibilityJson = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Long l = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new FetchLeasedVmV2ResponseJson(i, list, str, str2, str3, l, num, cvmEligibilityJson, (C2hx) null);
                case 0:
                    list = (List) c9j4A55.A8Z(f0cArr[0].getValue(), c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    cvmEligibilityJson = (CvmEligibilityJson) c9j4A55.A8Z(CvmEligibilityJson$$serializer.INSTANCE, c9iZ, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        FetchLeasedVmV2ResponseJson$$serializer fetchLeasedVmV2ResponseJson$$serializer = new FetchLeasedVmV2ResponseJson$$serializer();
        INSTANCE = fetchLeasedVmV2ResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.FetchLeasedVmV2ResponseJson", fetchLeasedVmV2ResponseJson$$serializer, 7);
        c9iKA1C.A08("vm_list", true);
        c9iKA1C.A08("error_title", true);
        c9iKA1C.A08("error_summary", true);
        c9iKA1C.A08("backend_error_code", true);
        c9iKA1C.A08(HatchGatewayPrefsStore.KEY_RETRY_AFTER_MS, true);
        c9iKA1C.A08(HatchGatewayPrefsStore.KEY_MAX_RETRY_COUNT, true);
        c9iKA1C.A08("cvm_eligibility", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9hr c9hrA14 = C3cH.A14(FetchLeasedVmV2ResponseJson.$childSerializers, 0);
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c9hrA14, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C9j1.A00), AbstractC07749im.A00(C07729ii.A00), AbstractC07749im.A00(CvmEligibilityJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, FetchLeasedVmV2ResponseJson fetchLeasedVmV2ResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, fetchLeasedVmV2ResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        FetchLeasedVmV2ResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(fetchLeasedVmV2ResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
