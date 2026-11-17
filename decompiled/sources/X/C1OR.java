package X;

import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "Use LinkAnnotatation.Url(url) instead", replaceWith = @ReplaceWith(expression = "LinkAnnotation.Url(url)", imports = {}))
/* renamed from: X.1OR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1OR implements C1OS {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1OR) && C7384Etj.areEqual(this.A00, ((C1OR) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return FGI.A0N("UrlAnnotation(url=", this.A00, ')');
    }

    public C1OR(String str) {
        this.A00 = str;
    }
}
