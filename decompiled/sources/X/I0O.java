package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class I0O implements FSE {
    public final int $t;

    public I0O(int i) {
        this.$t = i;
    }

    @Override // X.FSE
    public final int AIt(View view, int i) {
        int measuredHeight;
        switch (this.$t) {
            case 1:
                if (view == null) {
                    measuredHeight = 0;
                }
                return Math.min(measuredHeight, i);
            case 2:
                View view2 = view.getParent() instanceof View ? (View) view.getParent() : view;
                i -= (int) (Math.min(view2.getWidth(), view2.getHeight()) / 1.7777778f);
                break;
            default:
                return 0;
        }
        measuredHeight = view.getMeasuredHeight();
        return Math.min(measuredHeight, i);
    }
}
