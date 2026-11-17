package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C3cG;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.commands.alarm.ReminderAlarmReceiver;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class PinConfirmRequestJson$$serializer implements C9cd<PinConfirmRequestJson> {
    public static final PinConfirmRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final PinConfirmRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA8f2 = null;
        long jA8X = 0;
        int i = 0;
        long jA8X2 = 0;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new PinConfirmRequestJson(i, strA8f, strA8f2, jA8X, zA8G, jA8X2, null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f2 = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                jA8X = c9j4A55.A8X(c9iZ, 2);
                i |= 4;
            } else if (iA8N == 3) {
                zA8G = c9j4A55.A8G(c9iZ, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                jA8X2 = c9j4A55.A8X(c9iZ, 4);
                i |= 16;
            }
        }
    }

    static {
        PinConfirmRequestJson$$serializer pinConfirmRequestJson$$serializer = new PinConfirmRequestJson$$serializer();
        INSTANCE = pinConfirmRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.confidentialvm.repository.PinConfirmRequestJson", pinConfirmRequestJson$$serializer, 5);
        c9iKA1C.A08(ReminderAlarmReceiver.EXTRA_REMINDER_ID, false);
        c9iKA1C.A08("update_id", false);
        c9iKA1C.A08("state_revision", false);
        c9iKA1C.A08("had_wrong_guess", false);
        c9iKA1C.A08("last_successful_entry_at_ms", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c07779iq, c07779iq, c9j1, C07839ix.A00, c9j1};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, PinConfirmRequestJson pinConfirmRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, pinConfirmRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        PinConfirmRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(pinConfirmRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
