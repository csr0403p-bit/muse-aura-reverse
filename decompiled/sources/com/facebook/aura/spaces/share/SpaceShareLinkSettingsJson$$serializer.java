package com.facebook.aura.spaces.share;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class SpaceShareLinkSettingsJson$$serializer implements C9cd<SpaceShareLinkSettingsJson> {
    public static final int $stable = 0;
    public static final SpaceShareLinkSettingsJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final SpaceShareLinkSettingsJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0w = null;
        Boolean boolA0M = null;
        Boolean boolA0M2 = null;
        Boolean boolA0M3 = null;
        String strA0w2 = null;
        SpaceShareLinkAudienceJson spaceShareLinkAudienceJson = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new SpaceShareLinkSettingsJson(i, strA0w, boolA0M, boolA0M2, boolA0M3, strA0w2, spaceShareLinkAudienceJson, (C2hx) null);
                case 0:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    boolA0M = C3cI.A0M(c9iZ, c9j4A55, 1);
                    i |= 2;
                    break;
                case 2:
                    boolA0M2 = C3cI.A0M(c9iZ, c9j4A55, 2);
                    i |= 4;
                    break;
                case 3:
                    boolA0M3 = C3cI.A0M(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    spaceShareLinkAudienceJson = (SpaceShareLinkAudienceJson) c9j4A55.A8Z(SpaceShareLinkAudienceJson$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        SpaceShareLinkSettingsJson$$serializer spaceShareLinkSettingsJson$$serializer = new SpaceShareLinkSettingsJson$$serializer();
        INSTANCE = spaceShareLinkSettingsJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.spaces.share.SpaceShareLinkSettingsJson", spaceShareLinkSettingsJson$$serializer, 6);
        c9iKA1C.A08("url", true);
        c9iKA1C.A08("can_publish", true);
        c9iKA1C.A08("publication_in_progress", true);
        c9iKA1C.A08("current_build_published", true);
        c9iKA1C.A08("last_synced_at", true);
        c9iKA1C.A08("audience", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c9hrA00, AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(SpaceShareLinkAudienceJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, SpaceShareLinkSettingsJson spaceShareLinkSettingsJson) {
        AnonymousClass003.A0u(interfaceC07789is, spaceShareLinkSettingsJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SpaceShareLinkSettingsJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_share_share(spaceShareLinkSettingsJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
