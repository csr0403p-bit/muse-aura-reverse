package com.facebook.aura.deeplink;

import X.AbstractC0878AGe;
import X.AbstractC10406HbQ;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06977mk;
import X.C3cG;
import X.C60Q;
import X.C7381Etf;
import X.C7384Etj;
import X.C7mA;
import X.HxE;
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.conversation.widget.api.InboundLinkOpener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class AuraDeeplinkOpenerVerifier {
    public static final int $stable = 0;
    public static final AuraDeeplinkOpenerVerifier INSTANCE = new AuraDeeplinkOpenerVerifier();
    public static final List<HxE<C06977mk, InboundLinkOpener>> trustedOpeners;

    public final class VerifiedOpener {
        public static final int $stable = 0;
        public final InboundLinkOpener opener;
        public final String sourceApplication;

        public VerifiedOpener(InboundLinkOpener inboundLinkOpener, String str) {
            C7384Etj.A0Y(inboundLinkOpener, 0);
            this.opener = inboundLinkOpener;
            this.sourceApplication = str;
        }

        public final InboundLinkOpener getOpener() {
            return this.opener;
        }

        public final String getSourceApplication() {
            return this.sourceApplication;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C7381Etf c7381Etf = AbstractC10406HbQ.A2f;
        InboundLinkOpener inboundLinkOpener = InboundLinkOpener.FACEBOOK;
        List listAsList = Arrays.asList(C3cG.A0r(c7381Etf, inboundLinkOpener), C3cG.A0r(AbstractC10406HbQ.A40, inboundLinkOpener), C3cG.A0r(AbstractC10406HbQ.A6o, InboundLinkOpener.INSTAGRAM));
        ArrayList arrayListA0i = AnonymousClass003.A0i(listAsList);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            HxE hxEA10 = C60Q.A10(it);
            AnonymousClass002.A1J(INSTANCE.trustedCaller((C7381Etf) hxEA10.first), hxEA10.second, arrayListA0i);
        }
        trustedOpeners = arrayListA0i;
    }

    private final C06977mk trustedCaller(C7381Etf c7381Etf) {
        C7mA c7mA = new C7mA();
        c7mA.A01 = c7381Etf;
        c7mA.A00 |= 64;
        return c7mA.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final VerifiedOpener verifiedOpener(Context context, Intent intent) {
        AnonymousClass003.A0u(context, intent);
        Iterator<HxE<C06977mk, InboundLinkOpener>> it = trustedOpeners.iterator();
        while (it.hasNext()) {
            HxE hxEA10 = C60Q.A10(it);
            C06977mk c06977mk = (C06977mk) hxEA10.first;
            InboundLinkOpener inboundLinkOpener = (InboundLinkOpener) hxEA10.second;
            try {
                List<String> list = C06977mk.A00(context, intent, c06977mk).A03;
                C7384Etj.A0U(list);
                return new VerifiedOpener(inboundLinkOpener, (String) AbstractC0878AGe.A0K(list));
            } catch (SecurityException unused) {
            }
        }
        return null;
    }
}
