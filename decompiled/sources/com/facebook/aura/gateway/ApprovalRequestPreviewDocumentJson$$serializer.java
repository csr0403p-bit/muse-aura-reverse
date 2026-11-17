package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.C07729ii;
import X.C07839ix;
import X.C3cG;
import X.C3cH;
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
/* loaded from: classes2.dex */
public final /* synthetic */ class ApprovalRequestPreviewDocumentJson$$serializer implements C9cd<ApprovalRequestPreviewDocumentJson> {
    public static final int $stable = 0;
    public static final ApprovalRequestPreviewDocumentJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ApprovalRequestPreviewDocumentJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ApprovalRequestPreviewDocumentJson.$childSerializers;
        List listA0Q = null;
        int iA8U = 0;
        int i = 0;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ApprovalRequestPreviewDocumentJson(i, iA8U, zA8G, listA0Q, null);
            }
            if (iA8N == 0) {
                iA8U = c9j4A55.A8U(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                zA8G = c9j4A55.A8G(c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 2);
                i |= 4;
            }
        }
    }

    static {
        ApprovalRequestPreviewDocumentJson$$serializer approvalRequestPreviewDocumentJson$$serializer = new ApprovalRequestPreviewDocumentJson$$serializer();
        INSTANCE = approvalRequestPreviewDocumentJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.ApprovalRequestPreviewDocumentJson", approvalRequestPreviewDocumentJson$$serializer, 3);
        c9iKA1C.A08("version", false);
        c9iKA1C.A08("truncated", false);
        c9iKA1C.A08("blocks", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C07729ii.A00, C07839ix.A00, C3cH.A11(ApprovalRequestPreviewDocumentJson.$childSerializers)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ApprovalRequestPreviewDocumentJson approvalRequestPreviewDocumentJson) {
        AnonymousClass003.A0u(interfaceC07789is, approvalRequestPreviewDocumentJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ApprovalRequestPreviewDocumentJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(approvalRequestPreviewDocumentJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
