package X;

import com.instagram.common.bloks.BloksParseResult;

/* loaded from: classes6.dex */
public final class F9U {
    public final BloksParseResult A00;
    public final FAW A01;
    public final FAS<?> A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof F9U) {
                F9U f9u = (F9U) obj;
                if (!this.A01.equals(f9u.A01) || !this.A02.equals(f9u.A02) || !this.A00.equals(f9u.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0F(this.A02, AnonymousClass005.A0E(this.A01)));
    }

    public final String toString() {
        FAW faw = this.A01;
        FAS<?> fas = this.A02;
        BloksParseResult bloksParseResult = this.A00;
        StringBuilder sbA0f = C3cG.A0f(faw, "BloksTreeManagerModification(target=");
        sbA0f.append(", updateOperation=");
        sbA0f.append(fas);
        return C3cJ.A0L(bloksParseResult, ", parseResult=", sbA0f);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FAW;LX/FAS<*>;Lcom/instagram/common/bloks/BloksParseResult;)V */
    public F9U(BloksParseResult bloksParseResult, FAW faw, FAS fas) {
        AnonymousClass003.A0u(faw, fas);
        this.A01 = faw;
        this.A02 = fas;
        this.A00 = bloksParseResult;
    }
}
