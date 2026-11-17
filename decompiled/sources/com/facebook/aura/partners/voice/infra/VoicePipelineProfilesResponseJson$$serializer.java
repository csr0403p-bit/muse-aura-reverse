package com.facebook.aura.partners.voice.infra;

import X.AnonymousClass003;
import X.C07839ix;
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
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class VoicePipelineProfilesResponseJson$$serializer implements C9cd<VoicePipelineProfilesResponseJson> {
    public static final VoicePipelineProfilesResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final VoicePipelineProfilesResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = VoicePipelineProfilesResponseJson.$childSerializers;
        List listA0Q = null;
        String strA0v = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new VoicePipelineProfilesResponseJson(i, listA0Q, strA0v, zA8G, (C2hx) null);
            }
            if (iA8N == 0) {
                listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                zA8G = c9j4A55.A8G(c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        VoicePipelineProfilesResponseJson$$serializer voicePipelineProfilesResponseJson$$serializer = new VoicePipelineProfilesResponseJson$$serializer();
        INSTANCE = voicePipelineProfilesResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.partners.voice.infra.VoicePipelineProfilesResponseJson", voicePipelineProfilesResponseJson$$serializer, 3);
        c9iKA1C.A08("profiles", true);
        c9iKA1C.A08("selected_profile_id", true);
        c9iKA1C.A08("modified", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C3cH.A0z(VoicePipelineProfilesResponseJson.$childSerializers), C3cG.A15(), C07839ix.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, VoicePipelineProfilesResponseJson voicePipelineProfilesResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, voicePipelineProfilesResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        VoicePipelineProfilesResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(voicePipelineProfilesResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
