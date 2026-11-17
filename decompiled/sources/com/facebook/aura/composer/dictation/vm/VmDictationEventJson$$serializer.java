package com.facebook.aura.composer.dictation.vm;

import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.model.ReplyAttributionSerializer;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class VmDictationEventJson$$serializer implements C9cd<VmDictationEventJson> {
    public static final VmDictationEventJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final VmDictationEventJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA8f2 = null;
        String strA8f3 = null;
        String strA8f4 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new VmDictationEventJson(i, strA8f, strA8f4, strA8f3, strA8f2, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f4 = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                strA8f3 = c9j4A55.A8f(c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                strA8f2 = c9j4A55.A8f(c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        VmDictationEventJson$$serializer vmDictationEventJson$$serializer = new VmDictationEventJson$$serializer();
        INSTANCE = vmDictationEventJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.composer.dictation.vm.VmDictationEventJson", vmDictationEventJson$$serializer, 4);
        C3cI.A1O("type", c9iKA1C, true);
        c9iKA1C.A08(AuraDeeplinkRouteMapper.CODE_PARAM, true);
        c9iKA1C.A08(ReplyAttributionSerializer.TYPE_MESSAGE, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c07779iq};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, VmDictationEventJson vmDictationEventJson) {
        AnonymousClass003.A0u(interfaceC07789is, vmDictationEventJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        VmDictationEventJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_vm_vm(vmDictationEventJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
