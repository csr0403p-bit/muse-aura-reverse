package com.facebook.aura.partners.voice.chrome;

import X.AXN;
import X.AXY;
import X.AYU;
import X.AZE;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.header.view.HeaderButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class VoiceFloatingCallControlsKt$PillTurnIconImage$1$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ PillTurnIcon $icon;
    public final /* synthetic */ Function0<Float> $surfaceLeft;

    /* renamed from: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$PillTurnIconImage$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ PillTurnIcon $icon;
        public final /* synthetic */ AZE $placeable;
        public final /* synthetic */ Function0<Float> $surfaceLeft;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            ayu.A0A(this.$placeable, 0.0f, Ab3.A01((this.$icon.centerX - AnonymousClass003.A04(this.$surfaceLeft)) - (this.$placeable.A01 / 2.0f)), Ab3.A01((AXN.A01(ayu, HeaderButtonKt.PillIconTouchTarget) - this.$placeable.A00) / 2.0f));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AZE aze, PillTurnIcon pillTurnIcon, Function0<Float> function0) {
            super(1);
            this.$placeable = aze;
            this.$icon = pillTurnIcon;
            this.$surfaceLeft = function0;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFloatingCallControlsKt$PillTurnIconImage$1$1(PillTurnIcon pillTurnIcon, Function0<Float> function0) {
        super(3);
        this.$icon = pillTurnIcon;
        this.$surfaceLeft = function0;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m1709invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m1709invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        AnonymousClass003.A0u(axy, c3tg);
        AZE azeAQW = c3tg.AQW(j);
        return AXY.A01(axy, new AnonymousClass1(azeAQW, this.$icon, this.$surfaceLeft), azeAQW.A01, azeAQW.A00);
    }
}
