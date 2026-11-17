package com.facebook.aura.survey;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C5hV;
import X.C60Q;
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
/* loaded from: classes4.dex */
public final /* synthetic */ class SurveyPageJson$$serializer implements C9cd<SurveyPageJson> {
    public static final int $stable = 0;
    public static final SurveyPageJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final SurveyPageJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = SurveyPageJson.$childSerializers;
        String strA8f = null;
        List listA0P = null;
        Integer numA0X = null;
        String strA8f2 = null;
        String strA0h = null;
        String strA8f3 = null;
        int iA8U = 0;
        int iA8U2 = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new SurveyPageJson(i, strA8f2, strA0h, iA8U2, iA8U, strA8f3, strA8f, numA0X, listA0P, (C2hx) null);
                case 0:
                    strA8f2 = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    iA8U2 = c9j4A55.A8U(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    iA8U = c9j4A55.A8U(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    strA8f3 = c9j4A55.A8f(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA8f = c9j4A55.A8f(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    numA0X = C60Q.A0X(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                case 7:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 7);
                    i |= 128;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        SurveyPageJson$$serializer surveyPageJson$$serializer = new SurveyPageJson$$serializer();
        INSTANCE = surveyPageJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.survey.SurveyPageJson", surveyPageJson$$serializer, 8);
        C3cH.A1G("page_id", c9iKA1C, true);
        c9iKA1C.A08("index", true);
        c9iKA1C.A08("total", true);
        c9iKA1C.A08("survey_id", true);
        c9iKA1C.A08("attempt_id", true);
        c9iKA1C.A08("page_ordinal", true);
        c9iKA1C.A08("questions", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = SurveyPageJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C07729ii c07729ii = C07729ii.A00;
        return new C9hr[]{c07779iq, c07779iq, c07729ii, c07729ii, c07779iq, c07779iq, AbstractC07749im.A00(c07729ii), C3cG.A16(f0cArr, 7)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, SurveyPageJson surveyPageJson) {
        AnonymousClass003.A0u(interfaceC07789is, surveyPageJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SurveyPageJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_survey_survey(surveyPageJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
