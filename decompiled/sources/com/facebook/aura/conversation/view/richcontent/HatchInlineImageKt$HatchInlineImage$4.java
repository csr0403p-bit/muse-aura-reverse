package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchInlineImageKt$HatchInlineImage$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $alt;
    public final /* synthetic */ boolean $deleted;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ G0U<String, Unit> $onImageError;
    public final /* synthetic */ String $sharedElementKey;
    public final /* synthetic */ float $size;
    public final /* synthetic */ String $url;
    public final /* synthetic */ float $verticalPadding;
    public final /* synthetic */ String $workspacePath;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchInlineImageKt$HatchInlineImage$4(String str, String str2, BRg bRg, float f, float f2, boolean z, String str3, Function0<Unit> function0, G0U<? super String, Unit> g0u, String str4, int i, int i2) {
        super(2);
        this.$url = str;
        this.$alt = str2;
        this.$modifier = bRg;
        this.$size = f;
        this.$verticalPadding = f2;
        this.$deleted = z;
        this.$workspacePath = str3;
        this.$onClick = function0;
        this.$onImageError = g0u;
        this.$sharedElementKey = str4;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchInlineImageKt.m676HatchInlineImageTxD2sAc(this.$url, this.$alt, this.$modifier, this.$size, this.$verticalPadding, this.$deleted, this.$workspacePath, this.$onClick, this.$onImageError, this.$sharedElementKey, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
