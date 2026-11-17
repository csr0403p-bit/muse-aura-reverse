package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.library.repo.WorkspaceEntry;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FileViewerContentKt$EditableTextContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ String $content;
    public final /* synthetic */ WorkspaceEntry $entry;
    public final /* synthetic */ ExternalFileSource $externalSource;
    public final /* synthetic */ boolean $isEditing;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onContentChange;
    public final /* synthetic */ boolean $previewTruncated;
    public final /* synthetic */ boolean $supportsMarkdownPreview;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FileViewerContentKt$EditableTextContent$2(String str, WorkspaceEntry workspaceEntry, boolean z, boolean z2, G0U<? super String, Unit> g0u, float f, boolean z3, ExternalFileSource externalFileSource, BRg bRg, int i, int i2) {
        super(2);
        this.$content = str;
        this.$entry = workspaceEntry;
        this.$isEditing = z;
        this.$supportsMarkdownPreview = z2;
        this.$onContentChange = g0u;
        this.$bottomPadding = f;
        this.$previewTruncated = z3;
        this.$externalSource = externalFileSource;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        FileViewerContentKt.m891EditableTextContentGmEhDVc(this.$content, this.$entry, this.$isEditing, this.$supportsMarkdownPreview, this.$onContentChange, this.$bottomPadding, this.$previewTruncated, this.$externalSource, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
