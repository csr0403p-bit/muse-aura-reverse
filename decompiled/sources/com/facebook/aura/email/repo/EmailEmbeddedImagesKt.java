package com.facebook.aura.email.repo;

import X.AbstractC10254Gss;
import X.AbstractC10315GuV;
import X.AnonymousClass006;
import X.BFI;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import X.Gt3;
import X.Gt8;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import com.facebook.aura.commands.invite.InviteUpsellHandlerKt;
import com.facebook.aura.commands.photos.MediaDeviceSyncClientKt;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.sharesheet.HatchShareSheetViewModelKt;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class EmailEmbeddedImagesKt {
    public static final String restoreEmbeddedEmailImages(String str) {
        String host;
        String queryParameter;
        int iA08;
        C7384Etj.A0Y(str, 0);
        if (!C7BY.A0q(str, "data%3aimage", true)) {
            return str;
        }
        Gt8 gt8A00 = AbstractC10315GuV.A00(str);
        C7384Etj.A0U(gt8A00);
        gt8A00.A01.A02 = false;
        Iterator<T> it = AbstractC10254Gss.A00("img[src]", gt8A00).iterator();
        C7384Etj.A0U(it);
        long j = 32000000;
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            C7384Etj.A0U(next);
            Gt3 gt3 = (Gt3) next;
            Uri uri = Uri.parse(gt3.A0B(InviteUpsellHandlerKt.SRC_PARAM));
            if ("https".equals(uri.getScheme()) && (host = uri.getHost()) != null) {
                Locale locale = Locale.ROOT;
                C7384Etj.A0V(locale);
                if (host.toLowerCase(locale).endsWith(HatchWidgetWebViewKt.META_CDN_HOST_SUFFIX) && BFI.A0H(new Integer[]{-1, 443}).contains(Integer.valueOf(uri.getPort())) && (queryParameter = uri.getQueryParameter("url")) != null && AnonymousClass006.A1b("data:image/", queryParameter) && (iA08 = C7BY.A08(queryParameter, ',', 0)) >= 0 && queryParameter.length() <= 2097152) {
                    String lowerCase = queryParameter.substring(0, iA08).toLowerCase(locale);
                    String strA0L = C7BY.A0L(";base64", C7BY.A0K(HatchWebPageParserKt.DATA_URI_PREFIX, lowerCase));
                    if (lowerCase.equals(FGI.A0U(HatchWebPageParserKt.DATA_URI_PREFIX, strA0L, ";base64")) && BFI.A0H(new String[]{HatchShareSheetViewModelKt.AVATAR_STORY_STICKER_MIME_TYPE, MediaDeviceSyncClientKt.FALLBACK_MIME, "image/gif", "image/webp"}).contains(strA0L)) {
                        try {
                            byte[] bArrDecode = Base64.decode(queryParameter.substring(iA08 + 1), 0);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                            int i = options.outWidth;
                            int i2 = options.outHeight;
                            long j2 = i * i2;
                            if (i > 0 && i2 > 0 && j2 <= j && C7384Etj.areEqual(options.outMimeType, strA0L)) {
                                j -= j2;
                                gt3.A0c(FGI.A0d(HatchWebPageParserKt.DATA_URI_PREFIX, strA0L, ";base64,", Base64.encodeToString(bArrDecode, 2)));
                                z = true;
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
            }
        }
        return z ? FGI.A0M(gt8A00.A0i().A0U(), gt8A00.A0h().A0U()) : str;
    }
}
