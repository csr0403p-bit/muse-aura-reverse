package com.facebook.aura.tabs;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C10G;
import X.C1DG;
import X.C7BY;
import android.net.Uri;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import com.facebook.aura.network.api.HatchUrlSegments;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.common.dextricks.RuntimeInternals;

/* loaded from: classes.dex */
public abstract class SpaceNavigationIconKt {
    /* renamed from: SpaceFallbackIcon-THPkMYs, reason: not valid java name */
    public static final void m2305SpaceFallbackIconTHPkMYs(long j, float f, int i, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-943214803);
        int iA0M = (i2 & 6) == 0 ? AnonymousClass004.A0M(bfm, j) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0M |= AnonymousClass004.A05(bfm, f);
        }
        if ((i2 & 384) == 0) {
            iA0M |= AnonymousClass004.A0F(bfm, i);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0M |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0M |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0M), bfm, iA0M)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraIconKt.m2567AuraIconFHprtrg(C10G.A07(bRg2, f), BOf.A00(bfm, i, (iA0M >> 6) & 14), AuraIconSize.X_SMALL, null, j, null, bfm, AnonymousClass001.A0B(iA0M << 12, AnonymousClass001.A03()), 40);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new SpaceNavigationIconKt$SpaceFallbackIcon$1(j, f, i, bRg2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0290 A[PHI: r5
  0x0290: PHI (r5v25 java.lang.String) = (r5v7 java.lang.String), (r5v26 java.lang.String) binds: [B:88:0x014d, B:86:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0126  */
    /* renamed from: SpaceNavigationIcon-Ov4TPBQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2306SpaceNavigationIconOv4TPBQ(java.lang.String r33, java.lang.String r34, long r35, float r37, boolean r38, int r39, float r40, X.BRg r41, X.BFM r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.SpaceNavigationIconKt.m2306SpaceNavigationIconOv4TPBQ(java.lang.String, java.lang.String, long, float, boolean, int, float, X.BRg, X.BFM, int, int):void");
    }

    /* renamed from: SpaceXmdsOrFallbackIcon-3MZ6nm0, reason: not valid java name */
    public static final void m2307SpaceXmdsOrFallbackIcon3MZ6nm0(String str, long j, float f, int i, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-1799865483);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass007.A06(bfm, i);
        }
        int i4 = i3 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (str != null) {
                bfm.AgE(-1420681984);
                AuraImageKt.m2573AuraImageXRP3Ue8(str, C10G.A07(bRg2, f), null, null, null, false, new C1DG(f), j, false, false, false, B1V.A00(bfm, new SpaceNavigationIconKt$SpaceXmdsOrFallbackIcon$1(j, f, i), 1147412197), null, null, null, bfm, AnonymousClass001.A0C(iA0d << 18, AnonymousClass001.A05(iA0d << 12, (iA0d & 14) | 805309440)), 48, 30004);
            } else {
                bfm.AgE(-1420285711);
                m2305SpaceFallbackIconTHPkMYs(j, f, i, bRg2, bfm, (iA0d >> 3) & 8190, 0);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new SpaceNavigationIconKt$SpaceXmdsOrFallbackIcon$2(str, j, f, i, bRg2, i2, i3);
        }
    }

    public static final String savedIconKind(String str) {
        String strA0l;
        return (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() == 0) ? BrowserOperationCatalogKt.ABSENT : isHttpsUrl(strA0l) ? (C7BY.A0q(strA0l, "/media/raw/", false) || C7BY.A0q(strA0l, HatchUrlSegments.FS_RAW_SEGMENT, false)) ? "https_workspace" : "https" : strA0l.startsWith("http:") ? AuraDeeplinkHandlerActivity.HTTP : WorkspaceUriResolver.INSTANCE.isDaemonApiReference(strA0l) ? "daemon_api" : C7BY.A0k(strA0l, '/') ? "path" : C7BY.A0k(strA0l, HatchMapSceneKt.ARTIFACT_ID_SEPARATOR) ? "other_scheme" : "emoji_or_text";
    }

    public static final boolean isHttpsUrl(String str) {
        String host;
        Uri uri = Uri.parse(str);
        return (!"https".equals(uri.getScheme()) || (host = uri.getHost()) == null || host.length() == 0) ? false : true;
    }
}
