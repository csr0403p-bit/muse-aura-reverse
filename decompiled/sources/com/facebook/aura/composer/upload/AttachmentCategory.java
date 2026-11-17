package com.facebook.aura.composer.upload;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AttachmentCategory {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AttachmentCategory[] $VALUES;
    public static final Companion Companion;
    public static final AttachmentCategory IMAGE;
    public static final AttachmentCategory OTHER;
    public static final AttachmentCategory VIDEO;

    public final class Companion {
        public final AttachmentCategory fromMimeType(String str) {
            C7384Etj.A0Y(str, 0);
            return str.startsWith("image/") ? AttachmentCategory.IMAGE : str.startsWith("video/") ? AttachmentCategory.VIDEO : AttachmentCategory.OTHER;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        AttachmentCategory attachmentCategory = new AttachmentCategory("IMAGE", 0);
        IMAGE = attachmentCategory;
        AttachmentCategory attachmentCategory2 = new AttachmentCategory("VIDEO", 1);
        VIDEO = attachmentCategory2;
        AttachmentCategory attachmentCategory3 = new AttachmentCategory("OTHER", 2);
        OTHER = attachmentCategory3;
        AttachmentCategory[] attachmentCategoryArr = {attachmentCategory, attachmentCategory2, attachmentCategory3};
        $VALUES = attachmentCategoryArr;
        $ENTRIES = C3cG.A0w(attachmentCategoryArr);
        Companion = new Companion();
    }

    public static Ey9<AttachmentCategory> getEntries() {
        return $ENTRIES;
    }

    public static AttachmentCategory valueOf(String str) {
        return (AttachmentCategory) Enum.valueOf(AttachmentCategory.class, str);
    }

    public static AttachmentCategory[] values() {
        return (AttachmentCategory[]) $VALUES.clone();
    }

    public AttachmentCategory(String str, int i) {
    }
}
