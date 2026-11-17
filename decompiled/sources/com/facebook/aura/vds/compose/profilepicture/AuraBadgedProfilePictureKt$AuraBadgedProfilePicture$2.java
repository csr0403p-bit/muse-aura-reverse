package com.facebook.aura.vds.compose.profilepicture;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.G0V;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraBadgedProfilePictureKt$AuraBadgedProfilePicture$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AuraDrawableSource $badge;
    public final /* synthetic */ float $badgeRingWidth;
    public final /* synthetic */ float $badgeSize;
    public final /* synthetic */ C1BO<B6A> $borderColor;
    public final /* synthetic */ float $borderWidth;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $style;
    public final /* synthetic */ String $uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBadgedProfilePictureKt$AuraBadgedProfilePicture$2(String str, AuraDrawableSource auraDrawableSource, BRg bRg, float f, float f2, C1BO<B6A> c1bo, float f3, float f4, int i, int i2) {
        super(2);
        this.$uri = str;
        this.$badge = auraDrawableSource;
        this.$modifier = bRg;
        this.$style = f;
        this.$badgeSize = f2;
        this.$borderColor = c1bo;
        this.$borderWidth = f3;
        this.$badgeRingWidth = f4;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraBadgedProfilePictureKt.m2593AuraBadgedProfilePicture7lJwU(this.$uri, this.$badge, this.$modifier, this.$style, this.$badgeSize, this.$borderColor, this.$borderWidth, this.$badgeRingWidth, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
