package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.facebook.aura.R;

/* renamed from: X.FZz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8227FZz {
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public Drawable A05;
    public Handler A06;
    public Message A07;
    public View A08;
    public View A09;
    public Button A0A;
    public Button A0B;
    public Button A0C;
    public ImageView A0D;
    public ListAdapter A0E;
    public ListView A0F;
    public TextView A0G;
    public TextView A0H;
    public NestedScrollView A0I;
    public CharSequence A0J;
    public CharSequence A0K;
    public boolean A0L;
    public final Context A0M;
    public final Window A0O;
    public final AbstractDialogC8260Fag A0P;
    public int A01 = -1;
    public final View.OnClickListener A0N = new I0W(this, 0);

    public static ViewGroup A00(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            AbstractC7610F5x.A19(view2);
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public C8227FZz(Context context, Window window, AbstractDialogC8260Fag abstractDialogC8260Fag) {
        this.A0M = context;
        this.A0P = abstractDialogC8260Fag;
        this.A0O = window;
        HkI hkI = new HkI();
        hkI.A00 = BV4.A0q(abstractDialogC8260Fag);
        this.A06 = hkI;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, FYT.A04, R.attr._name_removed__res_0x7f040040, 0);
        this.A00 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.A03 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.A04 = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.A02 = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.A0L = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        AbstractDialogC8260Fag.A02(abstractDialogC8260Fag).A0O(1);
    }

    public static boolean A01(View view) {
        if (!view.onCheckIsTextEditor()) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                while (childCount > 0) {
                    childCount--;
                    if (A01(viewGroup.getChildAt(childCount))) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
