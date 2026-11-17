package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import com.facebook.aura.share.api.ShareableItem;
import com.facebook.aura.share.view.ItemShareLogContext;
import com.facebook.aura.utils.ArtifactShareOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FileActionContextMenuKt$FileActionContextMenu$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ ArtifactShareOption $artifactShareOption;
    public final /* synthetic */ boolean $expanded;
    public final /* synthetic */ boolean $isPinned;
    public final /* synthetic */ long $offset;
    public final /* synthetic */ Function0<Unit> $onCopyText;
    public final /* synthetic */ Function0<Unit> $onDelete;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ Function0<Unit> $onDownload;
    public final /* synthetic */ Function0<Unit> $onDownloadAsHtml;
    public final /* synthetic */ Function0<Unit> $onDownloadAsPdf;
    public final /* synthetic */ Function0<Unit> $onSaveToGoogleDrive;
    public final /* synthetic */ Function0<Unit> $onShare;
    public final /* synthetic */ Function0<Unit> $onTogglePin;
    public final /* synthetic */ ShareableItem $shareItem;
    public final /* synthetic */ ItemShareLogContext $shareLogContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileActionContextMenuKt$FileActionContextMenu$3(boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, ItemShareLogContext itemShareLogContext, long j, ArtifactShareOption artifactShareOption, boolean z2, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Function0<Unit> function08, Function0<Unit> function09, Function0<Unit> function010, ShareableItem shareableItem, int i, int i2, int i3) {
        super(2);
        this.$expanded = z;
        this.$onDismiss = function0;
        this.$onDismissRequest = function02;
        this.$onShare = function03;
        this.$shareLogContext = itemShareLogContext;
        this.$offset = j;
        this.$artifactShareOption = artifactShareOption;
        this.$isPinned = z2;
        this.$onTogglePin = function04;
        this.$onDownload = function05;
        this.$onCopyText = function06;
        this.$onDownloadAsHtml = function07;
        this.$onDownloadAsPdf = function08;
        this.$onSaveToGoogleDrive = function09;
        this.$onDelete = function010;
        this.$shareItem = shareableItem;
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
        FileActionContextMenuKt.m890FileActionContextMenuSQLAbr4(this.$expanded, this.$onDismiss, this.$onDismissRequest, this.$onShare, this.$shareLogContext, this.$offset, this.$artifactShareOption, this.$isPinned, this.$onTogglePin, this.$onDownload, this.$onCopyText, this.$onDownloadAsHtml, this.$onDownloadAsPdf, this.$onSaveToGoogleDrive, this.$onDelete, this.$shareItem, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
