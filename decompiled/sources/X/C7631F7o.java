package X;

import com.instagram.common.bloks.BloksParseResult;
import java.util.Map;

/* renamed from: X.F7o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7631F7o {
    public final Map<String, BloksParseResult> A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7631F7o) && this.A00.equals(((C7631F7o) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C3cJ.A0M("BloksComponentQueryParseResult(components=", this.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7631F7o(Map<String, ? extends BloksParseResult> map) {
        this.A00 = map;
    }
}
