package com.facebook.aura.tryon;

import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.C20Q;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.G0V;
import X.GDB;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.productactions.api.ProductMediaAction;
import com.facebook.aura.productactions.api.ProductMediaActionContext;
import com.facebook.aura.productactions.api.ProductMediaActionInput;
import com.facebook.aura.productactions.api.ProductMediaActionSize;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class TryOnMediaAction implements ProductMediaAction {
    public static final TryOnMediaAction INSTANCE = new TryOnMediaAction();
    public static final String id = "try_on";

    @Override // com.facebook.aura.productactions.api.ProductMediaAction
    public void Content(final ProductMediaActionContext productMediaActionContext, final BRg bRg, BFM bfm, final int i) {
        float f;
        C1822Arm c1822ArmA0D;
        float f2;
        float f3;
        int i2;
        boolean zA1a = AnonymousClass002.A1a(productMediaActionContext, bRg);
        bfm.AgG(1754152968);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, productMediaActionContext) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            final String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120626);
            boolean zA1V = C8j3.A1V(bfm, strA01, AnonymousClass001.A1M(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new Function0() { // from class: com.facebook.aura.tryon.TryOnMediaAction$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TryOnMediaAction.Content$lambda$0$0(productMediaActionContext, strA01);
                    }
                };
                BBI.A0T(bfm, objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(bRg, HatchOrigin.SHOPPING, HatchSurface.SHOPPING, null, productMediaActionContext.analyticsScreen, HatchComponent.TRY_ON_BUTTON, productMediaActionContext.productId, productMediaActionContext.analyticsMetadata, null, 500L, 0.0f, null, null, null);
            int iOrdinal = productMediaActionContext.size.ordinal();
            if (iOrdinal == 0) {
                bfm.AgE(2113851116);
                f = 18.0f;
                c1822ArmA0D = AuraTheme.INSTANCE.getTypography(bfm, 6).subheadlineMedium;
                f2 = AuraDimensKt.SpacingXsmall;
                f3 = AuraDimensKt.SpacingSmall;
                i2 = 48;
            } else {
                if (iOrdinal != zA1a) {
                    throw AnonymousClass005.A0k(bfm, 2113849268);
                }
                bfm.AgE(2113863181);
                f = 20.0f;
                c1822ArmA0D = C60Q.A0D(bfm, AuraTheme.INSTANCE);
                f2 = 11.0f;
                f3 = AuraDimensKt.SpacingMedium;
                bRgHatchImpression = AnonymousClass001.A0R(bRgHatchImpression);
                i2 = 3120;
            }
            TryOnMediaActionKt.m2310TryOnButton_2Pl_rw(strA01, f, c1822ArmA0D, f2, f3, function0, bRgHatchImpression, bfm, i2, 0);
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.tryon.TryOnMediaAction$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    this.f$0.Content(productMediaActionContext, bRg, (BFM) obj, AnonymousClass011.A00(i));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // com.facebook.aura.productactions.api.ProductMediaAction
    public C20Q<Boolean> availability(C20Q<ProductMediaActionInput> c20q) {
        C7384Etj.A0Y(c20q, 0);
        return GDB.A01(new TryOnMediaAction$availability$$inlined$map$1(c20q));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductMediaActionSize.values().length];
            try {
                AnonymousClass002.A13(ProductMediaActionSize.Compact, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ProductMediaActionSize.FullWidth, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Unit Content$lambda$0$0(ProductMediaActionContext productMediaActionContext, String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SHOPPING, null, productMediaActionContext.analyticsScreen, HatchComponent.TRY_ON_BUTTON, productMediaActionContext.productId, productMediaActionContext.analyticsMetadata, null);
        productMediaActionContext.sendReply.invoke(str);
        return Unit.INSTANCE;
    }

    @Override // com.facebook.aura.productactions.api.ProductMediaAction
    public String getId() {
        return id;
    }

    public static final Unit Content$lambda$1(TryOnMediaAction tryOnMediaAction, ProductMediaActionContext productMediaActionContext, BRg bRg, int i, BFM bfm, int i2) {
        tryOnMediaAction.Content(productMediaActionContext, bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }
}
