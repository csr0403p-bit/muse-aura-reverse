package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConfidentialVmLoginScreenKt$PinCaptionText$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $announceLive;
    public final /* synthetic */ long $color;
    public final /* synthetic */ String $liveAnnouncement;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmLoginScreenKt$PinCaptionText$2(String str, long j, BRg bRg, boolean z, String str2, int i, int i2) {
        super(2);
        this.$text = str;
        this.$color = j;
        this.$modifier = bRg;
        this.$announceLive = z;
        this.$liveAnnouncement = str2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        ConfidentialVmLoginScreenKt.m463PinCaptionText8V94_ZQ(this.$text, this.$color, this.$modifier, this.$announceLive, this.$liveAnnouncement, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
