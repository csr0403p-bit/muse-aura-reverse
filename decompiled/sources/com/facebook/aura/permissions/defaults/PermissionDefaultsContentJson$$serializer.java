package com.facebook.aura.permissions.defaults;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
import com.facebook.aura.model.InternalLinkActionCardPresentationKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class PermissionDefaultsContentJson$$serializer implements C9cd<PermissionDefaultsContentJson> {
    public static final PermissionDefaultsContentJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PermissionDefaultsContentJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        C2hx c2hx = null;
        PermissionDefaultSurfaceContentJson permissionDefaultSurfaceContentJson = null;
        PermissionDefaultSurfaceContentJson permissionDefaultSurfaceContentJson2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new PermissionDefaultsContentJson(i, permissionDefaultSurfaceContentJson, permissionDefaultSurfaceContentJson2, c2hx);
            }
            if (iA8N == 0) {
                permissionDefaultSurfaceContentJson = (PermissionDefaultSurfaceContentJson) c9j4A55.A8Z(PermissionDefaultSurfaceContentJson$$serializer.INSTANCE, c9iZ, 0);
                i |= 1;
            } else {
                if (iA8N != 1) {
                    throw C3cG.A17(iA8N);
                }
                permissionDefaultSurfaceContentJson2 = (PermissionDefaultSurfaceContentJson) c9j4A55.A8Z(PermissionDefaultSurfaceContentJson$$serializer.INSTANCE, c9iZ, 1);
                i |= 2;
            }
        }
    }

    static {
        PermissionDefaultsContentJson$$serializer permissionDefaultsContentJson$$serializer = new PermissionDefaultsContentJson$$serializer();
        INSTANCE = permissionDefaultsContentJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.permissions.defaults.PermissionDefaultsContentJson", permissionDefaultsContentJson$$serializer, 2);
        c9iKA1C.A08(InternalLinkActionCardPresentationKt.INTERNAL_LINK_TYPE_CONNECTOR, true);
        c9iKA1C.A08("network", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        PermissionDefaultSurfaceContentJson$$serializer permissionDefaultSurfaceContentJson$$serializer = PermissionDefaultSurfaceContentJson$$serializer.INSTANCE;
        return C3cH.A1Z(permissionDefaultSurfaceContentJson$$serializer, AbstractC07749im.A00(permissionDefaultSurfaceContentJson$$serializer));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PermissionDefaultsContentJson permissionDefaultsContentJson) {
        AnonymousClass003.A0u(interfaceC07789is, permissionDefaultsContentJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PermissionDefaultsContentJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_permissions_defaults_defaults(permissionDefaultsContentJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
