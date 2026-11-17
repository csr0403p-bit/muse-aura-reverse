package X;

import com.facebook.quicklog.MarkerEditor;
import java.io.Serializable;

/* renamed from: X.F3s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7559F3s<R> implements BM4<R>, Serializable {
    public final int arity;

    public static MarkerEditor A01(Object obj) {
        MarkerEditor markerEditor = (MarkerEditor) obj;
        C7384Etj.A0Y(markerEditor, 0);
        return markerEditor;
    }

    @Override // X.BM4
    public int getArity() {
        return this.arity;
    }

    public AbstractC7559F3s(int i) {
        this.arity = i;
    }

    public String toString() {
        String strA00 = F39.A00(this);
        C7384Etj.A0U(strA00);
        return strA00;
    }
}
