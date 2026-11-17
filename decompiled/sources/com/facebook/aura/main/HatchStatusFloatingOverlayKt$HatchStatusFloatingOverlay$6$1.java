package com.facebook.aura.main;

import X.AbstractC7559F3s;
import com.facebook.aura.header.api.AvatarTakeover;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AvatarTakeover $avatarTakeover;
    public final /* synthetic */ boolean $canProvideAvatar;
    public final /* synthetic */ boolean $isAvatarTakenOver;
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;
    public final /* synthetic */ boolean $reportsPillBottom;
    public final /* synthetic */ Object $takeoverAvatarOwner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$6$1(AvatarTakeover avatarTakeover, Object obj, boolean z, boolean z2, boolean z3, HatchStatusPillMetrics hatchStatusPillMetrics) {
        super(0);
        this.$avatarTakeover = avatarTakeover;
        this.$takeoverAvatarOwner = obj;
        this.$canProvideAvatar = z;
        this.$isAvatarTakenOver = z2;
        this.$reportsPillBottom = z3;
        this.$pillMetrics = hatchStatusPillMetrics;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2() {
        /*
            r4 = this;
            com.facebook.aura.header.api.AvatarTakeover r3 = r4.$avatarTakeover
            if (r3 == 0) goto L13
            java.lang.Object r2 = r4.$takeoverAvatarOwner
            boolean r0 = r4.$canProvideAvatar
            if (r0 == 0) goto Lf
            boolean r1 = r4.$isAvatarTakenOver
            r0 = 1
            if (r1 != 0) goto L10
        Lf:
            r0 = 0
        L10:
            r3.updateVisibility(r2, r0)
        L13:
            boolean r0 = r4.$reportsPillBottom
            r1 = 0
            if (r0 != 0) goto L1d
            com.facebook.aura.header.view.HatchStatusPillMetrics r0 = r4.$pillMetrics
            r0.m1009setRenderedPillBottomYLDhkOg(r1)
        L1d:
            boolean r0 = r4.$canProvideAvatar
            if (r0 != 0) goto L26
            com.facebook.aura.header.view.HatchStatusPillMetrics r0 = r4.$pillMetrics
            r0.setAvatarBoundsInWindow(r1)
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$6$1.invoke2():void");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
