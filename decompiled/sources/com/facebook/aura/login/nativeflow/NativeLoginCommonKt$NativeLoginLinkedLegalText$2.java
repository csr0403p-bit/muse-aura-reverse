package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.ApQ;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.C1YL;
import X.G0V;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginCommonKt$NativeLoginLinkedLegalText$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ ApQ $annotatedString;
    public final /* synthetic */ AuraColors $colors;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C1822Arm $style;
    public final /* synthetic */ int $textAlign;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCommonKt$NativeLoginLinkedLegalText$2(AuraColors auraColors, BRg bRg, ApQ apQ, C1822Arm c1822Arm, int i) {
        super(2);
        this.$colors = auraColors;
        this.$modifier = bRg;
        this.$annotatedString = apQ;
        this.$style = c1822Arm;
        this.$textAlign = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            long j = this.$colors.secondaryText;
            AuraTextKt.m2640AuraTextVmYn7U0(this.$annotatedString, NativeLoginCommonKt.nativeLoginTextInset(this.$modifier), j, this.$style, null, null, new C1YL(this.$textAlign), 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32688);
            return;
        }
        bfm.Afo();
    }
}
