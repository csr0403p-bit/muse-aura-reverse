package com.facebook.aura.productactions.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.ResultEventBus;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.productactions.impl.ShoppingProductMediaActions$rememberLightboxActions$1$1", f = "ShoppingProductMediaActions.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ShoppingProductMediaActions$rememberLightboxActions$1$1 extends AbstractC07127nr implements G0V<String, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ResultEventBus $resultBus;
    public final /* synthetic */ ProductDetailsActionsViewModel $viewModel;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductMediaActions$rememberLightboxActions$1$1(ProductDetailsActionsViewModel productDetailsActionsViewModel, AuraNavigator auraNavigator, ResultEventBus resultEventBus, HtJ<? super ShoppingProductMediaActions$rememberLightboxActions$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = productDetailsActionsViewModel;
        this.$navigator = auraNavigator;
        this.$resultBus = resultEventBus;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        ShoppingProductMediaActions$rememberLightboxActions$1$1 shoppingProductMediaActions$rememberLightboxActions$1$1 = new ShoppingProductMediaActions$rememberLightboxActions$1$1(this.$viewModel, this.$navigator, this.$resultBus, htJ);
        shoppingProductMediaActions$rememberLightboxActions$1$1.L$0 = obj;
        return shoppingProductMediaActions$rememberLightboxActions$1$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$viewModel.sendReply(this.$navigator, this.$resultBus, str);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(String str, HtJ<? super Unit> htJ) {
        return ((ShoppingProductMediaActions$rememberLightboxActions$1$1) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
