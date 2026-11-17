package X;

import androidx.compose.ui.platform.Clipboard;
import kotlin.Unit;

/* renamed from: X.AsV, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1858AsV implements Clipboard {
    public final C1856AsT A00;

    @Override // androidx.compose.ui.platform.Clipboard
    public final Unit Ad3(C1860AsY c1860AsY) {
        C1856AsT c1856AsT = this.A00;
        if (c1860AsY == null) {
            C1856AsT.A00(c1856AsT).clearPrimaryClip();
        } else {
            C1856AsT.A00(c1856AsT).setPrimaryClip(c1860AsY.A00);
        }
        return Unit.INSTANCE;
    }

    public C1858AsV(C1856AsT c1856AsT) {
        this.A00 = c1856AsT;
    }
}
