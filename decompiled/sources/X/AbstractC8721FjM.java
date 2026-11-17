package X;

import android.graphics.BlendMode;

/* renamed from: X.FjM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8721FjM {
    public static final BlendMode A00(int i) {
        if (i == 0) {
            return BlendMode.CLEAR;
        }
        if (i == 1) {
            return BlendMode.SRC;
        }
        if (i == 2) {
            return BlendMode.DST;
        }
        if (i != 3) {
            if (i == 4) {
                return BlendMode.DST_OVER;
            }
            if (i == 5) {
                return BlendMode.SRC_IN;
            }
            if (i == 6) {
                return BlendMode.DST_IN;
            }
            if (i == 7) {
                return BlendMode.SRC_OUT;
            }
            if (i == 8) {
                return BlendMode.DST_OUT;
            }
            if (i == 9) {
                return BlendMode.SRC_ATOP;
            }
            if (i == 10) {
                return BlendMode.DST_ATOP;
            }
            if (i == 11) {
                return BlendMode.XOR;
            }
            if (i == 12) {
                return BlendMode.PLUS;
            }
            if (i == 13) {
                return BlendMode.MODULATE;
            }
            if (i == 14) {
                return BlendMode.SCREEN;
            }
            if (i == 15) {
                return BlendMode.OVERLAY;
            }
            if (i == 16) {
                return BlendMode.DARKEN;
            }
            if (i == 17) {
                return BlendMode.LIGHTEN;
            }
            if (i == 18) {
                return BlendMode.COLOR_DODGE;
            }
            if (i == 19) {
                return BlendMode.COLOR_BURN;
            }
            if (i == 20) {
                return BlendMode.HARD_LIGHT;
            }
            if (i == 21) {
                return BlendMode.SOFT_LIGHT;
            }
            if (i == 22) {
                return BlendMode.DIFFERENCE;
            }
            if (i == 23) {
                return BlendMode.EXCLUSION;
            }
            if (i == 24) {
                return BlendMode.MULTIPLY;
            }
            if (i == 25) {
                return BlendMode.HUE;
            }
            if (i == 26) {
                return BlendMode.SATURATION;
            }
            if (i == 27) {
                return BlendMode.COLOR;
            }
            if (i == 28) {
                return BlendMode.LUMINOSITY;
            }
        }
        return BlendMode.SRC_OVER;
    }
}
