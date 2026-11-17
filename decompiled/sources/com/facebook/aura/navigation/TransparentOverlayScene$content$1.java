package com.facebook.aura.navigation;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C1515AkP;
import X.C3cG;
import X.C5Mp;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.ui.adaptive.AuraContentAreaKt;
import com.facebook.aura.ui.adaptive.AuraPageCardKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class TransparentOverlayScene$content$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ TransparentOverlayScene<T> this$0;

    /* renamed from: com.facebook.aura.navigation.TransparentOverlayScene$content$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ TransparentOverlayScene<T> this$0;

        /* renamed from: com.facebook.aura.navigation.TransparentOverlayScene$content$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02451 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ TransparentOverlayScene<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02451(TransparentOverlayScene<T> transparentOverlayScene) {
                super(2);
                this.this$0 = transparentOverlayScene;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    this.this$0.entry.A00(bfm, 0);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TransparentOverlayScene<T> transparentOverlayScene) {
            super(2);
            this.this$0 = transparentOverlayScene;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                if (AuraPageSceneStrategyKt.getAuraNavKey(this.this$0.entry) instanceof AuraContentAreaNavKey) {
                    BS0 bs0A09 = C3cG.A09(bfm, 1450142461);
                    TransparentOverlayScene<T> transparentOverlayScene = this.this$0;
                    AuraContentAreaKt.AuraContentArea(C5Mp.A00(bs0A09, transparentOverlayScene.zIndex), B1V.A00(bfm, new C02451(transparentOverlayScene), 1365686270), bfm, 48, 0);
                } else {
                    BS0 bs0A092 = C3cG.A09(bfm, 1450236329);
                    TransparentOverlayScene<T> transparentOverlayScene2 = this.this$0;
                    BRg bRgA00 = C5Mp.A00(bs0A092, transparentOverlayScene2.zIndex);
                    InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                    BBI bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRgA00);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                    transparentOverlayScene2.entry.A00(bfm, 0);
                    BBI.A0R(bbi, true);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransparentOverlayScene$content$1(TransparentOverlayScene<T> transparentOverlayScene) {
        super(2);
        this.this$0 = transparentOverlayScene;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AnonymousClass003.A0m(bfm, AuraPageCardKt.LocalAuraPageCardSuppressed.A04(true), new AnonymousClass1(this.this$0), -2131792532);
        } else {
            bfm.Afo();
        }
    }
}
