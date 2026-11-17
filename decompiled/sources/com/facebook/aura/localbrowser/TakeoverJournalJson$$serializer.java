package com.facebook.aura.localbrowser;

import X.AnonymousClass003;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
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
import com.facebook.aura.notifications.push.AuraCvmPushReplayStore;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class TakeoverJournalJson$$serializer implements C9cd<TakeoverJournalJson> {
    public static final int $stable = 0;
    public static final TakeoverJournalJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final TakeoverJournalJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = TakeoverJournalJson.$childSerializers;
        C2hx c2hx = null;
        long jA8X = 0;
        List listA0P = null;
        long jA8X2 = 0;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new TakeoverJournalJson(i, jA8X2, jA8X, zA8G, listA0P, c2hx);
            }
            if (iA8N == 0) {
                jA8X2 = c9j4A55.A8X(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                jA8X = c9j4A55.A8X(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                zA8G = c9j4A55.A8G(c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 3);
                i |= 8;
            }
        }
    }

    static {
        TakeoverJournalJson$$serializer takeoverJournalJson$$serializer = new TakeoverJournalJson$$serializer();
        INSTANCE = takeoverJournalJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.localbrowser.TakeoverJournalJson", takeoverJournalJson$$serializer, 4);
        c9iKA1C.A08("started_at_ms", false);
        c9iKA1C.A08("ended_at_ms", false);
        c9iKA1C.A08("complete", false);
        c9iKA1C.A08(AuraCvmPushReplayStore.ENTRIES_KEY, false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = TakeoverJournalJson.$childSerializers;
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c9j1, c9j1, C07839ix.A00, C3cH.A12(f0cArr)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, TakeoverJournalJson takeoverJournalJson) {
        AnonymousClass003.A0u(interfaceC07789is, takeoverJournalJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        TakeoverJournalJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(takeoverJournalJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
