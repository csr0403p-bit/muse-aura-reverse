package X;

import android.view.animation.AnimationUtils;
import java.util.ArrayList;

/* renamed from: X.Fe8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8444Fe8 extends AbstractC8427Fdq implements InterfaceC8449FeD, InterfaceC8464FeS {
    public boolean A00;
    public C8453FeH A03;
    public Runnable A04;
    public boolean A05;
    public final /* synthetic */ AbstractC8429Fds A07;
    public long A02 = -1;
    public int A01 = 0;
    public final C8448FeC A06 = new C8448FeC();

    public final void A02() {
        this.A00 = true;
        int i = this.A01;
        if (i == 1) {
            this.A01 = 0;
            A4I();
        } else if (i == 2) {
            this.A01 = 0;
            A4J(this.A04);
        }
    }

    @Override // X.AbstractC8427Fdq, X.InterfaceC8451FeF
    public final void AWo(AbstractC8429Fds abstractC8429Fds) {
        this.A05 = true;
    }

    public C8444Fe8(AbstractC8429Fds abstractC8429Fds) {
        this.A07 = abstractC8429Fds;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8444Fe8.A00():void");
    }

    public final void A01() {
        AbstractC8429Fds abstractC8429Fds = this.A07;
        long j = abstractC8429Fds.A04 == 0 ? 1L : 0L;
        abstractC8429Fds.A0N(j, this.A02);
        this.A02 = j;
    }

    public final /* synthetic */ void A03(float f) {
        InterfaceC8443Fe7 interfaceC8443Fe7;
        boolean z;
        AbstractC8429Fds abstractC8429Fds = this.A07;
        if (f < 1.0f) {
            long j = abstractC8429Fds.A04;
            ArrayList<AbstractC8429Fds> arrayList = ((C8430Fdt) abstractC8429Fds).A02;
            AbstractC8429Fds abstractC8429FdsA0o = 0 >= arrayList.size() ? null : AbstractC7607F5u.A0o(arrayList, 0);
            AbstractC8429Fds abstractC8429Fds2 = abstractC8429FdsA0o.A09;
            abstractC8429FdsA0o.A09 = null;
            abstractC8429Fds.A0N(-1L, this.A02);
            abstractC8429Fds.A0N(j, -1L);
            this.A02 = j;
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
            abstractC8429Fds.A0F.clear();
            if (abstractC8429Fds2 != null) {
                AbstractC8429Fds.A07(InterfaceC8443Fe7.A01, abstractC8429Fds2, abstractC8429Fds2, true);
            }
            interfaceC8443Fe7 = InterfaceC8443Fe7.A01;
            z = true;
        } else {
            interfaceC8443Fe7 = InterfaceC8443Fe7.A01;
            z = false;
        }
        AbstractC8429Fds.A07(interfaceC8443Fe7, abstractC8429Fds, abstractC8429Fds, z);
        abstractC8429Fds.A0H();
    }

    @Override // X.InterfaceC8449FeD
    public final void A4I() {
        if (this.A00) {
            A00();
            this.A03.A01(this.A07.A04 + 1);
        } else {
            this.A01 = 1;
            this.A04 = null;
        }
    }

    @Override // X.InterfaceC8449FeD
    public final void A4J(Runnable runnable) {
        this.A04 = runnable;
        if (!this.A00) {
            this.A01 = 2;
        } else {
            A00();
            this.A03.A01(0.0f);
        }
    }

    @Override // X.InterfaceC8449FeD
    public final long AEs() {
        return this.A07.A04;
    }

    @Override // X.InterfaceC8464FeS
    public final void ARi(float f) {
        AbstractC8429Fds abstractC8429Fds = this.A07;
        long jMax = Math.max(-1L, Math.min(abstractC8429Fds.A04 + 1, Math.round(f)));
        abstractC8429Fds.A0N(jMax, this.A02);
        this.A02 = jMax;
    }

    @Override // X.InterfaceC8449FeD
    public final void AdE(long j) {
        if (this.A03 != null) {
            throw C3cG.A0Q("setCurrentPlayTimeMillis() called after animation has been started");
        }
        long j2 = this.A02;
        if (j == j2 || !this.A00) {
            return;
        }
        if (!this.A05) {
            if (j != 0 || j2 <= 0) {
                long j3 = this.A07.A04;
                if (j == j3 && j2 < j3) {
                    j = j3 + 1;
                }
            } else {
                j = -1;
            }
            if (j != j2) {
                this.A07.A0N(j, j2);
                this.A02 = j;
            }
        }
        C8448FeC c8448FeC = this.A06;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i = (c8448FeC.A00 + 1) % 20;
        c8448FeC.A00 = i;
        c8448FeC.A02[i] = jCurrentAnimationTimeMillis;
        c8448FeC.A01[i] = j;
    }

    @Override // X.InterfaceC8449FeD
    public final boolean isReady() {
        return this.A00;
    }
}
