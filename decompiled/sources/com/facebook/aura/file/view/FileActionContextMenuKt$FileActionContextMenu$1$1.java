package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.share.view.ItemShareMenuEntries;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FileActionContextMenuKt$FileActionContextMenu$1$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onCopyText;
    public final /* synthetic */ Function0<Unit> $onDelete;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Function0<Unit> $onDownload;
    public final /* synthetic */ Function0<Unit> $onDownloadAsHtml;
    public final /* synthetic */ Function0<Unit> $onDownloadAsPdf;
    public final /* synthetic */ Function0<Unit> $onSaveToGoogleDrive;
    public final /* synthetic */ Function0<Unit> $onShare;
    public final /* synthetic */ Function0<Unit> $onTogglePin;
    public final /* synthetic */ ItemShareMenuEntries $shareEntries;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        Function0<Unit> function0;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        this.$onDismiss.invoke();
        int i = auraContextMenuItem.id;
        switch (i) {
            case 0:
                function0 = this.$onShare;
                break;
            case 1:
                function0 = this.$onCopyText;
                break;
            case 2:
                function0 = this.$onDownloadAsHtml;
                break;
            case 3:
                function0 = this.$onSaveToGoogleDrive;
                break;
            case 4:
                function0 = this.$onDownloadAsPdf;
                break;
            case 5:
                function0 = this.$onDownload;
                break;
            case 6:
                function0 = this.$onDelete;
                break;
            case 7:
                function0 = this.$onTogglePin;
                break;
            default:
                AuraNavKey auraNavKeyOnItemClick = this.$shareEntries.onItemClick(i);
                if (auraNavKeyOnItemClick != null) {
                    this.$navigator.navigate(auraNavKeyOnItemClick, false);
                    return;
                }
                return;
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileActionContextMenuKt$FileActionContextMenu$1$1(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Function0<Unit> function08, Function0<Unit> function09, ItemShareMenuEntries itemShareMenuEntries, AuraNavigator auraNavigator) {
        super(1);
        this.$onDismiss = function0;
        this.$onShare = function02;
        this.$onTogglePin = function03;
        this.$onCopyText = function04;
        this.$onDownloadAsHtml = function05;
        this.$onSaveToGoogleDrive = function06;
        this.$onDownloadAsPdf = function07;
        this.$onDownload = function08;
        this.$onDelete = function09;
        this.$shareEntries = itemShareMenuEntries;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
