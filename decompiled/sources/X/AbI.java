package X;

import androidx.compose.foundation.pager.PagerState;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class AbI implements Akx {
    public final EnumC1108AYu A00;
    public final PagerState A01;

    @Override // X.Akx
    /* renamed from: onPostFling-RZ2iAVY */
    public final Object mo3onPostFlingRZ2iAVY(long j, long j2, HtJ<? super C1251Afj> htJ) {
        return new C1251Afj(AnonymousClass007.A0A(AnonymousClass003.A03(j2), 0.0f));
    }

    @Override // X.Akx
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo4onPostScrollDzOQY0M(long j, long j2, int i) {
        if (i != 2 || C8j3.A05(C8j5.A0E(j2, this.A00, EnumC1108AYu.A02)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // X.Akx
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo6onPreScrollOzD1aCk(long j, int i) {
        float fA03;
        if (i != 1) {
            return 0L;
        }
        PagerState pagerState = this.A01;
        C00q c00q = pagerState.A0L.A04;
        if (Math.abs(c00q.AFn()) <= 1.0E-6d) {
            return 0L;
        }
        EnumC1108AYu enumC1108AYu = this.A00;
        EnumC1108AYu enumC1108AYu2 = EnumC1108AYu.A02;
        float fA05 = C8j3.A05(C8j5.A0E(j, enumC1108AYu, enumC1108AYu2));
        if (Math.abs(fA05) <= 0.0f) {
            return 0L;
        }
        C1133Abh value = pagerState.A0A.getValue();
        float fAFn = c00q.AFn() * r0.getValue().A04;
        C1133Abh c1133Abh = value;
        float f = ((c1133Abh.A04 + c1133Abh.A05) * (-Math.signum(c00q.AFn()))) + fAFn;
        if (c00q.AFn() > 0.0f) {
            f = fAFn;
            fAFn = f;
        }
        float fA032 = ATD.A03(fA05, fAFn, f);
        if (enumC1108AYu == enumC1108AYu2 && c1133Abh.A0K) {
            fA03 = pagerState.A0E.A98(fA032);
        } else {
            fA03 = -pagerState.A0E.A98(-fA032);
            if (enumC1108AYu != enumC1108AYu2) {
                fA03 = AnonymousClass003.A03(j);
            }
        }
        return (C8j3.A0P(fA03) << 32) | (C8j3.A0P(AnonymousClass001.A01(4294967295L, j)) & 4294967295L);
    }

    public AbI(EnumC1108AYu enumC1108AYu, PagerState pagerState) {
        this.A01 = pagerState;
        this.A00 = enumC1108AYu;
    }

    @Override // X.Akx
    /* renamed from: onPreFling-QWom1Mo */
    public final /* synthetic */ Object mo5onPreFlingQWom1Mo(long j, HtJ htJ) {
        return AnonymousClass006.A0a();
    }
}
