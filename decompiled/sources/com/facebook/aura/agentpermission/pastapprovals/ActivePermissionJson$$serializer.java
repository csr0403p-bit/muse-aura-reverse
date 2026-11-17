package com.facebook.aura.agentpermission.pastapprovals;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C60O;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.vmbrowser.runtime.BrowserSessionControllerKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class ActivePermissionJson$$serializer implements C9cd<ActivePermissionJson> {
    public static final int $stable = 0;
    public static final ActivePermissionJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ActivePermissionJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ActivePermissionJson.$childSerializers;
        ActivePermissionDisplayJson activePermissionDisplayJson = null;
        ActivePermissionTargetJson activePermissionTargetJson = null;
        List list = null;
        ActivePermissionScopeJson activePermissionScopeJson = null;
        String strA0l = null;
        String strA0j = null;
        String strA8f = null;
        String strA0i = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ActivePermissionJson(i, strA8f, strA0i, strA0j, zA8G, strA0l, list, activePermissionDisplayJson, activePermissionTargetJson, activePermissionScopeJson, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    zA8G = c9j4A55.A8G(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i |= 16;
                    break;
                case 5:
                    list = (List) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 5);
                    i |= 32;
                    break;
                case 6:
                    activePermissionDisplayJson = (ActivePermissionDisplayJson) c9j4A55.A8Z(ActivePermissionDisplayJson$$serializer.INSTANCE, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    activePermissionTargetJson = (ActivePermissionTargetJson) c9j4A55.A8Z(ActivePermissionTargetJson$$serializer.INSTANCE, c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    activePermissionScopeJson = (ActivePermissionScopeJson) c9j4A55.A8Z(ActivePermissionScopeJson$$serializer.INSTANCE, c9iZ, 8);
                    i |= 256;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ActivePermissionJson$$serializer activePermissionJson$$serializer = new ActivePermissionJson$$serializer();
        INSTANCE = activePermissionJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.agentpermission.pastapprovals.ActivePermissionJson", activePermissionJson$$serializer, 9);
        C60O.A1S("permission_id", c9iKA1C, true);
        c9iKA1C.A08("lifetime", true);
        c9iKA1C.A08("revocable", true);
        c9iKA1C.A08(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM, true);
        c9iKA1C.A08("mode_options", true);
        c9iKA1C.A08("display", true);
        c9iKA1C.A08("target", true);
        c9iKA1C.A08("scope", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = ActivePermissionJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C07839ix.A00, AbstractC07749im.A00(c07779iq), C3cH.A14(f0cArr, 5), AbstractC07749im.A00(ActivePermissionDisplayJson$$serializer.INSTANCE), AbstractC07749im.A00(ActivePermissionTargetJson$$serializer.INSTANCE), AbstractC07749im.A00(ActivePermissionScopeJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ActivePermissionJson activePermissionJson) {
        AnonymousClass003.A0u(interfaceC07789is, activePermissionJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ActivePermissionJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_agentpermission_pastapprovals_pastapprovals(activePermissionJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
