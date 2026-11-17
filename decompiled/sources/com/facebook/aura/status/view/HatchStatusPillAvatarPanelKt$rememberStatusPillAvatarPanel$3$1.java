package com.facebook.aura.status.view;

import X.AXN;
import X.AbstractC7559F3s;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillAvatarPanelKt$rememberStatusPillAvatarPanel$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ StatusPillAvatarPanel $panel;
    public final /* synthetic */ Object $panelOwner;
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;
    public final /* synthetic */ float $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillAvatarPanelKt$rememberStatusPillAvatarPanel$3$1(HatchStatusPillMetrics hatchStatusPillMetrics, Object obj, float f, AXN axn, StatusPillAvatarPanel statusPillAvatarPanel) {
        super(0);
        this.$pillMetrics = hatchStatusPillMetrics;
        this.$panelOwner = obj;
        this.$progress = f;
        this.$density = axn;
        this.$panel = statusPillAvatarPanel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$pillMetrics.avatarPanelOwner$delegate.getValue() == null) {
            this.$pillMetrics.setAvatarPanelOwner(this.$panelOwner);
        }
        if (this.$pillMetrics.avatarPanelOwner$delegate.getValue() == this.$panelOwner) {
            this.$pillMetrics.setAvatarPanelProgress(this.$progress);
            this.$pillMetrics.setAvatarPanelBottomPx(this.$density.Ah4(this.$panel.bottom));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
