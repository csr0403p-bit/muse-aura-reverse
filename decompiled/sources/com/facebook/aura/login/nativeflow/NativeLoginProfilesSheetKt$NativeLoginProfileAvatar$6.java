package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginProfilesSheetKt$NativeLoginProfileAvatar$6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $badgeRingWidth;
    public final /* synthetic */ float $badgeSize;
    public final /* synthetic */ AuraDrawableSource $fallbackGlyph;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ String $photoUrl;
    public final /* synthetic */ String $platform;
    public final /* synthetic */ float $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginProfilesSheetKt$NativeLoginProfileAvatar$6(String str, String str2, BRg bRg, AuraDrawableSource auraDrawableSource, float f, float f2, float f3, int i, int i2) {
        super(2);
        this.$photoUrl = str;
        this.$platform = str2;
        this.$modifier = bRg;
        this.$fallbackGlyph = auraDrawableSource;
        this.$style = f;
        this.$badgeSize = f2;
        this.$badgeRingWidth = f3;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        NativeLoginProfilesSheetKt.m1304NativeLoginProfileAvatarKGdREcs(this.$photoUrl, this.$platform, this.$modifier, this.$fallbackGlyph, this.$style, this.$badgeSize, this.$badgeRingWidth, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
