package X;

import android.os.Build;
import java.util.Set;

/* renamed from: X.6xV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC05726xV implements C6xi {
    public static final Set<AbstractC05726xV> A02 = C60O.A13();
    public final String A00;
    public final String A01;

    public boolean A00() {
        if ((this instanceof C05796xf) || (this instanceof C05786xe) || (this instanceof C05776xd) || (this instanceof C05766xc)) {
            return true;
        }
        return ((this instanceof C05756xb) || (this instanceof C6li)) ? false : true;
    }

    public boolean A01() {
        Set<String> set = AbstractC05696pQ.A00;
        String str = this.A01;
        if (set.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && set.contains(FGI.A0M(str, ":dev"));
    }

    public AbstractC05726xV(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
        A02.add(this);
    }
}
