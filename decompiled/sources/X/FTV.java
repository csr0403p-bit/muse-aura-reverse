package X;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FTV {
    public static final List<Object> A0J = Collections.EMPTY_LIST;
    public int A00;
    public AbstractC8091FSx<? extends FTV> A08;
    public RecyclerView A0C;
    public WeakReference<RecyclerView> A0D;
    public final View A0I;
    public int A04 = -1;
    public int A02 = -1;
    public long A07 = -1;
    public int A01 = -1;
    public int A05 = -1;
    public FTV A0A = null;
    public FTV A0B = null;
    public List<Object> A0E = null;
    public List<Object> A0F = null;
    public int A0H = 0;
    public FTR A09 = null;
    public boolean A0G = false;
    public int A06 = 0;
    public int A03 = -1;

    public final List<Object> A00() {
        List<Object> list;
        return ((this.A00 & 1024) != 0 || (list = this.A0E) == null || list.size() == 0) ? A0J : this.A0F;
    }

    public final void A01() {
        if (RecyclerView.A1H && AnonymousClass002.A1L(this.A00 & 256)) {
            throw BV8.A0m(". ViewHolders should be fully detached before resetting.", C3cG.A0f(this, "Attempting to reset temp-detached ViewHolder: "));
        }
        this.A00 = 0;
        this.A04 = -1;
        this.A02 = -1;
        this.A07 = -1L;
        this.A05 = -1;
        this.A0H = 0;
        this.A0A = null;
        this.A0B = null;
        List<Object> list = this.A0E;
        if (list != null) {
            list.clear();
        }
        this.A00 &= -1025;
        this.A06 = 0;
        this.A03 = -1;
        RecyclerView.A0P(this);
    }

    public final void A02(int i, boolean z) {
        if (this.A02 == -1) {
            this.A02 = this.A04;
        }
        int i2 = this.A05;
        if (i2 == -1) {
            i2 = this.A04;
            this.A05 = i2;
        }
        if (z) {
            this.A05 = i2 + i;
        }
        this.A04 += i;
        View view = this.A0I;
        if (view.getLayoutParams() != null) {
            AbstractC7607F5u.A0m(view).A01 = true;
        }
    }

    public final void A03(boolean z) {
        int i;
        int i2 = this.A0H;
        int i3 = i2 + 1;
        if (z) {
            i3 = i2 - 1;
        }
        this.A0H = i3;
        if (i3 < 0) {
            this.A0H = 0;
            boolean z2 = RecyclerView.A1H;
            String strA0a = AnonymousClass007.A0a("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ", this);
            if (z2) {
                throw BV4.A0c(strA0a);
            }
            Log.e("View", strA0a);
        } else if (z) {
            if (i3 == 0) {
                i = this.A00 & (-17);
                this.A00 = i;
            }
        } else if (i3 == 1) {
            i = this.A00 | 16;
            this.A00 = i;
        }
        if (RecyclerView.A1I) {
            Log.d("RecyclerView", AnonymousClass006.A0y(this, ":", C60O.A10("setIsRecyclable val:", z)));
        }
    }

    public FTV(View view) {
        if (view == null) {
            throw C60O.A0i("itemView may not be null");
        }
        this.A0I = view;
    }

    public final String toString() {
        Class<?> cls = getClass();
        StringBuilder sbA0g = C3cG.A0g(cls.isAnonymousClass() ? "ViewHolder" : cls.getSimpleName());
        sbA0g.append("{");
        BV4.A1N(sbA0g, hashCode());
        sbA0g.append(" position=");
        sbA0g.append(this.A04);
        sbA0g.append(" id=");
        sbA0g.append(this.A07);
        sbA0g.append(", oldPos=");
        sbA0g.append(this.A02);
        sbA0g.append(", pLpos:");
        StringBuilder sbA0x = C60O.A0x(BV4.A0l(sbA0g, this.A05));
        if (this.A09 != null) {
            sbA0x.append(" scrap ");
            sbA0x.append(this.A0G ? "[changeScrap]" : "[attachedScrap]");
        }
        int i = this.A00;
        if ((i & 4) != 0) {
            sbA0x.append(" invalid");
        }
        if ((i & 1) == 0) {
            sbA0x.append(" unbound");
        }
        if ((i & 2) != 0) {
            sbA0x.append(" update");
        }
        if (AnonymousClass002.A1L(i & 8)) {
            sbA0x.append(" removed");
        }
        if (AnonymousClass002.A1L(this.A00 & 128)) {
            sbA0x.append(" ignored");
        }
        if (AnonymousClass002.A1L(this.A00 & 256)) {
            sbA0x.append(" tmpDetached");
        }
        if ((i & 16) != 0 || this.A0I.hasTransientState()) {
            sbA0x.append(FGI.A0I(" not recyclable(", this.A0H, ")"));
        }
        int i2 = this.A00;
        if ((i2 & 512) != 0 || (i2 & 4) != 0) {
            sbA0x.append(" undefined adapter position");
        }
        if (this.A0I.getParent() == null) {
            sbA0x.append(" no parent");
        }
        return BV7.A11(sbA0x);
    }
}
