package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class EmbodimentActivityCoverKt$rememberEmbodimentActivityCover$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Integer> $discardedLoadGeneration$delegate;
    public final /* synthetic */ int $loadGeneration;
    public final /* synthetic */ boolean $presentationSuppressed;
    public final /* synthetic */ boolean $replacementOpaque;
    public final /* synthetic */ MutableState<RetainedActivityCover> $retainedCover$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbodimentActivityCoverKt$rememberEmbodimentActivityCover$2$1(boolean z, int i, boolean z2, MutableState<Integer> mutableState, MutableState<RetainedActivityCover> mutableState2) {
        super(0);
        this.$presentationSuppressed = z;
        this.$loadGeneration = i;
        this.$replacementOpaque = z2;
        this.$discardedLoadGeneration$delegate = mutableState;
        this.$retainedCover$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$presentationSuppressed) {
            MutableState.A07(this.$loadGeneration, this.$discardedLoadGeneration$delegate);
        }
        if (this.$presentationSuppressed || this.$replacementOpaque) {
            this.$retainedCover$delegate.Af8(null);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
