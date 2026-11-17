package com.facebook.aura.markdown.parser.custom.extensions;

import X.C60O;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class InlineMathPayload {
    public final String expression;

    public InlineMathPayload(String str) {
        C7384Etj.A0Y(str, 0);
        this.expression = str;
    }

    public final InlineMathPayload copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new InlineMathPayload(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof InlineMathPayload) && C7384Etj.areEqual(this.expression, ((InlineMathPayload) obj).expression));
    }

    public static /* synthetic */ InlineMathPayload copy$default(InlineMathPayload inlineMathPayload, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inlineMathPayload.expression;
        }
        C7384Etj.A0Y(str, 0);
        return new InlineMathPayload(str);
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
        return C60O.A0r("InlineMathPayload(expression=", this.expression);
    }
}
