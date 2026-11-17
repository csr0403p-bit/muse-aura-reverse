package com.facebook.aura.productactions.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BLG;
import X.C10571Hud;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.productactions.impl.ProductMenuSaveAction;
import com.facebook.aura.shopping.model.ShoppingSaveTarget;
import com.facebook.aura.shopping.repo.HatchSavedProductsRepository;
import com.facebook.aura.shopping.repo.SavedProductState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.productactions.impl.ProductMenuSaveAction$fetchJob$1", f = "ProductMenuSaveAction.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ProductMenuSaveAction$fetchJob$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ ProductMenuSaveAction this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductMenuSaveAction$fetchJob$1(ProductMenuSaveAction productMenuSaveAction, HtJ<? super ProductMenuSaveAction$fetchJob$1> htJ) {
        super(2, htJ);
        this.this$0 = productMenuSaveAction;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ProductMenuSaveAction$fetchJob$1(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new ProductMenuSaveAction$fetchJob$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM2013fetchState0E7RQCE;
        ProductMenuSaveAction.State value;
        ProductMenuSaveAction.State ready;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ProductMenuSaveAction productMenuSaveAction = this.this$0;
            HatchSavedProductsRepository hatchSavedProductsRepository = productMenuSaveAction.repository;
            ShoppingSaveTarget shoppingSaveTarget = productMenuSaveAction.target;
            String str = productMenuSaveAction.context.sessionId;
            this.label = 1;
            objM2013fetchState0E7RQCE = hatchSavedProductsRepository.m2013fetchState0E7RQCE(shoppingSaveTarget, str, this);
            if (objM2013fetchState0E7RQCE == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM2013fetchState0E7RQCE = AnonymousClass001.A0q(obj);
        }
        if (objM2013fetchState0E7RQCE instanceof C10571Hud) {
            objM2013fetchState0E7RQCE = null;
        }
        SavedProductState savedProductState = (SavedProductState) objM2013fetchState0E7RQCE;
        BLG<ProductMenuSaveAction.State> blg = this.this$0.state;
        do {
            value = blg.getValue();
            ready = value;
            boolean z = ready instanceof ProductMenuSaveAction.State.Ready;
            if (!z || !((ProductMenuSaveAction.State.Ready) ready).inFlight) {
                if (savedProductState != null) {
                    ready = new ProductMenuSaveAction.State.Ready(savedProductState, false);
                } else if (!z) {
                    ready = ProductMenuSaveAction.State.Unavailable.INSTANCE;
                }
            }
        } while (!blg.A6e(value, ready));
        return Unit.INSTANCE;
    }
}
