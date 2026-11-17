package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class GenericListRow$$serializer implements C9cd<GenericListRow> {
    public static final int $stable = 0;
    public static final GenericListRow$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final GenericListRow deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        JsonObject jsonObject = null;
        String strA0v = null;
        FlightRowData flightRowData = null;
        String strA0g = null;
        HatchAttachmentFile hatchAttachmentFile = null;
        String strA0l = null;
        String strA0k = null;
        String strA0j = null;
        String strA0i = null;
        String strA8f2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new GenericListRow(i, strA8f, strA0i, strA0j, strA0k, strA0l, strA8f2, strA0g, hatchAttachmentFile, flightRowData, strA0v, jsonObject, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i |= 16;
                    break;
                case 5:
                    strA8f2 = c9j4A55.A8f(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                case 7:
                    hatchAttachmentFile = (HatchAttachmentFile) c9j4A55.A8Z(HatchAttachmentFile$$serializer.INSTANCE, c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    flightRowData = (FlightRowData) c9j4A55.A8Z(FlightRowData$$serializer.INSTANCE, c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    strA0v = C3cI.A0v(c9iZ, c9j4A55, 9);
                    i |= 512;
                    break;
                case 10:
                    jsonObject = (JsonObject) c9j4A55.A8Z(JsonObjectSerializer.A01, c9iZ, 10);
                    i |= 1024;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        GenericListRow$$serializer genericListRow$$serializer = new GenericListRow$$serializer();
        INSTANCE = genericListRow$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.GenericListRow", genericListRow$$serializer, 11);
        c9iKA1C.A08("title", false);
        c9iKA1C.A08("subtitle", true);
        c9iKA1C.A08("tertiaryTitle", true);
        c9iKA1C.A08("imageUrl", true);
        c9iKA1C.A08("iconUrl", true);
        C3cI.A1N("type", c9iKA1C, true);
        c9iKA1C.A08("file", true);
        c9iKA1C.A08(GenericListPresentationKt.GENERIC_LIST_ROW_TYPE_FLIGHT, true);
        c9iKA1C.A08("messageText", true);
        c9iKA1C.A08("extraData", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(HatchAttachmentFile$$serializer.INSTANCE), AbstractC07749im.A00(FlightRowData$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(JsonObjectSerializer.A01)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, GenericListRow genericListRow) {
        AnonymousClass003.A0u(interfaceC07789is, genericListRow);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GenericListRow.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(genericListRow, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
