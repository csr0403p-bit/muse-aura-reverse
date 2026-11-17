package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchAnimatedBotAvatarKt$animateAvatarVideoAlpha$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnFadedIn$delegate;
    public final /* synthetic */ boolean $deferCompletion;
    public final /* synthetic */ C1BO<Boolean> $fadedIn$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAnimatedBotAvatarKt$animateAvatarVideoAlpha$1$1(boolean z, C1BO<Boolean> c1bo, C1BO<? extends Function0<Unit>> c1bo2) {
        super(1);
        this.$deferCompletion = z;
        this.$fadedIn$delegate = c1bo;
        this.$currentOnFadedIn$delegate = c1bo2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (C1BO.A0F(this.$fadedIn$delegate) && !this.$deferCompletion) {
            C1BO.A0D(this.$currentOnFadedIn$delegate);
        }
        return new C78g() { // from class: com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$animateAvatarVideoAlpha$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
