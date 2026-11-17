package com.facebook.aura.graduation.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
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
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class GraduationStartResponseJson$$serializer implements C9cd<GraduationStartResponseJson> {
    public static final GraduationStartResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final GraduationStartResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = GraduationStartResponseJson.$childSerializers;
        Long l = null;
        List list = null;
        GraduationTemplateParametersJson graduationTemplateParametersJson = null;
        String strA8f = null;
        String str = null;
        boolean zA8G = false;
        int i = 0;
        boolean zA8G2 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new GraduationStartResponseJson(i, zA8G, zA8G2, strA8f, str, l, graduationTemplateParametersJson, list, (C2hx) null);
                case 0:
                    zA8G = c9j4A55.A8G(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    zA8G2 = c9j4A55.A8G(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    strA8f = c9j4A55.A8f(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    graduationTemplateParametersJson = (GraduationTemplateParametersJson) c9j4A55.A8a(GraduationTemplateParametersJson$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) c9j4A55.A8a(f0cArr[6].getValue(), c9iZ, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        GraduationStartResponseJson$$serializer graduationStartResponseJson$$serializer = new GraduationStartResponseJson$$serializer();
        INSTANCE = graduationStartResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.graduation.repo.GraduationStartResponseJson", graduationStartResponseJson$$serializer, 7);
        c9iKA1C.A08("should_show", true);
        c9iKA1C.A08("is_user_graduation_enabled", true);
        c9iKA1C.A08("experience_id", true);
        c9iKA1C.A08("video_url", true);
        c9iKA1C.A08("loop_start_time_ms", true);
        c9iKA1C.A08("template_parameters", true);
        c9iKA1C.A08("pages", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = GraduationStartResponseJson.$childSerializers;
        C07839ix c07839ix = C07839ix.A00;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07839ix, c07839ix, c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C9j1.A00), GraduationTemplateParametersJson$$serializer.INSTANCE, C3cG.A16(f0cArr, 6)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, GraduationStartResponseJson graduationStartResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, graduationStartResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GraduationStartResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_graduation_repo_repo(graduationStartResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
