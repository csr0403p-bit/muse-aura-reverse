package com.facebook.aura.localbrowser;

import X.F2X;
import X.G2j;
import X.HtJ;
import com.facebook.aura.model.BrowserTaskPresentation;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class LocalBrowserMissingTaskViewModel$uiState$1 extends F2X implements G2j {
    public LocalBrowserMissingTaskViewModel$uiState$1(Object obj) {
        super(4, obj, LocalBrowserMissingTaskViewModel.class, "buildUiState", "buildUiState(Ljava/util/List;Ljava/util/List;Lcom/facebook/aura/localbrowser/LocalBrowserStopStatus;)Lcom/facebook/aura/localbrowser/LocalBrowserMissingTaskUiState;", 4);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((LocalBrowserMissingTaskViewModel) this.receiver).buildUiState((List) obj, (List) obj2, (LocalBrowserStopStatus) obj3);
    }

    public final Object invoke(List<LocalBrowserTaskRecordJson> list, List<BrowserTaskPresentation> list2, LocalBrowserStopStatus localBrowserStopStatus, HtJ<? super LocalBrowserMissingTaskUiState> htJ) {
        return ((LocalBrowserMissingTaskViewModel) this.receiver).buildUiState(list, list2, localBrowserStopStatus);
    }
}
