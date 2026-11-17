package com.facebook.aura.composer.view;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.BGK;
import X.G0U;
import androidx.compose.runtime.MutableState;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposerLinkPreviewsKt$ComposerLinkPreview$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Set<String>> $dismissedUrls$delegate;
    public final /* synthetic */ G0U<String, Unit> $onRemoveAttachedUrl;
    public final /* synthetic */ ComposerLinkPreviewState $previews;
    public final /* synthetic */ String $url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComposerLinkPreviewsKt$ComposerLinkPreview$2$1$1$1(String str, ComposerLinkPreviewState composerLinkPreviewState, G0U<? super String, Unit> g0u, MutableState<Set<String>> mutableState) {
        super(0);
        this.$url = str;
        this.$previews = composerLinkPreviewState;
        this.$onRemoveAttachedUrl = g0u;
        this.$dismissedUrls$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<Set<String>> mutableState = this.$dismissedUrls$delegate;
        mutableState.Af8(BGK.A02(this.$url, mutableState.getValue()));
        ComposerLinkPreviewState composerLinkPreviewState = this.$previews;
        composerLinkPreviewState.setUrls(AbstractC0878AGe.A0b(composerLinkPreviewState.getUrls(), this.$url));
        this.$onRemoveAttachedUrl.invoke(this.$url);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
