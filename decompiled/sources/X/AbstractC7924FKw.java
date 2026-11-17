package X;

import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;

/* renamed from: X.FKw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7924FKw {
    public static final void A00(TextUtils.TruncateAt truncateAt, C7925FKx c7925FKx, FL4 fl4) {
        C7384Etj.A0Y(c7925FKx, 2);
        if (fl4.getEllipsize() != truncateAt) {
            KeyListener keyListener = fl4.getKeyListener();
            if (keyListener == null) {
                C7923FKv c7923FKv = c7925FKx.A03;
                if (c7923FKv == null) {
                    throw BV4.A0U();
                }
                keyListener = c7923FKv.A0H;
            }
            c7925FKx.A00 = keyListener;
            fl4.setKeyListener(null);
            fl4.setEllipsize(truncateAt);
        }
    }

    public static final boolean A02(FL4 fl4) {
        Editable text = fl4.getText();
        if (text == null) {
            return false;
        }
        Rect rectA0X = AbstractC7607F5u.A0X();
        fl4.getPaint().getTextBounds(text.toString(), 0, text.length(), rectA0X);
        return rectA0X.width() > AbstractC7610F5x.A0I(fl4, fl4.getWidth());
    }

    public static final boolean A03(FL4 fl4) {
        Editable text = fl4.getText();
        return (text == null || text.length() == 0 || fl4.getWidth() == 0 || fl4.getLineCount() > 1 || (fl4.getInputType() & 131087) == 131073 || A01(fl4.getInputType())) ? false : true;
    }

    public static final boolean A01(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18 || i2 == 145;
    }
}
