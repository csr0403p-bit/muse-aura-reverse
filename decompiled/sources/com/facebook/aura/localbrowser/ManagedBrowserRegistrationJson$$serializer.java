package com.facebook.aura.localbrowser;

import X.AnonymousClass003;
import X.C07779iq;
import X.C3cG;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class ManagedBrowserRegistrationJson$$serializer implements C9cd<ManagedBrowserRegistrationJson> {
    public static final int $stable = 0;
    public static final ManagedBrowserRegistrationJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ManagedBrowserRegistrationJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA8f2 = null;
        JsonElement jsonElement = null;
        long jA8X = 0;
        int i = 0;
        String strA8f3 = null;
        ManagedBrowserCapabilitiesJson managedBrowserCapabilitiesJson = null;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ManagedBrowserRegistrationJson(i, strA8f, strA8f3, jA8X, managedBrowserCapabilitiesJson, strA8f2, jsonElement, null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA8f3 = c9j4A55.A8f(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    jA8X = c9j4A55.A8X(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    managedBrowserCapabilitiesJson = (ManagedBrowserCapabilitiesJson) c9j4A55.A8a(ManagedBrowserCapabilitiesJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    strA8f2 = c9j4A55.A8f(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    jsonElement = (JsonElement) c9j4A55.A8a(JsonElementSerializer.A00, c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ManagedBrowserRegistrationJson$$serializer managedBrowserRegistrationJson$$serializer = new ManagedBrowserRegistrationJson$$serializer();
        INSTANCE = managedBrowserRegistrationJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.localbrowser.ManagedBrowserRegistrationJson", managedBrowserRegistrationJson$$serializer, 6);
        c9iKA1C.A08("implementation_id", false);
        c9iKA1C.A08("executor_instance_id", false);
        c9iKA1C.A08("sequence", false);
        c9iKA1C.A08("capabilities", false);
        c9iKA1C.A08("lifecycle", false);
        c9iKA1C.A08("active_task", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, C9j1.A00, ManagedBrowserCapabilitiesJson$$serializer.INSTANCE, c07779iq, JsonElementSerializer.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ManagedBrowserRegistrationJson managedBrowserRegistrationJson) {
        AnonymousClass003.A0u(interfaceC07789is, managedBrowserRegistrationJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ManagedBrowserRegistrationJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(managedBrowserRegistrationJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
