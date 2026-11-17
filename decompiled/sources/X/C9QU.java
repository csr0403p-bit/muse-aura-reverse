package X;

import com.facebook.aura.file.actions.HatchShareKt;
import com.whatsapp.accountlinking.ipc.api.models.linked.QuickSendsMessageOperation;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9QU, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9QU implements C9cd<QuickSendsMessageOperation> {
    public static final C9QU A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = QuickSendsMessageOperation.$childSerializers;
        String strA0w = null;
        List listA0P = null;
        String strA8f = null;
        String strA8f2 = null;
        String strA0w2 = null;
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new QuickSendsMessageOperation(i, listA0P, strA8f, strA8f2, strA0w2, strA0w, iA8U, (C2hx) null);
                case 0:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 0);
                    i |= 1;
                    break;
                case 1:
                    strA8f = c9j4A55.A8f(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    strA8f2 = c9j4A55.A8f(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    iA8U = c9j4A55.A8U(c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        C9QU c9qu = new C9QU();
        A00 = c9qu;
        C9iK c9iKA1C = C3cG.A1C("QuickSendsMessageOperation", c9qu, 6);
        c9iKA1C.A08("obfuscated_chat_ids", false);
        c9iKA1C.A08(HatchShareKt.CONTENT_URL_PARAM, false);
        c9iKA1C.A08("content_type", false);
        c9iKA1C.A08("custom_message", true);
        C9iK.A04("surface", c9iKA1C, true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9hr c9hrA0z = C3cH.A0z(QuickSendsMessageOperation.$childSerializers);
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c9hrA0z, c07779iq, c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C07729ii.A00};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        QuickSendsMessageOperation quickSendsMessageOperation = (QuickSendsMessageOperation) obj;
        AnonymousClass003.A0u(interfaceC07789is, quickSendsMessageOperation);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        QuickSendsMessageOperation.write$Self$java_com_whatsapp_accountlinking_ipc_api_api(quickSendsMessageOperation, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
