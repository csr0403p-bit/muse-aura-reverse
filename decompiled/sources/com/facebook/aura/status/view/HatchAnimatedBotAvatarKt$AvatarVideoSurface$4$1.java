package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchAnimatedBotAvatarKt$AvatarVideoSurface$4$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Function0<Unit> $resumePlayback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAnimatedBotAvatarKt$AvatarVideoSurface$4$1(Function0<Unit> function0) {
        super(1);
        this.$resumePlayback = function0;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$resumePlayback.invoke();
        return new C78g() { // from class: com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$AvatarVideoSurface$4$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
