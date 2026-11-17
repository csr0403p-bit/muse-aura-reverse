package com.facebook.aura.explore.repo;

import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.explore.repo.IdeaCardsDataSource$performLoadNext$2$invokeSuspend$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class IdeaCardsDataSource$performLoadNext$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<IdeaCardsResponseJson>> {
    public static final IdeaCardsDataSource$performLoadNext$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new IdeaCardsDataSource$performLoadNext$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1();

    public IdeaCardsDataSource$performLoadNext$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<IdeaCardsResponseJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = IdeaCardsResponseJson.$childSerializers;
        return IdeaCardsResponseJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<IdeaCardsResponseJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = IdeaCardsResponseJson.$childSerializers;
        return IdeaCardsResponseJson$$serializer.INSTANCE;
    }
}
