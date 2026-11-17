package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
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
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class FlightRowData$$serializer implements C9cd<FlightRowData> {
    public static final int $stable = 0;
    public static final FlightRowData$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final FlightRowData deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        int i2;
        int i3;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = FlightRowData.$childSerializers;
        String strA0g = null;
        List listA0Q = null;
        String strA0l = null;
        FareCondition fareCondition = null;
        String strA0m = null;
        List listA0P = null;
        String strA0t = null;
        FareCondition fareCondition2 = null;
        FlightRowBags flightRowBags = null;
        String strA0f = null;
        String strA0s = null;
        List listA0P2 = null;
        String strA8f = null;
        String strA0u = null;
        String strA8f2 = null;
        String strA0f2 = null;
        String strA0g2 = null;
        String strA0f3 = null;
        FlightRowSelectionStage flightRowSelectionStage = null;
        String strA0f4 = null;
        String strA0f5 = null;
        int i4 = 0;
        int iA8U = 0;
        int iA8U2 = 0;
        boolean zA8G = false;
        int iA8U3 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new FlightRowData(i4, strA8f, iA8U2, strA0g, listA0P, strA0l, strA0m, iA8U3, listA0P2, flightRowBags, zA8G, fareCondition2, fareCondition, strA0s, strA0t, strA0f, strA0u, strA8f2, strA0f2, strA0g2, iA8U, strA0f3, flightRowSelectionStage, strA0f4, strA0f5, listA0Q, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i4 |= 1;
                case 1:
                    iA8U2 = c9j4A55.A8U(c9iZ, 1);
                    i4 |= 2;
                case 2:
                    strA0g = C3cI.A0g(c9iZ, c9j4A55);
                    i4 |= 4;
                case 3:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 3);
                    i4 |= 8;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i4 |= 16;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i4 |= 32;
                case 6:
                    iA8U3 = c9j4A55.A8U(c9iZ, 6);
                    i4 |= 64;
                case 7:
                    listA0P2 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 7);
                    i4 |= 128;
                case 8:
                    flightRowBags = (FlightRowBags) c9j4A55.A8Z(FlightRowBags$$serializer.INSTANCE, c9iZ, 8);
                    i4 |= 256;
                case 9:
                    zA8G = c9j4A55.A8G(c9iZ, 9);
                    i4 |= 512;
                case 10:
                    fareCondition2 = (FareCondition) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 10);
                    i4 |= 1024;
                case 11:
                    fareCondition = (FareCondition) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 11);
                    i4 |= 2048;
                case 12:
                    strA0s = C3cI.A0s(c9iZ, c9j4A55);
                    i4 |= 4096;
                case 13:
                    strA0t = C3cI.A0t(c9iZ, c9j4A55);
                    i4 |= 8192;
                case 14:
                    strA0f = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 14);
                    i4 |= 16384;
                case 15:
                    strA0u = C3cI.A0u(c9iZ, c9j4A55);
                    i = 32768;
                    i4 |= i;
                case 16:
                    strA8f2 = c9j4A55.A8f(c9iZ, 16);
                    i = 65536;
                    i4 |= i;
                case 17:
                    strA0f2 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 17);
                    i = 131072;
                    i4 |= i;
                case 18:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 18);
                    i4 |= 262144;
                case 19:
                    iA8U = c9j4A55.A8U(c9iZ, 19);
                    i2 = 524288;
                    i4 |= i2;
                case 20:
                    strA0f3 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 20);
                    i2 = 1048576;
                    i4 |= i2;
                case 21:
                    flightRowSelectionStage = (FlightRowSelectionStage) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 21);
                    i3 = 2097152;
                    i4 |= i3;
                case 22:
                    strA0f4 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 22);
                    i3 = 4194304;
                    i4 |= i3;
                case 23:
                    strA0f5 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 23);
                    i3 = 8388608;
                    i4 |= i3;
                case 24:
                    listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 24);
                    i4 |= HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        FlightRowData$$serializer flightRowData$$serializer = new FlightRowData$$serializer();
        INSTANCE = flightRowData$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.FlightRowData", flightRowData$$serializer, 25);
        boolean zA1Q = C3cG.A1Q(c9iKA1C);
        c9iKA1C.A08("sliceIndex", zA1Q);
        c9iKA1C.A08("airline", zA1Q);
        c9iKA1C.A08("icons", zA1Q);
        c9iKA1C.A08("price", zA1Q);
        c9iKA1C.A08("duration", zA1Q);
        c9iKA1C.A08("stops", zA1Q);
        c9iKA1C.A08("slices", zA1Q);
        c9iKA1C.A08("bags", zA1Q);
        c9iKA1C.A08("baggageVaries", zA1Q);
        c9iKA1C.A08("refundable", zA1Q);
        c9iKA1C.A08("changeable", zA1Q);
        c9iKA1C.A08("refundPenalty", zA1Q);
        c9iKA1C.A08("changePenalty", zA1Q);
        c9iKA1C.A08("refundPenaltyStatus", zA1Q);
        c9iKA1C.A08("changePenaltyStatus", zA1Q);
        c9iKA1C.A08("responseMessage", zA1Q);
        c9iKA1C.A08("flightLink", zA1Q);
        c9iKA1C.A08("ctaText", zA1Q);
        c9iKA1C.A08("passengerCount", zA1Q);
        c9iKA1C.A08("pricePerPassenger", zA1Q);
        c9iKA1C.A08("selectionStage", zA1Q);
        c9iKA1C.A08("fromPrice", zA1Q);
        c9iKA1C.A08("fromPricePerPassenger", zA1Q);
        c9iKA1C.A08("priceBreakdown", zA1Q);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = FlightRowData.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C07729ii c07729ii = C07729ii.A00;
        return new C9hr[]{c07779iq, c07729ii, AbstractC07749im.A00(c07779iq), C3cH.A12(f0cArr), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), c07729ii, C3cG.A16(f0cArr, 7), AbstractC07749im.A00(FlightRowBags$$serializer.INSTANCE), C07839ix.A00, C3cG.A16(f0cArr, 10), C3cG.A16(f0cArr, 11), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), c07729ii, AbstractC07749im.A00(c07779iq), C3cH.A14(f0cArr, 21), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 24)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, FlightRowData flightRowData) {
        AnonymousClass003.A0u(interfaceC07789is, flightRowData);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        FlightRowData.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(flightRowData, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
