package androidx.compose.runtime.tooling;

import X.AH3;
import X.AII;
import X.AIM;
import X.AbstractC0882AGj;
import X.BFI;
import X.BHL;
import X.C0893AGu;
import X.C0904AHg;
import X.C3cG;
import X.C60O;
import X.FGI;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class DiagnosticComposeException extends RuntimeException {
    public final C0904AHg trace;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Throwable
    public final String getMessage() {
        C0904AHg c0904AHg = this.trace;
        if (!c0904AHg.A01) {
            return "Composition stack when thrown:";
        }
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append("Composition stack when thrown:\n");
        AII aiiA17 = AIM.A17();
        C0893AGu c0893AGuA1B = BHL.A1B(c0904AHg.A00);
        int size = c0893AGuA1B.size();
        for (int i = 0; i < size; i++) {
            c0893AGuA1B.get(i);
        }
        C0893AGu c0893AGuA1B2 = BHL.A1B(AIM.A18(aiiA17));
        int size2 = c0893AGuA1B2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str = (String) c0893AGuA1B2.get(i2);
            sbA0w.append("\tat ");
            sbA0w.append(str);
            sbA0w.append('\n');
        }
        return sbA0w.toString();
    }

    public DiagnosticComposeException(C0904AHg c0904AHg) {
        this.trace = c0904AHg;
        if (c0904AHg.A01) {
            return;
        }
        int[] iArr = {201, 202, HatchWidgetWebViewKt.HTTP_NO_CONTENT, HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT, 207, 125, -127, 126665345, 200};
        List<AH3> list = c0904AHg.A00;
        int size = list.size();
        ArrayList arrayListA0h = C3cG.A0h();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            AH3 ah3 = list.get(i);
            if (!BFI.A0L(iArr, ah3.A00)) {
                if (ah3.A00 == 100) {
                    int i3 = i + 2;
                    if (i3 < size && list.get(i3).A00 == 1000) {
                        break;
                    } else {
                        AbstractC0882AGj.A0q(arrayListA0h);
                    }
                } else {
                    arrayListA0h.add(ah3);
                }
            }
            i = i2;
        }
        int size2 = arrayListA0h.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", FGI.A0H("m$", ((AH3) arrayListA0h.get(i4)).A00), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }
}
