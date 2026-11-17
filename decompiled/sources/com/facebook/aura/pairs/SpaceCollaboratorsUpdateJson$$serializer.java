package com.facebook.aura.pairs;

import X.AnonymousClass003;
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
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class SpaceCollaboratorsUpdateJson$$serializer implements C9cd<SpaceCollaboratorsUpdateJson> {
    public static final int $stable = 0;
    public static final SpaceCollaboratorsUpdateJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final SpaceCollaboratorsUpdateJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = SpaceCollaboratorsUpdateJson.$childSerializers;
        List listA0Q = null;
        JsonElement jsonElementA16 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new SpaceCollaboratorsUpdateJson(i, listA0Q, jsonElementA16, null);
            }
            if (iA8N == 0) {
                listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 0);
                i |= 1;
            } else {
                if (iA8N != 1) {
                    throw C3cG.A17(iA8N);
                }
                jsonElementA16 = C3cI.A16(c9iZ, c9j4A55, 1);
                i |= 2;
            }
        }
    }

    static {
        SpaceCollaboratorsUpdateJson$$serializer spaceCollaboratorsUpdateJson$$serializer = new SpaceCollaboratorsUpdateJson$$serializer();
        INSTANCE = spaceCollaboratorsUpdateJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.pairs.SpaceCollaboratorsUpdateJson", spaceCollaboratorsUpdateJson$$serializer, 2);
        c9iKA1C.A08("collaborators", false);
        c9iKA1C.A08("expected_connection_revision", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cH.A1Z(JsonElementSerializer.A00, C3cH.A0z(SpaceCollaboratorsUpdateJson.$childSerializers));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, SpaceCollaboratorsUpdateJson spaceCollaboratorsUpdateJson) {
        AnonymousClass003.A0u(interfaceC07789is, spaceCollaboratorsUpdateJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SpaceCollaboratorsUpdateJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(spaceCollaboratorsUpdateJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
