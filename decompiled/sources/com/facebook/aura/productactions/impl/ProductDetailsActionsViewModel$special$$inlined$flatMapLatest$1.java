package com.facebook.aura.productactions.impl;

import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C20Q;
import X.C20Y;
import X.C20Z;
import X.C3pU;
import X.EnumC10460Hji;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.productactions.api.ProductMediaAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.productactions.impl.ProductDetailsActionsViewModel$special$$inlined$flatMapLatest$1", f = "ProductDetailsActionsViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ProductDetailsActionsViewModel$special$$inlined$flatMapLatest$1 extends AbstractC07127nr implements G0W<C20Z<? super AHD<? extends String>>, Boolean, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ ProductDetailsActionsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsActionsViewModel$special$$inlined$flatMapLatest$1(HtJ htJ, ProductDetailsActionsViewModel productDetailsActionsViewModel) {
        super(3, htJ);
        this.this$0 = productDetailsActionsViewModel;
    }

    @Override // X.G0W
    public final Object invoke(C20Z<? super AHD<? extends String>> c20z, Boolean bool, HtJ<? super Unit> htJ) {
        ProductDetailsActionsViewModel$special$$inlined$flatMapLatest$1 productDetailsActionsViewModel$special$$inlined$flatMapLatest$1 = new ProductDetailsActionsViewModel$special$$inlined$flatMapLatest$1(htJ, this.this$0);
        productDetailsActionsViewModel$special$$inlined$flatMapLatest$1.L$0 = c20z;
        productDetailsActionsViewModel$special$$inlined$flatMapLatest$1.L$1 = bool;
        return productDetailsActionsViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C20Q c20y;
        C20Z c20z = (C20Z) this.L$0;
        Object obj2 = this.L$1;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!AnonymousClass001.A1X(obj2) || this.this$0.mediaActions.isEmpty()) {
                c20y = new C20Y(AHI.A01);
            } else {
                List<ProductMediaAction> list = this.this$0.mediaActions;
                ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                for (ProductMediaAction productMediaAction : list) {
                    arrayListA0i.add(new ProductDetailsActionsViewModel$mediaActionIds$lambda$1$0$$inlined$map$1(productMediaAction.availability(this.this$0.mediaActionInputs), productMediaAction));
                }
                c20y = new ProductDetailsActionsViewModel$mediaActionIds$lambda$1$$inlined$combine$1((C20Q[]) AbstractC0878AGe.A0X(arrayListA0i).toArray(new C20Q[0]));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (C3pU.A01(this, c20y, c20z) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }
}
