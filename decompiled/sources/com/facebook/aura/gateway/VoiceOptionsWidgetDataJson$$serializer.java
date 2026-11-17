package com.facebook.aura.gateway;

import X.AbstractC07749im;
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
import com.facebook.aura.partners.voice.viewmodel.VoiceWidgetSelectionCoordinatorKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class VoiceOptionsWidgetDataJson$$serializer implements C9cd<VoiceOptionsWidgetDataJson> {
    public static final int $stable = 0;
    public static final VoiceOptionsWidgetDataJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final VoiceOptionsWidgetDataJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = VoiceOptionsWidgetDataJson.$childSerializers;
        List listA0Q = null;
        Boolean boolA0L = null;
        Boolean boolA0L2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new VoiceOptionsWidgetDataJson(i, listA0Q, boolA0L, boolA0L2, (C2hx) null);
            }
            if (iA8N == 0) {
                listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 0);
                i |= 1;
            } else if (iA8N == 1) {
                boolA0L = C3cI.A0L(c9iZ, c9j4A55, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                boolA0L2 = C3cI.A0L(c9iZ, c9j4A55, 2);
                i |= 4;
            }
        }
    }

    static {
        VoiceOptionsWidgetDataJson$$serializer voiceOptionsWidgetDataJson$$serializer = new VoiceOptionsWidgetDataJson$$serializer();
        INSTANCE = voiceOptionsWidgetDataJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.VoiceOptionsWidgetDataJson", voiceOptionsWidgetDataJson$$serializer, 3);
        c9iKA1C.A08("options", true);
        c9iKA1C.A08("switch_voice", true);
        c9iKA1C.A08(VoiceWidgetSelectionCoordinatorKt.SELECTION_SOURCE_BROWSE_ALL, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9hr c9hrA0z = C3cH.A0z(VoiceOptionsWidgetDataJson.$childSerializers);
        C07839ix c07839ix = C07839ix.A00;
        return C3cG.A1b(c07839ix, c9hrA0z, AbstractC07749im.A00(c07839ix));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, VoiceOptionsWidgetDataJson voiceOptionsWidgetDataJson) {
        AnonymousClass003.A0u(interfaceC07789is, voiceOptionsWidgetDataJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        VoiceOptionsWidgetDataJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(voiceOptionsWidgetDataJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
