package com.facebook.aura.model;

import X.AnonymousClass003;
import X.C2hx;
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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class InternalLinkActionCardPresentationData$$serializer implements C9cd<InternalLinkActionCardPresentationData> {
    public static final int $stable = 0;
    public static final InternalLinkActionCardPresentationData$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final InternalLinkActionCardPresentationData deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        C2hx c2hx = null;
        InternalLinkActionCardPresentation internalLinkActionCardPresentation = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new InternalLinkActionCardPresentationData(i, internalLinkActionCardPresentation, c2hx);
            }
            if (iA8N != 0) {
                throw C3cG.A17(iA8N);
            }
            internalLinkActionCardPresentation = (InternalLinkActionCardPresentation) c9j4A55.A8a(InternalLinkActionCardPresentation$$serializer.INSTANCE, c9iZ, 0);
            i = 1;
        }
    }

    static {
        InternalLinkActionCardPresentationData$$serializer internalLinkActionCardPresentationData$$serializer = new InternalLinkActionCardPresentationData$$serializer();
        INSTANCE = internalLinkActionCardPresentationData$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.InternalLinkActionCardPresentationData", internalLinkActionCardPresentationData$$serializer, 1);
        c9iKA1C.A08("card", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{InternalLinkActionCardPresentation$$serializer.INSTANCE};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, InternalLinkActionCardPresentationData internalLinkActionCardPresentationData) {
        AnonymousClass003.A0u(interfaceC07789is, internalLinkActionCardPresentationData);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        c9j5A56.AAQ(internalLinkActionCardPresentationData.card, InternalLinkActionCardPresentation$$serializer.INSTANCE, c9iZ, 0);
        c9j5A56.AAd(c9iZ);
    }
}
