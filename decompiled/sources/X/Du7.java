package X;

import java.io.IOException;

/* loaded from: classes5.dex */
public interface Du7 {
    void onDownstreamFormatChanged(int i, Dy6 dy6, C5893Dra c5893Dra);

    void onLoadCanceled(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra);

    void onLoadCompleted(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra);

    void onLoadError(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra, IOException iOException, boolean z);

    void onLoadStarted(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra, int i2);

    void onUpstreamDiscarded(int i, Dy6 dy6, C5893Dra c5893Dra);
}
