package com.facebook.aura.main;

import X.AOW;
import X.ASj;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C2HU;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.main.HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$1$1", f = "HatchStatusFloatingOverlay.kt", l = {198, 200, HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $hasAppeared$delegate;
    public final /* synthetic */ AT5<Float, AOW> $hostAlpha;
    public final /* synthetic */ boolean $isOnNavigationSpaceModal;
    public final /* synthetic */ boolean $pillVisible;
    public final /* synthetic */ boolean $prewarmsForOnboardingHandoff;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$1$1(boolean z, boolean z2, boolean z3, AT5<Float, AOW> at5, MutableState<Boolean> mutableState, HtJ<? super HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$1$1> htJ) {
        super(2, htJ);
        this.$prewarmsForOnboardingHandoff = z;
        this.$pillVisible = z2;
        this.$isOnNavigationSpaceModal = z3;
        this.$hostAlpha = at5;
        this.$hasAppeared$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$1$1(this.$prewarmsForOnboardingHandoff, this.$pillVisible, this.$isOnNavigationSpaceModal, this.$hostAlpha, this.$hasAppeared$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objA04;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!this.$prewarmsForOnboardingHandoff || MutableState.A0A((MutableState) this.$hasAppeared$delegate)) {
                if (this.$pillVisible && !MutableState.A0A((MutableState) this.$hasAppeared$delegate)) {
                    MutableState.A09(true, this.$hasAppeared$delegate);
                    boolean z = this.$isOnNavigationSpaceModal;
                    AT5<Float, AOW> at5 = this.$hostAlpha;
                    if (z) {
                        Float f = new Float(1.0f);
                        this.label = 1;
                        objA04 = at5.A04(f, this);
                    } else {
                        Float f2 = new Float(1.0f);
                        ASj aSjA0J = AnonymousClass002.A0J(C2HU.A02, 250);
                        this.label = 2;
                        objA04 = AnonymousClass002.A0i(at5, aSjA0J, f2, this, null);
                    }
                } else if (MutableState.A0A((MutableState) this.$hasAppeared$delegate)) {
                    AT5<Float, AOW> at52 = this.$hostAlpha;
                    Float f3 = new Float(this.$pillVisible ? 1.0f : 0.0f);
                    this.label = 3;
                    objA04 = at52.A04(f3, this);
                }
                if (objA04 == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                MutableState.A09(true, this.$hasAppeared$delegate);
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
