package com.facebook.aura.file.view;

import X.AII;
import X.AIM;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.C7109EgN;
import X.C7182Ehs;
import X.C7184Ehu;
import X.C7384Etj;
import X.C7Je;
import X.InterfaceC7168Ehd;
import android.net.Uri;
import com.facebook.aura.gateway.HatchThumbnailDisplaySize;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class HatchImageCacheEvictor {
    public static final int $stable = 0;
    public static final HatchImageCacheEvictor INSTANCE = new HatchImageCacheEvictor();

    public final void evictForDeletedPath(String str, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0u(str, abstractC3358CGz);
        C7182Ehs c7182EhsA06 = C7109EgN.A03().A06();
        AII aiiA17 = AIM.A17();
        WorkspaceUriResolver workspaceUriResolver = WorkspaceUriResolver.INSTANCE;
        String strResolveRawAssetUrl = workspaceUriResolver.resolveRawAssetUrl(str, abstractC3358CGz);
        if (strResolveRawAssetUrl != null) {
            aiiA17.add(strResolveRawAssetUrl);
        }
        Iterator it = AbstractC0878AGe.A0P(BFI.A0G(HatchThumbnailDisplaySize.values()), Collections.singletonList(null)).iterator();
        while (it.hasNext()) {
            String strResolveThumbnailUrl = workspaceUriResolver.resolveThumbnailUrl(str, abstractC3358CGz, (HatchThumbnailDisplaySize) it.next());
            if (strResolveThumbnailUrl != null) {
                aiiA17.add(strResolveThumbnailUrl);
            }
        }
        Iterator<E> it2 = AIM.A18(aiiA17).iterator();
        while (it2.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it2);
            Uri uriA01 = null;
            try {
                uriA01 = C7Je.A01(strA0j);
            } catch (SecurityException | UnsupportedOperationException unused) {
            }
            if (uriA01 != null) {
                final Uri uriBuild = uriA01.buildUpon().clearQuery().build();
                C7384Etj.A0X(uriBuild);
                InterfaceC7168Ehd interfaceC7168Ehd = new InterfaceC7168Ehd() { // from class: X.3Ep
                    @Override // X.InterfaceC7168Ehd
                    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                        CCV ccv = (CCV) obj;
                        C7384Etj.A0Y(ccv, 0);
                        return ccv.A75(uriBuild);
                    }
                };
                c7182EhsA06.A04.Aaf(interfaceC7168Ehd);
                c7182EhsA06.A05.Aaf(interfaceC7168Ehd);
                Iterator it3 = BFI.A0H(new String[]{strA0j, uriBuild.toString()}).iterator();
                while (it3.hasNext()) {
                    String strA0j2 = AnonymousClass005.A0j(it3);
                    C7184Ehu c7184Ehu = new C7184Ehu();
                    c7184Ehu.A02 = uriA01;
                    c7184Ehu.A0F = strA0j2;
                    C7182Ehs.A02(c7182EhsA06, c7184Ehu.A01());
                }
            }
        }
    }
}
