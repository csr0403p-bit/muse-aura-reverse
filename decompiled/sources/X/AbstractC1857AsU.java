package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.view.DragEvent;

/* renamed from: X.AsU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1857AsU {
    public static final void A00(C1759AqC c1759AqC, C1Z3 c1z3) {
        DragEvent dragEvent = c1759AqC.A00;
        ClipData clipData = dragEvent.getClipData();
        int itemCount = clipData.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            Uri uri = clipData.getItemAt(i).getUri();
            if (uri != null && "content".equals(uri.getScheme())) {
                if (((AbstractC1439Aj8) c1z3).node.isAttached) {
                    for (Context context = AbstractC1329AhG.A00(c1z3).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                        if (context instanceof Activity) {
                            Activity activity = (Activity) context;
                            if (activity != null) {
                                activity.requestDragAndDropPermissions(dragEvent);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
