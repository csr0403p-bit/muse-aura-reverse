package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C1DG;
import com.facebook.aura.header.api.AvatarFullScreen;
import com.facebook.aura.header.view.HatchExpandedAvatarPanelKt;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAvatarPanelViewportKt$panelMediaOffset$1$1 extends AbstractC7559F3s implements Function0<C1DG> {
    public final /* synthetic */ AvatarFullScreen $fullScreen;
    public final /* synthetic */ HatchStatusPillMetrics $metrics;
    public final /* synthetic */ C1BO<Float> $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarPanelViewportKt$panelMediaOffset$1$1(AvatarFullScreen avatarFullScreen, HatchStatusPillMetrics hatchStatusPillMetrics, C1BO<Float> c1bo) {
        super(0);
        this.$fullScreen = avatarFullScreen;
        this.$metrics = hatchStatusPillMetrics;
        this.$progress = c1bo;
    }

    /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
    public final float m2226invokeD9Ej5fM() {
        AvatarFullScreen avatarFullScreen = this.$fullScreen;
        if (avatarFullScreen != null && HatchAvatarPanelViewportKt.isFromBubble(avatarFullScreen, this.$metrics)) {
            return 0.0f;
        }
        float fA01 = HatchExpandedAvatarPanelKt.ExpandedPanelMediaTopOffset * C1BO.A01(this.$progress);
        AvatarFullScreen avatarFullScreen2 = this.$fullScreen;
        return fA01 * (1.0f - (avatarFullScreen2 != null ? avatarFullScreen2.getProgress() : 0.0f));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C1DG invoke() {
        return new C1DG(m2226invokeD9Ej5fM());
    }
}
