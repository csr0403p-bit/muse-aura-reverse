package com.facebook.aura.rentalcars;

import X.AnonymousClass003;
import X.C2hx;
import X.C3cG;
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
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class RentalCarAddressJson$$serializer implements C9cd<RentalCarAddressJson> {
    public static final int $stable = 0;
    public static final RentalCarAddressJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final RentalCarAddressJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0v = null;
        String strA0v2 = null;
        String strA0v3 = null;
        String strA0v4 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new RentalCarAddressJson(i, strA0v, strA0v2, strA0v3, strA0v4, (C2hx) null);
            }
            if (iA8N == 0) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA0v2 = C3cI.A0v(c9iZ, c9j4A55, 1);
                i |= 2;
            } else if (iA8N == 2) {
                strA0v3 = C3cI.A0v(c9iZ, c9j4A55, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                strA0v4 = C3cI.A0v(c9iZ, c9j4A55, 3);
                i |= 8;
            }
        }
    }

    static {
        RentalCarAddressJson$$serializer rentalCarAddressJson$$serializer = new RentalCarAddressJson$$serializer();
        INSTANCE = rentalCarAddressJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.rentalcars.RentalCarAddressJson", rentalCarAddressJson$$serializer, 4);
        c9iKA1C.A08("line_one", true);
        c9iKA1C.A08("city_name", true);
        c9iKA1C.A08("region", true);
        c9iKA1C.A08("country_code", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cJ.A18();
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, RentalCarAddressJson rentalCarAddressJson) {
        AnonymousClass003.A0u(interfaceC07789is, rentalCarAddressJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        RentalCarAddressJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_rentalcars_impl_impl(rentalCarAddressJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
