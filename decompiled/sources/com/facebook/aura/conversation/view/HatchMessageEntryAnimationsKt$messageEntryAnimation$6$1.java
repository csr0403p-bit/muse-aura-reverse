package com.facebook.aura.conversation.view;

import X.AOW;
import X.AT5;
import X.AXY;
import X.AYU;
import X.AZE;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageEntryAnimationsKt$messageEntryAnimation$6$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ AT5<Float, AOW> $agentProgress;
    public final /* synthetic */ float $topSpacing;
    public final /* synthetic */ boolean $unfurlFromCursorSlot;

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt$messageEntryAnimation$6$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ int $h;
        public final /* synthetic */ AZE $placeable;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            AnonymousClass006.A18(ayu, this.$placeable, this.$h);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AZE aze, int i) {
            super(1);
            this.$placeable = aze;
            this.$h = i;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageEntryAnimationsKt$messageEntryAnimation$6$1(boolean z, float f, AT5<Float, AOW> at5) {
        super(3);
        this.$unfurlFromCursorSlot = z;
        this.$topSpacing = f;
        this.$agentProgress = at5;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m644invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m644invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        int iAbr;
        AnonymousClass003.A0u(axy, c3tg);
        AZE azeAQW = c3tg.AQW(j);
        if (this.$unfurlFromCursorSlot) {
            iAbr = axy.Abr(this.$topSpacing + HatchMessageBubbleKt.BubbleMinHeight);
            int i = azeAQW.A00;
            if (iAbr > i) {
                iAbr = i;
            }
        } else {
            iAbr = 0;
        }
        int iA01 = iAbr + Ab3.A01((azeAQW.A00 - iAbr) * MutableState.A00(this.$agentProgress));
        return AnonymousClass002.A0X(axy, new AnonymousClass1(azeAQW, iA01), azeAQW.A01, iA01);
    }
}
