package X;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

/* renamed from: X.Fa0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8228Fa0 {
    public static DialogInterfaceC8226FZy A00(C8229Fa1 c8229Fa1, int i) {
        Context context = c8229Fa1.A0C;
        DialogInterfaceC8226FZy dialogInterfaceC8226FZy = new DialogInterfaceC8226FZy(context, i);
        C8227FZz c8227FZz = dialogInterfaceC8226FZy.A00;
        View view = c8229Fa1.A05;
        if (view != null) {
            c8227FZz.A08 = view;
        } else {
            CharSequence charSequence = c8229Fa1.A09;
            if (charSequence != null) {
                c8227FZz.A0K = charSequence;
                TextView textView = c8227FZz.A0H;
                if (textView != null) {
                    textView.setText(charSequence);
                }
                c8227FZz.A0O.setTitle(charSequence);
            }
            Drawable drawable = c8229Fa1.A04;
            if (drawable != null) {
                c8227FZz.A05 = drawable;
                ImageView imageView = c8227FZz.A0D;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c8227FZz.A0D.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c8229Fa1.A08;
        if (charSequence2 != null) {
            DialogInterface.OnClickListener onClickListener = c8229Fa1.A01;
            Message messageObtainMessage = onClickListener != null ? c8227FZz.A06.obtainMessage(-2, onClickListener) : null;
            c8227FZz.A0J = charSequence2;
            c8227FZz.A07 = messageObtainMessage;
        }
        if (c8229Fa1.A0B != null || c8229Fa1.A07 != null) {
            ListView listView = (ListView) c8229Fa1.A0D.inflate(c8227FZz.A03, (ViewGroup) null);
            int i2 = c8229Fa1.A0A ? c8227FZz.A04 : c8227FZz.A02;
            ListAdapter c8225FZt = c8229Fa1.A07;
            if (c8225FZt == null) {
                c8225FZt = new C8225FZt(context, i2, R.id.text1, c8229Fa1.A0B);
            }
            c8227FZz.A0E = c8225FZt;
            c8227FZz.A01 = c8229Fa1.A00;
            if (c8229Fa1.A02 != null) {
                listView.setOnItemClickListener(new C8215FZi(c8229Fa1, c8227FZz));
            }
            if (c8229Fa1.A0A) {
                listView.setChoiceMode(1);
            }
            c8227FZz.A0F = listView;
        }
        View view2 = c8229Fa1.A06;
        if (view2 != null) {
            c8227FZz.A09 = view2;
        }
        dialogInterfaceC8226FZy.setCancelable(true);
        dialogInterfaceC8226FZy.setCanceledOnTouchOutside(true);
        dialogInterfaceC8226FZy.setOnCancelListener(null);
        dialogInterfaceC8226FZy.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = c8229Fa1.A03;
        if (onKeyListener != null) {
            dialogInterfaceC8226FZy.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC8226FZy;
    }
}
