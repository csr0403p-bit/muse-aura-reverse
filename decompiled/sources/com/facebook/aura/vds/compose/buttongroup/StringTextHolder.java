package com.facebook.aura.vds.compose.buttongroup;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import android.content.Context;

/* loaded from: classes.dex */
public final class StringTextHolder extends C06G implements TextHolder {
    public final String buttonText;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof StringTextHolder) && C7384Etj.areEqual(this.buttonText, ((StringTextHolder) obj).buttonText));
    }

    public static /* synthetic */ StringTextHolder copy$default(StringTextHolder stringTextHolder, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stringTextHolder.buttonText;
        }
        return new StringTextHolder(str);
    }

    public final String component1() {
        return this.buttonText;
    }

    public final StringTextHolder copy(String str) {
        return new StringTextHolder(str);
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.buttonText);
    }

    public StringTextHolder(String str) {
        this.buttonText = str;
    }

    public String toString() {
        return super.toString();
    }

    @Override // com.facebook.aura.vds.compose.buttongroup.TextHolder
    public String getText(Context context) {
        return this.buttonText;
    }
}
