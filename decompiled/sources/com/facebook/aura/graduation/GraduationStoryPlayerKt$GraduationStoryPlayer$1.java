package com.facebook.aura.graduation;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.graduation.viewmodel.GraduationChapterUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class GraduationStoryPlayerKt$GraduationStoryPlayer$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ AHD<GraduationChapterUiModel> $chapters;
    public final /* synthetic */ boolean $isSavingVideo;
    public final /* synthetic */ boolean $isVideoSaved;
    public final /* synthetic */ Long $loopStartTimeMs;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClose;
    public final /* synthetic */ Function0<Unit> $onSaveVideo;
    public final /* synthetic */ String $videoUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduationStoryPlayerKt$GraduationStoryPlayer$1(String str, Long l, AHD<GraduationChapterUiModel> ahd, float f, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
        super(2);
        this.$videoUrl = str;
        this.$loopStartTimeMs = l;
        this.$chapters = ahd;
        this.$bottomPadding = f;
        this.$isSavingVideo = z;
        this.$isVideoSaved = z2;
        this.$onSaveVideo = function0;
        this.$onClose = function02;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        GraduationStoryPlayerKt.m972GraduationStoryPlayer_WMjBM(this.$videoUrl, this.$loopStartTimeMs, this.$chapters, this.$bottomPadding, this.$isSavingVideo, this.$isVideoSaved, this.$onSaveVideo, this.$onClose, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
