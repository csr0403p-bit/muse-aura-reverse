package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C60O;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.model.HatchContentBlock;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class HatchContentBlock$ToolCallBlock$$serializer implements C9cd<HatchContentBlock.ToolCallBlock> {
    public static final int $stable = 0;
    public static final HatchContentBlock$ToolCallBlock$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchContentBlock.ToolCallBlock deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = HatchContentBlock.ToolCallBlock.$childSerializers;
        String strA8f = null;
        Long lA0Q = null;
        HatchToolCallStatus hatchToolCallStatus = null;
        HatchToolCallResult hatchToolCallResult = null;
        HatchToolCallRequest hatchToolCallRequest = null;
        long jA8X = 0;
        int i = 0;
        String strA0h = null;
        String strA0i = null;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HatchContentBlock.ToolCallBlock(i, strA8f, strA0h, strA0i, hatchToolCallRequest, hatchToolCallResult, hatchToolCallStatus, jA8X, lA0Q, null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    hatchToolCallRequest = (HatchToolCallRequest) c9j4A55.A8a(HatchToolCallRequest$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    hatchToolCallResult = (HatchToolCallResult) c9j4A55.A8Z(HatchToolCallResult$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    hatchToolCallStatus = (HatchToolCallStatus) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 5);
                    i |= 32;
                    break;
                case 6:
                    jA8X = c9j4A55.A8X(c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    lA0Q = C3cI.A0Q(c9iZ, c9j4A55, 7);
                    i |= 128;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        HatchContentBlock$ToolCallBlock$$serializer hatchContentBlock$ToolCallBlock$$serializer = new HatchContentBlock$ToolCallBlock$$serializer();
        INSTANCE = hatchContentBlock$ToolCallBlock$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.HatchContentBlock.ToolCallBlock", hatchContentBlock$ToolCallBlock$$serializer, 8);
        C60O.A1T("id", c9iKA1C, false);
        c9iKA1C.A08("toolType", false);
        c9iKA1C.A08("request", false);
        C3cH.A1H("result", c9iKA1C, false);
        c9iKA1C.A08("startedAtMs", false);
        c9iKA1C.A08("completedAtMs", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = HatchContentBlock.ToolCallBlock.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        HatchToolCallRequest$$serializer hatchToolCallRequest$$serializer = HatchToolCallRequest$$serializer.INSTANCE;
        C9hr c9hrA00 = AbstractC07749im.A00(HatchToolCallResult$$serializer.INSTANCE);
        C9hr c9hrA16 = C3cG.A16(f0cArr, 5);
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, hatchToolCallRequest$$serializer, c9hrA00, c9hrA16, c9j1, AbstractC07749im.A00(c9j1)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchContentBlock.ToolCallBlock toolCallBlock) {
        AnonymousClass003.A0u(interfaceC07789is, toolCallBlock);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchContentBlock.ToolCallBlock.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(toolCallBlock, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
