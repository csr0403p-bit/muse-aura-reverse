package com.facebook.aura.partners.voice.avatar;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.BFI;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.CFK;
import X.G0U;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes2.dex */
public abstract class HatchVoiceAvatarStoreKt {
    public static final int AVATAR_DOWNLOAD_ATTEMPTS = 4;
    public static final int AVATAR_DOWNLOAD_MAX_ATTEMPTS = 40;
    public static final long AVATAR_DOWNLOAD_RETRY_CYCLE_DELAY_MS = 30000;
    public static final long AVATAR_DOWNLOAD_RETRY_DELAY_MS = 1500;
    public static final String TAG = "HatchVoiceAvatarStore";
    public static final String VOICE_AVATAR_DIR = "voice_avatar_cache";

    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStoreKt$avatarCacheKey$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Byte, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final CharSequence invoke(byte b) {
            return String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(b & 255)}, 1));
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
            return invoke(b.byteValue());
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchVoiceAvatarStoreKt$sha1HexOfFile$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Byte, CharSequence> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        public final CharSequence invoke(byte b) {
            return C3cJ.A0K(Integer.valueOf(b & 255));
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
            return invoke(b.byteValue());
        }
    }

    public static final String sha1HexOfFile(File file) throws NoSuchAlgorithmException, IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i <= 0) {
                        fileInputStream.close();
                        byte[] bArrDigest = messageDigest.digest();
                        C7384Etj.A0U(bArrDigest);
                        return BFI.A0C("", AnonymousClass2.INSTANCE, bArrDigest);
                    }
                    messageDigest.update(bArr, 0, i);
                }
            } finally {
            }
        } catch (Exception e) {
            CFK.A0K(TAG, e, "Could not hash a cached avatar still");
            return null;
        }
    }

    public static final String avatarCacheKey(String str, String str2, String str3) {
        byte[] bArrA1T = C3cH.A1T(AbstractC0878AGe.A0L(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "", "", Arrays.asList(str, str2, str3), HatchVoiceAvatarStoreKt$avatarCacheKey$key$1.INSTANCE));
        C7384Etj.A0U(bArrA1T);
        return BFI.A0C("", AnonymousClass1.INSTANCE, bArrA1T);
    }

    public static final boolean isDecodableImage(File file) {
        if (file.isFile() && file.length() != 0) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            if (options.outWidth > 0 && options.outHeight > 0) {
                return true;
            }
        }
        return false;
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
