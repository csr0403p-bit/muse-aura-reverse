package com.facebook.aura.webview;

import X.AXY;
import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C1Ny;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class WebViewKeyboardKt$retainKeyboardAnimationSize$1$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ C1Ny $ime;
    public final /* synthetic */ float $reservedBottom;
    public final /* synthetic */ C1Ny $source;
    public final /* synthetic */ C1Ny $target;

    /* renamed from: com.facebook.aura.webview.WebViewKeyboardKt$retainKeyboardAnimationSize$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ AZE $placeable;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            ayu.A0A(this.$placeable, 0.0f, 0, 0);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewKeyboardKt$retainKeyboardAnimationSize$1$1(float f, C1Ny c1Ny, C1Ny c1Ny2, C1Ny c1Ny3) {
        super(3);
        this.$reservedBottom = f;
        this.$ime = c1Ny;
        this.$source = c1Ny2;
        this.$target = c1Ny3;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m3154invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m3154invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        ?? A1b = AnonymousClass004.A1b(axy, c3tg);
        int iAbr = axy.Abr(this.$reservedBottom);
        int iACy = this.$ime.ACy(axy) - iAbr;
        if (iACy < A1b) {
            iACy = 0;
        }
        int iACy2 = this.$source.ACy(axy) - iAbr;
        if (iACy2 < A1b) {
            iACy2 = 0;
        }
        int iACy3 = this.$target.ACy(axy) - iAbr;
        if (iACy3 < A1b) {
            iACy3 = 0;
        }
        int iMin = iACy != iACy3 ? Math.min(iACy2, iACy3) : iACy;
        int iA00 = Constraints.A00(j);
        int i = (iACy + iA00) - iMin;
        AZE azeAQW = c3tg.AQW(Constraints.A05(Constraints.A03(j), Constraints.A01(j), i, i));
        return AnonymousClass002.A0X(axy, new AnonymousClass1(azeAQW), azeAQW.A01, iA00);
    }
}
