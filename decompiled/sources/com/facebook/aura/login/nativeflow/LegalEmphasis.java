package com.facebook.aura.login.nativeflow;

import X.C06G;

/* loaded from: classes.dex */
public final class LegalEmphasis extends C06G {
    public final int length;
    public final int offset;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LegalEmphasis) {
                LegalEmphasis legalEmphasis = (LegalEmphasis) obj;
                if (this.offset != legalEmphasis.offset || this.length != legalEmphasis.length) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LegalEmphasis copy$default(LegalEmphasis legalEmphasis, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = legalEmphasis.offset;
        }
        if ((i3 & 2) != 0) {
            i2 = legalEmphasis.length;
        }
        return new LegalEmphasis(i, i2);
    }

    public final int component1() {
        return this.offset;
    }

    public final int component2() {
        return this.length;
    }

    public final LegalEmphasis copy(int i, int i2) {
        return new LegalEmphasis(i, i2);
    }

    public final int getLength() {
        return this.length;
    }

    public final int getOffset() {
        return this.offset;
    }

    public int hashCode() {
        return (this.offset * 31) + this.length;
    }

    public LegalEmphasis(int i, int i2) {
        this.offset = i;
        this.length = i2;
    }

    public String toString() {
        return super.toString();
    }
}
