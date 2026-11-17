package com.facebook.aura.commands.photos;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.pairs.PairsPendingLevelStoreKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PhotoUploadState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PhotoUploadState[] $VALUES;
    public static final PhotoUploadState FAILED;
    public static final PhotoUploadState PENDING;
    public static final PhotoUploadState SKIPPED;
    public static final PhotoUploadState UPLOADED;
    public final String wireValue;

    static {
        PhotoUploadState photoUploadState = new PhotoUploadState(HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING, 0, PairsPendingLevelStoreKt.STATE_PENDING);
        PENDING = photoUploadState;
        PhotoUploadState photoUploadState2 = new PhotoUploadState("UPLOADED", 1, "uploaded");
        UPLOADED = photoUploadState2;
        PhotoUploadState photoUploadState3 = new PhotoUploadState(CvmMigrationStatusJson.STAGE_FAILED, 2, "failed");
        FAILED = photoUploadState3;
        PhotoUploadState photoUploadState4 = new PhotoUploadState("SKIPPED", 3, "skipped");
        SKIPPED = photoUploadState4;
        PhotoUploadState[] photoUploadStateArr = {photoUploadState, photoUploadState2, photoUploadState3, photoUploadState4};
        $VALUES = photoUploadStateArr;
        $ENTRIES = C3cG.A0w(photoUploadStateArr);
    }

    public static Ey9<PhotoUploadState> getEntries() {
        return $ENTRIES;
    }

    public static PhotoUploadState valueOf(String str) {
        return (PhotoUploadState) Enum.valueOf(PhotoUploadState.class, str);
    }

    public static PhotoUploadState[] values() {
        return (PhotoUploadState[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public PhotoUploadState(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
