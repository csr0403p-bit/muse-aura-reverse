package com.facebook.aura.spaces.repo;

import X.AnonymousClass003;
import X.C07779iq;
import X.C07799it;
import X.C3cG;
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
import com.facebook.aura.widgets.SpaceWidgetRefreshWorkerKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class SpacesFavoritesRequestJson$$serializer implements C9cd<SpacesFavoritesRequestJson> {
    public static final SpacesFavoritesRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final SpacesFavoritesRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        double dA8M = 0.0d;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new SpacesFavoritesRequestJson(i, strA8f, dA8M, null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else {
                if (iA8N != 1) {
                    throw C3cG.A17(iA8N);
                }
                dA8M = c9j4A55.A8M(c9iZ, 1);
                i |= 2;
            }
        }
    }

    static {
        SpacesFavoritesRequestJson$$serializer spacesFavoritesRequestJson$$serializer = new SpacesFavoritesRequestJson$$serializer();
        INSTANCE = spacesFavoritesRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.spaces.repo.SpacesFavoritesRequestJson", spacesFavoritesRequestJson$$serializer, 2);
        c9iKA1C.A08(SpaceWidgetRefreshWorkerKt.KEY_SLUG, false);
        c9iKA1C.A08("favorite_order", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C07779iq.A01, C07799it.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, SpacesFavoritesRequestJson spacesFavoritesRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, spacesFavoritesRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SpacesFavoritesRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_repo_repo(spacesFavoritesRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
