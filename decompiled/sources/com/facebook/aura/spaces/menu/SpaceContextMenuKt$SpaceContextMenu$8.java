package com.facebook.aura.spaces.menu;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.model.SpaceConstructionStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceContextMenuKt$SpaceContextMenu$8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $asBottomSheet;
    public final /* synthetic */ Integer $audienceCount;
    public final /* synthetic */ boolean $canDelete;
    public final /* synthetic */ boolean $canDownloadHtml;
    public final /* synthetic */ boolean $canShare;
    public final /* synthetic */ SpaceConstructionStatus $constructionStatus;
    public final /* synthetic */ boolean $expanded;
    public final /* synthetic */ String $imageUrl;
    public final /* synthetic */ boolean $isOwnedSpace;
    public final /* synthetic */ boolean $isPinned;
    public final /* synthetic */ boolean $isSavedSpace;
    public final /* synthetic */ SpaceMenuLogOrigin $logOrigin;
    public final /* synthetic */ SpaceContextMenuMode $mode;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ long $offset;
    public final /* synthetic */ Function0<Unit> $onChangeIcon;
    public final /* synthetic */ Function0<Unit> $onDeleted;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Function0<Unit> $onMoveToLibrary;
    public final /* synthetic */ Function0<Unit> $onMoveToSpaces;
    public final /* synthetic */ Function0<Unit> $onRename;
    public final /* synthetic */ Function0<Unit> $onTogglePin;
    public final /* synthetic */ String $slug;
    public final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceContextMenuKt$SpaceContextMenu$8(String str, String str2, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, boolean z2, boolean z3, Function0<Unit> function03, boolean z4, boolean z5, boolean z6, boolean z7, Integer num, SpaceConstructionStatus spaceConstructionStatus, String str3, boolean z8, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, SpaceContextMenuMode spaceContextMenuMode, long j, SpaceMenuLogOrigin spaceMenuLogOrigin, int i, int i2, int i3, int i4) {
        super(2);
        this.$slug = str;
        this.$title = str2;
        this.$expanded = z;
        this.$onDismiss = function0;
        this.$onDeleted = function02;
        this.$modifier = bRg;
        this.$asBottomSheet = z2;
        this.$isPinned = z3;
        this.$onTogglePin = function03;
        this.$canShare = z4;
        this.$canDownloadHtml = z5;
        this.$isOwnedSpace = z6;
        this.$isSavedSpace = z7;
        this.$audienceCount = num;
        this.$constructionStatus = spaceConstructionStatus;
        this.$imageUrl = str3;
        this.$canDelete = z8;
        this.$onRename = function04;
        this.$onChangeIcon = function05;
        this.$onMoveToLibrary = function06;
        this.$onMoveToSpaces = function07;
        this.$mode = spaceContextMenuMode;
        this.$offset = j;
        this.$logOrigin = spaceMenuLogOrigin;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$changed2 = i3;
        this.$$default = i4;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        SpaceContextMenuKt.m2179SpaceContextMenuxDtEYtk(this.$slug, this.$title, this.$expanded, this.$onDismiss, this.$onDeleted, this.$modifier, this.$asBottomSheet, this.$isPinned, this.$onTogglePin, this.$canShare, this.$canDownloadHtml, this.$isOwnedSpace, this.$isSavedSpace, this.$audienceCount, this.$constructionStatus, this.$imageUrl, this.$canDelete, this.$onRename, this.$onChangeIcon, this.$onMoveToLibrary, this.$onMoveToSpaces, this.$mode, this.$offset, this.$logOrigin, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
    }
}
