package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BO6;
import X.BRg;
import X.G0U;
import X.G0V;
import androidx.compose.foundation.pager.PagerState;
import com.facebook.aura.library.repo.WorkspaceEntry;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FileViewerContentKt$FileViewerContent$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ String $currentContent;
    public final /* synthetic */ WorkspaceEntry $entry;
    public final /* synthetic */ String $imageUri;
    public final /* synthetic */ boolean $isEditing;
    public final /* synthetic */ boolean $isSlideLoading;
    public final /* synthetic */ FileLoadingState $loadingState;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onContentChange;
    public final /* synthetic */ G0U<Integer, Unit> $onTopColorDetected;
    public final /* synthetic */ PagerState $pagerState;
    public final /* synthetic */ BO6<Integer, String> $slideHtmlCache;
    public final /* synthetic */ boolean $supportsMarkdownPreview;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FileViewerContentKt$FileViewerContent$3(WorkspaceEntry workspaceEntry, FileLoadingState fileLoadingState, String str, boolean z, boolean z2, G0U<? super String, Unit> g0u, String str2, BO6<Integer, String> bo6, PagerState pagerState, boolean z3, G0U<? super Integer, Unit> g0u2, float f, BRg bRg, int i, int i2, int i3) {
        super(2);
        this.$entry = workspaceEntry;
        this.$loadingState = fileLoadingState;
        this.$currentContent = str;
        this.$isEditing = z;
        this.$supportsMarkdownPreview = z2;
        this.$onContentChange = g0u;
        this.$imageUri = str2;
        this.$slideHtmlCache = bo6;
        this.$pagerState = pagerState;
        this.$isSlideLoading = z3;
        this.$onTopColorDetected = g0u2;
        this.$bottomPadding = f;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        FileViewerContentKt.m892FileViewerContentKp3ePZc(this.$entry, this.$loadingState, this.$currentContent, this.$isEditing, this.$supportsMarkdownPreview, this.$onContentChange, this.$imageUri, this.$slideHtmlCache, this.$pagerState, this.$isSlideLoading, this.$onTopColorDetected, this.$bottomPadding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
