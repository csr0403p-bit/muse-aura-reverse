package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C5hV;
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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class GenericListRowDataJson$$serializer implements C9cd<GenericListRowDataJson> {
    public static final int $stable = 0;
    public static final GenericListRowDataJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final GenericListRowDataJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        C2hx c2hx = null;
        String strA0v = null;
        String strA0v2 = null;
        HatchAttachmentFileJson hatchAttachmentFileJson = null;
        FlightRowFlightDataJson flightRowFlightDataJson = null;
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new GenericListRowDataJson(i, strA0v, strA0v2, hatchAttachmentFileJson, iA8U, flightRowFlightDataJson, c2hx);
            }
            if (iA8N == 0) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA0v2 = C3cI.A0v(c9iZ, c9j4A55, 1);
                i |= 2;
            } else if (iA8N == 2) {
                hatchAttachmentFileJson = (HatchAttachmentFileJson) c9j4A55.A8Z(HatchAttachmentFileJson$$serializer.INSTANCE, c9iZ, 2);
                i |= 4;
            } else if (iA8N == 3) {
                iA8U = c9j4A55.A8U(c9iZ, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                flightRowFlightDataJson = (FlightRowFlightDataJson) c9j4A55.A8Z(FlightRowFlightDataJson$$serializer.INSTANCE, c9iZ, 4);
                i |= 16;
            }
        }
    }

    static {
        GenericListRowDataJson$$serializer genericListRowDataJson$$serializer = new GenericListRowDataJson$$serializer();
        INSTANCE = genericListRowDataJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.GenericListRowDataJson", genericListRowDataJson$$serializer, 5);
        C3cI.A1N("text", c9iKA1C, true);
        c9iKA1C.A08("file", true);
        c9iKA1C.A08("slice_index", true);
        c9iKA1C.A08("flight_data", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return C3cI.A1b(FlightRowFlightDataJson$$serializer.INSTANCE, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(HatchAttachmentFileJson$$serializer.INSTANCE), C07729ii.A00);
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
    public final void serialize(InterfaceC07789is interfaceC07789is, GenericListRowDataJson genericListRowDataJson) {
        AnonymousClass003.A0u(interfaceC07789is, genericListRowDataJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GenericListRowDataJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(genericListRowDataJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
