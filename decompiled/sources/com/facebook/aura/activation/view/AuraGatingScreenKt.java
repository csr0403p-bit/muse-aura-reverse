package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraGatingScreenKt {
    public static final float GATING_ARTWORK_SIZE = 106.0f;

    /* renamed from: com.facebook.aura.activation.view.AuraGatingScreenKt$AuraGatingScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $footer;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $summary;
        public final /* synthetic */ String $title;
        public final /* synthetic */ C1822Arm $titleStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(BRg bRg, String str, String str2, C1822Arm c1822Arm, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$title = str;
            this.$summary = str2;
            this.$titleStyle = c1822Arm;
            this.$footer = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraGatingScreenKt.AuraGatingScreen(this.$modifier, this.$title, this.$summary, this.$titleStyle, this.$footer, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraGatingScreen(X.BRg r49, java.lang.String r50, java.lang.String r51, X.C1822Arm r52, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r53, X.BFM r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.AuraGatingScreenKt.AuraGatingScreen(X.BRg, java.lang.String, java.lang.String, X.Arm, X.G0V, X.BFM, int, int):void");
    }

    public static final float getGATING_ARTWORK_SIZE() {
        return GATING_ARTWORK_SIZE;
    }
}
