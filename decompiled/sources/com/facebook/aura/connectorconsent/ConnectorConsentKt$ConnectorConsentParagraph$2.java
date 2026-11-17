package com.facebook.aura.connectorconsent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConnectorConsentKt$ConnectorConsentParagraph$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<String, String, Unit> $onLinkClick;
    public final /* synthetic */ String $paragraph;
    public final /* synthetic */ long $textColor;
    public final /* synthetic */ C1822Arm $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectorConsentKt$ConnectorConsentParagraph$2(String str, long j, C1822Arm c1822Arm, G0V<? super String, ? super String, Unit> g0v, BRg bRg, int i, int i2) {
        super(2);
        this.$paragraph = str;
        this.$textColor = j;
        this.$textStyle = c1822Arm;
        this.$onLinkClick = g0v;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        ConnectorConsentKt.m489ConnectorConsentParagraph8V94_ZQ(this.$paragraph, this.$textColor, this.$textStyle, this.$onLinkClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
