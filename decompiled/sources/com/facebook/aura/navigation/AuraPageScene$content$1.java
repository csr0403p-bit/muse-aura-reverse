package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.B1V;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AuraPageScene$content$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ AuraPageScene this$0;

    /* renamed from: com.facebook.aura.navigation.AuraPageScene$content$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AuraPageScene this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraPageScene auraPageScene) {
            super(2);
            this.this$0 = auraPageScene;
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
    public AuraPageScene$content$1(AuraPageScene auraPageScene) {
        super(2);
        this.this$0 = auraPageScene;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraPageScene auraPageScene = this.this$0;
            auraPageScene.pageContent.invoke(auraPageScene.tabRoot, AuraPageSceneStrategyKt.getAuraNavKey(auraPageScene.entry), B1V.A00(bfm, new AnonymousClass1(this.this$0), -1908605037), bfm, 384);
        } else {
            bfm.Afo();
        }
    }
}
