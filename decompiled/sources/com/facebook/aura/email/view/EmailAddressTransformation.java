package com.facebook.aura.email.view;

import X.AnonymousClass006;
import X.ApQ;
import X.B6A;
import X.C06H;
import X.C1731ApS;
import X.C1809ArT;
import X.C1824Aro;
import X.C19h;
import X.C1YX;
import X.C7384Etj;
import X.FGI;
import X.InterfaceC2128Ayu;

/* loaded from: classes.dex */
public final class EmailAddressTransformation implements C19h {
    public static final int $stable = 0;
    public final long color;
    public final String domain;

    public EmailAddressTransformation(String str, long j) {
        C7384Etj.A0Y(str, 0);
        this.domain = str;
        this.color = j;
    }

    @Override // X.C19h
    public C1YX filter(final ApQ apQ) {
        C7384Etj.A0Y(apQ, 0);
        C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
        c1731ApSA0W.A07(apQ);
        long j = this.color;
        long j2 = C1809ArT.A01;
        int iA02 = c1731ApSA0W.A02(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j, j2, j2, B6A.A07));
        try {
            c1731ApSA0W.A0E(FGI.A0M("@", this.domain));
            c1731ApSA0W.A06(iA02);
            return new C1YX(c1731ApSA0W.A04(), new InterfaceC2128Ayu() { // from class: com.facebook.aura.email.view.EmailAddressTransformation.filter.2
                @Override // X.InterfaceC2128Ayu
                public int transformedToOriginal(int i) {
                    int length = apQ.length();
                    return i > length ? length : i;
                }

                @Override // X.InterfaceC2128Ayu
                public int originalToTransformed(int i) {
                    return i;
                }
            });
        } catch (Throwable th) {
            c1731ApSA0W.A06(iA02);
            throw th;
        }
    }

    public /* synthetic */ EmailAddressTransformation(String str, long j, C06H c06h) {
        this(str, j);
    }
}
