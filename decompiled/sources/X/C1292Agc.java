package X;

import android.content.res.Resources;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.Agc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1292Agc extends C7438Evz implements G0W {
    public C1292Agc(Object obj) {
        super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((AWA) obj2).A00;
        Resources resources = ((View) this.receiver).getContext().getResources();
        new C1291Agb(new ATH(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), (G0U) obj3, j);
        throw new NullPointerException("getClipData");
    }
}
