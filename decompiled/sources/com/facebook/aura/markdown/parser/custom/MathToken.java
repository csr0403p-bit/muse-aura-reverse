package com.facebook.aura.markdown.parser.custom;

import X.AnonymousClass001;
import X.C0KA;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes4.dex */
public final class MathToken {
    public final String expression;
    public final boolean isBlock;

    public MathToken(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.expression = str;
        this.isBlock = z;
    }

    public final MathToken copy(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new MathToken(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MathToken) {
                MathToken mathToken = (MathToken) obj;
                if (!C7384Etj.areEqual(this.expression, mathToken.expression) || this.isBlock != mathToken.isBlock) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MathToken copy$default(MathToken mathToken, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mathToken.expression;
        }
        if ((i & 2) != 0) {
            z = mathToken.isBlock;
        }
        C7384Etj.A0Y(str, 0);
        return new MathToken(str, z);
    }

    public final String component1() {
        return this.expression;
    }

    public final boolean component2() {
        return this.isBlock;
    }

    public final String getExpression() {
        return this.expression;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass001.A0G(this.expression), this.isBlock);
    }

    public final boolean isBlock() {
        return this.isBlock;
    }

    public String toString() {
        return FGI.A0n("MathToken(expression=", this.expression, ", isBlock=", ")", this.isBlock);
    }
}
