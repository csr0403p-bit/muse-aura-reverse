package com.facebook.aura.vds.compose.ext;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ViewExtKt$auraSetContent$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ AuraThemeMode $modeOverride;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewExtKt$auraSetContent$1$1(AuraThemeMode auraThemeMode, G0V<? super BFM, ? super Integer, Unit> g0v) {
        super(2);
        this.$modeOverride = auraThemeMode;
        this.$content = g0v;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            ViewExtKt.FwaRootContent(this.$modeOverride, this.$content, bfm, 0, 0);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
