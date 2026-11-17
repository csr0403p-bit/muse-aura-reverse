package com.facebook.aura.explore.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
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
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.model.ReplyAttributionSerializer;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class IdeaSectionJson$$serializer implements C9cd<IdeaSectionJson> {
    public static final IdeaSectionJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final IdeaSectionJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = IdeaSectionJson.$childSerializers;
        String strA8f = null;
        String strA8f2 = null;
        String strA0w = null;
        IdeaSectionPresentationJson ideaSectionPresentationJson = null;
        List listA0P = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new IdeaSectionJson(i, strA8f, strA8f2, strA0w, ideaSectionPresentationJson, listA0P, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f2 = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                strA0w = C3cI.A0w(c9iZ, c9j4A55, 2);
                i |= 4;
            } else if (iA8N == 3) {
                ideaSectionPresentationJson = (IdeaSectionPresentationJson) c9j4A55.A8a(IdeaSectionPresentationJson$$serializer.INSTANCE, c9iZ, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 4);
                i |= 16;
            }
        }
    }

    static {
        IdeaSectionJson$$serializer ideaSectionJson$$serializer = new IdeaSectionJson$$serializer();
        INSTANCE = ideaSectionJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.explore.repo.IdeaSectionJson", ideaSectionJson$$serializer, 5);
        C3cH.A1G("id", c9iKA1C, true);
        c9iKA1C.A08("subtitle", true);
        c9iKA1C.A08(ReplyAttributionSerializer.TYPE_PRESENTATION, true);
        c9iKA1C.A08("cards", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = IdeaSectionJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, AbstractC07749im.A00(c07779iq), IdeaSectionPresentationJson$$serializer.INSTANCE, C3cH.A13(f0cArr)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, IdeaSectionJson ideaSectionJson) {
        AnonymousClass003.A0u(interfaceC07789is, ideaSectionJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        IdeaSectionJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(ideaSectionJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
