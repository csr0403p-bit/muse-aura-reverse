package com.facebook.aura.partners.voice.avatar;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
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
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class GraphResponseJson$$serializer<T> implements C9cd<GraphResponseJson<T>> {
    public final C9iZ descriptor;
    public final /* synthetic */ C9hr<?> typeSerial0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GraphResponseJson$$serializer(C9hr<T> c9hr) {
        this();
        C7384Etj.A0Y(c9hr, 0);
        this.typeSerial0 = c9hr;
    }

    @Override // X.C9jG
    public final GraphResponseJson<T> deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = this.descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        Object objA8Z = null;
        JsonElement jsonElementA16 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new GraphResponseJson<>(i, objA8Z, jsonElementA16, (C2hx) null);
            }
            if (iA8N == 0) {
                objA8Z = c9j4A55.A8Z(this.typeSerial0, c9iZ, 0);
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

    private final /* synthetic */ C9hr getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cH.A1Z(JsonElementSerializer.A00, AbstractC07749im.A00(this.typeSerial0));
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return this.descriptor;
    }

    @Override // X.C9cd
    public final C9hr<?>[] typeParametersSerializers() {
        return new C9hr[]{this.typeSerial0};
    }

    public GraphResponseJson$$serializer() {
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.partners.voice.avatar.GraphResponseJson", this, 2);
        c9iKA1C.A08("data", true);
        c9iKA1C.A08("errors", true);
        this.descriptor = c9iKA1C;
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, GraphResponseJson<T> graphResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, graphResponseJson);
        C9iZ c9iZ = this.descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GraphResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(graphResponseJson, c9j5A56, c9iZ, this.typeSerial0);
        c9j5A56.AAd(c9iZ);
    }
}
