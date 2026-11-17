package com.facebook.aura.commands.photos;

import X.AnonymousClass004;
import X.BFI;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import X.CFK;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import java.io.InputStream;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class PhotoContentHash {
    public static final PhotoContentHash INSTANCE = new PhotoContentHash();

    public final String compute(Context context, Uri uri) {
        boolean zA1b = AnonymousClass004.A1b(context, uri);
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256);
                byte[] bArr = new byte[65536];
                while (true) {
                    int i = inputStreamOpenInputStream.read(bArr);
                    if (i < 0) {
                        byte[] bArrDigest = messageDigest.digest();
                        C7384Etj.A0U(bArrDigest);
                        String strA0C = BFI.A0C("", PhotoContentHash$compute$1$1.INSTANCE, bArrDigest);
                        inputStreamOpenInputStream.close();
                        return strA0C;
                    }
                    messageDigest.update(bArr, zA1b ? 1 : 0, i);
                }
            } finally {
            }
        } catch (Exception e) {
            CFK.A08(PhotoContentHashKt.TAG, C60P.A1M(": ", e.getMessage(), C3cG.A0f(uri, "Failed to hash ")), e);
            return null;
        }
    }
}
