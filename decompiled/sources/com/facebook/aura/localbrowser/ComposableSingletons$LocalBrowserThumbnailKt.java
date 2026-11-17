package com.facebook.aura.localbrowser;

import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.B1U;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ComposableSingletons$LocalBrowserThumbnailKt {
    public static final ComposableSingletons$LocalBrowserThumbnailKt INSTANCE = new ComposableSingletons$LocalBrowserThumbnailKt();
    public static G0W<BRg, BFM, Integer, Unit> lambda$2103289879 = B1U.A01(new G0W() { // from class: com.facebook.aura.localbrowser.ComposableSingletons$LocalBrowserThumbnailKt$$ExternalSyntheticLambda0
        @Override // X.G0W
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$LocalBrowserThumbnailKt.lambda_2103289879$lambda$0((BRg) obj, (BFM) obj2, AnonymousClass001.A0F(obj3));
        }
    }, 2103289879);

    public static final Unit lambda_2103289879$lambda$0(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A0d(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            LocalBrowserThumbnailKt.LocalBrowserLoadingPreview(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ca7), bRg, bfm, (i << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public final G0W<BRg, BFM, Integer, Unit> getLambda$2103289879$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser() {
        return lambda$2103289879;
    }
}
