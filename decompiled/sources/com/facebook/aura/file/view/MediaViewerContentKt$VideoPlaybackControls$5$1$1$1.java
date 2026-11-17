package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$VideoPlaybackControls$5$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isPlaying;
    public final /* synthetic */ Function0<Unit> $onPauseClick;
    public final /* synthetic */ Function0<Unit> $onPlayClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$VideoPlaybackControls$5$1$1$1(boolean z, Function0<Unit> function0, Function0<Unit> function02) {
        super(0);
        this.$isPlaying = z;
        this.$onPauseClick = function0;
        this.$onPlayClick = function02;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0<Unit> function0;
        if (this.$isPlaying) {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.MEDIA_VIEWER, HatchSubsurface.MEDIA_CONTROLS, HatchScreen.MEDIA_FULLSCREEN, HatchComponent.PAUSE_BUTTON, null, AnonymousClass006.A10("media_type", "video"), null);
            function0 = this.$onPauseClick;
        } else {
            function0 = this.$onPlayClick;
        }
        function0.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
