package com.facebook.aura.pairs;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
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
import com.facebook.aura.browsertask.navigation.BrowserTaskUiCommandsKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class SharedGoalEditJson$$serializer implements C9cd<SharedGoalEditJson> {
    public static final int $stable = 0;
    public static final SharedGoalEditJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final SharedGoalEditJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        Boolean boolA0M = null;
        Boolean boolA0M2 = null;
        String strA0n = null;
        String strA0o = null;
        String strA0m = null;
        String strA0l = null;
        String strA0k = null;
        String strA0h = null;
        String strA0j = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new SharedGoalEditJson(i, strA8f, strA0h, strA0j, strA0k, strA0l, strA0m, strA0n, strA0o, boolA0M2, boolA0M, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
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
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i |= 64;
                    break;
                case 7:
                    strA0o = C3cI.A0o(c9iZ, c9j4A55);
                    i |= 128;
                    break;
                case 8:
                    boolA0M2 = C3cI.A0M(c9iZ, c9j4A55, 8);
                    i |= 256;
                    break;
                case 9:
                    boolA0M = C3cI.A0M(c9iZ, c9j4A55, 9);
                    i |= 512;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        SharedGoalEditJson$$serializer sharedGoalEditJson$$serializer = new SharedGoalEditJson$$serializer();
        INSTANCE = sharedGoalEditJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.pairs.SharedGoalEditJson", sharedGoalEditJson$$serializer, 10);
        c9iKA1C.A08("mutation_id", false);
        c9iKA1C.A08("expected_revision", false);
        boolean zA1R = C3cG.A1R(c9iKA1C);
        C3cH.A1H("summary", c9iKA1C, zA1R);
        c9iKA1C.A08("reason", zA1R);
        c9iKA1C.A08(BrowserTaskUiCommandsKt.TASK_ID_PARAM, zA1R);
        c9iKA1C.A08("task_title", zA1R);
        c9iKA1C.A08("completed", zA1R);
        c9iKA1C.A08("remove_task", zA1R);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA004 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA005 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA006 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c07779iq, c9hrA00, c9hrA002, c9hrA003, c9hrA004, c9hrA005, c9hrA006, AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07839ix)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, SharedGoalEditJson sharedGoalEditJson) {
        AnonymousClass003.A0u(interfaceC07789is, sharedGoalEditJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SharedGoalEditJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(sharedGoalEditJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
