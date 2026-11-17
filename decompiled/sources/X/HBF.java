package X;

import android.graphics.Matrix;
import com.caverock.androidsvg.SVGParseException;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class HBF extends HB4 implements HB7 {
    public Matrix A00;
    public Boolean A01;
    public Integer A02;
    public String A03;
    public List<HB3> A04 = C3cG.A0h();

    @Override // X.HB7
    public final void A3S(HB3 hb3) throws SVGParseException {
        if (!(hb3 instanceof HB6)) {
            throw AbstractC7607F5u.A0r(AnonymousClass001.A0v(" elements.", C3cG.A0f(hb3, "Gradient elements cannot contain ")));
        }
        this.A04.add(hb3);
    }

    @Override // X.HB7
    public final List<HB3> ADb() {
        return this.A04;
    }
}
