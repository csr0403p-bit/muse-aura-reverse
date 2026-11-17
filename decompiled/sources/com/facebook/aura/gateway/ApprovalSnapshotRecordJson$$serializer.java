package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
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
import X.C9j1;
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
public final /* synthetic */ class ApprovalSnapshotRecordJson$$serializer implements C9cd<ApprovalSnapshotRecordJson> {
    public static final int $stable = 0;
    public static final ApprovalSnapshotRecordJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ApprovalSnapshotRecordJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ApprovalSnapshotRecordJson.$childSerializers;
        C2hx c2hx = null;
        String strA0k = null;
        Long l = null;
        ApprovalSnapshotScopeJson approvalSnapshotScopeJson = null;
        ApprovalSnapshotDisplayJson approvalSnapshotDisplayJson = null;
        List list = null;
        Long l2 = null;
        ApprovalSnapshotPayloadJson approvalSnapshotPayloadJson = null;
        String strA0p = null;
        String strA0n = null;
        String strA0h = null;
        String strA0w = null;
        long jA8X = 0;
        boolean zA8G = false;
        int i = 0;
        boolean zA8G2 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ApprovalSnapshotRecordJson(i, strA0w, strA0h, zA8G, strA0k, jA8X, l, strA0n, zA8G2, l2, strA0p, list, approvalSnapshotDisplayJson, approvalSnapshotScopeJson, approvalSnapshotPayloadJson, c2hx);
                case 0:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    zA8G = c9j4A55.A8G(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    jA8X = c9j4A55.A8X(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i |= 64;
                    break;
                case 7:
                    zA8G2 = c9j4A55.A8G(c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    l2 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    strA0p = C3cI.A0p(c9iZ, c9j4A55);
                    i |= 512;
                    break;
                case 10:
                    list = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 10);
                    i |= 1024;
                    break;
                case 11:
                    approvalSnapshotDisplayJson = (ApprovalSnapshotDisplayJson) c9j4A55.A8a(ApprovalSnapshotDisplayJson$$serializer.INSTANCE, c9iZ, 11);
                    i |= 2048;
                    break;
                case 12:
                    approvalSnapshotScopeJson = (ApprovalSnapshotScopeJson) c9j4A55.A8a(ApprovalSnapshotScopeJson$$serializer.INSTANCE, c9iZ, 12);
                    i |= 4096;
                    break;
                case 13:
                    approvalSnapshotPayloadJson = (ApprovalSnapshotPayloadJson) c9j4A55.A8a(ApprovalSnapshotPayloadJson$$serializer.INSTANCE, c9iZ, 13);
                    i |= 8192;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ApprovalSnapshotRecordJson$$serializer approvalSnapshotRecordJson$$serializer = new ApprovalSnapshotRecordJson$$serializer();
        INSTANCE = approvalSnapshotRecordJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.ApprovalSnapshotRecordJson", approvalSnapshotRecordJson$$serializer, 14);
        c9iKA1C.A08("checkout_provider", true);
        c9iKA1C.A08("approval_id", false);
        c9iKA1C.A08("is_exclusive", true);
        c9iKA1C.A08("attention_mode", true);
        c9iKA1C.A08("requested_at_ms", true);
        C3cH.A1H("decided_at_ms", c9iKA1C, true);
        c9iKA1C.A08("editable_message_available", true);
        c9iKA1C.A08("message_revision", true);
        c9iKA1C.A08("decision", true);
        c9iKA1C.A08("decision_options", true);
        c9iKA1C.A08("display", true);
        c9iKA1C.A08("scope", true);
        c9iKA1C.A08("payload", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = ApprovalSnapshotRecordJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c9hrA00, c07779iq, c07839ix, c9hrA002, c9j1, AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c07779iq), c07839ix, AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 10), ApprovalSnapshotDisplayJson$$serializer.INSTANCE, ApprovalSnapshotScopeJson$$serializer.INSTANCE, ApprovalSnapshotPayloadJson$$serializer.INSTANCE};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ApprovalSnapshotRecordJson approvalSnapshotRecordJson) {
        AnonymousClass003.A0u(interfaceC07789is, approvalSnapshotRecordJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ApprovalSnapshotRecordJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(approvalSnapshotRecordJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
