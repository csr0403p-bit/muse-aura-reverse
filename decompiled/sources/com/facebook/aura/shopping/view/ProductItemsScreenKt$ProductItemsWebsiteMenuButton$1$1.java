package com.facebook.aura.shopping.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ProductItemsScreenKt$ProductItemsWebsiteMenuButton$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ String $website;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductItemsScreenKt$ProductItemsWebsiteMenuButton$1$1(AbstractC3358CGz abstractC3358CGz, Context context, AuraNavigator auraNavigator, String str) {
        super(0);
        this.$userSession = abstractC3358CGz;
        this.$context = context;
        this.$navigator = auraNavigator;
        this.$website = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        new ProductActionHandler(this.$userSession, this.$context, this.$navigator).openUrl(this.$website);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
