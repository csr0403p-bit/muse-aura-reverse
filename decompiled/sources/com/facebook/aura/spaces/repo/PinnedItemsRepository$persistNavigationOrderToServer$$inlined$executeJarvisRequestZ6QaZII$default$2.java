package com.facebook.aura.spaces.repo;

import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.spaces.repo.PinnedItemsRepository$persistNavigationOrderToServer$$inlined$executeJarvisRequest-Z6QaZII$default$2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class PinnedItemsRepository$persistNavigationOrderToServer$$inlined$executeJarvisRequestZ6QaZII$default$2 extends AbstractC7559F3s implements Function0<C9hr<NavigationTabOrderResponseJson>> {
    public static final PinnedItemsRepository$persistNavigationOrderToServer$$inlined$executeJarvisRequestZ6QaZII$default$2 INSTANCE = new PinnedItemsRepository$persistNavigationOrderToServer$$inlined$executeJarvisRequestZ6QaZII$default$2();

    public PinnedItemsRepository$persistNavigationOrderToServer$$inlined$executeJarvisRequestZ6QaZII$default$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<NavigationTabOrderResponseJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = NavigationTabOrderResponseJson.$childSerializers;
        return NavigationTabOrderResponseJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<NavigationTabOrderResponseJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = NavigationTabOrderResponseJson.$childSerializers;
        return NavigationTabOrderResponseJson$$serializer.INSTANCE;
    }
}
