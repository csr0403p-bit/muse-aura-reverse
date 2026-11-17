package X;

import java.util.ArrayList;

/* renamed from: X.Fg4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8551Fg4 implements Runnable {
    public static final String __redex_internal_original_name = "FragmentTransitionImpl$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC8522FfX A01;
    public final /* synthetic */ ArrayList A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;
    public final /* synthetic */ ArrayList A05;

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.A00; i++) {
            AbstractC7607F5u.A0d(this.A04, i).setTransitionName((String) this.A02.get(i));
            AbstractC7607F5u.A0d(this.A05, i).setTransitionName((String) this.A03.get(i));
        }
    }

    public RunnableC8551Fg4(AbstractC8522FfX abstractC8522FfX, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int i) {
        this.A01 = abstractC8522FfX;
        this.A00 = i;
        this.A04 = arrayList;
        this.A02 = arrayList2;
        this.A05 = arrayList3;
        this.A03 = arrayList4;
    }
}
