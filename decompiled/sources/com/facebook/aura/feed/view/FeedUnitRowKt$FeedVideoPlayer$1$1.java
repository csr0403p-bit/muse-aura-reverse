package com.facebook.aura.feed.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.video.HatchVideoPlayer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.view.FeedUnitRowKt$FeedVideoPlayer$1$1", f = "FeedUnitRow.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedVideoPlayer$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ FeedVideoPlaybackState $playbackState;
    public final /* synthetic */ HatchVideoPlayer $player;
    public int label;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeedVideoPlaybackState.values().length];
            try {
                AnonymousClass002.A13(FeedVideoPlaybackState.PLAYING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(FeedVideoPlaybackState.PAUSED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(FeedVideoPlaybackState.STOPPED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedUnitRowKt$FeedVideoPlayer$1$1(FeedVideoPlaybackState feedVideoPlaybackState, HatchVideoPlayer hatchVideoPlayer, HtJ<? super FeedUnitRowKt$FeedVideoPlayer$1$1> htJ) {
        super(2, htJ);
        this.$playbackState = feedVideoPlaybackState;
        this.$player = hatchVideoPlayer;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FeedUnitRowKt$FeedVideoPlayer$1$1(this.$playbackState, this.$player, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        int iOrdinal = this.$playbackState.ordinal();
        if (iOrdinal == 1) {
            this.$player.setPlayWhenReadyFlag(true);
            this.$player.resume();
        } else {
            if (iOrdinal != 2 && iOrdinal != 0) {
                throw new NoWhenBranchMatchedException();
            }
            this.$player.pause();
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((FeedUnitRowKt$FeedVideoPlayer$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
