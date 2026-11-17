package com.facebook.aura.conversation.view;

import X.AaC;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchImageOptionPreviewKt$ImageOptionPreviewImage$7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ long $dimColor;
    public final /* synthetic */ String $imageUri;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ Function0<Float> $progress;
    public final /* synthetic */ AaC $sourceBounds;
    public final /* synthetic */ float $sourceDim;
    public final /* synthetic */ AaC $targetBounds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionPreviewKt$ImageOptionPreviewImage$7(String str, String str2, AaC aaC, AaC aaC2, float f, long j, Function0<Float> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
        super(2);
        this.$imageUri = str;
        this.$contentDescription = str2;
        this.$sourceBounds = aaC;
        this.$targetBounds = aaC2;
        this.$sourceDim = f;
        this.$dimColor = j;
        this.$progress = function0;
        this.$onClick = function02;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchImageOptionPreviewKt.m611ImageOptionPreviewImageCcamzx0(this.$imageUri, this.$contentDescription, this.$sourceBounds, this.$targetBounds, this.$sourceDim, this.$dimColor, this.$progress, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
