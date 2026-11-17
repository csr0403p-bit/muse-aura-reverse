package com.facebook.aura.shopping.view;

import X.Ab3;
import X.AnonymousClass001;
import X.C3cI;
import X.C7384Etj;
import X.C8j2;
import X.FGI;
import X.HxS;
import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class HatchStaticMapUriKt {
    public static final double EquatorMetresPerPoint = 156543.03392d;
    public static final int MaxScale = 2;
    public static final int MaxSizePoints = 640;
    public static final int MaxZoom = 14;
    public static final double MetresPerKm = 1000.0d;
    public static final double MinCosLatitude = 0.01d;
    public static final int MinZoom = 2;
    public static final String StaticMapBaseUrl = "https://www.facebook.com/maps/static/";
    public static final double TargetRadiusPoints = 55.0d;

    /* renamed from: buildApproximateLocationMapUri-3EhgFcU, reason: not valid java name */
    public static final String m2048buildApproximateLocationMapUri3EhgFcU(double d, double d2, double d3, int i, float f, float f2, long j, boolean z, String str) {
        int iA00;
        C7384Etj.A0Y(str, 8);
        if (i > 0 && f > 0.0f && d3 > 0.0d) {
            if (i > 640) {
                i = 640;
            }
            int iA01 = Ab3.A01(i / f);
            if (iA01 > 0 && (iA00 = Ab3.A00(d3 * 1000.0d)) > 0) {
                String strA0U = FGI.A0U(toCoordinate(d), ",", toCoordinate(d2));
                Uri.Builder builderAppendQueryParameter = Uri.parse(StaticMapBaseUrl).buildUpon().appendQueryParameter("size", FGI.A07(i, iA01, "x"));
                int iA012 = Ab3.A01(f2);
                if (iA012 < 1) {
                    iA012 = 1;
                } else if (iA012 > 2) {
                    iA012 = 2;
                }
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("scale", String.valueOf(iA012)).appendQueryParameter("center", strA0U).appendQueryParameter("zoom", String.valueOf(zoomForRadius(d, iA00)));
                StringBuilder sbA0x = C3cI.A0x("color:", m2049toStaticMapColor8_81llA(j));
                sbA0x.append("|");
                sbA0x.append(strA0U);
                sbA0x.append("|");
                sbA0x.append(iA00);
                return builderAppendQueryParameter2.appendQueryParameter("circle", AnonymousClass001.A0v("m", sbA0x)).appendQueryParameter("theme", z ? "dark" : "default").appendQueryParameter("language", currentMapLanguage()).appendQueryParameter(C8j2.A00(61), str).build().toString();
            }
        }
        return null;
    }

    public static final String toCoordinate(double d) {
        return String.format(Locale.US, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
    }

    public static final String currentMapLanguage() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        if (language.length() == 0) {
            language = "en";
        }
        String country = locale.getCountry();
        C7384Etj.A0U(country);
        return country.length() == 0 ? language : FGI.A0U(language, "_", locale.getCountry());
    }

    /* renamed from: toStaticMapColor-8_81llA, reason: not valid java name */
    public static final String m2049toStaticMapColor8_81llA(long j) {
        int iA01 = HxS.A01(j);
        return String.format(Locale.US, "0x%08X", Arrays.copyOf(new Object[]{Integer.valueOf((iA01 >>> 24) | (iA01 << 8))}, 1));
    }

    public static final int zoomForRadius(double d, int i) {
        double dCos = Math.cos(Math.toRadians(d));
        if (dCos < 0.01d) {
            dCos = 0.01d;
        }
        int iA00 = Ab3.A00(Math.log(((dCos * 156543.03392d) * 55.0d) / i) / Math.log(2.0d));
        if (iA00 < 2) {
            return 2;
        }
        if (iA00 > 14) {
            return 14;
        }
        return iA00;
    }
}
