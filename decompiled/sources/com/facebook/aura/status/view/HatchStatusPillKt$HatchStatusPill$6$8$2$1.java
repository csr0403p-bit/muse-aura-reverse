package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C1DG;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$HatchStatusPill$6$8$2$1 extends AbstractC7559F3s implements Function0<C1DG> {
    public final /* synthetic */ float $avatarOffsetY;
    public final /* synthetic */ StatusPillAvatarPanel $panel;
    public final /* synthetic */ Function0<C1DG> $panelMediaOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$HatchStatusPill$6$8$2$1(StatusPillAvatarPanel statusPillAvatarPanel, float f, Function0<C1DG> function0) {
        super(0);
        this.$panel = statusPillAvatarPanel;
        this.$avatarOffsetY = f;
        this.$panelMediaOffset = function0;
    }

    /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
    public final float m2238invokeD9Ej5fM() {
        return this.$panel.layerTop + this.$avatarOffsetY + this.$panelMediaOffset.invoke().A00;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C1DG invoke() {
        return new C1DG(m2238invokeD9Ej5fM());
    }
}
