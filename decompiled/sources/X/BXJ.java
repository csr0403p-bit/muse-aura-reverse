package X;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes5.dex */
public final class BXJ {
    public final Set<String> A00;
    public final Set<String> A01;
    public final Set<String> A02;
    public final Set<String> A03;

    public BXJ(Set<String> set, Set<String> set2) {
        this.A02 = set;
        this.A00 = set2;
        HashSet hashSetA13 = C60O.A13();
        for (String str : set) {
            Locale locale = Locale.ROOT;
            C7384Etj.A0V(locale);
            hashSetA13.add(str.toLowerCase(locale));
        }
        this.A03 = hashSetA13;
        HashSet hashSetA132 = C60O.A13();
        for (String str2 : set2) {
            Locale locale2 = Locale.ROOT;
            C7384Etj.A0V(locale2);
            hashSetA132.add(str2.toLowerCase(locale2));
        }
        this.A01 = hashSetA132;
    }
}
