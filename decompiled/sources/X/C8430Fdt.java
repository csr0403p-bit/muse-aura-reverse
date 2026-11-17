package X;

import android.view.View;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.Fdt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8430Fdt extends AbstractC8429Fds {
    public int A01;
    public AbstractC8429Fds[] A05;
    public ArrayList<AbstractC8429Fds> A02 = C3cG.A0h();
    public boolean A03 = true;
    public boolean A04 = false;
    public int A00 = 0;

    @Override // X.AbstractC8429Fds
    public final /* bridge */ /* synthetic */ void A0P(View view) {
        int i = 0;
        while (true) {
            ArrayList<AbstractC8429Fds> arrayList = this.A02;
            if (i >= arrayList.size()) {
                super.A0P(view);
                return;
            } else {
                AbstractC7607F5u.A0o(arrayList, i).A0P(view);
                i++;
            }
        }
    }

    @Override // X.AbstractC8429Fds
    public final /* bridge */ /* synthetic */ void A0R(View view) {
        int i = 0;
        while (true) {
            ArrayList<AbstractC8429Fds> arrayList = this.A02;
            if (i >= arrayList.size()) {
                super.A0R(view);
                return;
            } else {
                AbstractC7607F5u.A0o(arrayList, i).A0R(view);
                i++;
            }
        }
    }

    public final void A0h(AbstractC8429Fds abstractC8429Fds) {
        this.A02.add(abstractC8429Fds);
        abstractC8429Fds.A0B = this;
        long j = super.A01;
        if (j >= 0) {
            abstractC8429Fds.A0M(j);
        }
        if ((this.A00 & 1) != 0) {
            abstractC8429Fds.A0O(super.A05);
        }
        if ((this.A00 & 2) != 0) {
            abstractC8429Fds.A0J();
        }
        if ((this.A00 & 4) != 0) {
            abstractC8429Fds.A0W(this.A06);
        }
        if ((this.A00 & 8) != 0) {
            abstractC8429Fds.A0X(this.A07);
        }
    }

    @Override // X.AbstractC8429Fds
    /* renamed from: A0A */
    public final AbstractC8429Fds clone() {
        C8430Fdt c8430Fdt = (C8430Fdt) super.clone();
        c8430Fdt.A02 = C3cG.A0h();
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            AbstractC8429Fds abstractC8429FdsClone = AbstractC7607F5u.A0o(this.A02, i).clone();
            c8430Fdt.A02.add(abstractC8429FdsClone);
            abstractC8429FdsClone.A0B = c8430Fdt;
        }
        return c8430Fdt;
    }

    @Override // X.AbstractC8429Fds
    public final String A0E(String str) {
        String strA0E = super.A0E(str);
        int i = 0;
        while (true) {
            ArrayList<AbstractC8429Fds> arrayList = this.A02;
            if (i >= arrayList.size()) {
                return strA0E;
            }
            strA0E = FGI.A0U(strA0E, PairsDiscretionDocument.TERMINATOR, AbstractC7607F5u.A0o(arrayList, i).A0E(FGI.A0M(str, "  ")));
            i++;
        }
    }

    @Override // X.AbstractC8429Fds
    public final void A0F() {
        super.A0F();
        AbstractC8429Fds[] abstractC8429FdsArr = this.A05;
        this.A05 = null;
        if (abstractC8429FdsArr == null) {
            abstractC8429FdsArr = new AbstractC8429Fds[this.A02.size()];
        }
        AbstractC8429Fds[] abstractC8429FdsArr2 = (AbstractC8429Fds[]) this.A02.toArray(abstractC8429FdsArr);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            abstractC8429FdsArr2[i].A0F();
        }
        Arrays.fill(abstractC8429FdsArr2, (Object) null);
        this.A05 = abstractC8429FdsArr2;
    }

    @Override // X.AbstractC8429Fds
    public final void A0Q(View view) {
        super.A0Q(view);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            AbstractC7607F5u.A0o(this.A02, i).A0Q(view);
        }
    }

    @Override // X.AbstractC8429Fds
    public final void A0S(View view) {
        super.A0S(view);
        AbstractC8429Fds[] abstractC8429FdsArr = this.A05;
        this.A05 = null;
        if (abstractC8429FdsArr == null) {
            abstractC8429FdsArr = new AbstractC8429Fds[this.A02.size()];
        }
        AbstractC8429Fds[] abstractC8429FdsArr2 = (AbstractC8429Fds[]) this.A02.toArray(abstractC8429FdsArr);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            abstractC8429FdsArr2[i].A0S(view);
        }
        Arrays.fill(abstractC8429FdsArr2, (Object) null);
        this.A05 = abstractC8429FdsArr2;
    }

    @Override // X.AbstractC8429Fds
    public final void A0W(C8467FeV c8467FeV) {
        super.A0W(c8467FeV);
        this.A00 |= 4;
        if (this.A02 == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList<AbstractC8429Fds> arrayList = this.A02;
            if (i >= arrayList.size()) {
                return;
            }
            AbstractC7607F5u.A0o(arrayList, i).A0W(c8467FeV);
            i++;
        }
    }

    @Override // X.AbstractC8429Fds
    public final /* bridge */ /* synthetic */ void A0Y(InterfaceC8451FeF interfaceC8451FeF) {
        super.A0Y(interfaceC8451FeF);
    }

    @Override // X.AbstractC8429Fds
    public final /* bridge */ /* synthetic */ void A0Z(InterfaceC8451FeF interfaceC8451FeF) {
        super.A0Z(interfaceC8451FeF);
    }
}
