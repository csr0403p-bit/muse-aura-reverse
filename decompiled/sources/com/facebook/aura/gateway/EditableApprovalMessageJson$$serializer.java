package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C7384Etj;
import X.C9Y;
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
import com.facebook.aura.wearablebroadcast.MetaAiAppBroadcastSender;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class EditableApprovalMessageJson$$serializer implements C9cd<EditableApprovalMessageJson> {
    public static final int $stable = 0;
    public static final EditableApprovalMessageJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final EditableApprovalMessageJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = EditableApprovalMessageJson.$childSerializers;
        String strA0w = null;
        List listA0P = null;
        List listA0P2 = null;
        List listA0P3 = null;
        List listA0P4 = null;
        String strA8f = null;
        String strA8f2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new EditableApprovalMessageJson(i, strA0w, listA0P2, listA0P3, listA0P4, strA8f, strA8f2, listA0P, (C2hx) null);
                case 0:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    listA0P2 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 1);
                    i |= 2;
                    break;
                case 2:
                    listA0P3 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 2);
                    i |= 4;
                    break;
                case 3:
                    listA0P4 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 3);
                    i |= 8;
                    break;
                case 4:
                    strA8f = c9j4A55.A8f(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA8f2 = c9j4A55.A8f(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        EditableApprovalMessageJson$$serializer editableApprovalMessageJson$$serializer = new EditableApprovalMessageJson$$serializer();
        INSTANCE = editableApprovalMessageJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.EditableApprovalMessageJson", editableApprovalMessageJson$$serializer, 7);
        c9iKA1C.A08("from", true);
        c9iKA1C.A08("to", false);
        c9iKA1C.A08("cc", true);
        c9iKA1C.A08("bcc", true);
        c9iKA1C.A08("subject", false);
        c9iKA1C.A08(MetaAiAppBroadcastSender.EXTRA_BODY, false);
        c9iKA1C.A08(C9Y.BUG_REPORT_ATTACHMENTS_ENDPOINT, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = EditableApprovalMessageJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), C3cH.A10(f0cArr), C3cH.A11(f0cArr), C3cH.A12(f0cArr), c07779iq, c07779iq, C3cG.A16(f0cArr, 6)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, EditableApprovalMessageJson editableApprovalMessageJson) {
        AnonymousClass003.A0u(interfaceC07789is, editableApprovalMessageJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        EditableApprovalMessageJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(editableApprovalMessageJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
