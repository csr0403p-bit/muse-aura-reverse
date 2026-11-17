package X;

import android.R;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: classes6.dex */
public final class I0W implements View.OnClickListener {
    public final int $t;
    public final Object A00;

    public I0W(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7993FOm c7993FOm;
        Handler handler;
        Runnable fp2;
        C8252FaX c8252FaX;
        Message message;
        Message messageObtain;
        switch (this.$t) {
            case 0:
                C8227FZz c8227FZz = (C8227FZz) this.A00;
                if (view == c8227FZz.A0A && (message = c8227FZz.A07) != null && (messageObtain = Message.obtain(message)) != null) {
                    messageObtain.sendToTarget();
                }
                c8227FZz.A06.obtainMessage(1, c8227FZz.A0P).sendToTarget();
                return;
            case 1:
                C8257Fad c8257Fad = ((Toolbar) this.A00).A0C;
                if (c8257Fad == null || (c8252FaX = c8257Fad.A01) == null) {
                    return;
                }
                c8252FaX.collapseActionView();
                return;
            case 2:
                C7997FOq c7997FOq = (C7997FOq) this.A00;
                FOS fos = ((FPT) c7997FOq.A04).A00;
                FOS.A01(fos);
                fos.A00 = 6;
                handler = c7997FOq.A02;
                fp2 = new RunnableC8001FOv(c7997FOq);
                break;
            case 3:
                C7997FOq c7997FOq2 = (C7997FOq) this.A00;
                c7997FOq2.A02.post(new RunnableC8001FOv(c7997FOq2));
                FOS fos2 = c7997FOq2.A03.A00;
                FNZ fnzPeek = fos2.A0K.peek();
                if (fnzPeek != null) {
                    fnzPeek.A03.AZw();
                    if (!fos2.A0J) {
                        FOS.A05(fos2, 0);
                        return;
                    }
                    FOV fov = fos2.A04;
                    if (fov != null && (c7993FOm = fos2.A07) != null) {
                        handler = c7993FOm.A02;
                        fp2 = new FP2(fov, c7993FOm);
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 4:
                FOS fos3 = ((FPT) ((C7993FOm) this.A00).A04).A00;
                FOS.A01(fos3);
                fos3.A00 = 6;
                return;
            case 5:
                DialogC8130FVg dialogC8130FVg = (DialogC8130FVg) this.A00;
                if (dialogC8130FVg.A04 && dialogC8130FVg.isShowing()) {
                    if (!dialogC8130FVg.A06) {
                        TypedArray typedArrayObtainStyledAttributes = dialogC8130FVg.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        dialogC8130FVg.A05 = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        dialogC8130FVg.A06 = true;
                    }
                    if (dialogC8130FVg.A05) {
                        dialogC8130FVg.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                MaterialCalendar materialCalendar = (MaterialCalendar) this.A00;
                Integer num = materialCalendar.A06;
                Integer num2 = C79.A01;
                Integer num3 = C79.A00;
                if (num == num2) {
                    materialCalendar.A06 = num3;
                    materialCalendar.A01.setVisibility(8);
                    materialCalendar.A00.setVisibility(0);
                    materialCalendar.A00(materialCalendar.A05);
                    return;
                }
                if (num == num3) {
                    materialCalendar.A06 = num2;
                    RecyclerView recyclerView = materialCalendar.A03;
                    recyclerView.A0H.A13(materialCalendar.A05.A04 - ((C8207FYz) recyclerView.A0F).A00.A04.A04.A04);
                    materialCalendar.A01.setVisibility(0);
                    materialCalendar.A00.setVisibility(8);
                    return;
                }
                return;
            case 7:
                throw new NullPointerException("textInputLayout");
            case 8:
                throw new NullPointerException("textInputLayout");
            default:
                throw new NullPointerException("textInputLayout");
        }
        handler.post(fp2);
    }
}
