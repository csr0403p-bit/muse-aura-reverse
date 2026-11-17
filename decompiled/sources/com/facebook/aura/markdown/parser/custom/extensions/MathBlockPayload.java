package com.facebook.aura.markdown.parser.custom.extensions;

import X.C60O;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class MathBlockPayload {
    public final String expression;

    public MathBlockPayload(String str) {
        C7384Etj.A0Y(str, 0);
        this.expression = str;
    }

    public final MathBlockPayload copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new MathBlockPayload(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof MathBlockPayload) && C7384Etj.areEqual(this.expression, ((MathBlockPayload) obj).expression));
    }

    public static /* synthetic */ MathBlockPayload copy$default(MathBlockPayload mathBlockPayload, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mathBlockPayload.expression;
        }
        C7384Etj.A0Y(str, 0);
        return new MathBlockPayload(str);
    }

    public final String component1() {
        return this.expression;
    }

    public final String getExpression() {
        return this.expression;
    }

    public int hashCode() {
        return this.expression.hashCode();
    }

    public String toString() {
        return C60O.A0r("MathBlockPayload(expression=", this.expression);
    }
}
