package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.BL5;
import X.C2BR;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedVideoMedia$2$1 extends AbstractC7559F3s implements G0U {
    public final /* synthetic */ MutableState<Boolean> $isVisible$delegate;
    public final /* synthetic */ MutableState<FeedVideoPlaybackState> $playbackState$delegate;

    /* renamed from: com.facebook.aura.feed.view.FeedUnitRowKt$FeedVideoMedia$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ MutableState<Boolean> $isVisible$delegate;
        public final /* synthetic */ MutableState<FeedVideoPlaybackState> $playbackState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState<Boolean> mutableState, MutableState<FeedVideoPlaybackState> mutableState2) {
            super(0);
            this.$isVisible$delegate = mutableState;
            this.$playbackState$delegate = mutableState2;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableState.A09(false, this.$isVisible$delegate);
            this.$playbackState$delegate.Af8(FeedVideoPlaybackState.STOPPED);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Override // X.G0U
    public final BL5 invoke(C2BR c2br) {
        C7384Etj.A0Y(c2br, 0);
        MutableState.A09(true, this.$isVisible$delegate);
        return new BL5(new AnonymousClass1(this.$isVisible$delegate, this.$playbackState$delegate));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedUnitRowKt$FeedVideoMedia$2$1(MutableState<Boolean> mutableState, MutableState<FeedVideoPlaybackState> mutableState2) {
        super(1);
        this.$isVisible$delegate = mutableState;
        this.$playbackState$delegate = mutableState2;
    }
}
