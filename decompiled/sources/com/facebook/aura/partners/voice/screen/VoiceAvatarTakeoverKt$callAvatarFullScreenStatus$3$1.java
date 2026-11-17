package com.facebook.aura.partners.voice.screen;

import X.AXY;
import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C1DG;
import X.C2av;
import X.C3TG;
import X.C3cH;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class VoiceAvatarTakeoverKt$callAvatarFullScreenStatus$3$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ Function0<C1DG> $baseTop;
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
    public final /* synthetic */ boolean $hidden;
    public final /* synthetic */ StatusRowSwap $swap;

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarFullScreenStatus$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ Function0<C1DG> $baseTop;
        public final /* synthetic */ AZE $child;
        public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
        public final /* synthetic */ boolean $hidden;
        public final /* synthetic */ StatusRowSwap $swap;

        /* renamed from: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarFullScreenStatus$3$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C03031 extends AbstractC7559F3s implements G0U<C2av, Unit> {
            public final /* synthetic */ Function0<C1DG> $baseTop;
            public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
            public final /* synthetic */ StatusRowSwap $swap;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C2av c2av) {
                C7384Etj.A0Y(c2av, 0);
                c2av.Af6(MutableState.A0A(this.$swap.inTopRow$delegate) ? this.$fullScreen.getStatusTopPx() - c2av.Ah4(this.$baseTop.invoke().A00) : 0.0f);
                c2av.Acj(C3cH.A00(this.$swap.alpha));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03031(StatusRowSwap statusRowSwap, VoiceAvatarFullScreenState voiceAvatarFullScreenState, Function0<C1DG> function0) {
                super(1);
                this.$swap = statusRowSwap;
                this.$fullScreen = voiceAvatarFullScreenState;
                this.$baseTop = function0;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
                invoke2(c2av);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            if (this.$hidden) {
                return;
            }
            ayu.A0C(this.$child, new C03031(this.$swap, this.$fullScreen, this.$baseTop), 0, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, AZE aze, StatusRowSwap statusRowSwap, VoiceAvatarFullScreenState voiceAvatarFullScreenState, Function0<C1DG> function0) {
            super(1);
            this.$hidden = z;
            this.$child = aze;
            this.$swap = statusRowSwap;
            this.$fullScreen = voiceAvatarFullScreenState;
            this.$baseTop = function0;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAvatarTakeoverKt$callAvatarFullScreenStatus$3$1(boolean z, StatusRowSwap statusRowSwap, VoiceAvatarFullScreenState voiceAvatarFullScreenState, Function0<C1DG> function0) {
        super(3);
        this.$hidden = z;
        this.$swap = statusRowSwap;
        this.$fullScreen = voiceAvatarFullScreenState;
        this.$baseTop = function0;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m1751invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m1751invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        AnonymousClass003.A0u(axy, c3tg);
        AZE azeAQW = c3tg.AQW(j);
        return AXY.A01(axy, new AnonymousClass1(this.$hidden, azeAQW, this.$swap, this.$fullScreen, this.$baseTop), azeAQW.A01, azeAQW.A00);
    }
}
