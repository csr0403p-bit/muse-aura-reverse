package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C1DG;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$HatchStatusPill$3$2$3$1$1 extends AbstractC7559F3s implements Function0<C1DG> {
    public final /* synthetic */ StatusPillChromeMotion $chromeMotion;
    public final /* synthetic */ StatusPillAvatarPanel $panel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$HatchStatusPill$3$2$3$1$1(StatusPillAvatarPanel statusPillAvatarPanel, StatusPillChromeMotion statusPillChromeMotion) {
        super(0);
        this.$panel = statusPillAvatarPanel;
        this.$chromeMotion = statusPillChromeMotion;
    }

    /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
    public final float m2236invokeD9Ej5fM() {
        return this.$panel.layerTop + this.$chromeMotion.topPadding;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C1DG invoke() {
        return new C1DG(m2236invokeD9Ej5fM());
    }
}
