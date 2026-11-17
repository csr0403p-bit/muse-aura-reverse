package com.facebook.aura.sharesheet;

import X.AGI;
import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C9oY;
import android.webkit.MimeTypeMap;
import com.facebook.aura.file.core.HatchMimeResolver;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class HatchShareSheetRepositoryKt {
    public static final String extensionForMime(String str) {
        String strExtensionForMime = HatchMimeResolver.INSTANCE.extensionForMime(str);
        if (strExtensionForMime != null) {
            return strExtensionForMime;
        }
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        return extensionFromMimeType == null ? "video/quicktime".equals(str) ? "mov" : "video/x-matroska".equals(str) ? "mkv" : C60O.A1X(str, "video/") ? "mp4" : "jpg" : extensionFromMimeType;
    }

    public static final boolean isShareableMedia(String str) {
        return AnonymousClass005.A1a(str, "image/") || str.startsWith("video/");
    }

    public static final String sniffMediaMime(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[32];
        int i = inputStream.read(bArr);
        if (i >= 4) {
            HatchMimeResolver hatchMimeResolver = HatchMimeResolver.INSTANCE;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
            C7384Etj.A0U(bArrCopyOf);
            String strMimeFromBytes = hatchMimeResolver.mimeFromBytes(bArrCopyOf);
            if (strMimeFromBytes != null) {
                return strMimeFromBytes;
            }
            if (i >= 12 && bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) {
                return (bArr[8] == 113 && bArr[9] == 116 && bArr[10] == 32 && bArr[11] == 32) ? "video/quicktime" : HatchShareSheetRepository.MUTED_VIDEO_MIME;
            }
            if (bArr[0] == 26 && bArr[1] == 69 && bArr[2] == -33 && bArr[3] == -93) {
                return "video/webm";
            }
        }
        return null;
    }

    public static final HatchShareRecipient toDomain(ShareRecipientJson shareRecipientJson) {
        Integer numA02;
        int iIntValue;
        JsonPrimitive jsonPrimitive = shareRecipientJson.recipient_type;
        HatchShareAppTarget hatchShareAppTarget = null;
        if (jsonPrimitive == null || (numA02 = C9oY.A02(jsonPrimitive)) == null || 1 > (iIntValue = numA02.intValue()) || iIntValue >= 5 || C7BY.A0j(shareRecipientJson.recipient_id) || C7BY.A0j(shareRecipientJson.sender_account_id)) {
            return null;
        }
        String str = shareRecipientJson.name;
        String str2 = shareRecipientJson.label;
        if (str2 == null) {
            str2 = "";
        }
        List<String> list = shareRecipientJson.profile_pic_url;
        ArrayList arrayListA0h = C3cG.A0h();
        for (String str3 : list) {
            AnonymousClass006.A1F(str3, str3, arrayListA0h);
        }
        AHD ahdA07 = AGI.A07(arrayListA0h);
        String strA0u = AnonymousClass001.A0u(shareRecipientJson.app_target);
        int iHashCode = strA0u.hashCode();
        if (iHashCode != -1436108013) {
            if (iHashCode != 28903346) {
                if (iHashCode == 497130182 && strA0u.equals(MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_FACEBOOK)) {
                    hatchShareAppTarget = HatchShareAppTarget.FACEBOOK;
                }
            } else if (strA0u.equals(MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_INSTAGRAM)) {
                hatchShareAppTarget = HatchShareAppTarget.INSTAGRAM;
            }
        } else if (strA0u.equals("messenger")) {
            hatchShareAppTarget = HatchShareAppTarget.MESSENGER;
        }
        return new HatchShareRecipient(str, str2, ahdA07, hatchShareAppTarget, iIntValue, shareRecipientJson.recipient_id, shareRecipientJson.sender_account_id);
    }
}
