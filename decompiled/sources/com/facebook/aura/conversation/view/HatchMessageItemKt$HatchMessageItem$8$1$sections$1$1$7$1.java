package com.facebook.aura.conversation.view;

import X.AXY;
import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$8$1$sections$1$1$7$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public static final HatchMessageItemKt$HatchMessageItem$8$1$sections$1$1$7$1 INSTANCE = new HatchMessageItemKt$HatchMessageItem$8$1$sections$1$1$7$1();

    /* renamed from: com.facebook.aura.conversation.view.HatchMessageItemKt$HatchMessageItem$8$1$sections$1$1$7$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ AZE $placeable;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            AYU.A04(ayu, this.$placeable, 0, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AZE aze) {
            super(1);
            this.$placeable = aze;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    public HatchMessageItemKt$HatchMessageItem$8$1$sections$1$1$7$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m648invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m648invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        ?? A1b = AnonymousClass004.A1b(axy, c3tg);
        AZE azeAQW = c3tg.AQW(j);
        int iAbr = axy.Abr(HatchMessageItemKt.ReplyBubbleOverlap);
        int i = azeAQW.A01;
        int i2 = azeAQW.A00 - iAbr;
        if (i2 < A1b) {
            i2 = 0;
        }
        return AnonymousClass002.A0X(axy, new AnonymousClass1(azeAQW), i, i2);
    }
}
