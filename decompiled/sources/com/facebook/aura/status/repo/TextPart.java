package com.facebook.aura.status.repo;

import X.AnonymousClass001;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class TextPart extends C06G {
    public final boolean bold;
    public final String text;

    public TextPart(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.text = str;
        this.bold = z;
    }

    public final TextPart copy(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new TextPart(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextPart) {
                TextPart textPart = (TextPart) obj;
                if (!C7384Etj.areEqual(this.text, textPart.text) || this.bold != textPart.bold) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TextPart copy$default(TextPart textPart, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textPart.text;
        }
        if ((i & 2) != 0) {
            z = textPart.bold;
        }
        C7384Etj.A0Y(str, 0);
        return new TextPart(str, z);
    }

    public final String component1() {
        return this.text;
    }

    public final boolean component2() {
        return this.bold;
    }

    public final boolean getBold() {
        return this.bold;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass001.A0G(this.text), this.bold);
    }

    public String toString() {
        return super.toString();
    }
}
