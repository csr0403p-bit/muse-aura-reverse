package androidx.media3.common;

import X.BV8;
import X.C60O;
import X.FGI;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.io.IOException;

/* loaded from: classes5.dex */
public class ParserException extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public static ParserException A00(String str) {
        return new ParserException(str, null, 1, false);
    }

    public ParserException(String str, Throwable th, int i, boolean z) {
        super(str, th);
        this.contentIsMalformed = z;
        this.dataType = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(message != null ? FGI.A0M(message, InviteCodeScratcherKt.CODE_SEPARATOR) : "");
        sbA0w.append("{contentIsMalformed=");
        sbA0w.append(this.contentIsMalformed);
        sbA0w.append(", dataType=");
        return BV8.A0z(sbA0w, this.dataType);
    }
}
