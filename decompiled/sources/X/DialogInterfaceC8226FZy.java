package X;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.facebook.aura.R;

/* renamed from: X.FZy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceC8226FZy extends AbstractDialogC8260Fag implements DialogInterface {
    public final C8227FZz A00;

    public static int A00(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
        context.getTheme().resolveAttribute(R.attr._name_removed__res_0x7f040041, typedValueA0Z, true);
        return typedValueA0Z.resourceId;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A00.A0I;
        if (nestedScrollView == null || !nestedScrollView.A0E(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A00.A0I;
        if (nestedScrollView == null || !nestedScrollView.A0E(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public DialogInterfaceC8226FZy(Context context, int i) {
        super(context, A00(context, i));
        this.A00 = new C8227FZz(getContext(), getWindow(), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ae A[PHI: r12
  0x02ae: PHI (r12v3 android.view.View) = (r12v8 android.view.View), (r12v1 android.view.View) binds: [B:7:0x004b, B:5:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0202  */
    @Override // X.AbstractDialogC8260Fag, X.DialogC10469Hka, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogInterfaceC8226FZy.onCreate(android.os.Bundle):void");
    }

    @Override // X.AbstractDialogC8260Fag, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C8227FZz c8227FZz = this.A00;
        c8227FZz.A0K = charSequence;
        TextView textView = c8227FZz.A0H;
        if (textView != null) {
            textView.setText(charSequence);
        }
        c8227FZz.A0O.setTitle(charSequence);
    }
}
