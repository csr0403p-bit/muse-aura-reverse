package X;

import androidx.compose.ui.text.font.AsyncFontListLoader;

/* loaded from: classes4.dex */
public final class B96 implements B9E, C1BO<Object> {
    public final AsyncFontListLoader A00;

    @Override // X.B9E
    public final boolean ADA() {
        return this.A00.A00;
    }

    @Override // X.C1BO
    public final Object getValue() {
        return this.A00.A01.getValue();
    }

    public B96(AsyncFontListLoader asyncFontListLoader) {
        this.A00 = asyncFontListLoader;
    }
}
