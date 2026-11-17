package X;

import com.instagram.common.bloks.BloksParseResult;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Hsv extends Huk {
    public final BloksParseResult A00;
    public final HoB A01;
    public final Map<String, Object> A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Hsv) {
                Hsv hsv = (Hsv) obj;
                if (!this.A00.equals(hsv.A00) || !this.A02.equals(hsv.A02) || !this.A01.equals(hsv.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hsv(BloksParseResult bloksParseResult, HoB hoB) {
        super(hoB);
        C9jH c9jH = C9jH.A00;
        this.A00 = bloksParseResult;
        this.A02 = c9jH;
        this.A01 = hoB;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0F(this.A02, AnonymousClass005.A0E(this.A00)));
    }

    public final String toString() {
        BloksParseResult bloksParseResult = this.A00;
        Map<String, Object> map = this.A02;
        HoB hoB = this.A01;
        StringBuilder sbA0f = C3cG.A0f(bloksParseResult, "Success(data=");
        sbA0f.append(", externalVariables=");
        sbA0f.append(map);
        return C3cJ.A0L(hoB, ", fetchSummaryData=", sbA0f);
    }
}
