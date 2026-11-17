package com.facebook.aura.identity.provider;

import X.C3cG;
import X.C7BY;
import X.FGI;
import X.HwO;
import android.graphics.BitmapFactory;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.model.HatchGatewayEventKt;
import java.io.File;

/* loaded from: classes2.dex */
public abstract class HatchIdentityProviderKt {
    public static final int AVATAR_DOWNLOAD_ATTEMPTS = 4;
    public static final long AVATAR_DOWNLOAD_RETRY_DELAY_MS = 1500;
    public static final String DARK_STILL_PREFIX = "dark-";

    public static final String avatarCacheFileName(String str) {
        String strA0S = C7BY.A0S(str, str, '?');
        String strA0S2 = C7BY.A0S(strA0S, strA0S, '#');
        String strA0R = C7BY.A0R(strA0S2, strA0S2, '/');
        String strA0T = C7BY.A0T(strA0R, strA0R, '.');
        if (strA0T.length() == 0) {
            strA0T = HatchChatThemeHelperKt.HATCH_AVATAR_THEME_ID;
        }
        String strA0R2 = C7BY.A0R(strA0R, "", '.');
        String strA01 = HwO.A01(str.hashCode() & 4294967295L, 16);
        int length = strA0R2.length();
        StringBuilder sbA0g = C3cG.A0g(strA0T);
        sbA0g.append("-");
        if (length == 0) {
            sbA0g.append(strA01);
        } else {
            sbA0g.append(strA01);
            sbA0g.append(".");
            sbA0g.append(strA0R2);
        }
        return sbA0g.toString();
    }

    public static final String displayName(AiIdentity aiIdentity) {
        String trimmedName = HatchGatewayEventKt.getTrimmedName(aiIdentity);
        return trimmedName == null ? HatchAppName.value : trimmedName;
    }

    public static final boolean isDecodableImage(File file) {
        if (file.exists() && file.length() != 0) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            if (options.outWidth > 0 && options.outHeight > 0) {
                return true;
            }
        }
        return false;
    }

    public static final String stillFileName(String str, boolean z) {
        String strAvatarCacheFileName = avatarCacheFileName(str);
        return z ? FGI.A0M(DARK_STILL_PREFIX, strAvatarCacheFileName) : strAvatarCacheFileName;
    }

    public static final boolean isDecodableImage(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, length, options);
            if (options.outWidth > 0 && options.outHeight > 0) {
                return true;
            }
        }
        return false;
    }
}
