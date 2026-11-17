package com.facebook.aura.markdown.render;

import X.AnonymousClass002;
import X.C7BY;
import X.C7LE;

/* loaded from: classes.dex */
public abstract class BulletMarkerKt {
    public static final String DEFAULT_BULLET_GLYPH = "\u2022";
    public static final String LITERAL_BULLET_GLYPHS = "\u2022\u25e6\u2023\u2043";

    public static final boolean startsWithBulletMarker(String str, String str2, int i, int i2) {
        int i3;
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        while (i < i2 && C7LE.A00(str.charAt(i))) {
            i++;
        }
        if (i < i2) {
            int length = str2.length();
            if (length > 0 && str.startsWith(str2, i)) {
                i3 = i + length;
                if (i3 >= i2) {
                }
            } else if (C7BY.A0k(LITERAL_BULLET_GLYPHS, str.charAt(i))) {
                length = 1;
                i3 = i + length;
                if (i3 >= i2 && C7LE.A00(str.charAt(i3))) {
                    return zA1a;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean startsWithBulletMarker$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return startsWithBulletMarker(str, str2, i, i2);
    }
}
