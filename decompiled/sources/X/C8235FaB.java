package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.facebook.aura.R;
import java.util.ArrayList;

/* renamed from: X.FaB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8235FaB implements InterfaceC8291FbF, AdapterView.OnItemClickListener {
    public int A00;
    public Context A01;
    public LayoutInflater A02;
    public ExpandedMenuView A03;
    public C8238FaE A04;
    public C8249FaR A05;
    public InterfaceC8331Fby A06;

    @Override // X.InterfaceC8291FbF
    public final boolean A6W(C8252FaX c8252FaX) {
        return false;
    }

    @Override // X.InterfaceC8291FbF
    public final boolean ABB(C8252FaX c8252FaX) {
        return false;
    }

    @Override // X.InterfaceC8291FbF
    public final boolean ABf() {
        return false;
    }

    @Override // X.InterfaceC8291FbF
    public final void ANd(Context context, C8249FaR c8249FaR) {
        if (this.A01 != null) {
            this.A01 = context;
            if (this.A02 == null) {
                this.A02 = LayoutInflater.from(context);
            }
        }
        this.A05 = c8249FaR;
        C8238FaE c8238FaE = this.A04;
        if (c8238FaE != null) {
            c8238FaE.notifyDataSetChanged();
        }
    }

    @Override // X.InterfaceC8291FbF
    public final void ASE(C8249FaR c8249FaR, boolean z) {
        InterfaceC8331Fby interfaceC8331Fby = this.A06;
        if (interfaceC8331Fby != null) {
            interfaceC8331Fby.ASE(c8249FaR, z);
        }
    }

    @Override // X.InterfaceC8291FbF
    public final void Acz(InterfaceC8331Fby interfaceC8331Fby) {
        this.A06 = interfaceC8331Fby;
    }

    @Override // X.InterfaceC8291FbF
    public final void Ahy() {
        C8238FaE c8238FaE = this.A04;
        if (c8238FaE != null) {
            c8238FaE.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C8249FaR c8249FaR = this.A05;
        C8238FaE c8238FaE = this.A04;
        C8249FaR c8249FaR2 = c8238FaE.A01.A05;
        c8249FaR2.A05();
        ArrayList<C8252FaX> arrayList = c8249FaR2.A08;
        int i2 = c8238FaE.A00;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        c8249FaR.A0I(AbstractC7607F5u.A0g(arrayList, i), this, 0);
    }

    @Override // X.InterfaceC8291FbF
    public final boolean AWM(SubMenuC8248FaQ subMenuC8248FaQ) {
        if (!subMenuC8248FaQ.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnClickListenerC8237FaD dialogInterfaceOnClickListenerC8237FaD = new DialogInterfaceOnClickListenerC8237FaD();
        dialogInterfaceOnClickListenerC8237FaD.A02 = subMenuC8248FaQ;
        Context context = subMenuC8248FaQ.A0M;
        int iA00 = DialogInterfaceC8226FZy.A00(context, 0);
        C8229Fa1 c8229Fa1 = new C8229Fa1(new ContextThemeWrapper(context, DialogInterfaceC8226FZy.A00(context, iA00)));
        Context context2 = c8229Fa1.A0C;
        C8235FaB c8235FaB = new C8235FaB();
        c8235FaB.A00 = R.layout._name_removed__res_0x7f0d000d;
        c8235FaB.A01 = context2;
        c8235FaB.A02 = LayoutInflater.from(context2);
        dialogInterfaceOnClickListenerC8237FaD.A01 = c8235FaB;
        c8235FaB.A06 = dialogInterfaceOnClickListenerC8237FaD;
        subMenuC8248FaQ.A08(context, c8235FaB);
        C8235FaB c8235FaB2 = dialogInterfaceOnClickListenerC8237FaD.A01;
        C8238FaE c8238FaE = c8235FaB2.A04;
        if (c8238FaE == null) {
            c8238FaE = new C8238FaE(c8235FaB2);
            c8235FaB2.A04 = c8238FaE;
        }
        c8229Fa1.A07 = c8238FaE;
        c8229Fa1.A02 = dialogInterfaceOnClickListenerC8237FaD;
        View view = subMenuC8248FaQ.A02;
        if (view != null) {
            c8229Fa1.A05 = view;
        } else {
            c8229Fa1.A04 = ((C8249FaR) subMenuC8248FaQ).A01;
            c8229Fa1.A09 = subMenuC8248FaQ.A05;
        }
        c8229Fa1.A03 = dialogInterfaceOnClickListenerC8237FaD;
        DialogInterfaceC8226FZy dialogInterfaceC8226FZyA00 = AbstractC8228Fa0.A00(c8229Fa1, iA00);
        dialogInterfaceOnClickListenerC8237FaD.A00 = dialogInterfaceC8226FZyA00;
        dialogInterfaceC8226FZyA00.setOnDismissListener(dialogInterfaceOnClickListenerC8237FaD);
        WindowManager.LayoutParams attributes = dialogInterfaceOnClickListenerC8237FaD.A00.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnClickListenerC8237FaD.A00.show();
        InterfaceC8331Fby interfaceC8331Fby = this.A06;
        if (interfaceC8331Fby == null) {
            return true;
        }
        interfaceC8331Fby.AUQ(subMenuC8248FaQ);
        return true;
    }
}
