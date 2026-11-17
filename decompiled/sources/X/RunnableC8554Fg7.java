package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Fg7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8554Fg7 implements Runnable {
    public static final String __redex_internal_original_name = "Fragment$4";
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ AbstractC8541Ffu A01;

    public RunnableC8554Fg7(Fragment fragment, AbstractC8541Ffu abstractC8541Ffu) {
        this.A00 = fragment;
        this.A01 = abstractC8541Ffu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC8541Ffu abstractC8541Ffu = this.A01;
        if (!abstractC8541Ffu.A04.isEmpty()) {
            abstractC8541Ffu.A08();
        }
    }
}
