package com.facebook.aura.spaces.repo;

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
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class NavigationTabOrderResponseJson$$serializer implements C9cd<NavigationTabOrderResponseJson> {
    public static final NavigationTabOrderResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final NavigationTabOrderResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = NavigationTabOrderResponseJson.$childSerializers;
        List list = null;
        List list2 = null;
        List list3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new NavigationTabOrderResponseJson(i, list, list2, list3, (C2hx) null);
            }
            if (iA8N == 0) {
                list = (List) c9j4A55.A8a(f0cArr[0].getValue(), c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                list2 = (List) c9j4A55.A8Z(f0cArr[1].getValue(), c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                list3 = (List) c9j4A55.A8Z(f0cArr[2].getValue(), c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        NavigationTabOrderResponseJson$$serializer navigationTabOrderResponseJson$$serializer = new NavigationTabOrderResponseJson$$serializer();
        INSTANCE = navigationTabOrderResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.spaces.repo.NavigationTabOrderResponseJson", navigationTabOrderResponseJson$$serializer, 3);
        c9iKA1C.A08("tabs", true);
        c9iKA1C.A08("navbar", true);
        c9iKA1C.A08("spaces", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = NavigationTabOrderResponseJson.$childSerializers;
        return new C9hr[]{C3cH.A0z(f0cArr), C3cH.A14(f0cArr, 1), C3cH.A14(f0cArr, 2)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, NavigationTabOrderResponseJson navigationTabOrderResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, navigationTabOrderResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        NavigationTabOrderResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_repo_repo(navigationTabOrderResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
