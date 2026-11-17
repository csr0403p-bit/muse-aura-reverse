package com.facebook.aura.productactions.lightbox;

import X.AKQ;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06I;
import X.C1515AkP;
import X.C1BO;
import X.C1er;
import X.C2VU;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.file.view.api.ContentViewerBottomActionsRenderer;
import com.facebook.aura.navigation.LocalResultEventBus;
import com.facebook.aura.navigation.ResultEventBus;
import com.facebook.aura.navigation.key.ContentViewerBottomActions;
import com.facebook.aura.productactions.api.ProductMediaAction;
import com.facebook.aura.productactions.api.ProductMediaActionContext;
import com.facebook.aura.productactions.api.ProductMediaActionSize;
import com.facebook.aura.productactions.api.ProductMediaActions;
import com.facebook.aura.productactions.api.ProductMediaActionsKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ProductMediaLightboxActions implements ContentViewerBottomActionsRenderer {
    public static final ProductMediaLightboxActions INSTANCE = new ProductMediaLightboxActions();

    public static final Unit Content$lambda$4$0(ResultEventBus resultEventBus, ContentViewerBottomActions contentViewerBottomActions, C1BO c1bo, String str) {
        C7384Etj.A0Y(str, 3);
        resultEventBus.sendResult(ProductMediaActionsKt.productMediaLightboxReplyKey(contentViewerBottomActions.ownerId), str);
        C1BO.A0D(c1bo);
        return Unit.INSTANCE;
    }

    @Override // com.facebook.aura.file.view.api.ContentViewerBottomActionsRenderer
    public boolean owns(ContentViewerBottomActions contentViewerBottomActions) {
        C7384Etj.A0Y(contentViewerBottomActions, 0);
        return AnonymousClass005.A1a(contentViewerBottomActions.ownerId, ProductMediaActionsKt.ProductMediaLightboxOwnerPrefix);
    }

    @Override // com.facebook.aura.file.view.api.ContentViewerBottomActionsRenderer
    public void Content(final ContentViewerBottomActions contentViewerBottomActions, final Function0<Unit> function0, final BRg bRg, BFM bfm, final int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> g0v;
        AnonymousClass005.A0x(contentViewerBottomActions, function0, bRg);
        bfm.AgG(2079221988);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, contentViewerBottomActions) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            boolean zA65 = bfm.A65(contentViewerBottomActions.actionIds);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = ProductMediaActions.INSTANCE.withIds(contentViewerBottomActions.actionIds);
                bfm.Ai0(objAaT);
            }
            List list = (List) objAaT;
            String str = contentViewerBottomActions.subjectId;
            if (str == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    g0v = new G0V() { // from class: com.facebook.aura.productactions.lightbox.ProductMediaLightboxActions$$ExternalSyntheticLambda0
                        @Override // X.G0V
                        public final Object invoke(Object obj, Object obj2) {
                            this.f$0.Content(contentViewerBottomActions, function0, bRg, (BFM) obj, AnonymousClass011.A02(obj2, i));
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else if (list.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    g0v = new G0V() { // from class: com.facebook.aura.productactions.lightbox.ProductMediaLightboxActions$$ExternalSyntheticLambda1
                        @Override // X.G0V
                        public final Object invoke(Object obj, Object obj2) {
                            this.f$0.Content(contentViewerBottomActions, function0, bRg, (BFM) obj, AnonymousClass011.A02(obj2, i));
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                final ResultEventBus current = LocalResultEventBus.INSTANCE.getCurrent(bfm, 6);
                final MutableState mutableStateA00 = C1er.A00(bfm, function0);
                boolean zA1K = AnonymousClass003.A1K(bfm, contentViewerBottomActions, current);
                Object objAaT2 = bfm.AaT();
                if (zA1K || objAaT2 == C78N.A00) {
                    objAaT2 = new ProductMediaActionContext(str, ProductMediaActionSize.FullWidth, HatchScreen.PRODUCT_DETAIL, contentViewerBottomActions.analyticsMetadata, new G0U() { // from class: com.facebook.aura.productactions.lightbox.ProductMediaLightboxActions$$ExternalSyntheticLambda2
                        @Override // X.G0U
                        public final Object invoke(Object obj) {
                            return ProductMediaLightboxActions.Content$lambda$4$0(current, contentViewerBottomActions, mutableStateA00, (String) obj);
                        }
                    });
                    BBI.A0T(bfm, objAaT2);
                }
                ProductMediaActionContext productMediaActionContext = (ProductMediaActionContext) objAaT2;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(AuraDimensKt.SpacingXsmall), bfm, C2VU.A00, 48);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRg);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                Iterator itA0w = AnonymousClass001.A0w(bfm, list, 761966455);
                while (itA0w.hasNext()) {
                    ((ProductMediaAction) itA0w.next()).Content(productMediaActionContext, BRg.A00, bfm, 48);
                }
                AnonymousClass003.A0q(bbi);
            }
            bBbAAc.A06 = g0v;
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            g0v = new G0V() { // from class: com.facebook.aura.productactions.lightbox.ProductMediaLightboxActions$$ExternalSyntheticLambda3
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    this.f$0.Content(contentViewerBottomActions, function0, bRg, (BFM) obj, AnonymousClass011.A02(obj2, i));
                    return Unit.INSTANCE;
                }
            };
            bBbAAc.A06 = g0v;
        }
    }

    public static final Unit Content$lambda$1(ProductMediaLightboxActions productMediaLightboxActions, ContentViewerBottomActions contentViewerBottomActions, Function0 function0, BRg bRg, int i, BFM bfm, int i2) {
        productMediaLightboxActions.Content(contentViewerBottomActions, function0, bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit Content$lambda$2(ProductMediaLightboxActions productMediaLightboxActions, ContentViewerBottomActions contentViewerBottomActions, Function0 function0, BRg bRg, int i, BFM bfm, int i2) {
        productMediaLightboxActions.Content(contentViewerBottomActions, function0, bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit Content$lambda$6(ProductMediaLightboxActions productMediaLightboxActions, ContentViewerBottomActions contentViewerBottomActions, Function0 function0, BRg bRg, int i, BFM bfm, int i2) {
        productMediaLightboxActions.Content(contentViewerBottomActions, function0, bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }
}
