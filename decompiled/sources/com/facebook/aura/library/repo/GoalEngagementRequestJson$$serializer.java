package com.facebook.aura.library.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07799it;
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
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class GoalEngagementRequestJson$$serializer implements C9cd<GoalEngagementRequestJson> {
    public static final GoalEngagementRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final GoalEngagementRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA0v = null;
        Double d = null;
        JsonObject jsonObject = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new GoalEngagementRequestJson(i, strA8f, strA0v, d, jsonObject, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 1);
                i |= 2;
            } else if (iA8N == 2) {
                d = (Double) c9j4A55.A8Z(C07799it.A00, c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                jsonObject = (JsonObject) c9j4A55.A8Z(JsonObjectSerializer.A01, c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        GoalEngagementRequestJson$$serializer goalEngagementRequestJson$$serializer = new GoalEngagementRequestJson$$serializer();
        INSTANCE = goalEngagementRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.library.repo.GoalEngagementRequestJson", goalEngagementRequestJson$$serializer, 4);
        c9iKA1C.A08("event_type", false);
        c9iKA1C.A08("surface", true);
        c9iKA1C.A08(BrowserOperationCatalogKt.VALUE, true);
        c9iKA1C.A08("metadata", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return C3cH.A1a(JsonObjectSerializer.A01, c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C07799it.A00));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, GoalEngagementRequestJson goalEngagementRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, goalEngagementRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GoalEngagementRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(goalEngagementRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
