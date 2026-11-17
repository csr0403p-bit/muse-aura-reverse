package androidx.appcompat.app;

import X.FYT;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

/* loaded from: classes6.dex */
public class AlertController$RecycleListView extends ListView {
    public final int A00;
    public final int A01;

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FYT.A0J);
        this.A00 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.A01 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
