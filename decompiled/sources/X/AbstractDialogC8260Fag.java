package X;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.aura.R;

/* renamed from: X.Fag, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractDialogC8260Fag extends DialogC10469Hka implements InterfaceC8351FcP {
    public EC9 A00;
    public final InterfaceC10513HoP A01;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractDialogC8260Fag(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
            context.getTheme().resolveAttribute(R.attr._name_removed__res_0x7f04019c, typedValueA0Z, true);
            i2 = typedValueA0Z.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.A01 = new InterfaceC10513HoP() { // from class: X.Fbm
            @Override // X.InterfaceC10513HoP
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.A00.A05(keyEvent);
            }
        };
        EC9 ec9A02 = A02(this);
        if (i == 0) {
            TypedValue typedValueA0Z2 = AbstractC7607F5u.A0Z();
            context.getTheme().resolveAttribute(R.attr._name_removed__res_0x7f04019c, typedValueA0Z2, true);
            i = typedValueA0Z2.resourceId;
        }
        ((LayoutInflaterFactory2C8250FaT) ec9A02).A03 = i;
        ec9A02.A0L();
    }

    public static final EC9 A02(AbstractDialogC8260Fag abstractDialogC8260Fag) {
        EC9 ec9 = abstractDialogC8260Fag.A00;
        if (ec9 != null) {
            return ec9;
        }
        int i = EC9.A00;
        boolean z = LayoutInflaterFactory2C8250FaT.A0o;
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = new LayoutInflaterFactory2C8250FaT(abstractDialogC8260Fag.getContext(), abstractDialogC8260Fag.getWindow(), abstractDialogC8260Fag, abstractDialogC8260Fag);
        abstractDialogC8260Fag.A00 = layoutInflaterFactory2C8250FaT;
        return layoutInflaterFactory2C8250FaT;
    }

    public final boolean A05(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // X.DialogC10469Hka, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A04();
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = (LayoutInflaterFactory2C8250FaT) A02(this);
        AbstractC7607F5u.A0f(layoutInflaterFactory2C8250FaT).addView(view, layoutParams);
        C8259Faf.A00(layoutInflaterFactory2C8250FaT);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        A02(this).A0M();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        InterfaceC10513HoP interfaceC10513HoP = this.A01;
        if (interfaceC10513HoP != null) {
            return interfaceC10513HoP.superDispatchKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i) {
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = (LayoutInflaterFactory2C8250FaT) A02(this);
        LayoutInflaterFactory2C8250FaT.A0E(layoutInflaterFactory2C8250FaT);
        return (T) layoutInflaterFactory2C8250FaT.A09.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        A02(this).A0K();
    }

    @Override // X.DialogC10469Hka, android.app.Dialog
    public void onCreate(Bundle bundle) {
        A02(this).A0J();
        super.onCreate(bundle);
        A02(this).A0L();
    }

    @Override // X.DialogC10469Hka, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = (LayoutInflaterFactory2C8250FaT) A02(this);
        LayoutInflaterFactory2C8250FaT.A0F(layoutInflaterFactory2C8250FaT);
        AbstractC8276Fb0 abstractC8276Fb0 = layoutInflaterFactory2C8250FaT.A0D;
        if (abstractC8276Fb0 == null || !(abstractC8276Fb0 instanceof C8251FaW)) {
            return;
        }
        C8251FaW c8251FaW = (C8251FaW) abstractC8276Fb0;
        c8251FaW.A0J = false;
        C8264Fam c8264Fam = c8251FaW.A07;
        if (c8264Fam != null) {
            c8264Fam.A00();
        }
    }

    @Override // X.DialogC10469Hka, android.app.Dialog
    public void setContentView(int i) {
        A04();
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = (LayoutInflaterFactory2C8250FaT) A02(this);
        ViewGroup viewGroupA0f = AbstractC7607F5u.A0f(layoutInflaterFactory2C8250FaT);
        viewGroupA0f.removeAllViews();
        LayoutInflater.from(layoutInflaterFactory2C8250FaT.A0k).inflate(i, viewGroupA0f);
        C8259Faf.A00(layoutInflaterFactory2C8250FaT);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        A02(this).A0N(getContext().getString(i));
    }

    @Override // X.DialogC10469Hka, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A04();
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = (LayoutInflaterFactory2C8250FaT) A02(this);
        ViewGroup viewGroupA0f = AbstractC7607F5u.A0f(layoutInflaterFactory2C8250FaT);
        viewGroupA0f.removeAllViews();
        viewGroupA0f.addView(view, layoutParams);
        C8259Faf.A00(layoutInflaterFactory2C8250FaT);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        A02(this).A0N(charSequence);
    }

    @Override // X.DialogC10469Hka, android.app.Dialog
    public void setContentView(View view) {
        A04();
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = (LayoutInflaterFactory2C8250FaT) A02(this);
        ViewGroup viewGroupA0f = AbstractC7607F5u.A0f(layoutInflaterFactory2C8250FaT);
        viewGroupA0f.removeAllViews();
        viewGroupA0f.addView(view);
        C8259Faf.A00(layoutInflaterFactory2C8250FaT);
    }
}
