package X;

import android.view.View;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public final class I0D extends AbstractC8061FRp {
    public final int $t;

    /* JADX WARN: Illegal instructions before constructor call */
    public I0D(int i) {
        int i2;
        Class<CharSequence> cls;
        int i3;
        int i4;
        int i5;
        this.$t = i;
        switch (i) {
            case 0:
                i5 = R.id.tag_screen_reader_focusable;
                super(Boolean.class, i5, 0, 28);
                return;
            case 1:
                i2 = R.id.tag_accessibility_pane_title;
                cls = CharSequence.class;
                i3 = 8;
                i4 = 28;
                break;
            case 2:
                i2 = R.id.tag_state_description;
                cls = CharSequence.class;
                i3 = 64;
                i4 = 30;
                break;
            default:
                i5 = R.id.tag_accessibility_heading;
                super(Boolean.class, i5, 0, 28);
                return;
        }
        super(cls, i2, i3, i4);
    }

    public static Object A00(View view, int i) {
        return new I0D(i).A01(view);
    }
}
