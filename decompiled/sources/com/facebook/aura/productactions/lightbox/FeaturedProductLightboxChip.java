package com.facebook.aura.productactions.lightbox;

import X.AKO;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import com.facebook.aura.file.view.api.ContentViewerPageAccessory;
import com.facebook.aura.file.view.api.ContentViewerPageAccessoryRenderer;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.session.LocalUserSessionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class FeaturedProductLightboxChip implements ContentViewerPageAccessoryRenderer {
    public static final FeaturedProductLightboxChip INSTANCE = new FeaturedProductLightboxChip();

    @Override // com.facebook.aura.file.view.api.ContentViewerPageAccessoryRenderer
    public void Content(final ContentViewerPageAccessory contentViewerPageAccessory, final BRg bRg, BFM bfm, final int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> g0v;
        final FeaturedProductLightboxAccessory featuredProductLightboxAccessory;
        boolean zA1b = AnonymousClass004.A1b(contentViewerPageAccessory, bRg);
        bfm.AgG(-1062670103);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, contentViewerPageAccessory) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (!AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            bfm.Afo();
        } else {
            if (!(contentViewerPageAccessory instanceof FeaturedProductLightboxAccessory) || (featuredProductLightboxAccessory = (FeaturedProductLightboxAccessory) contentViewerPageAccessory) == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    g0v = new G0V() { // from class: com.facebook.aura.productactions.lightbox.FeaturedProductLightboxChip$$ExternalSyntheticLambda0
                        @Override // X.G0V
                        public final Object invoke(Object obj, Object obj2) {
                            this.f$0.Content(contentViewerPageAccessory, bRg, (BFM) obj, AnonymousClass011.A00(i));
                            return Unit.INSTANCE;
                        }
                    };
                    bBbAAc.A06 = g0v;
                }
                return;
            }
            BBI bbi = (BBI) bfm;
            final AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            final AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
            boolean zA1O = C3cH.A1O(bfm, featuredProductLightboxAccessory, auraNavigatorA05, abstractC3358CGzA06);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new Function0() { // from class: com.facebook.aura.productactions.lightbox.FeaturedProductLightboxChip$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        FeaturedProductLightboxAccessoryKt.open(featuredProductLightboxAccessory, auraNavigatorA05, abstractC3358CGzA06);
                        return Unit.INSTANCE;
                    }
                };
                BBI.A0O(bbi, objAaT);
            }
            FeaturedProductLightboxChipKt.FeaturedProductChip(featuredProductLightboxAccessory, (Function0) objAaT, bRg, bfm, (iA0d << 3) & 896, zA1b ? 1 : 0);
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            g0v = new G0V() { // from class: com.facebook.aura.productactions.lightbox.FeaturedProductLightboxChip$$ExternalSyntheticLambda2
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    this.f$0.Content(contentViewerPageAccessory, bRg, (BFM) obj, AnonymousClass011.A00(i));
                    return Unit.INSTANCE;
                }
            };
            bBbAAc.A06 = g0v;
        }
    }

    @Override // com.facebook.aura.file.view.api.ContentViewerPageAccessoryRenderer
    public boolean owns(ContentViewerPageAccessory contentViewerPageAccessory) {
        C7384Etj.A0Y(contentViewerPageAccessory, 0);
        return contentViewerPageAccessory instanceof FeaturedProductLightboxAccessory;
    }

    /* renamed from: $r8$lambda$9wWAFj2f86ybinVYnmnTJ-ecMdg, reason: not valid java name */
    public static /* synthetic */ Unit m1874$r8$lambda$9wWAFj2f86ybinVYnmnTJecMdg(FeaturedProductLightboxAccessory featuredProductLightboxAccessory, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz) {
        FeaturedProductLightboxAccessoryKt.open(featuredProductLightboxAccessory, auraNavigator, abstractC3358CGz);
        return Unit.INSTANCE;
    }

    public static final Unit Content$lambda$0(FeaturedProductLightboxChip featuredProductLightboxChip, ContentViewerPageAccessory contentViewerPageAccessory, BRg bRg, int i, BFM bfm, int i2) {
        featuredProductLightboxChip.Content(contentViewerPageAccessory, bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit Content$lambda$1$0(FeaturedProductLightboxAccessory featuredProductLightboxAccessory, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz) {
        FeaturedProductLightboxAccessoryKt.open(featuredProductLightboxAccessory, auraNavigator, abstractC3358CGz);
        return Unit.INSTANCE;
    }

    public static final Unit Content$lambda$2(FeaturedProductLightboxChip featuredProductLightboxChip, ContentViewerPageAccessory contentViewerPageAccessory, BRg bRg, int i, BFM bfm, int i2) {
        featuredProductLightboxChip.Content(contentViewerPageAccessory, bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }
}
