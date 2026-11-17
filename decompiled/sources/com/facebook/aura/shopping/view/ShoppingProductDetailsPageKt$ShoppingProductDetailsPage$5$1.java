package com.facebook.aura.shopping.view;

import X.AnonymousClass003;
import X.C7438Evz;
import X.G0V;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$5$1 extends C7438Evz implements G0V<String, String, Unit> {
    public ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$5$1(Object obj) {
        super(2, obj, ShoppingProductDetailsViewModel.class, "onSelect", "onSelect(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        ((ShoppingProductDetailsViewModel) this.receiver).onSelect(str, str2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }
}
