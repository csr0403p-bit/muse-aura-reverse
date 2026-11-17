package com.facebook.aura.file.view.api;

import X.AnonymousClass001;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.file.view.api.ContentType;
import com.facebook.aura.library.repo.WorkspaceEntry;

/* loaded from: classes3.dex */
public final class ContentTypeDetector {
    public static final int $stable = 0;
    public static final ContentTypeDetector INSTANCE = new ContentTypeDetector();

    public final ContentType fromFileName(String str) {
        C7384Etj.A0Y(str, 0);
        return fromExtension(C60O.A0q(C7BY.A0R(str, "", '.')));
    }

    public final ContentType fromWorkspaceEntry(WorkspaceEntry workspaceEntry) {
        C7384Etj.A0Y(workspaceEntry, 0);
        return fromExtension(workspaceEntry.getFileExtension());
    }

    public final ContentType fromExtension(String str) {
        if (str != null) {
            String strA0u = AnonymousClass001.A0u(str);
            if (HatchFileUIUtils.FileExtensions.IMAGE.contains(strA0u)) {
                return ContentType.Image.INSTANCE;
            }
            if (HatchFileUIUtils.FileExtensions.VIDEO.contains(strA0u)) {
                return ContentType.Video.INSTANCE;
            }
            if (HatchFileUIUtils.FileExtensions.AUDIO.contains(strA0u)) {
                return ContentType.Audio.INSTANCE;
            }
            if (HatchFileUIUtils.FileExtensions.TEXT.contains(strA0u)) {
                return ContentType.Text.INSTANCE;
            }
            if (HatchFileUIUtils.FileExtensions.CODE.contains(strA0u)) {
                return ContentType.Code.INSTANCE;
            }
            if (HatchFileUIUtils.FileExtensions.PDF.contains(strA0u)) {
                return ContentType.Pdf.INSTANCE;
            }
            if (HatchFileUIUtils.FileExtensions.HTML.contains(strA0u)) {
                return ContentType.Html.INSTANCE;
            }
            HatchFileUIUtils.FileExtensions.PRESENTATION.contains(strA0u);
        }
        return ContentType.Unknown.INSTANCE;
    }
}
