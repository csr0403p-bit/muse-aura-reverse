package com.facebook.aura.appupdate;

import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$controller$1$1 extends AbstractC7559F3s implements Function0<AuraPlayUpdatePrompts> {
    public final /* synthetic */ C1BO<AuraPlayUpdatePrompts> $prompts;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$controller$1$1(C1BO<AuraPlayUpdatePrompts> c1bo) {
        super(0);
        this.$prompts = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraPlayUpdatePrompts invoke() {
        return this.$prompts.getValue();
    }
}
