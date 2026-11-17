package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7Bq;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerVideo$1$1", f = "MediaViewerContent.kt", l = {812}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerVideo$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $isCurrentPage;
    public final /* synthetic */ MutableState<Boolean> $isPlayerReady$delegate;
    public final /* synthetic */ MutableState<Boolean> $loadFailed;
    public final /* synthetic */ Function0<Unit> $retryLoad;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$MediaViewerVideo$1$1(boolean z, MutableState<Boolean> mutableState, Function0<Unit> function0, MutableState<Boolean> mutableState2, HtJ<? super MediaViewerContentKt$MediaViewerVideo$1$1> htJ) {
        super(2, htJ);
        this.$isCurrentPage = z;
        this.$loadFailed = mutableState;
        this.$retryLoad = function0;
        this.$isPlayerReady$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new MediaViewerContentKt$MediaViewerVideo$1$1(this.$isCurrentPage, this.$loadFailed, this.$retryLoad, this.$isPlayerReady$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$isCurrentPage) {
                MutableState<Boolean> mutableState = this.$isPlayerReady$delegate;
                float f = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
                if (!MutableState.A0A((MutableState) mutableState)) {
                    if (MutableState.A0A((MutableState) this.$loadFailed)) {
                        this.$retryLoad.invoke();
                    } else {
                        this.label = 1;
                        if (C7Bq.A01(20000L, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        CFK.A06(MediaViewerContentKt.TAG, "MediaViewerVideo: not ready after 20000ms");
        MutableState.A09(true, this.$loadFailed);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((MediaViewerContentKt$MediaViewerVideo$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
