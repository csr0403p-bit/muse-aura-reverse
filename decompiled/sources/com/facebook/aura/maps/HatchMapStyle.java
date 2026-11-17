package com.facebook.aura.maps;

import X.Ab3;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C31u;
import X.C7354EnR;
import X.C7384Etj;
import X.C9tJ;
import X.EGb;
import X.InterfaceC7359EnW;
import com.facebook.aura.maps.MC;
import com.facebook.aura.maps.scene.HatchMapTheme;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;

/* loaded from: classes4.dex */
public final class HatchMapStyle {
    public static final int $stable = 0;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7354EnR(HatchMapStyle.class, "configuredLightStyleUrl", "getConfiguredLightStyleUrl()Ljava/lang/String;", 0), new C7354EnR(HatchMapStyle.class, "configuredDarkStyleUrl", "getConfiguredDarkStyleUrl()Ljava/lang/String;", 0), new C7354EnR(HatchMapStyle.class, "configuredLightBackgroundColor", "getConfiguredLightBackgroundColor()Ljava/lang/String;", 0), new C7354EnR(HatchMapStyle.class, "configuredDarkBackgroundColor", "getConfiguredDarkBackgroundColor()Ljava/lang/String;", 0)};
    public static final HatchMapStyle INSTANCE = new HatchMapStyle();
    public static final C31u configuredLightStyleUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android_maps.style_url_light);
    public static final C31u configuredDarkStyleUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android_maps.style_url_dark);
    public static final C31u configuredLightBackgroundColor$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_maps.style_background_light);
    public static final C31u configuredDarkBackgroundColor$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_maps.style_background_dark);

    public final class StyleColorScanner {
        public int position;
        public final String value;

        public StyleColorScanner(String str) {
            C7384Etj.A0Y(str, 0);
            this.value = str;
        }

        private final void advanceCodePoint() {
            int i = this.position;
            this.position = i + Character.charCount(this.value.codePointAt(i));
        }

        private final Integer currentCodePoint() {
            int i = this.position;
            String str = this.value;
            if (i < str.length()) {
                return Integer.valueOf(str.codePointAt(i));
            }
            return null;
        }

        private final void skipWhitespace() {
            while (true) {
                Integer numCurrentCodePoint = currentCodePoint();
                if (numCurrentCodePoint == null || !Character.isWhitespace(numCurrentCodePoint.intValue())) {
                    return;
                } else {
                    advanceCodePoint();
                }
            }
        }

        public final boolean isAtEnd() {
            skipWhitespace();
            return AnonymousClass002.A1Q(this.position, this.value.length());
        }

        public final boolean scan(char c) {
            skipWhitespace();
            Integer numCurrentCodePoint = currentCodePoint();
            if (numCurrentCodePoint == null || numCurrentCodePoint.intValue() != c) {
                return false;
            }
            advanceCodePoint();
            return true;
        }

        public final Float scanFloat() {
            Integer numCurrentCodePoint;
            Float fA0w;
            skipWhitespace();
            int i = this.position;
            Integer numCurrentCodePoint2 = currentCodePoint();
            if ((numCurrentCodePoint2 != null && numCurrentCodePoint2.intValue() == 43) || ((numCurrentCodePoint = currentCodePoint()) != null && numCurrentCodePoint.intValue() == 45)) {
                advanceCodePoint();
            }
            boolean z = false;
            while (true) {
                Integer numCurrentCodePoint3 = currentCodePoint();
                if (numCurrentCodePoint3 == null || !Character.isDigit(numCurrentCodePoint3.intValue())) {
                    break;
                }
                advanceCodePoint();
                z = true;
            }
            Integer numCurrentCodePoint4 = currentCodePoint();
            if (numCurrentCodePoint4 != null && numCurrentCodePoint4.intValue() == 46) {
                advanceCodePoint();
                while (true) {
                    Integer numCurrentCodePoint5 = currentCodePoint();
                    if (numCurrentCodePoint5 == null || !Character.isDigit(numCurrentCodePoint5.intValue())) {
                        break;
                    }
                    advanceCodePoint();
                    z = true;
                }
            }
            if (!z || (fA0w = C9tJ.A0w(this.value.substring(i, this.position))) == null || Math.abs(fA0w.floatValue()) > Float.MAX_VALUE) {
                return null;
            }
            return fA0w;
        }

        public final String scanLetters() {
            skipWhitespace();
            int i = this.position;
            while (true) {
                Integer numCurrentCodePoint = currentCodePoint();
                if (numCurrentCodePoint == null || !Character.isLetter(numCurrentCodePoint.intValue())) {
                    break;
                }
                advanceCodePoint();
            }
            String strSubstring = this.value.substring(i, this.position);
            if (strSubstring.length() <= 0) {
                return null;
            }
            return strSubstring;
        }
    }

    private final String getConfiguredDarkBackgroundColor() {
        return (String) configuredDarkBackgroundColor$delegate.getValue(this, $$delegatedProperties[3]);
    }

    private final String getConfiguredDarkStyleUrl() {
        return (String) configuredDarkStyleUrl$delegate.getValue(this, $$delegatedProperties[1]);
    }

    private final String getConfiguredLightBackgroundColor() {
        return (String) configuredLightBackgroundColor$delegate.getValue(this, $$delegatedProperties[2]);
    }

    private final String getConfiguredLightStyleUrl() {
        return (String) configuredLightStyleUrl$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final Integer parseStyleColor(String str) {
        Float fScanFloat;
        Float fScanFloat2;
        Float fScanFloat3;
        Float fScanFloat4;
        float fFloatValue;
        StyleColorScanner styleColorScanner = new StyleColorScanner(str);
        String strScanLetters = styleColorScanner.scanLetters();
        if (strScanLetters != null) {
            String strA0u = AnonymousClass001.A0u(strScanLetters);
            if (styleColorScanner.scan('(') && (fScanFloat = styleColorScanner.scanFloat()) != null) {
                float fFloatValue2 = fScanFloat.floatValue();
                if (styleColorScanner.scan(',') && (fScanFloat2 = styleColorScanner.scanFloat()) != null) {
                    float fFloatValue3 = fScanFloat2.floatValue();
                    if (styleColorScanner.scan('%') && styleColorScanner.scan(',') && (fScanFloat3 = styleColorScanner.scanFloat()) != null) {
                        float fFloatValue4 = fScanFloat3.floatValue();
                        if (styleColorScanner.scan('%')) {
                            if (!strA0u.equals("hsl")) {
                                fFloatValue = (strA0u.equals("hsla") && styleColorScanner.scan(',') && (fScanFloat4 = styleColorScanner.scanFloat()) != null) ? fScanFloat4.floatValue() : 1.0f;
                            }
                            if (styleColorScanner.scan(')') && styleColorScanner.isAtEnd() && 0.0f <= fFloatValue3 && fFloatValue3 <= 100.0f && 0.0f <= fFloatValue4 && fFloatValue4 <= 100.0f && 0.0f <= fFloatValue && fFloatValue <= 1.0f) {
                                return Integer.valueOf(EGb.A05(EGb.A06(new float[]{((fFloatValue2 % 360.0f) + 360.0f) % 360.0f, fFloatValue3 / 100.0f, fFloatValue4 / 100.0f}), Ab3.A02(fFloatValue, 255.0f)));
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final int getDarkBackgroundColor() {
        Integer styleColor = parseStyleColor(getConfiguredDarkBackgroundColor());
        return styleColor != null ? styleColor.intValue() : HatchMapTheme.DEFAULT_DARK_BACKGROUND_COLOR;
    }

    public final String getDarkStyleUrl() {
        String configuredDarkStyleUrl = getConfiguredDarkStyleUrl();
        return configuredDarkStyleUrl.length() == 0 ? HatchMapTheme.DEFAULT_DARK_STYLE_URL : configuredDarkStyleUrl;
    }

    public final int getLightBackgroundColor() {
        Integer styleColor = parseStyleColor(getConfiguredLightBackgroundColor());
        return styleColor != null ? styleColor.intValue() : HatchMapTheme.DEFAULT_LIGHT_BACKGROUND_COLOR;
    }

    public final String getLightStyleUrl() {
        String configuredLightStyleUrl = getConfiguredLightStyleUrl();
        return configuredLightStyleUrl.length() == 0 ? HatchMapTheme.DEFAULT_LIGHT_STYLE_URL : configuredLightStyleUrl;
    }
}
