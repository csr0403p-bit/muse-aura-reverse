package com.facebook.aura.graduation;

import X.AHD;
import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.common.video.HatchVideoPlayer;
import com.facebook.aura.graduation.viewmodel.GraduationChapterUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class GraduationStoryPlayerKt$GraduationStoryPlayer$seekForward$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $chapterIndex;
    public final /* synthetic */ AHD<GraduationChapterUiModel> $chapters;
    public final /* synthetic */ MutableState<Boolean> $isInClosingLoop$delegate;
    public final /* synthetic */ HatchVideoPlayer $player;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduationStoryPlayerKt$GraduationStoryPlayer$seekForward$1$1(HatchVideoPlayer hatchVideoPlayer, AHD<GraduationChapterUiModel> ahd, int i, MutableState<Boolean> mutableState) {
        super(0);
        this.$player = hatchVideoPlayer;
        this.$chapters = ahd;
        this.$chapterIndex = i;
        this.$isInClosingLoop$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(false, this.$isInClosingLoop$delegate);
        this.$player.seekTo(((GraduationChapterUiModel) this.$chapters.get(this.$chapterIndex + 1)).startTimeMs);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
