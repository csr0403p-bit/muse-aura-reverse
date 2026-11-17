package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0V;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConfidentialVmPinEntryContentKt$ConfidentialVmHeader$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $announceTitleLive;
    public final /* synthetic */ String $description;
    public final /* synthetic */ float $logoSize;
    public final /* synthetic */ float $logoTitleSpacing;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ boolean $showLogo;
    public final /* synthetic */ String $title;
    public final /* synthetic */ G0W<String, BFM, Integer, Unit> $titleContent;
    public final /* synthetic */ float $titleDescriptionSpacing;
    public final /* synthetic */ C1822Arm $titleStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConfidentialVmPinEntryContentKt$ConfidentialVmHeader$2(String str, String str2, BRg bRg, boolean z, float f, float f2, C1822Arm c1822Arm, float f3, boolean z2, G0W<? super String, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
        super(2);
        this.$title = str;
        this.$description = str2;
        this.$modifier = bRg;
        this.$showLogo = z;
        this.$logoSize = f;
        this.$logoTitleSpacing = f2;
        this.$titleStyle = c1822Arm;
        this.$titleDescriptionSpacing = f3;
        this.$announceTitleLive = z2;
        this.$titleContent = g0w;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        ConfidentialVmPinEntryContentKt.m467ConfidentialVmHeaderGh5yOYU(this.$title, this.$description, this.$modifier, this.$showLogo, this.$logoSize, this.$logoTitleSpacing, this.$titleStyle, this.$titleDescriptionSpacing, this.$announceTitleLive, this.$titleContent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
