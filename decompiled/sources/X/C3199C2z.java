package X;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashSet;

/* renamed from: X.C2z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3199C2z implements FilenameFilter {
    public final /* synthetic */ AbstractC3198C2y A00;
    public final /* synthetic */ HashSet A01;

    public C3199C2z(AbstractC3198C2y abstractC3198C2y, HashSet hashSet) {
        this.A01 = hashSet;
        this.A00 = abstractC3198C2y;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return (str.equals("dso_state") || str.equals("dso_lock") || str.equals("dso_deps") || this.A01.contains(str)) ? false : true;
    }
}
