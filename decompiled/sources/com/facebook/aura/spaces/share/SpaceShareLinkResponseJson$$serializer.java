package com.facebook.aura.spaces.share;

import X.AbstractC07749im;
import X.AnonymousClass003;
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
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class SpaceShareLinkResponseJson$$serializer implements C9cd<SpaceShareLinkResponseJson> {
    public static final int $stable = 0;
    public static final SpaceShareLinkResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final SpaceShareLinkResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        Boolean boolA0L = null;
        JsonElement jsonElementA16 = null;
        JsonObject jsonObject = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new SpaceShareLinkResponseJson(i, boolA0L, jsonElementA16, jsonObject, (C2hx) null);
            }
            if (iA8N == 0) {
                boolA0L = C3cI.A0L(c9iZ, c9j4A55, 0);
                i |= 1;
            } else if (iA8N == 1) {
                jsonElementA16 = C3cI.A16(c9iZ, c9j4A55, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                jsonObject = (JsonObject) c9j4A55.A8Z(JsonObjectSerializer.A01, c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        SpaceShareLinkResponseJson$$serializer spaceShareLinkResponseJson$$serializer = new SpaceShareLinkResponseJson$$serializer();
        INSTANCE = spaceShareLinkResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.spaces.share.SpaceShareLinkResponseJson", spaceShareLinkResponseJson$$serializer, 3);
        c9iKA1C.A08(PairsInviteMailboxKt.OUTCOME_OK, true);
        c9iKA1C.A08("error", true);
        c9iKA1C.A08("result", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cG.A1b(JsonObjectSerializer.A01, AbstractC07749im.A00(C07839ix.A00), AbstractC07749im.A00(JsonElementSerializer.A00));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, SpaceShareLinkResponseJson spaceShareLinkResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, spaceShareLinkResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SpaceShareLinkResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_share_share(spaceShareLinkResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
