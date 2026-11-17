package com.facebook.aura.markdown.render.inline;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C60N;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes4.dex */
public final class InlineMathEntity {
    public static final int $stable = 0;
    public final String expression;
    public final String key;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InlineMathEntity) {
                InlineMathEntity inlineMathEntity = (InlineMathEntity) obj;
                if (!C7384Etj.areEqual(this.key, inlineMathEntity.key) || !C7384Etj.areEqual(this.expression, inlineMathEntity.expression)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ InlineMathEntity copy$default(InlineMathEntity inlineMathEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inlineMathEntity.key;
        }
        if ((i & 2) != 0) {
            str2 = inlineMathEntity.expression;
        }
        AnonymousClass003.A0u(str, str2);
        return new InlineMathEntity(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.expression;
    }

    public final String getExpression() {
        return this.expression;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.expression, AnonymousClass001.A0G(this.key));
    }

    public String toString() {
        return FGI.A0h("InlineMathEntity(key=", this.key, C60N.A00(35), this.expression, ")");
    }

    public InlineMathEntity(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.key = str;
        this.expression = str2;
    }

    public final InlineMathEntity copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new InlineMathEntity(str, str2);
    }
}
