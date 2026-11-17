package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass004;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$LocalBrowserTaskViewerKt {
    public static final ComposableSingletons$LocalBrowserTaskViewerKt INSTANCE = new ComposableSingletons$LocalBrowserTaskViewerKt();
    public static G0W<BRg, BFM, Integer, Unit> lambda$913058134 = B1V.A01(new G0W() { // from class: com.facebook.aura.localbrowser.ComposableSingletons$LocalBrowserTaskViewerKt$$ExternalSyntheticLambda0
        @Override // X.G0W
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$LocalBrowserTaskViewerKt.lambda_913058134$lambda$0((BRg) obj, (BFM) obj2, AnonymousClass001.A0F(obj3));
        }
    }, 913058134, false);

    public static final Unit lambda_913058134$lambda$0(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A0d(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            LocalBrowserTaskViewerKt.LocalBrowserCardPlaceholder(bRg, bfm, i & 14, 0);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public final G0W<BRg, BFM, Integer, Unit> getLambda$913058134$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser() {
        return lambda$913058134;
    }
}
