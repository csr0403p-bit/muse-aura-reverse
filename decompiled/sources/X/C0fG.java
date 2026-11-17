package X;

import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "Use Clipboard instead, which supports suspend functions.", replaceWith = @ReplaceWith(expression = "Clipboard", imports = {"androidx.compose.ui.platform.Clipboard"}))
/* renamed from: X.0fG, reason: invalid class name */
/* loaded from: classes.dex */
public interface C0fG {
    ApQ ALZ();

    void Aey(ApQ apQ);

    static void A00(C0fG c0fG, String str) {
        c0fG.Aey(new ApQ(str, C0881AGi.A00));
    }
}
