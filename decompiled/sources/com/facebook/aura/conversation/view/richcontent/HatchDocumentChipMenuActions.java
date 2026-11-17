package com.facebook.aura.conversation.view.richcontent;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.utils.ArtifactShareOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchDocumentChipMenuActions extends C06G {
    public static final int $stable = 0;
    public final ArtifactShareOption artifactShareOption;
    public final Function0<Unit> onDownload;
    public final Function0<Unit> onDownloadAsHtml;
    public final Function0<Unit> onDownloadAsPdf;
    public final Function0<Unit> onSaveToGoogleDrive;
    public final Function0<Unit> onShare;

    public HatchDocumentChipMenuActions(Function0<Unit> function0, ArtifactShareOption artifactShareOption, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05) {
        C7384Etj.A0Y(artifactShareOption, 1);
        this.onShare = function0;
        this.artifactShareOption = artifactShareOption;
        this.onDownload = function02;
        this.onDownloadAsHtml = function03;
        this.onDownloadAsPdf = function04;
        this.onSaveToGoogleDrive = function05;
    }

    public final HatchDocumentChipMenuActions copy(Function0<Unit> function0, ArtifactShareOption artifactShareOption, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05) {
        C7384Etj.A0Y(artifactShareOption, 1);
        return new HatchDocumentChipMenuActions(function0, artifactShareOption, function02, function03, function04, function05);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchDocumentChipMenuActions) {
                HatchDocumentChipMenuActions hatchDocumentChipMenuActions = (HatchDocumentChipMenuActions) obj;
                if (!C7384Etj.areEqual(this.onShare, hatchDocumentChipMenuActions.onShare) || this.artifactShareOption != hatchDocumentChipMenuActions.artifactShareOption || !C7384Etj.areEqual(this.onDownload, hatchDocumentChipMenuActions.onDownload) || !C7384Etj.areEqual(this.onDownloadAsHtml, hatchDocumentChipMenuActions.onDownloadAsHtml) || !C7384Etj.areEqual(this.onDownloadAsPdf, hatchDocumentChipMenuActions.onDownloadAsPdf) || !C7384Etj.areEqual(this.onSaveToGoogleDrive, hatchDocumentChipMenuActions.onSaveToGoogleDrive)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchDocumentChipMenuActions copy$default(HatchDocumentChipMenuActions hatchDocumentChipMenuActions, Function0 function0, ArtifactShareOption artifactShareOption, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = hatchDocumentChipMenuActions.onShare;
        }
        if ((i & 2) != 0) {
            artifactShareOption = hatchDocumentChipMenuActions.artifactShareOption;
        }
        if ((i & 4) != 0) {
            function02 = hatchDocumentChipMenuActions.onDownload;
        }
        if ((i & 8) != 0) {
            function03 = hatchDocumentChipMenuActions.onDownloadAsHtml;
        }
        if ((i & 16) != 0) {
            function04 = hatchDocumentChipMenuActions.onDownloadAsPdf;
        }
        if ((i & 32) != 0) {
            function05 = hatchDocumentChipMenuActions.onSaveToGoogleDrive;
        }
        return hatchDocumentChipMenuActions.copy(function0, artifactShareOption, function02, function03, function04, function05);
    }

    public final Function0<Unit> component1() {
        return this.onShare;
    }

    public final ArtifactShareOption component2() {
        return this.artifactShareOption;
    }

    public final Function0<Unit> component3() {
        return this.onDownload;
    }

    public final Function0<Unit> component4() {
        return this.onDownloadAsHtml;
    }

    public final Function0<Unit> component5() {
        return this.onDownloadAsPdf;
    }

    public final Function0<Unit> component6() {
        return this.onSaveToGoogleDrive;
    }

    public final ArtifactShareOption getArtifactShareOption() {
        return this.artifactShareOption;
    }

    public final Function0<Unit> getOnDownload() {
        return this.onDownload;
    }

    public final Function0<Unit> getOnDownloadAsHtml() {
        return this.onDownloadAsHtml;
    }

    public final Function0<Unit> getOnDownloadAsPdf() {
        return this.onDownloadAsPdf;
    }

    public final Function0<Unit> getOnSaveToGoogleDrive() {
        return this.onSaveToGoogleDrive;
    }

    public final Function0<Unit> getOnShare() {
        return this.onShare;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0F(this.artifactShareOption, AnonymousClass006.A0D(this.onShare) * 31) + AnonymousClass006.A0D(this.onDownload)) * 31) + AnonymousClass006.A0D(this.onDownloadAsHtml)) * 31) + AnonymousClass006.A0D(this.onDownloadAsPdf)) * 31) + C3cH.A02(this.onSaveToGoogleDrive);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchDocumentChipMenuActions(Function0 function0, ArtifactShareOption artifactShareOption, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i, C06H c06h) {
        this(function0, (i & 2) != 0 ? ArtifactShareOption.SHARE : artifactShareOption, (i & 4) != 0 ? null : function02, (i & 8) != 0 ? null : function03, (i & 16) != 0 ? null : function04, (i & 32) != 0 ? null : function05);
    }
}
