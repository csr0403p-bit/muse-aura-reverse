package androidx.biometric;

import X.AbstractC7607F5u;
import X.AbstractC8228Fa0;
import X.BON;
import X.C2934BpC;
import X.C60O;
import X.C8229Fa1;
import X.C8328Fbu;
import X.C8379Fct;
import X.DialogInterfaceC8226FZy;
import X.DialogInterfaceOnClickListenerC8316Fbi;
import X.RunnableC8288FbC;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.R;
import java.io.IOException;

/* loaded from: classes6.dex */
public class FingerprintDialogFragment extends DialogFragment {
    public int A00;
    public int A01;
    public ImageView A02;
    public TextView A03;
    public C8379Fct A04;
    public final Handler A05 = C60O.A02();
    public final Runnable A06 = new RunnableC8288FbC(this);

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        this.mCalled = true;
        this.A05.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        this.mCalled = true;
        C8379Fct c8379Fct = this.A04;
        c8379Fct.A00 = 0;
        C2934BpC<Integer> c2934BpC = c8379Fct.A0B;
        if (c2934BpC == null) {
            c2934BpC = new C2934BpC<>();
            c8379Fct.A0B = c2934BpC;
        }
        C8379Fct.A03(c2934BpC, 1);
        C8379Fct c8379Fct2 = this.A04;
        String string = getString(R.string._name_removed__res_0x7f1209f7);
        C2934BpC<CharSequence> c2934BpC2 = c8379Fct2.A0A;
        if (c2934BpC2 == null) {
            c2934BpC2 = new C2934BpC<>();
            c8379Fct2.A0A = c2934BpC2;
        }
        C8379Fct.A03(c2934BpC2, string);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C8379Fct c8379Fct = this.A04;
        C2934BpC<Boolean> c2934BpC = c8379Fct.A0D;
        if (c2934BpC == null) {
            c2934BpC = new C2934BpC<>();
            c8379Fct.A0D = c2934BpC;
        }
        C8379Fct.A03(c2934BpC, true);
    }

    private int A00(int i) throws Resources.NotFoundException {
        Context context = getContext();
        FragmentActivity activity = getActivity();
        if (context == null || activity == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
        context.getTheme().resolveAttribute(i, typedValueA0Z, true);
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(typedValueA0Z.data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws IOException {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C8379Fct c8379Fct = (C8379Fct) new BON(activity).A01(C8379Fct.class);
            this.A04 = c8379Fct;
            C2934BpC<Integer> c2934BpC = c8379Fct.A0B;
            if (c2934BpC == null) {
                c2934BpC = new C2934BpC<>();
                c8379Fct.A0B = c2934BpC;
            }
            Fragment.A04(this, c2934BpC, 6);
            C8379Fct c8379Fct2 = this.A04;
            C2934BpC<CharSequence> c2934BpC2 = c8379Fct2.A0A;
            if (c2934BpC2 == null) {
                c2934BpC2 = new C2934BpC<>();
                c8379Fct2.A0A = c2934BpC2;
            }
            Fragment.A04(this, c2934BpC2, 7);
        }
        this.A00 = A00(R.attr._name_removed__res_0x7f04012e);
        this.A01 = A00(android.R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        CharSequence string;
        Context contextRequireContext = requireContext();
        int iA00 = DialogInterfaceC8226FZy.A00(contextRequireContext, 0);
        C8229Fa1 c8229Fa1 = new C8229Fa1(new ContextThemeWrapper(contextRequireContext, DialogInterfaceC8226FZy.A00(contextRequireContext, iA00)));
        C8328Fbu c8328Fbu = this.A04.A05;
        c8229Fa1.A09 = c8328Fbu != null ? c8328Fbu.A04 : null;
        View viewInflate = LayoutInflater.from(c8229Fa1.A0C).inflate(R.layout._name_removed__res_0x7f0d0157, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            C8328Fbu c8328Fbu2 = this.A04.A05;
            CharSequence charSequence = c8328Fbu2 != null ? c8328Fbu2.A03 : null;
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequence);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            C8328Fbu c8328Fbu3 = this.A04.A05;
            CharSequence charSequence2 = c8328Fbu3 != null ? c8328Fbu3.A01 : null;
            if (TextUtils.isEmpty(charSequence2)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequence2);
            }
        }
        this.A02 = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.A03 = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        C8328Fbu c8328Fbu4 = this.A04.A05;
        if (c8328Fbu4 != null) {
            int i = c8328Fbu4.A00;
            if (i == 0 || (i & 32768) == 0) {
                string = c8328Fbu4.A02;
                if (string == null) {
                    string = "";
                }
            } else {
                string = getString(R.string._name_removed__res_0x7f1207ab);
            }
        } else {
            string = null;
        }
        DialogInterfaceOnClickListenerC8316Fbi dialogInterfaceOnClickListenerC8316Fbi = new DialogInterfaceOnClickListenerC8316Fbi(this);
        c8229Fa1.A08 = string;
        c8229Fa1.A01 = dialogInterfaceOnClickListenerC8316Fbi;
        c8229Fa1.A06 = viewInflate;
        DialogInterfaceC8226FZy dialogInterfaceC8226FZyA00 = AbstractC8228Fa0.A00(c8229Fa1, iA00);
        dialogInterfaceC8226FZyA00.setCanceledOnTouchOutside(false);
        return dialogInterfaceC8226FZyA00;
    }
}
