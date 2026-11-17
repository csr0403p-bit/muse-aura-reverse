package com.facebook.aura.conversation.view.richcontent;

import X.AHD;
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
public final class HatchInlineImageKt$HatchInlineVideoThumbnail$6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $deleted;
    public final /* synthetic */ String $fileName;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onAllThumbnailsFailed;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ float $posterAspectRatio;
    public final /* synthetic */ String $sharedElementKey;
    public final /* synthetic */ boolean $showsPlayIcon;
    public final /* synthetic */ AHD<String> $thumbnailUrls;
    public final /* synthetic */ float $verticalPadding;
    public final /* synthetic */ String $videoUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchInlineImageKt$HatchInlineVideoThumbnail$6(String str, String str2, BRg bRg, float f, AHD<String> ahd, boolean z, float f2, Function0<Unit> function0, G0U<? super String, Unit> g0u, String str3, boolean z2, int i, int i2, int i3) {
        super(2);
        this.$videoUrl = str;
        this.$fileName = str2;
        this.$modifier = bRg;
        this.$verticalPadding = f;
        this.$thumbnailUrls = ahd;
        this.$deleted = z;
        this.$posterAspectRatio = f2;
        this.$onClick = function0;
        this.$onAllThumbnailsFailed = g0u;
        this.$sharedElementKey = str3;
        this.$showsPlayIcon = z2;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchInlineImageKt.m678HatchInlineVideoThumbnailWSk2ftU(this.$videoUrl, this.$fileName, this.$modifier, this.$verticalPadding, this.$thumbnailUrls, this.$deleted, this.$posterAspectRatio, this.$onClick, this.$onAllThumbnailsFailed, this.$sharedElementKey, this.$showsPlayIcon, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
