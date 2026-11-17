package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchAnimatedBotAvatarKt$HatchAnimatedBotAvatar$fillsViewport$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ Function0<Float> $fillFraction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAnimatedBotAvatarKt$HatchAnimatedBotAvatar$fillsViewport$2$1(Function0<Float> function0) {
        super(0);
        this.$fillFraction = function0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(AnonymousClass002.A1N((AnonymousClass003.A04(this.$fillFraction) > 0.0f ? 1 : (AnonymousClass003.A04(this.$fillFraction) == 0.0f ? 0 : -1))));
    }
}
