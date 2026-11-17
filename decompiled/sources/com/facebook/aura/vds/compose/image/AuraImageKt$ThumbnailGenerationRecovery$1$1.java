package com.facebook.aura.vds.compose.image;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.network.fresco.ThumbnailRetryScheduler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraImageKt$ThumbnailGenerationRecovery$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $isImage;
    public final /* synthetic */ String $key;
    public final /* synthetic */ Function0<Unit> $onFallbackToRaw;
    public final /* synthetic */ AuraImagePainter $painter;
    public final /* synthetic */ ThumbnailRetryState $retryState;
    public final /* synthetic */ MutableState<Boolean> $showErrorContentState;
    public final /* synthetic */ MutableState<Boolean> $showRetryViewState;
    public final /* synthetic */ MutableState<Boolean> $showShimmeringViewState;

    /* renamed from: com.facebook.aura.vds.compose.image.AuraImageKt$ThumbnailGenerationRecovery$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public final /* synthetic */ boolean $isImage;
        public final /* synthetic */ String $key;
        public final /* synthetic */ Function0<Unit> $onFallbackToRaw;
        public final /* synthetic */ ThumbnailRetryState $retryState;
        public final /* synthetic */ MutableState<Boolean> $showErrorContentState;
        public final /* synthetic */ MutableState<Boolean> $showRetryViewState;
        public final /* synthetic */ MutableState<Boolean> $showShimmeringViewState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ThumbnailRetryState thumbnailRetryState, MutableState<Boolean> mutableState, boolean z, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, String str, Function0<Unit> function0) {
            super(1);
            this.$retryState = thumbnailRetryState;
            this.$showShimmeringViewState = mutableState;
            this.$isImage = z;
            this.$showErrorContentState = mutableState2;
            this.$showRetryViewState = mutableState3;
            this.$key = str;
            this.$onFallbackToRaw = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (AuraImageKt.is404(th)) {
                return;
            }
            ThumbnailRetryState thumbnailRetryState = this.$retryState;
            if (thumbnailRetryState.fellBack) {
                return;
            }
            int i = thumbnailRetryState.attempt;
            long[] jArr = AuraImageKt.THUMBNAIL_RETRY_DELAYS_MS;
            if (i < jArr.length) {
                thumbnailRetryState.attempt = i + 1;
                MutableState<Boolean> mutableState = this.$showShimmeringViewState;
                if (mutableState != null) {
                    MutableState.A09(this.$isImage, mutableState);
                }
                MutableState<Boolean> mutableState2 = this.$showErrorContentState;
                if (mutableState2 != null) {
                    MutableState.A09(!this.$isImage, mutableState2);
                }
                MutableState<Boolean> mutableState3 = this.$showRetryViewState;
                if (mutableState3 != null) {
                    MutableState.A09(false, mutableState3);
                }
                ThumbnailRetryScheduler.INSTANCE.schedule(this.$key, jArr[i]);
                return;
            }
            thumbnailRetryState.fellBack = true;
            boolean z = this.$isImage;
            MutableState<Boolean> mutableState4 = this.$showShimmeringViewState;
            if (z) {
                if (mutableState4 != null) {
                    MutableState.A09(true, mutableState4);
                }
                this.$onFallbackToRaw.invoke();
                return;
            }
            if (mutableState4 != null) {
                MutableState.A09(false, mutableState4);
            }
            MutableState<Boolean> mutableState5 = this.$showRetryViewState;
            if (mutableState5 == null && (mutableState5 = this.$showErrorContentState) == null) {
                return;
            }
            MutableState.A09(true, mutableState5);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraImageKt$ThumbnailGenerationRecovery$1$1(String str, AuraImagePainter auraImagePainter, ThumbnailRetryState thumbnailRetryState, MutableState<Boolean> mutableState, boolean z, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, Function0<Unit> function0) {
        super(1);
        this.$key = str;
        this.$painter = auraImagePainter;
        this.$retryState = thumbnailRetryState;
        this.$showShimmeringViewState = mutableState;
        this.$isImage = z;
        this.$showErrorContentState = mutableState2;
        this.$showRetryViewState = mutableState3;
        this.$onFallbackToRaw = function0;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final AuraImageKt$ThumbnailGenerationRecovery$1$1$retryAction$1 auraImageKt$ThumbnailGenerationRecovery$1$1$retryAction$1 = new AuraImageKt$ThumbnailGenerationRecovery$1$1$retryAction$1(this.$painter);
        ThumbnailRetryScheduler.INSTANCE.addRetryAction(this.$key, auraImageKt$ThumbnailGenerationRecovery$1$1$retryAction$1);
        this.$painter.terminalFailureHandler = new AnonymousClass1(this.$retryState, this.$showShimmeringViewState, this.$isImage, this.$showErrorContentState, this.$showRetryViewState, this.$key, this.$onFallbackToRaw);
        final AuraImagePainter auraImagePainter = this.$painter;
        final String str = this.$key;
        return new C78g() { // from class: com.facebook.aura.vds.compose.image.AuraImageKt$ThumbnailGenerationRecovery$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                auraImagePainter.terminalFailureHandler = null;
                ThumbnailRetryScheduler.INSTANCE.removeRetryAction(str, auraImageKt$ThumbnailGenerationRecovery$1$1$retryAction$1);
            }
        };
    }
}
