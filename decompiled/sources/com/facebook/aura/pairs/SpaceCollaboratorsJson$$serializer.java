package com.facebook.aura.pairs;

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
import com.facebook.aura.widgets.SpaceWidgetRefreshWorkerKt;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class SpaceCollaboratorsJson$$serializer implements C9cd<SpaceCollaboratorsJson> {
    public static final int $stable = 0;
    public static final SpaceCollaboratorsJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final SpaceCollaboratorsJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = SpaceCollaboratorsJson.$childSerializers;
        String strA8f = null;
        List listA0Q = null;
        List listA0Q2 = null;
        JsonElement jsonElementA16 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new SpaceCollaboratorsJson(i, strA8f, listA0Q, listA0Q2, jsonElementA16, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 1);
                i |= 2;
            } else if (iA8N == 2) {
                listA0Q2 = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                jsonElementA16 = C3cI.A16(c9iZ, c9j4A55, 3);
                i |= 8;
            }
        }
    }

    static {
        SpaceCollaboratorsJson$$serializer spaceCollaboratorsJson$$serializer = new SpaceCollaboratorsJson$$serializer();
        INSTANCE = spaceCollaboratorsJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.pairs.SpaceCollaboratorsJson", spaceCollaboratorsJson$$serializer, 4);
        c9iKA1C.A08(SpaceWidgetRefreshWorkerKt.KEY_SLUG, true);
        c9iKA1C.A08("collaborators", true);
        c9iKA1C.A08("pending_access_requests", true);
        c9iKA1C.A08("connection_revision", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = SpaceCollaboratorsJson.$childSerializers;
        return C3cH.A1a(JsonElementSerializer.A00, C07779iq.A01, C3cH.A10(f0cArr), C3cH.A11(f0cArr));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, SpaceCollaboratorsJson spaceCollaboratorsJson) {
        AnonymousClass003.A0u(interfaceC07789is, spaceCollaboratorsJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SpaceCollaboratorsJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(spaceCollaboratorsJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
