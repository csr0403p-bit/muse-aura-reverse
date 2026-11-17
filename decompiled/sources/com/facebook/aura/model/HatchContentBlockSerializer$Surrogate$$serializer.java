package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C5hV;
import X.C60P;
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
import com.facebook.aura.model.HatchContentBlock;
import com.facebook.aura.model.HatchContentBlockSerializer;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class HatchContentBlockSerializer$Surrogate$$serializer implements C9cd<HatchContentBlockSerializer.Surrogate> {
    public static final int $stable = 0;
    public static final HatchContentBlockSerializer$Surrogate$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchContentBlockSerializer.Surrogate deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        HatchContentBlock.TextBlock textBlock = null;
        HatchContentBlock.ToolCallBlock toolCallBlock = null;
        HatchContentBlock.SubAgentBlock subAgentBlock = null;
        HatchContentBlock.ThinkingBlock thinkingBlock = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new HatchContentBlockSerializer.Surrogate(i, strA8f, textBlock, toolCallBlock, subAgentBlock, thinkingBlock, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                textBlock = (HatchContentBlock.TextBlock) c9j4A55.A8Z(HatchContentBlock$TextBlock$$serializer.INSTANCE, c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                toolCallBlock = (HatchContentBlock.ToolCallBlock) c9j4A55.A8Z(HatchContentBlock$ToolCallBlock$$serializer.INSTANCE, c9iZ, 2);
                i |= 4;
            } else if (iA8N == 3) {
                subAgentBlock = (HatchContentBlock.SubAgentBlock) c9j4A55.A8Z(HatchContentBlock$SubAgentBlock$$serializer.INSTANCE, c9iZ, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                thinkingBlock = (HatchContentBlock.ThinkingBlock) c9j4A55.A8Z(HatchContentBlock$ThinkingBlock$$serializer.INSTANCE, c9iZ, 4);
                i |= 16;
            }
        }
    }

    static {
        HatchContentBlockSerializer$Surrogate$$serializer hatchContentBlockSerializer$Surrogate$$serializer = new HatchContentBlockSerializer$Surrogate$$serializer();
        INSTANCE = hatchContentBlockSerializer$Surrogate$$serializer;
        C9iK c9iKA1T = C60P.A1T("com.facebook.aura.model.HatchContentBlockSerializer.Surrogate", hatchContentBlockSerializer$Surrogate$$serializer, 5);
        c9iKA1T.A08("text", true);
        c9iKA1T.A08("toolCall", true);
        c9iKA1T.A08("subAgent", true);
        c9iKA1T.A08(HatchContentBlockSerializer.TYPE_THINKING, true);
        descriptor = c9iKA1T;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cI.A1b(HatchContentBlock$ThinkingBlock$$serializer.INSTANCE, C07779iq.A01, AbstractC07749im.A00(HatchContentBlock$TextBlock$$serializer.INSTANCE), AbstractC07749im.A00(HatchContentBlock$ToolCallBlock$$serializer.INSTANCE), AbstractC07749im.A00(HatchContentBlock$SubAgentBlock$$serializer.INSTANCE));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchContentBlockSerializer.Surrogate surrogate) {
        AnonymousClass003.A0u(interfaceC07789is, surrogate);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchContentBlockSerializer.Surrogate.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(surrogate, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
