package X;

import android.net.Uri;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Eht, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7183Eht {
    public int A00;
    public File A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final EUs A05;
    public final C7198EiA A06;
    public final EnumC7203EiK A07;
    public final C7481Exe A08;
    public final C1bk A09;
    public final BXh A0A;
    public final InterfaceC7250EjU A0B;
    public final BYN A0C;
    public final EnumC7058Ef5 A0D;
    public final Boolean A0E;
    public final Boolean A0F;
    public final Boolean A0G;
    public final String A0H;
    public final String A0I;
    public final Map A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;

    public final synchronized File A00() {
        File fileA0G;
        fileA0G = this.A01;
        if (fileA0G == null) {
            Uri uri = this.A04;
            uri.getPath().getClass();
            fileA0G = BV4.A0G(uri.getPath());
            this.A01 = fileA0G;
        }
        return fileA0G;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7183Eht)) {
            return false;
        }
        C7183Eht c7183Eht = (C7183Eht) obj;
        if (this.A0L != c7183Eht.A0L || this.A0O != c7183Eht.A0O || this.A0P != c7183Eht.A0P || !AbstractC7213Eib.A00(this.A04, c7183Eht.A04) || !AbstractC7213Eib.A00(this.A0C, c7183Eht.A0C) || !AbstractC7213Eib.A00(this.A0I, c7183Eht.A0I) || !AbstractC7213Eib.A00(this.A0H, c7183Eht.A0H) || !AbstractC7213Eib.A00(this.A01, c7183Eht.A01) || !AbstractC7213Eib.A00(this.A05, c7183Eht.A05) || !AbstractC7213Eib.A00(this.A06, c7183Eht.A06) || !AbstractC7213Eib.A00(this.A08, c7183Eht.A08) || !AbstractC7213Eib.A00(this.A07, c7183Eht.A07) || !AbstractC7213Eib.A00(this.A0D, c7183Eht.A0D) || !AbstractC7213Eib.A00(Integer.valueOf(this.A00), Integer.valueOf(c7183Eht.A00)) || !AbstractC7213Eib.A00(this.A0E, c7183Eht.A0E) || !AbstractC7213Eib.A00(this.A0G, c7183Eht.A0G) || !AbstractC7213Eib.A00(this.A0A, c7183Eht.A0A) || !AbstractC7213Eib.A00(this.A09, c7183Eht.A09) || this.A0K != c7183Eht.A0K || this.A0F != c7183Eht.A0F) {
            return false;
        }
        Map map = this.A0J;
        Map map2 = c7183Eht.A0J;
        if (map != map2) {
            if (map2 != null) {
                Iterator itA0n = AnonymousClass002.A0n(map2);
                if (itA0n.hasNext()) {
                    C3cH.A0l(itA0n).getKey();
                    throw BV4.A0a("getAffectsEquality");
                }
            }
            if (map != null) {
                Iterator itA0n2 = AnonymousClass002.A0n(map);
                if (itA0n2.hasNext()) {
                    C3cH.A0l(itA0n2).getKey();
                    throw BV4.A0a("getAffectsEquality");
                }
            }
        }
        return this.A02 == c7183Eht.A02;
    }

    public final int hashCode() {
        int iA0G = (AnonymousClass005.A0G(Boolean.valueOf(this.A0K), AnonymousClass005.A0G(Integer.valueOf(this.A02), ((((((((((((((AnonymousClass005.A0G(Boolean.valueOf(this.A0P), AnonymousClass005.A0G(Boolean.valueOf(this.A0O), AnonymousClass005.A0G(Integer.valueOf(this.A00), ((((((AnonymousClass005.A0G(Boolean.valueOf(this.A0L), ((C60R.A01(this.A0C) * 31) + C60R.A01(this.A04)) * 31) * 31) + C60R.A01(this.A05)) * 31) + C60R.A01(this.A07)) * 31) + C60R.A01(this.A0D)) * 31) * 31) * 31) * 31) + C60R.A01(this.A06)) * 31) + C60R.A01(this.A0E)) * 31) + C60R.A01(this.A08)) * 31) + C60R.A01(this.A09)) * 31 * 31) + C60R.A01(this.A0G)) * 31) + C60R.A01(this.A0A)) * 31) + C60R.A01(this.A0H)) * 31) * 31) * 31) + C60R.A01(this.A0F);
        Map map = this.A0J;
        if (map != null) {
            Iterator itA0n = AnonymousClass002.A0n(map);
            if (itA0n.hasNext()) {
                C3cH.A0l(itA0n).getKey();
                throw BV4.A0a("getAffectsEquality");
            }
        }
        return iA0G;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7183Eht(X.C7184Ehu r5) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7183Eht.<init>(X.Ehu):void");
    }

    public final String toString() {
        C7200EiD c7200EiD = new C7200EiD(C3cI.A0Y(this));
        C7200EiD.A00(c7200EiD, this.A04, "uri");
        C7200EiD.A00(c7200EiD, this.A0C, "cacheChoice");
        C7200EiD.A00(c7200EiD, this.A06, "decodeOptions");
        C7200EiD.A00(c7200EiD, null, "postprocessor");
        C7200EiD.A00(c7200EiD, this.A07, "priority");
        C7200EiD.A00(c7200EiD, this.A08, "resizeOptions");
        C7200EiD.A00(c7200EiD, this.A09, "rotationOptions");
        C7200EiD.A00(c7200EiD, this.A05, "bytesRange");
        C7200EiD.A00(c7200EiD, this.A0G, "resizingAllowedOverride");
        C7200EiD.A00(c7200EiD, this.A0A, "downsampleOverride");
        c7200EiD.A02("progressiveRenderingEnabled", this.A0M);
        c7200EiD.A02("localThumbnailPreviewsEnabled", this.A0L);
        c7200EiD.A02("loadThumbnailOnly", this.A0K);
        C7200EiD.A00(c7200EiD, this.A0D, "lowestPermittedRequestLevel");
        C7200EiD.A01(c7200EiD, "cachesDisabled", this.A00);
        c7200EiD.A02("isDiskCacheEnabled", this.A0O);
        c7200EiD.A02("isMemoryCacheEnabled", this.A0P);
        C7200EiD.A00(c7200EiD, this.A0E, "decodePrefetches");
        C7200EiD.A00(c7200EiD, this.A0H, "customCacheKey");
        C7200EiD.A01(c7200EiD, "delayMs", this.A02);
        C7200EiD.A00(c7200EiD, this.A0F, "isFirstFrameThumbnailEnabled");
        C7200EiD.A00(c7200EiD, this.A0J, "extras");
        return c7200EiD.toString();
    }
}
