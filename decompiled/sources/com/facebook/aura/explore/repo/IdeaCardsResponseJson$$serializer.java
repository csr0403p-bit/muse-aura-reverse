package com.facebook.aura.explore.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class IdeaCardsResponseJson$$serializer implements C9cd<IdeaCardsResponseJson> {
    public static final IdeaCardsResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final IdeaCardsResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = IdeaCardsResponseJson.$childSerializers;
        List listA0Q = null;
        IdeaCardsViewerStateJson ideaCardsViewerStateJson = null;
        IdeaCardsPaginationJson ideaCardsPaginationJson = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new IdeaCardsResponseJson(i, listA0Q, ideaCardsViewerStateJson, ideaCardsPaginationJson, (C2hx) null);
            }
            if (iA8N == 0) {
                listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 0);
                i |= 1;
            } else if (iA8N == 1) {
                ideaCardsViewerStateJson = (IdeaCardsViewerStateJson) c9j4A55.A8Z(IdeaCardsViewerStateJson$$serializer.INSTANCE, c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                ideaCardsPaginationJson = (IdeaCardsPaginationJson) c9j4A55.A8Z(IdeaCardsPaginationJson$$serializer.INSTANCE, c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        IdeaCardsResponseJson$$serializer ideaCardsResponseJson$$serializer = new IdeaCardsResponseJson$$serializer();
        INSTANCE = ideaCardsResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.explore.repo.IdeaCardsResponseJson", ideaCardsResponseJson$$serializer, 3);
        c9iKA1C.A08("sections", true);
        c9iKA1C.A08("viewerState", true);
        c9iKA1C.A08("pagination", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cG.A1b(IdeaCardsPaginationJson$$serializer.INSTANCE, C3cH.A0z(IdeaCardsResponseJson.$childSerializers), AbstractC07749im.A00(IdeaCardsViewerStateJson$$serializer.INSTANCE));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, IdeaCardsResponseJson ideaCardsResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, ideaCardsResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        IdeaCardsResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(ideaCardsResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
