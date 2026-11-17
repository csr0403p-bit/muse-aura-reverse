package com.facebook.aura.header.api;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C2308BTi;
import X.C7384Etj;
import X.C7AG;
import X.C7AH;
import X.G0U;
import com.facebook.aura.activation.view.InviteHeaderButtonDecorationProvider;

/* loaded from: classes3.dex */
public final class HeaderButtonDecorations {
    public static final int $stable = 0;
    public static final HeaderButtonDecorations INSTANCE = new HeaderButtonDecorations();

    public final HeaderButtonDecoration find(String str) {
        Object next;
        C7384Etj.A0Y(str, 0);
        C2308BTi c2308BTi = new C2308BTi(new int[]{0}, 0);
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        AnonymousClass003.A0u(c2308BTi, anonymousClass1);
        C7AH c7ah = new C7AH(new C7AG(anonymousClass1, c2308BTi));
        while (true) {
            if (!c7ah.hasNext()) {
                next = null;
                break;
            }
            next = c7ah.next();
            if (str.equals(((HeaderButtonDecoration) next).buttonKey)) {
                break;
            }
        }
        return (HeaderButtonDecoration) next;
    }

    /* renamed from: com.facebook.aura.header.api.HeaderButtonDecorations$find$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Integer, HeaderButtonDecoration> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ HeaderButtonDecoration invoke(Integer num) {
            int iA0F = AnonymousClass001.A0F(num);
            if (iA0F == 0) {
                return InviteHeaderButtonDecorationProvider.INSTANCE.decoration();
            }
            throw AnonymousClass005.A0c(iA0F);
        }

        public final HeaderButtonDecoration invoke(int i) {
            if (i == 0) {
                return InviteHeaderButtonDecorationProvider.INSTANCE.decoration();
            }
            throw AnonymousClass005.A0c(i);
        }
    }
}
