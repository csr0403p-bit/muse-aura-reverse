package com.facebook.aura.explore.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
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
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class IdeaCardPresentationJson$$serializer implements C9cd<IdeaCardPresentationJson> {
    public static final IdeaCardPresentationJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final IdeaCardPresentationJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = IdeaCardPresentationJson.$childSerializers;
        MediaRefJson mediaRefJson = null;
        MediaRefJson mediaRefJson2 = null;
        List listA0P = null;
        List listA0P2 = null;
        IdeaDisplayBadgeJson ideaDisplayBadgeJson = null;
        String strA8f = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new IdeaCardPresentationJson(i, mediaRefJson, mediaRefJson2, listA0P, listA0P2, ideaDisplayBadgeJson, strA8f, (C2hx) null);
                case 0:
                    mediaRefJson = (MediaRefJson) c9j4A55.A8Z(MediaRefJson$$serializer.INSTANCE, c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    mediaRefJson2 = (MediaRefJson) c9j4A55.A8Z(MediaRefJson$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 2);
                    i |= 4;
                    break;
                case 3:
                    listA0P2 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 3);
                    i |= 8;
                    break;
                case 4:
                    ideaDisplayBadgeJson = (IdeaDisplayBadgeJson) c9j4A55.A8Z(IdeaDisplayBadgeJson$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA8f = c9j4A55.A8f(c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        IdeaCardPresentationJson$$serializer ideaCardPresentationJson$$serializer = new IdeaCardPresentationJson$$serializer();
        INSTANCE = ideaCardPresentationJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.explore.repo.IdeaCardPresentationJson", ideaCardPresentationJson$$serializer, 6);
        c9iKA1C.A08("previewImage", true);
        c9iKA1C.A08("icon", true);
        c9iKA1C.A08(PhotosSearchHandlerKt.PARAM_LABELS, true);
        c9iKA1C.A08("badges", true);
        c9iKA1C.A08("display_badge", true);
        c9iKA1C.A08("actionLabel", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = IdeaCardPresentationJson.$childSerializers;
        MediaRefJson$$serializer mediaRefJson$$serializer = MediaRefJson$$serializer.INSTANCE;
        return new C9hr[]{AbstractC07749im.A00(mediaRefJson$$serializer), AbstractC07749im.A00(mediaRefJson$$serializer), C3cH.A11(f0cArr), C3cH.A12(f0cArr), AbstractC07749im.A00(IdeaDisplayBadgeJson$$serializer.INSTANCE), C07779iq.A01};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, IdeaCardPresentationJson ideaCardPresentationJson) {
        AnonymousClass003.A0u(interfaceC07789is, ideaCardPresentationJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        IdeaCardPresentationJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(ideaCardPresentationJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
