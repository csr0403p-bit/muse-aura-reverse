package com.facebook.aura.ageverification;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.commands.photos.MediaDeviceSyncClientKt;
import com.facebook.aura.sharesheet.HatchShareSheetRepository;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AgeVerificationUploadKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AgeVerificationUploadKind[] $VALUES;
    public static final AgeVerificationUploadKind ID_BACK;
    public static final AgeVerificationUploadKind ID_FRONT;
    public static final AgeVerificationUploadKind SELFIE_PHOTO;
    public static final AgeVerificationUploadKind SELFIE_VIDEO;
    public final String filename;
    public final String mimeType;
    public final String uploadMedium;

    static {
        AgeVerificationUploadKind ageVerificationUploadKind = new AgeVerificationUploadKind("SELFIE_VIDEO", 0, "SELFIE_VIDEO_NATIVE", HatchShareSheetRepository.MUTED_VIDEO_MIME, "selfie.mp4");
        SELFIE_VIDEO = ageVerificationUploadKind;
        AgeVerificationUploadKind ageVerificationUploadKind2 = new AgeVerificationUploadKind("SELFIE_PHOTO", 1, "SELFIE_PHOTO_NATIVE", MediaDeviceSyncClientKt.FALLBACK_MIME, "selfie.jpg");
        SELFIE_PHOTO = ageVerificationUploadKind2;
        AgeVerificationUploadKind ageVerificationUploadKind3 = new AgeVerificationUploadKind("ID_FRONT", 2, "CAMERA_MANUAL", MediaDeviceSyncClientKt.FALLBACK_MIME, "id_front.jpg");
        ID_FRONT = ageVerificationUploadKind3;
        AgeVerificationUploadKind ageVerificationUploadKind4 = new AgeVerificationUploadKind("ID_BACK", 3, "CAMERA_MANUAL", MediaDeviceSyncClientKt.FALLBACK_MIME, "id_back.jpg");
        ID_BACK = ageVerificationUploadKind4;
        AgeVerificationUploadKind[] ageVerificationUploadKindArr = {ageVerificationUploadKind, ageVerificationUploadKind2, ageVerificationUploadKind3, ageVerificationUploadKind4};
        $VALUES = ageVerificationUploadKindArr;
        $ENTRIES = C3cG.A0w(ageVerificationUploadKindArr);
    }

    public static Ey9<AgeVerificationUploadKind> getEntries() {
        return $ENTRIES;
    }

    public static AgeVerificationUploadKind valueOf(String str) {
        return (AgeVerificationUploadKind) Enum.valueOf(AgeVerificationUploadKind.class, str);
    }

    public static AgeVerificationUploadKind[] values() {
        return (AgeVerificationUploadKind[]) $VALUES.clone();
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getUploadMedium() {
        return this.uploadMedium;
    }

    public AgeVerificationUploadKind(String str, int i, String str2, String str3, String str4) {
        this.uploadMedium = str2;
        this.mimeType = str3;
        this.filename = str4;
    }
}
