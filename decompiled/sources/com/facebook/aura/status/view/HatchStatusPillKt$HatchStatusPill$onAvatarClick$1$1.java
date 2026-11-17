package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C0Hi;
import X.C0dx;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$HatchStatusPill$onAvatarClick$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $canOwnPanel;
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ C0dx $haptic;
    public final /* synthetic */ boolean $isTakeoverAvatar;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ Function0<Unit> $toggleAvatarPanel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$HatchStatusPill$onAvatarClick$1$1(boolean z, boolean z2, C0Hi c0Hi, Function0<Unit> function0, C0dx c0dx, Function0<Unit> function02) {
        super(0);
        this.$canOwnPanel = z;
        this.$isTakeoverAvatar = z2;
        this.$focusManager = c0Hi;
        this.$toggleAvatarPanel = function0;
        this.$haptic = c0dx;
        this.$onClick = function02;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0<Unit> function0;
        if (this.$canOwnPanel && this.$isTakeoverAvatar) {
            this.$focusManager.A6G(false);
            function0 = this.$toggleAvatarPanel;
        } else {
            this.$haptic.AXr(AuraHaptics.BUTTON_TAP);
            function0 = this.$onClick;
        }
        function0.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
