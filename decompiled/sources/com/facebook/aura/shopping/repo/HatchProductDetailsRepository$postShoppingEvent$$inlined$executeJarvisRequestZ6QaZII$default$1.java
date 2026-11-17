package com.facebook.aura.shopping.repo;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.shopping.repo.HatchProductDetailsRepository$postShoppingEvent$$inlined$executeJarvisRequest-Z6QaZII$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class HatchProductDetailsRepository$postShoppingEvent$$inlined$executeJarvisRequestZ6QaZII$default$1 extends AbstractC7559F3s implements Function0<C9hr<ShoppingEventRequestJson>> {
    public static final HatchProductDetailsRepository$postShoppingEvent$$inlined$executeJarvisRequestZ6QaZII$default$1 INSTANCE = new HatchProductDetailsRepository$postShoppingEvent$$inlined$executeJarvisRequestZ6QaZII$default$1();

    public HatchProductDetailsRepository$postShoppingEvent$$inlined$executeJarvisRequestZ6QaZII$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<ShoppingEventRequestJson> invoke() {
        return ShoppingEventRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<ShoppingEventRequestJson> invoke() {
        return ShoppingEventRequestJson$$serializer.INSTANCE;
    }
}
