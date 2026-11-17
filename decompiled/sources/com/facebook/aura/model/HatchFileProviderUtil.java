package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BV5;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.F2D;
import X.FGI;
import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.facebook.aura.bugreport.AuraBugReportSender;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class HatchFileProviderUtil {
    public static final int $stable = 0;
    public static final String AUTHORITY_SUFFIX = ".aura.fileprovider";
    public static final HatchFileProviderUtil INSTANCE = new HatchFileProviderUtil();

    public final Uri createCaptureUri(Context context) {
        C7384Etj.A0Y(context, 0);
        return getUriForFile(context, C3cG.A0O(context.getCacheDir(), AnonymousClass001.A0v(AuraBugReportSender.DEFAULT_IMAGE_EXTENSION, BV5.A0q(UUID.randomUUID()))));
    }

    public final Uri getUriForFile(Context context, File file) {
        AnonymousClass003.A0u(context, file);
        F2D f2d = (F2D) FileProvider.A01(context, FGI.A0M(context.getPackageName(), AUTHORITY_SUFFIX), 0);
        try {
            String canonicalPath = file.getCanonicalPath();
            Iterator itA0i = C3cG.A0i(f2d.A01);
            Map.Entry entry = null;
            while (itA0i.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0i);
                String path = ((File) entryA0l.getValue()).getPath();
                if (F2D.A00(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entryA0l;
                }
            }
            if (entry == null) {
                throw C60Q.A0U("Failed to find configured root that contains ", canonicalPath);
            }
            String path2 = ((File) entry.getValue()).getPath();
            boolean zEndsWith = path2.endsWith(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
            int length = path2.length();
            if (!zEndsWith) {
                length++;
            }
            Uri uriBuild = new Uri.Builder().scheme("content").authority(f2d.A00).encodedPath(FGI.A0O(Uri.encode(C60O.A0t(entry)), Uri.encode(canonicalPath.substring(length), CustomConnectorRegisterRepositoryKt.ROOT_PATH), '/')).build();
            C7384Etj.A0U(uriBuild);
            return uriBuild;
        } catch (IOException unused) {
            throw BV5.A0O(file, "Failed to resolve canonical path for ");
        }
    }
}
