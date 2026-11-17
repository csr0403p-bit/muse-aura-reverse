package X;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class CM3 extends CM1 {
    @Override // X.CM1
    public final Font A02(CLt cLt) throws IOException {
        Font fontA03;
        Uri uri = cLt.A03;
        String authority = C6xC.A00(uri.getScheme(), "systemfont") ? uri.getAuthority() : null;
        Font fontBuild = null;
        if (authority != null) {
            Typeface typefaceCreate = Typeface.create(authority, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontA03 = CM2.A03(typefaceCreate)) != null) {
                String str = cLt.A04;
                if (TextUtils.isEmpty(str)) {
                    return fontA03;
                }
                try {
                    fontBuild = new Font.Builder(fontA03).setFontVariationSettings(str).build();
                    return fontBuild;
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return fontBuild;
                }
            }
        }
        return null;
    }
}
