package com.facebook.aura.gateway.store;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
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
import com.facebook.aura.gateway.HatchGatewayConnectionKt;
import com.facebook.aura.gateway.VmNotaryTokenKt;
import java.util.Map;
import kotlin.Deprecated;
import kotlinx.serialization.UnknownFieldException;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class VmEntryV2Json$$serializer implements C9cd<VmEntryV2Json> {
    public static final VmEntryV2Json$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final VmEntryV2Json deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = VmEntryV2Json.$childSerializers;
        C2hx c2hx = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Long l = null;
        String str4 = null;
        Map map = null;
        String str5 = null;
        Long l2 = null;
        String str6 = null;
        String strA8f = null;
        String strA8f2 = null;
        String strA8f3 = null;
        int i = 0;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new VmEntryV2Json(i, strA8f, strA8f2, strA8f3, str, zA8G, str6, str5, str4, map, l, str3, str2, l2, c2hx);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA8f2 = c9j4A55.A8f(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    strA8f3 = c9j4A55.A8f(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    zA8G = c9j4A55.A8G(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    map = (Map) c9j4A55.A8Z(f0cArr[8].getValue(), c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 9);
                    i |= 512;
                    break;
                case 10:
                    str3 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 10);
                    i |= 1024;
                    break;
                case 11:
                    str2 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 11);
                    i |= 2048;
                    break;
                case 12:
                    l2 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 12);
                    i |= 4096;
                    break;
                default:
                    throw new UnknownFieldException(iA8N);
            }
        }
    }

    static {
        VmEntryV2Json$$serializer vmEntryV2Json$$serializer = new VmEntryV2Json$$serializer();
        INSTANCE = vmEntryV2Json$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.store.VmEntryV2Json", vmEntryV2Json$$serializer, 13);
        c9iKA1C.A08("vm_id", true);
        c9iKA1C.A08("vm_ws_url", true);
        c9iKA1C.A08("vm_name", true);
        c9iKA1C.A08(HatchGatewayConnectionKt.TOKEN_SOURCE_VM_AUTH_TOKEN, true);
        c9iKA1C.A08("default", true);
        c9iKA1C.A08("vm_type", true);
        c9iKA1C.A08("vm_state", true);
        c9iKA1C.A08("replace_attempt_id", true);
        c9iKA1C.A08("vm_notary_tokens", true);
        c9iKA1C.A08(VmNotaryTokenKt.KEY_NOTARY_TOKEN_EXPIRATION_TS, true);
        c9iKA1C.A08("replaced_vm_id", true);
        c9iKA1C.A08("migration_state", true);
        c9iKA1C.A08("migration_completed_at_ms", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = VmEntryV2Json.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA004 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA14 = C3cH.A14(f0cArr, 8);
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c9hrA00, c07839ix, c9hrA002, c9hrA003, c9hrA004, c9hrA14, AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c9j1)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, VmEntryV2Json vmEntryV2Json) {
        AnonymousClass003.A0u(interfaceC07789is, vmEntryV2Json);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        VmEntryV2Json.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_store_store(vmEntryV2Json, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
