package com.facebook.aura.composer.view;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.composer.view.ComposerLinkPreviewsKt$ComposerLinkPreview$1$1", f = "ComposerLinkPreviews.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ComposerLinkPreviewsKt$ComposerLinkPreview$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Set<String>> $dismissedUrls$delegate;
    public final /* synthetic */ ComposerLinkPreviewState $previews;
    public final /* synthetic */ List<String> $urls;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerLinkPreviewsKt$ComposerLinkPreview$1$1(List<String> list, ComposerLinkPreviewState composerLinkPreviewState, MutableState<Set<String>> mutableState, HtJ<? super ComposerLinkPreviewsKt$ComposerLinkPreview$1$1> htJ) {
        super(2, htJ);
        this.$urls = list;
        this.$previews = composerLinkPreviewState;
        this.$dismissedUrls$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ComposerLinkPreviewsKt$ComposerLinkPreview$1$1(this.$urls, this.$previews, this.$dismissedUrls$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            MutableState<Set<String>> mutableState = this.$dismissedUrls$delegate;
            mutableState.Af8(AbstractC0878AGe.A0S(mutableState.getValue(), AbstractC0878AGe.A0g(this.$urls)));
            ComposerLinkPreviewState composerLinkPreviewState = this.$previews;
            List<String> urls = composerLinkPreviewState.getUrls();
            List<String> list = this.$urls;
            ArrayList arrayList = new ArrayList();
            for (String str : urls) {
                if (list.contains(str)) {
                    arrayList.add(str);
                }
            }
            composerLinkPreviewState.setUrls(arrayList);
            if (!this.$urls.isEmpty()) {
                this.label = 1;
                if (C7Bq.A01(500L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        ComposerLinkPreviewState composerLinkPreviewState2 = this.$previews;
        List<String> list2 = this.$urls;
        MutableState<Set<String>> mutableState2 = this.$dismissedUrls$delegate;
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : list2) {
            if (!mutableState2.getValue().contains(str2)) {
                arrayList2.add(str2);
            }
        }
        composerLinkPreviewState2.setUrls(arrayList2);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ComposerLinkPreviewsKt$ComposerLinkPreview$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
