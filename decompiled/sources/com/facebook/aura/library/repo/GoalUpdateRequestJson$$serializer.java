package com.facebook.aura.library.repo;

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
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class GoalUpdateRequestJson$$serializer implements C9cd<GoalUpdateRequestJson> {
    public static final GoalUpdateRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final GoalUpdateRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0w = null;
        String strA0w2 = null;
        String strA0w3 = null;
        JsonElement jsonElementA17 = null;
        JsonElement jsonElementA172 = null;
        String strA0w4 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new GoalUpdateRequestJson(i, strA0w, strA0w2, strA0w3, jsonElementA17, jsonElementA172, strA0w4, (C2hx) null);
                case 0:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 1);
                    i |= 2;
                    break;
                case 2:
                    strA0w3 = C3cI.A0w(c9iZ, c9j4A55, 2);
                    i |= 4;
                    break;
                case 3:
                    jsonElementA17 = C3cI.A17(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    jsonElementA172 = C3cI.A17(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0w4 = C3cI.A0w(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        GoalUpdateRequestJson$$serializer goalUpdateRequestJson$$serializer = new GoalUpdateRequestJson$$serializer();
        INSTANCE = goalUpdateRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.library.repo.GoalUpdateRequestJson", goalUpdateRequestJson$$serializer, 6);
        boolean zA1R = C3cG.A1R(c9iKA1C);
        C3cH.A1H(HatchWebPageParserKt.DESCRIPTION, c9iKA1C, zA1R);
        c9iKA1C.A08("parent_goal_id", zA1R);
        c9iKA1C.A08("fixed_position", zA1R);
        c9iKA1C.A08(PhotosSearchHandlerKt.PARAM_SOURCE, zA1R);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        return new C9hr[]{c9hrA00, c9hrA002, c9hrA003, AbstractC07749im.A00(jsonElementSerializer), AbstractC07749im.A00(jsonElementSerializer), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, GoalUpdateRequestJson goalUpdateRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, goalUpdateRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GoalUpdateRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(goalUpdateRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
