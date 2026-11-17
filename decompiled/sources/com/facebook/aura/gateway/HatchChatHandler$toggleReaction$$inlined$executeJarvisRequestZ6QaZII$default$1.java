package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.gateway.HatchChatHandler$toggleReaction$$inlined$executeJarvisRequest-Z6QaZII$default$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class HatchChatHandler$toggleReaction$$inlined$executeJarvisRequestZ6QaZII$default$1 extends AbstractC7559F3s implements Function0<C9hr<ToggleReactionRequestJson>> {
    public static final HatchChatHandler$toggleReaction$$inlined$executeJarvisRequestZ6QaZII$default$1 INSTANCE = new HatchChatHandler$toggleReaction$$inlined$executeJarvisRequestZ6QaZII$default$1();

    public HatchChatHandler$toggleReaction$$inlined$executeJarvisRequestZ6QaZII$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<ToggleReactionRequestJson> invoke() {
        return ToggleReactionRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<ToggleReactionRequestJson> invoke() {
        return ToggleReactionRequestJson$$serializer.INSTANCE;
    }
}
