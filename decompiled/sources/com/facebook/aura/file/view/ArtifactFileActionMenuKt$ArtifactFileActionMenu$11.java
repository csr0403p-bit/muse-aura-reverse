package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ArtifactFileActionMenuKt$ArtifactFileActionMenu$11 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $canDelete;
    public final /* synthetic */ boolean $canShare;
    public final /* synthetic */ String $deleteSource;
    public final /* synthetic */ boolean $expanded;
    public final /* synthetic */ String $fileExtension;
    public final /* synthetic */ String $fileName;
    public final /* synthetic */ String $imageUri;
    public final /* synthetic */ boolean $isPinned;
    public final /* synthetic */ HatchScreen $loggingScreen;
    public final /* synthetic */ long $offset;
    public final /* synthetic */ Function0<Unit> $onCopyText;
    public final /* synthetic */ Function0<Unit> $onDeleted;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Function0<Unit> $onTogglePin;
    public final /* synthetic */ String $relativePath;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArtifactFileActionMenuKt$ArtifactFileActionMenu$11(String str, String str2, String str3, String str4, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, boolean z3, Function0<Unit> function04, HatchScreen hatchScreen, String str5, long j, boolean z4, int i, int i2, int i3) {
        super(2);
        this.$relativePath = str;
        this.$fileName = str2;
        this.$imageUri = str3;
        this.$fileExtension = str4;
        this.$canShare = z;
        this.$expanded = z2;
        this.$onDismiss = function0;
        this.$onDeleted = function02;
        this.$onCopyText = function03;
        this.$isPinned = z3;
        this.$onTogglePin = function04;
        this.$loggingScreen = hatchScreen;
        this.$deleteSource = str5;
        this.$offset = j;
        this.$canDelete = z4;
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
        ArtifactFileActionMenuKt.m883ArtifactFileActionMenunEJ3PNA(this.$relativePath, this.$fileName, this.$imageUri, this.$fileExtension, this.$canShare, this.$expanded, this.$onDismiss, this.$onDeleted, this.$onCopyText, this.$isPinned, this.$onTogglePin, this.$loggingScreen, this.$deleteSource, this.$offset, this.$canDelete, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
