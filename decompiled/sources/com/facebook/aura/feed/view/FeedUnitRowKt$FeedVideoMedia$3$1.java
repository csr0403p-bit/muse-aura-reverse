package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedVideoMedia$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $isMuted$delegate;
    public final /* synthetic */ MutableState<Boolean> $isVisible$delegate;
    public final /* synthetic */ G0U<Boolean, Unit> $onPlaybackToggled;
    public final /* synthetic */ MutableState<FeedVideoPlaybackState> $playbackState$delegate;
    public final /* synthetic */ MutableState<Boolean> $retainPlayer$delegate;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeedVideoPlaybackState.values().length];
            try {
                AnonymousClass002.A13(FeedVideoPlaybackState.STOPPED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(FeedVideoPlaybackState.PLAYING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(FeedVideoPlaybackState.PAUSED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedUnitRowKt$FeedVideoMedia$3$1(G0U<? super Boolean, Unit> g0u, MutableState<FeedVideoPlaybackState> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4) {
        super(0);
        this.$onPlaybackToggled = g0u;
        this.$playbackState$delegate = mutableState;
        this.$isVisible$delegate = mutableState2;
        this.$isMuted$delegate = mutableState3;
        this.$retainPlayer$delegate = mutableState4;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FeedVideoPlaybackState feedVideoPlaybackState;
        int iOrdinal = this.$playbackState$delegate.getValue().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                feedVideoPlaybackState = FeedVideoPlaybackState.PAUSED;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                feedVideoPlaybackState = FeedVideoPlaybackState.PLAYING;
            }
        } else if (MutableState.A0A((MutableState) this.$isVisible$delegate)) {
            MutableState.A09(false, this.$isMuted$delegate);
            MutableState.A09(true, this.$retainPlayer$delegate);
            feedVideoPlaybackState = FeedVideoPlaybackState.PLAYING;
        } else {
            feedVideoPlaybackState = FeedVideoPlaybackState.STOPPED;
        }
        if (feedVideoPlaybackState != this.$playbackState$delegate.getValue()) {
            AnonymousClass001.A1K(feedVideoPlaybackState == FeedVideoPlaybackState.PLAYING, this.$onPlaybackToggled);
        }
        this.$playbackState$delegate.Af8(feedVideoPlaybackState);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
