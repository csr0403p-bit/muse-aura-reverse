package com.facebook.aura.ageverification;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
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
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class AgeVerificationStatusResponseJson$$serializer implements C9cd<AgeVerificationStatusResponseJson> {
    public static final int $stable = 0;
    public static final AgeVerificationStatusResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AgeVerificationStatusResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = AgeVerificationStatusResponseJson.$childSerializers;
        String strA8f = null;
        List listA0Q = null;
        AgeVerificationAttemptJson ageVerificationAttemptJson = null;
        Integer numA0N = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new AgeVerificationStatusResponseJson(i, strA8f, listA0Q, ageVerificationAttemptJson, numA0N, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 1);
                i |= 2;
            } else if (iA8N == 2) {
                ageVerificationAttemptJson = (AgeVerificationAttemptJson) c9j4A55.A8Z(AgeVerificationAttemptJson$$serializer.INSTANCE, c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                numA0N = C3cI.A0N(c9iZ, c9j4A55, 3);
                i |= 8;
            }
        }
    }

    static {
        AgeVerificationStatusResponseJson$$serializer ageVerificationStatusResponseJson$$serializer = new AgeVerificationStatusResponseJson$$serializer();
        INSTANCE = ageVerificationStatusResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.ageverification.AgeVerificationStatusResponseJson", ageVerificationStatusResponseJson$$serializer, 4);
        c9iKA1C.A08("state", true);
        c9iKA1C.A08("methods", true);
        c9iKA1C.A08(HatchCcvLoggingKt.EVENT_TYPE_ATTEMPT, true);
        c9iKA1C.A08(AgeCheckFunnelLogging.KEY_RETRIES_LEFT, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = AgeVerificationStatusResponseJson.$childSerializers;
        return C3cH.A1a(C07729ii.A00, C07779iq.A01, C3cH.A10(f0cArr), AbstractC07749im.A00(AgeVerificationAttemptJson$$serializer.INSTANCE));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AgeVerificationStatusResponseJson ageVerificationStatusResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, ageVerificationStatusResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AgeVerificationStatusResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_ageverification_impl_impl(ageVerificationStatusResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
