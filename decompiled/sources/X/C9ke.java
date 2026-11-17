package X;

import com.facebook.aura.partners.voice.chrome.VoiceConversationPresentationActionKt;
import com.whatsapp.accountlinking.ipc.api.models.TriggerSilentUnpauseOperation;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9ke, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9ke implements C9cd<TriggerSilentUnpauseOperation> {
    public static final C9ke A00;
    public static final C9iZ A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = A01;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = TriggerSilentUnpauseOperation.$childSerializers;
        String strA8f = null;
        C9ki c9ki = null;
        int i = 0;
        int iA8U = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new TriggerSilentUnpauseOperation(i, strA8f, iA8U, c9ki, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                iA8U = c9j4A55.A8U(c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                c9ki = (C9ki) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 2);
                i |= 4;
            }
        }
    }

    static {
        C9ke c9ke = new C9ke();
        A00 = c9ke;
        C9iK c9iKA1C = C3cG.A1C("TriggerSilentUnpauseOperation", c9ke, 3);
        c9iKA1C.A08(VoiceConversationPresentationActionKt.SOURCE_APP_ANNOTATION, false);
        c9iKA1C.A08("version", true);
        c9iKA1C.A08("trigger", true);
        A01 = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C07779iq.A01, C07729ii.A00, C3cH.A11(TriggerSilentUnpauseOperation.$childSerializers)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        TriggerSilentUnpauseOperation triggerSilentUnpauseOperation = (TriggerSilentUnpauseOperation) obj;
        AnonymousClass003.A0u(interfaceC07789is, triggerSilentUnpauseOperation);
        C9iZ c9iZ = A01;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        TriggerSilentUnpauseOperation.write$Self$java_com_whatsapp_accountlinking_ipc_api_api(triggerSilentUnpauseOperation, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
