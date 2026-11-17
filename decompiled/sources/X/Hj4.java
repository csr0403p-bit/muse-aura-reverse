package X;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes6.dex */
public final class Hj4 {
    public final HuZ A00;
    public final TextView A01;

    public final void A00(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.A01.getContext().obtainStyledAttributes(attributeSet, FYT.A08, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            this.A00.A00.A02(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public Hj4(TextView textView) {
        this.A01 = textView;
        this.A00 = new HuZ(textView);
    }
}
