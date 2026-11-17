package com.facebook.aura.partners.voice.avatar;

import X.C3cG;
import X.C7384Etj;
import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.aura.localbrowser.ManagedBrowserSitePolicy;
import com.facebook.aura.partners.voice.gating.VoiceGating;

/* loaded from: classes2.dex */
public abstract class HatchAvatarReferenceImageProviderKt {
    public static final int ASSET_FAMILY_VERSION = 5;
    public static final String ASSET_KIND_REFERENCE_IMAGE = "reference_image";
    public static final String ASSET_KIND_REFRAMED_HATCH = "reference_image_reframed_hatch";
    public static final int DIGEST_BUFFER_BYTES = 8192;
    public static final char[] HEX_DIGITS = ManagedBrowserSitePolicy.HEX.toCharArray();
    public static final int MAX_ENCODE_DIMENSION = 768;
    public static final long ORIGINAL_STILL_MAX_BYTES = 16777216;
    public static final long PREWARM_RETRY_COOLDOWN_MS = 300000;
    public static final int RAW_REFERENCE_LOOKUP_LIMIT = 100;
    public static final int RECENT_ASSET_LOOKUP_LIMIT = 10;
    public static final int RECIPE_VARIANT_LOOKUP_LIMIT = 100;
    public static final int REFERENCE_ENCODE_QUALITY = 90;
    public static final String REFERENCE_FILE_NAME = "avatar_image.webp";
    public static final String REFERENCE_KIND_HATCH_REFRAMED = "hatch_reframed";
    public static final String REFERENCE_MIME_TYPE = "image/webp";
    public static final String TAG = "HatchAvatarReferenceImage";

    public static final boolean hasResolvedCrop(HatchAvatarReference hatchAvatarReference) {
        C7384Etj.A0Y(hatchAvatarReference, 0);
        return (hatchAvatarReference.cropX == null || hatchAvatarReference.cropY == null || hatchAvatarReference.cropSize == null) ? false : true;
    }

    public static final boolean hasUsableSelectionForCall(ResolvedAvatarSelection resolvedAvatarSelection) {
        C7384Etj.A0Y(resolvedAvatarSelection, 0);
        HatchAvatarSelection hatchAvatarSelection = resolvedAvatarSelection.selection;
        if (hatchAvatarSelection == null || !resolvedAvatarSelection.isSettled) {
            return false;
        }
        return !hatchAvatarSelection.fullFrame || isFullBodyReference(hatchAvatarSelection);
    }

    public static final boolean isFullBodyReference(HatchAvatarSelection hatchAvatarSelection) {
        C7384Etj.A0Y(hatchAvatarSelection, 0);
        return hatchAvatarSelection.fullFrame && REFERENCE_KIND_HATCH_REFRAMED.equals(hatchAvatarSelection.kind);
    }

    public static final Boolean madeFromOriginal(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        return C3cG.A0P(str2.equals(str));
    }

    public static final boolean callEmbodimentDark(Boolean bool, boolean z, boolean z2) {
        return bool != null ? bool.booleanValue() : z && z2 && VoiceGating.INSTANCE.isDarkCallEmbodimentEnabled();
    }

    public static final Bitmap.CompressFormat referenceCompressFormat() {
        return Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.WEBP;
    }
}
