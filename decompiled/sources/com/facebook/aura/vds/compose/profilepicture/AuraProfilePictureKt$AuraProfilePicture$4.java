package com.facebook.aura.vds.compose.profilepicture;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.G0V;
import X.InterfaceC8647Fhz;
import com.facebook.common.callercontext.ContextChain;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraProfilePictureKt$AuraProfilePicture$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1BO<B6A> $borderColor;
    public final /* synthetic */ float $borderWidth;
    public final /* synthetic */ InterfaceC8647Fhz $contentScale;
    public final /* synthetic */ ContextChain $contextChain;
    public final /* synthetic */ String $highResUri;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onProfilePictureClick;
    public final /* synthetic */ Function0<Unit> $onProfilePictureLongClick;
    public final /* synthetic */ float $style;
    public final /* synthetic */ String $uri;
    public final /* synthetic */ String $uriRememberKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraProfilePictureKt$AuraProfilePicture$4(String str, float f, BRg bRg, C1BO<B6A> c1bo, InterfaceC8647Fhz interfaceC8647Fhz, Function0<Unit> function0, Function0<Unit> function02, String str2, String str3, ContextChain contextChain, float f2, int i, int i2, int i3) {
        super(2);
        this.$uri = str;
        this.$style = f;
        this.$modifier = bRg;
        this.$borderColor = c1bo;
        this.$contentScale = interfaceC8647Fhz;
        this.$onProfilePictureClick = function0;
        this.$onProfilePictureLongClick = function02;
        this.$uriRememberKey = str2;
        this.$highResUri = str3;
        this.$contextChain = contextChain;
        this.$borderWidth = f2;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public final void invoke(BFM bfm, int i) {
        AuraProfilePictureKt.m2594AuraProfilePictured7e1vww(this.$uri, this.$style, this.$modifier, this.$borderColor, this.$contentScale, this.$onProfilePictureClick, this.$onProfilePictureLongClick, this.$uriRememberKey, this.$highResUri, this.$contextChain, this.$borderWidth, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
