package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C2Um;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$inputModifier$1$1 extends AbstractC7559F3s implements G0U<C2Um, Unit> {
    public final /* synthetic */ MutableState<Boolean> $hasLoggedTypeSinceFocus$delegate;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ MutableState<Boolean> $showNameHint$delegate;
    public final /* synthetic */ String $threadId;
    public final /* synthetic */ MutableState<Boolean> $wasComposerFocused$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2Um c2Um) {
        C7384Etj.A0Y(c2Um, 0);
        if (c2Um.AOS() && !MutableState.A0A((MutableState) this.$wasComposerFocused$delegate)) {
            MutableState.A09(false, this.$hasLoggedTypeSinceFocus$delegate);
            HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
            HatchSurface hatchSurface = HatchSurface.CHAT;
            HatchSubsurface hatchSubsurface = HatchSubsurface.COMPOSER;
            boolean z = this.$isPrimaryThread;
            hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, HatchInteractionEnumsKt.chatScreen(z), HatchComponent.INPUT_BAR, null, AnonymousClass002.A0o(null, this.$threadId, z), null);
        }
        if (!c2Um.AOS()) {
            MutableState.A09(false, this.$showNameHint$delegate);
        }
        MutableState.A09(c2Um.AOS(), this.$wasComposerFocused$delegate);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$inputModifier$1$1(boolean z, String str, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3) {
        super(1);
        this.$isPrimaryThread = z;
        this.$threadId = str;
        this.$wasComposerFocused$delegate = mutableState;
        this.$hasLoggedTypeSinceFocus$delegate = mutableState2;
        this.$showNameHint$delegate = mutableState3;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2Um c2Um) {
        invoke2(c2Um);
        return Unit.INSTANCE;
    }
}
